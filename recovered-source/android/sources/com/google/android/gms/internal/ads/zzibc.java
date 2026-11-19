package com.google.android.gms.internal.ads;

import android.os.Build;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzibc implements zzhev {

    /* JADX INFO: renamed from: a */
    public static final byte[] f19600a = new byte[0];

    /* JADX INFO: renamed from: b */
    public static final byte[] f19601b = {0};

    /* JADX INFO: renamed from: c */
    public static final zzhlv f19602c;

    static {
        zzhlu zzhluVarM7539a = zzhlv.m7539a();
        zzhluVarM7539a.m7537a(zziat.f19579s, zzhwv.f19314b);
        zzhluVarM7539a.m7537a(zziat.f19580t, zzhwv.f19315c);
        zzhluVarM7539a.m7537a(zziat.f19581u, zzhwv.f19316d);
        f19602c = zzhluVarM7539a.m7538b();
    }

    /* JADX INFO: renamed from: b */
    public static zzhev m8042b(zzhxb zzhxbVar) {
        try {
            int i2 = zzhok.f19057a;
            if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
            }
            Provider providerM7509a = zzhli.m7509a();
            if (providerM7509a != null) {
                return zzhyy.m8012c(zzhxbVar, providerM7509a);
            }
            throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
        } catch (NoSuchProviderException unused) {
            KeyFactory keyFactory = (KeyFactory) zziak.f19577g.f19578a.zza("RSA");
            BigInteger bigInteger = zzhxbVar.f19357b;
            zzhwx zzhwxVar = zzhxbVar.f19356a;
            return new zzibb((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, zzhwxVar.f19325b)), (zziat) f19602c.m7540b(zzhwxVar.f19327d), zzhxbVar.f19358c.m8051b(), zzhwxVar.f19326c.equals(zzhww.f19320d) ? f19601b : f19600a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhev
    /* JADX INFO: renamed from: a */
    public final void mo7422a(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
