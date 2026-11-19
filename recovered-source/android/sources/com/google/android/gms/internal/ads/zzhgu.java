package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhgu extends zzhfg {

    /* JADX INFO: renamed from: a */
    public final zzhgz f18697a;

    /* JADX INFO: renamed from: b */
    public final zzibm f18698b;

    /* JADX INFO: renamed from: c */
    public final zzibk f18699c;

    /* JADX INFO: renamed from: d */
    public final Integer f18700d;

    public zzhgu(zzhgz zzhgzVar, zzibm zzibmVar, zzibk zzibkVar, Integer num) {
        this.f18697a = zzhgzVar;
        this.f18698b = zzibmVar;
        this.f18699c = zzibkVar;
        this.f18700d = num;
    }

    /* JADX INFO: renamed from: d */
    public static zzhgu m7453d(zzhgy zzhgyVar, zzibm zzibmVar, Integer num) throws GeneralSecurityException {
        zzibk zzibkVarM7580b;
        zzibk zzibkVar = zzibmVar.f19616a;
        zzhgy zzhgyVar2 = zzhgy.f18708d;
        if (zzhgyVar != zzhgyVar2 && num == null) {
            String str = zzhgyVar.f18709a;
            throw new GeneralSecurityException(AbstractC1456a.m2450q(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (zzhgyVar == zzhgyVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzibkVar.f19614a.length != 32) {
            int length = zzibkVar.f19614a.length;
            throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(length).length() + 74), "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", length));
        }
        zzhgz zzhgzVar = new zzhgz(zzhgyVar);
        zzhgy zzhgyVar3 = zzhgzVar.f18710a;
        if (zzhgyVar3 == zzhgyVar2) {
            zzibkVarM7580b = zzhnf.f19007a;
        } else if (zzhgyVar3 == zzhgy.f18707c) {
            zzibkVarM7580b = zzhnf.m7579a(num.intValue());
        } else {
            if (zzhgyVar3 != zzhgy.f18706b) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhgyVar3.f18709a));
            }
            zzibkVarM7580b = zzhnf.m7580b(num.intValue());
        }
        return new zzhgu(zzhgzVar, zzibmVar, zzibkVarM7580b, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhfg, com.google.android.gms.internal.ads.zzhdz
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzheq mo7405a() {
        return this.f18697a;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    /* JADX INFO: renamed from: b */
    public final Integer mo7406b() {
        return this.f18700d;
    }

    @Override // com.google.android.gms.internal.ads.zzhfg
    /* JADX INFO: renamed from: c */
    public final zzibk mo7427c() {
        return this.f18699c;
    }
}
