package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzo implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Task f23259s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzp f23260t;

    public zzo(zzp zzpVar, Task task) {
        this.f23259s = task;
        this.f23260t = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzp zzpVar = this.f23260t;
        try {
            Task taskThen = zzpVar.f23262t.then(this.f23259s.getResult());
            if (taskThen == null) {
                zzpVar.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = TaskExecutors.f23218b;
            taskThen.addOnSuccessListener(executor, zzpVar);
            taskThen.addOnFailureListener(executor, zzpVar);
            taskThen.addOnCanceledListener(executor, zzpVar);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                zzpVar.onFailure((Exception) e.getCause());
            } else {
                zzpVar.onFailure(e);
            }
        } catch (CancellationException unused) {
            zzpVar.mo10766b();
        } catch (Exception e2) {
            zzpVar.onFailure(e2);
        }
    }
}
