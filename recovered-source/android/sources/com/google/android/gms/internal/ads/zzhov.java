package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhov implements zzhny {

    /* JADX INFO: renamed from: a */
    public static final zzhov f19083a = new zzhov();

    @Override // com.google.android.gms.internal.ads.zzhny
    /* JADX INFO: renamed from: a */
    public final Object mo7429a(zzhel zzhelVar, zzhnx zzhnxVar) throws GeneralSecurityException {
        zzibk zzibkVarM7563c;
        zzhei zzheiVarM7417e = ((zzhek) zzhelVar).m7417e();
        zzhnn zzhnnVar = new zzhnn();
        for (int i2 = 0; i2 < zzhelVar.mo7416d(); i2++) {
            zzhei zzheiVarM7418f = ((zzhek) zzhelVar).m7418f(i2);
            if (zzheiVarM7418f.f18561b.equals(zzheb.f18547b)) {
                zzhou zzhouVar = (zzhou) ((zzhnv) zzhnxVar).mo7426a(zzheiVarM7418f);
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
                zzhnnVar.m7583a(zzibkVarM7563c, zzhouVar);
            }
        }
        return new zzhqh();
    }

    @Override // com.google.android.gms.internal.ads.zzhny
    public final Class zza() {
        return zzhou.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhny
    public final Class zzb() {
        return zzhou.class;
    }
}
