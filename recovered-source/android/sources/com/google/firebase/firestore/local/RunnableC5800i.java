package com.google.firebase.firestore.local;

import com.google.firebase.firestore.bundle.BundleMetadata;
import com.google.protobuf.AbstractC6251n;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.i */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5800i implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23775s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ LocalStore f23776t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f23777u;

    public /* synthetic */ RunnableC5800i(LocalStore localStore, Object obj, int i2) {
        this.f23775s = i2;
        this.f23776t = localStore;
        this.f23777u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23775s) {
            case 0:
                this.f23776t.lambda$saveBundle$10((BundleMetadata) this.f23777u);
                break;
            default:
                this.f23776t.lambda$setLastStreamToken$5((AbstractC6251n) this.f23777u);
                break;
        }
    }
}
