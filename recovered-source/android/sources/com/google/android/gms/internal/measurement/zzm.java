package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzm extends zzai {

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzo f22646u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzm(zzn zznVar, zzo zzoVar) {
        super("getValue");
        this.f22646u = zzoVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    /* JADX INFO: renamed from: c */
    public final zzao mo9793c(zzg zzgVar, List list) {
        zzh.m10003a("getValue", 2, list);
        zzao zzaoVarM9950a = zzgVar.m9950a((zzao) list.get(0));
        zzao zzaoVarM9950a2 = zzgVar.m9950a((zzao) list.get(1));
        String strZza = this.f22646u.zza(zzaoVarM9950a.zzc());
        return strZza != null ? new zzas(strZza) : zzaoVarM9950a2;
    }
}
