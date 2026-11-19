package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhxk {

    /* JADX INFO: renamed from: a */
    public zzhxn f19393a = null;

    /* JADX INFO: renamed from: b */
    public zzibl f19394b = null;

    /* JADX INFO: renamed from: c */
    public zzibl f19395c = null;

    /* JADX INFO: renamed from: d */
    public zzibl f19396d = null;

    /* JADX INFO: renamed from: e */
    public zzibl f19397e = null;

    /* JADX INFO: renamed from: f */
    public zzibl f19398f = null;

    /* JADX INFO: renamed from: g */
    public zzibl f19399g = null;

    private zzhxk() {
    }

    /* JADX INFO: renamed from: a */
    public final zzhxl m7992a() throws GeneralSecurityException {
        zzibl zziblVar;
        zzibl zziblVar2;
        zzhxn zzhxnVar = this.f19393a;
        if (zzhxnVar == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        zzibl zziblVar3 = this.f19395c;
        if (zziblVar3 == null || (zziblVar = this.f19396d) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        zzibl zziblVar4 = this.f19394b;
        if (zziblVar4 == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        zzibl zziblVar5 = this.f19397e;
        if (zziblVar5 == null || (zziblVar2 = this.f19398f) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        zzibl zziblVar6 = this.f19399g;
        if (zziblVar6 == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigInteger = zzhxnVar.f19410a.f19388b;
        BigInteger bigInteger2 = zzhxnVar.f19411b;
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
            return new zzhxl(this.f19393a, this.f19395c, this.f19396d, this.f19394b, this.f19397e, this.f19398f, this.f19399g);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public /* synthetic */ zzhxk(int i2) {
    }
}
