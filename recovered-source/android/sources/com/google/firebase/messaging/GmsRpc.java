package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.AnyThread;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.executor.ExecutorC1058a;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.gms.cloudmessaging.zzw;
import com.google.android.gms.cloudmessaging.zzy;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
class GmsRpc {
    static final String CMD_RST = "RST";
    static final String CMD_RST_FULL = "RST_FULL";
    static final String CMD_SYNC = "SYNC";
    static final String ERROR_INSTANCE_ID_RESET = "INSTANCE_ID_RESET";
    static final String ERROR_INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    static final String ERROR_INTERNAL_SERVER_ERROR_ALT = "InternalServerError";
    static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    private static final String EXTRA_DELETE = "delete";
    private static final String EXTRA_ERROR = "error";
    private static final String EXTRA_IID_OPERATION = "iid-operation";
    private static final String EXTRA_REGISTRATION_ID = "registration_id";
    private static final String EXTRA_SCOPE = "scope";
    private static final String EXTRA_SENDER = "sender";
    private static final String EXTRA_SUBTYPE = "subtype";
    private static final String EXTRA_TOPIC = "gcm.topic";
    private static final String EXTRA_UNREGISTERED = "unregistered";
    static final String FIREBASE_IID_HEARTBEAT_TAG = "fire-iid";
    private static final String PARAM_APP_VER_CODE = "app_ver";
    private static final String PARAM_APP_VER_NAME = "app_ver_name";
    private static final String PARAM_CLIENT_VER = "cliv";
    private static final String PARAM_FIREBASE_APP_NAME_HASH = "firebase-app-name-hash";
    private static final String PARAM_FIS_AUTH_TOKEN = "Goog-Firebase-Installations-Auth";
    private static final String PARAM_GMP_APP_ID = "gmp_app_id";
    private static final String PARAM_GMS_VER = "gmsv";
    private static final String PARAM_HEARTBEAT_CODE = "Firebase-Client-Log-Type";
    private static final String PARAM_INSTANCE_ID = "appid";
    private static final String PARAM_OS_VER = "osv";
    private static final String PARAM_USER_AGENT = "Firebase-Client";
    private static final String SCOPE_ALL = "*";
    static final String TAG = "FirebaseMessaging";
    static final String TOO_MANY_SUBSCRIBERS = "TOO_MANY_SUBSCRIBERS";
    private static final String TOPIC_PREFIX = "/topics/";
    private final FirebaseApp app;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final Provider<HeartBeatInfo> heartbeatInfo;
    private final Metadata metadata;
    private final Rpc rpc;
    private final Provider<UserAgentPublisher> userAgentPublisher;

    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, metadata, new Rpc(firebaseApp.getApplicationContext()), provider, provider2, firebaseInstallationsApi);
    }

    private static String base64UrlSafe(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task<String> extractResponseWhenComplete(Task<Bundle> task) {
        return task.continueWith(new ExecutorC1058a(2), new C6020l(this, 0));
    }

    private String getHashedFirebaseAppName() {
        try {
            return base64UrlSafe(MessageDigest.getInstance("SHA-1").digest(this.app.getName().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    @AnyThread
    private String handleResponse(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
        }
        String string = bundle.getString(EXTRA_REGISTRATION_ID);
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString(EXTRA_UNREGISTERED);
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if (CMD_RST.equals(string3)) {
            throw new IOException(ERROR_INSTANCE_ID_RESET);
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
    }

    public static boolean isErrorMessageForRetryableError(String str) {
        return ERROR_SERVICE_NOT_AVAILABLE.equals(str) || ERROR_INTERNAL_SERVER_ERROR.equals(str) || ERROR_INTERNAL_SERVER_ERROR_ALT.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$extractResponseWhenComplete$0(Task task) {
        return handleResponse((Bundle) task.getResult(IOException.class));
    }

    private void setDefaultAttributesToBundle(String str, String str2, Bundle bundle) {
        HeartBeatInfo.HeartBeat heartBeatCode;
        bundle.putString(EXTRA_SCOPE, str2);
        bundle.putString(EXTRA_SENDER, str);
        bundle.putString(EXTRA_SUBTYPE, str);
        bundle.putString(PARAM_GMP_APP_ID, this.app.getOptions().getApplicationId());
        bundle.putString(PARAM_GMS_VER, Integer.toString(this.metadata.getGmsVersionCode()));
        bundle.putString(PARAM_OS_VER, Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString(PARAM_APP_VER_CODE, this.metadata.getAppVersionCode());
        bundle.putString(PARAM_APP_VER_NAME, this.metadata.getAppVersionName());
        bundle.putString(PARAM_FIREBASE_APP_NAME_HASH, getHashedFirebaseAppName());
        try {
            String token = ((InstallationTokenResult) Tasks.m10771a(this.firebaseInstallations.getToken(false))).getToken();
            if (TextUtils.isEmpty(token)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString(PARAM_FIS_AUTH_TOKEN, token);
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e2) {
            e = e2;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString(PARAM_INSTANCE_ID, (String) Tasks.m10771a(this.firebaseInstallations.getId()));
        bundle.putString(PARAM_CLIENT_VER, "fcm-25.0.2");
        HeartBeatInfo heartBeatInfo = this.heartbeatInfo.get();
        UserAgentPublisher userAgentPublisher = this.userAgentPublisher.get();
        if (heartBeatInfo == null || userAgentPublisher == null || (heartBeatCode = heartBeatInfo.getHeartBeatCode(FIREBASE_IID_HEARTBEAT_TAG)) == HeartBeatInfo.HeartBeat.NONE) {
            return;
        }
        bundle.putString(PARAM_HEARTBEAT_CODE, Integer.toString(heartBeatCode.getCode()));
        bundle.putString(PARAM_USER_AGENT, userAgentPublisher.getUserAgent());
    }

    private Task<Bundle> startRpc(String str, String str2, final Bundle bundle) {
        try {
            setDefaultAttributesToBundle(str, str2, bundle);
            final Rpc rpc = this.rpc;
            zzy zzyVar = Rpc.f4079j;
            zzw zzwVar = rpc.f4083c;
            if (zzwVar.m3389a() < 12000000) {
                return zzwVar.m3390b() != 0 ? rpc.m3375a(bundle).continueWithTask(zzyVar, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzz
                    @Override // com.google.android.gms.tasks.Continuation
                    /* JADX INFO: renamed from: a */
                    public final Object mo170a(Task task) {
                        Bundle bundle2;
                        Rpc rpc2 = rpc;
                        rpc2.getClass();
                        return (task.isSuccessful() && (bundle2 = (Bundle) task.getResult()) != null && bundle2.containsKey("google.messenger")) ? rpc2.m3375a(bundle).onSuccessTask(Rpc.f4079j, new SuccessContinuation() { // from class: com.google.android.gms.cloudmessaging.zzx
                            @Override // com.google.android.gms.tasks.SuccessContinuation
                            public final Task then(Object obj) {
                                Bundle bundle3 = (Bundle) obj;
                                int i2 = Rpc.f4077h;
                                return (bundle3 == null || !bundle3.containsKey("google.messenger")) ? Tasks.m10776f(bundle3) : Tasks.m10776f(null);
                            }
                        }) : task;
                    }
                }) : Tasks.m10775e(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            return zzv.m3385a(rpc.f4082b).m3387c(1, bundle).continueWith(zzyVar, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzaa
                @Override // com.google.android.gms.tasks.Continuation
                /* JADX INFO: renamed from: a */
                public final Object mo170a(Task task) throws IOException {
                    if (task.isSuccessful()) {
                        return (Bundle) task.getResult();
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
                    }
                    throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
                }
            });
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.m10775e(e);
        }
    }

    public Task<?> deleteToken() {
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_DELETE, "1");
        return extractResponseWhenComplete(startRpc(Metadata.getDefaultSenderId(this.app), "*", bundle));
    }

    public Task<CloudMessage> getProxyNotificationData() {
        Rpc rpc = this.rpc;
        return rpc.f4083c.m3389a() >= 241100000 ? zzv.m3385a(rpc.f4082b).m3387c(5, Bundle.EMPTY).continueWith(Rpc.f4079j, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzab
            @Override // com.google.android.gms.tasks.Continuation
            /* JADX INFO: renamed from: a */
            public final Object mo170a(Task task) {
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new CloudMessage(intent);
                }
                return null;
            }
        }) : Tasks.m10775e(new IOException(ERROR_SERVICE_NOT_AVAILABLE));
    }

    public Task<String> getToken() {
        return extractResponseWhenComplete(startRpc(Metadata.getDefaultSenderId(this.app), "*", new Bundle()));
    }

    public Task<Void> setRetainProxiedNotifications(boolean z) {
        Rpc rpc = this.rpc;
        if (rpc.f4083c.m3389a() < 241100000) {
            return Tasks.m10775e(new IOException(ERROR_SERVICE_NOT_AVAILABLE));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z);
        return zzv.m3385a(rpc.f4082b).m3386b(4, bundle);
    }

    public Task<?> subscribeToTopic(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_TOPIC, TOPIC_PREFIX + str2);
        return extractResponseWhenComplete(startRpc(str, TOPIC_PREFIX + str2, bundle));
    }

    public Task<?> unsubscribeFromTopic(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_TOPIC, TOPIC_PREFIX + str2);
        bundle.putString(EXTRA_DELETE, "1");
        return extractResponseWhenComplete(startRpc(str, TOPIC_PREFIX + str2, bundle));
    }

    @VisibleForTesting
    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Rpc rpc, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this.app = firebaseApp;
        this.metadata = metadata;
        this.rpc = rpc;
        this.userAgentPublisher = provider;
        this.heartbeatInfo = provider2;
        this.firebaseInstallations = firebaseInstallationsApi;
    }
}
