package com.google.firebase.firestore.auth;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.sidesheet.C5467b;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.internal.IdTokenListener;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Listener;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.InternalTokenResult;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseAuthCredentialsProvider extends CredentialsProvider<User> {
    private static final String LOG_TAG = "FirebaseAuthCredentialsProvider";

    @Nullable
    @GuardedBy("this")
    private Listener<User> changeListener;

    @GuardedBy("this")
    private boolean forceRefresh;
    private final IdTokenListener idTokenListener = new C5741b(this);

    @Nullable
    @GuardedBy("this")
    private InternalAuthProvider internalAuthProvider;

    @GuardedBy("this")
    private int tokenCounter;

    public FirebaseAuthCredentialsProvider(Deferred<InternalAuthProvider> deferred) {
        deferred.whenAvailable(new C5741b(this));
    }

    private synchronized User getUser() {
        String uid;
        try {
            InternalAuthProvider internalAuthProvider = this.internalAuthProvider;
            uid = internalAuthProvider == null ? null : internalAuthProvider.getUid();
        } catch (Throwable th) {
            throw th;
        }
        return uid != null ? new User(uid) : User.UNAUTHENTICATED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getToken$2(int i2, Task task) {
        synchronized (this) {
            try {
                if (i2 != this.tokenCounter) {
                    Logger.debug(LOG_TAG, "getToken aborted due to token change", new Object[0]);
                    return getToken();
                }
                if (task.isSuccessful()) {
                    return Tasks.m10776f(((GetTokenResult) task.getResult()).getToken());
                }
                return Tasks.m10775e(task.getException());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(InternalTokenResult internalTokenResult) {
        onIdTokenChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(Provider provider) {
        synchronized (this) {
            this.internalAuthProvider = (InternalAuthProvider) provider.get();
            onIdTokenChanged();
            this.internalAuthProvider.addIdTokenListener(this.idTokenListener);
        }
    }

    private synchronized void onIdTokenChanged() {
        this.tokenCounter++;
        Listener<User> listener = this.changeListener;
        if (listener != null) {
            listener.onValue(getUser());
        }
    }

    @Override // com.google.firebase.firestore.auth.CredentialsProvider
    public synchronized Task<String> getToken() {
        InternalAuthProvider internalAuthProvider = this.internalAuthProvider;
        if (internalAuthProvider == null) {
            return Tasks.m10775e(new FirebaseApiNotAvailableException("auth is not available"));
        }
        Task<GetTokenResult> accessToken = internalAuthProvider.getAccessToken(this.forceRefresh);
        this.forceRefresh = false;
        return accessToken.continueWithTask(Executors.DIRECT_EXECUTOR, new C5467b(this, this.tokenCounter));
    }

    @Override // com.google.firebase.firestore.auth.CredentialsProvider
    public synchronized void invalidateToken() {
        this.forceRefresh = true;
    }

    @Override // com.google.firebase.firestore.auth.CredentialsProvider
    public synchronized void removeChangeListener() {
        this.changeListener = null;
        InternalAuthProvider internalAuthProvider = this.internalAuthProvider;
        if (internalAuthProvider != null) {
            internalAuthProvider.removeIdTokenListener(this.idTokenListener);
        }
    }

    @Override // com.google.firebase.firestore.auth.CredentialsProvider
    public synchronized void setChangeListener(@NonNull Listener<User> listener) {
        this.changeListener = listener;
        listener.onValue(getUser());
    }
}
