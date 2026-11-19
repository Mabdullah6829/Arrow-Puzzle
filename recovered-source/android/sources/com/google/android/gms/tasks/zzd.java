package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzd implements zzq {

    /* JADX INFO: renamed from: s */
    public final Executor f23232s;

    /* JADX INFO: renamed from: t */
    public final Continuation f23233t;

    /* JADX INFO: renamed from: u */
    public final zzw f23234u;

    public zzd(Executor executor, Continuation continuation, zzw zzwVar) {
        this.f23232s = executor;
        this.f23233t = continuation;
        this.f23234u = zzwVar;
    }

    @Override // com.google.android.gms.tasks.zzq
    /* JADX INFO: renamed from: a */
    public final void mo10780a(Task task) {
        this.f23232s.execute(new zzc(this, task));
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzb() {
        throw new UnsupportedOperationException();
    }
}
