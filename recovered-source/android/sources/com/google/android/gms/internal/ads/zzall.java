package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
final class zzall implements zzali {

    /* JADX INFO: renamed from: a */
    public final int f5819a;

    /* JADX INFO: renamed from: b */
    public final int f5820b;

    /* JADX INFO: renamed from: c */
    public final zzeu f5821c;

    public zzall(zzga zzgaVar, zzv zzvVar) {
        zzeu zzeuVar = zzgaVar.f16879b;
        this.f5821c = zzeuVar;
        zzeuVar.m6363E(12);
        int iM6382h = zzeuVar.m6382h();
        if ("audio/raw".equals(zzvVar.f21061o)) {
            int iM6504f = zzfm.m6504f(zzvVar.f21040J) * zzvVar.f21037G;
            if (iM6382h % iM6504f != 0) {
                zzeh.m6211c("BoxParsers", AbstractC1456a.m2449p(new StringBuilder(String.valueOf(iM6504f).length() + 66 + String.valueOf(iM6382h).length()), "Audio sample size mismatch. stsd sample size: ", iM6504f, ", stsz sample size: ", iM6382h));
                iM6382h = iM6504f;
            }
        }
        this.f5819a = iM6382h == 0 ? -1 : iM6382h;
        this.f5820b = zzeuVar.m6382h();
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final int zza() {
        return this.f5820b;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final int zzb() {
        return this.f5819a;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final int zzc() {
        int i2 = this.f5819a;
        return i2 == -1 ? this.f5821c.m6382h() : i2;
    }
}
