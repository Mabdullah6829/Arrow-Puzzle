package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzzw extends AbstractSet {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzzy f23162s;

    public zzzw(zzzy zzzyVar) {
        this.f23162s = zzzyVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzzv(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f23162s.f23170e;
    }
}
