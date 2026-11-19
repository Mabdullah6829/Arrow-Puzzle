package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.firebase.messaging.f */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6014f implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f24009s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ FirebaseMessaging f24010t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ TaskCompletionSource f24011u;

    public /* synthetic */ RunnableC6014f(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource, int i2) {
        this.f24009s = i2;
        this.f24010t = firebaseMessaging;
        this.f24011u = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24009s) {
            case 0:
                this.f24010t.lambda$deleteToken$9(this.f24011u);
                break;
            case 1:
                this.f24010t.lambda$getToken$7(this.f24011u);
                break;
            default:
                this.f24010t.lambda$deleteToken$8(this.f24011u);
                break;
        }
    }
}
