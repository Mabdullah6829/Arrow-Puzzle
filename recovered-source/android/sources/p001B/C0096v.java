package p001B;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: B.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C0096v {

    /* JADX INFO: renamed from: a */
    public final C0073C f138a = AbstractC0074D.f100a;

    /* JADX INFO: renamed from: b */
    public boolean f139b;

    /* JADX INFO: renamed from: c */
    public long f140c;

    /* JADX INFO: renamed from: a */
    public final long m168a() {
        long jNanoTime;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.f139b) {
            this.f138a.getClass();
            jNanoTime = System.nanoTime() - this.f140c;
        } else {
            jNanoTime = 0;
        }
        return timeUnit.convert(jNanoTime, timeUnit);
    }

    /* JADX INFO: renamed from: b */
    public final void m169b() {
        AbstractC0076b.m139n(!this.f139b, "This stopwatch is already running.");
        this.f139b = true;
        this.f138a.getClass();
        this.f140c = System.nanoTime();
    }

    public final String toString() {
        long jNanoTime;
        String str;
        if (this.f139b) {
            this.f138a.getClass();
            jNanoTime = System.nanoTime() - this.f140c;
        } else {
            jNanoTime = 0;
        }
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        double dConvert = jNanoTime / timeUnit2.convert(1L, timeUnit);
        StringBuilder sb = new StringBuilder();
        int i2 = AbstractC0089o.f119a;
        sb.append(String.format(Locale.ROOT, "%.4g", Double.valueOf(dConvert)));
        sb.append(" ");
        switch (AbstractC0095u.f137a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        sb.append(str);
        return sb.toString();
    }
}
