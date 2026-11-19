package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhla implements zzhdr {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f18915a = new zzhky();

    /* JADX INFO: renamed from: b */
    public static zzhjo m7503b(zzhgm zzhgmVar) {
        zzhkz zzhkzVar = zzhkz.f18914a;
        byte[] bArr = zzhjo.f18852d;
        if (!zzhjo.m7480b(zzhkzVar.zza())) {
            throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
        }
        zzibm zzibmVar = zzhgmVar.f18679b;
        zzhey zzheyVar = zzhey.f18574a;
        return new zzhjo(zzibmVar.f19616a.m8051b(), zzhgmVar.f18680c.m8051b(), zzhkzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    /* JADX INFO: renamed from: a */
    public final byte[] mo7400a(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
