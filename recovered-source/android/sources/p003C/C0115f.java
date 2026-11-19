package p003C;

import java.util.Iterator;
import java.util.ListIterator;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: C.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C0115f extends AbstractC0116g {

    /* JADX INFO: renamed from: u */
    public final transient int f165u;

    /* JADX INFO: renamed from: v */
    public final transient int f166v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractC0116g f167w;

    public C0115f(AbstractC0116g abstractC0116g, int i2, int i3) {
        this.f167w = abstractC0116g;
        this.f165u = i2;
        this.f166v = i3;
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: d */
    public final Object[] mo176d() {
        return this.f167w.mo176d();
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: g */
    public final int mo177g() {
        return this.f167w.mo178h() + this.f165u + this.f166v;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        AbstractC0076b.m132g(i2, this.f166v);
        return this.f167w.get(i2 + this.f165u);
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: h */
    public final int mo178h() {
        return this.f167w.mo178h() + this.f165u;
    }

    @Override // p003C.AbstractC0116g, p003C.AbstractC0111b, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: j */
    public final boolean mo179j() {
        return true;
    }

    @Override // p003C.AbstractC0116g, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f166v;
    }

    @Override // p003C.AbstractC0116g, java.util.List
    /* JADX INFO: renamed from: u */
    public final AbstractC0116g subList(int i2, int i3) {
        AbstractC0076b.m136k(i2, i3, this.f166v);
        int i4 = this.f165u;
        return this.f167w.subList(i2 + i4, i3 + i4);
    }

    @Override // p003C.AbstractC0116g, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
        return listIterator(i2);
    }
}
