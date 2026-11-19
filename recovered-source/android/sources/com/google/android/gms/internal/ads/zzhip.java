package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhip extends zzhfg {

    /* JADX INFO: renamed from: a */
    public final zzhiv f18807a;

    /* JADX INFO: renamed from: b */
    public final zzibm f18808b;

    /* JADX INFO: renamed from: c */
    public final zzibk f18809c;

    /* JADX INFO: renamed from: d */
    public final Integer f18810d;

    public zzhip(zzhiv zzhivVar, zzibm zzibmVar, zzibk zzibkVar, Integer num) {
        this.f18807a = zzhivVar;
        this.f18808b = zzibmVar;
        this.f18809c = zzibkVar;
        this.f18810d = num;
    }

    /* JADX INFO: renamed from: d */
    public static zzhip m7467d(zzhiu zzhiuVar, zzibm zzibmVar, Integer num) throws GeneralSecurityException {
        zzibk zzibkVarM7580b;
        zzibk zzibkVar = zzibmVar.f19616a;
        zzhiu zzhiuVar2 = zzhiu.f18820d;
        if (zzhiuVar != zzhiuVar2 && num == null) {
            String str = zzhiuVar.f18821a;
            throw new GeneralSecurityException(AbstractC1456a.m2450q(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (zzhiuVar == zzhiuVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzibkVar.f19614a.length != 32) {
            int length = zzibkVar.f19614a.length;
            throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(length).length() + 75), "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", length));
        }
        zzhiv zzhivVar = new zzhiv(zzhiuVar);
        zzhiu zzhiuVar3 = zzhivVar.f18822a;
        if (zzhiuVar3 == zzhiuVar2) {
            zzibkVarM7580b = zzhnf.f19007a;
        } else if (zzhiuVar3 == zzhiu.f18819c) {
            zzibkVarM7580b = zzhnf.m7579a(num.intValue());
        } else {
            if (zzhiuVar3 != zzhiu.f18818b) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhiuVar3.f18821a));
            }
            zzibkVarM7580b = zzhnf.m7580b(num.intValue());
        }
        return new zzhip(zzhivVar, zzibmVar, zzibkVarM7580b, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhfg, com.google.android.gms.internal.ads.zzhdz
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzheq mo7405a() {
        return this.f18807a;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    /* JADX INFO: renamed from: b */
    public final Integer mo7406b() {
        return this.f18810d;
    }

    @Override // com.google.android.gms.internal.ads.zzhfg
    /* JADX INFO: renamed from: c */
    public final zzibk mo7427c() {
        return this.f18809c;
    }
}
