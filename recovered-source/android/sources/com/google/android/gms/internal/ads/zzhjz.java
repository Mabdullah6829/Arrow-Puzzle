package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhjz {

    /* JADX INFO: renamed from: a */
    public static final zzhnl f18878a;

    /* JADX INFO: renamed from: b */
    public static final zzhni f18879b;

    /* JADX INFO: renamed from: c */
    public static final zzhmh f18880c;

    /* JADX INFO: renamed from: d */
    public static final zzhme f18881d;

    static {
        zzibk zzibkVarM7596a = zzhok.m7596a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f18878a = new zzhnj(zzhgz.class, new zzhnk() { // from class: com.google.android.gms.internal.ads.zzhjy
            @Override // com.google.android.gms.internal.ads.zzhnk
            /* JADX INFO: renamed from: a */
            public final zzhoa mo7458a(zzheq zzheqVar) {
                zzhnl zzhnlVar = zzhjz.f18878a;
                zzhtd zzhtdVarM7800H = zzhte.m7800H();
                zzhtdVarM7800H.m7796q("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                zzhtdVarM7800H.m7797r(zzhsb.m7714E().m8098g());
                zzhtdVarM7800H.m7798s(zzhjz.m7484a(((zzhgz) zzheqVar).f18710a));
                return zzhoa.m7589a((zzhte) zzhtdVarM7800H.m8328o());
            }
        });
        f18879b = new zzhng(zzibkVarM7596a, new zzhnh() { // from class: com.google.android.gms.internal.ads.zzhjv
            @Override // com.google.android.gms.internal.ads.zzhnh
            /* JADX INFO: renamed from: a */
            public final zzheq mo7455a(zzhoa zzhoaVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhjz.f18878a;
                zzhte zzhteVar = zzhoaVar.f19043b;
                if (!zzhteVar.m7803D().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhteVar.m7803D())));
                }
                try {
                    zzidl zzidlVarM7804E = zzhteVar.m7804E();
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhsb.m7713D(zzidlVarM7804E, zzidz.f19759c);
                    return new zzhgz(zzhjz.m7485b(zzhteVar.m7805F()));
                } catch (zzifh e) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
                }
            }
        });
        f18880c = new zzhmf(zzhgu.class, new zzhmg() { // from class: com.google.android.gms.internal.ads.zzhjw
            @Override // com.google.android.gms.internal.ads.zzhmg
            /* JADX INFO: renamed from: a */
            public final zzhnz mo7456a(zzhdz zzhdzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhgu zzhguVar = (zzhgu) zzhdzVar;
                zzhnl zzhnlVar = zzhjz.f18878a;
                zzhry zzhryVarM7708G = zzhrz.m7708G();
                byte[] bArrM8051b = zzhguVar.f18698b.f19616a.m8051b();
                zzidl zzidlVarM8149y = zzidl.m8149y(bArrM8051b, 0, bArrM8051b.length);
                zzhryVarM7708G.m8326l();
                ((zzhrz) zzhryVarM7708G.f19780t).m7712I(zzidlVarM8149y);
                return zzhnz.m7588a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzhrz) zzhryVarM7708G.m8328o()).m8098g(), zzhta.SYMMETRIC, zzhjz.m7484a(zzhguVar.f18697a.f18710a), zzhguVar.f18700d);
            }
        });
        f18881d = new zzhmc(zzibkVarM7596a, new zzhmd() { // from class: com.google.android.gms.internal.ads.zzhjx
            @Override // com.google.android.gms.internal.ads.zzhmd
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7457a(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhjz.f18878a;
                if (!zzhnzVar.f19030a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    zzidl zzidlVar = zzhnzVar.f19032c;
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhrz zzhrzVarM7707F = zzhrz.m7707F(zzidlVar, zzidz.f19759c);
                    if (zzhrzVarM7707F.m7710D() == 0) {
                        return zzhgu.m7453d(zzhjz.m7485b(zzhnzVar.f19034e), new zzibm(zzibk.m8050a(zzhrzVarM7707F.m7711E().m8151a())), zzhnzVar.f19035f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (zzifh unused) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static zzhtx m7484a(zzhgy zzhgyVar) throws GeneralSecurityException {
        if (zzhgy.f18706b.equals(zzhgyVar)) {
            return zzhtx.TINK;
        }
        if (zzhgy.f18707c.equals(zzhgyVar)) {
            return zzhtx.CRUNCHY;
        }
        if (zzhgy.f18708d.equals(zzhgyVar)) {
            return zzhtx.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhgyVar.f18709a));
    }

    /* JADX INFO: renamed from: b */
    public static zzhgy m7485b(zzhtx zzhtxVar) throws GeneralSecurityException {
        int iOrdinal = zzhtxVar.ordinal();
        if (iOrdinal == 1) {
            return zzhgy.f18706b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhgy.f18708d;
            }
            if (iOrdinal != 4) {
                int iZza = zzhtxVar.zza();
                throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iZza).length() + 34), "Unable to parse OutputPrefixType: ", iZza));
            }
        }
        return zzhgy.f18707c;
    }
}
