package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzero implements zzema {

    /* JADX INFO: renamed from: a */
    public final zzbjs f14736a;

    /* JADX INFO: renamed from: b */
    public final zzhcp f14737b;

    /* JADX INFO: renamed from: c */
    public final zzfps f14738c;

    /* JADX INFO: renamed from: d */
    public final zzerx f14739d;

    public zzero(zzfps zzfpsVar, zzhcp zzhcpVar, zzbjs zzbjsVar, zzerx zzerxVar) {
        this.f14738c = zzfpsVar;
        this.f14737b = zzhcpVar;
        this.f14736a = zzbjsVar;
        this.f14739d = zzerxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo6284a(zzfky zzfkyVar, zzfkn zzfknVar) {
        zzcgd zzcgdVar = new zzcgd();
        zzert zzertVar = new zzert();
        zzerm zzermVar = new zzerm(this, zzcgdVar, zzfkyVar, zzfknVar, zzertVar);
        synchronized (zzertVar) {
            zzertVar.f14747a = zzermVar;
        }
        zzfks zzfksVar = zzfknVar.f15952s;
        final zzbjn zzbjnVar = new zzbjn(zzertVar, zzfksVar.f15993b, zzfksVar.f15992a);
        zzfpm zzfpmVar = zzfpm.CUSTOM_RENDER_SYN;
        zzfps zzfpsVar = this.f14738c;
        Objects.requireNonNull(zzfpsVar);
        zzfoy zzfoyVar = new zzfoy() { // from class: com.google.android.gms.internal.ads.zzern
            @Override // com.google.android.gms.internal.ads.zzfoy
            public final /* synthetic */ void zza() {
                this.f14734a.f14736a.mo5045C3(zzbjnVar);
            }
        };
        zzfpj zzfpjVar = new zzfpj(zzfpsVar, zzfpmVar, null, zzfpk.f16241d, Collections.EMPTY_LIST, this.f14737b.submit(new zzfpc(zzfoyVar)));
        zzfpj zzfpjVarM6556a = zzfpjVar.f16240f.m6556a(zzfpjVar.m6555d(), zzfpm.CUSTOM_RENDER_ACK);
        zzfpf zzfpfVar = new zzfpf(zzcgdVar);
        zzhcp zzhcpVar = zzcfy.f9953h;
        return new zzfpj(zzfpjVarM6556a.f16240f, zzfpjVarM6556a.f16235a, zzfpjVarM6556a.f16236b, zzfpjVarM6556a.f16237c, zzfpjVarM6556a.f16238d, zzhcf.m7374h(zzfpjVarM6556a.f16239e, zzfpfVar, zzhcpVar)).m6555d();
    }

    @Override // com.google.android.gms.internal.ads.zzema
    /* JADX INFO: renamed from: b */
    public final boolean mo6285b(zzfky zzfkyVar, zzfkn zzfknVar) {
        zzfks zzfksVar;
        return (this.f14736a == null || (zzfksVar = zzfknVar.f15952s) == null || zzfksVar.f15992a == null) ? false : true;
    }
}
