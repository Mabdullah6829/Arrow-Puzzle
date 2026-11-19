package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhgr {

    /* JADX INFO: renamed from: a */
    public Integer f18689a = null;

    /* JADX INFO: renamed from: b */
    public zzhgs f18690b = zzhgs.f18693d;

    private zzhgr() {
    }

    /* JADX INFO: renamed from: a */
    public final void m7451a(int i2) throws InvalidAlgorithmParameterException {
        if (i2 != 16 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i2)));
        }
        this.f18689a = Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: b */
    public final zzhgt m7452b() throws GeneralSecurityException {
        Integer num = this.f18689a;
        if (num != null) {
            return new zzhgt(num.intValue(), this.f18690b);
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    public /* synthetic */ zzhgr(int i2) {
    }
}
