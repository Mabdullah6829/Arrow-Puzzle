package p057d0;

import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: renamed from: d0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6280b implements Comparable {

    /* JADX INFO: renamed from: t */
    public static final C6280b f24305t = new C6280b();

    /* JADX INFO: renamed from: s */
    public final int f24306s = 131328;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C6280b other = (C6280b) obj;
        AbstractC6452k.m12181e(other, "other");
        return this.f24306s - other.f24306s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C6280b c6280b = obj instanceof C6280b ? (C6280b) obj : null;
        return c6280b != null && this.f24306s == c6280b.f24306s;
    }

    public final int hashCode() {
        return this.f24306s;
    }

    public final String toString() {
        return "2.1.0";
    }
}
