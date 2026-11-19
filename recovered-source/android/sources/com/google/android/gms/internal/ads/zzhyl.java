package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhyl {

    /* JADX INFO: renamed from: a */
    public static final zzhnl f19458a;

    /* JADX INFO: renamed from: b */
    public static final zzhni f19459b;

    /* JADX INFO: renamed from: c */
    public static final zzhmh f19460c;

    /* JADX INFO: renamed from: d */
    public static final zzhme f19461d;

    /* JADX INFO: renamed from: e */
    public static final zzhmh f19462e;

    /* JADX INFO: renamed from: f */
    public static final zzhme f19463f;

    /* JADX INFO: renamed from: g */
    public static final zzhlv f19464g;

    static {
        zzibk zzibkVarM7596a = zzhok.m7596a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        zzibk zzibkVarM7596a2 = zzhok.m7596a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        f19458a = new zzhnj(zzhvp.class, new zzhnk() { // from class: com.google.android.gms.internal.ads.zzhyk
            @Override // com.google.android.gms.internal.ads.zzhnk
            /* JADX INFO: renamed from: a */
            public final zzhoa mo7458a(zzheq zzheqVar) {
                zzhnl zzhnlVar = zzhyl.f19458a;
                zzhtd zzhtdVarM7800H = zzhte.m7800H();
                zzhtdVarM7800H.m7796q("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
                zzhtdVarM7800H.m7797r(zzhsm.m7747F().m8098g());
                zzhtdVarM7800H.m7798s((zzhtx) zzhyl.f19464g.m7540b(((zzhvp) zzheqVar).f19250a));
                return zzhoa.m7589a((zzhte) zzhtdVarM7800H.m8328o());
            }
        });
        f19459b = new zzhng(zzibkVarM7596a, new zzhnh() { // from class: com.google.android.gms.internal.ads.zzhyf
            @Override // com.google.android.gms.internal.ads.zzhnh
            /* JADX INFO: renamed from: a */
            public final zzheq mo7455a(zzhoa zzhoaVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhyl.f19458a;
                zzhte zzhteVar = zzhoaVar.f19043b;
                if (!zzhteVar.m7803D().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhteVar.m7803D())));
                }
                try {
                    zzidl zzidlVarM7804E = zzhteVar.m7804E();
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    if (zzhsm.m7746E(zzidlVarM7804E, zzidz.f19759c).m7748D() == 0) {
                        return new zzhvp((zzhvo) zzhyl.f19464g.m7541c(zzhteVar.m7805F()));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (zzifh e) {
                    throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e);
                }
            }
        });
        f19460c = new zzhmf(zzhvw.class, new zzhmg() { // from class: com.google.android.gms.internal.ads.zzhyg
            @Override // com.google.android.gms.internal.ads.zzhmg
            /* JADX INFO: renamed from: a */
            public final zzhnz mo7456a(zzhdz zzhdzVar, zzhey zzheyVar) {
                zzhvw zzhvwVar = (zzhvw) zzhdzVar;
                return zzhnz.m7588a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", zzhyl.m8005a(zzhvwVar).m8098g(), zzhta.ASYMMETRIC_PUBLIC, (zzhtx) zzhyl.f19464g.m7540b(zzhvwVar.f19263a.f19250a), zzhvwVar.f19266d);
            }
        });
        f19461d = new zzhmc(zzibkVarM7596a2, new zzhmd() { // from class: com.google.android.gms.internal.ads.zzhyh
            @Override // com.google.android.gms.internal.ads.zzhmd
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7457a(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhyl.f19458a;
                String str = zzhnzVar.f19030a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
                }
                try {
                    zzidl zzidlVar = zzhnzVar.f19032c;
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhsq zzhsqVarM7757F = zzhsq.m7757F(zzidlVar, zzidz.f19759c);
                    if (zzhsqVarM7757F.m7761D() == 0) {
                        return zzhvw.m7982d((zzhvo) zzhyl.f19464g.m7541c(zzhnzVar.f19034e), zzibk.m8050a(zzhsqVarM7757F.m7762E().m8151a()), zzhnzVar.f19035f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (zzifh unused) {
                    throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
                }
            }
        });
        f19462e = new zzhmf(zzhvq.class, new zzhmg() { // from class: com.google.android.gms.internal.ads.zzhyi
            @Override // com.google.android.gms.internal.ads.zzhmg
            /* JADX INFO: renamed from: a */
            public final zzhnz mo7456a(zzhdz zzhdzVar, zzhey zzheyVar) {
                zzhvq zzhvqVar = (zzhvq) zzhdzVar;
                zzhnl zzhnlVar = zzhyl.f19458a;
                zzhsn zzhsnVarM7750H = zzhso.m7750H();
                zzhsq zzhsqVarM8005a = zzhyl.m8005a(zzhvqVar.f19251a);
                zzhsnVarM7750H.m8326l();
                ((zzhso) zzhsnVarM7750H.f19780t).m7756K(zzhsqVarM8005a);
                byte[] bArrM8051b = zzhvqVar.f19252b.f19616a.m8051b();
                zzidl zzidlVarM8149y = zzidl.m8149y(bArrM8051b, 0, bArrM8051b.length);
                zzhsnVarM7750H.m8326l();
                ((zzhso) zzhsnVarM7750H.f19780t).m7755J(zzidlVarM8149y);
                zzidl zzidlVarM8098g = ((zzhso) zzhsnVarM7750H.m8328o()).m8098g();
                zzhlv zzhlvVar = zzhyl.f19464g;
                zzhvw zzhvwVar = zzhvqVar.f19251a;
                return zzhnz.m7588a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", zzidlVarM8098g, zzhta.ASYMMETRIC_PRIVATE, (zzhtx) zzhlvVar.m7540b(zzhvwVar.f19263a.f19250a), zzhvwVar.f19266d);
            }
        });
        f19463f = new zzhmc(zzibkVarM7596a, new zzhmd() { // from class: com.google.android.gms.internal.ads.zzhyj
            @Override // com.google.android.gms.internal.ads.zzhmd
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7457a(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhnl zzhnlVar = zzhyl.f19458a;
                String str = zzhnzVar.f19030a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str)));
                }
                try {
                    zzidl zzidlVar = zzhnzVar.f19032c;
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhso zzhsoVarM7749G = zzhso.m7749G(zzidlVar, zzidz.f19759c);
                    if (zzhsoVarM7749G.m7752D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzhsq zzhsqVarM7754F = zzhsoVarM7749G.m7754F();
                    if (zzhsqVarM7754F.m7761D() == 0) {
                        return zzhvq.m7981d(zzhvw.m7982d((zzhvo) zzhyl.f19464g.m7541c(zzhnzVar.f19034e), zzibk.m8050a(zzhsqVarM7754F.m7762E().m8151a()), zzhnzVar.f19035f), new zzibm(zzibk.m8050a(zzhsoVarM7749G.m7753E().m8151a())));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (zzifh unused) {
                    throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
                }
            }
        });
        zzhlu zzhluVarM7539a = zzhlv.m7539a();
        zzhluVarM7539a.m7537a(zzhtx.RAW, zzhvo.f19248e);
        zzhluVarM7539a.m7537a(zzhtx.TINK, zzhvo.f19245b);
        zzhluVarM7539a.m7537a(zzhtx.CRUNCHY, zzhvo.f19246c);
        zzhluVarM7539a.m7537a(zzhtx.LEGACY, zzhvo.f19247d);
        f19464g = zzhluVarM7539a.m7538b();
    }

    /* JADX INFO: renamed from: a */
    public static zzhsq m8005a(zzhvw zzhvwVar) {
        zzhsp zzhspVarM7758G = zzhsq.m7758G();
        byte[] bArrM8051b = zzhvwVar.f19264b.m8051b();
        zzidl zzidlVarM8149y = zzidl.m8149y(bArrM8051b, 0, bArrM8051b.length);
        zzhspVarM7758G.m8326l();
        ((zzhsq) zzhspVarM7758G.f19780t).m7763J(zzidlVarM8149y);
        return (zzhsq) zzhspVarM7758G.m8328o();
    }
}
