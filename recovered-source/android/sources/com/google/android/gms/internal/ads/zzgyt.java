package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgyt extends zzgww {

    /* JADX INFO: renamed from: y */
    public static final zzgww f18367y = new zzgyt(new Object[0], 0, null);

    /* JADX INFO: renamed from: v */
    public final transient Object f18368v;

    /* JADX INFO: renamed from: w */
    public final transient Object[] f18369w;

    /* JADX INFO: renamed from: x */
    public final transient int f18370x;

    public zzgyt(Object[] objArr, int i2, Object obj) {
        this.f18368v = obj;
        this.f18369w = objArr;
        this.f18370x = i2;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /* JADX INFO: renamed from: e */
    public static zzgyt m7265e(int i2, Object[] objArr, zzgwv zzgwvVar) {
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
        zzgwu zzgwuVar;
        boolean z4;
        int i5 = i2;
        Object[] objArrCopyOf = objArr;
        if (i5 == 0) {
            return (zzgyt) f18367y;
        }
        zzgwu zzgwuVar2 = null;
        ?? r5 = 0;
        zzgwu zzgwuVar3 = null;
        zzgwu zzgwuVar4 = null;
        boolean z5 = false;
        int i6 = 1;
        if (i5 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new zzgyt(objArrCopyOf, 1, null);
        }
        zzgtr.m7137j(i5, objArrCopyOf.length >> 1);
        int iM7240q = zzgxd.m7240q(i5);
        char c3 = 2;
        if (i5 != 1) {
            int i7 = iM7240q - 1;
            if (iM7240q <= 128) {
                byte[] bArr = new byte[iM7240q];
                Arrays.fill(bArr, (byte) -1);
                int i8 = 0;
                int i9 = 0;
                while (i8 < i5) {
                    int i10 = i9 + i9;
                    int i11 = i8 + i8;
                    Object obj = objArrCopyOf[i11];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i11 ^ i6];
                    Objects.requireNonNull(obj2);
                    int iM7200a = zzgwm.m7200a(obj.hashCode());
                    while (true) {
                        int i12 = iM7200a & i7;
                        z2 = z5;
                        i4 = i6;
                        int i13 = bArr[i12] & 255;
                        if (i13 == 255) {
                            bArr[i12] = (byte) i10;
                            if (i9 < i8) {
                                objArrCopyOf[i10] = obj;
                                objArrCopyOf[i10 ^ 1] = obj2;
                            }
                            i9++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i13 == true ? 1 : 0])) {
                            int i14 = ~i13;
                            Object obj3 = objArrCopyOf[i14 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            zzgwu zzgwuVar5 = new zzgwu(obj, obj2, obj3);
                            objArrCopyOf[i14 == true ? 1 : 0] = obj2;
                            zzgwuVar3 = zzgwuVar5;
                            break;
                        }
                        iM7200a = i12 + 1;
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
                    sArr[2] = zzgwuVar3;
                    r5 = sArr;
                    z4 = z;
                }
            } else {
                z = false;
                i3 = 1;
                if (iM7240q <= 32768) {
                    sArr = new short[iM7240q];
                    Arrays.fill(sArr, (short) -1);
                    int i15 = 0;
                    for (int i16 = 0; i16 < i5; i16++) {
                        int i17 = i15 + i15;
                        int i18 = i16 + i16;
                        Object obj4 = objArrCopyOf[i18];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i18 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iM7200a2 = zzgwm.m7200a(obj4.hashCode());
                        while (true) {
                            int i19 = iM7200a2 & i7;
                            char c4 = (char) sArr[i19];
                            if (c4 == 65535) {
                                sArr[i19] = (short) i17;
                                if (i15 < i16) {
                                    objArrCopyOf[i17] = obj4;
                                    objArrCopyOf[i17 ^ 1] = obj5;
                                }
                                i15++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[c4])) {
                                int i20 = c4 ^ 1;
                                Object obj6 = objArrCopyOf[i20 == true ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                zzgwu zzgwuVar6 = new zzgwu(obj4, obj5, obj6);
                                objArrCopyOf[i20 == true ? 1 : 0] = obj5;
                                zzgwuVar4 = zzgwuVar6;
                                break;
                            }
                            iM7200a2 = i19 + 1;
                        }
                    }
                    if (i15 == i5) {
                        r5 = sArr;
                        z4 = z;
                    } else {
                        r5 = new Object[]{sArr, Integer.valueOf(i15), zzgwuVar4};
                        z4 = z;
                    }
                } else {
                    int[] iArr = new int[iM7240q];
                    Arrays.fill(iArr, -1);
                    int i21 = 0;
                    int i22 = 0;
                    while (i21 < i5) {
                        int i23 = i22 + i22;
                        int i24 = i21 + i21;
                        Object obj7 = objArrCopyOf[i24];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i24 ^ 1];
                        Objects.requireNonNull(obj8);
                        int iM7200a3 = zzgwm.m7200a(obj7.hashCode());
                        while (true) {
                            int i25 = iM7200a3 & i7;
                            int i26 = iArr[i25];
                            if (i26 == -1) {
                                iArr[i25] = i23;
                                if (i22 < i21) {
                                    objArrCopyOf[i23] = obj7;
                                    objArrCopyOf[i23 ^ 1] = obj8;
                                }
                                i22++;
                                c2 = c3;
                                break;
                            }
                            c2 = c3;
                            if (obj7.equals(objArrCopyOf[i26])) {
                                int i27 = i26 ^ 1;
                                Object obj9 = objArrCopyOf[i27];
                                Objects.requireNonNull(obj9);
                                zzgwu zzgwuVar7 = new zzgwu(obj7, obj8, obj9);
                                objArrCopyOf[i27] = obj8;
                                zzgwuVar2 = zzgwuVar7;
                                break;
                            }
                            iM7200a3 = i25 + 1;
                            c3 = c2;
                        }
                        i21++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i22 == i5) {
                        r3 = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i22);
                        objArr3[c] = zzgwuVar2;
                        r3 = objArr3;
                        r16 = z;
                    }
                }
            }
            z3 = r3 instanceof Object[];
            r4 = r3;
            if (z3) {
                objArr2 = (Object[]) r3;
                zzgwuVar = (zzgwu) objArr2[c];
                if (zzgwvVar != null) {
                    throw zzgwuVar.m7224a();
                }
                zzgwvVar.f18309c = zzgwuVar;
                Object obj10 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i3]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r4 = obj10;
                i5 = iIntValue;
            }
            return new zzgyt(objArrCopyOf, i5, r4);
        }
        Objects.requireNonNull(objArrCopyOf[0]);
        Objects.requireNonNull(objArrCopyOf[1]);
        z4 = false;
        i5 = 1;
        i3 = 1;
        c = 2;
        r3 = r5;
        r16 = z4;
        z3 = r3 instanceof Object[];
        r4 = r3;
        if (z3) {
            objArr2 = (Object[]) r3;
            zzgwuVar = (zzgwu) objArr2[c];
            if (zzgwvVar != null) {
                throw zzgwuVar.m7224a();
            }
            zzgwvVar.f18309c = zzgwuVar;
            Object obj11 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i3]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r4 = obj11;
            i5 = iIntValue2;
        }
        return new zzgyt(objArrCopyOf, i5, r4);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    /* JADX INFO: renamed from: b */
    public final zzgxd mo7230b() {
        return new zzgyq(this, this.f18369w, this.f18370x);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    /* JADX INFO: renamed from: c */
    public final zzgxd mo7231c() {
        return new zzgyr(this, new zzgys(this.f18369w, 0, this.f18370x));
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    /* JADX INFO: renamed from: d */
    public final zzgwp mo7232d() {
        return new zzgys(this.f18369w, 1, this.f18370x);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.ads.zzgww, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i2 = this.f18370x;
            Object[] objArr = this.f18369w;
            if (i2 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f18368v;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iM7200a = zzgwm.m7200a(obj.hashCode());
                    while (true) {
                        int i3 = iM7200a & length;
                        int i4 = bArr[i3] & 255;
                        if (i4 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i4])) {
                            obj2 = objArr[i4 ^ 1];
                        } else {
                            iM7200a = i3 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iM7200a2 = zzgwm.m7200a(obj.hashCode());
                    while (true) {
                        int i5 = iM7200a2 & length2;
                        char c = (char) sArr[i5];
                        if (c == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c])) {
                            obj2 = objArr[c ^ 1];
                        } else {
                            iM7200a2 = i5 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iM7200a3 = zzgwm.m7200a(obj.hashCode());
                    while (true) {
                        int i6 = iM7200a3 & length3;
                        int i7 = iArr[i6];
                        if (i7 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i7])) {
                            obj2 = objArr[i7 ^ 1];
                        } else {
                            iM7200a3 = i6 + 1;
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
        return this.f18370x;
    }
}
