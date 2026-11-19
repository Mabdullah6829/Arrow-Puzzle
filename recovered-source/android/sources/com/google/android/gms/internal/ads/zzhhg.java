package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhhg {

    /* JADX INFO: renamed from: a */
    public static final zzhmj f18722a;

    /* JADX INFO: renamed from: b */
    public static final zzhma f18723b;

    /* JADX INFO: renamed from: c */
    public static final zzhns f18724c;

    static {
        zzhtu.m7849H();
        f18722a = new zzhmj("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzhdr.class, zzhta.SYMMETRIC);
        f18723b = new zzhma() { // from class: com.google.android.gms.internal.ads.zzhhf
            @Override // com.google.android.gms.internal.ads.zzhma
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ zzhdz mo7431a(zzheq zzheqVar, Integer num) {
                zzhmj zzhmjVar = zzhhg.f18722a;
                return zzhhp.m7461d((zzhht) zzheqVar, num);
            }
        };
        f18724c = new zzhnq(zzhhp.class, zzhdr.class, new zzhnr() { // from class: com.google.android.gms.internal.ads.zzhhe
            @Override // com.google.android.gms.internal.ads.zzhnr
            /* JADX INFO: renamed from: a */
            public final Object mo7428a(zzhdz zzhdzVar) throws GeneralSecurityException {
                zzhhp zzhhpVar = (zzhhp) zzhdzVar;
                zzhmj zzhmjVar = zzhhg.f18722a;
                zzhht zzhhtVar = zzhhpVar.f18741a;
                String str = zzhhtVar.f18759b;
                zzhfh zzhfhVar = zzhhtVar.f18761d;
                zzhdr zzhdrVarZzb = zzheo.m7420a(str).zzb();
                byte[] bArr = zzhhd.f18716c;
                try {
                    byte[] bArrM8099h = ((zzhoa) zzhne.f19005b.m7578h(zzhfhVar)).f19043b.m8099h();
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    return new zzhkh(new zzhhd(zzhte.m7799G(bArrM8099h, zzidz.f19759c), zzhdrVarZzb), zzhhpVar.f18742b.m8051b());
                } catch (zzifh e) {
                    throw new GeneralSecurityException(e);
                }
            }
        });
    }
}
