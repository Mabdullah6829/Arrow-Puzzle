package p034T;

import java.util.Arrays;
import java.util.Set;
import p001B.AbstractC0076b;
import p001B.C0087m;
import p003C.AbstractC0120k;

/* JADX INFO: renamed from: T.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0767o0 {

    /* JADX INFO: renamed from: a */
    public final int f1971a;

    /* JADX INFO: renamed from: b */
    public final long f1972b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0120k f1973c;

    public C0767o0(int i2, long j2, Set set) {
        this.f1971a = i2;
        this.f1972b = j2;
        this.f1973c = AbstractC0120k.m205q(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0767o0.class != obj.getClass()) {
            return false;
        }
        C0767o0 c0767o0 = (C0767o0) obj;
        return this.f1971a == c0767o0.f1971a && this.f1972b == c0767o0.f1972b && AbstractC0076b.m140o(this.f1973c, c0767o0.f1973c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1971a), Long.valueOf(this.f1972b), this.f1973c});
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m160d("maxAttempts", String.valueOf(this.f1971a));
        c0087mM143s.m157a(this.f1972b, "hedgingDelayNanos");
        c0087mM143s.m158b(this.f1973c, "nonFatalStatusCodes");
        return c0087mM143s.toString();
    }
}
