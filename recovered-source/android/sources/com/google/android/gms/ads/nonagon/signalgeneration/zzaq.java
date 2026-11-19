package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbaw;
import com.google.android.gms.internal.ads.zzbkd;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzcnq;
import com.google.android.gms.internal.ads.zzcnz;
import com.google.android.gms.internal.ads.zzcop;
import com.google.android.gms.internal.ads.zzdzy;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfmf;
import com.google.android.gms.internal.ads.zzfsm;
import com.google.android.gms.internal.ads.zzhcp;
import com.google.android.gms.internal.ads.zzimy;
import com.google.android.gms.internal.ads.zzimz;
import com.google.android.gms.internal.ads.zzina;
import com.google.android.gms.internal.ads.zzinh;
import com.google.android.gms.internal.ads.zzini;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zzaq implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f3876a;

    /* JADX INFO: renamed from: b */
    public final zzcnz f3877b;

    /* JADX INFO: renamed from: c */
    public final zzini f3878c;

    /* JADX INFO: renamed from: d */
    public final zzini f3879d;

    /* JADX INFO: renamed from: e */
    public final zzini f3880e;

    /* JADX INFO: renamed from: f */
    public final zzini f3881f;

    /* JADX INFO: renamed from: g */
    public final zzini f3882g;

    /* JADX INFO: renamed from: h */
    public final zzcop f3883h;

    /* JADX INFO: renamed from: i */
    public final zzbkd f3884i;

    /* JADX INFO: renamed from: j */
    public final zzini f3885j;

    /* JADX INFO: renamed from: k */
    public final zzini f3886k;

    /* JADX INFO: renamed from: l */
    public final zzini f3887l;

    public zzaq(zzina zzinaVar, zzcnz zzcnzVar, zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3, zzimy zzimyVar4, zzimy zzimyVar5, zzcop zzcopVar, zzbkd zzbkdVar, zzimy zzimyVar6, zzimy zzimyVar7, zzimy zzimyVar8) {
        this.f3876a = zzinaVar;
        this.f3877b = zzcnzVar;
        this.f3878c = zzimyVar;
        this.f3879d = zzimyVar2;
        this.f3880e = zzimyVar3;
        this.f3881f = zzimyVar4;
        this.f3882g = zzimyVar5;
        this.f3883h = zzcopVar;
        this.f3884i = zzbkdVar;
        this.f3885j = zzimyVar6;
        this.f3886k = zzimyVar7;
        this.f3887l = zzimyVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzcnq zzcnqVar = (zzcnq) this.f3876a.f20011a;
        Context contextM5709a = this.f3877b.m5709a();
        zzbaw zzbawVar = (zzbaw) this.f3878c.zzb();
        zzfmf zzfmfVar = (zzfmf) this.f3879d.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzap(zzcnqVar, contextM5709a, zzbawVar, zzfmfVar, zzhcpVar, (ScheduledExecutorService) this.f3880e.zzb(), (zzdzy) this.f3881f.zzb(), (zzfsm) this.f3882g.zzb(), this.f3883h.m5711a(), this.f3884i.zzb(), (zzflk) this.f3885j.zzb(), (zzj) this.f3886k.zzb(), (zza) this.f3887l.zzb());
    }
}
