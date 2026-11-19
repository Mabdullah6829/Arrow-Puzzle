package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhkl {
    /* JADX INFO: renamed from: a */
    public static zzhdr m7498a(zzhel zzhelVar, zzhnx zzhnxVar) throws GeneralSecurityException {
        zzibk zzibkVarM7563c;
        zzhnn zzhnnVar = new zzhnn();
        for (int i2 = 0; i2 < zzhelVar.mo7416d(); i2++) {
            zzhei zzheiVarM7418f = ((zzhek) zzhelVar).m7418f(i2);
            if (zzheiVarM7418f.f18561b.equals(zzheb.f18547b)) {
                zzhdz zzhdzVarM7409a = zzheiVarM7418f.m7409a();
                if (zzhdzVarM7409a instanceof zzhfg) {
                    zzibkVarM7563c = ((zzhfg) zzhdzVarM7409a).mo7427c();
                } else {
                    if (!(zzhdzVarM7409a instanceof zzhmm)) {
                        String name = zzhdzVarM7409a.getClass().getName();
                        String strValueOf = String.valueOf(zzhdzVarM7409a.mo7405a());
                        throw new GeneralSecurityException(AbstractC1456a.m2451r(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    zzibkVarM7563c = ((zzhmm) zzhdzVarM7409a).m7563c();
                }
                zzhnnVar.m7583a(zzibkVarM7563c, new zzhkj((zzhdr) zzhnxVar.mo7426a(zzheiVarM7418f), zzheiVarM7418f.f18562c));
            }
        }
        if (((zzhmp) zzhelVar.mo7414b()) != null) {
            throw null;
        }
        zzhmq zzhmqVar = zzhmt.f18989a;
        zzhek zzhekVar = (zzhek) zzhelVar;
        zzhekVar.m7417e();
        return new zzhkk(new zzhnp(zzhnnVar.f19014a));
    }
}
