package p034T;

import java.util.Random;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: T.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0727e0 {

    /* JADX INFO: renamed from: a */
    public Random f1837a;

    /* JADX INFO: renamed from: b */
    public long f1838b;

    /* JADX INFO: renamed from: c */
    public double f1839c;

    /* JADX INFO: renamed from: d */
    public double f1840d;

    /* JADX INFO: renamed from: e */
    public long f1841e;

    /* JADX INFO: renamed from: a */
    public final long m1608a() {
        long j2 = this.f1841e;
        double d = j2;
        this.f1841e = Math.min((long) (this.f1839c * d), this.f1838b);
        double d2 = this.f1840d;
        double d3 = (-d2) * d;
        double d4 = d2 * d;
        AbstractC0076b.m130e(d4 >= d3);
        return j2 + ((long) ((this.f1837a.nextDouble() * (d4 - d3)) + d3));
    }
}
