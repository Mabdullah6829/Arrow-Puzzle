package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgvt extends zzgvw {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ zzgwa f18267w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgvt(zzgwa zzgwaVar) {
        super(zzgwaVar);
        Objects.requireNonNull(zzgwaVar);
        this.f18267w = zzgwaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvw
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo7176a(int i2) {
        return new zzgvy(this.f18267w, i2);
    }
}
