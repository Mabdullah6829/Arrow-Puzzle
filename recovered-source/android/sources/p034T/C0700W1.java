package p034T;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: T.W1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0700W1 {

    /* JADX INFO: renamed from: a */
    public final boolean f1609a;

    /* JADX INFO: renamed from: b */
    public final List f1610b;

    /* JADX INFO: renamed from: c */
    public final Collection f1611c;

    /* JADX INFO: renamed from: d */
    public final Collection f1612d;

    /* JADX INFO: renamed from: e */
    public final int f1613e;

    /* JADX INFO: renamed from: f */
    public final C0709Z1 f1614f;

    /* JADX INFO: renamed from: g */
    public final boolean f1615g;

    /* JADX INFO: renamed from: h */
    public final boolean f1616h;

    public C0700W1(List list, Collection collection, Collection collection2, C0709Z1 c0709z1, boolean z, boolean z2, boolean z3, int i2) {
        this.f1610b = list;
        AbstractC0076b.m133h(collection, "drainedSubstreams");
        this.f1611c = collection;
        this.f1614f = c0709z1;
        this.f1612d = collection2;
        this.f1615g = z;
        this.f1609a = z2;
        this.f1616h = z3;
        this.f1613e = i2;
        AbstractC0076b.m139n(!z2 || list == null, "passThrough should imply buffer is null");
        AbstractC0076b.m139n((z2 && c0709z1 == null) ? false : true, "passThrough should imply winningSubstream != null");
        AbstractC0076b.m139n(!z2 || (collection.size() == 1 && collection.contains(c0709z1)) || (collection.size() == 0 && c0709z1.f1658b), "passThrough should imply winningSubstream is drained");
        AbstractC0076b.m139n((z && c0709z1 == null) ? false : true, "cancelled should imply committed");
    }

    /* JADX INFO: renamed from: a */
    public final C0700W1 m1568a(C0709Z1 c0709z1) {
        Collection collectionUnmodifiableCollection;
        AbstractC0076b.m139n(!this.f1616h, "hedging frozen");
        AbstractC0076b.m139n(this.f1614f == null, "already committed");
        Collection collection = this.f1612d;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(c0709z1);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(c0709z1);
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new C0700W1(this.f1610b, this.f1611c, collectionUnmodifiableCollection, this.f1614f, this.f1615g, this.f1609a, this.f1616h, this.f1613e + 1);
    }

    /* JADX INFO: renamed from: b */
    public final C0700W1 m1569b(C0709Z1 c0709z1) {
        ArrayList arrayList = new ArrayList(this.f1612d);
        arrayList.remove(c0709z1);
        return new C0700W1(this.f1610b, this.f1611c, Collections.unmodifiableCollection(arrayList), this.f1614f, this.f1615g, this.f1609a, this.f1616h, this.f1613e);
    }

    /* JADX INFO: renamed from: c */
    public final C0700W1 m1570c(C0709Z1 c0709z1, C0709Z1 c0709z2) {
        ArrayList arrayList = new ArrayList(this.f1612d);
        arrayList.remove(c0709z1);
        arrayList.add(c0709z2);
        return new C0700W1(this.f1610b, this.f1611c, Collections.unmodifiableCollection(arrayList), this.f1614f, this.f1615g, this.f1609a, this.f1616h, this.f1613e);
    }

    /* JADX INFO: renamed from: d */
    public final C0700W1 m1571d(C0709Z1 c0709z1) {
        c0709z1.f1658b = true;
        Collection collection = this.f1611c;
        if (!collection.contains(c0709z1)) {
            return this;
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.remove(c0709z1);
        return new C0700W1(this.f1610b, Collections.unmodifiableCollection(arrayList), this.f1612d, this.f1614f, this.f1615g, this.f1609a, this.f1616h, this.f1613e);
    }

    /* JADX INFO: renamed from: e */
    public final C0700W1 m1572e(C0709Z1 c0709z1) {
        List list;
        AbstractC0076b.m139n(!this.f1609a, "Already passThrough");
        boolean z = c0709z1.f1658b;
        Collection collectionUnmodifiableCollection = this.f1611c;
        if (!z) {
            if (collectionUnmodifiableCollection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(c0709z1);
            } else {
                ArrayList arrayList = new ArrayList(collectionUnmodifiableCollection);
                arrayList.add(c0709z1);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection = collectionUnmodifiableCollection;
        C0709Z1 c0709z2 = this.f1614f;
        boolean z2 = c0709z2 != null;
        if (z2) {
            AbstractC0076b.m139n(c0709z2 == c0709z1, "Another RPC attempt has already committed");
            list = null;
        } else {
            list = this.f1610b;
        }
        return new C0700W1(list, collection, this.f1612d, this.f1614f, this.f1615g, z2, this.f1616h, this.f1613e);
    }
}
