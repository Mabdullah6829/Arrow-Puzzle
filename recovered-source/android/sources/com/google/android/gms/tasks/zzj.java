package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzj implements zzq {

    /* JADX INFO: renamed from: s */
    public final Executor f23246s;

    /* JADX INFO: renamed from: t */
    public final Object f23247t = new Object();

    /* JADX INFO: renamed from: u */
    public OnCompleteListener f23248u;

    public zzj(Executor executor, OnCompleteListener onCompleteListener) {
        this.f23246s = executor;
        this.f23248u = onCompleteListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    /* JADX INFO: renamed from: a */
    public final void mo10780a(Task task) {
        synchronized (this.f23247t) {
            try {
                if (this.f23248u == null) {
                    return;
                }
                this.f23246s.execute(new zzi(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzb() {
        synchronized (this.f23247t) {
            this.f23248u = null;
        }
    }
}
