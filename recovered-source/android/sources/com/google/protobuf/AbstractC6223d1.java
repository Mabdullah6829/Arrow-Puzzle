package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.d1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6223d1 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f24162a;

    /* JADX INFO: renamed from: b */
    public static final Class f24163b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC6220c1 f24164c;

    /* JADX INFO: renamed from: d */
    public static final boolean f24165d;

    /* JADX INFO: renamed from: e */
    public static final boolean f24166e;

    /* JADX INFO: renamed from: f */
    public static final long f24167f;

    /* JADX INFO: renamed from: g */
    public static final long f24168g;

    /* JADX INFO: renamed from: h */
    public static final boolean f24169h;

    static {
        Unsafe unsafeM11869j = m11869j();
        f24162a = unsafeM11869j;
        f24163b = AbstractC6224e.f24170a;
        boolean zM11865f = m11865f(Long.TYPE);
        boolean zM11865f2 = m11865f(Integer.TYPE);
        AbstractC6220c1 c6217b1 = null;
        if (unsafeM11869j != null) {
            if (!AbstractC6224e.m11876a()) {
                c6217b1 = new C6217b1(unsafeM11869j);
            } else if (zM11865f) {
                c6217b1 = new C6214a1(unsafeM11869j, 1);
            } else if (zM11865f2) {
                c6217b1 = new C6214a1(unsafeM11869j, 0);
            }
        }
        f24164c = c6217b1;
        f24165d = c6217b1 == null ? false : c6217b1.mo11844u();
        f24166e = c6217b1 == null ? false : c6217b1.mo11848t();
        f24167f = m11862c(byte[].class);
        m11862c(boolean[].class);
        m11863d(boolean[].class);
        m11862c(int[].class);
        m11863d(int[].class);
        m11862c(long[].class);
        m11863d(long[].class);
        m11862c(float[].class);
        m11863d(float[].class);
        m11862c(double[].class);
        m11863d(double[].class);
        m11862c(Object[].class);
        m11863d(Object[].class);
        Field fieldM11864e = m11864e();
        f24168g = (fieldM11864e == null || c6217b1 == null) ? -1L : c6217b1.m11855l(fieldM11864e);
        f24169h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m11860a(Throwable th) {
        Logger.getLogger(AbstractC6223d1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: renamed from: b */
    public static Object m11861b(Class cls) {
        try {
            return f24162a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m11862c(Class cls) {
        if (f24166e) {
            return f24164c.m11850a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static void m11863d(Class cls) {
        if (f24166e) {
            f24164c.m11851b(cls);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Field m11864e() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC6224e.m11876a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m11865f(Class cls) {
        if (!AbstractC6224e.m11876a()) {
            return false;
        }
        try {
            Class cls2 = f24163b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static byte m11866g(byte[] bArr, long j2) {
        return f24164c.mo11837f(bArr, f24167f + j2);
    }

    /* JADX INFO: renamed from: h */
    public static byte m11867h(Object obj, long j2) {
        return (byte) ((f24164c.m11852i(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: i */
    public static byte m11868i(Object obj, long j2) {
        return (byte) ((f24164c.m11852i(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: j */
    public static Unsafe m11869j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C6211Z0());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m11870k(byte[] bArr, long j2, byte b) {
        f24164c.mo11841n(bArr, f24167f + j2, b);
    }

    /* JADX INFO: renamed from: l */
    public static void m11871l(Object obj, long j2, byte b) {
        long j3 = (-4) & j2;
        int iM11852i = f24164c.m11852i(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        m11873n(obj, j3, ((255 & b) << i2) | (iM11852i & (~(255 << i2))));
    }

    /* JADX INFO: renamed from: m */
    public static void m11872m(Object obj, long j2, byte b) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        m11873n(obj, j3, ((255 & b) << i2) | (f24164c.m11852i(obj, j3) & (~(255 << i2))));
    }

    /* JADX INFO: renamed from: n */
    public static void m11873n(Object obj, long j2, int i2) {
        f24164c.m11856q(obj, j2, i2);
    }

    /* JADX INFO: renamed from: o */
    public static void m11874o(Object obj, long j2, long j3) {
        f24164c.m11857r(obj, j2, j3);
    }

    /* JADX INFO: renamed from: p */
    public static void m11875p(Object obj, long j2, Object obj2) {
        f24164c.m11858s(obj, j2, obj2);
    }
}
