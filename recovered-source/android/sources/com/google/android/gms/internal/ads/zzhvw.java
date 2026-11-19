package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhvw extends zzhxv {

    /* JADX INFO: renamed from: a */
    public final zzhvp f19263a;

    /* JADX INFO: renamed from: b */
    public final zzibk f19264b;

    /* JADX INFO: renamed from: c */
    public final zzibk f19265c;

    /* JADX INFO: renamed from: d */
    public final Integer f19266d;

    public zzhvw(zzhvp zzhvpVar, zzibk zzibkVar, zzibk zzibkVar2, Integer num) {
        this.f19263a = zzhvpVar;
        this.f19264b = zzibkVar;
        this.f19265c = zzibkVar2;
        this.f19266d = num;
    }

    /* JADX INFO: renamed from: d */
    public static zzhvw m7982d(zzhvo zzhvoVar, zzibk zzibkVar, Integer num) throws GeneralSecurityException {
        zzibk zzibkVarM7579a;
        byte[] bArr = zzibkVar.f19614a;
        zzhvp zzhvpVar = new zzhvp(zzhvoVar);
        zzhvo zzhvoVar2 = zzhvo.f19248e;
        if (!zzhvoVar.equals(zzhvoVar2) && num == null) {
            String str = zzhvoVar.f19249a;
            throw new GeneralSecurityException(AbstractC1456a.m2450q(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (zzhvoVar.equals(zzhvoVar2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bArr.length != 32) {
            int length = bArr.length;
            throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(length).length() + 65), "Ed25519 key must be constructed with key of length 32 bytes, not ", length));
        }
        zzhvo zzhvoVar3 = zzhvpVar.f19250a;
        if (zzhvoVar3 == zzhvoVar2) {
            zzibkVarM7579a = zzhnf.f19007a;
        } else if (zzhvoVar3 == zzhvo.f19246c || zzhvoVar3 == zzhvo.f19247d) {
            zzibkVarM7579a = zzhnf.m7579a(num.intValue());
        } else {
            if (zzhvoVar3 != zzhvo.f19245b) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhvoVar3.f19249a));
            }
            zzibkVarM7579a = zzhnf.m7580b(num.intValue());
        }
        return new zzhvw(zzhvpVar, zzibkVar, zzibkVarM7579a, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhxv, com.google.android.gms.internal.ads.zzhdz
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzheq mo7405a() {
        return this.f19263a;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    /* JADX INFO: renamed from: b */
    public final Integer mo7406b() {
        return this.f19266d;
    }

    @Override // com.google.android.gms.internal.ads.zzhxv
    /* JADX INFO: renamed from: c */
    public final zzibk mo7980c() {
        return this.f19265c;
    }
}
