package com.google.firebase.firestore.auth;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.AppCheckTokenListener;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Listener;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import p001B.C0099y;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseAppCheckTokenProvider extends CredentialsProvider<String> {
    private static final String LOG_TAG = "FirebaseAppCheckTokenProvider";

    @Nullable
    @GuardedBy("this")
    private Listener<String> changeListener;

    @GuardedBy("this")
    private boolean forceRefresh;

    @Nullable
    @GuardedBy("this")
    private InteropAppCheckTokenProvider interopAppCheckTokenProvider;
    private final AppCheckTokenListener tokenListener = new C5740a(this);

    public FirebaseAppCheckTokenProvider(Deferred<InteropAppCheckTokenProvider> deferred) {
        deferred.whenAvailable(new C5740a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$getToken$2(Task task) {
        return task.isSuccessful() ? Tasks.m10776f(((AppCheckTokenResult) task.getResult()).getToken()) : Tasks.m10775e(task.getException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(Provider provider) {
        synchronized (this) {
            try {
                InteropAppCheckTokenProvider interopAppCheckTokenProvider = (InteropAppCheckTokenProvider) provider.get();
                this.interopAppCheckTokenProvider = interopAppCheckTokenProvider;
                if (interopAppCheckTokenProvider != null) {
                    interopAppCheckTokenProvider.addAppCheckTokenListener(this.tokenListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onTokenChanged, reason: merged with bridge method [inline-methods] */
    public synchronized void lambda$new$0(@NonNull AppCheckTokenResult appCheckTokenResult) {
        try {
            if (appCheckTokenResult.getError() != null) {
                Logger.warn(LOG_TAG, "Error getting App Check token; using placeholder token instead. Error: " + appCheckTokenResult.getError(), new Object[0]);
            }
            Listener<String> listener = this.changeListener;
            if (listener != null) {
                listener.onValue(appCheckTokenResult.getToken());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.firebase.firestore.auth.CredentialsProvider
    public synchronized Task<String> getToken() {
        InteropAppCheckTokenProvider interopAppCheckTokenProvider = this.interopAppCheckTokenProvider;
        if (interopAppCheckTokenProvider == null) {
            return Tasks.m10775e(new FirebaseApiNotAvailableException("AppCheck is not available"));
        }
        Task<AppCheckTokenResult> token = interopAppCheckTokenProvider.getToken(this.forceRefresh);
        this.forceRefresh = false;
        return token.continueWithTask(Executors.DIRECT_EXECUTOR, new C0099y(17));
    }

    @Override // com.google.firebase.firestore.auth.CredentialsProvider
    public synchronized void invalidateToken() {
        this.forceRefresh = true;
    }

    @Override // com.google.firebase.firestore.auth.CredentialsProvider
    public synchronized void removeChangeListener() {
        this.changeListener = null;
        InteropAppCheckTokenProvider interopAppCheckTokenProvider = this.interopAppCheckTokenProvider;
        if (interopAppCheckTokenProvider != null) {
            interopAppCheckTokenProvider.removeAppCheckTokenListener(this.tokenListener);
        }
    }

    @Override // com.google.firebase.firestore.auth.CredentialsProvider
    public synchronized void setChangeListener(@NonNull Listener<String> listener) {
        this.changeListener = listener;
    }
}
