package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes2.dex */
final class zzg implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzh f23240s;

    public zzg(zzh zzhVar) {
        this.f23240s = zzhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzh zzhVar = this.f23240s;
        synchronized (zzhVar.f23242t) {
            try {
                OnCanceledListener onCanceledListener = zzhVar.f23243u;
                if (onCanceledListener != null) {
                    onCanceledListener.mo10766b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
