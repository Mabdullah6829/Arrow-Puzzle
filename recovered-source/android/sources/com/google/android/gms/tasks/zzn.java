package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzn implements zzq {

    /* JADX INFO: renamed from: s */
    public final Executor f23256s;

    /* JADX INFO: renamed from: t */
    public final Object f23257t = new Object();

    /* JADX INFO: renamed from: u */
    public OnSuccessListener f23258u;

    public zzn(Executor executor, OnSuccessListener onSuccessListener) {
        this.f23256s = executor;
        this.f23258u = onSuccessListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    /* JADX INFO: renamed from: a */
    public final void mo10780a(Task task) {
        if (task.isSuccessful()) {
            synchronized (this.f23257t) {
                try {
                    if (this.f23258u == null) {
                        return;
                    }
                    this.f23256s.execute(new zzm(this, task));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzb() {
        synchronized (this.f23257t) {
            this.f23258u = null;
        }
    }
}
