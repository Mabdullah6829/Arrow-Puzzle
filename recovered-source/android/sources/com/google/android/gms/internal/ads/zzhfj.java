package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhfj implements zzhny {

    /* JADX INFO: renamed from: a */
    public static final zzhfj f18586a = new zzhfj();

    /* JADX INFO: renamed from: b */
    public static final zzhns f18587b = new zzhnq(zzhmm.class, zzhdr.class, new zzhnr() { // from class: com.google.android.gms.internal.ads.zzhfi
        @Override // com.google.android.gms.internal.ads.zzhnr
        /* JADX INFO: renamed from: a */
        public final Object mo7428a(zzhdz zzhdzVar) throws GeneralSecurityException {
            byte[] bArrM8051b;
            zzhey zzheyVar = zzhey.f18574a;
            zzhnz zzhnzVar = ((zzhmm) zzhdzVar).f18986a;
            zzhmm.m7562d(zzhnzVar);
            Integer num = zzhnzVar.f19035f;
            zzhdr zzhdrVar = (zzhdr) zzhmb.f18972d.m7556b(zzhdr.class, zzhnzVar.f19030a).mo7408b(zzhnzVar.f19032c);
            zzhtx zzhtxVar = zzhnzVar.f19034e;
            int iOrdinal = zzhtxVar.ordinal();
            if (iOrdinal == 1) {
                bArrM8051b = zzhnf.m7580b(num.intValue()).m8051b();
            } else if (iOrdinal == 2) {
                bArrM8051b = zzhnf.m7579a(num.intValue()).m8051b();
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzhtxVar)));
                }
                bArrM8051b = zzhnf.m7579a(num.intValue()).m8051b();
            } else {
                bArrM8051b = zzhnf.f19007a.m8051b();
            }
            return new zzhkh(zzhdrVar, bArrM8051b);
        }
    });

    @Override // com.google.android.gms.internal.ads.zzhny
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo7429a(zzhel zzhelVar, zzhnx zzhnxVar) {
        return zzhkl.m7498a(zzhelVar, zzhnxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhny
    public final Class zza() {
        return zzhdr.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhny
    public final Class zzb() {
        return zzhdr.class;
    }
}
