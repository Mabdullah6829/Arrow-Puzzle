package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class zzgxb<K, V> extends zzgvn<K, V> implements Serializable {

    /* JADX INFO: renamed from: v */
    public final transient zzgww f18319v;

    /* JADX INFO: renamed from: w */
    public final transient int f18320w;

    public zzgxb(zzgww zzgwwVar, int i2) {
        this.f18319v = zzgwwVar;
        this.f18320w = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    /* JADX INFO: renamed from: a */
    public final Map mo7169a() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    /* JADX INFO: renamed from: b */
    public final boolean mo7172b(Object obj) {
        return obj != null && super.mo7172b(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgvm, com.google.android.gms.internal.ads.zzgyb
    /* JADX INFO: renamed from: k */
    public /* synthetic */ Map mo7173k() {
        return this.f18319v;
    }
}
