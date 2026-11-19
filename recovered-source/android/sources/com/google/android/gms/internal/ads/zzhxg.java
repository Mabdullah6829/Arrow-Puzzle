package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhxg {

    /* JADX INFO: renamed from: g */
    public static final BigInteger f19369g;

    /* JADX INFO: renamed from: h */
    public static final BigInteger f19370h;

    /* JADX INFO: renamed from: a */
    public Integer f19371a = null;

    /* JADX INFO: renamed from: b */
    public BigInteger f19372b = zzhxj.f19386g;

    /* JADX INFO: renamed from: c */
    public zzhxh f19373c = null;

    /* JADX INFO: renamed from: d */
    public zzhxh f19374d = null;

    /* JADX INFO: renamed from: e */
    public Integer f19375e = null;

    /* JADX INFO: renamed from: f */
    public zzhxi f19376f = zzhxi.f19384e;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        f19369g = bigIntegerValueOf;
        f19370h = bigIntegerValueOf.pow(256);
    }

    private zzhxg() {
    }

    /* JADX INFO: renamed from: a */
    public final void m7989a(int i2) {
        this.f19371a = Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: b */
    public final void m7990b(int i2) throws GeneralSecurityException {
        if (i2 < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i2)));
        }
        this.f19375e = Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: c */
    public final zzhxj m7991c() throws GeneralSecurityException {
        Integer num = this.f19371a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f19372b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f19373c == null) {
            throw new GeneralSecurityException("signature hash type is not set");
        }
        if (this.f19374d == null) {
            throw new GeneralSecurityException("mgf1 hash type is not set");
        }
        if (this.f19376f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (this.f19375e == null) {
            throw new GeneralSecurityException("salt length is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.f19371a, 2048));
        }
        if (this.f19373c != this.f19374d) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        BigInteger bigInteger = this.f19372b;
        int iCompareTo = bigInteger.compareTo(zzhxj.f19386g);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f19369g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f19370h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new zzhxj(this.f19371a.intValue(), this.f19372b, this.f19376f, this.f19373c, this.f19374d, this.f19375e.intValue());
    }

    public /* synthetic */ zzhxg(int i2) {
    }
}
