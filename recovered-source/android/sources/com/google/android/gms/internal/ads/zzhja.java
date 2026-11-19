package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhja {

    /* JADX INFO: renamed from: a */
    public static final zzhnl f18831a;

    /* JADX INFO: renamed from: b */
    public static final zzhni f18832b;

    /* JADX INFO: renamed from: c */
    public static final zzhmh f18833c;

    /* JADX INFO: renamed from: d */
    public static final zzhme f18834d;

    static {
        zzibk zzibkVarM7596a = zzhok.m7596a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f18831a = new zzhnj(zzhft.class, new zzhnk() { // from class: com.google.android.gms.internal.ads.zzhiz
            @Override // com.google.android.gms.internal.ads.zzhnk
            /* JADX INFO: renamed from: a */
            public final zzhoa mo7458a(zzheq zzheqVar) throws GeneralSecurityException {
                zzhft zzhftVar = (zzhft) zzheqVar;
                zzhnl zzhnlVar = zzhja.f18831a;
                zzhtd zzhtdVarM7800H = zzhte.m7800H();
                zzhtdVarM7800H.m7796q("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                zzhrc zzhrcVarM7645G = zzhrd.m7645G();
                zzhrg zzhrgVarM7657F = zzhrh.m7657F();
                zzhri zzhriVarM7663E = zzhrj.m7663E();
                int i2 = zzhftVar.f18623c;
                zzhriVarM7663E.m8326l();
                ((zzhrj) zzhriVarM7663E.f19780t).m7666G(i2);
                zzhrj zzhrjVar = (zzhrj) zzhriVarM7663E.m8328o();
                zzhrgVarM7657F.m8326l();
                ((zzhrh) zzhrgVarM7657F.f19780t).m7661H(zzhrjVar);
                int i3 = zzhftVar.f18621a;
                zzhrgVarM7657F.m8326l();
                ((zzhrh) zzhrgVarM7657F.f19780t).m7662I(i3);
                zzhrh zzhrhVar = (zzhrh) zzhrgVarM7657F.m8328o();
                zzhrcVarM7645G.m8326l();
                ((zzhrd) zzhrcVarM7645G.f19780t).m7648H(zzhrhVar);
                zzhsv zzhsvVarM7775H = zzhsw.m7775H();
                zzhsy zzhsyVarM7475d = zzhja.m7475d(zzhftVar);
                zzhsvVarM7775H.m8326l();
                ((zzhsw) zzhsvVarM7775H.f19780t).m7780J(zzhsyVarM7475d);
                int i4 = zzhftVar.f18622b;
                zzhsvVarM7775H.m8326l();
                ((zzhsw) zzhsvVarM7775H.f19780t).m7781K(i4);
                zzhsw zzhswVar = (zzhsw) zzhsvVarM7775H.m8328o();
                zzhrcVarM7645G.m8326l();
                ((zzhrd) zzhrcVarM7645G.f19780t).m7649I(zzhswVar);
                zzhtdVarM7800H.m7797r(((zzhrd) zzhrcVarM7645G.m8328o()).m8098g());
                zzhtdVarM7800H.m7798s(zzhja.m7472a(zzhftVar.f18625e));
                return zzhoa.m7589a((zzhte) zzhtdVarM7800H.m8328o());
            }
        });
        f18832b = new zzhng(zzibkVarM7596a, new zzhnh() { // from class: com.google.android.gms.internal.ads.zzhiw
            @Override // com.google.android.gms.internal.ads.zzhnh
            /* JADX INFO: renamed from: a */
            public final zzheq mo7455a(zzhoa zzhoaVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhja.f18831a;
                zzhte zzhteVar = zzhoaVar.f19043b;
                if (!zzhteVar.m7803D().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhteVar.m7803D())));
                }
                try {
                    zzidl zzidlVarM7804E = zzhteVar.m7804E();
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhrd zzhrdVarM7644F = zzhrd.m7644F(zzidlVarM7804E, zzidz.f19759c);
                    if (zzhrdVarM7644F.m7647E().m7779F() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzhfq zzhfqVar = new zzhfq(0);
                    zzhfqVar.m7432a(zzhrdVarM7644F.m7646D().m7660E());
                    zzhfqVar.m7433b(zzhrdVarM7644F.m7647E().m7778E());
                    zzhfqVar.m7434c(zzhrdVarM7644F.m7646D().m7659D().m7665D());
                    zzhfqVar.m7435d(zzhrdVarM7644F.m7647E().m7777D().m7785E());
                    zzhfqVar.f18609e = zzhja.m7474c(zzhrdVarM7644F.m7647E().m7777D().m7784D());
                    zzhfqVar.f18610f = zzhja.m7473b(zzhteVar.m7805F());
                    return zzhfqVar.m7436e();
                } catch (zzifh e) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
                }
            }
        });
        f18833c = new zzhmf(zzhfl.class, new zzhmg() { // from class: com.google.android.gms.internal.ads.zzhix
            @Override // com.google.android.gms.internal.ads.zzhmg
            /* JADX INFO: renamed from: a */
            public final zzhnz mo7456a(zzhdz zzhdzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhfl zzhflVar = (zzhfl) zzhdzVar;
                zzhnl zzhnlVar = zzhja.f18831a;
                zzhra zzhraVarM7637H = zzhrb.m7637H();
                zzhre zzhreVarM7650G = zzhrf.m7650G();
                zzhri zzhriVarM7663E = zzhrj.m7663E();
                int i2 = zzhflVar.f18592a.f18623c;
                zzhriVarM7663E.m8326l();
                ((zzhrj) zzhriVarM7663E.f19780t).m7666G(i2);
                zzhrj zzhrjVar = (zzhrj) zzhriVarM7663E.m8328o();
                zzhreVarM7650G.m8326l();
                ((zzhrf) zzhreVarM7650G.f19780t).m7655I(zzhrjVar);
                byte[] bArrM8051b = zzhflVar.f18593b.f19616a.m8051b();
                zzidl zzidlVarM8149y = zzidl.m8149y(bArrM8051b, 0, bArrM8051b.length);
                zzhreVarM7650G.m8326l();
                ((zzhrf) zzhreVarM7650G.f19780t).m7656J(zzidlVarM8149y);
                zzhrf zzhrfVar = (zzhrf) zzhreVarM7650G.m8328o();
                zzhraVarM7637H.m8326l();
                ((zzhrb) zzhraVarM7637H.f19780t).m7642J(zzhrfVar);
                zzhst zzhstVarM7766H = zzhsu.m7766H();
                zzhft zzhftVar = zzhflVar.f18592a;
                zzhsy zzhsyVarM7475d = zzhja.m7475d(zzhftVar);
                zzhstVarM7766H.m8326l();
                ((zzhsu) zzhstVarM7766H.f19780t).m7772K(zzhsyVarM7475d);
                byte[] bArrM8051b2 = zzhflVar.f18594c.f19616a.m8051b();
                zzidl zzidlVarM8149y2 = zzidl.m8149y(bArrM8051b2, 0, bArrM8051b2.length);
                zzhstVarM7766H.m8326l();
                ((zzhsu) zzhstVarM7766H.f19780t).m7773L(zzidlVarM8149y2);
                zzhsu zzhsuVar = (zzhsu) zzhstVarM7766H.m8328o();
                zzhraVarM7637H.m8326l();
                ((zzhrb) zzhraVarM7637H.f19780t).m7643K(zzhsuVar);
                return zzhnz.m7588a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzhrb) zzhraVarM7637H.m8328o()).m8098g(), zzhta.SYMMETRIC, zzhja.m7472a(zzhftVar.f18625e), zzhflVar.f18596e);
            }
        });
        f18834d = new zzhmc(zzibkVarM7596a, new zzhmd() { // from class: com.google.android.gms.internal.ads.zzhiy
            @Override // com.google.android.gms.internal.ads.zzhmd
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7457a(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhja.f18831a;
                if (!zzhnzVar.f19030a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    zzidl zzidlVar = zzhnzVar.f19032c;
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhrb zzhrbVarM7636G = zzhrb.m7636G(zzidlVar, zzidz.f19759c);
                    if (zzhrbVarM7636G.m7639D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (zzhrbVarM7636G.m7640E().m7652D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (zzhrbVarM7636G.m7641F().m7769D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    zzhfq zzhfqVar = new zzhfq(0);
                    zzhfqVar.m7432a(zzhrbVarM7636G.m7640E().m7654F().mo8132h());
                    zzhfqVar.m7433b(zzhrbVarM7636G.m7641F().m7771F().mo8132h());
                    zzhfqVar.m7434c(zzhrbVarM7636G.m7640E().m7653E().m7665D());
                    zzhfqVar.m7435d(zzhrbVarM7636G.m7641F().m7770E().m7785E());
                    zzhfqVar.f18609e = zzhja.m7474c(zzhrbVarM7636G.m7641F().m7770E().m7784D());
                    zzhfqVar.f18610f = zzhja.m7473b(zzhnzVar.f19034e);
                    zzhft zzhftVarM7436e = zzhfqVar.m7436e();
                    zzhfk zzhfkVar = new zzhfk(0);
                    zzhfkVar.f18588a = zzhftVarM7436e;
                    zzhfkVar.f18589b = new zzibm(zzibk.m8050a(zzhrbVarM7636G.m7640E().m7654F().m8151a()));
                    zzhfkVar.f18590c = new zzibm(zzibk.m8050a(zzhrbVarM7636G.m7641F().m7771F().m8151a()));
                    zzhfkVar.f18591d = zzhnzVar.f19035f;
                    return zzhfkVar.m7430a();
                } catch (zzifh unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static zzhtx m7472a(zzhfs zzhfsVar) throws GeneralSecurityException {
        if (zzhfs.f18617b.equals(zzhfsVar)) {
            return zzhtx.TINK;
        }
        if (zzhfs.f18618c.equals(zzhfsVar)) {
            return zzhtx.CRUNCHY;
        }
        if (zzhfs.f18619d.equals(zzhfsVar)) {
            return zzhtx.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhfsVar)));
    }

    /* JADX INFO: renamed from: b */
    public static zzhfs m7473b(zzhtx zzhtxVar) throws GeneralSecurityException {
        int iOrdinal = zzhtxVar.ordinal();
        if (iOrdinal == 1) {
            return zzhfs.f18617b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhfs.f18619d;
            }
            if (iOrdinal != 4) {
                int iZza = zzhtxVar.zza();
                throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iZza).length() + 34), "Unable to parse OutputPrefixType: ", iZza));
            }
        }
        return zzhfs.f18618c;
    }

    /* JADX INFO: renamed from: c */
    public static zzhfr m7474c(zzhss zzhssVar) throws GeneralSecurityException {
        int iOrdinal = zzhssVar.ordinal();
        if (iOrdinal == 1) {
            return zzhfr.f18611b;
        }
        if (iOrdinal == 2) {
            return zzhfr.f18614e;
        }
        if (iOrdinal == 3) {
            return zzhfr.f18613d;
        }
        if (iOrdinal == 4) {
            return zzhfr.f18615f;
        }
        if (iOrdinal == 5) {
            return zzhfr.f18612c;
        }
        int iZza = zzhssVar.zza();
        throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iZza).length() + 26), "Unable to parse HashType: ", iZza));
    }

    /* JADX INFO: renamed from: d */
    public static zzhsy m7475d(zzhft zzhftVar) throws GeneralSecurityException {
        zzhss zzhssVar;
        zzhsx zzhsxVarM7782F = zzhsy.m7782F();
        int i2 = zzhftVar.f18624d;
        zzhsxVarM7782F.m8326l();
        ((zzhsy) zzhsxVarM7782F.f19780t).m7787I(i2);
        zzhfr zzhfrVar = zzhftVar.f18626f;
        if (zzhfr.f18611b.equals(zzhfrVar)) {
            zzhssVar = zzhss.SHA1;
        } else if (zzhfr.f18612c.equals(zzhfrVar)) {
            zzhssVar = zzhss.SHA224;
        } else if (zzhfr.f18613d.equals(zzhfrVar)) {
            zzhssVar = zzhss.SHA256;
        } else if (zzhfr.f18614e.equals(zzhfrVar)) {
            zzhssVar = zzhss.SHA384;
        } else {
            if (!zzhfr.f18615f.equals(zzhfrVar)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzhfrVar)));
            }
            zzhssVar = zzhss.SHA512;
        }
        zzhsxVarM7782F.m8326l();
        ((zzhsy) zzhsxVarM7782F.f19780t).m7786H(zzhssVar);
        return (zzhsy) zzhsxVarM7782F.m8328o();
    }
}
