package p003C;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p001B.AbstractC0076b;
import p011H.AbstractC0242F;

/* JADX INFO: renamed from: C.q */
/* JADX INFO: loaded from: classes2.dex */
public class C0126q extends AbstractList {

    /* JADX INFO: renamed from: s */
    public final List f190s;

    public C0126q(List list) {
        list.getClass();
        this.f190s = list;
    }

    /* JADX INFO: renamed from: a */
    public final int m210a(int i2) {
        int size = this.f190s.size();
        AbstractC0076b.m135j(i2, size);
        return size - i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        this.f190s.add(m210a(i2), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f190s.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        List list = this.f190s;
        int size = list.size();
        AbstractC0076b.m132g(i2, size);
        return list.get((size - 1) - i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        return new C0125p(this, this.f190s.listIterator(m210a(i2)));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        List list = this.f190s;
        int size = list.size();
        AbstractC0076b.m132g(i2, size);
        return list.remove((size - 1) - i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        subList(i2, i3).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        List list = this.f190s;
        int size = list.size();
        AbstractC0076b.m132g(i2, size);
        return list.set((size - 1) - i2, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f190s.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i3) {
        List list = this.f190s;
        AbstractC0076b.m136k(i2, i3, list.size());
        return AbstractC0242F.m359p(list.subList(m210a(i3), m210a(i2)));
    }
}
