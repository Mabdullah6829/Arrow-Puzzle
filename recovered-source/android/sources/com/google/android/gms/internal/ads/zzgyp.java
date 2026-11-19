package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgyp extends zzgwt {

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzgyq f18358u;

    public zzgyp(zzgyq zzgyqVar) {
        this.f18358u = zzgyqVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzgyq zzgyqVar = this.f18358u;
        zzgtr.m7136i(i2, zzgyqVar.f18361x);
        Object[] objArr = zzgyqVar.f18360w;
        int i3 = i2 + i2;
        Object obj = objArr[i3];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i3 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: j */
    public final boolean mo7212j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18358u.f18361x;
    }
}
