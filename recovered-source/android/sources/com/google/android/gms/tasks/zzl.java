package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzl implements zzq {

    /* JADX INFO: renamed from: s */
    public final Executor f23251s;

    /* JADX INFO: renamed from: t */
    public final Object f23252t = new Object();

    /* JADX INFO: renamed from: u */
    public OnFailureListener f23253u;

    public zzl(Executor executor, OnFailureListener onFailureListener) {
        this.f23251s = executor;
        this.f23253u = onFailureListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    /* JADX INFO: renamed from: a */
    public final void mo10780a(Task task) {
        if (task.isSuccessful() || task.isCanceled()) {
            return;
        }
        synchronized (this.f23252t) {
            try {
                if (this.f23253u == null) {
                    return;
                }
                this.f23251s.execute(new zzk(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzb() {
        synchronized (this.f23252t) {
            this.f23253u = null;
        }
    }
}
