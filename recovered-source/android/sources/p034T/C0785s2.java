package p034T;

import java.io.OutputStream;
import java.net.ProxySelector;
import java.nio.ByteBuffer;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p001B.AbstractC0076b;
import p001B.C0096v;
import p001B.InterfaceC0097w;
import p030R.AbstractC0530L;
import p030R.InterfaceC0551d0;
import p030R.InterfaceC0557g0;

/* JADX INFO: renamed from: T.s2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0785s2 implements InterfaceC0648F, InterfaceC0769o2, InterfaceC0097w, InterfaceC0551d0, InterfaceC0557g0 {

    /* JADX INFO: renamed from: t */
    public static final C0785s2 f2037t = new C0785s2(0);

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2038s;

    public /* synthetic */ C0785s2(int i2) {
        this.f2038s = i2;
    }

    /* JADX INFO: renamed from: h */
    public static C0727e0 m1660h() {
        C0727e0 c0727e0 = new C0727e0();
        c0727e0.f1837a = new Random();
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        c0727e0.f1838b = TimeUnit.MINUTES.toNanos(2L);
        c0727e0.f1839c = 1.6d;
        c0727e0.f1840d = 0.2d;
        c0727e0.f1841e = nanos;
        return c0727e0;
    }

    @Override // p030R.InterfaceC0557g0
    /* JADX INFO: renamed from: a */
    public byte[] mo1292a(Object obj) {
        switch (this.f2038s) {
            case 11:
                return (byte[]) obj;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // p034T.InterfaceC0769o2
    /* JADX INFO: renamed from: b */
    public Object mo1646b() {
        switch (this.f2038s) {
            case 8:
                return Executors.newCachedThreadPool(AbstractC0759m0.m1624e("grpc-default-executor-%d"));
            default:
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, AbstractC0759m0.m1624e("grpc-timer-%d"));
                try {
                    scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
                    break;
                } catch (NoSuchMethodException unused) {
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
                return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
        }
    }

    @Override // p034T.InterfaceC0648F
    /* JADX INFO: renamed from: c */
    public int mo1489c(AbstractC0722d abstractC0722d, int i2, Object obj, int i3) {
        switch (this.f2038s) {
            case 2:
                return abstractC0722d.mo1495o();
            case 3:
                abstractC0722d.mo1498u(i2);
                return 0;
            case 4:
                abstractC0722d.mo1494n((byte[]) obj, i3, i2);
                return i3 + i2;
            case 5:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + i2);
                abstractC0722d.mo1493l(byteBuffer);
                byteBuffer.limit(iLimit);
                return 0;
            default:
                abstractC0722d.mo1492j((OutputStream) obj, i2);
                return 0;
        }
    }

    @Override // p034T.InterfaceC0769o2
    /* JADX INFO: renamed from: d */
    public void mo1647d(Object obj) {
        switch (this.f2038s) {
            case 8:
                ((ExecutorService) ((Executor) obj)).shutdown();
                break;
            default:
                ((ScheduledExecutorService) obj).shutdown();
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public long m1661e() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    @Override // p030R.InterfaceC0551d0
    /* JADX INFO: renamed from: f */
    public Object mo1288f(String str) {
        AbstractC0076b.m131f(str.length() > 0, "empty timeout");
        AbstractC0076b.m131f(str.length() <= 9, "bad timeout format");
        long j2 = Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(j2));
        }
        if (cCharAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(j2));
        }
        if (cCharAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(j2));
        }
        if (cCharAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j2));
        }
        if (cCharAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j2));
        }
        if (cCharAt == 'n') {
            return Long.valueOf(j2);
        }
        throw new IllegalArgumentException("Invalid timeout unit: " + cCharAt);
    }

    @Override // p030R.InterfaceC0557g0
    /* JADX INFO: renamed from: g */
    public Object mo1293g(byte[] bArr) {
        switch (this.f2038s) {
            case 11:
                return bArr;
            default:
                if (bArr.length < 3) {
                    throw new NumberFormatException("Malformed status code ".concat(new String(bArr, AbstractC0530L.f1127a)));
                }
                return Integer.valueOf((bArr[2] - 48) + ((bArr[1] - 48) * 10) + ((bArr[0] - 48) * 100));
        }
    }

    @Override // p001B.InterfaceC0097w
    public Object get() {
        switch (this.f2038s) {
            case 10:
                return new C0096v();
            default:
                return ProxySelector.getDefault();
        }
    }

    public String toString() {
        switch (this.f2038s) {
            case 8:
                return "grpc-default-executor";
            default:
                return super.toString();
        }
    }

    @Override // p030R.InterfaceC0551d0
    /* JADX INFO: renamed from: a */
    public String mo1287a(Object obj) {
        Long l2 = (Long) obj;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (l2.longValue() < 0) {
            throw new IllegalArgumentException("Timeout too small");
        }
        if (l2.longValue() < 100000000) {
            return l2 + "n";
        }
        if (l2.longValue() < 100000000000L) {
            return timeUnit.toMicros(l2.longValue()) + "u";
        }
        if (l2.longValue() < 100000000000000L) {
            return timeUnit.toMillis(l2.longValue()) + "m";
        }
        if (l2.longValue() < 100000000000000000L) {
            return timeUnit.toSeconds(l2.longValue()) + "S";
        }
        if (l2.longValue() < 6000000000000000000L) {
            return timeUnit.toMinutes(l2.longValue()) + "M";
        }
        return timeUnit.toHours(l2.longValue()) + "H";
    }
}
