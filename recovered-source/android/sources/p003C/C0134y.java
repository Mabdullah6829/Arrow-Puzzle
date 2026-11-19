package p003C;

import java.util.Arrays;
import java.util.Objects;
import p001B.AbstractC0076b;
import p037U0.AbstractC0846b;

/* JADX INFO: renamed from: C.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C0134y extends AbstractC0119j {

    /* JADX INFO: renamed from: y */
    public static final C0134y f204y = new C0134y(new Object[0], 0, null);

    /* JADX INFO: renamed from: v */
    public final transient Object f205v;

    /* JADX INFO: renamed from: w */
    public final transient Object[] f206w;

    /* JADX INFO: renamed from: x */
    public final transient int f207x;

    public C0134y(Object[] objArr, int i2, Object obj) {
        this.f205v = obj;
        this.f206w = objArr;
        this.f207x = i2;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0199  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /* JADX INFO: renamed from: b */
    public static C0134y m211b(int i2, Object[] objArr, C0118i c0118i) {
        boolean z;
        int i3;
        char c;
        ?? r3;
        char c2;
        short[] sArr;
        boolean z2;
        int i4;
        ?? r16;
        boolean z3;
        ?? r4;
        Object[] objArr2;
        C0117h c0117h;
        boolean z4;
        int i5 = i2;
        Object[] objArrCopyOf = objArr;
        if (i5 == 0) {
            return f204y;
        }
        C0117h c0117h2 = null;
        ?? r5 = 0;
        C0117h c0117h3 = null;
        C0117h c0117h4 = null;
        boolean z5 = false;
        int i6 = 1;
        if (i5 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new C0134y(objArrCopyOf, 1, null);
        }
        AbstractC0076b.m135j(i5, objArrCopyOf.length >> 1);
        int iM203m = AbstractC0120k.m203m(i5);
        char c3 = 2;
        if (i5 != 1) {
            int i7 = iM203m - 1;
            if (iM203m <= 128) {
                byte[] bArr = new byte[iM203m];
                Arrays.fill(bArr, (byte) -1);
                int i8 = 0;
                int i9 = 0;
                while (i8 < i5) {
                    int i10 = i8 * 2;
                    int i11 = i9 * 2;
                    Object obj = objArrCopyOf[i10];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i10 ^ i6];
                    Objects.requireNonNull(obj2);
                    int iM1755n = AbstractC0846b.m1755n(obj.hashCode());
                    while (true) {
                        int i12 = iM1755n & i7;
                        z2 = z5;
                        i4 = i6;
                        int i13 = bArr[i12] & 255;
                        if (i13 == 255) {
                            bArr[i12] = (byte) i11;
                            if (i9 < i8) {
                                objArrCopyOf[i11] = obj;
                                objArrCopyOf[i11 ^ 1] = obj2;
                            }
                            i9++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i13 == true ? 1 : 0])) {
                            int i14 = ~i13;
                            Object obj3 = objArrCopyOf[i14 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            c0117h3 = new C0117h(obj, obj2, obj3);
                            objArrCopyOf[i14 == true ? 1 : 0] = obj2;
                            break;
                        }
                        iM1755n = i12 + 1;
                        z5 = z2;
                        i6 = i4;
                    }
                    i8++;
                    z5 = z2;
                    i6 = i4;
                }
                z = z5;
                i3 = i6;
                if (i9 == i5) {
                    r5 = bArr;
                    z4 = z;
                } else {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[i3] = Integer.valueOf(i9);
                    sArr[2] = c0117h3;
                    r5 = sArr;
                    z4 = z;
                }
            } else {
                z = false;
                i3 = 1;
                if (iM203m <= 32768) {
                    sArr = new short[iM203m];
                    Arrays.fill(sArr, (short) -1);
                    int i15 = 0;
                    for (int i16 = 0; i16 < i5; i16++) {
                        int i17 = i16 * 2;
                        int i18 = i15 * 2;
                        Object obj4 = objArrCopyOf[i17];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i17 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iM1755n2 = AbstractC0846b.m1755n(obj4.hashCode());
                        while (true) {
                            int i19 = iM1755n2 & i7;
                            int i20 = sArr[i19] & 65535;
                            if (i20 == 65535) {
                                sArr[i19] = (short) i18;
                                if (i15 < i16) {
                                    objArrCopyOf[i18] = obj4;
                                    objArrCopyOf[i18 ^ 1] = obj5;
                                }
                                i15++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[i20 == true ? 1 : 0])) {
                                int i21 = ~i20;
                                Object obj6 = objArrCopyOf[i21 == true ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                c0117h4 = new C0117h(obj4, obj5, obj6);
                                objArrCopyOf[i21 == true ? 1 : 0] = obj5;
                                break;
                            }
                            iM1755n2 = i19 + 1;
                        }
                    }
                    if (i15 == i5) {
                        r5 = sArr;
                        z4 = z;
                    } else {
                        r5 = new Object[]{sArr, Integer.valueOf(i15), c0117h4};
                        z4 = z;
                    }
                } else {
                    int[] iArr = new int[iM203m];
                    Arrays.fill(iArr, -1);
                    int i22 = 0;
                    int i23 = 0;
                    while (i22 < i5) {
                        int i24 = i22 * 2;
                        int i25 = i23 * 2;
                        Object obj7 = objArrCopyOf[i24];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i24 ^ 1];
                        Objects.requireNonNull(obj8);
                        int iM1755n3 = AbstractC0846b.m1755n(obj7.hashCode());
                        while (true) {
                            int i26 = iM1755n3 & i7;
                            int i27 = iArr[i26];
                            if (i27 == -1) {
                                iArr[i26] = i25;
                                if (i23 < i22) {
                                    objArrCopyOf[i25] = obj7;
                                    objArrCopyOf[i25 ^ 1] = obj8;
                                }
                                i23++;
                                c2 = c3;
                                break;
                            }
                            c2 = c3;
                            if (obj7.equals(objArrCopyOf[i27])) {
                                int i28 = i27 ^ 1;
                                Object obj9 = objArrCopyOf[i28];
                                Objects.requireNonNull(obj9);
                                c0117h2 = new C0117h(obj7, obj8, obj9);
                                objArrCopyOf[i28] = obj8;
                                break;
                            }
                            iM1755n3 = i26 + 1;
                            c3 = c2;
                        }
                        i22++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i23 == i5) {
                        r3 = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i23);
                        objArr3[c] = c0117h2;
                        r3 = objArr3;
                        r16 = z;
                    }
                }
            }
            z3 = r3 instanceof Object[];
            r4 = r3;
            if (z3) {
                objArr2 = (Object[]) r3;
                c0117h = (C0117h) objArr2[c];
                if (c0118i != null) {
                    throw c0117h.m196a();
                }
                c0118i.f175d = c0117h;
                Object obj10 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i3]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                r4 = obj10;
                i5 = iIntValue;
            }
            return new C0134y(objArrCopyOf, i5, r4);
        }
        Objects.requireNonNull(objArrCopyOf[0]);
        Objects.requireNonNull(objArrCopyOf[1]);
        z4 = false;
        i3 = 1;
        c = 2;
        r3 = r5;
        r16 = z4;
        z3 = r3 instanceof Object[];
        r4 = r3;
        if (z3) {
            objArr2 = (Object[]) r3;
            c0117h = (C0117h) objArr2[c];
            if (c0118i != null) {
                throw c0117h.m196a();
            }
            c0118i.f175d = c0117h;
            Object obj11 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i3]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 * 2);
            r4 = obj11;
            i5 = iIntValue2;
        }
        return new C0134y(objArrCopyOf, i5, r4);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // p003C.AbstractC0119j, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f206w;
            if (this.f207x == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f205v;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iM1755n = AbstractC0846b.m1755n(obj.hashCode());
                    while (true) {
                        int i2 = iM1755n & length;
                        int i3 = bArr[i2] & 255;
                        if (i3 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i3])) {
                            obj2 = objArr[i3 ^ 1];
                        } else {
                            iM1755n = i2 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iM1755n2 = AbstractC0846b.m1755n(obj.hashCode());
                    while (true) {
                        int i4 = iM1755n2 & length2;
                        int i5 = sArr[i4] & 65535;
                        if (i5 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i5])) {
                            obj2 = objArr[i5 ^ 1];
                        } else {
                            iM1755n2 = i4 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iM1755n3 = AbstractC0846b.m1755n(obj.hashCode());
                    while (true) {
                        int i6 = iM1755n3 & length3;
                        int i7 = iArr[i6];
                        if (i7 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i7])) {
                            obj2 = objArr[i7 ^ 1];
                        } else {
                            iM1755n3 = i6 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f207x;
    }
}
