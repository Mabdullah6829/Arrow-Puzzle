package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzvt implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzvw f21127s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzly f21128t;

    public /* synthetic */ zzvt(zzvw zzvwVar, zzly zzlyVar) {
        this.f21127s = zzvwVar;
        this.f21128t = zzlyVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        zzvw zzvwVar = this.f21127s;
        zzvwVar.f21171W.set(zzvwVar.m8580B(this.f21128t, zzvwVar.f21159Q, 0));
    }
}
