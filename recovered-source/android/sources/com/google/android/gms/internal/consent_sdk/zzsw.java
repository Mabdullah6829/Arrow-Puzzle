package com.google.android.gms.internal.consent_sdk;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzsw {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f21823a;

    /* JADX INFO: renamed from: b */
    public static final Class f21824b;

    /* JADX INFO: renamed from: c */
    public static final zzsv f21825c;

    /* JADX INFO: renamed from: d */
    public static final boolean f21826d;

    /* JADX INFO: renamed from: e */
    public static final boolean f21827e;

    /* JADX INFO: renamed from: f */
    public static final long f21828f;

    /* JADX INFO: renamed from: g */
    public static final boolean f21829g;

    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    static {
        boolean z;
        boolean z2;
        zzsv zzsvVar;
        Unsafe unsafeM9291i = m9291i();
        f21823a = unsafeM9291i;
        int i2 = zzpc.f21705a;
        f21824b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM9295m = m9295m(cls);
        Class cls2 = Integer.TYPE;
        boolean zM9295m2 = m9295m(cls2);
        zzsv zzstVar = null;
        if (unsafeM9291i != null) {
            if (zM9295m) {
                zzstVar = new zzsu(unsafeM9291i);
            } else if (zM9295m2) {
                zzstVar = new zzst(unsafeM9291i);
            }
        }
        f21825c = zzstVar;
        if (zzstVar == null) {
            z = false;
        } else {
            try {
                Class<?> cls3 = zzstVar.f21822a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (m9284b() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(zzsw.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        f21826d = z;
        zzsv zzsvVar2 = f21825c;
        if (zzsvVar2 == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls4 = zzsvVar2.f21822a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z2 = true;
            } catch (Throwable th2) {
                Logger.getLogger(zzsw.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z2 = false;
            }
        }
        f21827e = z2;
        f21828f = m9296n(byte[].class);
        m9296n(boolean[].class);
        m9283a(boolean[].class);
        m9296n(int[].class);
        m9283a(int[].class);
        m9296n(long[].class);
        m9283a(long[].class);
        m9296n(float[].class);
        m9283a(float[].class);
        m9296n(double[].class);
        m9283a(double[].class);
        m9296n(Object[].class);
        m9283a(Object[].class);
        Field fieldM9284b = m9284b();
        if (fieldM9284b != null && (zzsvVar = f21825c) != null) {
            zzsvVar.f21822a.objectFieldOffset(fieldM9284b);
        }
        f21829g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzsw() {
    }

    /* JADX INFO: renamed from: a */
    public static void m9283a(Class cls) {
        if (f21827e) {
            f21825c.f21822a.arrayIndexScale(cls);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Field m9284b() {
        Field declaredField;
        Field declaredField2;
        int i2 = zzpc.f21705a;
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

    /* JADX INFO: renamed from: c */
    public static void m9285c(Object obj, long j2, byte b) {
        Unsafe unsafe = f21825c.f21822a;
        long j3 = (-4) & j2;
        int i2 = unsafe.getInt(obj, j3);
        int i3 = ((~((int) j2)) & 3) << 3;
        unsafe.putInt(obj, j3, ((255 & b) << i3) | (i2 & (~(255 << i3))));
    }

    /* JADX INFO: renamed from: d */
    public static void m9286d(Object obj, long j2, byte b) {
        Unsafe unsafe = f21825c.f21822a;
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        unsafe.putInt(obj, j3, ((255 & b) << i2) | (unsafe.getInt(obj, j3) & (~(255 << i2))));
    }

    /* JADX INFO: renamed from: e */
    public static int m9287e(long j2, Object obj) {
        return f21825c.f21822a.getInt(obj, j2);
    }

    /* JADX INFO: renamed from: f */
    public static long m9288f(long j2, Object obj) {
        return f21825c.f21822a.getLong(obj, j2);
    }

    /* JADX INFO: renamed from: g */
    public static Object m9289g(Class cls) {
        try {
            return f21823a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static Object m9290h(long j2, Object obj) {
        return f21825c.f21822a.getObject(obj, j2);
    }

    /* JADX INFO: renamed from: i */
    public static Unsafe m9291i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzss());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m9292j(byte[] bArr, long j2, byte b) {
        f21825c.mo9281c(bArr, f21828f + j2, b);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ boolean m9293k(long j2, Object obj) {
        return ((byte) ((f21825c.f21822a.getInt(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ boolean m9294l(long j2, Object obj) {
        return ((byte) ((f21825c.f21822a.getInt(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m9295m(Class cls) {
        int i2 = zzpc.f21705a;
        try {
            Class cls2 = f21824b;
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
    public static int m9296n(Class cls) {
        if (f21827e) {
            return f21825c.f21822a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
