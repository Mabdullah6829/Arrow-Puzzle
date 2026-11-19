package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzerj implements zzema {

    /* JADX INFO: renamed from: a */
    public final Context f14719a;

    /* JADX INFO: renamed from: b */
    public final zzcwx f14720b;

    /* JADX INFO: renamed from: c */
    public final zzbjs f14721c;

    /* JADX INFO: renamed from: d */
    public final zzhcp f14722d;

    /* JADX INFO: renamed from: e */
    public final zzfps f14723e;

    public zzerj(Context context, zzcwx zzcwxVar, zzfps zzfpsVar, zzhcp zzhcpVar, zzbjs zzbjsVar) {
        this.f14719a = context;
        this.f14720b = zzcwxVar;
        this.f14723e = zzfpsVar;
        this.f14722d = zzhcpVar;
        this.f14721c = zzbjsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo6284a(zzfky zzfkyVar, zzfkn zzfknVar) {
        zzerf zzerfVar = new zzerf(new View(this.f14719a), null, new zzcxy() { // from class: com.google.android.gms.internal.ads.zzerh
            @Override // com.google.android.gms.internal.ads.zzcxy
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zza() {
                return null;
            }
        }, (zzfko) zzfknVar.f15956u.get(0));
        zzcvt zzcvtVarMo5756d = this.f14720b.mo5756d(new zzcyq(zzfkyVar, zzfknVar, null), zzerfVar);
        zzcpk zzcpkVar = (zzcpk) zzcvtVarMo5756d;
        zzeri zzeriVar = new zzeri((zzdcx) zzcpkVar.f10919k.zzb(), (zzddr) zzcpkVar.f10922n.zzb(), (zzdli) zzcpkVar.f10924p.zzb(), (zzdla) zzcpkVar.f10933y.zzb(), (zzcun) zzcpkVar.f10913e.zzb());
        zzfks zzfksVar = zzfknVar.f15952s;
        final zzbjn zzbjnVar = new zzbjn(zzeriVar, zzfksVar.f15993b, zzfksVar.f15992a);
        zzfps zzfpsVar = this.f14723e;
        Objects.requireNonNull(zzfpsVar);
        zzfpc zzfpcVar = new zzfpc(new zzfoy() { // from class: com.google.android.gms.internal.ads.zzerg
            @Override // com.google.android.gms.internal.ads.zzfoy
            public final /* synthetic */ void zza() {
                this.f14710a.f14721c.mo5045C3(zzbjnVar);
            }
        });
        zzfpj zzfpjVar = new zzfpj(zzfpsVar, zzfpm.CUSTOM_RENDER_SYN, null, zzfpk.f16241d, Collections.EMPTY_LIST, this.f14722d.submit(zzfpcVar));
        zzfpj zzfpjVarM6556a = zzfpjVar.f16240f.m6556a(zzfpjVar.m6555d(), zzfpm.CUSTOM_RENDER_ACK);
        zzfpf zzfpfVar = new zzfpf(zzhcf.m7367a(zzcvtVarMo5756d.mo5747g()));
        zzhcp zzhcpVar = zzcfy.f9953h;
        return new zzfpj(zzfpjVarM6556a.f16240f, zzfpjVarM6556a.f16235a, zzfpjVarM6556a.f16236b, zzfpjVarM6556a.f16237c, zzfpjVarM6556a.f16238d, zzhcf.m7374h(zzfpjVarM6556a.f16239e, zzfpfVar, zzhcpVar)).m6555d();
    }

    @Override // com.google.android.gms.internal.ads.zzema
    /* JADX INFO: renamed from: b */
    public final boolean mo6285b(zzfky zzfkyVar, zzfkn zzfknVar) {
        zzfks zzfksVar;
        return (this.f14721c == null || (zzfksVar = zzfknVar.f15952s) == null || zzfksVar.f15992a == null) ? false : true;
    }
}
