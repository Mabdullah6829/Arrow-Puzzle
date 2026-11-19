package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhqn extends zzhqq {

    /* JADX INFO: renamed from: a */
    public final int f19155a;

    public zzhqn(int i2) {
        this.f19155a = i2;
    }

    /* JADX INFO: renamed from: b */
    public static zzhqn m7616b(int i2) throws InvalidAlgorithmParameterException {
        if (i2 == 16 || i2 == 32) {
            return new zzhqn(i2);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i2 * 8)));
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    /* JADX INFO: renamed from: a */
    public final boolean mo7421a() {
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhqn) && ((zzhqn) obj).f19155a == this.f19155a;
    }

    public final int hashCode() {
        return Objects.hash(zzhqn.class, Integer.valueOf(this.f19155a));
    }

    public final String toString() {
        int i2 = this.f19155a;
        return AbstractC1456a.m2448o(new StringBuilder(String.valueOf(i2).length() + 34), "AesCmac PRF Parameters (", i2, "-byte key)");
    }
}
