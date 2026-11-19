package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzgze extends zzgxd {

    /* JADX INFO: renamed from: v */
    public final transient Object f18386v;

    public zzgze(Object obj) {
        obj.getClass();
        this.f18386v = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: a */
    public final zzgzh iterator() {
        return new zzgxl(this.f18386v);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f18386v.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: h */
    public final zzgwt mo7211h() {
        return zzgwt.m7216n(this.f18386v);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f18386v.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgxl(this.f18386v);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: j */
    public final boolean mo7212j() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: k */
    public final int mo7213k(int i2, Object[] objArr) {
        objArr[i2] = this.f18386v;
        return i2 + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f18386v.toString();
        return AbstractC1456a.m2450q(new StringBuilder(String.valueOf(string).length() + 2), "[", string, "]");
    }
}
