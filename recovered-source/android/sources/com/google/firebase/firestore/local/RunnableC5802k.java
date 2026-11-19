package com.google.firebase.firestore.local;

import java.util.List;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.k */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5802k implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23780s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ LocalStore f23781t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ List f23782u;

    public /* synthetic */ RunnableC5802k(LocalStore localStore, List list, int i2) {
        this.f23780s = i2;
        this.f23781t = localStore;
        this.f23782u = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23780s) {
            case 0:
                this.f23781t.lambda$notifyLocalViewChanges$7(this.f23782u);
                break;
            default:
                this.f23781t.lambda$configureFieldIndexes$15(this.f23782u);
                break;
        }
    }
}
