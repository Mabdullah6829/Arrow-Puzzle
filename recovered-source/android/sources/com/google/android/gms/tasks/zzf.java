package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzf<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, zzq {

    /* JADX INFO: renamed from: s */
    public final Executor f23237s;

    /* JADX INFO: renamed from: t */
    public final Continuation f23238t;

    /* JADX INFO: renamed from: u */
    public final zzw f23239u;

    public zzf(Executor executor, Continuation continuation, zzw zzwVar) {
        this.f23237s = executor;
        this.f23238t = continuation;
        this.f23239u = zzwVar;
    }

    @Override // com.google.android.gms.tasks.zzq
    /* JADX INFO: renamed from: a */
    public final void mo10780a(Task task) {
        this.f23237s.execute(new zze(this, task));
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    /* JADX INFO: renamed from: b */
    public final void mo10766b() {
        this.f23239u.m10788d();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f23239u.m10787c(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f23239u.m10785a(obj);
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzb() {
        throw new UnsupportedOperationException();
    }
}
