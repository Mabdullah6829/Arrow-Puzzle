package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhgi {

    /* JADX INFO: renamed from: a */
    public Integer f18665a = null;

    /* JADX INFO: renamed from: b */
    public Integer f18666b = null;

    /* JADX INFO: renamed from: c */
    public Integer f18667c = null;

    /* JADX INFO: renamed from: d */
    public zzhgj f18668d = zzhgj.f18671d;

    private zzhgi() {
    }

    /* JADX INFO: renamed from: a */
    public final void m7446a(int i2) throws InvalidAlgorithmParameterException {
        if (i2 != 16 && i2 != 24 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i2)));
        }
        this.f18665a = Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: b */
    public final void m7447b() {
        this.f18666b = 12;
    }

    /* JADX INFO: renamed from: c */
    public final void m7448c() {
        this.f18667c = 16;
    }

    /* JADX INFO: renamed from: d */
    public final zzhgk m7449d() throws GeneralSecurityException {
        Integer num = this.f18665a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f18666b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.f18667c == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        this.f18666b.getClass();
        this.f18667c.getClass();
        return new zzhgk(iIntValue, this.f18668d);
    }

    public /* synthetic */ zzhgi(int i2) {
    }
}
