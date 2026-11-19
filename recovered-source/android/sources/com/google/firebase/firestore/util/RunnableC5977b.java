package com.google.firebase.firestore.util;

/* JADX INFO: renamed from: com.google.firebase.firestore.util.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5977b implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23963s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23964t;

    public /* synthetic */ RunnableC5977b(Object obj, int i2) {
        this.f23963s = i2;
        this.f23964t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23963s) {
            case 0:
                AsyncQueue.lambda$panic$3((Throwable) this.f23964t);
                break;
            case 1:
                ((AsyncQueue.DelayedTask) this.f23964t).handleDelayElapsed();
                break;
            default:
                Util.lambda$crashMainThread$1((RuntimeException) this.f23964t);
                break;
        }
    }
}
