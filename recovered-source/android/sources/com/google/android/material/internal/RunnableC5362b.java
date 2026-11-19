package com.google.android.material.internal;

import android.view.View;
import com.google.firebase.firestore.core.FirestoreClient;

/* JADX INFO: renamed from: com.google.android.material.internal.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5362b implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23437s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ boolean f23438t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f23439u;

    public /* synthetic */ RunnableC5362b(Object obj, boolean z, int i2) {
        this.f23437s = i2;
        this.f23439u = obj;
        this.f23438t = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23437s) {
            case 0:
                ViewUtils.showKeyboard((View) this.f23439u, this.f23438t);
                break;
            default:
                ((FirestoreClient) this.f23439u).lambda$setIndexAutoCreationEnabled$23(this.f23438t);
                break;
        }
    }
}
