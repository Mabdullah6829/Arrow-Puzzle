package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
public final class zzial implements zzias {
    @Override // com.google.android.gms.internal.ads.zzias
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8038a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
