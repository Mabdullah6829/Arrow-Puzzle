package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaga {

    /* JADX INFO: renamed from: f */
    public static final zzaga f22121f = new zzaga(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f22122a;

    /* JADX INFO: renamed from: b */
    public int[] f22123b;

    /* JADX INFO: renamed from: c */
    public Object[] f22124c;

    /* JADX INFO: renamed from: d */
    public int f22125d;

    /* JADX INFO: renamed from: e */
    public boolean f22126e;

    public zzaga(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f22125d = -1;
        this.f22122a = i2;
        this.f22123b = iArr;
        this.f22124c = objArr;
        this.f22126e = z;
    }

    /* JADX INFO: renamed from: a */
    public static zzaga m9686a() {
        return new zzaga(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: b */
    public final void m9687b(zzadb zzadbVar) {
        zzada zzadaVar = zzadbVar.f22006a;
        if (this.f22122a != 0) {
            for (int i2 = 0; i2 < this.f22122a; i2++) {
                int i3 = this.f22123b[i2];
                Object obj = this.f22124c[i2];
                int i4 = i3 & 7;
                int i5 = i3 >>> 3;
                if (i4 == 0) {
                    zzadbVar.m9516d(i5, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zzadbVar.m9523k(i5, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zzadbVar.m9526n(i5, (zzacr) obj);
                } else if (i4 == 3) {
                    zzadaVar.mo9481e(i5, 3);
                    ((zzaga) obj).m9687b(zzadbVar);
                    zzadaVar.mo9481e(i5, 4);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(new zzaeg());
                    }
                    zzadbVar.m9524l(i5, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m9688c() {
        int iM9510b;
        int iM9511c;
        int iM9510b2;
        int i2 = this.f22125d;
        if (i2 != -1) {
            return i2;
        }
        int iM2458y = 0;
        for (int i3 = 0; i3 < this.f22122a; i3++) {
            int i4 = this.f22123b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        int i7 = i5 << 3;
                        zzacr zzacrVar = (zzacr) this.f22124c[i3];
                        int iM9510b3 = zzada.m9510b(i7);
                        int iMo9373b = zzacrVar.mo9373b();
                        iM2458y = AbstractC1456a.m2458y(iMo9373b, iMo9373b, iM9510b3, iM2458y);
                    } else if (i6 == 3) {
                        int iM9510b4 = zzada.m9510b(i5 << 3);
                        iM9510b = iM9510b4 + iM9510b4;
                        iM9511c = ((zzaga) this.f22124c[i3]).m9688c();
                    } else {
                        if (i6 != 5) {
                            throw new IllegalStateException(new zzaeg());
                        }
                        ((Integer) this.f22124c[i3]).getClass();
                        iM9510b2 = zzada.m9510b(i5 << 3) + 4;
                    }
                } else {
                    ((Long) this.f22124c[i3]).getClass();
                    iM9510b2 = zzada.m9510b(i5 << 3) + 8;
                }
                iM2458y = iM9510b2 + iM2458y;
            } else {
                int i8 = i5 << 3;
                long jLongValue = ((Long) this.f22124c[i3]).longValue();
                iM9510b = zzada.m9510b(i8);
                iM9511c = zzada.m9511c(jLongValue);
            }
            iM2458y = iM9511c + iM9510b + iM2458y;
        }
        this.f22125d = iM2458y;
        return iM2458y;
    }

    /* JADX INFO: renamed from: d */
    public final void m9689d(int i2, Object obj) {
        if (!this.f22126e) {
            throw new UnsupportedOperationException();
        }
        m9690e(this.f22122a + 1);
        int[] iArr = this.f22123b;
        int i3 = this.f22122a;
        iArr[i3] = i2;
        this.f22124c[i3] = obj;
        this.f22122a = i3 + 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m9690e(int i2) {
        int[] iArr = this.f22123b;
        if (i2 > iArr.length) {
            int i3 = this.f22122a;
            int i4 = (i3 / 2) + i3;
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.f22123b = Arrays.copyOf(iArr, i2);
            this.f22124c = Arrays.copyOf(this.f22124c, i2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzaga)) {
            return false;
        }
        zzaga zzagaVar = (zzaga) obj;
        int i2 = this.f22122a;
        if (i2 == zzagaVar.f22122a) {
            int[] iArr = this.f22123b;
            int[] iArr2 = zzagaVar.f22123b;
            for (int i3 = 0; i3 < i2; i3++) {
                if (iArr[i3] == iArr2[i3]) {
                }
            }
            Object[] objArr = this.f22124c;
            Object[] objArr2 = zzagaVar.f22124c;
            int i4 = this.f22122a;
            for (int i5 = 0; i5 < i4; i5++) {
                if (objArr[i5].equals(objArr2[i5])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f22122a;
        int i3 = i2 + 527;
        int[] iArr = this.f22123b;
        int iHashCode = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i3 * 31) + i4) * 31;
        Object[] objArr = this.f22124c;
        int i7 = this.f22122a;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode = (iHashCode * 31) + objArr[i8].hashCode();
        }
        return i6 + iHashCode;
    }

    private zzaga() {
        this(0, new int[8], new Object[8], true);
    }
}
