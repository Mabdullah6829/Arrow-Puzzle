package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
final class zzcpd extends zzfdu {

    /* JADX INFO: renamed from: a */
    public final zzfex f10719a;

    /* JADX INFO: renamed from: b */
    public final zzcpe f10720b;

    /* JADX INFO: renamed from: c */
    public final zzfep f10721c;

    /* JADX INFO: renamed from: d */
    public final zzfew f10722d;

    /* JADX INFO: renamed from: e */
    public final zzfdt f10723e;

    /* JADX INFO: renamed from: f */
    public final zzffn f10724f;

    /* JADX INFO: renamed from: g */
    public final zzfeh f10725g;

    /* JADX INFO: renamed from: h */
    public final zzfed f10726h;

    /* JADX INFO: renamed from: i */
    public final zzffj f10727i;

    /* JADX INFO: renamed from: j */
    public final zzimy f10728j;

    /* JADX INFO: renamed from: k */
    public final zzimy f10729k;

    public zzcpd(zzcpe zzcpeVar, zzfex zzfexVar) {
        this.f10720b = zzcpeVar;
        this.f10719a = zzfexVar;
        zzfey zzfeyVar = new zzfey(zzfexVar);
        int i2 = zzcro.f11314a;
        zzfoi zzfoiVar = zzfoh.f16202a;
        this.f10721c = new zzfep(zzfeyVar);
        int i3 = zzcrq.f11315a;
        zzimy zzimyVar = zzcpeVar.f10780e;
        zzcnz zzcnzVar = zzcpeVar.f10786h;
        this.f10722d = new zzfew(zzcnzVar, zzimyVar);
        zzfez zzfezVar = new zzfez(zzfexVar);
        zzffa zzffaVar = new zzffa(zzfexVar);
        zzffb zzffbVar = new zzffb(zzfexVar);
        int i4 = zzcrs.f11316a;
        this.f10723e = new zzfdt(zzcnzVar, zzimyVar, zzfezVar, zzffaVar, zzffbVar);
        this.f10724f = new zzffn();
        int i5 = zzcrm.f11313a;
        this.f10725g = new zzfeh(zzcnzVar);
        int i6 = zzcrk.f11312a;
        zzimy zzimyVar2 = zzcpeVar.f10742G;
        this.f10726h = new zzfed(zzfeyVar, zzimyVar2, zzimyVar);
        zzffd zzffdVar = new zzffd(zzfexVar);
        int i7 = zzcru.f11317a;
        this.f10727i = new zzffj(zzimyVar2, zzffbVar, zzfeyVar, zzimyVar, zzffdVar);
        this.f10728j = zzimy.m8547a(new zzfqr(zzcpeVar.f10820y));
        zzffc zzffcVar = new zzffc(zzfexVar);
        zzimy zzimyVarM8547a = zzimy.m8547a(zzdyn.f13289a);
        zzimy zzimyVarM8547a2 = zzimy.m8547a(zzdyl.f13288a);
        zzimy zzimyVarM8547a3 = zzimy.m8547a(zzdyp.f13290a);
        zzimy zzimyVarM8547a4 = zzimy.m8547a(zzdyr.f13291a);
        int i8 = zzind.f20012b;
        zzinc zzincVar = new zzinc(4);
        zzincVar.m8545a(zzfpm.GMS_SIGNALS, zzimyVarM8547a);
        zzincVar.m8545a(zzfpm.BUILD_URL, zzimyVarM8547a2);
        zzincVar.m8545a(zzfpm.HTTP, zzimyVarM8547a3);
        zzincVar.m8545a(zzfpm.PRE_PROCESS, zzimyVarM8547a4);
        zzimy zzimyVarM8547a5 = zzimy.m8547a(new zzdyt(zzffcVar, zzcpeVar.f10786h, zzincVar.m8551c()));
        int i9 = zzinl.f20015c;
        zzink zzinkVar = new zzink(0, 1);
        zzinkVar.m8557b(zzimyVarM8547a5);
        this.f10729k = zzimy.m8547a(new zzfpu(zzcpeVar.f10780e, new zzfpv(zzinkVar.m8558c())));
    }

    @Override // com.google.android.gms.internal.ads.zzfdu
    /* JADX INFO: renamed from: a */
    public final zzfcv mo5729a() {
        zzcpe zzcpeVar = this.f10720b;
        Context context = zzcpeVar.f10774b.f10620b;
        zzinh.m8554a(context);
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        zzfep zzfepVar = this.f10721c;
        zzfepVar.getClass();
        new zzcez();
        zzinh.m8554a(zzhcpVar);
        zzinh.m8554a(zzfepVar.f15551a.f15563a.f15561a.f9685v);
        zzfen zzfenVar = new zzfen();
        zzimy zzimyVar = zzcpeVar.f10780e;
        zzfbe zzfbeVar = new zzfbe(zzfenVar, 0L, (ScheduledExecutorService) zzimyVar.zzb());
        zzfew zzfewVar = this.f10722d;
        zzfewVar.getClass();
        new zzbzm();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzfewVar.f15559a.zzb();
        ((zzcnz) zzfewVar.f15560b).m5709a();
        zzfbe zzfbeVar2 = new zzfbe(new zzfeu(scheduledExecutorService), ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8493d5)).longValue(), (ScheduledExecutorService) zzimyVar.zzb());
        zzfbe zzfbeVar3 = new zzfbe(this.f10723e.zzb(), 0L, (ScheduledExecutorService) zzimyVar.zzb());
        zzinh.m8554a(zzhcpVar);
        zzfbe zzfbeVar4 = new zzfbe(new zzffl(zzhcpVar), 0L, (ScheduledExecutorService) zzimyVar.zzb());
        zzfeh zzfehVar = this.f10725g;
        zzfehVar.getClass();
        new zzbhl();
        zzinh.m8554a(zzhcpVar);
        ((zzcnz) zzfehVar.f15542a).m5709a();
        zzfef zzfefVar = new zzfef(zzhcpVar);
        new zzbih();
        zzinh.m8554a(zzhcpVar);
        List list = this.f10719a.f15561a.f9686w;
        zzinh.m8554a(list);
        return new zzfcv(context, zzhcpVar, zzgxd.m7239n(zzfbeVar, zzfbeVar2, zzfbeVar3, zzfbeVar4, zzfefVar, new zzfer(zzhcpVar, list), m5732d(), (zzfcs) zzcpeVar.f10763Q0.zzb(), this.f10726h.zzb(), this.f10727i.zzb()), (zzfqq) this.f10728j.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzfdu
    /* JADX INFO: renamed from: b */
    public final zzfps mo5730b() {
        return (zzfps) this.f10729k.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfdu
    /* JADX INFO: renamed from: c */
    public final zzfqq mo5731c() {
        return (zzfqq) this.f10728j.zzb();
    }

    /* JADX INFO: renamed from: d */
    public final zzfdx m5732d() {
        new zzcfc();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        zzfex zzfexVar = this.f10719a;
        String string = zzfexVar.f15561a.f9682s.getString("ms");
        if (string == null) {
            string = "";
        }
        PackageInfo packageInfo = zzfexVar.f15561a.f9687x;
        return new zzfdx(zzhcpVar, string);
    }
}
