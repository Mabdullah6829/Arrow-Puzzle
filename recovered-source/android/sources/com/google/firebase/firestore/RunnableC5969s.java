package com.google.firebase.firestore;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.firebase.firestore.s */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5969s implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23954s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23955t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f23956u;

    public /* synthetic */ RunnableC5969s(int i2, Object obj, Object obj2) {
        this.f23954s = i2;
        this.f23955t = obj;
        this.f23956u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23954s) {
            case 0:
                ((LoadBundleTask.ManagedListener) this.f23955t).lambda$invokeAsync$0((LoadBundleTaskProgress) this.f23956u);
                break;
            case 1:
                ((FirebaseFirestore) this.f23955t).lambda$clearPersistence$5((TaskCompletionSource) this.f23956u);
                break;
            default:
                ((LoadBundleTask) this.f23955t).lambda$addOnProgressListener$0((OnProgressListener) this.f23956u);
                break;
        }
    }
}
