package p011H;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import p043a.AbstractC0878a;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: H.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C0288q extends AbstractC0878a {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f554a;

    /* JADX INFO: renamed from: b */
    public static final long f555b;

    /* JADX INFO: renamed from: c */
    public static final long f556c;

    /* JADX INFO: renamed from: d */
    public static final long f557d;

    /* JADX INFO: renamed from: e */
    public static final long f558e;

    /* JADX INFO: renamed from: f */
    public static final long f559f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C0287p());
        }
        try {
            f556c = unsafe.objectFieldOffset(AbstractC0290s.class.getDeclaredField("u"));
            f555b = unsafe.objectFieldOffset(AbstractC0290s.class.getDeclaredField("t"));
            f557d = unsafe.objectFieldOffset(AbstractC0290s.class.getDeclaredField("s"));
            f558e = unsafe.objectFieldOffset(C0289r.class.getDeclaredField("a"));
            f559f = unsafe.objectFieldOffset(C0289r.class.getDeclaredField("b"));
            f554a = unsafe;
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        } catch (RuntimeException e3) {
            throw e3;
        }
    }

    @Override // p043a.AbstractC0878a
    /* JADX INFO: renamed from: c */
    public final boolean mo418c(AbstractC0290s abstractC0290s, C0274g c0274g, C0274g c0274g2) {
        return AbstractC0285n.m426a(f554a, abstractC0290s, f555b, c0274g, c0274g2);
    }

    @Override // p043a.AbstractC0878a
    /* JADX INFO: renamed from: d */
    public final boolean mo419d(AbstractC0290s abstractC0290s, Object obj, Object obj2) {
        return AbstractC0286o.m427a(f554a, abstractC0290s, f557d, obj, obj2);
    }

    @Override // p043a.AbstractC0878a
    /* JADX INFO: renamed from: e */
    public final boolean mo420e(AbstractC0290s abstractC0290s, C0289r c0289r, C0289r c0289r2) {
        return AbstractC0284m.m425a(f554a, abstractC0290s, f556c, c0289r, c0289r2);
    }

    @Override // p043a.AbstractC0878a
    /* JADX INFO: renamed from: i */
    public final C0274g mo421i(AbstractC0290s abstractC0290s) {
        C0274g c0274g;
        C0274g c0274g2 = C0274g.f535d;
        do {
            c0274g = abstractC0290s.f568t;
            if (c0274g2 == c0274g) {
                break;
            }
        } while (!mo418c(abstractC0290s, c0274g, c0274g2));
        return c0274g;
    }

    @Override // p043a.AbstractC0878a
    /* JADX INFO: renamed from: j */
    public final C0289r mo422j(AbstractC0290s abstractC0290s) {
        C0289r c0289r;
        C0289r c0289r2 = C0289r.f560c;
        do {
            c0289r = abstractC0290s.f569u;
            if (c0289r2 == c0289r) {
                break;
            }
        } while (!mo420e(abstractC0290s, c0289r, c0289r2));
        return c0289r;
    }

    @Override // p043a.AbstractC0878a
    /* JADX INFO: renamed from: p */
    public final void mo423p(C0289r c0289r, C0289r c0289r2) {
        f554a.putObject(c0289r, f559f, c0289r2);
    }

    @Override // p043a.AbstractC0878a
    /* JADX INFO: renamed from: q */
    public final void mo424q(C0289r c0289r, Thread thread) {
        f554a.putObject(c0289r, f558e, thread);
    }
}
