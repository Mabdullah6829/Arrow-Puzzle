package p034T;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p030R.AbstractC0570n;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.x */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0800x implements Runnable {

    /* JADX INFO: renamed from: s */
    public final long f2087s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C0803y f2088t;

    public RunnableC0800x(C0803y c0803y, long j2) {
        this.f2088t = c0803y;
        this.f2087s = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0783s0 c0783s0 = new C0783s0(0, (byte) 0);
        C0803y c0803y = this.f2088t;
        c0803y.f2103i.mo1543e(c0783s0);
        long j2 = this.f2087s;
        long jAbs = Math.abs(j2);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long nanos = jAbs / timeUnit.toNanos(1L);
        long jAbs2 = Math.abs(j2) % timeUnit.toNanos(1L);
        StringBuilder sb = new StringBuilder("deadline exceeded after ");
        if (j2 < 0) {
            sb.append('-');
        }
        sb.append(nanos);
        Locale locale = Locale.US;
        sb.append(String.format(locale, ".%09d", Long.valueOf(jAbs2)));
        sb.append("s. ");
        Long l2 = (Long) c0803y.f2102h.m1290a(AbstractC0570n.f1216a);
        sb.append(String.format(locale, "Name resolution delay %.9f seconds. ", Double.valueOf(l2 == null ? 0.0d : l2.longValue() / C0803y.f2094q)));
        sb.append(c0783s0);
        c0803y.f2103i.mo1548j(C0589w0.f1278h.m1351a(sb.toString()));
    }
}
