package p003C;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: C.m */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0122m extends AbstractC0120k implements NavigableSet, InterfaceC0108C {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ int f182x = 0;

    /* JADX INFO: renamed from: v */
    public final transient Comparator f183v;

    /* JADX INFO: renamed from: w */
    public transient AbstractC0122m f184w;

    public AbstractC0122m(Comparator comparator) {
        this.f183v = comparator;
    }

    /* JADX INFO: renamed from: s */
    public static C0106A m208s(Comparator comparator) {
        return C0127r.f191s.equals(comparator) ? C0106A.f154z : new C0106A(C0129t.f192w, comparator);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f183v;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        AbstractC0122m abstractC0122mM208s = this.f184w;
        if (abstractC0122mM208s == null) {
            C0106A c0106a = (C0106A) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(c0106a.f183v);
            abstractC0122mM208s = c0106a.isEmpty() ? m208s(comparatorReverseOrder) : new C0106A(c0106a.f155y.mo189t(), comparatorReverseOrder);
            this.f184w = abstractC0122mM208s;
            abstractC0122mM208s.f184w = this;
        }
        return abstractC0122mM208s;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        C0106A c0106a = (C0106A) this;
        return c0106a.m181u(0, c0106a.m182v(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final C0106A subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        AbstractC0076b.m130e(this.f183v.compare(obj, obj2) <= 0);
        C0106A c0106a = (C0106A) this;
        C0106A c0106aM181u = c0106a.m181u(c0106a.m183w(obj, z), c0106a.f155y.size());
        return c0106aM181u.m181u(0, c0106aM181u.m182v(obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        C0106A c0106a = (C0106A) this;
        return c0106a.m181u(c0106a.m183w(obj, z), c0106a.f155y.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        C0106A c0106a = (C0106A) this;
        return c0106a.m181u(0, c0106a.m182v(obj, false));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        C0106A c0106a = (C0106A) this;
        return c0106a.m181u(c0106a.m183w(obj, true), c0106a.f155y.size());
    }
}
