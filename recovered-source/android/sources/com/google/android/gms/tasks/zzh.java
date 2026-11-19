package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzh implements zzq {

    /* JADX INFO: renamed from: s */
    public final Executor f23241s;

    /* JADX INFO: renamed from: t */
    public final Object f23242t = new Object();

    /* JADX INFO: renamed from: u */
    public OnCanceledListener f23243u;

    public zzh(Executor executor, OnCanceledListener onCanceledListener) {
        this.f23241s = executor;
        this.f23243u = onCanceledListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    /* JADX INFO: renamed from: a */
    public final void mo10780a(Task task) {
        if (task.isCanceled()) {
            synchronized (this.f23242t) {
                try {
                    if (this.f23243u == null) {
                        return;
                    }
                    this.f23241s.execute(new zzg(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzb() {
        synchronized (this.f23242t) {
            this.f23243u = null;
        }
    }
}
