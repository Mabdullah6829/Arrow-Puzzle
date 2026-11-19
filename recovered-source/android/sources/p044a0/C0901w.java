package p044a0;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import p001B.AbstractC0076b;
import p001B.C0087m;
import p030R.AbstractC0536S;
import p030R.C0534P;
import p034T.C0641C1;

/* JADX INFO: renamed from: a0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0901w extends AbstractC0536S {

    /* JADX INFO: renamed from: a */
    public final ArrayList f2532a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f2533b;

    /* JADX INFO: renamed from: c */
    public final int f2534c;

    public C0901w(ArrayList arrayList, AtomicInteger atomicInteger) {
        AbstractC0076b.m131f(!arrayList.isEmpty(), "empty list");
        this.f2532a = arrayList;
        AbstractC0076b.m133h(atomicInteger, FirebaseAnalytics.Param.INDEX);
        this.f2533b = atomicInteger;
        int size = arrayList.size();
        int iHashCode = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            iHashCode += ((AbstractC0536S) obj).hashCode();
        }
        this.f2534c = iHashCode;
    }

    @Override // p030R.AbstractC0536S
    /* JADX INFO: renamed from: a */
    public final C0534P mo1262a(C0641C1 c0641c1) {
        int andIncrement = this.f2533b.getAndIncrement() & Integer.MAX_VALUE;
        ArrayList arrayList = this.f2532a;
        return ((AbstractC0536S) arrayList.get(andIncrement % arrayList.size())).mo1262a(c0641c1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0901w)) {
            return false;
        }
        C0901w c0901w = (C0901w) obj;
        if (c0901w == this) {
            return true;
        }
        int i2 = c0901w.f2534c;
        ArrayList arrayList = c0901w.f2532a;
        if (this.f2534c != i2 || this.f2533b != c0901w.f2533b) {
            return false;
        }
        ArrayList arrayList2 = this.f2532a;
        return arrayList2.size() == arrayList.size() && new HashSet(arrayList2).containsAll(arrayList);
    }

    public final int hashCode() {
        return this.f2534c;
    }

    public final String toString() {
        C0087m c0087m = new C0087m(C0901w.class.getSimpleName());
        c0087m.m158b(this.f2532a, "subchannelPickers");
        return c0087m.toString();
    }
}
