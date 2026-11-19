package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseIntArray;
import androidx.collection.ArraySet;
import androidx.core.app.PendingIntentCompat;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import androidx.work.WorkRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class GoogleApiManager implements Handler.Callback {

    /* JADX INFO: renamed from: H */
    public static final Status f4235H = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: I */
    public static final Status f4236I = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: J */
    public static final Object f4237J = new Object();

    /* JADX INFO: renamed from: K */
    public static GoogleApiManager f4238K;

    /* JADX INFO: renamed from: F */
    public final com.google.android.gms.internal.base.zao f4244F;

    /* JADX INFO: renamed from: G */
    public volatile boolean f4245G;

    /* JADX INFO: renamed from: u */
    public TelemetryData f4248u;

    /* JADX INFO: renamed from: v */
    public com.google.android.gms.common.internal.service.zat f4249v;

    /* JADX INFO: renamed from: w */
    public final Context f4250w;

    /* JADX INFO: renamed from: x */
    public final GoogleApiAvailability f4251x;

    /* JADX INFO: renamed from: y */
    public final com.google.android.gms.common.internal.zao f4252y;

    /* JADX INFO: renamed from: s */
    public long f4246s = WorkRequest.MIN_BACKOFF_MILLIS;

    /* JADX INFO: renamed from: t */
    public boolean f4247t = false;

    /* JADX INFO: renamed from: z */
    public final AtomicInteger f4253z = new AtomicInteger(1);

    /* JADX INFO: renamed from: A */
    public final AtomicInteger f4239A = new AtomicInteger(0);

    /* JADX INFO: renamed from: B */
    public final ConcurrentHashMap f4240B = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: C */
    public zaab f4241C = null;

    /* JADX INFO: renamed from: D */
    public final ArraySet f4242D = new ArraySet();

    /* JADX INFO: renamed from: E */
    public final ArraySet f4243E = new ArraySet();

    public GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f4245G = true;
        this.f4250w = context;
        com.google.android.gms.internal.base.zao zaoVar = new com.google.android.gms.internal.base.zao(looper, this);
        Looper.getMainLooper();
        this.f4244F = zaoVar;
        this.f4251x = googleApiAvailability;
        this.f4252y = new com.google.android.gms.common.internal.zao(googleApiAvailability);
        PackageManager packageManager = context.getPackageManager();
        if (DeviceProperties.f4641e == null) {
            DeviceProperties.f4641e = Boolean.valueOf(PlatformVersion.m3653a() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (DeviceProperties.f4641e.booleanValue()) {
            this.f4245G = false;
        }
        zaoVar.sendMessage(zaoVar.obtainMessage(6));
    }

    /* JADX INFO: renamed from: c */
    public static Status m3457c(ApiKey apiKey, ConnectionResult connectionResult) {
        String str = apiKey.f4216b.f4176b;
        String strValueOf = String.valueOf(connectionResult);
        return new Status(17, AbstractC1456a.m2451r(new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", strValueOf), connectionResult.f4143u, connectionResult);
    }

    /* JADX INFO: renamed from: d */
    public static GoogleApiManager m3458d(Context context) {
        GoogleApiManager googleApiManager;
        HandlerThread handlerThread;
        synchronized (f4237J) {
            if (f4238K == null) {
                synchronized (GmsClientSupervisor.f4442a) {
                    try {
                        handlerThread = GmsClientSupervisor.f4444c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            GmsClientSupervisor.f4444c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = GmsClientSupervisor.f4444c;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                f4238K = new GoogleApiManager(context.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.f4154e);
            }
            googleApiManager = f4238K;
        }
        return googleApiManager;
    }

    /* JADX INFO: renamed from: a */
    public final zabk m3459a(GoogleApi googleApi) {
        ApiKey apiKey = googleApi.f4193f;
        ConcurrentHashMap concurrentHashMap = this.f4240B;
        zabk zabkVar = (zabk) concurrentHashMap.get(apiKey);
        if (zabkVar == null) {
            zabkVar = new zabk(this, googleApi);
            concurrentHashMap.put(apiKey, zabkVar);
        }
        if (zabkVar.f4297t.requiresSignIn()) {
            this.f4243E.add(apiKey);
        }
        zabkVar.m3511p();
        return zabkVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX INFO: renamed from: b */
    public final void m3460b(TaskCompletionSource taskCompletionSource, int i2, GoogleApi googleApi) {
        zaby zabyVar;
        GoogleApiManager googleApiManager;
        if (i2 != 0) {
            ApiKey apiKey = googleApi.f4193f;
            if (m3461e()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = RootTelemetryConfigManager.m3548a().f4459a;
                boolean z = true;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.f4461t) {
                        boolean z2 = rootTelemetryConfiguration.f4462u;
                        zabk zabkVar = (zabk) this.f4240B.get(apiKey);
                        if (zabkVar != null) {
                            Object obj = zabkVar.f4297t;
                            if (obj instanceof BaseGmsClient) {
                                BaseGmsClient baseGmsClient = (BaseGmsClient) obj;
                                if (!baseGmsClient.hasConnectionInfo() || baseGmsClient.isConnecting()) {
                                    z = z2;
                                } else {
                                    ConnectionTelemetryConfiguration connectionTelemetryConfigurationM3513a = zaby.m3513a(zabkVar, baseGmsClient, i2);
                                    if (connectionTelemetryConfigurationM3513a != null) {
                                        zabkVar.f4294D++;
                                        z = connectionTelemetryConfigurationM3513a.f4420u;
                                    }
                                }
                            }
                        } else {
                            z = z2;
                        }
                    }
                    zabyVar = null;
                    googleApiManager = this;
                }
                googleApiManager = this;
                zabyVar = new zaby(googleApiManager, i2, apiKey, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            } else {
                zabyVar = null;
                googleApiManager = this;
            }
            if (zabyVar != null) {
                zzw zzwVar = taskCompletionSource.f23216a;
                final com.google.android.gms.internal.base.zao zaoVar = googleApiManager.f4244F;
                Objects.requireNonNull(zaoVar);
                zzwVar.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.zabp
                    @Override // java.util.concurrent.Executor
                    public final /* synthetic */ void execute(Runnable runnable) {
                        zaoVar.post(runnable);
                    }
                }, zabyVar);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3461e() {
        int i2;
        if (this.f4247t) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = RootTelemetryConfigManager.m3548a().f4459a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.f4461t) {
            return false;
        }
        SparseIntArray sparseIntArray = this.f4252y.f4496a;
        synchronized (sparseIntArray) {
            i2 = sparseIntArray.get(203400000, -1);
        }
        return i2 == -1 || i2 == 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3462f(ConnectionResult connectionResult, int i2) {
        PendingIntent activity;
        GoogleApiAvailability googleApiAvailability = this.f4251x;
        googleApiAvailability.getClass();
        Context context = this.f4250w;
        if (!InstantApps.m3661a(context)) {
            boolean zM3394w = connectionResult.m3394w();
            int i3 = connectionResult.f4142t;
            if (zM3394w) {
                activity = connectionResult.f4143u;
            } else {
                activity = null;
                Intent intentM3402b = googleApiAvailability.m3402b(context, i3, null);
                if (intentM3402b != null) {
                    activity = PendingIntentCompat.getActivity(context, 0, intentM3402b, 134217728, false);
                }
            }
            if (activity != null) {
                int i4 = GoogleApiActivity.f4203t;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i2);
                intent.putExtra("notify_manager", true);
                googleApiAvailability.m3400g(context, i3, PendingIntent.getActivity(context, 0, intent, com.google.android.gms.internal.base.zak.f21560a | 134217728));
                googleApiAvailability.getClass();
                Integer num = connectionResult.f4145w;
                int iIntValue = num == null ? -1 : num.intValue();
                com.google.android.gms.common.internal.zab zabVar = new com.google.android.gms.common.internal.zab(iIntValue, connectionResult.f4142t, System.currentTimeMillis(), context.getPackageName(), false);
                if (googleApiAvailability.f4155c == null) {
                    googleApiAvailability.f4155c = new com.google.android.gms.common.internal.service.zaq(context, com.google.android.gms.common.internal.service.zaq.f4474k, Api.ApiOptions.f4177i, GoogleApi.Settings.f4198c);
                }
                googleApiAvailability.f4155c.m3592e(zabVar);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m3463g(ConnectionResult connectionResult, int i2) {
        if (m3462f(connectionResult, i2)) {
            return;
        }
        com.google.android.gms.internal.base.zao zaoVar = this.f4244F;
        zaoVar.sendMessage(zaoVar.obtainMessage(5, i2, 0, connectionResult));
    }

    /* JADX WARN: Code duplicated, block: B:167:0x033c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0342  */
    /* JADX WARN: Code duplicated, block: B:171:0x037a  */
    /* JADX WARN: Code duplicated, block: B:173:0x0384  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v8 com.google.android.gms.common.api.internal.zabk, still in use, count: 2, list:
          (r3v8 com.google.android.gms.common.api.internal.zabk) from 0x0334: IGET (r3v8 com.google.android.gms.common.api.internal.zabk) A[WRAPPED] (LINE:821) com.google.android.gms.common.api.internal.zabk.y int
          (r3v8 com.google.android.gms.common.api.internal.zabk) from 0x033a: PHI (r3 I:??) = (r3v4 com.google.android.gms.common.api.internal.zabk), (r3v8 com.google.android.gms.common.api.internal.zabk) binds: [B:165:0x0339, B:222:0x033a] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r14) {
        /*
            Method dump skipped, instruction units count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.GoogleApiManager.handleMessage(android.os.Message):boolean");
    }
}
