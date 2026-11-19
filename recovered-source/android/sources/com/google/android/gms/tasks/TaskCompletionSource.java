package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public class TaskCompletionSource<TResult> {

    /* JADX INFO: renamed from: a */
    public final zzw f23216a = new zzw();

    public TaskCompletionSource() {
    }

    /* JADX INFO: renamed from: a */
    public final void m10767a(Exception exc) {
        this.f23216a.m10787c(exc);
    }

    /* JADX INFO: renamed from: b */
    public final void m10768b(Object obj) {
        this.f23216a.m10785a(obj);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10769c(Exception exc) {
        zzw zzwVar = this.f23216a;
        zzwVar.getClass();
        Preconditions.m3545i(exc, "Exception must not be null");
        synchronized (zzwVar.f23270a) {
            try {
                if (zzwVar.f23272c) {
                    return false;
                }
                zzwVar.f23272c = true;
                zzwVar.f23275f = exc;
                zzwVar.f23271b.m10782b(zzwVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10770d(Object obj) {
        return this.f23216a.m10786b(obj);
    }

    public TaskCompletionSource(CancellationToken cancellationToken) {
        zzs zzsVar = new zzs(this);
        zzb zzbVar = (zzb) cancellationToken;
        zzbVar.getClass();
        zzbVar.f23229a.addOnSuccessListener(TaskExecutors.f23217a, new zza(zzbVar, zzsVar));
    }
}
