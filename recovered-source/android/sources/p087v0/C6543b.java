package p087v0;

import java.util.Iterator;
import p022N.AbstractC0355G;
import p080q0.InterfaceC6520a;

/* JADX INFO: renamed from: v0.b */
/* JADX INFO: loaded from: classes.dex */
public class C6543b implements Iterable, InterfaceC6520a {

    /* JADX INFO: renamed from: s */
    public final int f24767s;

    /* JADX INFO: renamed from: t */
    public final int f24768t;

    /* JADX INFO: renamed from: u */
    public final int f24769u;

    public C6543b(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f24767s = i2;
        this.f24768t = AbstractC0355G.m555i(i2, i3, i4);
        this.f24769u = i4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6543b)) {
            return false;
        }
        if (isEmpty() && ((C6543b) obj).isEmpty()) {
            return true;
        }
        C6543b c6543b = (C6543b) obj;
        return this.f24767s == c6543b.f24767s && this.f24768t == c6543b.f24768t && this.f24769u == c6543b.f24769u;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f24767s * 31) + this.f24768t) * 31) + this.f24769u;
    }

    public boolean isEmpty() {
        int i2 = this.f24769u;
        int i3 = this.f24768t;
        int i4 = this.f24767s;
        if (i2 > 0) {
            return i4 > i3;
        }
        return i4 < i3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6544c(this.f24767s, this.f24768t, this.f24769u);
    }

    public String toString() {
        StringBuilder sb;
        int i2 = this.f24768t;
        int i3 = this.f24767s;
        int i4 = this.f24769u;
        if (i4 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i2);
            sb.append(" step ");
            sb.append(i4);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i2);
            sb.append(" step ");
            sb.append(-i4);
        }
        return sb.toString();
    }
}
