package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzhkz implements zzhjn {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ zzhkz f18914a = new zzhkz();

    private /* synthetic */ zzhkz() {
    }

    @Override // com.google.android.gms.internal.ads.zzhjn
    public final /* synthetic */ Cipher zza() throws GeneralSecurityException {
        try {
            Cipher cipher = (Cipher) zzhla.f18915a.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e);
        }
    }
}
