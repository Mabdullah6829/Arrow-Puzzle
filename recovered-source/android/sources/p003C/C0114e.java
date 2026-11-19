package p003C;

import java.util.Iterator;
import java.util.ListIterator;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: C.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C0114e extends AbstractC0116g {

    /* JADX INFO: renamed from: u */
    public final transient AbstractC0116g f164u;

    public C0114e(AbstractC0116g abstractC0116g) {
        this.f164u = abstractC0116g;
    }

    @Override // p003C.AbstractC0116g, p003C.AbstractC0111b, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f164u.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i2) {
        AbstractC0116g abstractC0116g = this.f164u;
        AbstractC0076b.m132g(i2, abstractC0116g.size());
        return abstractC0116g.get((abstractC0116g.size() - 1) - i2);
    }

    @Override // p003C.AbstractC0116g, java.util.List
    public final int indexOf(Object obj) {
        AbstractC0116g abstractC0116g = this.f164u;
        int iLastIndexOf = abstractC0116g.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (abstractC0116g.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // p003C.AbstractC0116g, p003C.AbstractC0111b, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: j */
    public final boolean mo179j() {
        return this.f164u.mo179j();
    }

    @Override // p003C.AbstractC0116g, java.util.List
    public final int lastIndexOf(Object obj) {
        AbstractC0116g abstractC0116g = this.f164u;
        int iIndexOf = abstractC0116g.indexOf(obj);
        if (iIndexOf >= 0) {
            return (abstractC0116g.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // p003C.AbstractC0116g, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f164u.size();
    }

    @Override // p003C.AbstractC0116g
    /* JADX INFO: renamed from: t */
    public final AbstractC0116g mo189t() {
        return this.f164u;
    }

    @Override // p003C.AbstractC0116g, java.util.List
    /* JADX INFO: renamed from: u */
    public final AbstractC0116g subList(int i2, int i3) {
        AbstractC0116g abstractC0116g = this.f164u;
        AbstractC0076b.m136k(i2, i3, abstractC0116g.size());
        return abstractC0116g.subList(abstractC0116g.size() - i3, abstractC0116g.size() - i2).mo189t();
    }

    @Override // p003C.AbstractC0116g, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
        return listIterator(i2);
    }
}
