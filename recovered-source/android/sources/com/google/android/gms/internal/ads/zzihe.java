package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzihe {

    /* JADX INFO: renamed from: f */
    public static final zzihe f19896f = new zzihe(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f19897a;

    /* JADX INFO: renamed from: b */
    public int[] f19898b;

    /* JADX INFO: renamed from: c */
    public Object[] f19899c;

    /* JADX INFO: renamed from: d */
    public int f19900d;

    /* JADX INFO: renamed from: e */
    public boolean f19901e;

    public zzihe(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f19900d = -1;
        this.f19897a = i2;
        this.f19898b = iArr;
        this.f19899c = objArr;
        this.f19901e = z;
    }

    /* JADX INFO: renamed from: a */
    public static zzihe m8454a() {
        return new zzihe();
    }

    /* JADX INFO: renamed from: b */
    public final void m8455b(zzidv zzidvVar) {
        zzidu zziduVar = zzidvVar.f19752a;
        if (this.f19897a != 0) {
            for (int i2 = 0; i2 < this.f19897a; i2++) {
                int i3 = this.f19898b[i2];
                Object obj = this.f19899c[i2];
                int i4 = i3 & 7;
                int i5 = i3 >>> 3;
                if (i4 == 0) {
                    zzidvVar.m8284b(i5, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zzidvVar.m8291i(i5, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zzidvVar.m8294l(i5, (zzidl) obj);
                } else if (i4 == 3) {
                    zziduVar.mo8251e(i5, 3);
                    ((zzihe) obj).m8455b(zzidvVar);
                    zziduVar.mo8251e(i5, 4);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(new zzifg());
                    }
                    zzidvVar.m8292j(i5, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m8456c() {
        int iM8280b;
        int iM8281c;
        int iM8280b2;
        int i2 = this.f19900d;
        if (i2 != -1) {
            return i2;
        }
        int iM3777i = 0;
        for (int i3 = 0; i3 < this.f19897a; i3++) {
            int i4 = this.f19898b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        int i7 = i5 << 3;
                        zzidl zzidlVar = (zzidl) this.f19899c[i3];
                        int iM8280b3 = zzidu.m8280b(i7);
                        int iMo8132h = zzidlVar.mo8132h();
                        iM3777i = AbstractC5152f.m3777i(iMo8132h, iMo8132h, iM8280b3, iM3777i);
                    } else if (i6 == 3) {
                        int iM8280b4 = zzidu.m8280b(i5 << 3);
                        iM8280b = iM8280b4 + iM8280b4;
                        iM8281c = ((zzihe) this.f19899c[i3]).m8456c();
                    } else {
                        if (i6 != 5) {
                            throw new IllegalStateException(new zzifg());
                        }
                        ((Integer) this.f19899c[i3]).getClass();
                        iM8280b2 = zzidu.m8280b(i5 << 3) + 4;
                    }
                } else {
                    ((Long) this.f19899c[i3]).getClass();
                    iM8280b2 = zzidu.m8280b(i5 << 3) + 8;
                }
                iM3777i = iM8280b2 + iM3777i;
            } else {
                int i8 = i5 << 3;
                long jLongValue = ((Long) this.f19899c[i3]).longValue();
                iM8280b = zzidu.m8280b(i8);
                iM8281c = zzidu.m8281c(jLongValue);
            }
            iM3777i = iM8281c + iM8280b + iM3777i;
        }
        this.f19900d = iM3777i;
        return iM3777i;
    }

    /* JADX INFO: renamed from: d */
    public final void m8457d(int i2, Object obj) {
        if (!this.f19901e) {
            throw new UnsupportedOperationException();
        }
        m8458e(this.f19897a + 1);
        int[] iArr = this.f19898b;
        int i3 = this.f19897a;
        iArr[i3] = i2;
        this.f19899c[i3] = obj;
        this.f19897a = i3 + 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m8458e(int i2) {
        int[] iArr = this.f19898b;
        if (i2 > iArr.length) {
            int i3 = this.f19897a;
            int i4 = (i3 / 2) + i3;
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.f19898b = Arrays.copyOf(iArr, i2);
            this.f19899c = Arrays.copyOf(this.f19899c, i2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzihe)) {
            return false;
        }
        zzihe zziheVar = (zzihe) obj;
        int i2 = this.f19897a;
        if (i2 == zziheVar.f19897a) {
            int[] iArr = this.f19898b;
            int[] iArr2 = zziheVar.f19898b;
            for (int i3 = 0; i3 < i2; i3++) {
                if (iArr[i3] == iArr2[i3]) {
                }
            }
            Object[] objArr = this.f19899c;
            Object[] objArr2 = zziheVar.f19899c;
            int i4 = this.f19897a;
            for (int i5 = 0; i5 < i4; i5++) {
                if (objArr[i5].equals(objArr2[i5])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f19897a;
        int i3 = i2 + 527;
        int[] iArr = this.f19898b;
        int iHashCode = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i3 * 31) + i4) * 31;
        Object[] objArr = this.f19899c;
        int i7 = this.f19897a;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode = (iHashCode * 31) + objArr[i8].hashCode();
        }
        return i6 + iHashCode;
    }

    private zzihe() {
        this(0, new int[8], new Object[8], true);
    }
}
