package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzflw {
    @VisibleForTesting
    public zzflw() {
        try {
            zzhfc.m7425a();
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.m3150k("Failed to Configure Aead. ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("CryptoUtils.registerAead", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m6498a(byte[] bArr, byte[] bArr2, String str, zzdzo zzdzoVar) {
        zzhek zzhekVarM7410a;
        if (str != null) {
            try {
                try {
                    zzhekVarM7410a = zzhek.m7410a(new zzhdt(new ByteArrayInputStream(Base64.decode(str, 11))).m7401a());
                } catch (IOException unused) {
                    throw new GeneralSecurityException("Parse keyset failed");
                }
            } catch (GeneralSecurityException e) {
                com.google.android.gms.ads.internal.util.zze.m3150k("Failed to get keysethandle".concat(e.toString()));
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("CryptoUtils.getHandle", e);
                zzhekVarM7410a = null;
            }
            if (zzhekVarM7410a != null) {
                try {
                    byte[] bArrMo7400a = ((zzhdr) zzhekVarM7410a.m7419h(zzhlg.m7506a(), zzhdr.class)).mo7400a(bArr, bArr2);
                    zzdzoVar.f13407a.put("ds", "1");
                    return new String(bArrMo7400a, StandardCharsets.UTF_8);
                } catch (UnsupportedOperationException | GeneralSecurityException e2) {
                    com.google.android.gms.ads.internal.util.zze.m3150k("Failed to decrypt ".concat(e2.toString()));
                    com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("CryptoUtils.decrypt", e2);
                    zzdzoVar.f13407a.put("dsf", e2.toString());
                }
            }
        }
        return null;
    }
}
