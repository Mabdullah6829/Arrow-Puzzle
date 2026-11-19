package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhij extends zzhfg {

    /* JADX INFO: renamed from: a */
    public final zzhio f18794a;

    /* JADX INFO: renamed from: b */
    public final zzibm f18795b;

    /* JADX INFO: renamed from: c */
    public final zzibk f18796c;

    /* JADX INFO: renamed from: d */
    public final Integer f18797d;

    public zzhij(zzhio zzhioVar, zzibm zzibmVar, zzibk zzibkVar, Integer num) {
        this.f18794a = zzhioVar;
        this.f18795b = zzibmVar;
        this.f18796c = zzibkVar;
        this.f18797d = num;
    }

    /* JADX INFO: renamed from: d */
    public static zzhij m7465d(zzhio zzhioVar, zzibm zzibmVar, Integer num) throws GeneralSecurityException {
        zzibk zzibkVarM7580b;
        zzibk zzibkVar = zzibmVar.f19616a;
        zzhin zzhinVar = zzhioVar.f18805a;
        zzhin zzhinVar2 = zzhin.f18803c;
        if (zzhinVar != zzhinVar2 && num == null) {
            String str = zzhinVar.f18804a;
            throw new GeneralSecurityException(AbstractC1456a.m2450q(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (zzhinVar == zzhinVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzibkVar.f19614a.length != 32) {
            int length = zzibkVar.f19614a.length;
            throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(length).length() + 68), "XAesGcmKey key must be constructed with key of length 32 bytes, not ", length));
        }
        if (zzhinVar == zzhinVar2) {
            zzibkVarM7580b = zzhnf.f19007a;
        } else {
            if (zzhinVar != zzhin.f18802b) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhinVar.f18804a));
            }
            zzibkVarM7580b = zzhnf.m7580b(num.intValue());
        }
        return new zzhij(zzhioVar, zzibmVar, zzibkVarM7580b, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhfg, com.google.android.gms.internal.ads.zzhdz
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzheq mo7405a() {
        return this.f18794a;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    /* JADX INFO: renamed from: b */
    public final Integer mo7406b() {
        return this.f18797d;
    }

    @Override // com.google.android.gms.internal.ads.zzhfg
    /* JADX INFO: renamed from: c */
    public final zzibk mo7427c() {
        return this.f18796c;
    }
}
