package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p011H.AbstractC0271e0;
import p072l.AbstractC6468c;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6268v0 implements InterfaceC6178I0 {

    /* JADX INFO: renamed from: n */
    public static final int[] f24274n = new int[0];

    /* JADX INFO: renamed from: o */
    public static final Unsafe f24275o = AbstractC6223d1.m11869j();

    /* JADX INFO: renamed from: a */
    public final int[] f24276a;

    /* JADX INFO: renamed from: b */
    public final Object[] f24277b;

    /* JADX INFO: renamed from: c */
    public final int f24278c;

    /* JADX INFO: renamed from: d */
    public final int f24279d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC6262s0 f24280e;

    /* JADX INFO: renamed from: f */
    public final boolean f24281f;

    /* JADX INFO: renamed from: g */
    public final int[] f24282g;

    /* JADX INFO: renamed from: h */
    public final int f24283h;

    /* JADX INFO: renamed from: i */
    public final int f24284i;

    /* JADX INFO: renamed from: j */
    public final C6272x0 f24285j;

    /* JADX INFO: renamed from: k */
    public final AbstractC6234h0 f24286k;

    /* JADX INFO: renamed from: l */
    public final AbstractC6199T0 f24287l;

    /* JADX INFO: renamed from: m */
    public final C6254o0 f24288m;

    public C6268v0(int[] iArr, Object[] objArr, int i2, int i3, InterfaceC6262s0 interfaceC6262s0, int[] iArr2, int i4, int i5, C6272x0 c6272x0, AbstractC6234h0 abstractC6234h0, AbstractC6199T0 abstractC6199T0, C6163B c6163b, C6254o0 c6254o0) {
        this.f24276a = iArr;
        this.f24277b = objArr;
        this.f24278c = i2;
        this.f24279d = i3;
        this.f24281f = interfaceC6262s0 instanceof AbstractC6185M;
        this.f24282g = iArr2;
        this.f24283h = i4;
        this.f24284i = i5;
        this.f24285j = c6272x0;
        this.f24286k = abstractC6234h0;
        this.f24287l = abstractC6199T0;
        this.f24280e = interfaceC6262s0;
        this.f24288m = c6254o0;
    }

    /* JADX INFO: renamed from: A */
    public static long m12029A(Object obj, long j2) {
        return ((Long) AbstractC6223d1.f24164c.m11854k(obj, j2)).longValue();
    }

    /* JADX INFO: renamed from: I */
    public static Field m12030I(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbM411s = AbstractC0271e0.m411s("Field ", str, " for ");
            sbM411s.append(cls.getName());
            sbM411s.append(" not found. Known fields are ");
            sbM411s.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbM411s.toString());
        }
    }

    /* JADX INFO: renamed from: O */
    public static int m12031O(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: h */
    public static void m12032h(Object obj) {
        if (m12034p(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX INFO: renamed from: i */
    public static int m12033i(byte[] bArr, int i2, int i3, EnumC6247l1 enumC6247l1, Class cls, C6230g c6230g) throws InvalidProtocolBufferException {
        switch (enumC6247l1.ordinal()) {
            case 0:
                c6230g.f24176c = Double.valueOf(Double.longBitsToDouble(AbstractC6188N0.m11786f(bArr, i2)));
                return i2 + 8;
            case 1:
                c6230g.f24176c = Float.valueOf(Float.intBitsToFloat(AbstractC6188N0.m11785e(bArr, i2)));
                return i2 + 4;
            case 2:
            case 3:
                int iM11794p = AbstractC6188N0.m11794p(bArr, i2, c6230g);
                c6230g.f24176c = Long.valueOf(c6230g.f24175b);
                return iM11794p;
            case 4:
            case 12:
            case 13:
                int iM11792n = AbstractC6188N0.m11792n(bArr, i2, c6230g);
                c6230g.f24176c = Integer.valueOf(c6230g.f24174a);
                return iM11792n;
            case 5:
            case 15:
                c6230g.f24176c = Long.valueOf(AbstractC6188N0.m11786f(bArr, i2));
                return i2 + 8;
            case 6:
            case 14:
                c6230g.f24176c = Integer.valueOf(AbstractC6188N0.m11785e(bArr, i2));
                return i2 + 4;
            case 7:
                int iM11794p2 = AbstractC6188N0.m11794p(bArr, i2, c6230g);
                c6230g.f24176c = Boolean.valueOf(c6230g.f24175b != 0);
                return iM11794p2;
            case 8:
                int iM11792n2 = AbstractC6188N0.m11792n(bArr, i2, c6230g);
                int i4 = c6230g.f24174a;
                if (i4 < 0) {
                    throw InvalidProtocolBufferException.m11742f();
                }
                if (i4 == 0) {
                    c6230g.f24176c = "";
                    return iM11792n2;
                }
                c6230g.f24176c = AbstractC6232g1.f24178a.mo11800j(bArr, iM11792n2, i4);
                return iM11792n2 + i4;
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                InterfaceC6178I0 interfaceC6178I0M11705a = C6166C0.f24055c.m11705a(cls);
                Object objNewInstance = interfaceC6178I0M11705a.newInstance();
                int iM11798v = AbstractC6188N0.m11798v(objNewInstance, interfaceC6178I0M11705a, bArr, i2, i3, c6230g);
                interfaceC6178I0M11705a.makeImmutable(objNewInstance);
                c6230g.f24176c = objNewInstance;
                return iM11798v;
            case 11:
                return AbstractC6188N0.m11784d(bArr, i2, c6230g);
            case 16:
                int iM11792n3 = AbstractC6188N0.m11792n(bArr, i2, c6230g);
                c6230g.f24176c = Integer.valueOf(AbstractC6261s.m11964b(c6230g.f24174a));
                return iM11792n3;
            case 17:
                int iM11794p3 = AbstractC6188N0.m11794p(bArr, i2, c6230g);
                c6230g.f24176c = Long.valueOf(AbstractC6261s.m11965c(c6230g.f24175b));
                return iM11794p3;
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m12034p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC6185M) {
            return ((AbstractC6185M) obj).isMutable();
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public static C6268v0 m12035w(C6170E0 c6170e0, C6272x0 c6272x0, AbstractC6234h0 abstractC6234h0, AbstractC6199T0 abstractC6199T0, C6163B c6163b, C6254o0 c6254o0) {
        if (c6170e0 instanceof C6170E0) {
            return m12036x(c6170e0, c6272x0, abstractC6234h0, abstractC6199T0, c6163b, c6254o0);
        }
        c6170e0.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Code duplicated, block: B:120:0x025b  */
    /* JADX WARN: Code duplicated, block: B:121:0x025e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0275  */
    /* JADX WARN: Code duplicated, block: B:125:0x0278  */
    /* JADX WARN: Code duplicated, block: B:162:0x0334  */
    /* JADX WARN: Code duplicated, block: B:177:0x037e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0388  */
    /* JADX WARN: Code duplicated, block: B:183:0x0398  */
    /* JADX INFO: renamed from: x */
    public static C6268v0 m12036x(C6170E0 c6170e0, C6272x0 c6272x0, AbstractC6234h0 abstractC6234h0, AbstractC6199T0 abstractC6199T0, C6163B c6163b, C6254o0 c6254o0) {
        int i2;
        int iCharAt;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        int i9;
        char cCharAt;
        int i10;
        char cCharAt2;
        int i11;
        char cCharAt3;
        int i12;
        char cCharAt4;
        int i13;
        char cCharAt5;
        int i14;
        char cCharAt6;
        int i15;
        char cCharAt7;
        int i16;
        char cCharAt8;
        int i17;
        int i18;
        int i19;
        int i20;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i21;
        int i22;
        int i23;
        int i24;
        Field fieldM12030I;
        char cCharAt9;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field fieldM12030I2;
        int i28;
        Object obj2;
        Field fieldM12030I3;
        int i29;
        char cCharAt10;
        int i30;
        char cCharAt11;
        int i31;
        char cCharAt12;
        int i32;
        char cCharAt13;
        String str = c6170e0.f24069b;
        int length = str.length();
        int i33 = 55296;
        if (str.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i2 = i34 + 1;
                if (str.charAt(i34) < 55296) {
                    break;
                }
                i34 = i2;
            }
        } else {
            i2 = 1;
        }
        int i35 = i2 + 1;
        int iCharAt2 = str.charAt(i2);
        if (iCharAt2 >= 55296) {
            int i36 = iCharAt2 & 8191;
            int i37 = 13;
            while (true) {
                i32 = i35 + 1;
                cCharAt13 = str.charAt(i35);
                if (cCharAt13 < 55296) {
                    break;
                }
                i36 |= (cCharAt13 & 8191) << i37;
                i37 += 13;
                i35 = i32;
            }
            iCharAt2 = i36 | (cCharAt13 << i37);
            i35 = i32;
        }
        if (iCharAt2 == 0) {
            i4 = 0;
            i7 = 0;
            iCharAt = 0;
            i3 = 0;
            i6 = 0;
            i8 = 0;
            iArr = f24274n;
            i5 = 0;
        } else {
            int i38 = i35 + 1;
            int iCharAt3 = str.charAt(i35);
            if (iCharAt3 >= 55296) {
                int i39 = iCharAt3 & 8191;
                int i40 = 13;
                while (true) {
                    i16 = i38 + 1;
                    cCharAt8 = str.charAt(i38);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt8 & 8191) << i40;
                    i40 += 13;
                    i38 = i16;
                }
                iCharAt3 = i39 | (cCharAt8 << i40);
                i38 = i16;
            }
            int i41 = i38 + 1;
            int iCharAt4 = str.charAt(i38);
            if (iCharAt4 >= 55296) {
                int i42 = iCharAt4 & 8191;
                int i43 = 13;
                while (true) {
                    i15 = i41 + 1;
                    cCharAt7 = str.charAt(i41);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt7 & 8191) << i43;
                    i43 += 13;
                    i41 = i15;
                }
                iCharAt4 = i42 | (cCharAt7 << i43);
                i41 = i15;
            }
            int i44 = i41 + 1;
            int iCharAt5 = str.charAt(i41);
            if (iCharAt5 >= 55296) {
                int i45 = iCharAt5 & 8191;
                int i46 = 13;
                while (true) {
                    i14 = i44 + 1;
                    cCharAt6 = str.charAt(i44);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt6 & 8191) << i46;
                    i46 += 13;
                    i44 = i14;
                }
                iCharAt5 = i45 | (cCharAt6 << i46);
                i44 = i14;
            }
            int i47 = i44 + 1;
            int iCharAt6 = str.charAt(i44);
            if (iCharAt6 >= 55296) {
                int i48 = iCharAt6 & 8191;
                int i49 = 13;
                while (true) {
                    i13 = i47 + 1;
                    cCharAt5 = str.charAt(i47);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt5 & 8191) << i49;
                    i49 += 13;
                    i47 = i13;
                }
                iCharAt6 = i48 | (cCharAt5 << i49);
                i47 = i13;
            }
            int i50 = i47 + 1;
            iCharAt = str.charAt(i47);
            if (iCharAt >= 55296) {
                int i51 = iCharAt & 8191;
                int i52 = 13;
                while (true) {
                    i12 = i50 + 1;
                    cCharAt4 = str.charAt(i50);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt4 & 8191) << i52;
                    i52 += 13;
                    i50 = i12;
                }
                iCharAt = i51 | (cCharAt4 << i52);
                i50 = i12;
            }
            int i53 = i50 + 1;
            int iCharAt7 = str.charAt(i50);
            if (iCharAt7 >= 55296) {
                int i54 = iCharAt7 & 8191;
                int i55 = 13;
                while (true) {
                    i11 = i53 + 1;
                    cCharAt3 = str.charAt(i53);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt3 & 8191) << i55;
                    i55 += 13;
                    i53 = i11;
                }
                iCharAt7 = i54 | (cCharAt3 << i55);
                i53 = i11;
            }
            int i56 = i53 + 1;
            int iCharAt8 = str.charAt(i53);
            if (iCharAt8 >= 55296) {
                int i57 = iCharAt8 & 8191;
                int i58 = 13;
                while (true) {
                    i10 = i56 + 1;
                    cCharAt2 = str.charAt(i56);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt2 & 8191) << i58;
                    i58 += 13;
                    i56 = i10;
                }
                iCharAt8 = i57 | (cCharAt2 << i58);
                i56 = i10;
            }
            int i59 = i56 + 1;
            int iCharAt9 = str.charAt(i56);
            if (iCharAt9 >= 55296) {
                int i60 = iCharAt9 & 8191;
                int i61 = 13;
                while (true) {
                    i9 = i59 + 1;
                    cCharAt = str.charAt(i59);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i60 |= (cCharAt & 8191) << i61;
                    i61 += 13;
                    i59 = i9;
                }
                iCharAt9 = i60 | (cCharAt << i61);
                i59 = i9;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i62 = (iCharAt3 * 2) + iCharAt4;
            int i63 = iCharAt7;
            i3 = iCharAt5;
            i4 = i63;
            i5 = iCharAt3;
            i35 = i59;
            iArr = iArr2;
            i6 = iCharAt6;
            i7 = i62;
            i8 = iCharAt9;
        }
        Unsafe unsafe = f24275o;
        Object[] objArr = c6170e0.f24070c;
        Class<?> cls = c6170e0.f24068a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i64 = i8 + i4;
        int i65 = i64;
        int i66 = i8;
        int i67 = 0;
        int i68 = 0;
        while (i35 < length) {
            int i69 = i35 + 1;
            int iCharAt10 = str.charAt(i35);
            if (iCharAt10 >= i33) {
                int i70 = iCharAt10 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i31 = i71 + 1;
                    cCharAt12 = str.charAt(i71);
                    i17 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i70 |= (cCharAt12 & 8191) << i72;
                    i72 += 13;
                    i71 = i31;
                    length = i17;
                }
                iCharAt10 = i70 | (cCharAt12 << i72);
                i18 = i31;
            } else {
                i17 = length;
                i18 = i69;
            }
            int i73 = i18 + 1;
            int iCharAt11 = str.charAt(i18);
            Object[] objArr3 = objArr;
            char c = 55296;
            if (iCharAt11 >= 55296) {
                int i74 = iCharAt11 & 8191;
                int i75 = 13;
                while (true) {
                    i30 = i73 + 1;
                    cCharAt11 = str.charAt(i73);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i74 |= (cCharAt11 & 8191) << i75;
                    i75 += 13;
                    i73 = i30;
                    c = 55296;
                }
                iCharAt11 = i74 | (cCharAt11 << i75);
                i73 = i30;
            }
            int i76 = iCharAt11 & 255;
            int i77 = iCharAt10;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i67] = i68;
                i67++;
            }
            int[] iArr4 = iArr3;
            if (i76 >= 51) {
                int i78 = i73 + 1;
                int iCharAt12 = str.charAt(i73);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i79 = iCharAt12 & 8191;
                    int i80 = 13;
                    while (true) {
                        i29 = i78 + 1;
                        cCharAt10 = str.charAt(i78);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i79 |= (cCharAt10 & 8191) << i80;
                        i80 += 13;
                        i78 = i29;
                        c2 = 55296;
                    }
                    iCharAt12 = i79 | (cCharAt10 << i80);
                    i78 = i29;
                }
                int i81 = i76 - 51;
                int i82 = i78;
                if (i81 == 9 || i81 == 17) {
                    i26 = i7 + 1;
                    objArr2[((i68 / 3) * 2) + 1] = objArr3[i7];
                } else {
                    if (i81 == 12 && (AbstractC6468c.m12192a(c6170e0.m11713a(), 1) || (iCharAt11 & 2048) != 0)) {
                        i26 = i7 + 1;
                        objArr2[((i68 / 3) * 2) + 1] = objArr3[i7];
                    }
                    i27 = iCharAt12 * 2;
                    obj = objArr3[i27];
                    if (obj instanceof Field) {
                        fieldM12030I2 = (Field) obj;
                    } else {
                        fieldM12030I2 = m12030I(cls, (String) obj);
                        objArr3[i27] = fieldM12030I2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM12030I2);
                    i28 = i27 + 1;
                    obj2 = objArr3[i28];
                    if (obj2 instanceof Field) {
                        fieldM12030I3 = (Field) obj2;
                    } else {
                        fieldM12030I3 = m12030I(cls, (String) obj2);
                        objArr3[i28] = fieldM12030I3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM12030I3);
                    int i83 = i5;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    i24 = iObjectFieldOffset3;
                    i19 = i83;
                    i23 = i7;
                    i21 = i82;
                    i22 = 0;
                    cls = cls;
                }
                i7 = i26;
                i27 = iCharAt12 * 2;
                obj = objArr3[i27];
                if (obj instanceof Field) {
                    fieldM12030I2 = (Field) obj;
                } else {
                    fieldM12030I2 = m12030I(cls, (String) obj);
                    objArr3[i27] = fieldM12030I2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldM12030I2);
                i28 = i27 + 1;
                obj2 = objArr3[i28];
                if (obj2 instanceof Field) {
                    fieldM12030I3 = (Field) obj2;
                } else {
                    fieldM12030I3 = m12030I(cls, (String) obj2);
                    objArr3[i28] = fieldM12030I3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldM12030I3);
                int i84 = i5;
                iObjectFieldOffset2 = iObjectFieldOffset6;
                i24 = iObjectFieldOffset5;
                i19 = i84;
                i23 = i7;
                i21 = i82;
                i22 = 0;
                cls = cls;
            } else {
                int i85 = i7 + 1;
                Field fieldM12030I4 = m12030I(cls, (String) objArr3[i7]);
                if (i76 == 9 || i76 == 17) {
                    i19 = i5;
                    objArr2[((i68 / 3) * 2) + 1] = fieldM12030I4.getType();
                } else {
                    if (i76 == 27 || i76 == 49) {
                        i19 = i5;
                        i25 = i7 + 2;
                        objArr2[((i68 / 3) * 2) + 1] = objArr3[i85];
                    } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                        i19 = i5;
                        if (c6170e0.m11713a() == 1 || (iCharAt11 & 2048) != 0) {
                            i25 = i7 + 2;
                            objArr2[((i68 / 3) * 2) + 1] = objArr3[i85];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM12030I4);
                        if ((iCharAt11 & 4096) != 0 || i76 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i21 = i73;
                            i22 = 0;
                        } else {
                            int i86 = i73 + 1;
                            int iCharAt13 = str.charAt(i73);
                            if (iCharAt13 >= 55296) {
                                int i87 = iCharAt13 & 8191;
                                int i88 = 13;
                                while (true) {
                                    i21 = i86 + 1;
                                    cCharAt9 = str.charAt(i86);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i87 |= (cCharAt9 & 8191) << i88;
                                    i88 += 13;
                                    i86 = i21;
                                }
                                iCharAt13 = i87 | (cCharAt9 << i88);
                            } else {
                                i21 = i86;
                            }
                            int i89 = (iCharAt13 / 32) + (i19 * 2);
                            Object obj3 = objArr3[i89];
                            if (obj3 instanceof Field) {
                                fieldM12030I = (Field) obj3;
                            } else {
                                fieldM12030I = m12030I(cls, (String) obj3);
                                objArr3[i89] = fieldM12030I;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM12030I);
                            i22 = iCharAt13 % 32;
                        }
                        if (i76 >= 18 || i76 > 49) {
                            i23 = i20;
                            i24 = iObjectFieldOffset;
                        } else {
                            iArr[i65] = iObjectFieldOffset;
                            i23 = i20;
                            i24 = iObjectFieldOffset;
                            i65++;
                        }
                    } else {
                        if (i76 == 50) {
                            int i90 = i66 + 1;
                            iArr[i66] = i68;
                            int i91 = (i68 / 3) * 2;
                            int i92 = i7 + 2;
                            objArr2[i91] = objArr3[i85];
                            if ((iCharAt11 & 2048) != 0) {
                                i20 = i7 + 3;
                                objArr2[i91 + 1] = objArr3[i92];
                                i19 = i5;
                                i66 = i90;
                            } else {
                                i20 = i92;
                                i66 = i90;
                                i19 = i5;
                            }
                        } else {
                            i19 = i5;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM12030I4);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i21 = i73;
                            i22 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i21 = i73;
                            i22 = 0;
                        }
                        if (i76 >= 18) {
                            i23 = i20;
                            i24 = iObjectFieldOffset;
                        } else {
                            i23 = i20;
                            i24 = iObjectFieldOffset;
                        }
                    }
                    i20 = i25;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM12030I4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i21 = i73;
                        i22 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i21 = i73;
                        i22 = 0;
                    }
                    if (i76 >= 18) {
                        i23 = i20;
                        i24 = iObjectFieldOffset;
                    } else {
                        i23 = i20;
                        i24 = iObjectFieldOffset;
                    }
                }
                i20 = i85;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM12030I4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i21 = i73;
                    i22 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i21 = i73;
                    i22 = 0;
                }
                if (i76 >= 18) {
                    i23 = i20;
                    i24 = iObjectFieldOffset;
                } else {
                    i23 = i20;
                    i24 = iObjectFieldOffset;
                }
            }
            int i93 = i68 + 1;
            iArr4[i68] = i77;
            int i94 = i68 + 2;
            String str2 = str;
            iArr4[i93] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i76 << 20) | i24;
            i68 += 3;
            iArr4[i94] = (i22 << 20) | iObjectFieldOffset2;
            cls = cls;
            objArr = objArr3;
            str = str2;
            length = i17;
            i5 = i19;
            i35 = i21;
            i33 = 55296;
            i7 = i23;
            iArr3 = iArr4;
        }
        return new C6268v0(iArr3, objArr2, i3, i6, c6170e0.f24068a, iArr, i8, i64, c6272x0, abstractC6234h0, abstractC6199T0, c6163b, c6254o0);
    }

    /* JADX INFO: renamed from: y */
    public static long m12037y(int i2) {
        return i2 & 1048575;
    }

    /* JADX INFO: renamed from: z */
    public static int m12038z(Object obj, long j2) {
        return ((Integer) AbstractC6223d1.f24164c.m11854k(obj, j2)).intValue();
    }

    /* JADX INFO: renamed from: B */
    public final int m12039B(Object obj, byte[] bArr, int i2, int i3, int i4, long j2, C6230g c6230g) throws InvalidProtocolBufferException {
        int iM12033i;
        Unsafe unsafe = f24275o;
        Object objM12056l = m12056l(i4);
        Object object = unsafe.getObject(obj, j2);
        this.f24288m.getClass();
        if (!((C6252n0) object).f24223s) {
            C6252n0 c6252n0M11901c = C6252n0.f24222t.m11901c();
            C6254o0.m11933a(c6252n0M11901c, object);
            unsafe.putObject(obj, j2, c6252n0M11901c);
            object = c6252n0M11901c;
        }
        C6246l0 c6246l0 = ((C6249m0) objM12056l).f24206a;
        C6252n0 c6252n0 = (C6252n0) object;
        int iM11792n = AbstractC6188N0.m11792n(bArr, i2, c6230g);
        int i5 = c6230g.f24174a;
        if (i5 < 0 || i5 > i3 - iM11792n) {
            throw InvalidProtocolBufferException.m11744h();
        }
        int i6 = iM11792n + i5;
        Object obj2 = c6246l0.f24198c;
        Object obj3 = "";
        Object obj4 = obj2;
        while (iM11792n < i6) {
            int iM11791m = iM11792n + 1;
            int i7 = bArr[iM11792n];
            if (i7 < 0) {
                iM11791m = AbstractC6188N0.m11791m(i7, bArr, iM11791m, c6230g);
                i7 = c6230g.f24174a;
            }
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i8 != 1) {
                if (i8 == 2) {
                    EnumC6247l1 enumC6247l1 = c6246l0.f24197b;
                    if (i9 == enumC6247l1.f24204t) {
                        iM12033i = m12033i(bArr, iM11791m, i3, enumC6247l1, obj2.getClass(), c6230g);
                        obj4 = c6230g.f24176c;
                        iM11792n = iM12033i;
                    }
                }
                iM11792n = AbstractC6188N0.m11799x(i7, bArr, iM11791m, i3, c6230g);
            } else {
                EnumC6247l1 enumC6247l2 = c6246l0.f24196a;
                if (i9 == enumC6247l2.f24204t) {
                    iM12033i = m12033i(bArr, iM11791m, i3, enumC6247l2, null, c6230g);
                    obj3 = c6230g.f24176c;
                    iM11792n = iM12033i;
                } else {
                    iM11792n = AbstractC6188N0.m11799x(i7, bArr, iM11791m, i3, c6230g);
                }
            }
        }
        if (iM11792n != i6) {
            throw InvalidProtocolBufferException.m11743g();
        }
        c6252n0.put(obj3, obj4);
        return i6;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12541. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: C */
    public final int m12040C(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.protobuf.C6230g r34) {
        /*
            Method dump skipped, instruction units count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C6268v0.m12040C(java.lang.Object, byte[], int, int, int, com.google.protobuf.g):int");
    }

    /* JADX INFO: renamed from: D */
    public final int m12041D(Object obj, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, C6230g c6230g) throws InvalidProtocolBufferException {
        int i10;
        Unsafe unsafe = f24275o;
        long j3 = this.f24276a[i9 + 2] & 1048575;
        switch (i8) {
            case 51:
                if (i6 != 1) {
                    return i2;
                }
                unsafe.putObject(obj, j2, Double.valueOf(Double.longBitsToDouble(AbstractC6188N0.m11786f(bArr, i2))));
                int i11 = i2 + 8;
                unsafe.putInt(obj, j3, i5);
                return i11;
            case 52:
                if (i6 != 5) {
                    return i2;
                }
                unsafe.putObject(obj, j2, Float.valueOf(Float.intBitsToFloat(AbstractC6188N0.m11785e(bArr, i2))));
                int i12 = i2 + 4;
                unsafe.putInt(obj, j3, i5);
                return i12;
            case 53:
            case 54:
                if (i6 != 0) {
                    return i2;
                }
                int iM11794p = AbstractC6188N0.m11794p(bArr, i2, c6230g);
                unsafe.putObject(obj, j2, Long.valueOf(c6230g.f24175b));
                unsafe.putInt(obj, j3, i5);
                return iM11794p;
            case 55:
            case 62:
                if (i6 != 0) {
                    return i2;
                }
                int iM11792n = AbstractC6188N0.m11792n(bArr, i2, c6230g);
                unsafe.putObject(obj, j2, Integer.valueOf(c6230g.f24174a));
                unsafe.putInt(obj, j3, i5);
                return iM11792n;
            case 56:
            case 65:
                if (i6 != 1) {
                    return i2;
                }
                unsafe.putObject(obj, j2, Long.valueOf(AbstractC6188N0.m11786f(bArr, i2)));
                int i13 = i2 + 8;
                unsafe.putInt(obj, j3, i5);
                return i13;
            case 57:
            case 64:
                if (i6 != 5) {
                    return i2;
                }
                unsafe.putObject(obj, j2, Integer.valueOf(AbstractC6188N0.m11785e(bArr, i2)));
                int i14 = i2 + 4;
                unsafe.putInt(obj, j3, i5);
                return i14;
            case 58:
                if (i6 != 0) {
                    return i2;
                }
                int iM11794p2 = AbstractC6188N0.m11794p(bArr, i2, c6230g);
                unsafe.putObject(obj, j2, Boolean.valueOf(c6230g.f24175b != 0));
                unsafe.putInt(obj, j3, i5);
                return iM11794p2;
            case 59:
                if (i6 != 2) {
                    return i2;
                }
                int iM11792n2 = AbstractC6188N0.m11792n(bArr, i2, c6230g);
                int i15 = c6230g.f24174a;
                if (i15 == 0) {
                    unsafe.putObject(obj, j2, "");
                } else {
                    if ((i7 & 536870912) != 0) {
                        if (!AbstractC6232g1.f24178a.m11803t(bArr, iM11792n2, iM11792n2 + i15)) {
                            throw InvalidProtocolBufferException.m11739c();
                        }
                    }
                    unsafe.putObject(obj, j2, new String(bArr, iM11792n2, i15, AbstractC6213a0.f24134a));
                    iM11792n2 += i15;
                }
                unsafe.putInt(obj, j3, i5);
                return iM11792n2;
            case 60:
                i10 = i2;
                if (i6 == 2) {
                    Object objM12065v = m12065v(obj, i5, i9);
                    int iM11798v = AbstractC6188N0.m11798v(objM12065v, m12057m(i9), bArr, i10, i3, c6230g);
                    m12050N(obj, i5, i9, objM12065v);
                    return iM11798v;
                }
                break;
            case 61:
                i10 = i2;
                if (i6 == 2) {
                    int iM11784d = AbstractC6188N0.m11784d(bArr, i10, c6230g);
                    unsafe.putObject(obj, j2, c6230g.f24176c);
                    unsafe.putInt(obj, j3, i5);
                    return iM11784d;
                }
                break;
            case 63:
                i10 = i2;
                if (i6 == 0) {
                    int iM11792n3 = AbstractC6188N0.m11792n(bArr, i10, c6230g);
                    int i16 = c6230g.f24174a;
                    m12055k(i9);
                    unsafe.putObject(obj, j2, Integer.valueOf(i16));
                    unsafe.putInt(obj, j3, i5);
                    return iM11792n3;
                }
                break;
            case 66:
                i10 = i2;
                if (i6 == 0) {
                    int iM11792n4 = AbstractC6188N0.m11792n(bArr, i10, c6230g);
                    unsafe.putObject(obj, j2, Integer.valueOf(AbstractC6261s.m11964b(c6230g.f24174a)));
                    unsafe.putInt(obj, j3, i5);
                    return iM11792n4;
                }
                break;
            case 67:
                i10 = i2;
                if (i6 == 0) {
                    int iM11794p3 = AbstractC6188N0.m11794p(bArr, i10, c6230g);
                    unsafe.putObject(obj, j2, Long.valueOf(AbstractC6261s.m11965c(c6230g.f24175b)));
                    unsafe.putInt(obj, j3, i5);
                    return iM11794p3;
                }
                break;
            case 68:
                if (i6 == 3) {
                    Object objM12065v2 = m12065v(obj, i5, i9);
                    int iM11797u = AbstractC6188N0.m11797u(objM12065v2, m12057m(i9), bArr, i2, i3, (i4 & (-8)) | 4, c6230g);
                    m12050N(obj, i5, i9, objM12065v2);
                    return iM11797u;
                }
            default:
                return i2;
        }
        return i10;
    }

    /* JADX INFO: renamed from: E */
    public final int m12042E(Object obj, byte[] bArr, int i2, int i3, int i4, int i5, int i6, long j2, int i7, long j3, C6230g c6230g) throws InvalidProtocolBufferException {
        int i8;
        int i9;
        int i10;
        int i11;
        int iM11793o;
        Unsafe unsafe = f24275o;
        InterfaceC6210Z interfaceC6210ZMutableCopyWithCapacity = (InterfaceC6210Z) unsafe.getObject(obj, j3);
        if (!((AbstractC6221d) interfaceC6210ZMutableCopyWithCapacity).f24160s) {
            int size = interfaceC6210ZMutableCopyWithCapacity.size();
            interfaceC6210ZMutableCopyWithCapacity = interfaceC6210ZMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j3, interfaceC6210ZMutableCopyWithCapacity);
        }
        InterfaceC6210Z interfaceC6210Z = interfaceC6210ZMutableCopyWithCapacity;
        switch (i7) {
            case 18:
            case 35:
                int iM11792n = i2;
                if (i5 == 2) {
                    C6271x c6271x = (C6271x) interfaceC6210Z;
                    int iM11792n2 = AbstractC6188N0.m11792n(bArr, iM11792n, c6230g);
                    int i12 = c6230g.f24174a + iM11792n2;
                    while (iM11792n2 < i12) {
                        c6271x.addDouble(Double.longBitsToDouble(AbstractC6188N0.m11786f(bArr, iM11792n2)));
                        iM11792n2 += 8;
                    }
                    if (iM11792n2 == i12) {
                        return iM11792n2;
                    }
                    throw InvalidProtocolBufferException.m11744h();
                }
                if (i5 != 1) {
                    return iM11792n;
                }
                C6271x c6271x2 = (C6271x) interfaceC6210Z;
                c6271x2.addDouble(Double.longBitsToDouble(AbstractC6188N0.m11786f(bArr, i2)));
                while (true) {
                    i8 = iM11792n + 8;
                    if (i8 < i3) {
                        iM11792n = AbstractC6188N0.m11792n(bArr, i8, c6230g);
                        if (i4 == c6230g.f24174a) {
                            c6271x2.addDouble(Double.longBitsToDouble(AbstractC6188N0.m11786f(bArr, iM11792n)));
                        }
                    }
                }
                return i8;
            case 19:
            case 36:
                int iM11792n3 = i2;
                if (i5 == 2) {
                    C6171F c6171f = (C6171F) interfaceC6210Z;
                    int iM11792n4 = AbstractC6188N0.m11792n(bArr, iM11792n3, c6230g);
                    int i13 = c6230g.f24174a + iM11792n4;
                    while (iM11792n4 < i13) {
                        c6171f.addFloat(Float.intBitsToFloat(AbstractC6188N0.m11785e(bArr, iM11792n4)));
                        iM11792n4 += 4;
                    }
                    if (iM11792n4 == i13) {
                        return iM11792n4;
                    }
                    throw InvalidProtocolBufferException.m11744h();
                }
                if (i5 != 5) {
                    return iM11792n3;
                }
                C6171F c6171f2 = (C6171F) interfaceC6210Z;
                c6171f2.addFloat(Float.intBitsToFloat(AbstractC6188N0.m11785e(bArr, i2)));
                while (true) {
                    i9 = iM11792n3 + 4;
                    if (i9 < i3) {
                        iM11792n3 = AbstractC6188N0.m11792n(bArr, i9, c6230g);
                        if (i4 == c6230g.f24174a) {
                            c6171f2.addFloat(Float.intBitsToFloat(AbstractC6188N0.m11785e(bArr, iM11792n3)));
                        }
                    }
                }
                return i9;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    C6237i0 c6237i0 = (C6237i0) interfaceC6210Z;
                    int iM11792n5 = AbstractC6188N0.m11792n(bArr, i2, c6230g);
                    int i14 = c6230g.f24174a + iM11792n5;
                    while (iM11792n5 < i14) {
                        iM11792n5 = AbstractC6188N0.m11794p(bArr, iM11792n5, c6230g);
                        c6237i0.addLong(c6230g.f24175b);
                    }
                    if (iM11792n5 == i14) {
                        return iM11792n5;
                    }
                    throw InvalidProtocolBufferException.m11744h();
                }
                if (i5 != 0) {
                    return i2;
                }
                C6237i0 c6237i1 = (C6237i0) interfaceC6210Z;
                int iM11794p = AbstractC6188N0.m11794p(bArr, i2, c6230g);
                c6237i1.addLong(c6230g.f24175b);
                while (iM11794p < i3) {
                    int iM11792n6 = AbstractC6188N0.m11792n(bArr, iM11794p, c6230g);
                    if (i4 != c6230g.f24174a) {
                        return iM11794p;
                    }
                    iM11794p = AbstractC6188N0.m11794p(bArr, iM11792n6, c6230g);
                    c6237i1.addLong(c6230g.f24175b);
                }
                return iM11794p;
            case 22:
            case 29:
            case 39:
            case 43:
                i10 = i2;
                if (i5 != 2) {
                    if (i5 == 0) {
                        return AbstractC6188N0.m11793o(i4, bArr, i10, i3, interfaceC6210Z, c6230g);
                    }
                    return i10;
                }
                C6193Q c6193q = (C6193Q) interfaceC6210Z;
                int iM11792n7 = AbstractC6188N0.m11792n(bArr, i10, c6230g);
                int i15 = c6230g.f24174a + iM11792n7;
                while (iM11792n7 < i15) {
                    iM11792n7 = AbstractC6188N0.m11792n(bArr, iM11792n7, c6230g);
                    c6193q.addInt(c6230g.f24174a);
                }
                if (iM11792n7 == i15) {
                    return iM11792n7;
                }
                throw InvalidProtocolBufferException.m11744h();
            case 23:
            case 32:
            case 40:
            case 46:
                i10 = i2;
                if (i5 == 2) {
                    C6237i0 c6237i2 = (C6237i0) interfaceC6210Z;
                    int iM11792n8 = AbstractC6188N0.m11792n(bArr, i10, c6230g);
                    int i16 = c6230g.f24174a + iM11792n8;
                    while (iM11792n8 < i16) {
                        c6237i2.addLong(AbstractC6188N0.m11786f(bArr, iM11792n8));
                        iM11792n8 += 8;
                    }
                    if (iM11792n8 == i16) {
                        return iM11792n8;
                    }
                    throw InvalidProtocolBufferException.m11744h();
                }
                if (i5 == 1) {
                    C6237i0 c6237i3 = (C6237i0) interfaceC6210Z;
                    c6237i3.addLong(AbstractC6188N0.m11786f(bArr, i2));
                    int i17 = i10 + 8;
                    while (i17 < i3) {
                        int iM11792n9 = AbstractC6188N0.m11792n(bArr, i17, c6230g);
                        if (i4 != c6230g.f24174a) {
                            return i17;
                        }
                        c6237i3.addLong(AbstractC6188N0.m11786f(bArr, iM11792n9));
                        i17 = iM11792n9 + 8;
                    }
                    return i17;
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case 45:
                i10 = i2;
                if (i5 == 2) {
                    C6193Q c6193q2 = (C6193Q) interfaceC6210Z;
                    int iM11792n10 = AbstractC6188N0.m11792n(bArr, i10, c6230g);
                    int i18 = c6230g.f24174a + iM11792n10;
                    while (iM11792n10 < i18) {
                        c6193q2.addInt(AbstractC6188N0.m11785e(bArr, iM11792n10));
                        iM11792n10 += 4;
                    }
                    if (iM11792n10 == i18) {
                        return iM11792n10;
                    }
                    throw InvalidProtocolBufferException.m11744h();
                }
                if (i5 == 5) {
                    C6193Q c6193q3 = (C6193Q) interfaceC6210Z;
                    c6193q3.addInt(AbstractC6188N0.m11785e(bArr, i2));
                    int i19 = i10 + 4;
                    while (i19 < i3) {
                        int iM11792n11 = AbstractC6188N0.m11792n(bArr, i19, c6230g);
                        if (i4 != c6230g.f24174a) {
                            return i19;
                        }
                        c6193q3.addInt(AbstractC6188N0.m11785e(bArr, iM11792n11));
                        i19 = iM11792n11 + 4;
                    }
                    return i19;
                }
                return i10;
            case 25:
            case 42:
                i10 = i2;
                if (i5 == 2) {
                    C6233h c6233h = (C6233h) interfaceC6210Z;
                    int iM11792n12 = AbstractC6188N0.m11792n(bArr, i10, c6230g);
                    int i20 = c6230g.f24174a + iM11792n12;
                    while (iM11792n12 < i20) {
                        iM11792n12 = AbstractC6188N0.m11794p(bArr, iM11792n12, c6230g);
                        c6233h.addBoolean(c6230g.f24175b != 0);
                    }
                    if (iM11792n12 == i20) {
                        return iM11792n12;
                    }
                    throw InvalidProtocolBufferException.m11744h();
                }
                if (i5 == 0) {
                    C6233h c6233h2 = (C6233h) interfaceC6210Z;
                    int iM11794p2 = AbstractC6188N0.m11794p(bArr, i10, c6230g);
                    c6233h2.addBoolean(c6230g.f24175b != 0);
                    while (iM11794p2 < i3) {
                        int iM11792n13 = AbstractC6188N0.m11792n(bArr, iM11794p2, c6230g);
                        if (i4 != c6230g.f24174a) {
                            return iM11794p2;
                        }
                        iM11794p2 = AbstractC6188N0.m11794p(bArr, iM11792n13, c6230g);
                        c6233h2.addBoolean(c6230g.f24175b != 0);
                    }
                    return iM11794p2;
                }
                return i10;
            case 26:
                i10 = i2;
                if (i5 == 2) {
                    if ((j2 & 536870912) == 0) {
                        int iM11792n14 = AbstractC6188N0.m11792n(bArr, i10, c6230g);
                        int i21 = c6230g.f24174a;
                        if (i21 < 0) {
                            throw InvalidProtocolBufferException.m11742f();
                        }
                        if (i21 == 0) {
                            interfaceC6210Z.add("");
                        } else {
                            interfaceC6210Z.add(new String(bArr, iM11792n14, i21, AbstractC6213a0.f24134a));
                            iM11792n14 += i21;
                        }
                        while (iM11792n14 < i3) {
                            int iM11792n15 = AbstractC6188N0.m11792n(bArr, iM11792n14, c6230g);
                            if (i4 != c6230g.f24174a) {
                                return iM11792n14;
                            }
                            iM11792n14 = AbstractC6188N0.m11792n(bArr, iM11792n15, c6230g);
                            int i22 = c6230g.f24174a;
                            if (i22 < 0) {
                                throw InvalidProtocolBufferException.m11742f();
                            }
                            if (i22 == 0) {
                                interfaceC6210Z.add("");
                            } else {
                                interfaceC6210Z.add(new String(bArr, iM11792n14, i22, AbstractC6213a0.f24134a));
                                iM11792n14 += i22;
                            }
                        }
                        return iM11792n14;
                    }
                    int iM11792n16 = AbstractC6188N0.m11792n(bArr, i10, c6230g);
                    int i23 = c6230g.f24174a;
                    if (i23 < 0) {
                        throw InvalidProtocolBufferException.m11742f();
                    }
                    if (i23 == 0) {
                        interfaceC6210Z.add("");
                    } else {
                        int i24 = iM11792n16 + i23;
                        if (!AbstractC6232g1.f24178a.m11803t(bArr, iM11792n16, i24)) {
                            throw InvalidProtocolBufferException.m11739c();
                        }
                        interfaceC6210Z.add(new String(bArr, iM11792n16, i23, AbstractC6213a0.f24134a));
                        iM11792n16 = i24;
                    }
                    while (iM11792n16 < i3) {
                        int iM11792n17 = AbstractC6188N0.m11792n(bArr, iM11792n16, c6230g);
                        if (i4 != c6230g.f24174a) {
                            return iM11792n16;
                        }
                        iM11792n16 = AbstractC6188N0.m11792n(bArr, iM11792n17, c6230g);
                        int i25 = c6230g.f24174a;
                        if (i25 < 0) {
                            throw InvalidProtocolBufferException.m11742f();
                        }
                        if (i25 == 0) {
                            interfaceC6210Z.add("");
                        } else {
                            int i26 = iM11792n16 + i25;
                            if (!AbstractC6232g1.f24178a.m11803t(bArr, iM11792n16, i26)) {
                                throw InvalidProtocolBufferException.m11739c();
                            }
                            interfaceC6210Z.add(new String(bArr, iM11792n16, i25, AbstractC6213a0.f24134a));
                            iM11792n16 = i26;
                        }
                    }
                    return iM11792n16;
                }
                return i10;
            case 27:
                return i5 == 2 ? AbstractC6188N0.m11788h(m12057m(i6), i4, bArr, i2, i3, interfaceC6210Z, c6230g) : i2;
            case 28:
                if (i5 != 2) {
                    return i2;
                }
                int iM11792n18 = AbstractC6188N0.m11792n(bArr, i2, c6230g);
                int i27 = c6230g.f24174a;
                if (i27 < 0) {
                    throw InvalidProtocolBufferException.m11742f();
                }
                if (i27 > bArr.length - iM11792n18) {
                    throw InvalidProtocolBufferException.m11744h();
                }
                if (i27 == 0) {
                    interfaceC6210Z.add(AbstractC6251n.f24219t);
                } else {
                    interfaceC6210Z.add(AbstractC6251n.m11896j(bArr, iM11792n18, i27));
                    iM11792n18 += i27;
                }
                while (iM11792n18 < i3) {
                    int iM11792n19 = AbstractC6188N0.m11792n(bArr, iM11792n18, c6230g);
                    if (i4 != c6230g.f24174a) {
                        return iM11792n18;
                    }
                    iM11792n18 = AbstractC6188N0.m11792n(bArr, iM11792n19, c6230g);
                    int i28 = c6230g.f24174a;
                    if (i28 < 0) {
                        throw InvalidProtocolBufferException.m11742f();
                    }
                    if (i28 > bArr.length - iM11792n18) {
                        throw InvalidProtocolBufferException.m11744h();
                    }
                    if (i28 == 0) {
                        interfaceC6210Z.add(AbstractC6251n.f24219t);
                    } else {
                        interfaceC6210Z.add(AbstractC6251n.m11896j(bArr, iM11792n18, i28));
                        iM11792n18 += i28;
                    }
                }
                return iM11792n18;
            case 30:
            case 44:
                i11 = i2;
                if (i5 != 2) {
                    if (i5 == 0) {
                        iM11793o = AbstractC6188N0.m11793o(i4, bArr, i11, i3, interfaceC6210Z, c6230g);
                    }
                    return i11;
                }
                C6193Q c6193q4 = (C6193Q) interfaceC6210Z;
                iM11793o = AbstractC6188N0.m11792n(bArr, i11, c6230g);
                int i29 = c6230g.f24174a + iM11793o;
                while (iM11793o < i29) {
                    iM11793o = AbstractC6188N0.m11792n(bArr, iM11793o, c6230g);
                    c6193q4.addInt(c6230g.f24174a);
                }
                if (iM11793o != i29) {
                    throw InvalidProtocolBufferException.m11744h();
                }
                m12055k(i6);
                Class cls = AbstractC6180J0.f24092a;
                return iM11793o;
            case 33:
            case 47:
                i11 = i2;
                if (i5 == 2) {
                    C6193Q c6193q5 = (C6193Q) interfaceC6210Z;
                    int iM11792n20 = AbstractC6188N0.m11792n(bArr, i11, c6230g);
                    int i30 = c6230g.f24174a + iM11792n20;
                    while (iM11792n20 < i30) {
                        iM11792n20 = AbstractC6188N0.m11792n(bArr, iM11792n20, c6230g);
                        c6193q5.addInt(AbstractC6261s.m11964b(c6230g.f24174a));
                    }
                    if (iM11792n20 == i30) {
                        return iM11792n20;
                    }
                    throw InvalidProtocolBufferException.m11744h();
                }
                if (i5 == 0) {
                    C6193Q c6193q6 = (C6193Q) interfaceC6210Z;
                    int iM11792n21 = AbstractC6188N0.m11792n(bArr, i11, c6230g);
                    c6193q6.addInt(AbstractC6261s.m11964b(c6230g.f24174a));
                    while (iM11792n21 < i3) {
                        int iM11792n22 = AbstractC6188N0.m11792n(bArr, iM11792n21, c6230g);
                        if (i4 != c6230g.f24174a) {
                            return iM11792n21;
                        }
                        iM11792n21 = AbstractC6188N0.m11792n(bArr, iM11792n22, c6230g);
                        c6193q6.addInt(AbstractC6261s.m11964b(c6230g.f24174a));
                    }
                    return iM11792n21;
                }
                return i11;
            case 34:
            case 48:
                i11 = i2;
                if (i5 == 2) {
                    C6237i0 c6237i4 = (C6237i0) interfaceC6210Z;
                    int iM11792n23 = AbstractC6188N0.m11792n(bArr, i11, c6230g);
                    int i31 = c6230g.f24174a + iM11792n23;
                    while (iM11792n23 < i31) {
                        iM11792n23 = AbstractC6188N0.m11794p(bArr, iM11792n23, c6230g);
                        c6237i4.addLong(AbstractC6261s.m11965c(c6230g.f24175b));
                    }
                    if (iM11792n23 == i31) {
                        return iM11792n23;
                    }
                    throw InvalidProtocolBufferException.m11744h();
                }
                if (i5 == 0) {
                    C6237i0 c6237i5 = (C6237i0) interfaceC6210Z;
                    int iM11794p3 = AbstractC6188N0.m11794p(bArr, i11, c6230g);
                    c6237i5.addLong(AbstractC6261s.m11965c(c6230g.f24175b));
                    while (iM11794p3 < i3) {
                        int iM11792n24 = AbstractC6188N0.m11792n(bArr, iM11794p3, c6230g);
                        if (i4 != c6230g.f24174a) {
                            return iM11794p3;
                        }
                        iM11794p3 = AbstractC6188N0.m11794p(bArr, iM11792n24, c6230g);
                        c6237i5.addLong(AbstractC6261s.m11965c(c6230g.f24175b));
                    }
                    return iM11794p3;
                }
                return i11;
            case 49:
                if (i5 == 3) {
                    InterfaceC6178I0 interfaceC6178I0M12057m = m12057m(i6);
                    int i32 = (i4 & (-8)) | 4;
                    int iM11787g = AbstractC6188N0.m11787g(interfaceC6178I0M12057m, bArr, i2, i3, i32, c6230g);
                    InterfaceC6178I0 interfaceC6178I0 = interfaceC6178I0M12057m;
                    byte[] bArr2 = bArr;
                    interfaceC6210Z.add(c6230g.f24176c);
                    while (iM11787g < i3) {
                        int iM11792n25 = AbstractC6188N0.m11792n(bArr2, iM11787g, c6230g);
                        if (i4 != c6230g.f24174a) {
                            return iM11787g;
                        }
                        byte[] bArr3 = bArr2;
                        InterfaceC6178I0 interfaceC6178I1 = interfaceC6178I0;
                        iM11787g = AbstractC6188N0.m11787g(interfaceC6178I1, bArr3, iM11792n25, i3, i32, c6230g);
                        interfaceC6210Z.add(c6230g.f24176c);
                        interfaceC6178I0 = interfaceC6178I1;
                        bArr2 = bArr3;
                    }
                    return iM11787g;
                }
            default:
                return i2;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m12043F(Object obj, long j2, C6263t c6263t, InterfaceC6178I0 interfaceC6178I0, C6161A c6161a) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo11932z;
        List listMo11881c = this.f24286k.mo11881c(obj, j2);
        AbstractC6261s abstractC6261s = c6263t.f24262a;
        int i2 = c6263t.f24263b;
        if ((i2 & 7) != 3) {
            throw InvalidProtocolBufferException.m11740d();
        }
        do {
            Object objNewInstance = interfaceC6178I0.newInstance();
            c6263t.m11973b(objNewInstance, interfaceC6178I0, c6161a);
            interfaceC6178I0.makeImmutable(objNewInstance);
            listMo11881c.add(objNewInstance);
            if (abstractC6261s.mo11914e() || c6263t.f24265d != 0) {
                return;
            } else {
                iMo11932z = abstractC6261s.mo11932z();
            }
        } while (iMo11932z == i2);
        c6263t.f24265d = iMo11932z;
    }

    /* JADX INFO: renamed from: G */
    public final void m12044G(Object obj, int i2, C6263t c6263t, InterfaceC6178I0 interfaceC6178I0, C6161A c6161a) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo11932z;
        List listMo11881c = this.f24286k.mo11881c(obj, i2 & 1048575);
        AbstractC6261s abstractC6261s = c6263t.f24262a;
        int i3 = c6263t.f24263b;
        if ((i3 & 7) != 2) {
            throw InvalidProtocolBufferException.m11740d();
        }
        do {
            Object objNewInstance = interfaceC6178I0.newInstance();
            c6263t.m11974c(objNewInstance, interfaceC6178I0, c6161a);
            interfaceC6178I0.makeImmutable(objNewInstance);
            listMo11881c.add(objNewInstance);
            if (abstractC6261s.mo11914e() || c6263t.f24265d != 0) {
                return;
            } else {
                iMo11932z = abstractC6261s.mo11932z();
            }
        } while (iMo11932z == i3);
        c6263t.f24265d = iMo11932z;
    }

    /* JADX INFO: renamed from: H */
    public final void m12045H(int i2, C6263t c6263t, Object obj) {
        if ((536870912 & i2) != 0) {
            c6263t.m11994w(2);
            AbstractC6223d1.m11875p(obj, i2 & 1048575, c6263t.f24262a.mo11931y());
        } else if (!this.f24281f) {
            AbstractC6223d1.m11875p(obj, i2 & 1048575, c6263t.m11976e());
        } else {
            c6263t.m11994w(2);
            AbstractC6223d1.m11875p(obj, i2 & 1048575, c6263t.f24262a.mo11930x());
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m12046J(Object obj, int i2) {
        int i3 = this.f24276a[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 == 1048575) {
            return;
        }
        AbstractC6223d1.m11873n(obj, j2, (1 << (i3 >>> 20)) | AbstractC6223d1.f24164c.m11852i(obj, j2));
    }

    /* JADX INFO: renamed from: K */
    public final void m12047K(Object obj, int i2, int i3) {
        AbstractC6223d1.m11873n(obj, this.f24276a[i3 + 2] & 1048575, i2);
    }

    /* JADX INFO: renamed from: L */
    public final int m12048L(int i2, int i3) {
        int[] iArr = this.f24276a;
        int length = (iArr.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = iArr[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: M */
    public final void m12049M(Object obj, int i2, Object obj2) {
        f24275o.putObject(obj, m12051P(i2) & 1048575, obj2);
        m12046J(obj, i2);
    }

    /* JADX INFO: renamed from: N */
    public final void m12050N(Object obj, int i2, int i3, Object obj2) {
        f24275o.putObject(obj, m12051P(i3) & 1048575, obj2);
        m12047K(obj, i2, i3);
    }

    /* JADX INFO: renamed from: P */
    public final int m12051P(int i2) {
        return this.f24276a[i2 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: Q */
    public final void m12052Q(Object obj, C6243k0 c6243k0) {
        int i2;
        int i3;
        int i4;
        boolean z;
        C6268v0 c6268v0 = this;
        int[] iArr = c6268v0.f24276a;
        int length = iArr.length;
        Unsafe unsafe = f24275o;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int iM12051P = c6268v0.m12051P(i7);
            int i9 = iArr[i7];
            int iM12031O = m12031O(iM12051P);
            int i10 = 1;
            if (iM12031O <= 17) {
                int i11 = iArr[i7 + 2];
                int i12 = i11 & i5;
                if (i12 != i6) {
                    i8 = i12 == i5 ? 0 : unsafe.getInt(obj, i12);
                    i6 = i12;
                }
                i2 = 1 << (i11 >>> 20);
            } else {
                i2 = 0;
            }
            long j2 = iM12051P & i5;
            switch (iM12031O) {
                case 0:
                    if (c6268v0.m12059o(obj, i7, i6, i8, i2)) {
                        double dMo11838g = AbstractC6223d1.f24164c.mo11838g(obj, j2);
                        AbstractC6269w abstractC6269w = (AbstractC6269w) c6243k0.f24193a;
                        abstractC6269w.getClass();
                        abstractC6269w.mo12003O(i9, Double.doubleToRawLongBits(dMo11838g));
                    }
                    break;
                case 1:
                    if (c6268v0.m12059o(obj, i7, i6, i8, i2)) {
                        float fMo11839h = AbstractC6223d1.f24164c.mo11839h(obj, j2);
                        AbstractC6269w abstractC6269w2 = (AbstractC6269w) c6243k0.f24193a;
                        abstractC6269w2.getClass();
                        abstractC6269w2.mo12001M(i9, Float.floatToRawIntBits(fMo11839h));
                    }
                    c6268v0 = this;
                    break;
                case 2:
                    if (c6268v0.m12059o(obj, i7, i6, i8, i2)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo12014Z(i9, unsafe.getLong(obj, j2));
                    }
                    c6268v0 = this;
                    break;
                case 3:
                    if (c6268v0.m12059o(obj, i7, i6, i8, i2)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo12014Z(i9, unsafe.getLong(obj, j2));
                    }
                    c6268v0 = this;
                    break;
                case 4:
                    if (c6268v0.m12059o(obj, i7, i6, i8, i2)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo12005Q(i9, unsafe.getInt(obj, j2));
                    }
                    c6268v0 = this;
                    break;
                case 5:
                    if (c6268v0.m12059o(obj, i7, i6, i8, i2)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo12003O(i9, unsafe.getLong(obj, j2));
                    }
                    c6268v0 = this;
                    break;
                case 6:
                    if (c6268v0.m12059o(obj, i7, i6, i8, i2)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo12001M(i9, unsafe.getInt(obj, j2));
                    }
                    c6268v0 = this;
                    break;
                case 7:
                    if (c6268v0.m12059o(obj, i7, i6, i8, i2)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo11997I(i9, AbstractC6223d1.f24164c.mo11835d(obj, j2));
                    }
                    c6268v0 = this;
                    break;
                case 8:
                    if (c6268v0.m12059o(obj, i7, i6, i8, i2)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            ((AbstractC6269w) c6243k0.f24193a).mo12009U(i9, (String) object);
                        } else {
                            ((AbstractC6269w) c6243k0.f24193a).mo11999K(i9, (AbstractC6251n) object);
                        }
                    }
                    c6268v0 = this;
                    break;
                case 9:
                    if (c6268v0.m12059o(obj, i7, i6, i8, i2)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo12007S(i9, (InterfaceC6262s0) unsafe.getObject(obj, j2), c6268v0.m12057m(i7));
                    }
                    break;
                case 10:
                    if (c6268v0.m12059o(obj, i7, i6, i8, i2)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo11999K(i9, (AbstractC6251n) unsafe.getObject(obj, j2));
                    }
                    c6268v0 = this;
                    break;
                case 11:
                    if (c6268v0.m12059o(obj, i7, i6, i8, i2)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo12012X(i9, unsafe.getInt(obj, j2));
                    }
                    c6268v0 = this;
                    break;
                case 12:
                    if (c6268v0.m12059o(obj, i7, i6, i8, i2)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo12005Q(i9, unsafe.getInt(obj, j2));
                    }
                    c6268v0 = this;
                    break;
                case 13:
                    if (c6268v0.m12059o(obj, i7, i6, i8, i2)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo12001M(i9, unsafe.getInt(obj, j2));
                    }
                    c6268v0 = this;
                    break;
                case 14:
                    if (c6268v0.m12059o(obj, i7, i6, i8, i2)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo12003O(i9, unsafe.getLong(obj, j2));
                    }
                    c6268v0 = this;
                    break;
                case 15:
                    if (c6268v0.m12059o(obj, i7, i6, i8, i2)) {
                        int i13 = unsafe.getInt(obj, j2);
                        ((AbstractC6269w) c6243k0.f24193a).mo12012X(i9, (i13 >> 31) ^ (i13 << 1));
                    }
                    c6268v0 = this;
                    break;
                case 16:
                    if (c6268v0.m12059o(obj, i7, i6, i8, i2)) {
                        long j3 = unsafe.getLong(obj, j2);
                        ((AbstractC6269w) c6243k0.f24193a).mo12014Z(i9, (j3 >> 63) ^ (j3 << 1));
                    }
                    c6268v0 = this;
                    break;
                case 17:
                    if (c6268v0.m12059o(obj, i7, i6, i8, i2)) {
                        c6243k0.m11890b(i9, unsafe.getObject(obj, j2), c6268v0.m12057m(i7));
                    }
                    break;
                case 18:
                    i6 = i6;
                    i8 = i8;
                    AbstractC6180J0.m11757m(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, false);
                    i8 = i8;
                    i6 = i6;
                    break;
                case 19:
                    i6 = i6;
                    i8 = i8;
                    AbstractC6180J0.m11761q(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, false);
                    i8 = i8;
                    i6 = i6;
                    break;
                case 20:
                    i6 = i6;
                    i8 = i8;
                    AbstractC6180J0.m11763s(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, false);
                    i8 = i8;
                    i6 = i6;
                    break;
                case 21:
                    i6 = i6;
                    i8 = i8;
                    AbstractC6180J0.m11769y(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, false);
                    i8 = i8;
                    i6 = i6;
                    break;
                case 22:
                    i6 = i6;
                    i8 = i8;
                    AbstractC6180J0.m11762r(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, false);
                    i8 = i8;
                    i6 = i6;
                    break;
                case 23:
                    i6 = i6;
                    i8 = i8;
                    AbstractC6180J0.m11760p(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, false);
                    i8 = i8;
                    i6 = i6;
                    break;
                case 24:
                    i6 = i6;
                    i8 = i8;
                    AbstractC6180J0.m11759o(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, false);
                    i8 = i8;
                    i6 = i6;
                    break;
                case 25:
                    i6 = i6;
                    i8 = i8;
                    AbstractC6180J0.m11756l(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, false);
                    i8 = i8;
                    i6 = i6;
                    break;
                case 26:
                    i3 = i6;
                    i4 = i8;
                    int i14 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j2);
                    Class cls = AbstractC6180J0.f24092a;
                    if (list != null && !list.isEmpty()) {
                        AbstractC6269w abstractC6269w3 = (AbstractC6269w) c6243k0.f24193a;
                        if (list instanceof InterfaceC6225e0) {
                            InterfaceC6225e0 interfaceC6225e0 = (InterfaceC6225e0) list;
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                Object raw = interfaceC6225e0.getRaw(i15);
                                if (raw instanceof String) {
                                    abstractC6269w3.mo12009U(i14, (String) raw);
                                } else {
                                    abstractC6269w3.mo11999K(i14, (AbstractC6251n) raw);
                                }
                            }
                        } else {
                            for (int i16 = 0; i16 < list.size(); i16++) {
                                abstractC6269w3.mo12009U(i14, (String) list.get(i16));
                            }
                        }
                    }
                    i8 = i4;
                    i6 = i3;
                    break;
                case 27:
                    i3 = i6;
                    i4 = i8;
                    int i17 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    InterfaceC6178I0 interfaceC6178I0M12057m = c6268v0.m12057m(i7);
                    Class cls2 = AbstractC6180J0.f24092a;
                    if (list2 != null && !list2.isEmpty()) {
                        c6243k0.getClass();
                        for (int i18 = 0; i18 < list2.size(); i18++) {
                            ((AbstractC6269w) c6243k0.f24193a).mo12007S(i17, (InterfaceC6262s0) list2.get(i18), interfaceC6178I0M12057m);
                        }
                    }
                    i8 = i4;
                    i6 = i3;
                    break;
                case 28:
                    i3 = i6;
                    i4 = i8;
                    int i19 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    Class cls3 = AbstractC6180J0.f24092a;
                    if (list3 != null && !list3.isEmpty()) {
                        c6243k0.getClass();
                        for (int i20 = 0; i20 < list3.size(); i20++) {
                            ((AbstractC6269w) c6243k0.f24193a).mo11999K(i19, (AbstractC6251n) list3.get(i20));
                        }
                    }
                    i8 = i4;
                    i6 = i3;
                    break;
                case 29:
                    z = false;
                    AbstractC6180J0.m11768x(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, false);
                    i8 = i8;
                    i6 = i6;
                    break;
                case 30:
                    z = false;
                    AbstractC6180J0.m11758n(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, false);
                    i8 = i8;
                    i6 = i6;
                    break;
                case 31:
                    z = false;
                    AbstractC6180J0.m11764t(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, false);
                    i8 = i8;
                    i6 = i6;
                    break;
                case 32:
                    z = false;
                    AbstractC6180J0.m11765u(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, false);
                    i8 = i8;
                    i6 = i6;
                    break;
                case 33:
                    z = false;
                    AbstractC6180J0.m11766v(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, false);
                    i8 = i8;
                    i6 = i6;
                    break;
                case 34:
                    z = false;
                    AbstractC6180J0.m11767w(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, false);
                    i8 = i8;
                    i6 = i6;
                    break;
                case 35:
                    i3 = i6;
                    i4 = i8;
                    AbstractC6180J0.m11757m(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, true);
                    i8 = i4;
                    i6 = i3;
                    break;
                case 36:
                    i3 = i6;
                    i4 = i8;
                    AbstractC6180J0.m11761q(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, true);
                    i8 = i4;
                    i6 = i3;
                    break;
                case 37:
                    i3 = i6;
                    i4 = i8;
                    AbstractC6180J0.m11763s(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, true);
                    i8 = i4;
                    i6 = i3;
                    break;
                case 38:
                    i3 = i6;
                    i4 = i8;
                    AbstractC6180J0.m11769y(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, true);
                    i8 = i4;
                    i6 = i3;
                    break;
                case 39:
                    i3 = i6;
                    i4 = i8;
                    AbstractC6180J0.m11762r(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, true);
                    i8 = i4;
                    i6 = i3;
                    break;
                case 40:
                    i3 = i6;
                    i4 = i8;
                    AbstractC6180J0.m11760p(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, true);
                    i8 = i4;
                    i6 = i3;
                    break;
                case 41:
                    i3 = i6;
                    i4 = i8;
                    AbstractC6180J0.m11759o(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, true);
                    i8 = i4;
                    i6 = i3;
                    break;
                case 42:
                    i3 = i6;
                    i4 = i8;
                    AbstractC6180J0.m11756l(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, true);
                    i8 = i4;
                    i6 = i3;
                    break;
                case 43:
                    i3 = i6;
                    i4 = i8;
                    AbstractC6180J0.m11768x(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, true);
                    i8 = i4;
                    i6 = i3;
                    break;
                case 44:
                    i3 = i6;
                    i4 = i8;
                    AbstractC6180J0.m11758n(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, true);
                    i8 = i4;
                    i6 = i3;
                    break;
                case 45:
                    i3 = i6;
                    i4 = i8;
                    AbstractC6180J0.m11764t(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, true);
                    i8 = i4;
                    i6 = i3;
                    break;
                case 46:
                    i3 = i6;
                    i4 = i8;
                    AbstractC6180J0.m11765u(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, true);
                    i8 = i4;
                    i6 = i3;
                    break;
                case 47:
                    i3 = i6;
                    i4 = i8;
                    AbstractC6180J0.m11766v(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, true);
                    i8 = i4;
                    i6 = i3;
                    break;
                case 48:
                    i3 = i6;
                    i4 = i8;
                    AbstractC6180J0.m11767w(iArr[i7], (List) unsafe.getObject(obj, j2), c6243k0, true);
                    i8 = i4;
                    i6 = i3;
                    break;
                case 49:
                    i3 = i6;
                    i4 = i8;
                    int i21 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    InterfaceC6178I0 interfaceC6178I0M12057m2 = c6268v0.m12057m(i7);
                    Class cls4 = AbstractC6180J0.f24092a;
                    if (list4 != null && !list4.isEmpty()) {
                        c6243k0.getClass();
                        for (int i22 = 0; i22 < list4.size(); i22++) {
                            c6243k0.m11890b(i21, list4.get(i22), interfaceC6178I0M12057m2);
                        }
                    }
                    i8 = i4;
                    i6 = i3;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j2);
                    if (object2 != null) {
                        Object objM12056l = c6268v0.m12056l(i7);
                        c6268v0.f24288m.getClass();
                        C6246l0 c6246l0 = ((C6249m0) objM12056l).f24206a;
                        EnumC6247l1 enumC6247l1 = c6246l0.f24197b;
                        EnumC6247l1 enumC6247l2 = c6246l0.f24196a;
                        AbstractC6269w abstractC6269w4 = (AbstractC6269w) c6243k0.f24193a;
                        abstractC6269w4.getClass();
                        for (Map.Entry entry : ((C6252n0) object2).entrySet()) {
                            abstractC6269w4.mo12011W(i9, 2);
                            int i23 = i6;
                            abstractC6269w4.mo12013Y(C6167D.m11707a(enumC6247l1, 2, entry.getValue()) + C6167D.m11707a(enumC6247l2, i10, entry.getKey()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C6167D.m11709e(abstractC6269w4, enumC6247l2, 1, key);
                            C6167D.m11709e(abstractC6269w4, enumC6247l1, 2, value);
                            i8 = i8;
                            i6 = i23;
                            i10 = 1;
                        }
                    }
                    i3 = i6;
                    i4 = i8;
                    i8 = i4;
                    i6 = i3;
                    break;
                case 51:
                    if (c6268v0.m12060q(obj, i9, i7)) {
                        double dDoubleValue = ((Double) AbstractC6223d1.f24164c.m11854k(obj, j2)).doubleValue();
                        AbstractC6269w abstractC6269w5 = (AbstractC6269w) c6243k0.f24193a;
                        abstractC6269w5.getClass();
                        abstractC6269w5.mo12003O(i9, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (c6268v0.m12060q(obj, i9, i7)) {
                        float fFloatValue = ((Float) AbstractC6223d1.f24164c.m11854k(obj, j2)).floatValue();
                        AbstractC6269w abstractC6269w6 = (AbstractC6269w) c6243k0.f24193a;
                        abstractC6269w6.getClass();
                        abstractC6269w6.mo12001M(i9, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (c6268v0.m12060q(obj, i9, i7)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo12014Z(i9, m12029A(obj, j2));
                    }
                    break;
                case 54:
                    if (c6268v0.m12060q(obj, i9, i7)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo12014Z(i9, m12029A(obj, j2));
                    }
                    break;
                case 55:
                    if (c6268v0.m12060q(obj, i9, i7)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo12005Q(i9, m12038z(obj, j2));
                    }
                    break;
                case 56:
                    if (c6268v0.m12060q(obj, i9, i7)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo12003O(i9, m12029A(obj, j2));
                    }
                    break;
                case 57:
                    if (c6268v0.m12060q(obj, i9, i7)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo12001M(i9, m12038z(obj, j2));
                    }
                    break;
                case 58:
                    if (c6268v0.m12060q(obj, i9, i7)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo11997I(i9, ((Boolean) AbstractC6223d1.f24164c.m11854k(obj, j2)).booleanValue());
                    }
                    break;
                case 59:
                    if (c6268v0.m12060q(obj, i9, i7)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof String) {
                            ((AbstractC6269w) c6243k0.f24193a).mo12009U(i9, (String) object3);
                        } else {
                            ((AbstractC6269w) c6243k0.f24193a).mo11999K(i9, (AbstractC6251n) object3);
                        }
                    }
                    break;
                case 60:
                    if (c6268v0.m12060q(obj, i9, i7)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo12007S(i9, (InterfaceC6262s0) unsafe.getObject(obj, j2), c6268v0.m12057m(i7));
                    }
                    break;
                case 61:
                    if (c6268v0.m12060q(obj, i9, i7)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo11999K(i9, (AbstractC6251n) unsafe.getObject(obj, j2));
                    }
                    break;
                case 62:
                    if (c6268v0.m12060q(obj, i9, i7)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo12012X(i9, m12038z(obj, j2));
                    }
                    break;
                case 63:
                    if (c6268v0.m12060q(obj, i9, i7)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo12005Q(i9, m12038z(obj, j2));
                    }
                    break;
                case 64:
                    if (c6268v0.m12060q(obj, i9, i7)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo12001M(i9, m12038z(obj, j2));
                    }
                    break;
                case 65:
                    if (c6268v0.m12060q(obj, i9, i7)) {
                        ((AbstractC6269w) c6243k0.f24193a).mo12003O(i9, m12029A(obj, j2));
                    }
                    break;
                case 66:
                    if (c6268v0.m12060q(obj, i9, i7)) {
                        int iM12038z = m12038z(obj, j2);
                        ((AbstractC6269w) c6243k0.f24193a).mo12012X(i9, (iM12038z >> 31) ^ (iM12038z << 1));
                    }
                    break;
                case 67:
                    if (c6268v0.m12060q(obj, i9, i7)) {
                        long jM12029A = m12029A(obj, j2);
                        ((AbstractC6269w) c6243k0.f24193a).mo12014Z(i9, (jM12029A << 1) ^ (jM12029A >> 63));
                    }
                    break;
                case 68:
                    if (c6268v0.m12060q(obj, i9, i7)) {
                        c6243k0.m11890b(i9, unsafe.getObject(obj, j2), c6268v0.m12057m(i7));
                    }
                    break;
                default:
                    break;
            }
            i7 += 3;
            i5 = 1048575;
        }
        ((C6203V0) c6268v0.f24287l).getClass();
        ((AbstractC6185M) obj).unknownFields.m11829g(c6243k0);
    }

    @Override // com.google.protobuf.InterfaceC6178I0
    /* JADX INFO: renamed from: a */
    public final void mo11731a(Object obj, C6243k0 c6243k0) {
        c6243k0.getClass();
        m12052Q(obj, c6243k0);
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0616 A[Catch: all -> 0x03ad, TryCatch #12 {all -> 0x03ad, blocks: (B:148:0x0611, B:150:0x0616, B:151:0x061b, B:107:0x0399, B:108:0x03a2, B:112:0x03b3, B:113:0x03c2, B:114:0x03d1, B:115:0x03e1, B:116:0x03f1, B:117:0x0402, B:118:0x0413, B:119:0x0424, B:120:0x0435, B:121:0x044e, B:122:0x0468, B:123:0x0482, B:124:0x049d, B:125:0x04b8, B:126:0x04d5, B:127:0x04ef, B:128:0x0504, B:129:0x051e, B:130:0x052b, B:131:0x0547, B:132:0x0562, B:133:0x057d, B:134:0x0597, B:135:0x05b1, B:136:0x05cb, B:137:0x05e8, B:138:0x05fb, B:142:0x0606), top: B:183:0x0611 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0623 A[LOOP:2: B:153:0x0621->B:154:0x0623, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x062d  */
    /* JADX WARN: Code duplicated, block: B:162:0x063e A[LOOP:3: B:161:0x063c->B:162:0x063e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:164:0x0648  */
    /* JADX WARN: Code duplicated, block: B:18:0x0046 A[PHI: r12
  0x0046: PHI (r12v4 com.google.protobuf.U0) = (r12v1 com.google.protobuf.U0), (r12v2 com.google.protobuf.U0), (r12v10 com.google.protobuf.U0) binds: [B:17:0x0041, B:28:0x0069, B:42:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:194:0x0621 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:? A[RETURN, SYNTHETIC] */
    @Override // com.google.protobuf.InterfaceC6178I0
    /* JADX INFO: renamed from: b */
    public final void mo11732b(Object obj, C6263t c6263t, C6161A c6161a) throws Throwable {
        C6263t c6263t2;
        C6263t c6263t3;
        C6268v0 c6268v0 = this;
        Object obj2 = obj;
        C6263t c6263t4 = c6263t;
        C6161A c6161a2 = c6161a;
        c6161a2.getClass();
        m12032h(obj2);
        AbstractC6199T0 abstractC6199T0 = c6268v0.f24287l;
        int[] iArr = c6268v0.f24282g;
        int i2 = c6268v0.f24284i;
        int i3 = c6268v0.f24283h;
        C6201U0 c6201u0Mo11821a = null;
        while (true) {
            try {
                int iM11972a = c6263t4.m11972a();
                int iM12048L = (iM11972a < c6268v0.f24278c || iM11972a > c6268v0.f24279d) ? -1 : c6268v0.m12048L(iM11972a, 0);
                if (iM12048L >= 0) {
                    int iM12051P = c6268v0.m12051P(iM12048L);
                    try {
                        int iM12031O = m12031O(iM12051P);
                        AbstractC6234h0 abstractC6234h0 = c6268v0.f24286k;
                        switch (iM12031O) {
                            case 0:
                                int i4 = iM12048L;
                                C6263t c6263t5 = c6263t4;
                                c6268v0 = c6268v0;
                                long jM12037y = m12037y(iM12051P);
                                c6263t5.m11994w(1);
                                try {
                                    Object obj3 = obj2;
                                    c6263t2 = c6263t;
                                    try {
                                        AbstractC6223d1.f24164c.mo11842o(obj3, jM12037y, c6263t5.f24262a.mo11919l());
                                        obj2 = obj3;
                                        try {
                                            c6268v0.m12046J(obj2, i4);
                                            break;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                            try {
                                                abstractC6199T0.getClass();
                                                if (c6201u0Mo11821a == null) {
                                                    c6201u0Mo11821a = abstractC6199T0.mo11821a(obj2);
                                                }
                                                if (!abstractC6199T0.m11822b(0, c6263t2, c6201u0Mo11821a)) {
                                                    while (i3 < i2) {
                                                        c6268v0.m12054j(iArr[i3], obj2, c6201u0Mo11821a);
                                                        i3++;
                                                    }
                                                    if (c6201u0Mo11821a != null) {
                                                        ((AbstractC6185M) obj2).unknownFields = c6201u0Mo11821a;
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                while (i3 < i2) {
                                                    c6268v0.m12054j(iArr[i3], obj2, c6201u0Mo11821a);
                                                    i3++;
                                                }
                                                if (c6201u0Mo11821a != null) {
                                                    ((C6203V0) abstractC6199T0).getClass();
                                                    ((AbstractC6185M) obj2).unknownFields = c6201u0Mo11821a;
                                                }
                                                throw th;
                                            }
                                        }
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                        obj2 = obj3;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj2 = obj3;
                                        while (i3 < i2) {
                                            c6268v0.m12054j(iArr[i3], obj2, c6201u0Mo11821a);
                                            i3++;
                                        }
                                        if (c6201u0Mo11821a != null) {
                                            ((C6203V0) abstractC6199T0).getClass();
                                            ((AbstractC6185M) obj2).unknownFields = c6201u0Mo11821a;
                                        }
                                        throw th;
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                    c6263t2 = c6263t;
                                }
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 1:
                                int i5 = iM12048L;
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                long jM12037y2 = m12037y(iM12051P);
                                c6263t3.m11994w(5);
                                AbstractC6223d1.f24164c.mo11843p(obj2, jM12037y2, c6263t3.f24262a.mo11923p());
                                c6268v0.m12046J(obj2, i5);
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 2:
                                int i6 = iM12048L;
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                long jM12037y3 = m12037y(iM12051P);
                                c6263t3.m11994w(0);
                                AbstractC6223d1.m11874o(obj2, jM12037y3, c6263t3.f24262a.mo11925r());
                                c6268v0.m12046J(obj2, i6);
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 3:
                                int i7 = iM12048L;
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                long jM12037y4 = m12037y(iM12051P);
                                c6263t3.m11994w(0);
                                AbstractC6223d1.m11874o(obj2, jM12037y4, c6263t3.f24262a.mo11903B());
                                c6268v0.m12046J(obj2, i7);
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 4:
                                int i8 = iM12048L;
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                long jM12037y5 = m12037y(iM12051P);
                                c6263t3.m11994w(0);
                                AbstractC6223d1.m11873n(obj2, jM12037y5, c6263t3.f24262a.mo11924q());
                                c6268v0.m12046J(obj2, i8);
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 5:
                                int i9 = iM12048L;
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                long jM12037y6 = m12037y(iM12051P);
                                c6263t3.m11994w(1);
                                AbstractC6223d1.m11874o(obj2, jM12037y6, c6263t3.f24262a.mo11922o());
                                c6268v0.m12046J(obj2, i9);
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 6:
                                int i10 = iM12048L;
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                long jM12037y7 = m12037y(iM12051P);
                                c6263t3.m11994w(5);
                                AbstractC6223d1.m11873n(obj2, jM12037y7, c6263t3.f24262a.mo11921n());
                                c6268v0.m12046J(obj2, i10);
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 7:
                                int i11 = iM12048L;
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                long jM12037y8 = m12037y(iM12051P);
                                c6263t3.m11994w(0);
                                AbstractC6223d1.f24164c.mo11840m(obj2, jM12037y8, c6263t3.f24262a.mo11917j());
                                c6268v0.m12046J(obj2, i11);
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 8:
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                c6268v0.m12045H(iM12051P, c6263t3, obj2);
                                c6268v0.m12046J(obj2, iM12048L);
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 9:
                                c6268v0 = c6268v0;
                                int i12 = iM12048L;
                                c6263t3 = c6263t4;
                                InterfaceC6262s0 interfaceC6262s0 = (InterfaceC6262s0) c6268v0.m12064u(obj2, i12);
                                InterfaceC6178I0 interfaceC6178I0M12057m = c6268v0.m12057m(i12);
                                c6263t3.m11994w(2);
                                c6263t3.m11974c(interfaceC6262s0, interfaceC6178I0M12057m, c6161a2);
                                c6268v0.m12049M(obj2, i12, interfaceC6262s0);
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 10:
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                AbstractC6223d1.m11875p(obj2, m12037y(iM12051P), c6263t3.m11976e());
                                c6268v0.m12046J(obj2, iM12048L);
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 11:
                                int i13 = iM12048L;
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                long jM12037y9 = m12037y(iM12051P);
                                c6263t3.m11994w(0);
                                AbstractC6223d1.m11873n(obj2, jM12037y9, c6263t3.f24262a.mo11902A());
                                c6268v0.m12046J(obj2, i13);
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 12:
                                int i14 = iM12048L;
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                c6263t3.m11994w(0);
                                int iMo11920m = c6263t3.f24262a.mo11920m();
                                c6268v0.m12055k(i14);
                                AbstractC6223d1.m11873n(obj2, m12037y(iM12051P), iMo11920m);
                                c6268v0.m12046J(obj2, i14);
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 13:
                                int i15 = iM12048L;
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                long jM12037y10 = m12037y(iM12051P);
                                c6263t3.m11994w(5);
                                AbstractC6223d1.m11873n(obj2, jM12037y10, c6263t3.f24262a.mo11926t());
                                c6268v0.m12046J(obj2, i15);
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 14:
                                int i16 = iM12048L;
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                long jM12037y11 = m12037y(iM12051P);
                                c6263t3.m11994w(1);
                                AbstractC6223d1.m11874o(obj2, jM12037y11, c6263t3.f24262a.mo11927u());
                                c6268v0.m12046J(obj2, i16);
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 15:
                                int i17 = iM12048L;
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                long jM12037y12 = m12037y(iM12051P);
                                c6263t3.m11994w(0);
                                AbstractC6223d1.m11873n(obj2, jM12037y12, c6263t3.f24262a.mo11928v());
                                c6268v0.m12046J(obj2, i17);
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 16:
                                int i18 = iM12048L;
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                long jM12037y13 = m12037y(iM12051P);
                                c6263t3.m11994w(0);
                                AbstractC6223d1.m11874o(obj2, jM12037y13, c6263t3.f24262a.mo11929w());
                                c6268v0.m12046J(obj2, i18);
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 17:
                                c6268v0 = c6268v0;
                                int i19 = iM12048L;
                                c6263t3 = c6263t4;
                                InterfaceC6262s0 interfaceC6262s1 = (InterfaceC6262s0) c6268v0.m12064u(obj2, i19);
                                InterfaceC6178I0 interfaceC6178I0M12057m2 = c6268v0.m12057m(i19);
                                c6263t3.m11994w(3);
                                c6263t3.m11973b(interfaceC6262s1, interfaceC6178I0M12057m2, c6161a2);
                                c6268v0.m12049M(obj2, i19, interfaceC6262s1);
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 18:
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                c6263t3.m11978g(abstractC6234h0.mo11881c(obj2, m12037y(iM12051P)));
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 19:
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                c6263t3.m11983l(abstractC6234h0.mo11881c(obj2, m12037y(iM12051P)));
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 20:
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                c6263t3.m11985n(abstractC6234h0.mo11881c(obj2, m12037y(iM12051P)));
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 21:
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                c6263t3.m11992u(abstractC6234h0.mo11881c(obj2, m12037y(iM12051P)));
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 22:
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                c6263t3.m11984m(abstractC6234h0.mo11881c(obj2, m12037y(iM12051P)));
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 23:
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                c6263t3.m11982k(abstractC6234h0.mo11881c(obj2, m12037y(iM12051P)));
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 24:
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                c6263t3.m11981j(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 25:
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                c6263t3.m11975d(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 26:
                                c6263t3 = c6263t4;
                                c6268v0 = c6268v0;
                                if ((536870912 & iM12051P) != 0) {
                                    try {
                                        c6263t3.m11990s(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575), true);
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                        c6263t2 = c6263t3;
                                        abstractC6199T0.getClass();
                                        if (c6201u0Mo11821a == null) {
                                            c6201u0Mo11821a = abstractC6199T0.mo11821a(obj2);
                                        }
                                        if (!abstractC6199T0.m11822b(0, c6263t2, c6201u0Mo11821a)) {
                                            while (i3 < i2) {
                                                c6268v0.m12054j(iArr[i3], obj2, c6201u0Mo11821a);
                                                i3++;
                                            }
                                            if (c6201u0Mo11821a != null) {
                                                ((AbstractC6185M) obj2).unknownFields = c6201u0Mo11821a;
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } else {
                                    c6263t3.m11990s(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575), false);
                                }
                                c6263t2 = c6263t3;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 27:
                                try {
                                    try {
                                        c6268v0.m12044G(obj2, iM12051P, c6263t4, c6268v0.m12057m(iM12048L), c6161a);
                                        c6268v0 = c6268v0;
                                        c6263t3 = c6263t4;
                                        c6263t2 = c6263t3;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                        c6263t2 = c6263t4;
                                        abstractC6199T0.getClass();
                                        if (c6201u0Mo11821a == null) {
                                            c6201u0Mo11821a = abstractC6199T0.mo11821a(obj2);
                                        }
                                        if (!abstractC6199T0.m11822b(0, c6263t2, c6201u0Mo11821a)) {
                                            while (i3 < i2) {
                                                c6268v0.m12054j(iArr[i3], obj2, c6201u0Mo11821a);
                                                i3++;
                                            }
                                            if (c6201u0Mo11821a != null) {
                                                ((AbstractC6185M) obj2).unknownFields = c6201u0Mo11821a;
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                                }
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 28:
                                c6263t4.m11977f(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 29:
                                c6263t4.m11991t(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 30:
                                c6263t4.m11979h(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6268v0.m12055k(iM12048L);
                                Class cls = AbstractC6180J0.f24092a;
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 31:
                                c6263t4.m11986o(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 32:
                                c6263t4.m11987p(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 33:
                                c6263t4.m11988q(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 34:
                                c6263t4.m11989r(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 35:
                                c6263t4.m11978g(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 36:
                                c6263t4.m11983l(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 37:
                                c6263t4.m11985n(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 38:
                                c6263t4.m11992u(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 39:
                                c6263t4.m11984m(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 40:
                                c6263t4.m11982k(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 41:
                                c6263t4.m11981j(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 42:
                                c6263t4.m11975d(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 43:
                                c6263t4.m11991t(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 44:
                                c6263t4.m11979h(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6268v0.m12055k(iM12048L);
                                Class cls2 = AbstractC6180J0.f24092a;
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 45:
                                c6263t4.m11986o(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 46:
                                c6263t4.m11987p(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 47:
                                c6263t4.m11988q(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 48:
                                c6263t4.m11989r(abstractC6234h0.mo11881c(obj2, iM12051P & 1048575));
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 49:
                                obj2 = obj;
                                try {
                                    c6268v0.m12043F(obj2, iM12051P & 1048575, c6263t, c6268v0.m12057m(iM12048L), c6161a);
                                    c6263t4 = c6263t;
                                    c6268v0 = c6268v0;
                                    c6263t2 = c6263t4;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused7) {
                                    c6268v0 = c6268v0;
                                    c6263t2 = c6263t;
                                    abstractC6199T0.getClass();
                                    if (c6201u0Mo11821a == null) {
                                        c6201u0Mo11821a = abstractC6199T0.mo11821a(obj2);
                                    }
                                    if (!abstractC6199T0.m11822b(0, c6263t2, c6201u0Mo11821a)) {
                                        while (i3 < i2) {
                                            c6268v0.m12054j(iArr[i3], obj2, c6201u0Mo11821a);
                                            i3++;
                                        }
                                        if (c6201u0Mo11821a != null) {
                                            ((AbstractC6185M) obj2).unknownFields = c6201u0Mo11821a;
                                            return;
                                        }
                                        return;
                                    }
                                }
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 50:
                                try {
                                    c6268v0.m12061r(obj2, iM12048L, c6268v0.m12056l(iM12048L), c6161a2, c6263t);
                                    obj2 = obj;
                                    c6263t2 = c6263t;
                                    c6268v0 = c6268v0;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused8) {
                                    obj2 = obj;
                                    c6263t2 = c6263t;
                                    c6268v0 = c6268v0;
                                    abstractC6199T0.getClass();
                                    if (c6201u0Mo11821a == null) {
                                        c6201u0Mo11821a = abstractC6199T0.mo11821a(obj2);
                                    }
                                    if (!abstractC6199T0.m11822b(0, c6263t2, c6201u0Mo11821a)) {
                                        while (i3 < i2) {
                                            c6268v0.m12054j(iArr[i3], obj2, c6201u0Mo11821a);
                                            i3++;
                                        }
                                        if (c6201u0Mo11821a != null) {
                                            ((AbstractC6185M) obj2).unknownFields = c6201u0Mo11821a;
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj2 = obj;
                                    c6268v0 = c6268v0;
                                    while (i3 < i2) {
                                        c6268v0.m12054j(iArr[i3], obj2, c6201u0Mo11821a);
                                        i3++;
                                    }
                                    if (c6201u0Mo11821a != null) {
                                        ((C6203V0) abstractC6199T0).getClass();
                                        ((AbstractC6185M) obj2).unknownFields = c6201u0Mo11821a;
                                    }
                                    throw th;
                                }
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 51:
                                c6263t4.m11994w(1);
                                AbstractC6223d1.m11875p(obj2, iM12051P & 1048575, Double.valueOf(c6263t4.f24262a.mo11919l()));
                                c6268v0.m12047K(obj2, iM11972a, iM12048L);
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 52:
                                c6263t4.m11994w(5);
                                AbstractC6223d1.m11875p(obj2, iM12051P & 1048575, Float.valueOf(c6263t4.f24262a.mo11923p()));
                                c6268v0.m12047K(obj2, iM11972a, iM12048L);
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 53:
                                c6263t4.m11994w(0);
                                AbstractC6223d1.m11875p(obj2, iM12051P & 1048575, Long.valueOf(c6263t4.f24262a.mo11925r()));
                                c6268v0.m12047K(obj2, iM11972a, iM12048L);
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 54:
                                c6263t4.m11994w(0);
                                AbstractC6223d1.m11875p(obj2, iM12051P & 1048575, Long.valueOf(c6263t4.f24262a.mo11903B()));
                                c6268v0.m12047K(obj2, iM11972a, iM12048L);
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 55:
                                c6263t4.m11994w(0);
                                AbstractC6223d1.m11875p(obj2, iM12051P & 1048575, Integer.valueOf(c6263t4.f24262a.mo11924q()));
                                c6268v0.m12047K(obj2, iM11972a, iM12048L);
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 56:
                                c6263t4.m11994w(1);
                                AbstractC6223d1.m11875p(obj2, iM12051P & 1048575, Long.valueOf(c6263t4.f24262a.mo11922o()));
                                c6268v0.m12047K(obj2, iM11972a, iM12048L);
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 57:
                                c6263t4.m11994w(5);
                                AbstractC6223d1.m11875p(obj2, iM12051P & 1048575, Integer.valueOf(c6263t4.f24262a.mo11921n()));
                                c6268v0.m12047K(obj2, iM11972a, iM12048L);
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 58:
                                c6263t4.m11994w(0);
                                AbstractC6223d1.m11875p(obj2, iM12051P & 1048575, Boolean.valueOf(c6263t4.f24262a.mo11917j()));
                                c6268v0.m12047K(obj2, iM11972a, iM12048L);
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 59:
                                c6268v0.m12045H(iM12051P, c6263t4, obj2);
                                c6268v0.m12047K(obj2, iM11972a, iM12048L);
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 60:
                                InterfaceC6262s0 interfaceC6262s2 = (InterfaceC6262s0) c6268v0.m12065v(obj2, iM11972a, iM12048L);
                                InterfaceC6178I0 interfaceC6178I0M12057m3 = c6268v0.m12057m(iM12048L);
                                c6263t4.m11994w(2);
                                c6263t4.m11974c(interfaceC6262s2, interfaceC6178I0M12057m3, c6161a2);
                                c6268v0.m12050N(obj2, iM11972a, iM12048L, interfaceC6262s2);
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 61:
                                AbstractC6223d1.m11875p(obj2, iM12051P & 1048575, c6263t4.m11976e());
                                c6268v0.m12047K(obj2, iM11972a, iM12048L);
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 62:
                                c6263t4.m11994w(0);
                                AbstractC6223d1.m11875p(obj2, iM12051P & 1048575, Integer.valueOf(c6263t4.f24262a.mo11902A()));
                                c6268v0.m12047K(obj2, iM11972a, iM12048L);
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 63:
                                c6263t4.m11994w(0);
                                int iMo11920m2 = c6263t4.f24262a.mo11920m();
                                c6268v0.m12055k(iM12048L);
                                AbstractC6223d1.m11875p(obj2, iM12051P & 1048575, Integer.valueOf(iMo11920m2));
                                c6268v0.m12047K(obj2, iM11972a, iM12048L);
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 64:
                                c6263t4.m11994w(5);
                                AbstractC6223d1.m11875p(obj2, iM12051P & 1048575, Integer.valueOf(c6263t4.f24262a.mo11926t()));
                                c6268v0.m12047K(obj2, iM11972a, iM12048L);
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 65:
                                c6263t4.m11994w(1);
                                AbstractC6223d1.m11875p(obj2, iM12051P & 1048575, Long.valueOf(c6263t4.f24262a.mo11927u()));
                                c6268v0.m12047K(obj2, iM11972a, iM12048L);
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 66:
                                c6263t4.m11994w(0);
                                AbstractC6223d1.m11875p(obj2, iM12051P & 1048575, Integer.valueOf(c6263t4.f24262a.mo11928v()));
                                c6268v0.m12047K(obj2, iM11972a, iM12048L);
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 67:
                                c6263t4.m11994w(0);
                                AbstractC6223d1.m11875p(obj2, iM12051P & 1048575, Long.valueOf(c6263t4.f24262a.mo11929w()));
                                c6268v0.m12047K(obj2, iM11972a, iM12048L);
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            case 68:
                                InterfaceC6262s0 interfaceC6262s3 = (InterfaceC6262s0) c6268v0.m12065v(obj2, iM11972a, iM12048L);
                                InterfaceC6178I0 interfaceC6178I0M12057m4 = c6268v0.m12057m(iM12048L);
                                c6263t4.m11994w(3);
                                c6263t4.m11973b(interfaceC6262s3, interfaceC6178I0M12057m4, c6161a2);
                                c6268v0.m12050N(obj2, iM11972a, iM12048L, interfaceC6262s3);
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                            default:
                                if (c6201u0Mo11821a == null) {
                                    c6201u0Mo11821a = abstractC6199T0.mo11821a(obj2);
                                }
                                if (!abstractC6199T0.m11822b(0, c6263t4, c6201u0Mo11821a)) {
                                    while (i3 < i2) {
                                        c6268v0.m12054j(iArr[i3], obj2, c6201u0Mo11821a);
                                        i3++;
                                    }
                                    if (c6201u0Mo11821a != null) {
                                        ((AbstractC6185M) obj2).unknownFields = c6201u0Mo11821a;
                                    }
                                }
                                c6268v0 = c6268v0;
                                c6263t2 = c6263t4;
                                c6161a2 = c6161a;
                                c6268v0 = c6268v0;
                                c6263t4 = c6263t2;
                                break;
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused9) {
                    }
                } else if (iM11972a == Integer.MAX_VALUE) {
                    while (i3 < i2) {
                        c6268v0.m12054j(iArr[i3], obj2, c6201u0Mo11821a);
                        i3++;
                    }
                    if (c6201u0Mo11821a != null) {
                        ((C6203V0) abstractC6199T0).getClass();
                        ((AbstractC6185M) obj2).unknownFields = c6201u0Mo11821a;
                    }
                } else {
                    abstractC6199T0.getClass();
                    if (c6201u0Mo11821a == null) {
                        c6201u0Mo11821a = abstractC6199T0.mo11821a(obj2);
                    }
                    if (!abstractC6199T0.m11822b(0, c6263t4, c6201u0Mo11821a)) {
                        while (i3 < i2) {
                            c6268v0.m12054j(iArr[i3], obj2, c6201u0Mo11821a);
                            i3++;
                        }
                        if (c6201u0Mo11821a != null) {
                            ((AbstractC6185M) obj2).unknownFields = c6201u0Mo11821a;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC6178I0
    /* JADX INFO: renamed from: c */
    public final void mo11733c(Object obj, byte[] bArr, int i2, int i3, C6230g c6230g) {
        m12040C(obj, bArr, i2, i3, 0, c6230g);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.InterfaceC6178I0
    /* JADX INFO: renamed from: d */
    public final int mo11734d(AbstractC6185M abstractC6185M) {
        int i2;
        int iM11833b;
        int i3;
        int[] iArr = this.f24276a;
        int length = iArr.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int iM12051P = m12051P(i5);
            int i6 = iArr[i5];
            long j2 = 1048575 & iM12051P;
            int i7 = 1237;
            int iHashCode = 37;
            switch (m12031O(iM12051P)) {
                case 0:
                    i2 = i4 * 53;
                    iM11833b = AbstractC6213a0.m11833b(Double.doubleToLongBits(AbstractC6223d1.f24164c.mo11838g(abstractC6185M, j2)));
                    i4 = iM11833b + i2;
                    break;
                case 1:
                    i2 = i4 * 53;
                    iM11833b = Float.floatToIntBits(AbstractC6223d1.f24164c.mo11839h(abstractC6185M, j2));
                    i4 = iM11833b + i2;
                    break;
                case 2:
                    i2 = i4 * 53;
                    iM11833b = AbstractC6213a0.m11833b(AbstractC6223d1.f24164c.m11853j(abstractC6185M, j2));
                    i4 = iM11833b + i2;
                    break;
                case 3:
                    i2 = i4 * 53;
                    iM11833b = AbstractC6213a0.m11833b(AbstractC6223d1.f24164c.m11853j(abstractC6185M, j2));
                    i4 = iM11833b + i2;
                    break;
                case 4:
                    i2 = i4 * 53;
                    iM11833b = AbstractC6223d1.f24164c.m11852i(abstractC6185M, j2);
                    i4 = iM11833b + i2;
                    break;
                case 5:
                    i2 = i4 * 53;
                    iM11833b = AbstractC6213a0.m11833b(AbstractC6223d1.f24164c.m11853j(abstractC6185M, j2));
                    i4 = iM11833b + i2;
                    break;
                case 6:
                    i2 = i4 * 53;
                    iM11833b = AbstractC6223d1.f24164c.m11852i(abstractC6185M, j2);
                    i4 = iM11833b + i2;
                    break;
                case 7:
                    i3 = i4 * 53;
                    boolean zMo11835d = AbstractC6223d1.f24164c.mo11835d(abstractC6185M, j2);
                    Charset charset = AbstractC6213a0.f24134a;
                    if (zMo11835d) {
                        i7 = 1231;
                    }
                    i4 = i7 + i3;
                    break;
                case 8:
                    i2 = i4 * 53;
                    iM11833b = ((String) AbstractC6223d1.f24164c.m11854k(abstractC6185M, j2)).hashCode();
                    i4 = iM11833b + i2;
                    break;
                case 9:
                    Object objM11854k = AbstractC6223d1.f24164c.m11854k(abstractC6185M, j2);
                    if (objM11854k != null) {
                        iHashCode = objM11854k.hashCode();
                    }
                    i4 = (i4 * 53) + iHashCode;
                    break;
                case 10:
                    i2 = i4 * 53;
                    iM11833b = AbstractC6223d1.f24164c.m11854k(abstractC6185M, j2).hashCode();
                    i4 = iM11833b + i2;
                    break;
                case 11:
                    i2 = i4 * 53;
                    iM11833b = AbstractC6223d1.f24164c.m11852i(abstractC6185M, j2);
                    i4 = iM11833b + i2;
                    break;
                case 12:
                    i2 = i4 * 53;
                    iM11833b = AbstractC6223d1.f24164c.m11852i(abstractC6185M, j2);
                    i4 = iM11833b + i2;
                    break;
                case 13:
                    i2 = i4 * 53;
                    iM11833b = AbstractC6223d1.f24164c.m11852i(abstractC6185M, j2);
                    i4 = iM11833b + i2;
                    break;
                case 14:
                    i2 = i4 * 53;
                    iM11833b = AbstractC6213a0.m11833b(AbstractC6223d1.f24164c.m11853j(abstractC6185M, j2));
                    i4 = iM11833b + i2;
                    break;
                case 15:
                    i2 = i4 * 53;
                    iM11833b = AbstractC6223d1.f24164c.m11852i(abstractC6185M, j2);
                    i4 = iM11833b + i2;
                    break;
                case 16:
                    i2 = i4 * 53;
                    iM11833b = AbstractC6213a0.m11833b(AbstractC6223d1.f24164c.m11853j(abstractC6185M, j2));
                    i4 = iM11833b + i2;
                    break;
                case 17:
                    Object objM11854k2 = AbstractC6223d1.f24164c.m11854k(abstractC6185M, j2);
                    if (objM11854k2 != null) {
                        iHashCode = objM11854k2.hashCode();
                    }
                    i4 = (i4 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i4 * 53;
                    iM11833b = AbstractC6223d1.f24164c.m11854k(abstractC6185M, j2).hashCode();
                    i4 = iM11833b + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    iM11833b = AbstractC6223d1.f24164c.m11854k(abstractC6185M, j2).hashCode();
                    i4 = iM11833b + i2;
                    break;
                case 51:
                    if (m12060q(abstractC6185M, i6, i5)) {
                        i2 = i4 * 53;
                        iM11833b = AbstractC6213a0.m11833b(Double.doubleToLongBits(((Double) AbstractC6223d1.f24164c.m11854k(abstractC6185M, j2)).doubleValue()));
                        i4 = iM11833b + i2;
                    }
                    break;
                case 52:
                    if (m12060q(abstractC6185M, i6, i5)) {
                        i2 = i4 * 53;
                        iM11833b = Float.floatToIntBits(((Float) AbstractC6223d1.f24164c.m11854k(abstractC6185M, j2)).floatValue());
                        i4 = iM11833b + i2;
                    }
                    break;
                case 53:
                    if (m12060q(abstractC6185M, i6, i5)) {
                        i2 = i4 * 53;
                        iM11833b = AbstractC6213a0.m11833b(m12029A(abstractC6185M, j2));
                        i4 = iM11833b + i2;
                    }
                    break;
                case 54:
                    if (m12060q(abstractC6185M, i6, i5)) {
                        i2 = i4 * 53;
                        iM11833b = AbstractC6213a0.m11833b(m12029A(abstractC6185M, j2));
                        i4 = iM11833b + i2;
                    }
                    break;
                case 55:
                    if (m12060q(abstractC6185M, i6, i5)) {
                        i2 = i4 * 53;
                        iM11833b = m12038z(abstractC6185M, j2);
                        i4 = iM11833b + i2;
                    }
                    break;
                case 56:
                    if (m12060q(abstractC6185M, i6, i5)) {
                        i2 = i4 * 53;
                        iM11833b = AbstractC6213a0.m11833b(m12029A(abstractC6185M, j2));
                        i4 = iM11833b + i2;
                    }
                    break;
                case 57:
                    if (m12060q(abstractC6185M, i6, i5)) {
                        i2 = i4 * 53;
                        iM11833b = m12038z(abstractC6185M, j2);
                        i4 = iM11833b + i2;
                    }
                    break;
                case 58:
                    if (m12060q(abstractC6185M, i6, i5)) {
                        i3 = i4 * 53;
                        boolean zBooleanValue = ((Boolean) AbstractC6223d1.f24164c.m11854k(abstractC6185M, j2)).booleanValue();
                        Charset charset2 = AbstractC6213a0.f24134a;
                        if (zBooleanValue) {
                            i7 = 1231;
                        }
                        i4 = i7 + i3;
                    }
                    break;
                case 59:
                    if (m12060q(abstractC6185M, i6, i5)) {
                        i2 = i4 * 53;
                        iM11833b = ((String) AbstractC6223d1.f24164c.m11854k(abstractC6185M, j2)).hashCode();
                        i4 = iM11833b + i2;
                    }
                    break;
                case 60:
                    if (m12060q(abstractC6185M, i6, i5)) {
                        i2 = i4 * 53;
                        iM11833b = AbstractC6223d1.f24164c.m11854k(abstractC6185M, j2).hashCode();
                        i4 = iM11833b + i2;
                    }
                    break;
                case 61:
                    if (m12060q(abstractC6185M, i6, i5)) {
                        i2 = i4 * 53;
                        iM11833b = AbstractC6223d1.f24164c.m11854k(abstractC6185M, j2).hashCode();
                        i4 = iM11833b + i2;
                    }
                    break;
                case 62:
                    if (m12060q(abstractC6185M, i6, i5)) {
                        i2 = i4 * 53;
                        iM11833b = m12038z(abstractC6185M, j2);
                        i4 = iM11833b + i2;
                    }
                    break;
                case 63:
                    if (m12060q(abstractC6185M, i6, i5)) {
                        i2 = i4 * 53;
                        iM11833b = m12038z(abstractC6185M, j2);
                        i4 = iM11833b + i2;
                    }
                    break;
                case 64:
                    if (m12060q(abstractC6185M, i6, i5)) {
                        i2 = i4 * 53;
                        iM11833b = m12038z(abstractC6185M, j2);
                        i4 = iM11833b + i2;
                    }
                    break;
                case 65:
                    if (m12060q(abstractC6185M, i6, i5)) {
                        i2 = i4 * 53;
                        iM11833b = AbstractC6213a0.m11833b(m12029A(abstractC6185M, j2));
                        i4 = iM11833b + i2;
                    }
                    break;
                case 66:
                    if (m12060q(abstractC6185M, i6, i5)) {
                        i2 = i4 * 53;
                        iM11833b = m12038z(abstractC6185M, j2);
                        i4 = iM11833b + i2;
                    }
                    break;
                case 67:
                    if (m12060q(abstractC6185M, i6, i5)) {
                        i2 = i4 * 53;
                        iM11833b = AbstractC6213a0.m11833b(m12029A(abstractC6185M, j2));
                        i4 = iM11833b + i2;
                    }
                    break;
                case 68:
                    if (m12060q(abstractC6185M, i6, i5)) {
                        i2 = i4 * 53;
                        iM11833b = AbstractC6223d1.f24164c.m11854k(abstractC6185M, j2).hashCode();
                        i4 = iM11833b + i2;
                    }
                    break;
            }
        }
        ((C6203V0) this.f24287l).getClass();
        return abstractC6185M.unknownFields.hashCode() + (i4 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:143:0x039b  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cb  */
    @Override // com.google.protobuf.InterfaceC6178I0
    /* JADX INFO: renamed from: e */
    public final int mo11735e(AbstractC6185M abstractC6185M) {
        int i2;
        int iM12069D;
        int iM12069D2;
        int iM12069D3;
        int iM12071F;
        int iM12069D4;
        int iM12067B;
        int iM12069D5;
        int iM12069D6;
        int iM12070E;
        int iM12072z;
        int serializedSize;
        int iM12069D7;
        int size;
        int iM11753i;
        int iM12069D8;
        int iM12069D9;
        int size2;
        int iM12069D10;
        int iM12070E2;
        int serializedSize2;
        int iM12069D11;
        int iM12069D12;
        int iM12071F2;
        int iM12069D13;
        int iM12067B2;
        C6268v0 c6268v0 = this;
        AbstractC6185M abstractC6185M2 = abstractC6185M;
        Unsafe unsafe = f24275o;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int iM12072z2 = 0;
        while (true) {
            int[] iArr = c6268v0.f24276a;
            if (i5 >= iArr.length) {
                ((C6203V0) c6268v0.f24287l).getClass();
                return abstractC6185M2.unknownFields.m11826c() + iM12072z2;
            }
            int iM12051P = c6268v0.m12051P(i5);
            int iM12031O = m12031O(iM12051P);
            int i7 = iArr[i5];
            int i8 = iArr[i5 + 2];
            int i9 = i8 & i3;
            if (iM12031O <= 17) {
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(abstractC6185M2, i9);
                    i4 = i9;
                }
                i2 = 1 << (i8 >>> 20);
            } else {
                i2 = 0;
            }
            long j2 = iM12051P & i3;
            if (iM12031O >= EnumC6169E.f24063t.f24067s) {
                int i10 = EnumC6169E.f24064u.f24067s;
            }
            switch (iM12031O) {
                case 0:
                    if (c6268v0.m12059o(abstractC6185M2, i5, i4, i6, i2)) {
                        iM12069D = AbstractC6269w.m12069D(i7);
                        serializedSize = iM12069D + 8;
                        iM12072z2 += serializedSize;
                    }
                    break;
                case 1:
                    if (c6268v0.m12059o(abstractC6185M2, i5, i4, i6, i2)) {
                        iM12069D2 = AbstractC6269w.m12069D(i7);
                        iM12069D6 = iM12069D2 + 4;
                        iM12072z2 += iM12069D6;
                    }
                    c6268v0 = this;
                    abstractC6185M2 = abstractC6185M;
                    break;
                case 2:
                    if (c6268v0.m12059o(abstractC6185M2, i5, i4, i6, i2)) {
                        long j3 = unsafe.getLong(abstractC6185M2, j2);
                        iM12069D3 = AbstractC6269w.m12069D(i7);
                        iM12071F = AbstractC6269w.m12071F(j3);
                        iM12072z2 += iM12071F + iM12069D3;
                    }
                    c6268v0 = this;
                    break;
                case 3:
                    if (c6268v0.m12059o(abstractC6185M2, i5, i4, i6, i2)) {
                        long j4 = unsafe.getLong(abstractC6185M2, j2);
                        iM12069D3 = AbstractC6269w.m12069D(i7);
                        iM12071F = AbstractC6269w.m12071F(j4);
                        iM12072z2 += iM12071F + iM12069D3;
                    }
                    c6268v0 = this;
                    break;
                case 4:
                    if (c6268v0.m12059o(abstractC6185M2, i5, i4, i6, i2)) {
                        int i11 = unsafe.getInt(abstractC6185M2, j2);
                        iM12069D4 = AbstractC6269w.m12069D(i7);
                        iM12067B = AbstractC6269w.m12067B(i11);
                        iM12072z = iM12067B + iM12069D4;
                        iM12072z2 += iM12072z;
                    }
                    c6268v0 = this;
                    break;
                case 5:
                    if (c6268v0.m12059o(abstractC6185M2, i5, i4, i6, i2)) {
                        iM12069D5 = AbstractC6269w.m12069D(i7);
                        iM12069D6 = iM12069D5 + 8;
                        iM12072z2 += iM12069D6;
                    }
                    c6268v0 = this;
                    abstractC6185M2 = abstractC6185M;
                    break;
                case 6:
                    if (c6268v0.m12059o(abstractC6185M2, i5, i4, i6, i2)) {
                        iM12069D2 = AbstractC6269w.m12069D(i7);
                        iM12069D6 = iM12069D2 + 4;
                        iM12072z2 += iM12069D6;
                    }
                    c6268v0 = this;
                    abstractC6185M2 = abstractC6185M;
                    break;
                case 7:
                    if (c6268v0.m12059o(abstractC6185M2, i5, i4, i6, i2)) {
                        iM12069D6 = AbstractC6269w.m12069D(i7) + 1;
                        iM12072z2 += iM12069D6;
                    }
                    c6268v0 = this;
                    abstractC6185M2 = abstractC6185M;
                    break;
                case 8:
                    if (c6268v0.m12059o(abstractC6185M2, i5, i4, i6, i2)) {
                        Object object = unsafe.getObject(abstractC6185M2, j2);
                        iM12072z2 = (object instanceof AbstractC6251n ? AbstractC6269w.m12072z(i7, (AbstractC6251n) object) : AbstractC6269w.m12068C((String) object) + AbstractC6269w.m12069D(i7)) + iM12072z2;
                    }
                    c6268v0 = this;
                    break;
                case 9:
                    if (c6268v0.m12059o(abstractC6185M2, i5, i4, i6, i2)) {
                        Object object2 = unsafe.getObject(abstractC6185M2, j2);
                        InterfaceC6178I0 interfaceC6178I0M12057m = c6268v0.m12057m(i5);
                        Class cls = AbstractC6180J0.f24092a;
                        int iM12069D14 = AbstractC6269w.m12069D(i7);
                        int serializedSize3 = ((AbstractC6218c) ((InterfaceC6262s0) object2)).getSerializedSize(interfaceC6178I0M12057m);
                        iM12070E = AbstractC6269w.m12070E(serializedSize3) + serializedSize3 + iM12069D14;
                        iM12072z2 += iM12070E;
                    }
                    break;
                case 10:
                    if (c6268v0.m12059o(abstractC6185M2, i5, i4, i6, i2)) {
                        iM12072z = AbstractC6269w.m12072z(i7, (AbstractC6251n) unsafe.getObject(abstractC6185M2, j2));
                        iM12072z2 += iM12072z;
                    }
                    c6268v0 = this;
                    break;
                case 11:
                    if (c6268v0.m12059o(abstractC6185M2, i5, i4, i6, i2)) {
                        int i12 = unsafe.getInt(abstractC6185M2, j2);
                        iM12069D4 = AbstractC6269w.m12069D(i7);
                        iM12067B = AbstractC6269w.m12070E(i12);
                        iM12072z = iM12067B + iM12069D4;
                        iM12072z2 += iM12072z;
                    }
                    c6268v0 = this;
                    break;
                case 12:
                    if (c6268v0.m12059o(abstractC6185M2, i5, i4, i6, i2)) {
                        int i13 = unsafe.getInt(abstractC6185M2, j2);
                        iM12069D4 = AbstractC6269w.m12069D(i7);
                        iM12067B = AbstractC6269w.m12067B(i13);
                        iM12072z = iM12067B + iM12069D4;
                        iM12072z2 += iM12072z;
                    }
                    c6268v0 = this;
                    break;
                case 13:
                    if (c6268v0.m12059o(abstractC6185M2, i5, i4, i6, i2)) {
                        iM12069D2 = AbstractC6269w.m12069D(i7);
                        iM12069D6 = iM12069D2 + 4;
                        iM12072z2 += iM12069D6;
                    }
                    c6268v0 = this;
                    abstractC6185M2 = abstractC6185M;
                    break;
                case 14:
                    if (c6268v0.m12059o(abstractC6185M2, i5, i4, i6, i2)) {
                        iM12069D5 = AbstractC6269w.m12069D(i7);
                        iM12069D6 = iM12069D5 + 8;
                        iM12072z2 += iM12069D6;
                    }
                    c6268v0 = this;
                    abstractC6185M2 = abstractC6185M;
                    break;
                case 15:
                    if (c6268v0.m12059o(abstractC6185M2, i5, i4, i6, i2)) {
                        int i14 = unsafe.getInt(abstractC6185M2, j2);
                        iM12069D4 = AbstractC6269w.m12069D(i7);
                        iM12067B = AbstractC6269w.m12070E((i14 >> 31) ^ (i14 << 1));
                        iM12072z = iM12067B + iM12069D4;
                        iM12072z2 += iM12072z;
                    }
                    c6268v0 = this;
                    break;
                case 16:
                    if (c6268v0.m12059o(abstractC6185M2, i5, i4, i6, i2)) {
                        long j5 = unsafe.getLong(abstractC6185M2, j2);
                        iM12069D3 = AbstractC6269w.m12069D(i7);
                        iM12071F = AbstractC6269w.m12071F((j5 >> 63) ^ (j5 << 1));
                        iM12072z2 += iM12071F + iM12069D3;
                    }
                    c6268v0 = this;
                    break;
                case 17:
                    if (c6268v0.m12059o(abstractC6185M2, i5, i4, i6, i2)) {
                        serializedSize = ((AbstractC6218c) ((InterfaceC6262s0) unsafe.getObject(abstractC6185M2, j2))).getSerializedSize(c6268v0.m12057m(i5)) + (AbstractC6269w.m12069D(i7) * 2);
                        iM12072z2 += serializedSize;
                    }
                    break;
                case 18:
                    serializedSize = AbstractC6180J0.m11747c(i7, (List) unsafe.getObject(abstractC6185M2, j2));
                    iM12072z2 += serializedSize;
                    break;
                case 19:
                    serializedSize = AbstractC6180J0.m11746b(i7, (List) unsafe.getObject(abstractC6185M2, j2));
                    iM12072z2 += serializedSize;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC6185M2, j2);
                    Class cls2 = AbstractC6180J0.f24092a;
                    if (list.size() == 0) {
                        iM12069D7 = 0;
                    } else {
                        iM12069D7 = (AbstractC6269w.m12069D(i7) * list.size()) + AbstractC6180J0.m11749e(list);
                    }
                    iM12072z2 += iM12069D7;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC6185M2, j2);
                    Class cls3 = AbstractC6180J0.f24092a;
                    size = list2.size();
                    if (size == 0) {
                        iM12069D7 = 0;
                    } else {
                        iM11753i = AbstractC6180J0.m11753i(list2);
                        iM12069D8 = AbstractC6269w.m12069D(i7);
                        iM12069D7 = (iM12069D8 * size) + iM11753i;
                    }
                    iM12072z2 += iM12069D7;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC6185M2, j2);
                    Class cls4 = AbstractC6180J0.f24092a;
                    size = list3.size();
                    if (size == 0) {
                        iM12069D7 = 0;
                    } else {
                        iM11753i = AbstractC6180J0.m11748d(list3);
                        iM12069D8 = AbstractC6269w.m12069D(i7);
                        iM12069D7 = (iM12069D8 * size) + iM11753i;
                    }
                    iM12072z2 += iM12069D7;
                    break;
                case 23:
                    serializedSize = AbstractC6180J0.m11747c(i7, (List) unsafe.getObject(abstractC6185M2, j2));
                    iM12072z2 += serializedSize;
                    break;
                case 24:
                    serializedSize = AbstractC6180J0.m11746b(i7, (List) unsafe.getObject(abstractC6185M2, j2));
                    iM12072z2 += serializedSize;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC6185M2, j2);
                    Class cls5 = AbstractC6180J0.f24092a;
                    int size3 = list4.size();
                    iM12072z2 += size3 == 0 ? 0 : (AbstractC6269w.m12069D(i7) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC6185M2, j2);
                    Class cls6 = AbstractC6180J0.f24092a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iM12069D7 = 0;
                    } else {
                        iM12069D7 = AbstractC6269w.m12069D(i7) * size4;
                        if (list5 instanceof InterfaceC6225e0) {
                            InterfaceC6225e0 interfaceC6225e0 = (InterfaceC6225e0) list5;
                            for (int i15 = 0; i15 < size4; i15++) {
                                Object raw = interfaceC6225e0.getRaw(i15);
                                iM12069D7 = (raw instanceof AbstractC6251n ? AbstractC6269w.m12066A((AbstractC6251n) raw) : AbstractC6269w.m12068C((String) raw)) + iM12069D7;
                            }
                        } else {
                            for (int i16 = 0; i16 < size4; i16++) {
                                Object obj = list5.get(i16);
                                iM12069D7 = (obj instanceof AbstractC6251n ? AbstractC6269w.m12066A((AbstractC6251n) obj) : AbstractC6269w.m12068C((String) obj)) + iM12069D7;
                            }
                        }
                    }
                    iM12072z2 += iM12069D7;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractC6185M2, j2);
                    InterfaceC6178I0 interfaceC6178I0M12057m2 = c6268v0.m12057m(i5);
                    Class cls7 = AbstractC6180J0.f24092a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iM12069D9 = 0;
                    } else {
                        iM12069D9 = AbstractC6269w.m12069D(i7) * size5;
                        for (int i17 = 0; i17 < size5; i17++) {
                            int serializedSize4 = ((AbstractC6218c) ((InterfaceC6262s0) list6.get(i17))).getSerializedSize(interfaceC6178I0M12057m2);
                            iM12069D9 += AbstractC6269w.m12070E(serializedSize4) + serializedSize4;
                        }
                    }
                    iM12072z2 += iM12069D9;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC6185M2, j2);
                    Class cls8 = AbstractC6180J0.f24092a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iM12069D7 = 0;
                    } else {
                        iM12069D7 = AbstractC6269w.m12069D(i7) * size6;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            iM12069D7 += AbstractC6269w.m12066A((AbstractC6251n) list7.get(i18));
                        }
                    }
                    iM12072z2 += iM12069D7;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC6185M2, j2);
                    Class cls9 = AbstractC6180J0.f24092a;
                    size = list8.size();
                    if (size == 0) {
                        iM12069D7 = 0;
                    } else {
                        iM11753i = AbstractC6180J0.m11752h(list8);
                        iM12069D8 = AbstractC6269w.m12069D(i7);
                        iM12069D7 = (iM12069D8 * size) + iM11753i;
                    }
                    iM12072z2 += iM12069D7;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC6185M2, j2);
                    Class cls10 = AbstractC6180J0.f24092a;
                    size = list9.size();
                    if (size == 0) {
                        iM12069D7 = 0;
                    } else {
                        iM11753i = AbstractC6180J0.m11745a(list9);
                        iM12069D8 = AbstractC6269w.m12069D(i7);
                        iM12069D7 = (iM12069D8 * size) + iM11753i;
                    }
                    iM12072z2 += iM12069D7;
                    break;
                case 31:
                    serializedSize = AbstractC6180J0.m11746b(i7, (List) unsafe.getObject(abstractC6185M2, j2));
                    iM12072z2 += serializedSize;
                    break;
                case 32:
                    serializedSize = AbstractC6180J0.m11747c(i7, (List) unsafe.getObject(abstractC6185M2, j2));
                    iM12072z2 += serializedSize;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC6185M2, j2);
                    Class cls11 = AbstractC6180J0.f24092a;
                    size = list10.size();
                    if (size == 0) {
                        iM12069D7 = 0;
                    } else {
                        iM11753i = AbstractC6180J0.m11750f(list10);
                        iM12069D8 = AbstractC6269w.m12069D(i7);
                        iM12069D7 = (iM12069D8 * size) + iM11753i;
                    }
                    iM12072z2 += iM12069D7;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC6185M2, j2);
                    Class cls12 = AbstractC6180J0.f24092a;
                    size = list11.size();
                    if (size == 0) {
                        iM12069D7 = 0;
                    } else {
                        iM11753i = AbstractC6180J0.m11751g(list11);
                        iM12069D8 = AbstractC6269w.m12069D(i7);
                        iM12069D7 = (iM12069D8 * size) + iM11753i;
                    }
                    iM12072z2 += iM12069D7;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(abstractC6185M2, j2);
                    Class cls13 = AbstractC6180J0.f24092a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iM12069D10 = AbstractC6269w.m12069D(i7);
                        iM12070E2 = AbstractC6269w.m12070E(size2);
                        iM12072z2 += iM12070E2 + iM12069D10 + size2;
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(abstractC6185M2, j2);
                    Class cls14 = AbstractC6180J0.f24092a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iM12069D10 = AbstractC6269w.m12069D(i7);
                        iM12070E2 = AbstractC6269w.m12070E(size2);
                        iM12072z2 += iM12070E2 + iM12069D10 + size2;
                    }
                    break;
                case 37:
                    size2 = AbstractC6180J0.m11749e((List) unsafe.getObject(abstractC6185M2, j2));
                    if (size2 > 0) {
                        iM12069D10 = AbstractC6269w.m12069D(i7);
                        iM12070E2 = AbstractC6269w.m12070E(size2);
                        iM12072z2 += iM12070E2 + iM12069D10 + size2;
                    }
                    break;
                case 38:
                    size2 = AbstractC6180J0.m11753i((List) unsafe.getObject(abstractC6185M2, j2));
                    if (size2 > 0) {
                        iM12069D10 = AbstractC6269w.m12069D(i7);
                        iM12070E2 = AbstractC6269w.m12070E(size2);
                        iM12072z2 += iM12070E2 + iM12069D10 + size2;
                    }
                    break;
                case 39:
                    size2 = AbstractC6180J0.m11748d((List) unsafe.getObject(abstractC6185M2, j2));
                    if (size2 > 0) {
                        iM12069D10 = AbstractC6269w.m12069D(i7);
                        iM12070E2 = AbstractC6269w.m12070E(size2);
                        iM12072z2 += iM12070E2 + iM12069D10 + size2;
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(abstractC6185M2, j2);
                    Class cls15 = AbstractC6180J0.f24092a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iM12069D10 = AbstractC6269w.m12069D(i7);
                        iM12070E2 = AbstractC6269w.m12070E(size2);
                        iM12072z2 += iM12070E2 + iM12069D10 + size2;
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(abstractC6185M2, j2);
                    Class cls16 = AbstractC6180J0.f24092a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iM12069D10 = AbstractC6269w.m12069D(i7);
                        iM12070E2 = AbstractC6269w.m12070E(size2);
                        iM12072z2 += iM12070E2 + iM12069D10 + size2;
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(abstractC6185M2, j2);
                    Class cls17 = AbstractC6180J0.f24092a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iM12069D10 = AbstractC6269w.m12069D(i7);
                        iM12070E2 = AbstractC6269w.m12070E(size2);
                        iM12072z2 += iM12070E2 + iM12069D10 + size2;
                    }
                    break;
                case 43:
                    size2 = AbstractC6180J0.m11752h((List) unsafe.getObject(abstractC6185M2, j2));
                    if (size2 > 0) {
                        iM12069D10 = AbstractC6269w.m12069D(i7);
                        iM12070E2 = AbstractC6269w.m12070E(size2);
                        iM12072z2 += iM12070E2 + iM12069D10 + size2;
                    }
                    break;
                case 44:
                    size2 = AbstractC6180J0.m11745a((List) unsafe.getObject(abstractC6185M2, j2));
                    if (size2 > 0) {
                        iM12069D10 = AbstractC6269w.m12069D(i7);
                        iM12070E2 = AbstractC6269w.m12070E(size2);
                        iM12072z2 += iM12070E2 + iM12069D10 + size2;
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(abstractC6185M2, j2);
                    Class cls18 = AbstractC6180J0.f24092a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iM12069D10 = AbstractC6269w.m12069D(i7);
                        iM12070E2 = AbstractC6269w.m12070E(size2);
                        iM12072z2 += iM12070E2 + iM12069D10 + size2;
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC6185M2, j2);
                    Class cls19 = AbstractC6180J0.f24092a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iM12069D10 = AbstractC6269w.m12069D(i7);
                        iM12070E2 = AbstractC6269w.m12070E(size2);
                        iM12072z2 += iM12070E2 + iM12069D10 + size2;
                    }
                    break;
                case 47:
                    size2 = AbstractC6180J0.m11750f((List) unsafe.getObject(abstractC6185M2, j2));
                    if (size2 > 0) {
                        iM12069D10 = AbstractC6269w.m12069D(i7);
                        iM12070E2 = AbstractC6269w.m12070E(size2);
                        iM12072z2 += iM12070E2 + iM12069D10 + size2;
                    }
                    break;
                case 48:
                    size2 = AbstractC6180J0.m11751g((List) unsafe.getObject(abstractC6185M2, j2));
                    if (size2 > 0) {
                        iM12069D10 = AbstractC6269w.m12069D(i7);
                        iM12070E2 = AbstractC6269w.m12070E(size2);
                        iM12072z2 += iM12070E2 + iM12069D10 + size2;
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC6185M2, j2);
                    InterfaceC6178I0 interfaceC6178I0M12057m3 = c6268v0.m12057m(i5);
                    Class cls20 = AbstractC6180J0.f24092a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        serializedSize2 = 0;
                    } else {
                        serializedSize2 = 0;
                        for (int i19 = 0; i19 < size7; i19++) {
                            serializedSize2 += ((AbstractC6218c) ((InterfaceC6262s0) list19.get(i19))).getSerializedSize(interfaceC6178I0M12057m3) + (AbstractC6269w.m12069D(i7) * 2);
                        }
                    }
                    iM12072z2 += serializedSize2;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractC6185M2, j2);
                    Object objM12056l = c6268v0.m12056l(i5);
                    c6268v0.f24288m.getClass();
                    C6252n0 c6252n0 = (C6252n0) object3;
                    C6249m0 c6249m0 = (C6249m0) objM12056l;
                    if (c6252n0.isEmpty()) {
                        serializedSize2 = 0;
                    } else {
                        serializedSize2 = 0;
                        for (Map.Entry entry : c6252n0.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            c6249m0.getClass();
                            int iM12069D15 = AbstractC6269w.m12069D(i7);
                            C6246l0 c6246l0 = c6249m0.f24206a;
                            int iM11707a = C6167D.m11707a(c6246l0.f24197b, 2, value) + C6167D.m11707a(c6246l0.f24196a, 1, key);
                            serializedSize2 += AbstractC6269w.m12070E(iM11707a) + iM11707a + iM12069D15;
                        }
                    }
                    iM12072z2 += serializedSize2;
                    break;
                case 51:
                    if (c6268v0.m12060q(abstractC6185M2, i7, i5)) {
                        iM12069D = AbstractC6269w.m12069D(i7);
                        serializedSize = iM12069D + 8;
                        iM12072z2 += serializedSize;
                    }
                    break;
                case 52:
                    if (c6268v0.m12060q(abstractC6185M2, i7, i5)) {
                        iM12069D11 = AbstractC6269w.m12069D(i7);
                        serializedSize = iM12069D11 + 4;
                        iM12072z2 += serializedSize;
                    }
                    break;
                case 53:
                    if (c6268v0.m12060q(abstractC6185M2, i7, i5)) {
                        long jM12029A = m12029A(abstractC6185M2, j2);
                        iM12069D12 = AbstractC6269w.m12069D(i7);
                        iM12071F2 = AbstractC6269w.m12071F(jM12029A);
                        iM12070E = iM12071F2 + iM12069D12;
                        iM12072z2 += iM12070E;
                    }
                    break;
                case 54:
                    if (c6268v0.m12060q(abstractC6185M2, i7, i5)) {
                        long jM12029A2 = m12029A(abstractC6185M2, j2);
                        iM12069D12 = AbstractC6269w.m12069D(i7);
                        iM12071F2 = AbstractC6269w.m12071F(jM12029A2);
                        iM12070E = iM12071F2 + iM12069D12;
                        iM12072z2 += iM12070E;
                    }
                    break;
                case 55:
                    if (c6268v0.m12060q(abstractC6185M2, i7, i5)) {
                        int iM12038z = m12038z(abstractC6185M2, j2);
                        iM12069D13 = AbstractC6269w.m12069D(i7);
                        iM12067B2 = AbstractC6269w.m12067B(iM12038z);
                        serializedSize = iM12067B2 + iM12069D13;
                        iM12072z2 += serializedSize;
                    }
                    break;
                case 56:
                    if (c6268v0.m12060q(abstractC6185M2, i7, i5)) {
                        iM12069D = AbstractC6269w.m12069D(i7);
                        serializedSize = iM12069D + 8;
                        iM12072z2 += serializedSize;
                    }
                    break;
                case 57:
                    if (c6268v0.m12060q(abstractC6185M2, i7, i5)) {
                        iM12069D11 = AbstractC6269w.m12069D(i7);
                        serializedSize = iM12069D11 + 4;
                        iM12072z2 += serializedSize;
                    }
                    break;
                case 58:
                    if (c6268v0.m12060q(abstractC6185M2, i7, i5)) {
                        serializedSize = AbstractC6269w.m12069D(i7) + 1;
                        iM12072z2 += serializedSize;
                    }
                    break;
                case 59:
                    if (c6268v0.m12060q(abstractC6185M2, i7, i5)) {
                        Object object4 = unsafe.getObject(abstractC6185M2, j2);
                        iM12072z2 = (object4 instanceof AbstractC6251n ? AbstractC6269w.m12072z(i7, (AbstractC6251n) object4) : AbstractC6269w.m12068C((String) object4) + AbstractC6269w.m12069D(i7)) + iM12072z2;
                    }
                    break;
                case 60:
                    if (c6268v0.m12060q(abstractC6185M2, i7, i5)) {
                        Object object5 = unsafe.getObject(abstractC6185M2, j2);
                        InterfaceC6178I0 interfaceC6178I0M12057m4 = c6268v0.m12057m(i5);
                        Class cls21 = AbstractC6180J0.f24092a;
                        int iM12069D16 = AbstractC6269w.m12069D(i7);
                        int serializedSize5 = ((AbstractC6218c) ((InterfaceC6262s0) object5)).getSerializedSize(interfaceC6178I0M12057m4);
                        iM12070E = AbstractC6269w.m12070E(serializedSize5) + serializedSize5 + iM12069D16;
                        iM12072z2 += iM12070E;
                    }
                    break;
                case 61:
                    if (c6268v0.m12060q(abstractC6185M2, i7, i5)) {
                        serializedSize = AbstractC6269w.m12072z(i7, (AbstractC6251n) unsafe.getObject(abstractC6185M2, j2));
                        iM12072z2 += serializedSize;
                    }
                    break;
                case 62:
                    if (c6268v0.m12060q(abstractC6185M2, i7, i5)) {
                        int iM12038z2 = m12038z(abstractC6185M2, j2);
                        iM12069D13 = AbstractC6269w.m12069D(i7);
                        iM12067B2 = AbstractC6269w.m12070E(iM12038z2);
                        serializedSize = iM12067B2 + iM12069D13;
                        iM12072z2 += serializedSize;
                    }
                    break;
                case 63:
                    if (c6268v0.m12060q(abstractC6185M2, i7, i5)) {
                        int iM12038z3 = m12038z(abstractC6185M2, j2);
                        iM12069D13 = AbstractC6269w.m12069D(i7);
                        iM12067B2 = AbstractC6269w.m12067B(iM12038z3);
                        serializedSize = iM12067B2 + iM12069D13;
                        iM12072z2 += serializedSize;
                    }
                    break;
                case 64:
                    if (c6268v0.m12060q(abstractC6185M2, i7, i5)) {
                        iM12069D11 = AbstractC6269w.m12069D(i7);
                        serializedSize = iM12069D11 + 4;
                        iM12072z2 += serializedSize;
                    }
                    break;
                case 65:
                    if (c6268v0.m12060q(abstractC6185M2, i7, i5)) {
                        iM12069D = AbstractC6269w.m12069D(i7);
                        serializedSize = iM12069D + 8;
                        iM12072z2 += serializedSize;
                    }
                    break;
                case 66:
                    if (c6268v0.m12060q(abstractC6185M2, i7, i5)) {
                        int iM12038z4 = m12038z(abstractC6185M2, j2);
                        iM12069D13 = AbstractC6269w.m12069D(i7);
                        iM12067B2 = AbstractC6269w.m12070E((iM12038z4 >> 31) ^ (iM12038z4 << 1));
                        serializedSize = iM12067B2 + iM12069D13;
                        iM12072z2 += serializedSize;
                    }
                    break;
                case 67:
                    if (c6268v0.m12060q(abstractC6185M2, i7, i5)) {
                        long jM12029A3 = m12029A(abstractC6185M2, j2);
                        iM12069D12 = AbstractC6269w.m12069D(i7);
                        iM12071F2 = AbstractC6269w.m12071F((jM12029A3 << 1) ^ (jM12029A3 >> 63));
                        iM12070E = iM12071F2 + iM12069D12;
                        iM12072z2 += iM12070E;
                    }
                    break;
                case 68:
                    if (c6268v0.m12060q(abstractC6185M2, i7, i5)) {
                        serializedSize = ((AbstractC6218c) ((InterfaceC6262s0) unsafe.getObject(abstractC6185M2, j2))).getSerializedSize(c6268v0.m12057m(i5)) + (AbstractC6269w.m12069D(i7) * 2);
                        iM12072z2 += serializedSize;
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // com.google.protobuf.InterfaceC6178I0
    /* JADX INFO: renamed from: f */
    public final boolean mo11736f(AbstractC6185M abstractC6185M, AbstractC6185M abstractC6185M2) {
        int[] iArr = this.f24276a;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            boolean zM11755k = true;
            if (i2 < length) {
                int iM12051P = m12051P(i2);
                long j2 = iM12051P & 1048575;
                switch (m12031O(iM12051P)) {
                    case 0:
                        if (!m12053g(abstractC6185M, abstractC6185M2, i2)) {
                            zM11755k = false;
                        } else {
                            AbstractC6220c1 abstractC6220c1 = AbstractC6223d1.f24164c;
                            if (Double.doubleToLongBits(abstractC6220c1.mo11838g(abstractC6185M, j2)) != Double.doubleToLongBits(abstractC6220c1.mo11838g(abstractC6185M2, j2))) {
                                zM11755k = false;
                            }
                        }
                        break;
                    case 1:
                        if (!m12053g(abstractC6185M, abstractC6185M2, i2)) {
                            zM11755k = false;
                        } else {
                            AbstractC6220c1 abstractC6220c2 = AbstractC6223d1.f24164c;
                            if (Float.floatToIntBits(abstractC6220c2.mo11839h(abstractC6185M, j2)) != Float.floatToIntBits(abstractC6220c2.mo11839h(abstractC6185M2, j2))) {
                                zM11755k = false;
                            }
                        }
                        break;
                    case 2:
                        if (!m12053g(abstractC6185M, abstractC6185M2, i2)) {
                            zM11755k = false;
                        } else {
                            AbstractC6220c1 abstractC6220c3 = AbstractC6223d1.f24164c;
                            if (abstractC6220c3.m11853j(abstractC6185M, j2) != abstractC6220c3.m11853j(abstractC6185M2, j2)) {
                                zM11755k = false;
                            }
                        }
                        break;
                    case 3:
                        if (!m12053g(abstractC6185M, abstractC6185M2, i2)) {
                            zM11755k = false;
                        } else {
                            AbstractC6220c1 abstractC6220c4 = AbstractC6223d1.f24164c;
                            if (abstractC6220c4.m11853j(abstractC6185M, j2) != abstractC6220c4.m11853j(abstractC6185M2, j2)) {
                                zM11755k = false;
                            }
                        }
                        break;
                    case 4:
                        if (!m12053g(abstractC6185M, abstractC6185M2, i2)) {
                            zM11755k = false;
                        } else {
                            AbstractC6220c1 abstractC6220c5 = AbstractC6223d1.f24164c;
                            if (abstractC6220c5.m11852i(abstractC6185M, j2) != abstractC6220c5.m11852i(abstractC6185M2, j2)) {
                                zM11755k = false;
                            }
                        }
                        break;
                    case 5:
                        if (!m12053g(abstractC6185M, abstractC6185M2, i2)) {
                            zM11755k = false;
                        } else {
                            AbstractC6220c1 abstractC6220c6 = AbstractC6223d1.f24164c;
                            if (abstractC6220c6.m11853j(abstractC6185M, j2) != abstractC6220c6.m11853j(abstractC6185M2, j2)) {
                                zM11755k = false;
                            }
                        }
                        break;
                    case 6:
                        if (!m12053g(abstractC6185M, abstractC6185M2, i2)) {
                            zM11755k = false;
                        } else {
                            AbstractC6220c1 abstractC6220c7 = AbstractC6223d1.f24164c;
                            if (abstractC6220c7.m11852i(abstractC6185M, j2) != abstractC6220c7.m11852i(abstractC6185M2, j2)) {
                                zM11755k = false;
                            }
                        }
                        break;
                    case 7:
                        if (!m12053g(abstractC6185M, abstractC6185M2, i2)) {
                            zM11755k = false;
                        } else {
                            AbstractC6220c1 abstractC6220c8 = AbstractC6223d1.f24164c;
                            if (abstractC6220c8.mo11835d(abstractC6185M, j2) != abstractC6220c8.mo11835d(abstractC6185M2, j2)) {
                                zM11755k = false;
                            }
                        }
                        break;
                    case 8:
                        if (!m12053g(abstractC6185M, abstractC6185M2, i2)) {
                            zM11755k = false;
                        } else {
                            AbstractC6220c1 abstractC6220c9 = AbstractC6223d1.f24164c;
                            if (!AbstractC6180J0.m11755k(abstractC6220c9.m11854k(abstractC6185M, j2), abstractC6220c9.m11854k(abstractC6185M2, j2))) {
                                zM11755k = false;
                            }
                        }
                        break;
                    case 9:
                        if (!m12053g(abstractC6185M, abstractC6185M2, i2)) {
                            zM11755k = false;
                        } else {
                            AbstractC6220c1 abstractC6220c10 = AbstractC6223d1.f24164c;
                            if (!AbstractC6180J0.m11755k(abstractC6220c10.m11854k(abstractC6185M, j2), abstractC6220c10.m11854k(abstractC6185M2, j2))) {
                                zM11755k = false;
                            }
                        }
                        break;
                    case 10:
                        if (!m12053g(abstractC6185M, abstractC6185M2, i2)) {
                            zM11755k = false;
                        } else {
                            AbstractC6220c1 abstractC6220c11 = AbstractC6223d1.f24164c;
                            if (!AbstractC6180J0.m11755k(abstractC6220c11.m11854k(abstractC6185M, j2), abstractC6220c11.m11854k(abstractC6185M2, j2))) {
                                zM11755k = false;
                            }
                        }
                        break;
                    case 11:
                        if (!m12053g(abstractC6185M, abstractC6185M2, i2)) {
                            zM11755k = false;
                        } else {
                            AbstractC6220c1 abstractC6220c12 = AbstractC6223d1.f24164c;
                            if (abstractC6220c12.m11852i(abstractC6185M, j2) != abstractC6220c12.m11852i(abstractC6185M2, j2)) {
                                zM11755k = false;
                            }
                        }
                        break;
                    case 12:
                        if (!m12053g(abstractC6185M, abstractC6185M2, i2)) {
                            zM11755k = false;
                        } else {
                            AbstractC6220c1 abstractC6220c13 = AbstractC6223d1.f24164c;
                            if (abstractC6220c13.m11852i(abstractC6185M, j2) != abstractC6220c13.m11852i(abstractC6185M2, j2)) {
                                zM11755k = false;
                            }
                        }
                        break;
                    case 13:
                        if (!m12053g(abstractC6185M, abstractC6185M2, i2)) {
                            zM11755k = false;
                        } else {
                            AbstractC6220c1 abstractC6220c14 = AbstractC6223d1.f24164c;
                            if (abstractC6220c14.m11852i(abstractC6185M, j2) != abstractC6220c14.m11852i(abstractC6185M2, j2)) {
                                zM11755k = false;
                            }
                        }
                        break;
                    case 14:
                        if (!m12053g(abstractC6185M, abstractC6185M2, i2)) {
                            zM11755k = false;
                        } else {
                            AbstractC6220c1 abstractC6220c15 = AbstractC6223d1.f24164c;
                            if (abstractC6220c15.m11853j(abstractC6185M, j2) != abstractC6220c15.m11853j(abstractC6185M2, j2)) {
                                zM11755k = false;
                            }
                        }
                        break;
                    case 15:
                        if (!m12053g(abstractC6185M, abstractC6185M2, i2)) {
                            zM11755k = false;
                        } else {
                            AbstractC6220c1 abstractC6220c16 = AbstractC6223d1.f24164c;
                            if (abstractC6220c16.m11852i(abstractC6185M, j2) != abstractC6220c16.m11852i(abstractC6185M2, j2)) {
                                zM11755k = false;
                            }
                        }
                        break;
                    case 16:
                        if (!m12053g(abstractC6185M, abstractC6185M2, i2)) {
                            zM11755k = false;
                        } else {
                            AbstractC6220c1 abstractC6220c17 = AbstractC6223d1.f24164c;
                            if (abstractC6220c17.m11853j(abstractC6185M, j2) != abstractC6220c17.m11853j(abstractC6185M2, j2)) {
                                zM11755k = false;
                            }
                        }
                        break;
                    case 17:
                        if (!m12053g(abstractC6185M, abstractC6185M2, i2)) {
                            zM11755k = false;
                        } else {
                            AbstractC6220c1 abstractC6220c18 = AbstractC6223d1.f24164c;
                            if (!AbstractC6180J0.m11755k(abstractC6220c18.m11854k(abstractC6185M, j2), abstractC6220c18.m11854k(abstractC6185M2, j2))) {
                                zM11755k = false;
                            }
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        AbstractC6220c1 abstractC6220c19 = AbstractC6223d1.f24164c;
                        zM11755k = AbstractC6180J0.m11755k(abstractC6220c19.m11854k(abstractC6185M, j2), abstractC6220c19.m11854k(abstractC6185M2, j2));
                        break;
                    case 50:
                        AbstractC6220c1 abstractC6220c20 = AbstractC6223d1.f24164c;
                        zM11755k = AbstractC6180J0.m11755k(abstractC6220c20.m11854k(abstractC6185M, j2), abstractC6220c20.m11854k(abstractC6185M2, j2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j3 = iArr[i2 + 2] & 1048575;
                        AbstractC6220c1 abstractC6220c21 = AbstractC6223d1.f24164c;
                        if (abstractC6220c21.m11852i(abstractC6185M, j3) != abstractC6220c21.m11852i(abstractC6185M2, j3) || !AbstractC6180J0.m11755k(abstractC6220c21.m11854k(abstractC6185M, j2), abstractC6220c21.m11854k(abstractC6185M2, j2))) {
                            zM11755k = false;
                        }
                        break;
                }
                if (zM11755k) {
                    i2 += 3;
                }
            } else {
                C6203V0 c6203v0 = (C6203V0) this.f24287l;
                c6203v0.getClass();
                C6201U0 c6201u0 = abstractC6185M.unknownFields;
                c6203v0.getClass();
                if (c6201u0.equals(abstractC6185M2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m12053g(AbstractC6185M abstractC6185M, AbstractC6185M abstractC6185M2, int i2) {
        return m12058n(abstractC6185M, i2) == m12058n(abstractC6185M2, i2);
    }

    @Override // com.google.protobuf.InterfaceC6178I0
    public final boolean isInitialized(Object obj) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.f24283h) {
            int i7 = this.f24282g[i6];
            int[] iArr = this.f24276a;
            int i8 = iArr[i7];
            int iM12051P = m12051P(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = f24275o.getInt(obj, i10);
                }
                i3 = i5;
                i2 = i10;
            } else {
                int i12 = i5;
                i2 = i4;
                i3 = i12;
            }
            if ((268435456 & iM12051P) == 0 || m12059o(obj, i7, i2, i3, i11)) {
                int iM12031O = m12031O(iM12051P);
                if (iM12031O == 9 || iM12031O == 17) {
                    if (m12059o(obj, i7, i2, i3, i11)) {
                        if (!m12057m(i7).isInitialized(AbstractC6223d1.f24164c.m11854k(obj, iM12051P & 1048575))) {
                        }
                    } else {
                        continue;
                    }
                    i6++;
                    i4 = i2;
                    i5 = i3;
                } else {
                    if (iM12031O != 27) {
                        if (iM12031O == 60 || iM12031O == 68) {
                            if (m12060q(obj, i8, i7)) {
                                if (!m12057m(i7).isInitialized(AbstractC6223d1.f24164c.m11854k(obj, iM12051P & 1048575))) {
                                }
                            } else {
                                continue;
                            }
                            i6++;
                            i4 = i2;
                            i5 = i3;
                        } else if (iM12031O != 49) {
                            if (iM12031O != 50) {
                                continue;
                            } else {
                                Object objM11854k = AbstractC6223d1.f24164c.m11854k(obj, iM12051P & 1048575);
                                this.f24288m.getClass();
                                C6252n0 c6252n0 = (C6252n0) objM11854k;
                                if (!c6252n0.isEmpty() && ((C6249m0) m12056l(i7)).f24206a.f24197b.f24203s == EnumC6250m1.MESSAGE) {
                                    InterfaceC6178I0 interfaceC6178I0M11705a = null;
                                    for (Object obj2 : c6252n0.values()) {
                                        if (interfaceC6178I0M11705a == null) {
                                            interfaceC6178I0M11705a = C6166C0.f24055c.m11705a(obj2.getClass());
                                        }
                                        if (!interfaceC6178I0M11705a.isInitialized(obj2)) {
                                        }
                                    }
                                }
                            }
                            i6++;
                            i4 = i2;
                            i5 = i3;
                        }
                    }
                    List list = (List) AbstractC6223d1.f24164c.m11854k(obj, iM12051P & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC6178I0 interfaceC6178I0M12057m = m12057m(i7);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (interfaceC6178I0M12057m.isInitialized(list.get(i13))) {
                            }
                        }
                    }
                    i6++;
                    i4 = i2;
                    i5 = i3;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final void m12054j(int i2, Object obj, Object obj2) {
        int i3 = this.f24276a[i2];
        if (AbstractC6223d1.f24164c.m11854k(obj, m12051P(i2) & 1048575) == null) {
            return;
        }
        m12055k(i2);
    }

    /* JADX INFO: renamed from: k */
    public final void m12055k(int i2) {
        if (this.f24277b[((i2 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: l */
    public final Object m12056l(int i2) {
        return this.f24277b[(i2 / 3) * 2];
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC6178I0 m12057m(int i2) {
        int i3 = (i2 / 3) * 2;
        Object[] objArr = this.f24277b;
        InterfaceC6178I0 interfaceC6178I0 = (InterfaceC6178I0) objArr[i3];
        if (interfaceC6178I0 != null) {
            return interfaceC6178I0;
        }
        InterfaceC6178I0 interfaceC6178I0M11705a = C6166C0.f24055c.m11705a((Class) objArr[i3 + 1]);
        objArr[i3] = interfaceC6178I0M11705a;
        return interfaceC6178I0M11705a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081 A[SYNTHETIC] */
    @Override // com.google.protobuf.InterfaceC6178I0
    public final void makeImmutable(Object obj) {
        if (m12034p(obj)) {
            if (obj instanceof AbstractC6185M) {
                AbstractC6185M abstractC6185M = (AbstractC6185M) obj;
                abstractC6185M.clearMemoizedSerializedSize();
                abstractC6185M.clearMemoizedHashCode();
                abstractC6185M.markImmutable();
            }
            int[] iArr = this.f24276a;
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int iM12051P = m12051P(i2);
                long j2 = 1048575 & iM12051P;
                int iM12031O = m12031O(iM12051P);
                if (iM12031O != 9) {
                    if (iM12031O != 60 && iM12031O != 68) {
                        switch (iM12031O) {
                            case 17:
                                if (m12058n(obj, i2)) {
                                    m12057m(i2).makeImmutable(f24275o.getObject(obj, j2));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f24286k.mo11879a(obj, j2);
                                break;
                            case 50:
                                Unsafe unsafe = f24275o;
                                Object object = unsafe.getObject(obj, j2);
                                if (object != null) {
                                    this.f24288m.getClass();
                                    ((C6252n0) object).f24223s = false;
                                    unsafe.putObject(obj, j2, object);
                                }
                                break;
                        }
                    } else if (m12060q(obj, iArr[i2], i2)) {
                        m12057m(i2).makeImmutable(f24275o.getObject(obj, j2));
                    }
                } else if (m12058n(obj, i2)) {
                    m12057m(i2).makeImmutable(f24275o.getObject(obj, j2));
                }
            }
            ((C6203V0) this.f24287l).getClass();
            C6201U0 c6201u0 = ((AbstractC6185M) obj).unknownFields;
            if (c6201u0.f24129e) {
                c6201u0.f24129e = false;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // com.google.protobuf.InterfaceC6178I0
    public final void mergeFrom(Object obj, Object obj2) {
        Object obj3;
        m12032h(obj);
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.f24276a;
            if (i2 >= iArr.length) {
                AbstractC6180J0.m11754j(this.f24287l, obj, obj2);
                return;
            }
            int iM12051P = m12051P(i2);
            long j2 = 1048575 & iM12051P;
            int i3 = iArr[i2];
            switch (m12031O(iM12051P)) {
                case 0:
                    if (!m12058n(obj2, i2)) {
                        obj3 = obj;
                    } else {
                        AbstractC6220c1 abstractC6220c1 = AbstractC6223d1.f24164c;
                        obj3 = obj;
                        abstractC6220c1.mo11842o(obj3, j2, abstractC6220c1.mo11838g(obj2, j2));
                        m12046J(obj3, i2);
                    }
                    break;
                case 1:
                    if (m12058n(obj2, i2)) {
                        AbstractC6220c1 abstractC6220c2 = AbstractC6223d1.f24164c;
                        abstractC6220c2.mo11843p(obj, j2, abstractC6220c2.mo11839h(obj2, j2));
                        m12046J(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m12058n(obj2, i2)) {
                        AbstractC6223d1.m11874o(obj, j2, AbstractC6223d1.f24164c.m11853j(obj2, j2));
                        m12046J(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m12058n(obj2, i2)) {
                        AbstractC6223d1.m11874o(obj, j2, AbstractC6223d1.f24164c.m11853j(obj2, j2));
                        m12046J(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m12058n(obj2, i2)) {
                        AbstractC6223d1.m11873n(obj, j2, AbstractC6223d1.f24164c.m11852i(obj2, j2));
                        m12046J(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m12058n(obj2, i2)) {
                        AbstractC6223d1.m11874o(obj, j2, AbstractC6223d1.f24164c.m11853j(obj2, j2));
                        m12046J(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m12058n(obj2, i2)) {
                        AbstractC6223d1.m11873n(obj, j2, AbstractC6223d1.f24164c.m11852i(obj2, j2));
                        m12046J(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m12058n(obj2, i2)) {
                        AbstractC6220c1 abstractC6220c3 = AbstractC6223d1.f24164c;
                        abstractC6220c3.mo11840m(obj, j2, abstractC6220c3.mo11835d(obj2, j2));
                        m12046J(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m12058n(obj2, i2)) {
                        AbstractC6223d1.m11875p(obj, j2, AbstractC6223d1.f24164c.m11854k(obj2, j2));
                        m12046J(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    m12062s(obj, obj2, i2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m12058n(obj2, i2)) {
                        AbstractC6223d1.m11875p(obj, j2, AbstractC6223d1.f24164c.m11854k(obj2, j2));
                        m12046J(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m12058n(obj2, i2)) {
                        AbstractC6223d1.m11873n(obj, j2, AbstractC6223d1.f24164c.m11852i(obj2, j2));
                        m12046J(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m12058n(obj2, i2)) {
                        AbstractC6223d1.m11873n(obj, j2, AbstractC6223d1.f24164c.m11852i(obj2, j2));
                        m12046J(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m12058n(obj2, i2)) {
                        AbstractC6223d1.m11873n(obj, j2, AbstractC6223d1.f24164c.m11852i(obj2, j2));
                        m12046J(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m12058n(obj2, i2)) {
                        AbstractC6223d1.m11874o(obj, j2, AbstractC6223d1.f24164c.m11853j(obj2, j2));
                        m12046J(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m12058n(obj2, i2)) {
                        AbstractC6223d1.m11873n(obj, j2, AbstractC6223d1.f24164c.m11852i(obj2, j2));
                        m12046J(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m12058n(obj2, i2)) {
                        AbstractC6223d1.m11874o(obj, j2, AbstractC6223d1.f24164c.m11853j(obj2, j2));
                        m12046J(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    m12062s(obj, obj2, i2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f24286k.mo11880b(obj, obj2, j2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = AbstractC6180J0.f24092a;
                    AbstractC6220c1 abstractC6220c4 = AbstractC6223d1.f24164c;
                    Object objM11854k = abstractC6220c4.m11854k(obj, j2);
                    Object objM11854k2 = abstractC6220c4.m11854k(obj2, j2);
                    this.f24288m.getClass();
                    AbstractC6223d1.m11875p(obj, j2, C6254o0.m11933a(objM11854k, objM11854k2));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (m12060q(obj2, i3, i2)) {
                        AbstractC6223d1.m11875p(obj, j2, AbstractC6223d1.f24164c.m11854k(obj2, j2));
                        m12047K(obj, i3, i2);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    m12063t(obj, obj2, i2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m12060q(obj2, i3, i2)) {
                        AbstractC6223d1.m11875p(obj, j2, AbstractC6223d1.f24164c.m11854k(obj2, j2));
                        m12047K(obj, i3, i2);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    m12063t(obj, obj2, i2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i2 += 3;
            obj = obj3;
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m12058n(Object obj, int i2) {
        int i3 = this.f24276a[i2 + 2];
        long j2 = i3 & 1048575;
        if (j2 == 1048575) {
            int iM12051P = m12051P(i2);
            long j3 = iM12051P & 1048575;
            switch (m12031O(iM12051P)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC6223d1.f24164c.mo11838g(obj, j3)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC6223d1.f24164c.mo11839h(obj, j3)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (AbstractC6223d1.f24164c.m11853j(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (AbstractC6223d1.f24164c.m11853j(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (AbstractC6223d1.f24164c.m11852i(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (AbstractC6223d1.f24164c.m11853j(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (AbstractC6223d1.f24164c.m11852i(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return AbstractC6223d1.f24164c.mo11835d(obj, j3);
                case 8:
                    Object objM11854k = AbstractC6223d1.f24164c.m11854k(obj, j3);
                    if (objM11854k instanceof String) {
                        return !((String) objM11854k).isEmpty();
                    }
                    if (objM11854k instanceof AbstractC6251n) {
                        return !AbstractC6251n.f24219t.equals(objM11854k);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (AbstractC6223d1.f24164c.m11854k(obj, j3) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !AbstractC6251n.f24219t.equals(AbstractC6223d1.f24164c.m11854k(obj, j3));
                case 11:
                    if (AbstractC6223d1.f24164c.m11852i(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (AbstractC6223d1.f24164c.m11852i(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (AbstractC6223d1.f24164c.m11852i(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (AbstractC6223d1.f24164c.m11853j(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (AbstractC6223d1.f24164c.m11852i(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (AbstractC6223d1.f24164c.m11853j(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (AbstractC6223d1.f24164c.m11854k(obj, j3) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((AbstractC6223d1.f24164c.m11852i(obj, j2) & (1 << (i3 >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.InterfaceC6178I0
    public final Object newInstance() {
        this.f24285j.getClass();
        return ((AbstractC6185M) this.f24280e).newMutableInstance();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m12059o(Object obj, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return m12058n(obj, i2);
        }
        return (i4 & i5) != 0;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m12060q(Object obj, int i2, int i3) {
        return AbstractC6223d1.f24164c.m11852i(obj, (long) (this.f24276a[i3 + 2] & 1048575)) == i2;
    }

    /* JADX INFO: renamed from: r */
    public final void m12061r(Object obj, int i2, Object obj2, C6161A c6161a, C6263t c6263t) {
        long jM12051P = m12051P(i2) & 1048575;
        Object objM11854k = AbstractC6223d1.f24164c.m11854k(obj, jM12051P);
        C6254o0 c6254o0 = this.f24288m;
        if (objM11854k == null) {
            c6254o0.getClass();
            objM11854k = C6252n0.f24222t.m11901c();
            AbstractC6223d1.m11875p(obj, jM12051P, objM11854k);
        } else {
            c6254o0.getClass();
            if (!((C6252n0) objM11854k).f24223s) {
                C6252n0 c6252n0M11901c = C6252n0.f24222t.m11901c();
                C6254o0.m11933a(c6252n0M11901c, objM11854k);
                AbstractC6223d1.m11875p(obj, jM12051P, c6252n0M11901c);
                objM11854k = c6252n0M11901c;
            }
        }
        c6254o0.getClass();
        C6252n0 c6252n0 = (C6252n0) objM11854k;
        C6246l0 c6246l0 = ((C6249m0) obj2).f24206a;
        c6263t.m11994w(2);
        AbstractC6261s abstractC6261s = c6263t.f24262a;
        int iMo11916i = abstractC6261s.mo11916i(abstractC6261s.mo11902A());
        Object obj3 = c6246l0.f24198c;
        Object objM11980i = "";
        Object objM11980i2 = obj3;
        while (true) {
            try {
                int iM11972a = c6263t.m11972a();
                if (iM11972a == Integer.MAX_VALUE || abstractC6261s.mo11914e()) {
                    break;
                }
                if (iM11972a == 1) {
                    objM11980i = c6263t.m11980i(c6246l0.f24196a, null, null);
                } else if (iM11972a != 2) {
                    try {
                        if (!c6263t.m11995x()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!c6263t.m11995x()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objM11980i2 = c6263t.m11980i(c6246l0.f24197b, obj3.getClass(), c6161a);
                }
            } catch (Throwable th) {
                abstractC6261s.mo11915h(iMo11916i);
                throw th;
            }
        }
        c6252n0.put(objM11980i, objM11980i2);
        abstractC6261s.mo11915h(iMo11916i);
    }

    /* JADX INFO: renamed from: s */
    public final void m12062s(Object obj, Object obj2, int i2) {
        if (m12058n(obj2, i2)) {
            long jM12051P = m12051P(i2) & 1048575;
            Unsafe unsafe = f24275o;
            Object object = unsafe.getObject(obj2, jM12051P);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f24276a[i2] + " is present but null: " + obj2);
            }
            InterfaceC6178I0 interfaceC6178I0M12057m = m12057m(i2);
            if (!m12058n(obj, i2)) {
                if (m12034p(object)) {
                    Object objNewInstance = interfaceC6178I0M12057m.newInstance();
                    interfaceC6178I0M12057m.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jM12051P, objNewInstance);
                } else {
                    unsafe.putObject(obj, jM12051P, object);
                }
                m12046J(obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM12051P);
            if (!m12034p(object2)) {
                Object objNewInstance2 = interfaceC6178I0M12057m.newInstance();
                interfaceC6178I0M12057m.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jM12051P, objNewInstance2);
                object2 = objNewInstance2;
            }
            interfaceC6178I0M12057m.mergeFrom(object2, object);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m12063t(Object obj, Object obj2, int i2) {
        int[] iArr = this.f24276a;
        int i3 = iArr[i2];
        if (m12060q(obj2, i3, i2)) {
            long jM12051P = m12051P(i2) & 1048575;
            Unsafe unsafe = f24275o;
            Object object = unsafe.getObject(obj2, jM12051P);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i2] + " is present but null: " + obj2);
            }
            InterfaceC6178I0 interfaceC6178I0M12057m = m12057m(i2);
            if (!m12060q(obj, i3, i2)) {
                if (m12034p(object)) {
                    Object objNewInstance = interfaceC6178I0M12057m.newInstance();
                    interfaceC6178I0M12057m.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jM12051P, objNewInstance);
                } else {
                    unsafe.putObject(obj, jM12051P, object);
                }
                m12047K(obj, i3, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM12051P);
            if (!m12034p(object2)) {
                Object objNewInstance2 = interfaceC6178I0M12057m.newInstance();
                interfaceC6178I0M12057m.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jM12051P, objNewInstance2);
                object2 = objNewInstance2;
            }
            interfaceC6178I0M12057m.mergeFrom(object2, object);
        }
    }

    /* JADX INFO: renamed from: u */
    public final Object m12064u(Object obj, int i2) {
        InterfaceC6178I0 interfaceC6178I0M12057m = m12057m(i2);
        long jM12051P = m12051P(i2) & 1048575;
        if (!m12058n(obj, i2)) {
            return interfaceC6178I0M12057m.newInstance();
        }
        Object object = f24275o.getObject(obj, jM12051P);
        if (m12034p(object)) {
            return object;
        }
        Object objNewInstance = interfaceC6178I0M12057m.newInstance();
        if (object != null) {
            interfaceC6178I0M12057m.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX INFO: renamed from: v */
    public final Object m12065v(Object obj, int i2, int i3) {
        InterfaceC6178I0 interfaceC6178I0M12057m = m12057m(i3);
        if (!m12060q(obj, i2, i3)) {
            return interfaceC6178I0M12057m.newInstance();
        }
        Object object = f24275o.getObject(obj, m12051P(i3) & 1048575);
        if (m12034p(object)) {
            return object;
        }
        Object objNewInstance = interfaceC6178I0M12057m.newInstance();
        if (object != null) {
            interfaceC6178I0M12057m.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }
}
