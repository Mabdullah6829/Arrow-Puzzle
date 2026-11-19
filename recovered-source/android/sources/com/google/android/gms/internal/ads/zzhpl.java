package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhpl implements zzhny {

    /* JADX INFO: renamed from: a */
    public static final zzhpl f19125a = new zzhpl();

    /* JADX INFO: renamed from: b */
    public static final zzhns f19126b = new zzhnq(zzhmm.class, zzhep.class, new zzhnr() { // from class: com.google.android.gms.internal.ads.zzhpk
        @Override // com.google.android.gms.internal.ads.zzhnr
        /* JADX INFO: renamed from: a */
        public final Object mo7428a(zzhdz zzhdzVar) throws GeneralSecurityException {
            zzhey zzheyVar = zzhey.f18574a;
            zzhnz zzhnzVar = ((zzhmm) zzhdzVar).f18986a;
            zzhmm.m7562d(zzhnzVar);
            Integer num = zzhnzVar.f19035f;
            int iOrdinal = zzhnzVar.f19034e.ordinal();
            if (iOrdinal == 1) {
                zzhnf.m7580b(num.intValue()).m8051b();
            } else if (iOrdinal == 2) {
                zzhnf.m7579a(num.intValue()).m8051b();
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
                zzhnf.m7579a(num.intValue()).m8051b();
            } else {
                zzhnf.f19007a.m8051b();
            }
            return new zzhqg();
        }
    });

    @Override // com.google.android.gms.internal.ads.zzhny
    /* JADX INFO: renamed from: a */
    public final Object mo7429a(zzhel zzhelVar, zzhnx zzhnxVar) throws GeneralSecurityException {
        zzibk zzibkVarM7563c;
        zzhnn zzhnnVar = new zzhnn();
        for (int i2 = 0; i2 < zzhelVar.mo7416d(); i2++) {
            zzhei zzheiVarM7418f = ((zzhek) zzhelVar).m7418f(i2);
            if (zzheiVarM7418f.f18561b.equals(zzheb.f18547b)) {
                zzhdz zzhdzVarM7409a = zzheiVarM7418f.m7409a();
                if (zzhdzVarM7409a instanceof zzhpi) {
                    zzibkVarM7563c = ((zzhpi) zzhdzVarM7409a).mo7600c();
                } else {
                    if (!(zzhdzVarM7409a instanceof zzhmm)) {
                        String name = zzhdzVarM7409a.getClass().getName();
                        String strValueOf = String.valueOf(zzhdzVarM7409a.mo7405a());
                        throw new GeneralSecurityException(AbstractC1456a.m2451r(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    zzibkVarM7563c = ((zzhmm) zzhdzVarM7409a).m7563c();
                }
                zzhnnVar.m7583a(zzibkVarM7563c, new zzhqj());
            }
        }
        if (((zzhmp) zzhelVar.mo7414b()) != null) {
            throw null;
        }
        zzhmq zzhmqVar = zzhmt.f18989a;
        zzhek zzhekVar = (zzhek) zzhelVar;
        zzhekVar.m7417e();
        return new zzhqk();
    }

    @Override // com.google.android.gms.internal.ads.zzhny
    public final Class zza() {
        return zzhep.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhny
    public final Class zzb() {
        return zzhep.class;
    }
}
