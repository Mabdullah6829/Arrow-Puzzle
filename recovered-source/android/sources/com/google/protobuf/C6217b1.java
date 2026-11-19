package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C6217b1 extends AbstractC6220c1 {
    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: c */
    public final void mo11834c(long j2, byte[] bArr, long j3, long j4) {
        this.f24159a.copyMemory((Object) null, j2, bArr, AbstractC6223d1.f24167f + j3, j4);
    }

    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: d */
    public final boolean mo11835d(Object obj, long j2) {
        return this.f24159a.getBoolean(obj, j2);
    }

    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: e */
    public final byte mo11836e(long j2) {
        return this.f24159a.getByte(j2);
    }

    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: f */
    public final byte mo11837f(Object obj, long j2) {
        return this.f24159a.getByte(obj, j2);
    }

    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: g */
    public final double mo11838g(Object obj, long j2) {
        return this.f24159a.getDouble(obj, j2);
    }

    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: h */
    public final float mo11839h(Object obj, long j2) {
        return this.f24159a.getFloat(obj, j2);
    }

    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: m */
    public final void mo11840m(Object obj, long j2, boolean z) {
        this.f24159a.putBoolean(obj, j2, z);
    }

    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: n */
    public final void mo11841n(Object obj, long j2, byte b) {
        this.f24159a.putByte(obj, j2, b);
    }

    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: o */
    public final void mo11842o(Object obj, long j2, double d) {
        this.f24159a.putDouble(obj, j2, d);
    }

    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: p */
    public final void mo11843p(Object obj, long j2, float f2) {
        this.f24159a.putFloat(obj, j2, f2);
    }

    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: t */
    public final boolean mo11848t() {
        if (!super.mo11848t()) {
            return false;
        }
        try {
            Class<?> cls = this.f24159a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            AbstractC6223d1.m11860a(th);
            return false;
        }
    }

    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: u */
    public final boolean mo11844u() {
        Unsafe unsafe = this.f24159a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (AbstractC6223d1.m11864e() != null) {
                    try {
                        Class<?> cls3 = this.f24159a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        AbstractC6223d1.m11860a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                AbstractC6223d1.m11860a(th2);
            }
        }
        return false;
    }
}
