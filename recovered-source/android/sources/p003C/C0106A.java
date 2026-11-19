package p003C;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import p037U0.AbstractC0846b;

/* JADX INFO: renamed from: C.A */
/* JADX INFO: loaded from: classes2.dex */
public final class C0106A extends AbstractC0122m {

    /* JADX INFO: renamed from: z */
    public static final C0106A f154z;

    /* JADX INFO: renamed from: y */
    public final transient AbstractC0116g f155y;

    static {
        C0113d c0113d = AbstractC0116g.f168t;
        f154z = new C0106A(C0129t.f192w, C0127r.f191s);
    }

    public C0106A(AbstractC0116g abstractC0116g, Comparator comparator) {
        super(comparator);
        this.f155y = abstractC0116g;
    }

    @Override // p003C.AbstractC0120k, p003C.AbstractC0111b
    /* JADX INFO: renamed from: a */
    public final AbstractC0116g mo174a() {
        return this.f155y;
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: b */
    public final int mo175b(int i2, Object[] objArr) {
        return this.f155y.mo175b(i2, objArr);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iM183w = m183w(obj, true);
        AbstractC0116g abstractC0116g = this.f155y;
        if (iM183w == abstractC0116g.size()) {
            return null;
        }
        return abstractC0116g.get(iM183w);
    }

    @Override // p003C.AbstractC0111b, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f155y, obj, this.f183v) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Comparator comparator = this.f183v;
        if (!AbstractC0846b.m1751j(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        AbstractC0109D it = iterator();
        Iterator it2 = collection.iterator();
        C0113d c0113d = (C0113d) it;
        if (!c0113d.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = c0113d.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!c0113d.hasNext()) {
                        return false;
                    }
                    next2 = c0113d.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: d */
    public final Object[] mo176d() {
        return this.f155y.mo176d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f155y.mo189t().listIterator(0);
    }

    @Override // p003C.AbstractC0120k, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f155y.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f183v;
        if (!AbstractC0846b.m1751j(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            AbstractC0109D it2 = iterator();
            do {
                C0113d c0113d = (C0113d) it2;
                if (!c0113d.hasNext()) {
                    return true;
                }
                next = c0113d.next();
                next2 = it.next();
                if (next2 == null) {
                    return false;
                }
            } while (comparator.compare(next, next2) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f155y.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iM182v = m182v(obj, true) - 1;
        if (iM182v == -1) {
            return null;
        }
        return this.f155y.get(iM182v);
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: g */
    public final int mo177g() {
        return this.f155y.mo177g();
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: h */
    public final int mo178h() {
        return this.f155y.mo178h();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iM183w = m183w(obj, false);
        AbstractC0116g abstractC0116g = this.f155y;
        if (iM183w == abstractC0116g.size()) {
            return null;
        }
        return abstractC0116g.get(iM183w);
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: j */
    public final boolean mo179j() {
        return this.f155y.mo179j();
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: k */
    public final AbstractC0109D iterator() {
        return this.f155y.listIterator(0);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        AbstractC0116g abstractC0116g = this.f155y;
        return abstractC0116g.get(abstractC0116g.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iM182v = m182v(obj, false) - 1;
        if (iM182v == -1) {
            return null;
        }
        return this.f155y.get(iM182v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f155y.size();
    }

    /* JADX INFO: renamed from: u */
    public final C0106A m181u(int i2, int i3) {
        AbstractC0116g abstractC0116g = this.f155y;
        if (i2 == 0 && i3 == abstractC0116g.size()) {
            return this;
        }
        Comparator comparator = this.f183v;
        return i2 < i3 ? new C0106A(abstractC0116g.subList(i2, i3), comparator) : AbstractC0122m.m208s(comparator);
    }

    /* JADX INFO: renamed from: v */
    public final int m182v(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f155y, obj, this.f183v);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    /* JADX INFO: renamed from: w */
    public final int m183w(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f155y, obj, this.f183v);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }
}
