package p030R;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: R.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0588w implements Comparable {

    /* JADX INFO: renamed from: v */
    public static final C0572o f1267v = new C0572o(3);

    /* JADX INFO: renamed from: w */
    public static final long f1268w;

    /* JADX INFO: renamed from: x */
    public static final long f1269x;

    /* JADX INFO: renamed from: y */
    public static final long f1270y;

    /* JADX INFO: renamed from: s */
    public final C0572o f1271s;

    /* JADX INFO: renamed from: t */
    public final long f1272t;

    /* JADX INFO: renamed from: u */
    public volatile boolean f1273u;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f1268w = nanos;
        f1269x = -nanos;
        f1270y = TimeUnit.SECONDS.toNanos(1L);
    }

    public C0588w(long j2) {
        C0572o c0572o = f1267v;
        long jNanoTime = System.nanoTime();
        this.f1271s = c0572o;
        long jMin = Math.min(f1268w, Math.max(f1269x, j2));
        this.f1272t = jNanoTime + jMin;
        this.f1273u = jMin <= 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1346b() {
        if (!this.f1273u) {
            long j2 = this.f1272t;
            this.f1271s.getClass();
            if (j2 - System.nanoTime() > 0) {
                return false;
            }
            this.f1273u = true;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final long m1347c() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.f1271s.getClass();
        long jNanoTime = System.nanoTime();
        if (!this.f1273u && this.f1272t - jNanoTime <= 0) {
            this.f1273u = true;
        }
        return timeUnit.convert(this.f1272t - jNanoTime, timeUnit);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0588w c0588w = (C0588w) obj;
        C0572o c0572o = c0588w.f1271s;
        C0572o c0572o2 = this.f1271s;
        if (c0572o2 == c0572o) {
            long j2 = this.f1272t - c0588w.f1272t;
            if (j2 < 0) {
                return -1;
            }
            return j2 > 0 ? 1 : 0;
        }
        throw new AssertionError("Tickers (" + c0572o2 + " and " + c0588w.f1271s + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0588w)) {
            return false;
        }
        C0588w c0588w = (C0588w) obj;
        C0572o c0572o = this.f1271s;
        if (c0572o != null ? c0572o == c0588w.f1271s : c0588w.f1271s == null) {
            return this.f1272t == c0588w.f1272t;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.asList(this.f1271s, Long.valueOf(this.f1272t)).hashCode();
    }

    public final String toString() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jM1347c = m1347c();
        long jAbs = Math.abs(jM1347c);
        long j2 = f1270y;
        long j3 = jAbs / j2;
        long jAbs2 = Math.abs(jM1347c) % j2;
        StringBuilder sb = new StringBuilder();
        if (jM1347c < 0) {
            sb.append('-');
        }
        sb.append(j3);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        C0572o c0572o = f1267v;
        C0572o c0572o2 = this.f1271s;
        if (c0572o2 != c0572o) {
            sb.append(" (ticker=" + c0572o2 + ")");
        }
        return sb.toString();
    }
}
