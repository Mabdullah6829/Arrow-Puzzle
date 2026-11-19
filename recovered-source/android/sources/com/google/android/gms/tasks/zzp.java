package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzp<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, zzq {

    /* JADX INFO: renamed from: s */
    public final Executor f23261s;

    /* JADX INFO: renamed from: t */
    public final SuccessContinuation f23262t;

    /* JADX INFO: renamed from: u */
    public final zzw f23263u;

    public zzp(Executor executor, SuccessContinuation successContinuation, zzw zzwVar) {
        this.f23261s = executor;
        this.f23262t = successContinuation;
        this.f23263u = zzwVar;
    }

    @Override // com.google.android.gms.tasks.zzq
    /* JADX INFO: renamed from: a */
    public final void mo10780a(Task task) {
        this.f23261s.execute(new zzo(this, task));
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    /* JADX INFO: renamed from: b */
    public final void mo10766b() {
        this.f23263u.m10788d();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f23263u.m10787c(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f23263u.m10785a(obj);
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzb() {
        throw new UnsupportedOperationException();
    }
}
