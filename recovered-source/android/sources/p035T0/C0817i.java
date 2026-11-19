package p035T0;

import java.util.Comparator;
import p033S0.C0627u;

/* JADX INFO: renamed from: T0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0817i implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0627u c0627u = ((C0816h) obj).f2134a;
        C0627u c0627u2 = ((C0816h) obj2).f2134a;
        if (c0627u == c0627u2) {
            return 0;
        }
        if (c0627u == null) {
            return -1;
        }
        if (c0627u2 == null) {
            return 1;
        }
        return c0627u.compareTo(c0627u2);
    }
}
