package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhfq {

    /* JADX INFO: renamed from: a */
    public Integer f18605a = null;

    /* JADX INFO: renamed from: b */
    public Integer f18606b = null;

    /* JADX INFO: renamed from: c */
    public Integer f18607c = null;

    /* JADX INFO: renamed from: d */
    public Integer f18608d = null;

    /* JADX INFO: renamed from: e */
    public zzhfr f18609e = null;

    /* JADX INFO: renamed from: f */
    public zzhfs f18610f = zzhfs.f18619d;

    private zzhfq() {
    }

    /* JADX INFO: renamed from: a */
    public final void m7432a(int i2) throws InvalidAlgorithmParameterException {
        if (i2 != 16 && i2 != 24 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i2)));
        }
        this.f18605a = Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: b */
    public final void m7433b(int i2) throws InvalidAlgorithmParameterException {
        if (i2 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i2)));
        }
        this.f18606b = Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: c */
    public final void m7434c(int i2) throws GeneralSecurityException {
        if (i2 < 12 || i2 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i2)));
        }
        this.f18607c = Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: d */
    public final void m7435d(int i2) throws GeneralSecurityException {
        if (i2 < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i2)));
        }
        this.f18608d = Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: e */
    public final zzhft m7436e() throws GeneralSecurityException {
        if (this.f18605a == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (this.f18606b == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (this.f18607c == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = this.f18608d;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f18609e == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        int iIntValue = num.intValue();
        zzhfr zzhfrVar = this.f18609e;
        if (zzhfrVar == zzhfr.f18611b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (zzhfrVar == zzhfr.f18612c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (zzhfrVar == zzhfr.f18613d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (zzhfrVar == zzhfr.f18614e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (zzhfrVar != zzhfr.f18615f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new zzhft(this.f18605a.intValue(), this.f18606b.intValue(), this.f18607c.intValue(), this.f18608d.intValue(), this.f18610f, this.f18609e);
    }

    public /* synthetic */ zzhfq(int i2) {
    }
}
