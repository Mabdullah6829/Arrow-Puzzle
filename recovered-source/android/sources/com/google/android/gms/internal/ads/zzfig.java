package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfig implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f15743a;

    /* JADX INFO: renamed from: b */
    public final zzini f15744b;

    /* JADX INFO: renamed from: c */
    public final zzini f15745c;

    public zzfig(zzimy zzimyVar, zzimy zzimyVar2, zzina zzinaVar) {
        this.f15743a = zzinaVar;
        this.f15744b = zzimyVar;
        this.f15745c = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfie zzb() {
        zzcff zzcffVarZzi;
        Context context = (Context) this.f15743a.f20011a;
        zzfmr zzfmrVar = (zzfmr) this.f15744b.zzb();
        zzfnj zzfnjVar = (zzfnj) this.f15745c.zzb();
        zzbio zzbioVar = zzbix.f8596j7;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            zzcffVarZzi = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().zzi();
        } else {
            com.google.android.gms.ads.internal.util.zzj zzjVarM5387g = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g();
            synchronized (zzjVarM5387g.f3585a) {
                zzcffVarZzi = zzjVarM5387g.f3598n;
            }
        }
        boolean z = false;
        if (zzcffVarZzi != null && zzcffVarZzi.f9882j) {
            z = true;
        }
        if (((Integer) zzbaVar.f3098c.m5030a(zzbix.f8868z7)).intValue() > 0) {
            if (!((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8580i7)).booleanValue() || z) {
                zzfni zzfniVarM6544a = zzfnjVar.m6544a(zzfmz.f16139u, context, zzfmrVar, new zzfhh(new zzfhg()));
                zzfhv zzfhvVar = new zzfhv(new zzfhu());
                zzfmv zzfmvVar = zzfniVarM6544a.f16161a;
                zzhcp zzhcpVar = zzcfy.f9946a;
                return new zzfhl(zzfhvVar, new zzfhr(zzfmvVar, zzhcpVar), zzfniVarM6544a.f16162b, ((zzfmw) zzfmvVar).f16127b.f16153y, zzhcpVar);
            }
        }
        return new zzfhu();
    }
}
