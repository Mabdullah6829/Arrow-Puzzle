package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zze implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Task f23235s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzf f23236t;

    public zze(zzf zzfVar, Task task) {
        this.f23235s = task;
        this.f23236t = zzfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzf zzfVar = this.f23236t;
        try {
            Task task = (Task) zzfVar.f23238t.mo170a(this.f23235s);
            if (task == null) {
                zzfVar.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = TaskExecutors.f23218b;
            task.addOnSuccessListener(executor, zzfVar);
            task.addOnFailureListener(executor, zzfVar);
            task.addOnCanceledListener(executor, zzfVar);
        } catch (RuntimeExecutionException e) {
            if (!(e.getCause() instanceof Exception)) {
                zzfVar.f23239u.m10787c(e);
            } else {
                zzfVar.f23239u.m10787c((Exception) e.getCause());
            }
        } catch (Exception e2) {
            zzfVar.f23239u.m10787c(e2);
        }
    }
}
