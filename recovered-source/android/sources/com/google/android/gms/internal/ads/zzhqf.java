package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhqf {

    /* JADX INFO: renamed from: a */
    public static final zzhlv f19147a;

    /* JADX INFO: renamed from: b */
    public static final zzhlv f19148b;

    /* JADX INFO: renamed from: c */
    public static final zzhnl f19149c;

    /* JADX INFO: renamed from: d */
    public static final zzhni f19150d;

    /* JADX INFO: renamed from: e */
    public static final zzhmh f19151e;

    /* JADX INFO: renamed from: f */
    public static final zzhme f19152f;

    static {
        zzibk zzibkVarM7596a = zzhok.m7596a("type.googleapis.com/google.crypto.tink.HmacKey");
        zzhlu zzhluVarM7539a = zzhlv.m7539a();
        zzhluVarM7539a.m7537a(zzhtx.RAW, zzhpf.f19118e);
        zzhluVarM7539a.m7537a(zzhtx.TINK, zzhpf.f19115b);
        zzhluVarM7539a.m7537a(zzhtx.LEGACY, zzhpf.f19117d);
        zzhluVarM7539a.m7537a(zzhtx.CRUNCHY, zzhpf.f19116c);
        f19147a = zzhluVarM7539a.m7538b();
        zzhlu zzhluVarM7539a2 = zzhlv.m7539a();
        zzhluVarM7539a2.m7537a(zzhss.SHA1, zzhpe.f19109b);
        zzhluVarM7539a2.m7537a(zzhss.SHA224, zzhpe.f19110c);
        zzhluVarM7539a2.m7537a(zzhss.SHA256, zzhpe.f19111d);
        zzhluVarM7539a2.m7537a(zzhss.SHA384, zzhpe.f19112e);
        zzhluVarM7539a2.m7537a(zzhss.SHA512, zzhpe.f19113f);
        f19148b = zzhluVarM7539a2.m7538b();
        f19149c = new zzhnj(zzhpg.class, new zzhnk() { // from class: com.google.android.gms.internal.ads.zzhqe
            @Override // com.google.android.gms.internal.ads.zzhnk
            /* JADX INFO: renamed from: a */
            public final zzhoa mo7458a(zzheq zzheqVar) {
                zzhpg zzhpgVar = (zzhpg) zzheqVar;
                zzhlv zzhlvVar = zzhqf.f19147a;
                zzhtd zzhtdVarM7800H = zzhte.m7800H();
                zzhtdVarM7800H.m7796q("type.googleapis.com/google.crypto.tink.HmacKey");
                zzhsv zzhsvVarM7775H = zzhsw.m7775H();
                zzhsx zzhsxVarM7782F = zzhsy.m7782F();
                int i2 = zzhpgVar.f19121b;
                zzhsxVarM7782F.m8326l();
                ((zzhsy) zzhsxVarM7782F.f19780t).m7787I(i2);
                zzhss zzhssVar = (zzhss) zzhqf.f19148b.m7540b(zzhpgVar.f19123d);
                zzhsxVarM7782F.m8326l();
                ((zzhsy) zzhsxVarM7782F.f19780t).m7786H(zzhssVar);
                zzhsy zzhsyVar = (zzhsy) zzhsxVarM7782F.m8328o();
                zzhsvVarM7775H.m8326l();
                ((zzhsw) zzhsvVarM7775H.f19780t).m7780J(zzhsyVar);
                int i3 = zzhpgVar.f19120a;
                zzhsvVarM7775H.m8326l();
                ((zzhsw) zzhsvVarM7775H.f19780t).m7781K(i3);
                zzhtdVarM7800H.m7797r(((zzhsw) zzhsvVarM7775H.m8328o()).m8098g());
                zzhtdVarM7800H.m7798s((zzhtx) zzhqf.f19147a.m7540b(zzhpgVar.f19122c));
                return zzhoa.m7589a((zzhte) zzhtdVarM7800H.m8328o());
            }
        });
        f19150d = new zzhng(zzibkVarM7596a, new zzhnh() { // from class: com.google.android.gms.internal.ads.zzhqb
            @Override // com.google.android.gms.internal.ads.zzhnh
            /* JADX INFO: renamed from: a */
            public final zzheq mo7455a(zzhoa zzhoaVar) throws GeneralSecurityException {
                zzhlv zzhlvVar = zzhqf.f19147a;
                zzhte zzhteVar = zzhoaVar.f19043b;
                if (!zzhteVar.m7803D().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzhteVar.m7803D())));
                }
                try {
                    zzidl zzidlVarM7804E = zzhteVar.m7804E();
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhsw zzhswVarM7774G = zzhsw.m7774G(zzidlVarM7804E, zzidz.f19759c);
                    if (zzhswVarM7774G.m7779F() != 0) {
                        int iM7779F = zzhswVarM7774G.m7779F();
                        throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iM7779F).length() + 47), "Parsing HmacParameters failed: unknown Version ", iM7779F));
                    }
                    zzhpd zzhpdVar = new zzhpd(0);
                    zzhpdVar.m7606a(zzhswVarM7774G.m7778E());
                    zzhpdVar.m7607b(zzhswVarM7774G.m7777D().m7785E());
                    zzhpdVar.f19107c = (zzhpe) zzhqf.f19148b.m7541c(zzhswVarM7774G.m7777D().m7784D());
                    zzhpdVar.f19108d = (zzhpf) zzhqf.f19147a.m7541c(zzhteVar.m7805F());
                    return zzhpdVar.m7608c();
                } catch (zzifh e) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
                }
            }
        });
        f19151e = new zzhmf(zzhox.class, new zzhmg() { // from class: com.google.android.gms.internal.ads.zzhqc
            @Override // com.google.android.gms.internal.ads.zzhmg
            /* JADX INFO: renamed from: a */
            public final zzhnz mo7456a(zzhdz zzhdzVar, zzhey zzheyVar) {
                zzhox zzhoxVar = (zzhox) zzhdzVar;
                zzhlv zzhlvVar = zzhqf.f19147a;
                zzhst zzhstVarM7766H = zzhsu.m7766H();
                zzhpg zzhpgVar = zzhoxVar.f19087a;
                zzhsx zzhsxVarM7782F = zzhsy.m7782F();
                int i2 = zzhpgVar.f19121b;
                zzhsxVarM7782F.m8326l();
                ((zzhsy) zzhsxVarM7782F.f19780t).m7787I(i2);
                zzhss zzhssVar = (zzhss) zzhqf.f19148b.m7540b(zzhpgVar.f19123d);
                zzhsxVarM7782F.m8326l();
                ((zzhsy) zzhsxVarM7782F.f19780t).m7786H(zzhssVar);
                zzhsy zzhsyVar = (zzhsy) zzhsxVarM7782F.m8328o();
                zzhstVarM7766H.m8326l();
                ((zzhsu) zzhstVarM7766H.f19780t).m7772K(zzhsyVar);
                byte[] bArrM8051b = zzhoxVar.f19088b.f19616a.m8051b();
                zzidl zzidlVarM8149y = zzidl.m8149y(bArrM8051b, 0, bArrM8051b.length);
                zzhstVarM7766H.m8326l();
                ((zzhsu) zzhstVarM7766H.f19780t).m7773L(zzidlVarM8149y);
                return zzhnz.m7588a("type.googleapis.com/google.crypto.tink.HmacKey", ((zzhsu) zzhstVarM7766H.m8328o()).m8098g(), zzhta.SYMMETRIC, (zzhtx) zzhqf.f19147a.m7540b(zzhoxVar.f19087a.f19122c), zzhoxVar.f19090d);
            }
        });
        f19152f = new zzhmc(zzibkVarM7596a, new zzhmd() { // from class: com.google.android.gms.internal.ads.zzhqd
            @Override // com.google.android.gms.internal.ads.zzhmd
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7457a(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
                zzhlv zzhlvVar = zzhqf.f19147a;
                if (!zzhnzVar.f19030a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    zzidl zzidlVar = zzhnzVar.f19032c;
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzhsu zzhsuVarM7765G = zzhsu.m7765G(zzidlVar, zzidz.f19759c);
                    if (zzhsuVarM7765G.m7769D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzhpd zzhpdVar = new zzhpd(0);
                    zzhpdVar.m7606a(zzhsuVarM7765G.m7771F().mo8132h());
                    zzhpdVar.m7607b(zzhsuVarM7765G.m7770E().m7785E());
                    zzhpdVar.f19107c = (zzhpe) zzhqf.f19148b.m7541c(zzhsuVarM7765G.m7770E().m7784D());
                    zzhpdVar.f19108d = (zzhpf) zzhqf.f19147a.m7541c(zzhnzVar.f19034e);
                    zzhpg zzhpgVarM7608c = zzhpdVar.m7608c();
                    zzhow zzhowVar = new zzhow(0);
                    zzhowVar.f19084a = zzhpgVarM7608c;
                    zzhowVar.f19085b = new zzibm(zzibk.m8050a(zzhsuVarM7765G.m7771F().m8151a()));
                    zzhowVar.f19086c = zzhnzVar.f19035f;
                    return zzhowVar.m7605a();
                } catch (zzifh | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
            }
        });
    }
}
