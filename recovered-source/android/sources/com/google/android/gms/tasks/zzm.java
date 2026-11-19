package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes2.dex */
final class zzm implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Task f23254s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzn f23255t;

    public zzm(zzn zznVar, Task task) {
        this.f23254s = task;
        this.f23255t = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzn zznVar = this.f23255t;
        synchronized (zznVar.f23257t) {
            try {
                OnSuccessListener onSuccessListener = zznVar.f23258u;
                if (onSuccessListener != null) {
                    onSuccessListener.onSuccess(this.f23254s.getResult());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
