package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes2.dex */
final class zzi implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Task f23244s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzj f23245t;

    public zzi(zzj zzjVar, Task task) {
        this.f23244s = task;
        this.f23245t = zzjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzj zzjVar = this.f23245t;
        synchronized (zzjVar.f23247t) {
            try {
                OnCompleteListener onCompleteListener = zzjVar.f23248u;
                if (onCompleteListener != null) {
                    onCompleteListener.onComplete(this.f23244s);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
