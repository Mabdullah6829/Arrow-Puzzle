package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgwl extends zzgwi implements Queue {
    @Override // java.util.Queue
    public final Object element() {
        return mo6720h().element();
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ Collection mo6719g() {
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public abstract LinkedList mo6720h();

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return mo6720h().offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return mo6720h().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return mo6720h().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return mo6720h().remove();
    }
}
