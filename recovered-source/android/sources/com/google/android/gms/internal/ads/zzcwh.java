package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcwh implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcxl f11622a;

    public zzcwh(zzcxl zzcxlVar) {
        this.f11622a = zzcxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Object zzgzeVar;
        zzcxl zzcxlVar = this.f11622a;
        zzcxk zzcxkVar = new zzcxk(zzcxlVar.f11679a.f11635a.f11613d, (Executor) zzcxlVar.f11680b.zzb());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8468be)).booleanValue()) {
            zzdky zzdkyVar = new zzdky(zzcxkVar, zzcfy.f9946a);
            int i2 = zzgxd.f18323u;
            zzgzeVar = new zzgze(zzdkyVar);
        } else {
            int i3 = zzgxd.f18323u;
            zzgzeVar = zzgyu.f18372B;
        }
        zzinh.m8554a(zzgzeVar);
        return zzgzeVar;
    }
}
