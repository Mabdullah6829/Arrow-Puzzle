package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhwu {

    /* JADX INFO: renamed from: e */
    public static final BigInteger f19308e;

    /* JADX INFO: renamed from: f */
    public static final BigInteger f19309f;

    /* JADX INFO: renamed from: a */
    public Integer f19310a = null;

    /* JADX INFO: renamed from: b */
    public BigInteger f19311b = zzhwx.f19323e;

    /* JADX INFO: renamed from: c */
    public zzhwv f19312c = null;

    /* JADX INFO: renamed from: d */
    public zzhww f19313d = zzhww.f19321e;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        f19308e = bigIntegerValueOf;
        f19309f = bigIntegerValueOf.pow(256);
    }

    private zzhwu() {
    }

    /* JADX INFO: renamed from: a */
    public final void m7983a(int i2) {
        this.f19310a = Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: b */
    public final zzhwx m7984b() throws GeneralSecurityException {
        Integer num = this.f19310a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f19311b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f19312c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f19313d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f19310a));
        }
        BigInteger bigInteger = this.f19311b;
        int iCompareTo = bigInteger.compareTo(zzhwx.f19323e);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f19308e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f19309f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new zzhwx(this.f19310a.intValue(), this.f19311b, this.f19313d, this.f19312c);
    }

    public /* synthetic */ zzhwu(int i2) {
    }
}
