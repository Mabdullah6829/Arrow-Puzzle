package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhjf {

    /* JADX INFO: renamed from: a */
    public static final zzhnl f18839a;

    /* JADX INFO: renamed from: b */
    public static final zzhni f18840b;

    /* JADX INFO: renamed from: c */
    public static final zzhmh f18841c;

    /* JADX INFO: renamed from: d */
    public static final zzhme f18842d;

    static {
        zzibk zzibkVarM7596a = zzhok.m7596a("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f18839a = new zzhnj(zzhgb.class, new zzhnk() { // from class: com.google.android.gms.internal.ads.zzhje
            @Override // com.google.android.gms.internal.ads.zzhnk
            /* JADX INFO: renamed from: a */
            public final zzhoa mo7458a(zzheq zzheqVar) {
                zzhgb zzhgbVar = (zzhgb) zzheqVar;
                zzhnl zzhnlVar = zzhjf.f18839a;
                zzhtd zzhtdVarM7800H = zzhte.m7800H();
                zzhtdVarM7800H.m7796q("type.googleapis.com/google.crypto.tink.AesEaxKey");
                zzhrm zzhrmVarM7676G = zzhrn.m7676G();
                zzhro zzhroVarM7681E = zzhrp.m7681E();
                int i2 = zzhgbVar.f18648b;
                zzhroVarM7681E.m8326l();
                ((zzhrp) zzhroVarM7681E.f19780t).m7684G(i2);
                zzhrp zzhrpVar = (zzhrp) zzhroVarM7681E.m8328o();
                zzhrmVarM7676G.m8326l();
                ((zzhrn) zzhrmVarM7676G.f19780t).m7679H(zzhrpVar);
                int i3 = zzhgbVar.f18647a;
                zzhrmVarM7676G.m8326l();
                ((zzhrn) zzhrmVarM7676G.f19780t).m7680I(i3);
                zzhtdVarM7800H.m7797r(((zzhrn) zzhrmVarM7676G.m8328o()).m8098g());
                zzhtdVarM7800H.m7798s(zzhjf.m7476a(zzhgbVar.f18649c));
                return zzhoa.m7589a((zzhte) zzhtdVarM7800H.m8328o());
            }
        });
        f18840b = new zzhng(zzibkVarM7596a, new zzhnh() { // from class: com.google.android.gms.internal.ads.zzhjb
            @Override // com.google.android.gms.internal.ads.zzhnh
            /* JADX INFO: renamed from: a */
            public final zzheq mo7455a(zzhoa zzhoaVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhjf.f18839a;
                zzhte zzhteVar = zzhoaVar.f19043b;
                if (!zzhteVar.m7803D().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzhteVar.m7803D())));
                }
                try {
                    zzidl zzidlVarM7804E = zzhteVar.m7804E();
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhrn zzhrnVarM7675F = zzhrn.m7675F(zzidlVarM7804E, zzidz.f19759c);
                    zzhfz zzhfzVar = new zzhfz(0);
                    zzhfzVar.m7438a(zzhrnVarM7675F.m7678E());
                    zzhfzVar.m7439b(zzhrnVarM7675F.m7677D().m7683D());
                    zzhfzVar.m7440c();
                    zzhfzVar.f18642d = zzhjf.m7477b(zzhteVar.m7805F());
                    return zzhfzVar.m7441d();
                } catch (zzifh e) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
                }
            }
        });
        f18841c = new zzhmf(zzhfv.class, new zzhmg() { // from class: com.google.android.gms.internal.ads.zzhjc
            @Override // com.google.android.gms.internal.ads.zzhmg
            /* JADX INFO: renamed from: a */
            public final zzhnz mo7456a(zzhdz zzhdzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhfv zzhfvVar = (zzhfv) zzhdzVar;
                zzhnl zzhnlVar = zzhjf.f18839a;
                zzhrk zzhrkVarM7668H = zzhrl.m7668H();
                zzhgb zzhgbVar = zzhfvVar.f18630a;
                zzhro zzhroVarM7681E = zzhrp.m7681E();
                int i2 = zzhgbVar.f18648b;
                zzhroVarM7681E.m8326l();
                ((zzhrp) zzhroVarM7681E.f19780t).m7684G(i2);
                zzhrp zzhrpVar = (zzhrp) zzhroVarM7681E.m8328o();
                zzhrkVarM7668H.m8326l();
                ((zzhrl) zzhrkVarM7668H.f19780t).m7673J(zzhrpVar);
                byte[] bArrM8051b = zzhfvVar.f18631b.f19616a.m8051b();
                zzidl zzidlVarM8149y = zzidl.m8149y(bArrM8051b, 0, bArrM8051b.length);
                zzhrkVarM7668H.m8326l();
                ((zzhrl) zzhrkVarM7668H.f19780t).m7674K(zzidlVarM8149y);
                return zzhnz.m7588a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzhrl) zzhrkVarM7668H.m8328o()).m8098g(), zzhta.SYMMETRIC, zzhjf.m7476a(zzhfvVar.f18630a.f18649c), zzhfvVar.f18633d);
            }
        });
        f18842d = new zzhmc(zzibkVarM7596a, new zzhmd() { // from class: com.google.android.gms.internal.ads.zzhjd
            @Override // com.google.android.gms.internal.ads.zzhmd
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7457a(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhjf.f18839a;
                if (!zzhnzVar.f19030a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    zzidl zzidlVar = zzhnzVar.f19032c;
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhrl zzhrlVarM7667G = zzhrl.m7667G(zzidlVar, zzidz.f19759c);
                    if (zzhrlVarM7667G.m7670D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzhfz zzhfzVar = new zzhfz(0);
                    zzhfzVar.m7438a(zzhrlVarM7667G.m7672F().mo8132h());
                    zzhfzVar.m7439b(zzhrlVarM7667G.m7671E().m7683D());
                    zzhfzVar.m7440c();
                    zzhfzVar.f18642d = zzhjf.m7477b(zzhnzVar.f19034e);
                    zzhgb zzhgbVarM7441d = zzhfzVar.m7441d();
                    zzhfu zzhfuVar = new zzhfu(0);
                    zzhfuVar.f18627a = zzhgbVarM7441d;
                    zzhfuVar.f18628b = new zzibm(zzibk.m8050a(zzhrlVarM7667G.m7672F().m8151a()));
                    zzhfuVar.f18629c = zzhnzVar.f19035f;
                    return zzhfuVar.m7437a();
                } catch (zzifh unused) {
                    throw new GeneralSecurityException("Parsing AesEaxKey failed");
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static zzhtx m7476a(zzhga zzhgaVar) throws GeneralSecurityException {
        if (zzhga.f18643b.equals(zzhgaVar)) {
            return zzhtx.TINK;
        }
        if (zzhga.f18644c.equals(zzhgaVar)) {
            return zzhtx.CRUNCHY;
        }
        if (zzhga.f18645d.equals(zzhgaVar)) {
            return zzhtx.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhgaVar)));
    }

    /* JADX INFO: renamed from: b */
    public static zzhga m7477b(zzhtx zzhtxVar) throws GeneralSecurityException {
        int iOrdinal = zzhtxVar.ordinal();
        if (iOrdinal == 1) {
            return zzhga.f18643b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhga.f18645d;
            }
            if (iOrdinal != 4) {
                int iZza = zzhtxVar.zza();
                throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iZza).length() + 34), "Unable to parse OutputPrefixType: ", iZza));
            }
        }
        return zzhga.f18644c;
    }
}
