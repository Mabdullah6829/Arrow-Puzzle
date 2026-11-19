package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhwt implements zzhny {

    /* JADX INFO: renamed from: a */
    public static final zzhwt f19306a = new zzhwt();

    /* JADX INFO: renamed from: b */
    public static final zzhns f19307b = new zzhnq(zzhmm.class, zzhev.class, new zzhnr() { // from class: com.google.android.gms.internal.ads.zzhws
        @Override // com.google.android.gms.internal.ads.zzhnr
        /* JADX INFO: renamed from: a */
        public final Object mo7428a(zzhdz zzhdzVar) {
            zzhey zzheyVar = zzhey.f18574a;
            zzhnz zzhnzVar = ((zzhmm) zzhdzVar).f18986a;
            zzhmm.m7562d(zzhnzVar);
            return new zzhyp((zzhev) zzhmb.f18972d.m7556b(zzhev.class, zzhnzVar.f19030a).mo7408b(zzhnzVar.f19032c), zzhyp.m8008b(zzhnzVar), zzhnzVar.f19034e.equals(zzhtx.LEGACY) ? new byte[]{0} : new byte[0]);
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
                zzhev zzhevVar = (zzhev) ((zzhnv) zzhnxVar).mo7426a(zzheiVarM7418f);
                zzhdz zzhdzVarM7409a = zzheiVarM7418f.m7409a();
                if (zzhdzVarM7409a instanceof zzhxv) {
                    zzibkVarM7563c = ((zzhxv) zzhdzVarM7409a).mo7980c();
                } else {
                    if (!(zzhdzVarM7409a instanceof zzhmm)) {
                        String name = zzhdzVarM7409a.getClass().getName();
                        String strValueOf = String.valueOf(zzhdzVarM7409a.mo7405a());
                        throw new GeneralSecurityException(AbstractC1456a.m2451r(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    zzibkVarM7563c = ((zzhmm) zzhdzVarM7409a).m7563c();
                }
                zzhnnVar.m7583a(zzibkVarM7563c, new zzhzm(zzhevVar, zzheiVarM7418f.f18562c));
            }
        }
        if (((zzhmp) zzhelVar.mo7414b()) != null) {
            throw null;
        }
        zzhmq zzhmqVar = zzhmt.f18989a;
        return new zzhzl(new zzhnp(zzhnnVar.f19014a));
    }

    @Override // com.google.android.gms.internal.ads.zzhny
    public final Class zza() {
        return zzhev.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhny
    public final Class zzb() {
        return zzhev.class;
    }
}
