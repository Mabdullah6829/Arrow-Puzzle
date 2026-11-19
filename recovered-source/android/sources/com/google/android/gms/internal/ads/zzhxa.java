package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhxa {

    /* JADX INFO: renamed from: a */
    public zzhwx f19353a = null;

    /* JADX INFO: renamed from: b */
    public BigInteger f19354b = null;

    /* JADX INFO: renamed from: c */
    public Integer f19355c = null;

    private zzhxa() {
    }

    /* JADX INFO: renamed from: a */
    public final zzhxb m7988a() throws GeneralSecurityException {
        zzibk zzibkVarM7579a;
        if (this.f19353a == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = this.f19354b;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        zzhwx zzhwxVar = this.f19353a;
        int i2 = zzhwxVar.f19324a;
        if (iBitLength != i2) {
            throw new GeneralSecurityException(AbstractC1456a.m2449p(new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(i2).length()), "Got modulus size ", iBitLength, ", but parameters requires modulus size ", i2));
        }
        if (zzhwxVar.mo7421a() && this.f19355c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f19353a.mo7421a() && this.f19355c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        zzhww zzhwwVar = this.f19353a.f19326c;
        if (zzhwwVar == zzhww.f19321e) {
            zzibkVarM7579a = zzhnf.f19007a;
        } else if (zzhwwVar == zzhww.f19320d || zzhwwVar == zzhww.f19319c) {
            zzibkVarM7579a = zzhnf.m7579a(this.f19355c.intValue());
        } else {
            if (zzhwwVar != zzhww.f19318b) {
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(this.f19353a.f19326c)));
            }
            zzibkVarM7579a = zzhnf.m7580b(this.f19355c.intValue());
        }
        return new zzhxb(this.f19353a, this.f19354b, zzibkVarM7579a, this.f19355c);
    }

    public /* synthetic */ zzhxa(int i2) {
    }
}
