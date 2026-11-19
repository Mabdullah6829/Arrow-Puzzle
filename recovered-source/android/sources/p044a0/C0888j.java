package p044a0;

import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p001B.AbstractC0076b;
import p030R.C0594z;

/* JADX INFO: renamed from: a0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0888j {

    /* JADX INFO: renamed from: a */
    public final String[] f2488a;

    /* JADX INFO: renamed from: b */
    public final int f2489b;

    public C0888j(C0594z c0594z) {
        AbstractC0076b.m133h(c0594z, "eag");
        List list = c0594z.f1305a;
        this.f2488a = new String[list.size()];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            this.f2488a[i2] = ((SocketAddress) it.next()).toString();
            i2++;
        }
        Arrays.sort(this.f2488a);
        this.f2489b = Arrays.hashCode(this.f2488a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0888j)) {
            return false;
        }
        C0888j c0888j = (C0888j) obj;
        if (c0888j.f2489b == this.f2489b) {
            String[] strArr = c0888j.f2488a;
            int length = strArr.length;
            String[] strArr2 = this.f2488a;
            if (length == strArr2.length) {
                return Arrays.equals(strArr, strArr2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2489b;
    }

    public final String toString() {
        return Arrays.toString(this.f2488a);
    }
}
