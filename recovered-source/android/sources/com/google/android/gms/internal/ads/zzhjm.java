package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhjm {

    /* JADX INFO: renamed from: a */
    public static final zzhnl f18848a;

    /* JADX INFO: renamed from: b */
    public static final zzhni f18849b;

    /* JADX INFO: renamed from: c */
    public static final zzhmh f18850c;

    /* JADX INFO: renamed from: d */
    public static final zzhme f18851d;

    static {
        zzibk zzibkVarM7596a = zzhok.m7596a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f18848a = new zzhnj(zzhgk.class, new zzhnk() { // from class: com.google.android.gms.internal.ads.zzhjl
            @Override // com.google.android.gms.internal.ads.zzhnk
            /* JADX INFO: renamed from: a */
            public final zzhoa mo7458a(zzheq zzheqVar) {
                zzhgk zzhgkVar = (zzhgk) zzheqVar;
                zzhnl zzhnlVar = zzhjm.f18848a;
                zzhtd zzhtdVarM7800H = zzhte.m7800H();
                zzhtdVarM7800H.m7796q("type.googleapis.com/google.crypto.tink.AesGcmKey");
                zzhrs zzhrsVarM7692G = zzhrt.m7692G();
                int i2 = zzhgkVar.f18673a;
                zzhrsVarM7692G.m8326l();
                ((zzhrt) zzhrsVarM7692G.f19780t).m7695H(i2);
                zzhtdVarM7800H.m7797r(((zzhrt) zzhrsVarM7692G.m8328o()).m8098g());
                zzhtdVarM7800H.m7798s(zzhjm.m7478a(zzhgkVar.f18674b));
                return zzhoa.m7589a((zzhte) zzhtdVarM7800H.m8328o());
            }
        });
        f18849b = new zzhng(zzibkVarM7596a, new zzhnh() { // from class: com.google.android.gms.internal.ads.zzhji
            @Override // com.google.android.gms.internal.ads.zzhnh
            /* JADX INFO: renamed from: a */
            public final zzheq mo7455a(zzhoa zzhoaVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhjm.f18848a;
                zzhte zzhteVar = zzhoaVar.f19043b;
                if (!zzhteVar.m7803D().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzhteVar.m7803D())));
                }
                try {
                    zzidl zzidlVarM7804E = zzhteVar.m7804E();
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhrt zzhrtVarM7691F = zzhrt.m7691F(zzidlVarM7804E, zzidz.f19759c);
                    if (zzhrtVarM7691F.m7694E() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    zzhgi zzhgiVar = new zzhgi(0);
                    zzhgiVar.m7446a(zzhrtVarM7691F.m7693D());
                    zzhgiVar.m7447b();
                    zzhgiVar.m7448c();
                    zzhgiVar.f18668d = zzhjm.m7479b(zzhteVar.m7805F());
                    return zzhgiVar.m7449d();
                } catch (zzifh e) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
                }
            }
        });
        f18850c = new zzhmf(zzhgd.class, new zzhmg() { // from class: com.google.android.gms.internal.ads.zzhjj
            @Override // com.google.android.gms.internal.ads.zzhmg
            /* JADX INFO: renamed from: a */
            public final zzhnz mo7456a(zzhdz zzhdzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhgd zzhgdVar = (zzhgd) zzhdzVar;
                zzhnl zzhnlVar = zzhjm.f18848a;
                zzhrq zzhrqVarM7686G = zzhrr.m7686G();
                byte[] bArrM8051b = zzhgdVar.f18654b.f19616a.m8051b();
                zzidl zzidlVarM8149y = zzidl.m8149y(bArrM8051b, 0, bArrM8051b.length);
                zzhrqVarM7686G.m8326l();
                ((zzhrr) zzhrqVarM7686G.f19780t).m7690I(zzidlVarM8149y);
                return zzhnz.m7588a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzhrr) zzhrqVarM7686G.m8328o()).m8098g(), zzhta.SYMMETRIC, zzhjm.m7478a(zzhgdVar.f18653a.f18674b), zzhgdVar.f18656d);
            }
        });
        f18851d = new zzhmc(zzibkVarM7596a, new zzhmd() { // from class: com.google.android.gms.internal.ads.zzhjk
            @Override // com.google.android.gms.internal.ads.zzhmd
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7457a(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhjm.f18848a;
                if (!zzhnzVar.f19030a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    zzidl zzidlVar = zzhnzVar.f19032c;
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhrr zzhrrVarM7685F = zzhrr.m7685F(zzidlVar, zzidz.f19759c);
                    if (zzhrrVarM7685F.m7688D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzhgi zzhgiVar = new zzhgi(0);
                    zzhgiVar.m7446a(zzhrrVarM7685F.m7689E().mo8132h());
                    zzhgiVar.m7447b();
                    zzhgiVar.m7448c();
                    zzhgiVar.f18668d = zzhjm.m7479b(zzhnzVar.f19034e);
                    zzhgk zzhgkVarM7449d = zzhgiVar.m7449d();
                    zzhgc zzhgcVar = new zzhgc(0);
                    zzhgcVar.f18650a = zzhgkVarM7449d;
                    zzhgcVar.f18651b = new zzibm(zzibk.m8050a(zzhrrVarM7685F.m7689E().m8151a()));
                    zzhgcVar.f18652c = zzhnzVar.f19035f;
                    return zzhgcVar.m7445a();
                } catch (zzifh unused) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static zzhtx m7478a(zzhgj zzhgjVar) throws GeneralSecurityException {
        if (zzhgj.f18669b.equals(zzhgjVar)) {
            return zzhtx.TINK;
        }
        if (zzhgj.f18670c.equals(zzhgjVar)) {
            return zzhtx.CRUNCHY;
        }
        if (zzhgj.f18671d.equals(zzhgjVar)) {
            return zzhtx.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhgjVar)));
    }

    /* JADX INFO: renamed from: b */
    public static zzhgj m7479b(zzhtx zzhtxVar) throws GeneralSecurityException {
        int iOrdinal = zzhtxVar.ordinal();
        if (iOrdinal == 1) {
            return zzhgj.f18669b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhgj.f18671d;
            }
            if (iOrdinal != 4) {
                int iZza = zzhtxVar.zza();
                throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iZza).length() + 34), "Unable to parse OutputPrefixType: ", iZza));
            }
        }
        return zzhgj.f18670c;
    }
}
