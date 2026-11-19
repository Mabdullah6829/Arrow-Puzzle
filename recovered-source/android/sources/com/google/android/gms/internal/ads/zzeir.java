package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeir implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f13979a;

    /* JADX INFO: renamed from: b */
    public final zzini f13980b;

    /* JADX INFO: renamed from: c */
    public final zzeiz f13981c;

    /* JADX INFO: renamed from: d */
    public final zzini f13982d;

    /* JADX INFO: renamed from: e */
    public final zzini f13983e;

    public zzeir(zzini zziniVar, zzini zziniVar2, zzeiz zzeizVar, zzini zziniVar3, zzini zziniVar4) {
        this.f13979a = zziniVar;
        this.f13980b = zziniVar2;
        this.f13981c = zzeizVar;
        this.f13982d = zziniVar3;
        this.f13983e = zziniVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Context contextM5709a = ((zzcnz) this.f13979a).m5709a();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        zzcbs zzcbsVar = new zzcbs();
        zzcnq zzcnqVar = (zzcnq) ((zzcol) this.f13980b).f10643a.f20011a;
        zzinh.m8554a(zzcnqVar);
        zzeiy zzeiyVar = new zzeiy(((zzcox) this.f13981c.f14003a).zzb());
        ArrayDeque arrayDeque = (ArrayDeque) this.f13982d.zzb();
        new zzeiv();
        return new zzeiq(contextM5709a, zzhcpVar, zzcbsVar, zzcnqVar, zzeiyVar, arrayDeque, (zzfqt) this.f13983e.zzb());
    }
}
