package p034T;

import java.util.Arrays;
import java.util.Set;
import p001B.AbstractC0076b;
import p001B.C0087m;
import p003C.AbstractC0120k;

/* JADX INFO: renamed from: T.b2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0717b2 {

    /* JADX INFO: renamed from: a */
    public final int f1699a;

    /* JADX INFO: renamed from: b */
    public final long f1700b;

    /* JADX INFO: renamed from: c */
    public final long f1701c;

    /* JADX INFO: renamed from: d */
    public final double f1702d;

    /* JADX INFO: renamed from: e */
    public final Long f1703e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0120k f1704f;

    public C0717b2(int i2, long j2, long j3, double d, Long l2, Set set) {
        this.f1699a = i2;
        this.f1700b = j2;
        this.f1701c = j3;
        this.f1702d = d;
        this.f1703e = l2;
        this.f1704f = AbstractC0120k.m205q(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0717b2)) {
            return false;
        }
        C0717b2 c0717b2 = (C0717b2) obj;
        return this.f1699a == c0717b2.f1699a && this.f1700b == c0717b2.f1700b && this.f1701c == c0717b2.f1701c && Double.compare(this.f1702d, c0717b2.f1702d) == 0 && AbstractC0076b.m140o(this.f1703e, c0717b2.f1703e) && AbstractC0076b.m140o(this.f1704f, c0717b2.f1704f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1699a), Long.valueOf(this.f1700b), Long.valueOf(this.f1701c), Double.valueOf(this.f1702d), this.f1703e, this.f1704f});
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m160d("maxAttempts", String.valueOf(this.f1699a));
        c0087mM143s.m157a(this.f1700b, "initialBackoffNanos");
        c0087mM143s.m157a(this.f1701c, "maxBackoffNanos");
        c0087mM143s.m160d("backoffMultiplier", String.valueOf(this.f1702d));
        c0087mM143s.m158b(this.f1703e, "perAttemptRecvTimeoutNanos");
        c0087mM143s.m158b(this.f1704f, "retryableStatusCodes");
        return c0087mM143s.toString();
    }
}
