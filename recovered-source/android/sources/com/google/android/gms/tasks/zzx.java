package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class zzx implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzw f23276s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Callable f23277t;

    public zzx(zzw zzwVar, Callable callable) {
        this.f23276s = zzwVar;
        this.f23277t = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzw zzwVar = this.f23276s;
        try {
            zzwVar.m10785a(this.f23277t.call());
        } catch (Exception e) {
            zzwVar.m10787c(e);
        } catch (Throwable th) {
            zzwVar.m10787c(new RuntimeException(th));
        }
    }
}
