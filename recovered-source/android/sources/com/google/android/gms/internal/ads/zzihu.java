package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.AbstractC6452k;
import p080q0.InterfaceC6520a;

/* JADX INFO: loaded from: classes2.dex */
public class zzihu implements Collection, InterfaceC6520a {

    /* JADX INFO: renamed from: s */
    public final Collection f19927s;

    public zzihu(Collection delegate) {
        AbstractC6452k.m12181e(delegate, "delegate");
        this.f19927s = delegate;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f19927s.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC6452k.m12181e(elements, "elements");
        return this.f19927s.containsAll(elements);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f19927s.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new zzihv(this.f19927s.iterator());
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.f19927s.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC6452k.m12186j(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC6452k.m12181e(array, "array");
        return AbstractC6452k.m12187k(this, array);
    }
}
