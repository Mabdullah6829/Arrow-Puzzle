package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeft implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f13817a;

    /* JADX INFO: renamed from: b */
    public final zzdcq f13818b;

    /* JADX INFO: renamed from: c */
    public final zzeeu f13819c;

    /* JADX INFO: renamed from: d */
    public final zzini f13820d;

    /* JADX INFO: renamed from: e */
    public final zzini f13821e;

    /* JADX INFO: renamed from: f */
    public final zzini f13822f;

    public zzeft(zzini zziniVar, zzdcq zzdcqVar, zzeeu zzeeuVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.f13817a = zziniVar;
        this.f13818b = zzdcqVar;
        this.f13819c = zzeeuVar;
        this.f13820d = zziniVar2;
        this.f13821e = zziniVar3;
        this.f13822f = zziniVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Context contextM5709a = ((zzcnz) this.f13817a).m5709a();
        zzflg zzflgVarM5898a = this.f13818b.m5898a();
        zzhcp zzhcpVar = zzcfy.f9947b;
        zzinh.m8554a(zzhcpVar);
        zzhcp zzhcpVar2 = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar2);
        zzeeu zzeeuVar = this.f13819c;
        zzeet zzeetVar = new zzeet(zzhcpVar, zzhcpVar2, new zzegd((Context) zzeeuVar.f13769a.f13790a.zzb(), zzhcpVar2), zzimy.m8548b(zzeeuVar.f13770b));
        zzinh.m8554a(zzhcpVar2);
        return new zzefs(contextM5709a, zzflgVarM5898a, zzeetVar, zzhcpVar2, (ScheduledExecutorService) this.f13820d.zzb(), (zzejl) this.f13821e.zzb(), (zzfqq) this.f13822f.zzb());
    }
}
