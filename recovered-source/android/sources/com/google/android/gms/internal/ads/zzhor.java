package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhor {

    /* JADX INFO: renamed from: a */
    public Integer f19072a = null;

    /* JADX INFO: renamed from: b */
    public Integer f19073b = null;

    /* JADX INFO: renamed from: c */
    public zzhos f19074c = zzhos.f19078e;

    private zzhor() {
    }

    /* JADX INFO: renamed from: a */
    public final void m7601a(int i2) {
        if (i2 != 16 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i2 * 8)));
        }
        this.f19072a = Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: b */
    public final void m7602b(int i2) {
        if (i2 < 10 || i2 > 16) {
            throw new GeneralSecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 40), "Invalid tag size for AesCmacParameters: ", i2));
        }
        this.f19073b = Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: c */
    public final zzhot m7603c() throws GeneralSecurityException {
        Integer num = this.f19072a;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.f19073b != null) {
            return new zzhot(num.intValue(), this.f19073b.intValue(), this.f19074c);
        }
        throw new GeneralSecurityException("tag size not set");
    }

    public /* synthetic */ zzhor(int i2) {
    }
}
