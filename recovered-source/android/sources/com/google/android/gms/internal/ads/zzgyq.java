package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzgyq extends zzgxd {

    /* JADX INFO: renamed from: v */
    public final transient zzgww f18359v;

    /* JADX INFO: renamed from: w */
    public final transient Object[] f18360w;

    /* JADX INFO: renamed from: x */
    public final transient int f18361x;

    public zzgyq(zzgww zzgwwVar, Object[] objArr, int i2) {
        this.f18359v = zzgwwVar;
        this.f18360w = objArr;
        this.f18361x = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: a */
    public final zzgzh iterator() {
        return mo7211h().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f18359v.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return mo7211h().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: j */
    public final boolean mo7212j() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: k */
    public final int mo7213k(int i2, Object[] objArr) {
        return mo7211h().mo7213k(i2, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18361x;
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    /* JADX INFO: renamed from: t */
    public final zzgwt mo7245t() {
        return new zzgyp(this);
    }
}
