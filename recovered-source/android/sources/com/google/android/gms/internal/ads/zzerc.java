package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzerc implements zzema {

    /* JADX INFO: renamed from: a */
    public final zzemc f14692a;

    /* JADX INFO: renamed from: b */
    public final zzemg f14693b;

    /* JADX INFO: renamed from: c */
    public final zzfps f14694c;

    /* JADX INFO: renamed from: d */
    public final zzhcp f14695d;

    public zzerc(zzfps zzfpsVar, zzhcp zzhcpVar, zzemc zzemcVar, zzemg zzemgVar) {
        this.f14694c = zzfpsVar;
        this.f14695d = zzhcpVar;
        this.f14693b = zzemgVar;
        this.f14692a = zzemcVar;
    }

    /* JADX INFO: renamed from: c */
    public static final String m6317c(int i2, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(i2).length());
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i2);
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.zzbem, com.google.android.gms.internal.ads.zzdej] */
    @Override // com.google.android.gms.internal.ads.zzema
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo6284a(final zzfky zzfkyVar, final zzfkn zzfknVar) {
        final zzemd zzemdVarMo6286a;
        Iterator it = zzfknVar.f15954t.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzemdVarMo6286a = null;
                break;
            }
            try {
                zzemdVarMo6286a = this.f14692a.mo6286a(zzfknVar.f15958v, (String) it.next());
                break;
            } catch (zzfln unused) {
            }
        }
        if (zzemdVarMo6286a == null) {
            return zzhcf.m7368b(new zzeot(3, "Unable to instantiate mediation adapter class."));
        }
        zzcgd zzcgdVar = new zzcgd();
        zzemdVarMo6286a.f14193c.mo5909v3(new zzeqz(this, zzemdVarMo6286a, zzcgdVar));
        if (zzfknVar.f15902M) {
            Bundle bundle = zzfkyVar.f16005a.f15998a.f16040d.f3210E;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfps zzfpsVar = this.f14694c;
        Objects.requireNonNull(zzfpsVar);
        zzfpc zzfpcVar = new zzfpc(new zzfoy() { // from class: com.google.android.gms.internal.ads.zzerb
            @Override // com.google.android.gms.internal.ads.zzfoy
            public final /* synthetic */ void zza() {
                this.f14688a.f14693b.mo6292b(zzfkyVar, zzfknVar, zzemdVarMo6286a);
            }
        });
        zzfpj zzfpjVar = new zzfpj(zzfpsVar, zzfpm.ADAPTER_LOAD_AD_SYN, null, zzfpk.f16241d, Collections.EMPTY_LIST, this.f14695d.submit(zzfpcVar));
        zzfpj zzfpjVarM6556a = zzfpjVar.f16240f.m6556a(zzfpjVar.m6555d(), zzfpm.ADAPTER_LOAD_AD_ACK);
        zzfpf zzfpfVar = new zzfpf(zzcgdVar);
        zzhcp zzhcpVar = zzcfy.f9953h;
        zzfpj zzfpjVar2 = new zzfpj(zzfpjVarM6556a.f16240f, zzfpjVarM6556a.f16235a, zzfpjVarM6556a.f16236b, zzfpjVarM6556a.f16237c, zzfpjVarM6556a.f16238d, zzhcf.m7374h(zzfpjVarM6556a.f16239e, zzfpfVar, zzhcpVar));
        return zzfpjVar2.f16240f.m6556a(zzfpjVar2.m6555d(), zzfpm.ADAPTER_WRAP_ADAPTER).m6552a(new zzfos() { // from class: com.google.android.gms.internal.ads.zzera
            @Override // com.google.android.gms.internal.ads.zzfos
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Object mo5874b(Object obj) {
                return this.f14684a.f14693b.mo6291a(zzfkyVar, zzfknVar, zzemdVarMo6286a);
            }
        }).m6555d();
    }

    @Override // com.google.android.gms.internal.ads.zzema
    /* JADX INFO: renamed from: b */
    public final boolean mo6285b(zzfky zzfkyVar, zzfkn zzfknVar) {
        return !zzfknVar.f15954t.isEmpty();
    }
}
