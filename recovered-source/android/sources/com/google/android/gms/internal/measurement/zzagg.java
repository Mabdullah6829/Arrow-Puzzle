package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzagg {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f22128a;

    /* JADX INFO: renamed from: b */
    public static final Class f22129b;

    /* JADX INFO: renamed from: c */
    public static final zzagf f22130c;

    /* JADX INFO: renamed from: d */
    public static final boolean f22131d;

    /* JADX INFO: renamed from: e */
    public static final long f22132e;

    /* JADX INFO: renamed from: f */
    public static final boolean f22133f;

    static {
        boolean z;
        zzagf zzagfVar;
        Unsafe unsafeM9709l = m9709l();
        f22128a = unsafeM9709l;
        int i2 = zzacf.f21956a;
        f22129b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM9710m = m9710m(cls);
        Class cls2 = Integer.TYPE;
        boolean zM9710m2 = m9710m(cls2);
        zzagf zzagdVar = null;
        if (unsafeM9709l != null) {
            if (zM9710m) {
                zzagdVar = new zzage(unsafeM9709l);
            } else if (zM9710m2) {
                zzagdVar = new zzagd(unsafeM9709l);
            }
        }
        f22130c = zzagdVar;
        if (zzagdVar != null) {
            try {
                Class<?> cls3 = zzagdVar.f22127a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                m9698a();
            } catch (Throwable th) {
                Logger.getLogger(zzagg.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        zzagf zzagfVar2 = f22130c;
        if (zzagfVar2 == null) {
            z = false;
        } else {
            try {
                Class<?> cls4 = zzagfVar2.f22127a.getClass();
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
                Logger.getLogger(zzagg.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z = false;
            }
        }
        f22131d = z;
        f22132e = m9713p(byte[].class);
        m9713p(boolean[].class);
        m9714q(boolean[].class);
        m9713p(int[].class);
        m9714q(int[].class);
        m9713p(long[].class);
        m9714q(long[].class);
        m9713p(float[].class);
        m9714q(float[].class);
        m9713p(double[].class);
        m9714q(double[].class);
        m9713p(Object[].class);
        m9714q(Object[].class);
        Field fieldM9698a = m9698a();
        if (fieldM9698a != null && (zzagfVar = f22130c) != null) {
            zzagfVar.f22127a.objectFieldOffset(fieldM9698a);
        }
        f22133f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzagg() {
    }

    /* JADX INFO: renamed from: a */
    public static Field m9698a() {
        Field declaredField;
        Field declaredField2;
        int i2 = zzacf.f21956a;
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

    /* JADX INFO: renamed from: b */
    public static void m9699b(Object obj, long j2, byte b) {
        Unsafe unsafe = f22130c.f22127a;
        long j3 = (-4) & j2;
        int i2 = unsafe.getInt(obj, j3);
        int i3 = ((~((int) j2)) & 3) << 3;
        unsafe.putInt(obj, j3, ((255 & b) << i3) | (i2 & (~(255 << i3))));
    }

    /* JADX INFO: renamed from: c */
    public static void m9700c(Object obj, long j2, byte b) {
        Unsafe unsafe = f22130c.f22127a;
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        unsafe.putInt(obj, j3, ((255 & b) << i2) | (unsafe.getInt(obj, j3) & (~(255 << i2))));
    }

    /* JADX INFO: renamed from: d */
    public static Object m9701d(Class cls) {
        try {
            return f22128a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m9702e(long j2, Object obj) {
        return f22130c.f22127a.getInt(obj, j2);
    }

    /* JADX INFO: renamed from: f */
    public static void m9703f(Object obj, int i2, long j2) {
        f22130c.f22127a.putInt(obj, j2, i2);
    }

    /* JADX INFO: renamed from: g */
    public static long m9704g(long j2, Object obj) {
        return f22130c.f22127a.getLong(obj, j2);
    }

    /* JADX INFO: renamed from: h */
    public static void m9705h(Object obj, long j2, long j3) {
        f22130c.f22127a.putLong(obj, j2, j3);
    }

    /* JADX INFO: renamed from: i */
    public static Object m9706i(long j2, Object obj) {
        return f22130c.f22127a.getObject(obj, j2);
    }

    /* JADX INFO: renamed from: j */
    public static void m9707j(long j2, Object obj, Object obj2) {
        f22130c.f22127a.putObject(obj, j2, obj2);
    }

    /* JADX INFO: renamed from: k */
    public static void m9708k(byte[] bArr, long j2, byte b) {
        f22130c.mo9691a(bArr, f22132e + j2, b);
    }

    /* JADX INFO: renamed from: l */
    public static Unsafe m9709l() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new zzagc());
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
            Logger.getLogger(zzagg.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m9710m(Class cls) {
        int i2 = zzacf.f21956a;
        try {
            Class cls2 = f22129b;
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

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m9711n(long j2, Object obj) {
        return ((byte) ((f22130c.f22127a.getInt(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m9712o(long j2, Object obj) {
        return ((byte) ((f22130c.f22127a.getInt(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: p */
    public static int m9713p(Class cls) {
        if (f22131d) {
            return f22130c.f22127a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: q */
    public static void m9714q(Class cls) {
        if (f22131d) {
            f22130c.f22127a.arrayIndexScale(cls);
        }
    }
}
