package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class zziaq implements zzias {
    @Override // com.google.android.gms.internal.ads.zzias
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8038a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
