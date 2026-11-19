package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Signature;

/* JADX INFO: loaded from: classes2.dex */
public final class zziar implements zzias {
    @Override // com.google.android.gms.internal.ads.zzias
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8038a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
