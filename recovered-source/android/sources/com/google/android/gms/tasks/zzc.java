package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes2.dex */
final class zzc implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Task f23230s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzd f23231t;

    public zzc(zzd zzdVar, Task task) {
        this.f23230s = task;
        this.f23231t = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Task task = this.f23230s;
        boolean zIsCanceled = task.isCanceled();
        zzd zzdVar = this.f23231t;
        if (zIsCanceled) {
            zzdVar.f23234u.m10788d();
            return;
        }
        try {
            zzdVar.f23234u.m10785a(zzdVar.f23233t.mo170a(task));
        } catch (RuntimeExecutionException e) {
            if (!(e.getCause() instanceof Exception)) {
                zzdVar.f23234u.m10787c(e);
            } else {
                zzdVar.f23234u.m10787c((Exception) e.getCause());
            }
        } catch (Exception e2) {
            zzdVar.f23234u.m10787c(e2);
        }
    }
}
