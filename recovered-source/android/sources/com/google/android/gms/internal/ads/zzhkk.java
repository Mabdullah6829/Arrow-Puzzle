package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzhkk implements zzhdr {

    /* JADX INFO: renamed from: a */
    public final zzhnp f18891a;

    @Override // com.google.android.gms.internal.ads.zzhdr
    /* JADX INFO: renamed from: a */
    public final byte[] mo7400a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.f18891a.m7584a(bArr).iterator();
        while (it.hasNext()) {
            try {
                return ((zzhkj) it.next()).f18890a.mo7400a(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
