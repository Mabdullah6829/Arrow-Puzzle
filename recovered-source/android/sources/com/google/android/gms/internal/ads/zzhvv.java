package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhvv {

    /* JADX INFO: renamed from: a */
    public static final zzhns f19257a = new zzhnq(zzhvq.class, zzheu.class, new zzhnr() { // from class: com.google.android.gms.internal.ads.zzhvt
        @Override // com.google.android.gms.internal.ads.zzhnr
        /* JADX INFO: renamed from: a */
        public final Object mo7428a(zzhdz zzhdzVar) throws GeneralSecurityException {
            zzhvq zzhvqVar = (zzhvq) zzhdzVar;
            if (!zzhle.m7504a(1)) {
                throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
            }
            try {
                return zzhym.m8006a(zzhvqVar);
            } catch (GeneralSecurityException unused) {
                zzibm zzibmVar = zzhvqVar.f19252b;
                zzhvw zzhvwVar = zzhvqVar.f19251a;
                zzhey zzheyVar = zzhey.f18574a;
                byte[] bArrM8051b = zzibmVar.f19616a.m8051b();
                zzhvwVar.f19265c.m8051b();
                zzhvwVar.f19263a.f19250a.getClass();
                zzhzz zzhzzVar = new zzhzz();
                if (!zzhle.m7504a(1)) {
                    throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
                }
                if (bArrM8051b.length != 32) {
                    throw new IllegalArgumentException("Given private key's length is not 32");
                }
                zzhlp.m7516a(zzhlp.m7517b(bArrM8051b));
                return zzhzzVar;
            }
        }
    });

    /* JADX INFO: renamed from: b */
    public static final zzhns f19258b = new zzhnq(zzhvw.class, zzhev.class, new zzhnr() { // from class: com.google.android.gms.internal.ads.zzhvu
        @Override // com.google.android.gms.internal.ads.zzhnr
        /* JADX INFO: renamed from: a */
        public final Object mo7428a(zzhdz zzhdzVar) throws GeneralSecurityException {
            zzhvw zzhvwVar = (zzhvw) zzhdzVar;
            if (!zzhle.m7504a(1)) {
                throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
            }
            try {
                return zzhyn.m8007b(zzhvwVar);
            } catch (GeneralSecurityException unused) {
                return new zziaa(zzhvwVar.f19264b.m8051b(), zzhvwVar.f19265c.m8051b(), zzhvwVar.f19263a.f19250a.equals(zzhvo.f19247d) ? new byte[]{0} : new byte[0]);
            }
        }
    });

    /* JADX INFO: renamed from: c */
    public static final zzher f19259c;

    /* JADX INFO: renamed from: d */
    public static final zzhmj f19260d;

    /* JADX INFO: renamed from: e */
    public static final zzhmw f19261e;

    /* JADX INFO: renamed from: f */
    public static final zzhma f19262f;

    static {
        zzhso.m7751I();
        f19259c = new zzhmi("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", zzheu.class, zzhta.ASYMMETRIC_PRIVATE);
        zzhsq.m7760I();
        f19260d = new zzhmj("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", zzhev.class, zzhta.ASYMMETRIC_PUBLIC);
        f19261e = new zzhmw() { // from class: com.google.android.gms.internal.ads.zzhvs
        };
        f19262f = new zzhma() { // from class: com.google.android.gms.internal.ads.zzhvr
            @Override // com.google.android.gms.internal.ads.zzhma
            /* JADX INFO: renamed from: a */
            public final zzhdz mo7431a(zzheq zzheqVar, Integer num) throws GeneralSecurityException {
                zzhvp zzhvpVar = (zzhvp) zzheqVar;
                zzhns zzhnsVar = zzhvv.f19257a;
                byte[] bArrM7590a = zzhoc.m7590a(32);
                if (bArrM7590a.length != 32) {
                    throw new IllegalArgumentException("Given secret seed length is not 32");
                }
                zzhvw zzhvwVarM7982d = zzhvw.m7982d(zzhvpVar.f19250a, zzibk.m8050a(Arrays.copyOf(zzhlp.m7516a(zzhlp.m7517b(bArrM7590a)), 32)), num);
                byte[] bArrCopyOf = Arrays.copyOf(bArrM7590a, bArrM7590a.length);
                zzhey zzheyVar = zzhey.f18574a;
                return zzhvq.m7981d(zzhvwVarM7982d, new zzibm(zzibk.m8050a(bArrCopyOf)));
            }
        };
    }
}
