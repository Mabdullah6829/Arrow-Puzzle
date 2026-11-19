package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.c1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6220c1 {

    /* JADX INFO: renamed from: a */
    public final Unsafe f24159a;

    public AbstractC6220c1(Unsafe unsafe) {
        this.f24159a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public final int m11850a(Class cls) {
        return this.f24159a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: b */
    public final int m11851b(Class cls) {
        return this.f24159a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo11834c(long j2, byte[] bArr, long j3, long j4);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo11835d(Object obj, long j2);

    /* JADX INFO: renamed from: e */
    public abstract byte mo11836e(long j2);

    /* JADX INFO: renamed from: f */
    public abstract byte mo11837f(Object obj, long j2);

    /* JADX INFO: renamed from: g */
    public abstract double mo11838g(Object obj, long j2);

    /* JADX INFO: renamed from: h */
    public abstract float mo11839h(Object obj, long j2);

    /* JADX INFO: renamed from: i */
    public final int m11852i(Object obj, long j2) {
        return this.f24159a.getInt(obj, j2);
    }

    /* JADX INFO: renamed from: j */
    public final long m11853j(Object obj, long j2) {
        return this.f24159a.getLong(obj, j2);
    }

    /* JADX INFO: renamed from: k */
    public final Object m11854k(Object obj, long j2) {
        return this.f24159a.getObject(obj, j2);
    }

    /* JADX INFO: renamed from: l */
    public final long m11855l(Field field) {
        return this.f24159a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo11840m(Object obj, long j2, boolean z);

    /* JADX INFO: renamed from: n */
    public abstract void mo11841n(Object obj, long j2, byte b);

    /* JADX INFO: renamed from: o */
    public abstract void mo11842o(Object obj, long j2, double d);

    /* JADX INFO: renamed from: p */
    public abstract void mo11843p(Object obj, long j2, float f2);

    /* JADX INFO: renamed from: q */
    public final void m11856q(Object obj, long j2, int i2) {
        this.f24159a.putInt(obj, j2, i2);
    }

    /* JADX INFO: renamed from: r */
    public final void m11857r(Object obj, long j2, long j3) {
        this.f24159a.putLong(obj, j2, j3);
    }

    /* JADX INFO: renamed from: s */
    public final void m11858s(Object obj, long j2, Object obj2) {
        this.f24159a.putObject(obj, j2, obj2);
    }

    /* JADX INFO: renamed from: t */
    public boolean mo11848t() {
        Unsafe unsafe = this.f24159a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            AbstractC6223d1.m11860a(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: u */
    public abstract boolean mo11844u();
}
