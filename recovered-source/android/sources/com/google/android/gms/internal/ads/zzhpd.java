package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhpd {

    /* JADX INFO: renamed from: a */
    public Integer f19105a = null;

    /* JADX INFO: renamed from: b */
    public Integer f19106b = null;

    /* JADX INFO: renamed from: c */
    public zzhpe f19107c = null;

    /* JADX INFO: renamed from: d */
    public zzhpf f19108d = zzhpf.f19118e;

    private zzhpd() {
    }

    /* JADX INFO: renamed from: a */
    public final void m7606a(int i2) {
        this.f19105a = Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: b */
    public final void m7607b(int i2) {
        this.f19106b = Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: c */
    public final zzhpg m7608c() throws GeneralSecurityException {
        Integer num = this.f19105a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f19106b == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f19107c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f19105a));
        }
        Integer num2 = this.f19106b;
        int iIntValue = num2.intValue();
        zzhpe zzhpeVar = this.f19107c;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (zzhpeVar == zzhpe.f19109b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (zzhpeVar == zzhpe.f19110c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (zzhpeVar == zzhpe.f19111d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (zzhpeVar == zzhpe.f19112e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (zzhpeVar != zzhpe.f19113f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new zzhpg(this.f19105a.intValue(), this.f19106b.intValue(), this.f19108d, this.f19107c);
    }

    public /* synthetic */ zzhpd(int i2) {
    }
}
