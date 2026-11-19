package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzcix implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzciz f10177s;

    public zzcix(zzciz zzcizVar) {
        this.f10177s = zzcizVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcja zzcjaVar = com.google.android.gms.ads.internal.zzt.f3698C.f3699A;
        zzcjaVar.f10184s.remove(this.f10177s);
    }
}
