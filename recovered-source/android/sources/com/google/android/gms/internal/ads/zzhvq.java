package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhvq extends zzhxu {

    /* JADX INFO: renamed from: a */
    public final zzhvw f19251a;

    /* JADX INFO: renamed from: b */
    public final zzibm f19252b;

    public zzhvq(zzhvw zzhvwVar, zzibm zzibmVar) {
        this.f19251a = zzhvwVar;
        this.f19252b = zzibmVar;
    }

    /* JADX INFO: renamed from: d */
    public static zzhvq m7981d(zzhvw zzhvwVar, zzibm zzibmVar) throws GeneralSecurityException {
        zzibk zzibkVar = zzibmVar.f19616a;
        if (zzibkVar.f19614a.length != 32) {
            int length = zzibkVar.f19614a.length;
            throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(length).length() + 65), "Ed25519 key must be constructed with key of length 32 bytes, not ", length));
        }
        byte[] bArrM8051b = zzhvwVar.f19264b.m8051b();
        zzhey zzheyVar = zzhey.f18574a;
        if (Arrays.equals(bArrM8051b, zzhlp.m7516a(zzhlp.m7517b(zzibkVar.m8051b())))) {
            return new zzhvq(zzhvwVar, zzibmVar);
        }
        throw new GeneralSecurityException("Ed25519 keys mismatch");
    }

    @Override // com.google.android.gms.internal.ads.zzhxu, com.google.android.gms.internal.ads.zzhdz
    /* JADX INFO: renamed from: a */
    public final zzheq mo7405a() {
        return this.f19251a.f19263a;
    }

    @Override // com.google.android.gms.internal.ads.zzhxu
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzhxv mo7978c() {
        return this.f19251a;
    }
}
