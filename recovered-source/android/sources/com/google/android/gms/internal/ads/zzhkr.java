package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhkr {

    /* JADX INFO: renamed from: a */
    public static final zzhnl f18899a;

    /* JADX INFO: renamed from: b */
    public static final zzhni f18900b;

    /* JADX INFO: renamed from: c */
    public static final zzhmh f18901c;

    /* JADX INFO: renamed from: d */
    public static final zzhme f18902d;

    static {
        zzibk zzibkVarM7596a = zzhok.m7596a("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f18899a = new zzhnj(zzhio.class, new zzhnk() { // from class: com.google.android.gms.internal.ads.zzhkq
            @Override // com.google.android.gms.internal.ads.zzhnk
            /* JADX INFO: renamed from: a */
            public final zzhoa mo7458a(zzheq zzheqVar) {
                zzhio zzhioVar = (zzhio) zzheqVar;
                zzhnl zzhnlVar = zzhkr.f18899a;
                zzhtd zzhtdVarM7800H = zzhte.m7800H();
                zzhtdVarM7800H.m7796q("type.googleapis.com/google.crypto.tink.XAesGcmKey");
                zzhus zzhusVarM7959G = zzhut.m7959G();
                zzhuu zzhuuVarM7963E = zzhuv.m7963E();
                int i2 = zzhioVar.f18806b;
                zzhuuVarM7963E.m8326l();
                ((zzhuv) zzhuuVarM7963E.f19780t).m7966G(i2);
                zzhuv zzhuvVar = (zzhuv) zzhuuVarM7963E.m8328o();
                zzhusVarM7959G.m8326l();
                ((zzhut) zzhusVarM7959G.f19780t).m7962H(zzhuvVar);
                zzhtdVarM7800H.m7797r(((zzhut) zzhusVarM7959G.m8328o()).m8098g());
                zzhtdVarM7800H.m7798s(zzhkr.m7499a(zzhioVar.f18805a));
                return zzhoa.m7589a((zzhte) zzhtdVarM7800H.m8328o());
            }
        });
        f18900b = new zzhng(zzibkVarM7596a, new zzhnh() { // from class: com.google.android.gms.internal.ads.zzhkn
            @Override // com.google.android.gms.internal.ads.zzhnh
            /* JADX INFO: renamed from: a */
            public final zzheq mo7455a(zzhoa zzhoaVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhkr.f18899a;
                zzhte zzhteVar = zzhoaVar.f19043b;
                if (!zzhteVar.m7803D().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzhteVar.m7803D())));
                }
                try {
                    zzidl zzidlVarM7804E = zzhteVar.m7804E();
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhut zzhutVarM7958F = zzhut.m7958F(zzidlVarM7804E, zzidz.f19759c);
                    if (zzhutVarM7958F.m7960D() == 0) {
                        return zzhio.m7466b(zzhkr.m7500b(zzhteVar.m7805F()), zzhutVarM7958F.m7961E().m7965D());
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (zzifh e) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e);
                }
            }
        });
        f18901c = new zzhmf(zzhij.class, new zzhmg() { // from class: com.google.android.gms.internal.ads.zzhko
            @Override // com.google.android.gms.internal.ads.zzhmg
            /* JADX INFO: renamed from: a */
            public final zzhnz mo7456a(zzhdz zzhdzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhij zzhijVar = (zzhij) zzhdzVar;
                zzhnl zzhnlVar = zzhkr.f18899a;
                zzhuq zzhuqVarM7952H = zzhur.m7952H();
                byte[] bArrM8051b = zzhijVar.f18795b.f19616a.m8051b();
                zzidl zzidlVarM8149y = zzidl.m8149y(bArrM8051b, 0, bArrM8051b.length);
                zzhuqVarM7952H.m8326l();
                ((zzhur) zzhuqVarM7952H.f19780t).m7957J(zzidlVarM8149y);
                zzhuu zzhuuVarM7963E = zzhuv.m7963E();
                zzhio zzhioVar = zzhijVar.f18794a;
                int i2 = zzhioVar.f18806b;
                zzhuuVarM7963E.m8326l();
                ((zzhuv) zzhuuVarM7963E.f19780t).m7966G(i2);
                zzhuv zzhuvVar = (zzhuv) zzhuuVarM7963E.m8328o();
                zzhuqVarM7952H.m8326l();
                ((zzhur) zzhuqVarM7952H.f19780t).m7956I(zzhuvVar);
                return zzhnz.m7588a("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzhur) zzhuqVarM7952H.m8328o()).m8098g(), zzhta.SYMMETRIC, zzhkr.m7499a(zzhioVar.f18805a), zzhijVar.f18797d);
            }
        });
        f18902d = new zzhmc(zzibkVarM7596a, new zzhmd() { // from class: com.google.android.gms.internal.ads.zzhkp
            @Override // com.google.android.gms.internal.ads.zzhmd
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7457a(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhkr.f18899a;
                if (!zzhnzVar.f19030a.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                }
                try {
                    zzidl zzidlVar = zzhnzVar.f19032c;
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhur zzhurVarM7951G = zzhur.m7951G(zzidlVar, zzidz.f19759c);
                    if (zzhurVarM7951G.m7953D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (zzhurVarM7951G.m7955F().mo8132h() == 32) {
                        return zzhij.m7465d(zzhio.m7466b(zzhkr.m7500b(zzhnzVar.f19034e), zzhurVarM7951G.m7954E().m7965D()), new zzibm(zzibk.m8050a(zzhurVarM7951G.m7955F().m8151a())), zzhnzVar.f19035f);
                    }
                    throw new GeneralSecurityException("Only 32 byte key size is accepted");
                } catch (zzifh unused) {
                    throw new GeneralSecurityException("Parsing XAesGcmKey failed");
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static zzhtx m7499a(zzhin zzhinVar) throws GeneralSecurityException {
        if (Objects.equals(zzhinVar, zzhin.f18802b)) {
            return zzhtx.TINK;
        }
        if (Objects.equals(zzhinVar, zzhin.f18803c)) {
            return zzhtx.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhinVar.f18804a));
    }

    /* JADX INFO: renamed from: b */
    public static zzhin m7500b(zzhtx zzhtxVar) throws GeneralSecurityException {
        int iOrdinal = zzhtxVar.ordinal();
        if (iOrdinal == 1) {
            return zzhin.f18802b;
        }
        if (iOrdinal == 3) {
            return zzhin.f18803c;
        }
        int iZza = zzhtxVar.zza();
        throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iZza).length() + 34), "Unable to parse OutputPrefixType: ", iZza));
    }
}
