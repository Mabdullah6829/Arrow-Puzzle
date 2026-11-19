package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class zzian implements zzias {
    @Override // com.google.android.gms.internal.ads.zzias
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8038a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
