package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhwy {

    /* JADX INFO: renamed from: a */
    public zzhxb f19328a = null;

    /* JADX INFO: renamed from: b */
    public zzibl f19329b = null;

    /* JADX INFO: renamed from: c */
    public zzibl f19330c = null;

    /* JADX INFO: renamed from: d */
    public zzibl f19331d = null;

    /* JADX INFO: renamed from: e */
    public zzibl f19332e = null;

    /* JADX INFO: renamed from: f */
    public zzibl f19333f = null;

    /* JADX INFO: renamed from: g */
    public zzibl f19334g = null;

    private zzhwy() {
    }

    /* JADX INFO: renamed from: a */
    public final zzhwz m7985a() throws GeneralSecurityException {
        zzibl zziblVar;
        zzibl zziblVar2;
        zzhxb zzhxbVar = this.f19328a;
        if (zzhxbVar == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        zzibl zziblVar3 = this.f19330c;
        if (zziblVar3 == null || (zziblVar = this.f19331d) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        zzibl zziblVar4 = this.f19329b;
        if (zziblVar4 == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        zzibl zziblVar5 = this.f19332e;
        if (zziblVar5 == null || (zziblVar2 = this.f19333f) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        zzibl zziblVar6 = this.f19334g;
        if (zziblVar6 == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigInteger = zzhxbVar.f19356a.f19325b;
        BigInteger bigInteger2 = zzhxbVar.f19357b;
        zzhey zzheyVar = zzhey.f18574a;
        BigInteger bigInteger3 = zziblVar3.f19615a;
        BigInteger bigInteger4 = zziblVar.f19615a;
        BigInteger bigInteger5 = zziblVar4.f19615a;
        BigInteger bigInteger6 = zziblVar5.f19615a;
        BigInteger bigInteger7 = zziblVar2.f19615a;
        BigInteger bigInteger8 = zziblVar6.f19615a;
        if (!bigInteger3.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!bigInteger4.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new zzhwz(this.f19328a, this.f19330c, this.f19331d, this.f19329b, this.f19332e, this.f19333f, this.f19334g);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public /* synthetic */ zzhwy(int i2) {
    }
}
