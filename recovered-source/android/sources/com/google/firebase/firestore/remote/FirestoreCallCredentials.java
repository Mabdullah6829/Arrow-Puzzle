package com.google.firebase.firestore.remote;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.firestore.auth.CredentialsProvider;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.internal.api.FirebaseNoSignedInUserException;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.Executor;
import p030R.AbstractC0548c;
import p030R.AbstractC0550d;
import p030R.AbstractC0552e;
import p030R.AbstractC0553e0;
import p030R.C0549c0;
import p030R.C0559h0;
import p030R.C0572o;
import p030R.C0589w0;

/* JADX INFO: loaded from: classes2.dex */
final class FirestoreCallCredentials extends AbstractC0552e {
    private static final AbstractC0553e0 AUTHORIZATION_HEADER;
    private static final String LOG_TAG = "FirestoreCallCredentials";
    private static final AbstractC0553e0 X_FIREBASE_APPCHECK;
    private final CredentialsProvider<String> appCheckProvider;
    private final CredentialsProvider<User> authProvider;

    static {
        C0572o c0572o = C0559h0.f1187d;
        BitSet bitSet = AbstractC0553e0.f1161d;
        AUTHORIZATION_HEADER = new C0549c0("Authorization", c0572o);
        X_FIREBASE_APPCHECK = new C0549c0("x-firebase-appcheck", c0572o);
    }

    public FirestoreCallCredentials(CredentialsProvider<User> credentialsProvider, CredentialsProvider<String> credentialsProvider2) {
        this.authProvider = credentialsProvider;
        this.appCheckProvider = credentialsProvider2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$applyRequestMetadata$0(Task task, AbstractC0548c abstractC0548c, Task task2, Task task3) {
        C0559h0 c0559h0 = new C0559h0();
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            Logger.debug(LOG_TAG, "Successfully fetched auth token.", new Object[0]);
            if (str != null) {
                c0559h0.m1310f(AUTHORIZATION_HEADER, "Bearer ".concat(str));
            }
        } else {
            Exception exception = task.getException();
            if (exception instanceof FirebaseApiNotAvailableException) {
                Logger.debug(LOG_TAG, "Firebase Auth API not available, not using authentication.", new Object[0]);
            } else {
                if (!(exception instanceof FirebaseNoSignedInUserException)) {
                    Logger.warn(LOG_TAG, "Failed to get auth token: %s.", exception);
                    abstractC0548c.mo1284b(C0589w0.f1280j.m1353f(exception));
                    return;
                }
                Logger.debug(LOG_TAG, "No user signed in, not using authentication.", new Object[0]);
            }
        }
        if (task2.isSuccessful()) {
            String str2 = (String) task2.getResult();
            if (str2 != null && !str2.isEmpty()) {
                Logger.debug(LOG_TAG, "Successfully fetched AppCheck token.", new Object[0]);
                c0559h0.m1310f(X_FIREBASE_APPCHECK, str2);
            }
        } else {
            Exception exception2 = task2.getException();
            if (!(exception2 instanceof FirebaseApiNotAvailableException)) {
                Logger.warn(LOG_TAG, "Failed to get AppCheck token: %s.", exception2);
                abstractC0548c.mo1284b(C0589w0.f1280j.m1353f(exception2));
                return;
            }
            Logger.debug(LOG_TAG, "Firebase AppCheck API not available.", new Object[0]);
        }
        abstractC0548c.mo1283a(c0559h0);
    }

    @Override // p030R.AbstractC0552e
    public void applyRequestMetadata(AbstractC0550d abstractC0550d, Executor executor, AbstractC0548c abstractC0548c) {
        Task<String> token = this.authProvider.getToken();
        Task<String> token2 = this.appCheckProvider.getToken();
        Tasks.m10777g(Arrays.asList(token, token2)).addOnCompleteListener(Executors.DIRECT_EXECUTOR, new C5963f(token, abstractC0548c, token2));
    }

    public void thisUsesUnstableApi() {
    }
}
