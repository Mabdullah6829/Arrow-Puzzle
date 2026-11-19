package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzihk {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f19903a;

    /* JADX INFO: renamed from: b */
    public static final Class f19904b;

    /* JADX INFO: renamed from: c */
    public static final zzihj f19905c;

    /* JADX INFO: renamed from: d */
    public static final boolean f19906d;

    /* JADX INFO: renamed from: e */
    public static final long f19907e;

    /* JADX INFO: renamed from: f */
    public static final long f19908f;

    /* JADX INFO: renamed from: g */
    public static final boolean f19909g;

    static {
        boolean z;
        zzihj zzihjVar;
        Unsafe unsafeM8481o = m8481o();
        f19903a = unsafeM8481o;
        int i2 = zzicy.f19697a;
        f19904b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM8482p = m8482p(cls);
        Class cls2 = Integer.TYPE;
        boolean zM8482p2 = m8482p(cls2);
        zzihj zzihhVar = null;
        if (unsafeM8481o != null) {
            if (zM8482p) {
                zzihhVar = new zzihi(unsafeM8481o);
            } else if (zM8482p2) {
                zzihhVar = new zzihh(unsafeM8481o);
            }
        }
        f19905c = zzihhVar;
        if (zzihhVar != null) {
            try {
                Class<?> cls3 = zzihhVar.f19902a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                m8469c();
            } catch (Throwable th) {
                Logger.getLogger(zzihk.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        zzihj zzihjVar2 = f19905c;
        if (zzihjVar2 == null) {
            z = false;
        } else {
            try {
                Class<?> cls4 = zzihjVar2.f19902a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z = true;
            } catch (Throwable th2) {
                Logger.getLogger(zzihk.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z = false;
            }
        }
        f19906d = z;
        f19907e = m8467a(byte[].class);
        m8467a(boolean[].class);
        m8468b(boolean[].class);
        m8467a(int[].class);
        m8468b(int[].class);
        m8467a(long[].class);
        m8468b(long[].class);
        m8467a(float[].class);
        m8468b(float[].class);
        m8467a(double[].class);
        m8468b(double[].class);
        m8467a(Object[].class);
        m8468b(Object[].class);
        Field fieldM8469c = m8469c();
        long jObjectFieldOffset = -1;
        if (fieldM8469c != null && (zzihjVar = f19905c) != null) {
            jObjectFieldOffset = zzihjVar.f19902a.objectFieldOffset(fieldM8469c);
        }
        f19908f = jObjectFieldOffset;
        f19909g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzihk() {
    }

    /* JADX INFO: renamed from: a */
    public static int m8467a(Class cls) {
        if (f19906d) {
            return f19905c.f19902a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static void m8468b(Class cls) {
        if (f19906d) {
            f19905c.f19902a.arrayIndexScale(cls);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Field m8469c() {
        Field declaredField;
        Field declaredField2;
        int i2 = zzicy.f19697a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    /* JADX INFO: renamed from: d */
    public static void m8470d(Object obj, long j2, byte b) {
        Unsafe unsafe = f19905c.f19902a;
        long j3 = (-4) & j2;
        int i2 = unsafe.getInt(obj, j3);
        int i3 = ((~((int) j2)) & 3) << 3;
        unsafe.putInt(obj, j3, ((255 & b) << i3) | (i2 & (~(255 << i3))));
    }

    /* JADX INFO: renamed from: e */
    public static void m8471e(Object obj, long j2, byte b) {
        Unsafe unsafe = f19905c.f19902a;
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        unsafe.putInt(obj, j3, ((255 & b) << i2) | (unsafe.getInt(obj, j3) & (~(255 << i2))));
    }

    /* JADX INFO: renamed from: f */
    public static Object m8472f(Class cls) {
        try {
            return f19903a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m8473g(long j2, Object obj) {
        return f19905c.f19902a.getInt(obj, j2);
    }

    /* JADX INFO: renamed from: h */
    public static void m8474h(Object obj, int i2, long j2) {
        f19905c.f19902a.putInt(obj, j2, i2);
    }

    /* JADX INFO: renamed from: i */
    public static long m8475i(long j2, Object obj) {
        return f19905c.f19902a.getLong(obj, j2);
    }

    /* JADX INFO: renamed from: j */
    public static void m8476j(Object obj, long j2, long j3) {
        f19905c.f19902a.putLong(obj, j2, j3);
    }

    /* JADX INFO: renamed from: k */
    public static Object m8477k(long j2, Object obj) {
        return f19905c.f19902a.getObject(obj, j2);
    }

    /* JADX INFO: renamed from: l */
    public static void m8478l(long j2, Object obj, Object obj2) {
        f19905c.f19902a.putObject(obj, j2, obj2);
    }

    /* JADX INFO: renamed from: m */
    public static void m8479m(byte[] bArr, long j2, byte b) {
        f19905c.mo8459a(bArr, f19907e + j2, b);
    }

    /* JADX INFO: renamed from: n */
    public static long m8480n(ByteBuffer byteBuffer) {
        return f19905c.f19902a.getLong(byteBuffer, f19908f);
    }

    /* JADX INFO: renamed from: o */
    public static Unsafe m8481o() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new zzihg());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(zzihk.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m8482p(Class cls) {
        int i2 = zzicy.f19697a;
        try {
            Class cls2 = f19904b;
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

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ boolean m8483q(long j2, Object obj) {
        return ((byte) ((f19905c.f19902a.getInt(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ boolean m8484r(long j2, Object obj) {
        return ((byte) ((f19905c.f19902a.getInt(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255)) != 0;
    }
}
