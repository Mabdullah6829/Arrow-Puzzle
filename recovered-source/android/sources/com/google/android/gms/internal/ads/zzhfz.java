package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhfz {

    /* JADX INFO: renamed from: a */
    public Integer f18639a = null;

    /* JADX INFO: renamed from: b */
    public Integer f18640b = null;

    /* JADX INFO: renamed from: c */
    public Integer f18641c = null;

    /* JADX INFO: renamed from: d */
    public zzhga f18642d = zzhga.f18645d;

    private zzhfz() {
    }

    /* JADX INFO: renamed from: a */
    public final void m7438a(int i2) throws InvalidAlgorithmParameterException {
        if (i2 != 16 && i2 != 24 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i2)));
        }
        this.f18639a = Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: b */
    public final void m7439b(int i2) throws GeneralSecurityException {
        if (i2 != 12 && i2 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i2)));
        }
        this.f18640b = Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: c */
    public final void m7440c() {
        this.f18641c = 16;
    }

    /* JADX INFO: renamed from: d */
    public final zzhgb m7441d() throws GeneralSecurityException {
        Integer num = this.f18639a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f18640b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.f18641c == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = this.f18640b.intValue();
        this.f18641c.getClass();
        return new zzhgb(iIntValue, iIntValue2, this.f18642d);
    }

    public /* synthetic */ zzhfz(int i2) {
    }
}
