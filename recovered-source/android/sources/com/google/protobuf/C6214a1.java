package com.google.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class C6214a1 extends AbstractC6220c1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f24137b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6214a1(Unsafe unsafe, int i2) {
        super(unsafe);
        this.f24137b = i2;
    }

    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: c */
    public final void mo11834c(long j2, byte[] bArr, long j3, long j4) {
        switch (this.f24137b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: d */
    public final boolean mo11835d(Object obj, long j2) {
        switch (this.f24137b) {
            case 0:
                if (AbstractC6223d1.f24169h) {
                    if (AbstractC6223d1.m11867h(obj, j2) == 0) {
                        return false;
                    }
                } else if (AbstractC6223d1.m11868i(obj, j2) == 0) {
                    return false;
                }
                return true;
            default:
                if (AbstractC6223d1.f24169h) {
                    if (AbstractC6223d1.m11867h(obj, j2) == 0) {
                        return false;
                    }
                } else if (AbstractC6223d1.m11868i(obj, j2) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: e */
    public final byte mo11836e(long j2) {
        switch (this.f24137b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: f */
    public final byte mo11837f(Object obj, long j2) {
        switch (this.f24137b) {
            case 0:
                return AbstractC6223d1.f24169h ? AbstractC6223d1.m11867h(obj, j2) : AbstractC6223d1.m11868i(obj, j2);
            default:
                return AbstractC6223d1.f24169h ? AbstractC6223d1.m11867h(obj, j2) : AbstractC6223d1.m11868i(obj, j2);
        }
    }

    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: g */
    public final double mo11838g(Object obj, long j2) {
        switch (this.f24137b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(m11853j(obj, j2));
    }

    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: h */
    public final float mo11839h(Object obj, long j2) {
        switch (this.f24137b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(m11852i(obj, j2));
    }

    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: m */
    public final void mo11840m(Object obj, long j2, boolean z) {
        switch (this.f24137b) {
            case 0:
                if (!AbstractC6223d1.f24169h) {
                    AbstractC6223d1.m11872m(obj, j2, z ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC6223d1.m11871l(obj, j2, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!AbstractC6223d1.f24169h) {
                    AbstractC6223d1.m11872m(obj, j2, z ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC6223d1.m11871l(obj, j2, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: n */
    public final void mo11841n(Object obj, long j2, byte b) {
        switch (this.f24137b) {
            case 0:
                if (!AbstractC6223d1.f24169h) {
                    AbstractC6223d1.m11872m(obj, j2, b);
                } else {
                    AbstractC6223d1.m11871l(obj, j2, b);
                }
                break;
            default:
                if (!AbstractC6223d1.f24169h) {
                    AbstractC6223d1.m11872m(obj, j2, b);
                } else {
                    AbstractC6223d1.m11871l(obj, j2, b);
                }
                break;
        }
    }

    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: o */
    public final void mo11842o(Object obj, long j2, double d) {
        switch (this.f24137b) {
            case 0:
                m11857r(obj, j2, Double.doubleToLongBits(d));
                break;
            default:
                m11857r(obj, j2, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: p */
    public final void mo11843p(Object obj, long j2, float f2) {
        switch (this.f24137b) {
            case 0:
                m11856q(obj, j2, Float.floatToIntBits(f2));
                break;
            default:
                m11856q(obj, j2, Float.floatToIntBits(f2));
                break;
        }
    }

    @Override // com.google.protobuf.AbstractC6220c1
    /* JADX INFO: renamed from: u */
    public final boolean mo11844u() {
        switch (this.f24137b) {
        }
        return false;
    }
}
