package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhmm extends zzhdz {

    /* JADX INFO: renamed from: a */
    public final zzhnz f18986a;

    public zzhmm(zzhnz zzhnzVar) {
        m7562d(zzhnzVar);
        this.f18986a = zzhnzVar;
    }

    /* JADX INFO: renamed from: d */
    public static void m7562d(zzhnz zzhnzVar) {
        int i2 = zzhmk.f18983b[zzhnzVar.f19033d.ordinal()];
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    /* JADX INFO: renamed from: a */
    public final zzheq mo7405a() {
        zzhnz zzhnzVar = this.f18986a;
        return new zzhml(zzhnzVar.f19030a, zzhnzVar.f19034e);
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    /* JADX INFO: renamed from: b */
    public final Integer mo7406b() {
        return this.f18986a.f19035f;
    }

    /* JADX INFO: renamed from: c */
    public final zzibk m7563c() throws GeneralSecurityException {
        zzhnz zzhnzVar = this.f18986a;
        zzhtx zzhtxVar = zzhnzVar.f19034e;
        Integer num = zzhnzVar.f19035f;
        zzhtx zzhtxVar2 = zzhnzVar.f19034e;
        if (zzhtxVar.equals(zzhtx.RAW)) {
            return zzibk.m8050a(new byte[0]);
        }
        if (zzhtxVar2.equals(zzhtx.TINK)) {
            return zzhnf.m7580b(num.intValue());
        }
        if (zzhtxVar2.equals(zzhtx.LEGACY) || zzhtxVar2.equals(zzhtx.CRUNCHY)) {
            return zzhnf.m7579a(num.intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }
}
