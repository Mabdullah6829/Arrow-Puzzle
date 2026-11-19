package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhxm {

    /* JADX INFO: renamed from: a */
    public zzhxj f19407a = null;

    /* JADX INFO: renamed from: b */
    public BigInteger f19408b = null;

    /* JADX INFO: renamed from: c */
    public Integer f19409c = null;

    private zzhxm() {
    }

    /* JADX INFO: renamed from: a */
    public final zzhxn m7993a() throws GeneralSecurityException {
        zzibk zzibkVarM7579a;
        if (this.f19407a == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = this.f19408b;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        zzhxj zzhxjVar = this.f19407a;
        int i2 = zzhxjVar.f19387a;
        if (iBitLength != i2) {
            throw new GeneralSecurityException(AbstractC1456a.m2449p(new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(i2).length()), "Got modulus size ", iBitLength, ", but parameters requires modulus size ", i2));
        }
        if (zzhxjVar.mo7421a() && this.f19409c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f19407a.mo7421a() && this.f19409c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        zzhxi zzhxiVar = this.f19407a.f19389c;
        if (zzhxiVar == zzhxi.f19384e) {
            zzibkVarM7579a = zzhnf.f19007a;
        } else if (zzhxiVar == zzhxi.f19383d || zzhxiVar == zzhxi.f19382c) {
            zzibkVarM7579a = zzhnf.m7579a(this.f19409c.intValue());
        } else {
            if (zzhxiVar != zzhxi.f19381b) {
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(this.f19407a.f19389c)));
            }
            zzibkVarM7579a = zzhnf.m7580b(this.f19409c.intValue());
        }
        return new zzhxn(this.f19407a, this.f19408b, zzibkVarM7579a, this.f19409c);
    }

    public /* synthetic */ zzhxm(int i2) {
    }
}
