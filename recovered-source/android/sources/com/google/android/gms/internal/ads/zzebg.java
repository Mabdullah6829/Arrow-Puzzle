package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzebg {

    /* JADX INFO: renamed from: a */
    public final zzbqx f13495a;

    public zzebg(zzbqx zzbqxVar) {
        this.f13495a = zzbqxVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m6144a(long j2) {
        zzebf zzebfVar = new zzebf("creation");
        zzebfVar.f13489a = Long.valueOf(j2);
        zzebfVar.f13491c = "nativeObjectNotCreated";
        m6145b(zzebfVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m6145b(zzebf zzebfVar) {
        String strM6143a = zzebfVar.m6143a();
        String strConcat = "Dispatching AFMA event on publisher webview: ".concat(strM6143a);
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3072e(strConcat);
        this.f13495a.mo5118m(strM6143a);
    }
}
