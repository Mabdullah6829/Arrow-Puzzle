package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzhzl implements zzhev {

    /* JADX INFO: renamed from: a */
    public final zzhnp f19527a;

    public zzhzl(zzhnp zzhnpVar) {
        this.f19527a = zzhnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhev
    /* JADX INFO: renamed from: a */
    public final void mo7422a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.f19527a.m7584a(bArr).iterator();
        while (it.hasNext()) {
            try {
                ((zzhzm) it.next()).f19528a.mo7422a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
