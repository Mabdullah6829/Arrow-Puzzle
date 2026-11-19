package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p011H.AbstractC0271e0;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzigc<T> implements zzigr<T> {

    /* JADX INFO: renamed from: m */
    public static final int[] f19841m = new int[0];

    /* JADX INFO: renamed from: n */
    public static final Unsafe f19842n = zzihk.m8481o();

    /* JADX INFO: renamed from: a */
    public final int[] f19843a;

    /* JADX INFO: renamed from: b */
    public final Object[] f19844b;

    /* JADX INFO: renamed from: c */
    public final int f19845c;

    /* JADX INFO: renamed from: d */
    public final int f19846d;

    /* JADX INFO: renamed from: e */
    public final zzifz f19847e;

    /* JADX INFO: renamed from: f */
    public final boolean f19848f;

    /* JADX INFO: renamed from: g */
    public final boolean f19849g;

    /* JADX INFO: renamed from: h */
    public final int[] f19850h;

    /* JADX INFO: renamed from: i */
    public final int f19851i;

    /* JADX INFO: renamed from: j */
    public final int f19852j;

    /* JADX INFO: renamed from: k */
    public final zzihd f19853k;

    /* JADX INFO: renamed from: l */
    public final zziea f19854l;

    public zzigc(int[] iArr, Object[] objArr, int i2, int i3, zzifz zzifzVar, int[] iArr2, int i4, int i5, zzihd zzihdVar, zziea zzieaVar) {
        this.f19843a = iArr;
        this.f19844b = objArr;
        this.f19845c = i2;
        this.f19846d = i3;
        this.f19849g = zzifzVar instanceof zziep;
        boolean z = false;
        if (zzieaVar != null && (zzifzVar instanceof zziel)) {
            z = true;
        }
        this.f19848f = z;
        this.f19850h = iArr2;
        this.f19851i = i4;
        this.f19852j = i5;
        this.f19853k = zzihdVar;
        this.f19854l = zzieaVar;
        this.f19847e = zzifzVar;
    }

    /* JADX INFO: renamed from: A */
    public static Field m8373A(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            AbstractC0271e0.m413u(sb, "Field ", str, " for ", name);
            throw new RuntimeException(AbstractC0271e0.m403k(sb, " not found. Known fields are ", string), e);
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m8374k(int i2) {
        return (i2 >>> 20) & 255;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m8375l(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zziep) {
            return ((zziep) obj).m8343o();
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static void m8376m(Object obj) {
        if (!m8375l(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m8377n(long j2, Object obj) {
        return ((Integer) zzihk.m8477k(j2, obj)).intValue();
    }

    /* JADX INFO: renamed from: o */
    public static long m8378o(long j2, Object obj) {
        return ((Long) zzihk.m8477k(j2, obj)).longValue();
    }

    /* JADX INFO: renamed from: w */
    public static final int m8379w(byte[] bArr, int i2, int i3, zzihq zzihqVar, Class cls, zzicz zziczVar) throws zzifh {
        zzihq zzihqVar2 = zzihq.f19911u;
        switch (zzihqVar.ordinal()) {
            case 0:
                int i4 = i2 + 8;
                zziczVar.f19700c = Double.valueOf(Double.longBitsToDouble(zzida.m8113e(i2, bArr)));
                return i4;
            case 1:
                int i5 = i2 + 4;
                zziczVar.f19700c = Float.valueOf(Float.intBitsToFloat(zzida.m8112d(i2, bArr)));
                return i5;
            case 2:
            case 3:
                int iM8111c = zzida.m8111c(bArr, i2, zziczVar);
                zziczVar.f19700c = Long.valueOf(zziczVar.f19699b);
                return iM8111c;
            case 4:
            case 12:
            case 13:
                int iM8109a = zzida.m8109a(bArr, i2, zziczVar);
                zziczVar.f19700c = Integer.valueOf(zziczVar.f19698a);
                return iM8109a;
            case 5:
            case 15:
                int i6 = i2 + 8;
                zziczVar.f19700c = Long.valueOf(zzida.m8113e(i2, bArr));
                return i6;
            case 6:
            case 14:
                int i7 = i2 + 4;
                zziczVar.f19700c = Integer.valueOf(zzida.m8112d(i2, bArr));
                return i7;
            case 7:
                int iM8111c2 = zzida.m8111c(bArr, i2, zziczVar);
                zziczVar.f19700c = Boolean.valueOf(zziczVar.f19699b != 0);
                return iM8111c2;
            case 8:
                return zzida.m8114f(bArr, i2, zziczVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                zzigr zzigrVarM8411a = zzigj.f19860c.m8411a(cls);
                Object objZza = zzigrVarM8411a.zza();
                int iM8116h = zzida.m8116h(objZza, zzigrVarM8411a, bArr, i2, i3, zziczVar);
                zzigrVarM8411a.mo8395c(objZza);
                zziczVar.f19700c = objZza;
                return iM8116h;
            case 11:
                return zzida.m8115g(bArr, i2, zziczVar);
            case 16:
                int iM8109a2 = zzida.m8109a(bArr, i2, zziczVar);
                zziczVar.f19700c = Integer.valueOf(zzidp.m8200h(zziczVar.f19698a));
                return iM8109a2;
            case 17:
                int iM8111c3 = zzida.m8111c(bArr, i2, zziczVar);
                zziczVar.f19700c = Long.valueOf(zzidp.m8201i(zziczVar.f19699b));
                return iM8111c3;
        }
    }

    /* JADX INFO: renamed from: x */
    public static zzihe m8380x(Object obj) {
        zziep zziepVar = (zziep) obj;
        zzihe zziheVar = zziepVar.zzt;
        if (zziheVar != zzihe.f19896f) {
            return zziheVar;
        }
        zzihe zziheVarM8454a = zzihe.m8454a();
        zziepVar.zzt = zziheVarM8454a;
        return zziheVarM8454a;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0264  */
    /* JADX WARN: Code duplicated, block: B:125:0x0267  */
    /* JADX WARN: Code duplicated, block: B:128:0x0286  */
    /* JADX WARN: Code duplicated, block: B:129:0x0289  */
    /* JADX WARN: Code duplicated, block: B:169:0x0356  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ad  */
    /* JADX INFO: renamed from: z */
    public static zzigc m8381z(zzifw zzifwVar, zzihd zzihdVar, zzieb zziebVar) {
        int i2;
        int iCharAt;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        char cCharAt;
        int i10;
        int i11;
        char cCharAt2;
        int i12;
        char cCharAt3;
        int i13;
        char cCharAt4;
        int i14;
        char cCharAt5;
        int i15;
        char cCharAt6;
        int i16;
        char cCharAt7;
        int i17;
        int i18;
        Object[] objArr;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i19;
        int i20;
        int i21;
        int i22;
        Field fieldM8373A;
        int i23;
        char cCharAt8;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Object obj;
        Field fieldM8373A2;
        int i29;
        Object obj2;
        Field fieldM8373A3;
        int i30;
        char cCharAt9;
        int i31;
        char cCharAt10;
        int i32;
        char cCharAt11;
        int i33;
        char cCharAt12;
        if (!(zzifwVar instanceof zzigl)) {
            throw null;
        }
        zzigl zziglVar = (zzigl) zzifwVar;
        String str = zziglVar.f19868b;
        int length = str.length();
        int i34 = 55296;
        if (str.charAt(0) >= 55296) {
            int i35 = 1;
            while (true) {
                i2 = i35 + 1;
                if (str.charAt(i35) < 55296) {
                    break;
                }
                i35 = i2;
            }
        } else {
            i2 = 1;
        }
        int i36 = i2 + 1;
        int iCharAt2 = str.charAt(i2);
        if (iCharAt2 >= 55296) {
            int i37 = iCharAt2 & 8191;
            int i38 = 13;
            while (true) {
                i33 = i36 + 1;
                cCharAt12 = str.charAt(i36);
                if (cCharAt12 < 55296) {
                    break;
                }
                i37 |= (cCharAt12 & 8191) << i38;
                i38 += 13;
                i36 = i33;
            }
            iCharAt2 = i37 | (cCharAt12 << i38);
            i36 = i33;
        }
        if (iCharAt2 == 0) {
            i4 = 0;
            i7 = 0;
            iCharAt = 0;
            i3 = 0;
            i6 = 0;
            i8 = 0;
            iArr = f19841m;
            i5 = 0;
        } else {
            int i39 = i36 + 1;
            int iCharAt3 = str.charAt(i36);
            if (iCharAt3 >= 55296) {
                int i40 = iCharAt3 & 8191;
                int i41 = 13;
                while (true) {
                    i16 = i39 + 1;
                    cCharAt7 = str.charAt(i39);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt7 & 8191) << i41;
                    i41 += 13;
                    i39 = i16;
                }
                iCharAt3 = i40 | (cCharAt7 << i41);
                i39 = i16;
            }
            int i42 = i39 + 1;
            int iCharAt4 = str.charAt(i39);
            if (iCharAt4 >= 55296) {
                int i43 = iCharAt4 & 8191;
                int i44 = 13;
                while (true) {
                    i15 = i42 + 1;
                    cCharAt6 = str.charAt(i42);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt6 & 8191) << i44;
                    i44 += 13;
                    i42 = i15;
                }
                iCharAt4 = i43 | (cCharAt6 << i44);
                i42 = i15;
            }
            int i45 = i42 + 1;
            int iCharAt5 = str.charAt(i42);
            if (iCharAt5 >= 55296) {
                int i46 = iCharAt5 & 8191;
                int i47 = 13;
                while (true) {
                    i14 = i45 + 1;
                    cCharAt5 = str.charAt(i45);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt5 & 8191) << i47;
                    i47 += 13;
                    i45 = i14;
                }
                iCharAt5 = i46 | (cCharAt5 << i47);
                i45 = i14;
            }
            int i48 = i45 + 1;
            int iCharAt6 = str.charAt(i45);
            if (iCharAt6 >= 55296) {
                int i49 = iCharAt6 & 8191;
                int i50 = 13;
                while (true) {
                    i13 = i48 + 1;
                    cCharAt4 = str.charAt(i48);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt4 & 8191) << i50;
                    i50 += 13;
                    i48 = i13;
                }
                iCharAt6 = i49 | (cCharAt4 << i50);
                i48 = i13;
            }
            int i51 = i48 + 1;
            iCharAt = str.charAt(i48);
            if (iCharAt >= 55296) {
                int i52 = iCharAt & 8191;
                int i53 = 13;
                while (true) {
                    i12 = i51 + 1;
                    cCharAt3 = str.charAt(i51);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt3 & 8191) << i53;
                    i53 += 13;
                    i51 = i12;
                }
                iCharAt = i52 | (cCharAt3 << i53);
                i51 = i12;
            }
            int i54 = i51 + 1;
            int iCharAt7 = str.charAt(i51);
            if (iCharAt7 >= 55296) {
                int i55 = iCharAt7 & 8191;
                int i56 = 13;
                while (true) {
                    i11 = i54 + 1;
                    cCharAt2 = str.charAt(i54);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt2 & 8191) << i56;
                    i56 += 13;
                    i54 = i11;
                }
                iCharAt7 = i55 | (cCharAt2 << i56);
                i54 = i11;
            }
            int i57 = i54 + 1;
            if (str.charAt(i54) >= 55296) {
                while (true) {
                    i10 = i57 + 1;
                    if (str.charAt(i57) < 55296) {
                        break;
                    }
                    i57 = i10;
                }
                i57 = i10;
            }
            int i58 = i57 + 1;
            int iCharAt8 = str.charAt(i57);
            if (iCharAt8 >= 55296) {
                int i59 = iCharAt8 & 8191;
                int i60 = 13;
                while (true) {
                    i9 = i58 + 1;
                    cCharAt = str.charAt(i58);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i59 |= (cCharAt & 8191) << i60;
                    i60 += 13;
                    i58 = i9;
                }
                iCharAt8 = i59 | (cCharAt << i60);
                i58 = i9;
            }
            int i61 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt8 + iCharAt7 + iCharAt3];
            int i62 = iCharAt7;
            i3 = iCharAt5;
            i4 = i62;
            iArr = iArr2;
            i5 = iCharAt3;
            i36 = i58;
            i6 = iCharAt6;
            i7 = i61;
            i8 = iCharAt8;
        }
        Unsafe unsafe = f19842n;
        Object[] objArr2 = zziglVar.f19869c;
        Class<?> cls = zziglVar.f19867a.getClass();
        int i63 = i8 + i4;
        int i64 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i64];
        int i65 = i63;
        int i66 = i8;
        int i67 = 0;
        int i68 = 0;
        while (i36 < length) {
            int i69 = i36 + 1;
            int iCharAt9 = str.charAt(i36);
            if (iCharAt9 >= i34) {
                int i70 = iCharAt9 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i32 = i71 + 1;
                    cCharAt11 = str.charAt(i71);
                    i17 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i70 |= (cCharAt11 & 8191) << i72;
                    i72 += 13;
                    i71 = i32;
                    length = i17;
                }
                iCharAt9 = i70 | (cCharAt11 << i72);
                i18 = i32;
            } else {
                i17 = length;
                i18 = i69;
            }
            int i73 = i18 + 1;
            int iCharAt10 = str.charAt(i18);
            Object[] objArr4 = objArr2;
            char c = 55296;
            if (iCharAt10 >= 55296) {
                int i74 = iCharAt10 & 8191;
                int i75 = 13;
                while (true) {
                    i31 = i73 + 1;
                    cCharAt10 = str.charAt(i73);
                    if (cCharAt10 < c) {
                        break;
                    }
                    i74 |= (cCharAt10 & 8191) << i75;
                    i75 += 13;
                    i73 = i31;
                    c = 55296;
                }
                iCharAt10 = i74 | (cCharAt10 << i75);
                i73 = i31;
            }
            if ((iCharAt10 & 1024) != 0) {
                iArr[i67] = i68;
                i67++;
            }
            int i76 = iCharAt10 & 255;
            int i77 = iCharAt9;
            int i78 = iCharAt10 & 2048;
            if (i76 >= 51) {
                int i79 = i73 + 1;
                int iCharAt11 = str.charAt(i73);
                char c2 = 55296;
                if (iCharAt11 >= 55296) {
                    int i80 = iCharAt11 & 8191;
                    int i81 = i79;
                    int i82 = 13;
                    while (true) {
                        i30 = i81 + 1;
                        cCharAt9 = str.charAt(i81);
                        if (cCharAt9 < c2) {
                            break;
                        }
                        i80 |= (cCharAt9 & 8191) << i82;
                        i82 += 13;
                        i81 = i30;
                        c2 = 55296;
                    }
                    iCharAt11 = i80 | (cCharAt9 << i82);
                    i25 = i30;
                } else {
                    i25 = i79;
                }
                int i83 = i25;
                int i84 = i76 - 51;
                int i85 = iCharAt11;
                if (i84 == 9 || i84 == 17) {
                    i26 = i7 + 1;
                    int i86 = i68 / 3;
                    objArr3[i86 + i86 + 1] = objArr4[i7];
                } else {
                    if (i84 != 12) {
                        i27 = i78;
                    } else if (zziglVar.zzc() == 1 || i78 != 0) {
                        i26 = i7 + 1;
                        int i87 = i68 / 3;
                        objArr3[i87 + i87 + 1] = objArr4[i7];
                    } else {
                        i27 = 0;
                    }
                    i28 = i85 + i85;
                    int i88 = i27;
                    obj = objArr4[i28];
                    if (obj instanceof Field) {
                        fieldM8373A2 = (Field) obj;
                    } else {
                        fieldM8373A2 = m8373A(cls, (String) obj);
                        objArr4[i28] = fieldM8373A2;
                        iArr[i65] = i68;
                        i65++;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM8373A2);
                    i29 = i28 + 1;
                    obj2 = objArr4[i29];
                    if (obj2 instanceof Field) {
                        fieldM8373A3 = (Field) obj2;
                    } else {
                        fieldM8373A3 = m8373A(cls, (String) obj2);
                        objArr4[i29] = fieldM8373A3;
                    }
                    i73 = i83;
                    i19 = iObjectFieldOffset3;
                    i22 = 0;
                    i20 = 55296;
                    objArr = objArr3;
                    i5 = i5;
                    cls = cls;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM8373A3);
                    i21 = i88;
                }
                i7 = i26;
                i27 = i78;
                i28 = i85 + i85;
                int i89 = i27;
                obj = objArr4[i28];
                if (obj instanceof Field) {
                    fieldM8373A2 = (Field) obj;
                } else {
                    fieldM8373A2 = m8373A(cls, (String) obj);
                    objArr4[i28] = fieldM8373A2;
                    iArr[i65] = i68;
                    i65++;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM8373A2);
                i29 = i28 + 1;
                obj2 = objArr4[i29];
                if (obj2 instanceof Field) {
                    fieldM8373A3 = (Field) obj2;
                } else {
                    fieldM8373A3 = m8373A(cls, (String) obj2);
                    objArr4[i29] = fieldM8373A3;
                }
                i73 = i83;
                i19 = iObjectFieldOffset4;
                i22 = 0;
                i20 = 55296;
                objArr = objArr3;
                i5 = i5;
                cls = cls;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM8373A3);
                i21 = i89;
            } else {
                int i90 = i7 + 1;
                Field fieldM8373A4 = m8373A(cls, (String) objArr4[i7]);
                objArr = objArr3;
                if (i76 == 9 || i76 == 17) {
                    int i91 = i68 / 3;
                    objArr[i91 + i91 + 1] = fieldM8373A4.getType();
                } else {
                    if (i76 != 27) {
                        if (i76 == 49) {
                            i7 += 2;
                            i24 = 1;
                        } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                            i5 = i5;
                            if (zziglVar.zzc() == 1 || i78 != 0) {
                                i7 += 2;
                                int i92 = i68 / 3;
                                objArr[i92 + i92 + 1] = objArr4[i90];
                                cls = cls;
                            } else {
                                cls = cls;
                                i7 = i90;
                                i78 = 0;
                            }
                        } else if (i76 == 50) {
                            int i93 = i7 + 2;
                            i66++;
                            iArr[i66] = i68;
                            int i94 = i68 / 3;
                            int i95 = i94 + i94;
                            objArr[i95] = objArr4[i90];
                            if (i78 != 0) {
                                i7 += 3;
                                objArr[i95 + 1] = objArr4[i93];
                            } else {
                                i7 = i93;
                                i78 = 0;
                            }
                            i5 = i5;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM8373A4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt10 & 4096) != 0 || i76 > 17) {
                            i19 = iObjectFieldOffset;
                            i20 = 55296;
                            i21 = i78;
                            i22 = 0;
                        } else {
                            int i96 = i73 + 1;
                            int iCharAt12 = str.charAt(i73);
                            if (iCharAt12 >= 55296) {
                                int i97 = iCharAt12 & 8191;
                                int i98 = 13;
                                while (true) {
                                    i23 = i96 + 1;
                                    cCharAt8 = str.charAt(i96);
                                    if (cCharAt8 < 55296) {
                                        break;
                                    }
                                    i97 |= (cCharAt8 & 8191) << i98;
                                    i98 += 13;
                                    i96 = i23;
                                }
                                iCharAt12 = i97 | (cCharAt8 << i98);
                                i96 = i23;
                            }
                            int i99 = (iCharAt12 / 32) + i5 + i5;
                            Object obj3 = objArr4[i99];
                            if (obj3 instanceof Field) {
                                fieldM8373A = (Field) obj3;
                            } else {
                                fieldM8373A = m8373A(cls, (String) obj3);
                                objArr4[i99] = fieldM8373A;
                            }
                            i19 = iObjectFieldOffset;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM8373A);
                            i22 = iCharAt12 % 32;
                            i73 = i96;
                            i21 = i78;
                            i20 = 55296;
                        }
                    } else {
                        i24 = 1;
                        i7 += 2;
                    }
                    int i100 = i68 / 3;
                    objArr[i100 + i100 + i24] = objArr4[i90];
                    cls = cls;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM8373A4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt10 & 4096) != 0) {
                        i19 = iObjectFieldOffset;
                        i20 = 55296;
                        i21 = i78;
                        i22 = 0;
                    } else {
                        i19 = iObjectFieldOffset;
                        i20 = 55296;
                        i21 = i78;
                        i22 = 0;
                    }
                }
                cls = cls;
                i7 = i90;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM8373A4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt10 & 4096) != 0) {
                    i19 = iObjectFieldOffset;
                    i20 = 55296;
                    i21 = i78;
                    i22 = 0;
                } else {
                    i19 = iObjectFieldOffset;
                    i20 = 55296;
                    i21 = i78;
                    i22 = 0;
                }
            }
            int i101 = i68 + 1;
            iArr3[i68] = i77;
            int i102 = i68 + 2;
            iArr3[i101] = ((iCharAt10 & 512) != 0 ? 536870912 : 0) | ((iCharAt10 & 256) != 0 ? 268435456 : 0) | (i21 != 0 ? Integer.MIN_VALUE : 0) | (i76 << 20) | i19;
            i68 += 3;
            iArr3[i102] = (i22 << 20) | iObjectFieldOffset2;
            i36 = i73;
            cls = cls;
            objArr2 = objArr4;
            i34 = i20;
            length = i17;
            objArr3 = objArr;
            i5 = i5;
            str = str;
        }
        return new zzigc(iArr3, objArr3, i3, i6, zziglVar.f19867a, iArr, i8, i63, zzihdVar, zziebVar);
    }

    /* JADX INFO: renamed from: B */
    public final void m8382B(int i2, Object obj, Object obj2) {
        if (m8405r(i2, obj2)) {
            int iM8402j = m8402j(i2) & 1048575;
            Unsafe unsafe = f19842n;
            long j2 = iM8402j;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                int i3 = this.f19843a[i2];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(AbstractC1456a.m2434a(i3, 38) + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            zzigr zzigrVarM8384D = m8384D(i2);
            if (!m8405r(i2, obj)) {
                if (m8375l(object)) {
                    Object objZza = zzigrVarM8384D.zza();
                    zzigrVarM8384D.mo8393a(objZza, object);
                    unsafe.putObject(obj, j2, objZza);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                m8406s(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!m8375l(object2)) {
                Object objZza2 = zzigrVarM8384D.zza();
                zzigrVarM8384D.mo8393a(objZza2, object2);
                unsafe.putObject(obj, j2, objZza2);
                object2 = objZza2;
            }
            zzigrVarM8384D.mo8393a(object2, object);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m8383C(int i2, Object obj, Object obj2) {
        int[] iArr = this.f19843a;
        int i3 = iArr[i2];
        if (m8407t(i3, i2, obj2)) {
            int iM8402j = m8402j(i2) & 1048575;
            Unsafe unsafe = f19842n;
            long j2 = iM8402j;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                int i4 = iArr[i2];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(AbstractC1456a.m2434a(i4, 38) + string.length());
                sb.append("Source subfield ");
                sb.append(i4);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            zzigr zzigrVarM8384D = m8384D(i2);
            if (!m8407t(i3, i2, obj)) {
                if (m8375l(object)) {
                    Object objZza = zzigrVarM8384D.zza();
                    zzigrVarM8384D.mo8393a(objZza, object);
                    unsafe.putObject(obj, j2, objZza);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                m8408u(i3, i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!m8375l(object2)) {
                Object objZza2 = zzigrVarM8384D.zza();
                zzigrVarM8384D.mo8393a(objZza2, object2);
                unsafe.putObject(obj, j2, objZza2);
                object2 = objZza2;
            }
            zzigrVarM8384D.mo8393a(object2, object);
        }
    }

    /* JADX INFO: renamed from: D */
    public final zzigr m8384D(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        Object[] objArr = this.f19844b;
        zzigr zzigrVar = (zzigr) objArr[i4];
        if (zzigrVar != null) {
            return zzigrVar;
        }
        zzigr zzigrVarM8411a = zzigj.f19860c.m8411a((Class) objArr[i4 + 1]);
        objArr[i4] = zzigrVarM8411a;
        return zzigrVarM8411a;
    }

    /* JADX INFO: renamed from: E */
    public final Object m8385E(int i2) {
        int i3 = i2 / 3;
        return this.f19844b[i3 + i3];
    }

    /* JADX INFO: renamed from: F */
    public final zziev m8386F(int i2) {
        int i3 = i2 / 3;
        return (zziev) this.f19844b[i3 + i3 + 1];
    }

    /* JADX INFO: renamed from: G */
    public final Object m8387G(int i2, Object obj) {
        zzigr zzigrVarM8384D = m8384D(i2);
        int iM8402j = m8402j(i2) & 1048575;
        if (!m8405r(i2, obj)) {
            return zzigrVarM8384D.zza();
        }
        Object object = f19842n.getObject(obj, iM8402j);
        if (m8375l(object)) {
            return object;
        }
        Object objZza = zzigrVarM8384D.zza();
        if (object != null) {
            zzigrVarM8384D.mo8393a(objZza, object);
        }
        return objZza;
    }

    /* JADX INFO: renamed from: H */
    public final void m8388H(int i2, Object obj, Object obj2) {
        f19842n.putObject(obj, m8402j(i2) & 1048575, obj2);
        m8406s(i2, obj);
    }

    /* JADX INFO: renamed from: I */
    public final Object m8389I(int i2, int i3, Object obj) {
        zzigr zzigrVarM8384D = m8384D(i3);
        if (!m8407t(i2, i3, obj)) {
            return zzigrVarM8384D.zza();
        }
        Object object = f19842n.getObject(obj, m8402j(i3) & 1048575);
        if (m8375l(object)) {
            return object;
        }
        Object objZza = zzigrVarM8384D.zza();
        if (object != null) {
            zzigrVarM8384D.mo8393a(objZza, object);
        }
        return objZza;
    }

    /* JADX INFO: renamed from: J */
    public final void m8390J(int i2, Object obj, int i3, Object obj2) {
        f19842n.putObject(obj, m8402j(i3) & 1048575, obj2);
        m8408u(i2, i3, obj);
    }

    /* JADX INFO: renamed from: K */
    public final Object m8391K(Object obj, int i2, Object obj2, zzihd zzihdVar, Object obj3) {
        zziev zzievVarM8386F;
        int i3 = this.f19843a[i2];
        Object objM8477k = zzihk.m8477k(m8402j(i2) & 1048575, obj);
        if (objM8477k == null || (zzievVarM8386F = m8386F(i2)) == null) {
            return obj2;
        }
        zzifr zzifrVar = ((zzifs) m8385E(i2)).f19835a;
        Iterator it = ((zzift) objM8477k).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzievVarM8386F.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zzihdVar.mo8450h(obj3);
                }
                int iM8308f = zziee.m8308f(zzifrVar.f19832a, 1, entry.getKey()) + zziee.m8308f(zzifrVar.f19833b, 2, entry.getValue());
                zzidl zzidlVar = zzidl.f19719t;
                byte[] bArr = new byte[iM8308f];
                boolean z = zzidu.f19750b;
                zzidr zzidrVar = new zzidr(bArr, iM8308f);
                try {
                    zzifs.m8364a(zzidrVar, zzifrVar, entry.getKey(), entry.getValue());
                    zzidrVar.m8282d();
                    zzihdVar.mo8446d(obj2, i3, new zzidj(bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: L */
    public final void m8392L(int i2, zzidq zzidqVar, Object obj) {
        long j2 = i2 & 1048575;
        if ((536870912 & i2) != 0) {
            zzihk.m8478l(j2, obj, zzidqVar.m8214I());
        } else if (this.f19849g) {
            zzihk.m8478l(j2, obj, zzidqVar.m8213H());
        } else {
            zzihk.m8478l(j2, obj, zzidqVar.m8217L());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // com.google.android.gms.internal.ads.zzigr
    /* JADX INFO: renamed from: a */
    public final void mo8393a(Object obj, Object obj2) {
        Object obj3;
        m8376m(obj);
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.f19843a;
            if (i2 >= iArr.length) {
                Object obj4 = obj;
                zzigs.m8421d(obj4, obj2);
                if (!this.f19848f || ((zziel) obj2).zza.f19767a.isEmpty()) {
                    return;
                }
                throw null;
            }
            int iM8402j = m8402j(i2);
            int i3 = 1048575 & iM8402j;
            int iM8374k = m8374k(iM8402j);
            int i4 = iArr[i2];
            long j2 = i3;
            switch (iM8374k) {
                case 0:
                    if (!m8405r(i2, obj2)) {
                        obj3 = obj;
                    } else {
                        zzihj zzihjVar = zzihk.f19905c;
                        obj3 = obj;
                        zzihjVar.mo8465g(obj3, j2, zzihjVar.mo8464f(j2, obj2));
                        m8406s(i2, obj3);
                    }
                    break;
                case 1:
                    if (m8405r(i2, obj2)) {
                        zzihj zzihjVar2 = zzihk.f19905c;
                        zzihjVar2.mo8463e(obj, j2, zzihjVar2.mo8462d(j2, obj2));
                        m8406s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m8405r(i2, obj2)) {
                        zzihk.m8476j(obj, j2, zzihk.m8475i(j2, obj2));
                        m8406s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m8405r(i2, obj2)) {
                        zzihk.m8476j(obj, j2, zzihk.m8475i(j2, obj2));
                        m8406s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m8405r(i2, obj2)) {
                        zzihk.m8474h(obj, zzihk.m8473g(j2, obj2), j2);
                        m8406s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m8405r(i2, obj2)) {
                        zzihk.m8476j(obj, j2, zzihk.m8475i(j2, obj2));
                        m8406s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m8405r(i2, obj2)) {
                        zzihk.m8474h(obj, zzihk.m8473g(j2, obj2), j2);
                        m8406s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m8405r(i2, obj2)) {
                        zzihj zzihjVar3 = zzihk.f19905c;
                        zzihjVar3.mo8461c(obj, j2, zzihjVar3.mo8460b(j2, obj2));
                        m8406s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m8405r(i2, obj2)) {
                        zzihk.m8478l(j2, obj, zzihk.m8477k(j2, obj2));
                        m8406s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    m8382B(i2, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m8405r(i2, obj2)) {
                        zzihk.m8478l(j2, obj, zzihk.m8477k(j2, obj2));
                        m8406s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m8405r(i2, obj2)) {
                        zzihk.m8474h(obj, zzihk.m8473g(j2, obj2), j2);
                        m8406s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m8405r(i2, obj2)) {
                        zzihk.m8474h(obj, zzihk.m8473g(j2, obj2), j2);
                        m8406s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m8405r(i2, obj2)) {
                        zzihk.m8474h(obj, zzihk.m8473g(j2, obj2), j2);
                        m8406s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m8405r(i2, obj2)) {
                        zzihk.m8476j(obj, j2, zzihk.m8475i(j2, obj2));
                        m8406s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m8405r(i2, obj2)) {
                        zzihk.m8474h(obj, zzihk.m8473g(j2, obj2), j2);
                        m8406s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m8405r(i2, obj2)) {
                        zzihk.m8476j(obj, j2, zzihk.m8475i(j2, obj2));
                        m8406s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    m8382B(i2, obj, obj2);
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
                    zzifb zzifbVarMo8128l = (zzifb) zzihk.m8477k(j2, obj);
                    zzifb zzifbVar = (zzifb) zzihk.m8477k(j2, obj2);
                    int size = zzifbVarMo8128l.size();
                    int size2 = zzifbVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzifbVarMo8128l.zza()) {
                            zzifbVarMo8128l = zzifbVarMo8128l.mo8128l(size2 + size);
                        }
                        zzifbVarMo8128l.addAll(zzifbVar);
                    }
                    if (size > 0) {
                        zzifbVar = zzifbVarMo8128l;
                    }
                    zzihk.m8478l(j2, obj, zzifbVar);
                    obj3 = obj;
                    break;
                case 50:
                    zzihf zzihfVar = zzigs.f19881a;
                    zzihk.m8478l(j2, obj, zzifu.m8368a(zzihk.m8477k(j2, obj), zzihk.m8477k(j2, obj2)));
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
                    if (m8407t(i4, i2, obj2)) {
                        zzihk.m8478l(j2, obj, zzihk.m8477k(j2, obj2));
                        m8408u(i4, i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    m8383C(i2, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m8407t(i4, i2, obj2)) {
                        zzihk.m8478l(j2, obj, zzihk.m8477k(j2, obj2));
                        m8408u(i4, i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    m8383C(i2, obj, obj2);
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

    @Override // com.google.android.gms.internal.ads.zzigr
    /* JADX INFO: renamed from: b */
    public final boolean mo8394b(Object obj) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.f19851i) {
            int i7 = this.f19850h[i4];
            int iM8402j = m8402j(i7);
            int[] iArr = this.f19843a;
            int i8 = iArr[i7 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i6) {
                if (i9 != 1048575) {
                    i5 = f19842n.getInt(obj, i9);
                }
                i3 = i5;
                i2 = i9;
            } else {
                i2 = i6;
                i3 = i5;
            }
            Object obj2 = obj;
            if ((268435456 & iM8402j) == 0 || m8404q(obj2, i7, i2, i3, i10)) {
                int iM8374k = m8374k(iM8402j);
                if (iM8374k != 9 && iM8374k != 17) {
                    if (iM8374k != 27) {
                        if (iM8374k == 60 || iM8374k == 68) {
                            if (!m8407t(iArr[i7], i7, obj2) || m8384D(i7).mo8394b(zzihk.m8477k(iM8402j & 1048575, obj2))) {
                                i4++;
                                obj = obj2;
                                i6 = i2;
                                i5 = i3;
                            }
                        } else if (iM8374k != 49) {
                            if (iM8374k != 50) {
                                continue;
                            } else {
                                zzift zziftVar = (zzift) zzihk.m8477k(iM8402j & 1048575, obj2);
                                if (!zziftVar.isEmpty() && ((zzifs) m8385E(i7)).f19835a.f19833b.f19915s == zzihr.f19917A) {
                                    zzigr zzigrVarM8411a = null;
                                    for (Object obj3 : zziftVar.values()) {
                                        if (zzigrVarM8411a == null) {
                                            zzigrVarM8411a = zzigj.f19860c.m8411a(obj3.getClass());
                                        }
                                        if (!zzigrVarM8411a.mo8394b(obj3)) {
                                        }
                                    }
                                }
                            }
                            i4++;
                            obj = obj2;
                            i6 = i2;
                            i5 = i3;
                        }
                    }
                    List list = (List) zzihk.m8477k(iM8402j & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        zzigr zzigrVarM8384D = m8384D(i7);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (zzigrVarM8384D.mo8394b(list.get(i11))) {
                            }
                        }
                    }
                    i4++;
                    obj = obj2;
                    i6 = i2;
                    i5 = i3;
                } else if (!m8404q(obj2, i7, i2, i3, i10) || m8384D(i7).mo8394b(zzihk.m8477k(iM8402j & 1048575, obj2))) {
                    i4++;
                    obj = obj2;
                    i6 = i2;
                    i5 = i3;
                }
            }
            return false;
        }
        Object obj4 = obj;
        if (this.f19848f) {
            ((zziel) obj4).zza.m8315d();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzigr
    /* JADX INFO: renamed from: c */
    public final void mo8395c(Object obj) {
        if (!m8375l(obj)) {
            return;
        }
        if (obj instanceof zziep) {
            zziep zziepVar = (zziep) obj;
            zziepVar.m8342n(Integer.MAX_VALUE);
            zziepVar.zzq = 0;
            zziepVar.m8344p();
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.f19843a;
            if (i2 >= iArr.length) {
                this.f19853k.mo8452j(obj);
                if (this.f19848f) {
                    this.f19854l.mo8305a(obj);
                    return;
                }
                return;
            }
            int iM8402j = m8402j(i2);
            int i3 = 1048575 & iM8402j;
            int iM8374k = m8374k(iM8402j);
            long j2 = i3;
            if (iM8374k != 9) {
                if (iM8374k != 60 && iM8374k != 68) {
                    switch (iM8374k) {
                        case 17:
                            if (m8405r(i2, obj)) {
                                m8384D(i2).mo8395c(f19842n.getObject(obj, j2));
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
                            ((zzifb) zzihk.m8477k(j2, obj)).zzb();
                            break;
                        case 50:
                            Unsafe unsafe = f19842n;
                            Object object = unsafe.getObject(obj, j2);
                            if (object != null) {
                                ((zzift) object).f19837s = false;
                                unsafe.putObject(obj, j2, object);
                            }
                            break;
                    }
                } else if (m8407t(iArr[i2], i2, obj)) {
                    m8384D(i2).mo8395c(f19842n.getObject(obj, j2));
                }
            } else if (m8405r(i2, obj)) {
                m8384D(i2).mo8395c(f19842n.getObject(obj, j2));
            }
            i2 += 3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    /* JADX INFO: renamed from: d */
    public final int mo8396d(zziep zziepVar) {
        int i2;
        long jDoubleToLongBits;
        int i3;
        int iFloatToIntBits;
        int iM8473g;
        int i4;
        int iHashCode = 0;
        for (int i5 = 0; i5 < this.f19843a.length; i5 += 3) {
            int iM8402j = m8402j(i5);
            int iM8374k = m8374k(iM8402j);
            if (iM8374k <= 50 || iM8374k >= 69) {
                long j2 = iM8402j & 1048575;
                int iHashCode2 = 37;
                switch (iM8374k) {
                    case 0:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzihk.f19905c.mo8464f(j2, zziepVar));
                        byte[] bArr = zzifc.f19794a;
                        iM8473g = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + iM8473g;
                        break;
                    case 1:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzihk.f19905c.mo8462d(j2, zziepVar));
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 2:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = zzihk.m8475i(j2, zziepVar);
                        byte[] bArr2 = zzifc.f19794a;
                        iM8473g = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + iM8473g;
                        break;
                    case 3:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = zzihk.m8475i(j2, zziepVar);
                        byte[] bArr3 = zzifc.f19794a;
                        iM8473g = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + iM8473g;
                        break;
                    case 4:
                        i2 = iHashCode * 53;
                        iM8473g = zzihk.m8473g(j2, zziepVar);
                        iHashCode = i2 + iM8473g;
                        break;
                    case 5:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = zzihk.m8475i(j2, zziepVar);
                        byte[] bArr4 = zzifc.f19794a;
                        iM8473g = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + iM8473g;
                        break;
                    case 6:
                        i2 = iHashCode * 53;
                        iM8473g = zzihk.m8473g(j2, zziepVar);
                        iHashCode = i2 + iM8473g;
                        break;
                    case 7:
                        i3 = iHashCode * 53;
                        boolean zMo8460b = zzihk.f19905c.mo8460b(j2, zziepVar);
                        byte[] bArr5 = zzifc.f19794a;
                        iFloatToIntBits = zMo8460b ? 1231 : 1237;
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 8:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = ((String) zzihk.m8477k(j2, zziepVar)).hashCode();
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 9:
                        i4 = iHashCode * 53;
                        Object objM8477k = zzihk.m8477k(j2, zziepVar);
                        if (objM8477k != null) {
                            iHashCode2 = objM8477k.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
                        break;
                    case 10:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = zzihk.m8477k(j2, zziepVar).hashCode();
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 11:
                        i2 = iHashCode * 53;
                        iM8473g = zzihk.m8473g(j2, zziepVar);
                        iHashCode = i2 + iM8473g;
                        break;
                    case 12:
                        i2 = iHashCode * 53;
                        iM8473g = zzihk.m8473g(j2, zziepVar);
                        iHashCode = i2 + iM8473g;
                        break;
                    case 13:
                        i2 = iHashCode * 53;
                        iM8473g = zzihk.m8473g(j2, zziepVar);
                        iHashCode = i2 + iM8473g;
                        break;
                    case 14:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = zzihk.m8475i(j2, zziepVar);
                        byte[] bArr6 = zzifc.f19794a;
                        iM8473g = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + iM8473g;
                        break;
                    case 15:
                        i2 = iHashCode * 53;
                        iM8473g = zzihk.m8473g(j2, zziepVar);
                        iHashCode = i2 + iM8473g;
                        break;
                    case 16:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = zzihk.m8475i(j2, zziepVar);
                        byte[] bArr7 = zzifc.f19794a;
                        iM8473g = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + iM8473g;
                        break;
                    case 17:
                        i4 = iHashCode * 53;
                        Object objM8477k2 = zzihk.m8477k(j2, zziepVar);
                        if (objM8477k2 != null) {
                            iHashCode2 = objM8477k2.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
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
                        i3 = iHashCode * 53;
                        iFloatToIntBits = zzihk.m8477k(j2, zziepVar).hashCode();
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 50:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = zzihk.m8477k(j2, zziepVar).hashCode();
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i6 = this.f19852j;
        while (true) {
            int[] iArr = this.f19850h;
            if (i6 >= iArr.length) {
                int iHashCode3 = zziepVar.zzt.hashCode() + (iHashCode * 53);
                return this.f19848f ? (iHashCode3 * 53) + ((zziel) zziepVar).zza.f19767a.hashCode() : iHashCode3;
            }
            int i7 = iArr[i6];
            if (!m8407t(0, i7, zziepVar)) {
                iHashCode = zzihk.m8477k(m8402j(i7) & 1048575, zziepVar).hashCode() + (iHashCode * 53);
            }
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    /* JADX INFO: renamed from: e */
    public final void mo8397e(Object obj, byte[] bArr, int i2, int i3, zzicz zziczVar) {
        m8410y(obj, bArr, i2, i3, 0, zziczVar);
    }

    /* JADX WARN: Code duplicated, block: B:202:0x05c3 A[LOOP:1: B:201:0x05c1->B:202:0x05c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:204:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:206:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:212:0x05e7 A[LOOP:2: B:211:0x05e5->B:212:0x05e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:215:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:230:0x05b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzigr
    /* JADX INFO: renamed from: f */
    public final void mo8398f(Object obj, zzidq zzidqVar, zzidz zzidzVar) throws Throwable {
        Object obj2;
        Object obj3;
        Object objM8391K;
        zzihd zzihdVar;
        Object objM8391K2;
        Object obj4;
        zzigc<T> zzigcVar;
        Object obj5;
        zzigc<T> zzigcVar2 = this;
        int[] iArr = zzigcVar2.f19850h;
        int i2 = zzigcVar2.f19852j;
        int i3 = zzigcVar2.f19851i;
        zzidzVar.getClass();
        m8376m(obj);
        Throwable th = null;
        zzihd zzihdVar2 = zzigcVar2.f19853k;
        Object objMo8450h = null;
        while (true) {
            try {
                int iM8248y = zzidqVar.m8248y();
                int iM8409v = (iM8248y < zzigcVar2.f19845c || iM8248y > zzigcVar2.f19846d) ? -1 : zzigcVar2.m8409v(iM8248y, 0);
                if (iM8409v >= 0) {
                    obj4 = obj;
                    int iM8402j = zzigcVar2.m8402j(iM8409v);
                    try {
                        try {
                            switch (m8374k(iM8402j)) {
                                case 0:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    try {
                                        obj5 = obj;
                                        try {
                                            zzihk.f19905c.mo8465g(obj5, iM8402j & 1048575, zzidqVar.m8249z());
                                            zzigcVar.m8406s(iM8409v, obj5);
                                            zzigcVar2 = zzigcVar;
                                            objMo8450h = obj3;
                                            th = null;
                                        } catch (zzifg unused) {
                                            obj2 = obj5;
                                            objMo8450h = obj3;
                                            if (objMo8450h == null) {
                                                try {
                                                    objMo8450h = zzihdVar2.mo8450h(obj2);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                            }
                                            if (!zzihdVar2.m8453k(0, zzidqVar, objMo8450h)) {
                                                objM8391K2 = objMo8450h;
                                                while (i3 < i2) {
                                                    zzihd zzihdVar3 = zzihdVar2;
                                                    objM8391K2 = zzigcVar.m8391K(obj2, iArr[i3], objM8391K2, zzihdVar3, obj);
                                                    zzihdVar2 = zzihdVar3;
                                                    i3++;
                                                    zzigcVar = this;
                                                }
                                                if (objM8391K2 != null) {
                                                    zzihdVar2.mo8451i(obj2, objM8391K2);
                                                }
                                            }
                                            th = null;
                                            zzigcVar2 = this;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            obj2 = obj5;
                                        }
                                    } catch (zzifg unused2) {
                                        obj2 = obj;
                                        objMo8450h = obj3;
                                        if (objMo8450h == null) {
                                            objMo8450h = zzihdVar2.mo8450h(obj2);
                                        }
                                        if (!zzihdVar2.m8453k(0, zzidqVar, objMo8450h)) {
                                            objM8391K2 = objMo8450h;
                                            while (i3 < i2) {
                                                zzihd zzihdVar4 = zzihdVar2;
                                                objM8391K2 = zzigcVar.m8391K(obj2, iArr[i3], objM8391K2, zzihdVar4, obj);
                                                zzihdVar2 = zzihdVar4;
                                                i3++;
                                                zzigcVar = this;
                                            }
                                            if (objM8391K2 != null) {
                                                zzihdVar2.mo8451i(obj2, objM8391K2);
                                            }
                                        }
                                        th = null;
                                        zzigcVar2 = this;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj2 = obj;
                                    }
                                    break;
                                case 1:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzihk.f19905c.mo8463e(obj4, iM8402j & 1048575, zzidqVar.m8206A());
                                    zzigcVar.m8406s(iM8409v, obj4);
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 2:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzihk.m8476j(obj4, iM8402j & 1048575, zzidqVar.m8208C());
                                    zzigcVar.m8406s(iM8409v, obj4);
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 3:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzihk.m8476j(obj4, iM8402j & 1048575, zzidqVar.m8207B());
                                    zzigcVar.m8406s(iM8409v, obj4);
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 4:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzihk.m8474h(obj4, zzidqVar.m8209D(), iM8402j & 1048575);
                                    zzigcVar.m8406s(iM8409v, obj4);
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 5:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzihk.m8476j(obj4, iM8402j & 1048575, zzidqVar.m8210E());
                                    zzigcVar.m8406s(iM8409v, obj4);
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 6:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzihk.m8474h(obj4, zzidqVar.m8211F(), iM8402j & 1048575);
                                    zzigcVar.m8406s(iM8409v, obj4);
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 7:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzihk.f19905c.mo8461c(obj4, iM8402j & 1048575, zzidqVar.m8212G());
                                    zzigcVar.m8406s(iM8409v, obj4);
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 8:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar.m8392L(iM8402j, zzidqVar, obj4);
                                    zzigcVar.m8406s(iM8409v, obj4);
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 9:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzifz zzifzVar = (zzifz) zzigcVar.m8387G(iM8409v, obj4);
                                    zzidqVar.m8215J(zzifzVar, zzigcVar.m8384D(iM8409v), zzidzVar);
                                    zzigcVar.m8388H(iM8409v, obj4, zzifzVar);
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 10:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzihk.m8478l(iM8402j & 1048575, obj4, zzidqVar.m8217L());
                                    zzigcVar.m8406s(iM8409v, obj4);
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 11:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzihk.m8474h(obj4, zzidqVar.m8218M(), iM8402j & 1048575);
                                    zzigcVar.m8406s(iM8409v, obj4);
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 12:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    int iM8219N = zzidqVar.m8219N();
                                    zziev zzievVarM8386F = zzigcVar.m8386F(iM8409v);
                                    if (zzievVarM8386F != null && !zzievVarM8386F.zza(iM8219N)) {
                                        zzihf zzihfVar = zzigs.f19881a;
                                        objMo8450h = obj3 == null ? zzihdVar2.mo8450h(obj4) : obj3;
                                        zzihdVar2.mo8443a(objMo8450h, iM8248y, iM8219N);
                                        zzigcVar2 = zzigcVar;
                                        th = null;
                                    }
                                    zzihk.m8474h(obj4, iM8219N, iM8402j & 1048575);
                                    zzigcVar.m8406s(iM8409v, obj4);
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 13:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzihk.m8474h(obj4, zzidqVar.m8220O(), iM8402j & 1048575);
                                    zzigcVar.m8406s(iM8409v, obj4);
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 14:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzihk.m8476j(obj4, iM8402j & 1048575, zzidqVar.m8221P());
                                    zzigcVar.m8406s(iM8409v, obj4);
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 15:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzihk.m8474h(obj4, zzidqVar.m8222Q(), iM8402j & 1048575);
                                    zzigcVar.m8406s(iM8409v, obj4);
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 16:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzihk.m8476j(obj4, iM8402j & 1048575, zzidqVar.m8223R());
                                    zzigcVar.m8406s(iM8409v, obj4);
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 17:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzifz zzifzVar2 = (zzifz) zzigcVar.m8387G(iM8409v, obj4);
                                    zzidqVar.m8216K(zzifzVar2, zzigcVar.m8384D(iM8409v), zzidzVar);
                                    zzigcVar.m8388H(iM8409v, obj4, zzifzVar2);
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 18:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzidqVar.m8224S(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 19:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzidqVar.m8225T(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 20:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzidqVar.m8227a(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 21:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzidqVar.m8226U(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 22:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzidqVar.m8228b(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 23:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzidqVar.m8229c(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 24:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzidqVar.m8230d(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 25:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzidqVar.m8231e(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 26:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    if ((536870912 & iM8402j) != 0) {
                                        zzidqVar.m8232f(zzifl.m8360a(iM8402j & 1048575, obj4), true);
                                    } else {
                                        zzidqVar.m8232f(zzifl.m8360a(iM8402j & 1048575, obj4), false);
                                    }
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 27:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzidqVar.m8233g(zzifl.m8360a(iM8402j & 1048575, obj4), zzigcVar.m8384D(iM8409v), zzidzVar);
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 28:
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzidqVar.m8235i(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 29:
                                    zzigcVar = zzigcVar2;
                                    obj2 = obj4;
                                    obj3 = objMo8450h;
                                    try {
                                        zzidqVar.m8236j(zzifl.m8360a(iM8402j & 1048575, obj2));
                                        zzigcVar2 = zzigcVar;
                                        objMo8450h = obj3;
                                        th = null;
                                    } catch (zzifg unused3) {
                                        objMo8450h = obj3;
                                        if (objMo8450h == null) {
                                            objMo8450h = zzihdVar2.mo8450h(obj2);
                                        }
                                        if (!zzihdVar2.m8453k(0, zzidqVar, objMo8450h)) {
                                            objM8391K2 = objMo8450h;
                                            while (i3 < i2) {
                                                zzihd zzihdVar5 = zzihdVar2;
                                                objM8391K2 = zzigcVar.m8391K(obj2, iArr[i3], objM8391K2, zzihdVar5, obj);
                                                zzihdVar2 = zzihdVar5;
                                                i3++;
                                                zzigcVar = this;
                                            }
                                            if (objM8391K2 != null) {
                                                zzihdVar2.mo8451i(obj2, objM8391K2);
                                            }
                                        }
                                        th = null;
                                        zzigcVar2 = this;
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                    break;
                                case 30:
                                    zzigcVar = zzigcVar2;
                                    zzifb zzifbVarM8360a = zzifl.m8360a(iM8402j & 1048575, obj4);
                                    zzidqVar.m8237k(zzifbVarM8360a);
                                    obj5 = obj4;
                                    try {
                                        objMo8450h = zzigs.m8422e(obj5, iM8248y, zzifbVarM8360a, zzigcVar.m8386F(iM8409v), objMo8450h, zzihdVar2);
                                        zzigcVar2 = zzigcVar;
                                        th = null;
                                    } catch (zzifg unused4) {
                                        obj3 = objMo8450h;
                                        obj2 = obj5;
                                        objMo8450h = obj3;
                                        if (objMo8450h == null) {
                                            objMo8450h = zzihdVar2.mo8450h(obj2);
                                        }
                                        if (!zzihdVar2.m8453k(0, zzidqVar, objMo8450h)) {
                                            objM8391K2 = objMo8450h;
                                            while (i3 < i2) {
                                                zzihd zzihdVar6 = zzihdVar2;
                                                objM8391K2 = zzigcVar.m8391K(obj2, iArr[i3], objM8391K2, zzihdVar6, obj);
                                                zzihdVar2 = zzihdVar6;
                                                i3++;
                                                zzigcVar = this;
                                            }
                                            if (objM8391K2 != null) {
                                                zzihdVar2.mo8451i(obj2, objM8391K2);
                                            }
                                        }
                                        th = null;
                                        zzigcVar2 = this;
                                    }
                                    break;
                                case 31:
                                    zzigcVar = zzigcVar2;
                                    zzidqVar.m8238l(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 32:
                                    zzigcVar = zzigcVar2;
                                    zzidqVar.m8239m(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 33:
                                    zzigcVar = zzigcVar2;
                                    zzidqVar.m8240n(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 34:
                                    zzigcVar = zzigcVar2;
                                    zzidqVar.m8241o(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 35:
                                    zzigcVar = zzigcVar2;
                                    zzidqVar.m8224S(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 36:
                                    zzigcVar = zzigcVar2;
                                    zzidqVar.m8225T(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 37:
                                    zzigcVar = zzigcVar2;
                                    zzidqVar.m8227a(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 38:
                                    zzigcVar = zzigcVar2;
                                    zzidqVar.m8226U(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 39:
                                    zzigcVar = zzigcVar2;
                                    zzidqVar.m8228b(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 40:
                                    zzigcVar = zzigcVar2;
                                    zzidqVar.m8229c(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 41:
                                    zzigcVar = zzigcVar2;
                                    zzidqVar.m8230d(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 42:
                                    zzigcVar = zzigcVar2;
                                    zzidqVar.m8231e(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 43:
                                    zzigcVar = zzigcVar2;
                                    obj2 = obj4;
                                    try {
                                        zzidqVar.m8236j(zzifl.m8360a(iM8402j & 1048575, obj2));
                                        obj3 = objMo8450h;
                                        zzigcVar2 = zzigcVar;
                                        objMo8450h = obj3;
                                        th = null;
                                    } catch (zzifg unused5) {
                                        obj3 = objMo8450h;
                                        objMo8450h = obj3;
                                        if (objMo8450h == null) {
                                            objMo8450h = zzihdVar2.mo8450h(obj2);
                                        }
                                        if (!zzihdVar2.m8453k(0, zzidqVar, objMo8450h)) {
                                            objM8391K2 = objMo8450h;
                                            while (i3 < i2) {
                                                zzihd zzihdVar7 = zzihdVar2;
                                                objM8391K2 = zzigcVar.m8391K(obj2, iArr[i3], objM8391K2, zzihdVar7, obj);
                                                zzihdVar2 = zzihdVar7;
                                                i3++;
                                                zzigcVar = this;
                                            }
                                            if (objM8391K2 != null) {
                                                zzihdVar2.mo8451i(obj2, objM8391K2);
                                            }
                                        }
                                        th = null;
                                        zzigcVar2 = this;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        obj3 = objMo8450h;
                                        objMo8450h = obj3;
                                        objM8391K = objMo8450h;
                                        while (i3 < i2) {
                                            zzihd zzihdVar8 = zzihdVar2;
                                            objM8391K = m8391K(obj2, iArr[i3], objM8391K, zzihdVar8, obj);
                                            i3++;
                                            zzihdVar2 = zzihdVar8;
                                        }
                                        zzihdVar = zzihdVar2;
                                        if (objM8391K != null) {
                                            zzihdVar.mo8451i(obj2, objM8391K);
                                        }
                                        throw th;
                                    }
                                    break;
                                case 44:
                                    zzifb zzifbVarM8360a2 = zzifl.m8360a(iM8402j & 1048575, obj4);
                                    zzidqVar.m8237k(zzifbVarM8360a2);
                                    zzigcVar = zzigcVar2;
                                    try {
                                        try {
                                            objMo8450h = zzigs.m8422e(obj4, iM8248y, zzifbVarM8360a2, zzigcVar2.m8386F(iM8409v), objMo8450h, zzihdVar2);
                                            zzigcVar2 = zzigcVar;
                                            th = null;
                                        } catch (zzifg unused6) {
                                            obj2 = obj4;
                                            obj3 = objMo8450h;
                                            objMo8450h = obj3;
                                            if (objMo8450h == null) {
                                                objMo8450h = zzihdVar2.mo8450h(obj2);
                                            }
                                            if (!zzihdVar2.m8453k(0, zzidqVar, objMo8450h)) {
                                                objM8391K2 = objMo8450h;
                                                while (i3 < i2) {
                                                    zzihd zzihdVar9 = zzihdVar2;
                                                    objM8391K2 = zzigcVar.m8391K(obj2, iArr[i3], objM8391K2, zzihdVar9, obj);
                                                    zzihdVar2 = zzihdVar9;
                                                    i3++;
                                                    zzigcVar = this;
                                                }
                                                if (objM8391K2 != null) {
                                                    zzihdVar2.mo8451i(obj2, objM8391K2);
                                                }
                                            }
                                            th = null;
                                            zzigcVar2 = this;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        obj2 = obj4;
                                        obj3 = objMo8450h;
                                        objMo8450h = obj3;
                                        objM8391K = objMo8450h;
                                        while (i3 < i2) {
                                            zzihd zzihdVar10 = zzihdVar2;
                                            objM8391K = m8391K(obj2, iArr[i3], objM8391K, zzihdVar10, obj);
                                            i3++;
                                            zzihdVar2 = zzihdVar10;
                                        }
                                        zzihdVar = zzihdVar2;
                                        if (objM8391K != null) {
                                            zzihdVar.mo8451i(obj2, objM8391K);
                                        }
                                        throw th;
                                    }
                                    break;
                                case 45:
                                    zzidqVar.m8238l(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 46:
                                    zzidqVar.m8239m(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 47:
                                    zzidqVar.m8240n(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 48:
                                    zzidqVar.m8241o(zzifl.m8360a(iM8402j & 1048575, obj4));
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 49:
                                    zzidqVar.m8234h(zzifl.m8360a(iM8402j & 1048575, obj4), zzigcVar2.m8384D(iM8409v), zzidzVar);
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 50:
                                    Object objM8385E = zzigcVar2.m8385E(iM8409v);
                                    long jM8402j = zzigcVar2.m8402j(iM8409v) & 1048575;
                                    Object objM8477k = zzihk.m8477k(jM8402j, obj4);
                                    if (objM8477k == null) {
                                        objM8477k = zzift.f19836t.m8366a();
                                        zzihk.m8478l(jM8402j, obj4, objM8477k);
                                    } else if (!((zzift) objM8477k).f19837s) {
                                        Object objM8366a = zzift.f19836t.m8366a();
                                        zzifu.m8368a(objM8366a, objM8477k);
                                        zzihk.m8478l(jM8402j, obj4, objM8366a);
                                        objM8477k = objM8366a;
                                    }
                                    zzidqVar.m8242p((zzift) objM8477k, ((zzifs) objM8385E).f19835a, zzidzVar);
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 51:
                                    zzihk.m8478l(iM8402j & 1048575, obj4, Double.valueOf(zzidqVar.m8249z()));
                                    zzigcVar2.m8408u(iM8248y, iM8409v, obj4);
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 52:
                                    zzihk.m8478l(iM8402j & 1048575, obj4, Float.valueOf(zzidqVar.m8206A()));
                                    zzigcVar2.m8408u(iM8248y, iM8409v, obj4);
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 53:
                                    zzihk.m8478l(iM8402j & 1048575, obj4, Long.valueOf(zzidqVar.m8208C()));
                                    zzigcVar2.m8408u(iM8248y, iM8409v, obj4);
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 54:
                                    zzihk.m8478l(iM8402j & 1048575, obj4, Long.valueOf(zzidqVar.m8207B()));
                                    zzigcVar2.m8408u(iM8248y, iM8409v, obj4);
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 55:
                                    zzihk.m8478l(iM8402j & 1048575, obj4, Integer.valueOf(zzidqVar.m8209D()));
                                    zzigcVar2.m8408u(iM8248y, iM8409v, obj4);
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 56:
                                    zzihk.m8478l(iM8402j & 1048575, obj4, Long.valueOf(zzidqVar.m8210E()));
                                    zzigcVar2.m8408u(iM8248y, iM8409v, obj4);
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 57:
                                    zzihk.m8478l(iM8402j & 1048575, obj4, Integer.valueOf(zzidqVar.m8211F()));
                                    zzigcVar2.m8408u(iM8248y, iM8409v, obj4);
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 58:
                                    zzihk.m8478l(iM8402j & 1048575, obj4, Boolean.valueOf(zzidqVar.m8212G()));
                                    zzigcVar2.m8408u(iM8248y, iM8409v, obj4);
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 59:
                                    zzigcVar2.m8392L(iM8402j, zzidqVar, obj4);
                                    zzigcVar2.m8408u(iM8248y, iM8409v, obj4);
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 60:
                                    zzifz zzifzVar3 = (zzifz) zzigcVar2.m8389I(iM8248y, iM8409v, obj4);
                                    zzidqVar.m8215J(zzifzVar3, zzigcVar2.m8384D(iM8409v), zzidzVar);
                                    zzigcVar2.m8390J(iM8248y, obj4, iM8409v, zzifzVar3);
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 61:
                                    zzihk.m8478l(iM8402j & 1048575, obj4, zzidqVar.m8217L());
                                    zzigcVar2.m8408u(iM8248y, iM8409v, obj4);
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 62:
                                    zzihk.m8478l(iM8402j & 1048575, obj4, Integer.valueOf(zzidqVar.m8218M()));
                                    zzigcVar2.m8408u(iM8248y, iM8409v, obj4);
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 63:
                                    int iM8219N2 = zzidqVar.m8219N();
                                    zziev zzievVarM8386F2 = zzigcVar2.m8386F(iM8409v);
                                    if (zzievVarM8386F2 == null || zzievVarM8386F2.zza(iM8219N2)) {
                                        zzihk.m8478l(iM8402j & 1048575, obj4, Integer.valueOf(iM8219N2));
                                        zzigcVar2.m8408u(iM8248y, iM8409v, obj4);
                                        zzigcVar = zzigcVar2;
                                        obj3 = objMo8450h;
                                        zzigcVar2 = zzigcVar;
                                        objMo8450h = obj3;
                                    } else {
                                        zzihf zzihfVar2 = zzigs.f19881a;
                                        Object objMo8450h2 = objMo8450h == null ? zzihdVar2.mo8450h(obj4) : objMo8450h;
                                        zzihdVar2.mo8443a(objMo8450h2, iM8248y, iM8219N2);
                                        objMo8450h = objMo8450h2;
                                    }
                                    th = null;
                                    break;
                                case 64:
                                    zzihk.m8478l(iM8402j & 1048575, obj4, Integer.valueOf(zzidqVar.m8220O()));
                                    zzigcVar2.m8408u(iM8248y, iM8409v, obj4);
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 65:
                                    zzihk.m8478l(iM8402j & 1048575, obj4, Long.valueOf(zzidqVar.m8221P()));
                                    zzigcVar2.m8408u(iM8248y, iM8409v, obj4);
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 66:
                                    zzihk.m8478l(iM8402j & 1048575, obj4, Integer.valueOf(zzidqVar.m8222Q()));
                                    zzigcVar2.m8408u(iM8248y, iM8409v, obj4);
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 67:
                                    zzihk.m8478l(iM8402j & 1048575, obj4, Long.valueOf(zzidqVar.m8223R()));
                                    zzigcVar2.m8408u(iM8248y, iM8409v, obj4);
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                case 68:
                                    zzifz zzifzVar4 = (zzifz) zzigcVar2.m8389I(iM8248y, iM8409v, obj4);
                                    zzidqVar.m8216K(zzifzVar4, zzigcVar2.m8384D(iM8409v), zzidzVar);
                                    zzigcVar2.m8390J(iM8248y, obj4, iM8409v, zzifzVar4);
                                    zzigcVar = zzigcVar2;
                                    obj3 = objMo8450h;
                                    zzigcVar2 = zzigcVar;
                                    objMo8450h = obj3;
                                    th = null;
                                    break;
                                default:
                                    if (objMo8450h == null) {
                                        objMo8450h = zzihdVar2.mo8450h(obj4);
                                    }
                                    try {
                                        if (!zzihdVar2.m8453k(0, zzidqVar, objMo8450h)) {
                                            objM8391K2 = objMo8450h;
                                            while (i3 < i2) {
                                                zzihd zzihdVar11 = zzihdVar2;
                                                objM8391K2 = zzigcVar2.m8391K(obj, iArr[i3], objM8391K2, zzihdVar11, obj);
                                                obj4 = obj;
                                                zzihdVar2 = zzihdVar11;
                                                i3++;
                                            }
                                            obj2 = obj4;
                                        }
                                    } catch (zzifg unused7) {
                                        zzigcVar = zzigcVar2;
                                        obj2 = obj4;
                                        if (objMo8450h == null) {
                                            objMo8450h = zzihdVar2.mo8450h(obj2);
                                        }
                                        if (!zzihdVar2.m8453k(0, zzidqVar, objMo8450h)) {
                                            objM8391K2 = objMo8450h;
                                            while (i3 < i2) {
                                                zzihd zzihdVar12 = zzihdVar2;
                                                objM8391K2 = zzigcVar.m8391K(obj2, iArr[i3], objM8391K2, zzihdVar12, obj);
                                                zzihdVar2 = zzihdVar12;
                                                i3++;
                                                zzigcVar = this;
                                            }
                                            if (objM8391K2 != null) {
                                                zzihdVar2.mo8451i(obj2, objM8391K2);
                                            }
                                        }
                                        th = null;
                                        zzigcVar2 = this;
                                    }
                                    break;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            obj2 = obj4;
                            obj3 = objMo8450h;
                            objMo8450h = obj3;
                            objM8391K = objMo8450h;
                            while (i3 < i2) {
                                zzihd zzihdVar13 = zzihdVar2;
                                objM8391K = m8391K(obj2, iArr[i3], objM8391K, zzihdVar13, obj);
                                i3++;
                                zzihdVar2 = zzihdVar13;
                            }
                            zzihdVar = zzihdVar2;
                            if (objM8391K != null) {
                                zzihdVar.mo8451i(obj2, objM8391K);
                            }
                            throw th;
                        }
                    } catch (zzifg unused8) {
                        zzigcVar = zzigcVar2;
                        obj2 = obj4;
                    }
                } else if (iM8248y == Integer.MAX_VALUE) {
                    objM8391K2 = objMo8450h;
                    while (i3 < i2) {
                        zzihd zzihdVar14 = zzihdVar2;
                        objM8391K2 = zzigcVar2.m8391K(obj, iArr[i3], objM8391K2, zzihdVar14, obj);
                        zzihdVar2 = zzihdVar14;
                        i3++;
                    }
                    obj2 = obj;
                } else {
                    obj4 = obj;
                    try {
                        if ((zzigcVar2.f19848f ? (zzien) zzidzVar.f19760a.get(new zzidy(iM8248y, zzigcVar2.f19847e)) : th) != null) {
                            throw th;
                        }
                        if (objMo8450h == null) {
                            objMo8450h = zzihdVar2.mo8450h(obj4);
                        }
                        try {
                            if (!zzihdVar2.m8453k(0, zzidqVar, objMo8450h)) {
                                objM8391K2 = objMo8450h;
                                while (i3 < i2) {
                                    zzihd zzihdVar15 = zzihdVar2;
                                    objM8391K2 = zzigcVar2.m8391K(obj, iArr[i3], objM8391K2, zzihdVar15, obj);
                                    obj4 = obj;
                                    zzihdVar2 = zzihdVar15;
                                    i3++;
                                }
                                obj2 = obj4;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            obj2 = obj4;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        obj2 = obj4;
                        obj3 = objMo8450h;
                        objMo8450h = obj3;
                    }
                }
            } catch (Throwable th11) {
                th = th11;
                obj2 = obj;
            }
            objMo8450h = obj3;
            objM8391K = objMo8450h;
            while (i3 < i2) {
                zzihd zzihdVar16 = zzihdVar2;
                objM8391K = m8391K(obj2, iArr[i3], objM8391K, zzihdVar16, obj);
                i3++;
                zzihdVar2 = zzihdVar16;
            }
            zzihdVar = zzihdVar2;
            if (objM8391K != null) {
                zzihdVar.mo8451i(obj2, objM8391K);
            }
            throw th;
        }
        if (objM8391K2 != null) {
            zzihdVar2.mo8451i(obj2, objM8391K2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzigr
    /* JADX INFO: renamed from: g */
    public final void mo8399g(Object obj, zzidv zzidvVar) {
        Map.Entry entry;
        int i2;
        int i3;
        int i4;
        int i5;
        zzigc<T> zzigcVar = this;
        zzidu zziduVar = zzidvVar.f19752a;
        if (zzigcVar.f19848f) {
            zziee zzieeVar = ((zziel) obj).zza;
            if (zzieeVar.f19767a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzieeVar.m8313b().next();
            }
        } else {
            entry = null;
        }
        Unsafe unsafe = f19842n;
        int i6 = 0;
        int i7 = 1048575;
        int i8 = 0;
        while (true) {
            int[] iArr = zzigcVar.f19843a;
            int length = iArr.length;
            zziea zzieaVar = zzigcVar.f19854l;
            if (i6 >= length) {
                if (entry == null) {
                    ((zziep) obj).zzt.m8455b(zzidvVar);
                    return;
                } else {
                    zzieaVar.mo8306b(entry);
                    throw null;
                }
            }
            int iM8402j = zzigcVar.m8402j(i6);
            int iM8374k = m8374k(iM8402j);
            int i9 = iArr[i6];
            if (iM8374k <= 17) {
                int i10 = iArr[i6 + 2];
                i2 = 1;
                int i11 = i10 & 1048575;
                if (i11 != i7) {
                    i8 = i11 == 1048575 ? 0 : unsafe.getInt(obj, i11);
                    i7 = i11;
                }
                i3 = 1 << (i10 >>> 20);
            } else {
                i2 = 1;
                i3 = 0;
            }
            if (entry != null) {
                ((zziem) entry.getKey()).getClass();
                if (i9 >= 0) {
                    zzieaVar.mo8306b(entry);
                    throw null;
                }
            }
            long j2 = iM8402j & 1048575;
            int i12 = 2;
            switch (iM8374k) {
                case 0:
                    if (zzigcVar.m8404q(obj, i6, i7, i8, i3)) {
                        zzidvVar.m8287e(i9, zzihk.f19905c.mo8464f(j2, obj));
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 1:
                    if (zzigcVar.m8404q(obj, i6, i7, i8, i3)) {
                        zzidvVar.m8286d(zzihk.f19905c.mo8462d(j2, obj), i9);
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 2:
                    if (zzigcVar.m8404q(obj, i6, i7, i8, i3)) {
                        zzidvVar.m8284b(i9, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 3:
                    if (zzigcVar.m8404q(obj, i6, i7, i8, i3)) {
                        zzidvVar.m8289g(i9, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 4:
                    if (zzigcVar.m8404q(obj, i6, i7, i8, i3)) {
                        zzidvVar.m8290h(i9, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 5:
                    if (zzigcVar.m8404q(obj, i6, i7, i8, i3)) {
                        zzidvVar.m8291i(i9, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 6:
                    if (zzigcVar.m8404q(obj, i6, i7, i8, i3)) {
                        zzidvVar.m8292j(i9, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 7:
                    if (zzigcVar.m8404q(obj, i6, i7, i8, i3)) {
                        zzidvVar.m8293k(i9, zzihk.f19905c.mo8460b(j2, obj));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 8:
                    if (zzigcVar.m8404q(obj, i6, i7, i8, i3)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            zziduVar.mo8258l(i9, (String) object);
                        } else {
                            zzidvVar.m8294l(i9, (zzidl) object);
                        }
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 9:
                    if (zzigcVar.m8404q(obj, i6, i7, i8, i3)) {
                        zzidvVar.m8298p(i9, unsafe.getObject(obj, j2), zzigcVar.m8384D(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 10:
                    if (zzigcVar.m8404q(obj, i6, i7, i8, i3)) {
                        zzidvVar.m8294l(i9, (zzidl) unsafe.getObject(obj, j2));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 11:
                    if (zzigcVar.m8404q(obj, i6, i7, i8, i3)) {
                        zzidvVar.m8295m(i9, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 12:
                    if (zzigcVar.m8404q(obj, i6, i7, i8, i3)) {
                        zzidvVar.m8288f(i9, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 13:
                    if (zzigcVar.m8404q(obj, i6, i7, i8, i3)) {
                        zzidvVar.m8283a(i9, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 14:
                    if (zzigcVar.m8404q(obj, i6, i7, i8, i3)) {
                        zzidvVar.m8285c(i9, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 15:
                    if (zzigcVar.m8404q(obj, i6, i7, i8, i3)) {
                        zzidvVar.m8296n(i9, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 16:
                    if (zzigcVar.m8404q(obj, i6, i7, i8, i3)) {
                        zzidvVar.m8297o(i9, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 17:
                    if (zzigcVar.m8404q(obj, i6, i7, i8, i3)) {
                        zzidvVar.m8299q(i9, unsafe.getObject(obj, j2), zzigcVar.m8384D(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 18:
                    i4 = i7;
                    i5 = i8;
                    int i13 = iArr[i6];
                    List list = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar = zzigs.f19881a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof zzidw) {
                            zzidw zzidwVar = (zzidw) list;
                            for (int i14 = 0; i14 < zzidwVar.f19755u; i14++) {
                                zzidwVar.m8302d(i14);
                                zziduVar.mo8256j(i13, Double.doubleToRawLongBits(zzidwVar.f19754t[i14]));
                            }
                        } else {
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                zziduVar.mo8256j(i13, Double.doubleToRawLongBits(((Double) list.get(i15)).doubleValue()));
                            }
                        }
                    }
                    break;
                case 19:
                    i4 = i7;
                    i5 = i8;
                    int i16 = iArr[i6];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar2 = zzigs.f19881a;
                    if (list2 != null && !list2.isEmpty()) {
                        if (list2 instanceof zzieg) {
                            zzieg zziegVar = (zzieg) list2;
                            for (int i17 = 0; i17 < zziegVar.f19777u; i17++) {
                                zziegVar.m8318d(i17);
                                zziduVar.mo8254h(i16, Float.floatToRawIntBits(zziegVar.f19776t[i17]));
                            }
                        } else {
                            for (int i18 = 0; i18 < list2.size(); i18++) {
                                zziduVar.mo8254h(i16, Float.floatToRawIntBits(((Float) list2.get(i18)).floatValue()));
                            }
                        }
                    }
                    break;
                case 20:
                    i4 = i7;
                    i5 = i8;
                    int i19 = iArr[i6];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar3 = zzigs.f19881a;
                    if (list3 != null && !list3.isEmpty()) {
                        if (list3 instanceof zzifn) {
                            zzifn zzifnVar = (zzifn) list3;
                            for (int i20 = 0; i20 < zzifnVar.f19828u; i20++) {
                                zziduVar.mo8255i(i19, zzifnVar.m8361A(i20));
                            }
                        } else {
                            for (int i21 = 0; i21 < list3.size(); i21++) {
                                zziduVar.mo8255i(i19, ((Long) list3.get(i21)).longValue());
                            }
                        }
                    }
                    break;
                case 21:
                    i4 = i7;
                    i5 = i8;
                    int i22 = iArr[i6];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar4 = zzigs.f19881a;
                    if (list4 != null && !list4.isEmpty()) {
                        if (list4 instanceof zzifn) {
                            zzifn zzifnVar2 = (zzifn) list4;
                            for (int i23 = 0; i23 < zzifnVar2.f19828u; i23++) {
                                zziduVar.mo8255i(i22, zzifnVar2.m8361A(i23));
                            }
                        } else {
                            for (int i24 = 0; i24 < list4.size(); i24++) {
                                zziduVar.mo8255i(i22, ((Long) list4.get(i24)).longValue());
                            }
                        }
                    }
                    break;
                case 22:
                    i4 = i7;
                    i5 = i8;
                    int i25 = iArr[i6];
                    List list5 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar5 = zzigs.f19881a;
                    if (list5 != null && !list5.isEmpty()) {
                        if (list5 instanceof zzieq) {
                            zzieq zzieqVar = (zzieq) list5;
                            for (int i26 = 0; i26 < zzieqVar.f19793u; i26++) {
                                zziduVar.mo8252f(i25, zzieqVar.m8352o(i26));
                            }
                        } else {
                            for (int i27 = 0; i27 < list5.size(); i27++) {
                                zziduVar.mo8252f(i25, ((Integer) list5.get(i27)).intValue());
                            }
                        }
                    }
                    break;
                case 23:
                    i4 = i7;
                    i5 = i8;
                    int i28 = iArr[i6];
                    List list6 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar6 = zzigs.f19881a;
                    if (list6 != null && !list6.isEmpty()) {
                        if (list6 instanceof zzifn) {
                            zzifn zzifnVar3 = (zzifn) list6;
                            for (int i29 = 0; i29 < zzifnVar3.f19828u; i29++) {
                                zziduVar.mo8256j(i28, zzifnVar3.m8361A(i29));
                            }
                        } else {
                            for (int i30 = 0; i30 < list6.size(); i30++) {
                                zziduVar.mo8256j(i28, ((Long) list6.get(i30)).longValue());
                            }
                        }
                    }
                    break;
                case 24:
                    i4 = i7;
                    i5 = i8;
                    int i31 = iArr[i6];
                    List list7 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar7 = zzigs.f19881a;
                    if (list7 != null && !list7.isEmpty()) {
                        if (list7 instanceof zzieq) {
                            zzieq zzieqVar2 = (zzieq) list7;
                            for (int i32 = 0; i32 < zzieqVar2.f19793u; i32++) {
                                zziduVar.mo8254h(i31, zzieqVar2.m8352o(i32));
                            }
                        } else {
                            for (int i33 = 0; i33 < list7.size(); i33++) {
                                zziduVar.mo8254h(i31, ((Integer) list7.get(i33)).intValue());
                            }
                        }
                    }
                    break;
                case 25:
                    i4 = i7;
                    i5 = i8;
                    int i34 = iArr[i6];
                    List list8 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar8 = zzigs.f19881a;
                    if (list8 != null && !list8.isEmpty()) {
                        if (list8 instanceof zzidb) {
                            zzidb zzidbVar = (zzidb) list8;
                            for (int i35 = 0; i35 < zzidbVar.f19705u; i35++) {
                                zzidbVar.m8126d(i35);
                                zziduVar.mo8257k(i34, zzidbVar.f19704t[i35]);
                            }
                        } else {
                            for (int i36 = 0; i36 < list8.size(); i36++) {
                                zziduVar.mo8257k(i34, ((Boolean) list8.get(i36)).booleanValue());
                            }
                        }
                    }
                    break;
                case 26:
                    i4 = i7;
                    i5 = i8;
                    zzigs.m8423f(iArr[i6], (List) unsafe.getObject(obj, j2), zzidvVar);
                    break;
                case 27:
                    i4 = i7;
                    i5 = i8;
                    zzigs.m8425h(iArr[i6], (List) unsafe.getObject(obj, j2), zzidvVar, zzigcVar.m8384D(i6));
                    break;
                case 28:
                    i4 = i7;
                    i5 = i8;
                    zzigs.m8424g(iArr[i6], (List) unsafe.getObject(obj, j2), zzidvVar);
                    break;
                case 29:
                    i4 = i7;
                    i5 = i8;
                    int i37 = iArr[i6];
                    List list9 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar9 = zzigs.f19881a;
                    if (list9 != null && !list9.isEmpty()) {
                        if (list9 instanceof zzieq) {
                            zzieq zzieqVar3 = (zzieq) list9;
                            for (int i38 = 0; i38 < zzieqVar3.f19793u; i38++) {
                                zziduVar.mo8253g(i37, zzieqVar3.m8352o(i38));
                            }
                        } else {
                            for (int i39 = 0; i39 < list9.size(); i39++) {
                                zziduVar.mo8253g(i37, ((Integer) list9.get(i39)).intValue());
                            }
                        }
                    }
                    break;
                case 30:
                    i4 = i7;
                    i5 = i8;
                    int i40 = iArr[i6];
                    List list10 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar10 = zzigs.f19881a;
                    if (list10 != null && !list10.isEmpty()) {
                        if (list10 instanceof zzieq) {
                            zzieq zzieqVar4 = (zzieq) list10;
                            for (int i41 = 0; i41 < zzieqVar4.f19793u; i41++) {
                                zziduVar.mo8252f(i40, zzieqVar4.m8352o(i41));
                            }
                        } else {
                            for (int i42 = 0; i42 < list10.size(); i42++) {
                                zziduVar.mo8252f(i40, ((Integer) list10.get(i42)).intValue());
                            }
                        }
                    }
                    break;
                case 31:
                    i4 = i7;
                    i5 = i8;
                    int i43 = iArr[i6];
                    List list11 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar11 = zzigs.f19881a;
                    if (list11 != null && !list11.isEmpty()) {
                        if (list11 instanceof zzieq) {
                            zzieq zzieqVar5 = (zzieq) list11;
                            for (int i44 = 0; i44 < zzieqVar5.f19793u; i44++) {
                                zziduVar.mo8254h(i43, zzieqVar5.m8352o(i44));
                            }
                        } else {
                            for (int i45 = 0; i45 < list11.size(); i45++) {
                                zziduVar.mo8254h(i43, ((Integer) list11.get(i45)).intValue());
                            }
                        }
                    }
                    break;
                case 32:
                    i4 = i7;
                    i5 = i8;
                    int i46 = iArr[i6];
                    List list12 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar12 = zzigs.f19881a;
                    if (list12 != null && !list12.isEmpty()) {
                        if (list12 instanceof zzifn) {
                            zzifn zzifnVar4 = (zzifn) list12;
                            for (int i47 = 0; i47 < zzifnVar4.f19828u; i47++) {
                                zziduVar.mo8256j(i46, zzifnVar4.m8361A(i47));
                            }
                        } else {
                            for (int i48 = 0; i48 < list12.size(); i48++) {
                                zziduVar.mo8256j(i46, ((Long) list12.get(i48)).longValue());
                            }
                        }
                    }
                    break;
                case 33:
                    i4 = i7;
                    i5 = i8;
                    int i49 = iArr[i6];
                    List list13 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar13 = zzigs.f19881a;
                    if (list13 != null && !list13.isEmpty()) {
                        if (list13 instanceof zzieq) {
                            zzieq zzieqVar6 = (zzieq) list13;
                            for (int i50 = 0; i50 < zzieqVar6.f19793u; i50++) {
                                int iM8352o = zzieqVar6.m8352o(i50);
                                zziduVar.mo8253g(i49, (iM8352o >> 31) ^ (iM8352o + iM8352o));
                            }
                        } else {
                            for (int i51 = 0; i51 < list13.size(); i51++) {
                                int iIntValue = ((Integer) list13.get(i51)).intValue();
                                zziduVar.mo8253g(i49, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                            }
                        }
                    }
                    break;
                case 34:
                    i4 = i7;
                    i5 = i8;
                    int i52 = iArr[i6];
                    List list14 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar14 = zzigs.f19881a;
                    if (list14 != null && !list14.isEmpty()) {
                        if (list14 instanceof zzifn) {
                            zzifn zzifnVar5 = (zzifn) list14;
                            for (int i53 = 0; i53 < zzifnVar5.f19828u; i53++) {
                                long jM8361A = zzifnVar5.m8361A(i53);
                                zziduVar.mo8255i(i52, (jM8361A >> 63) ^ (jM8361A + jM8361A));
                            }
                        } else {
                            for (int i54 = 0; i54 < list14.size(); i54++) {
                                long jLongValue = ((Long) list14.get(i54)).longValue();
                                zziduVar.mo8255i(i52, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                            }
                        }
                    }
                    break;
                case 35:
                    i4 = i7;
                    i5 = i8;
                    int i55 = iArr[i6];
                    List list15 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar15 = zzigs.f19881a;
                    if (list15 != null && !list15.isEmpty()) {
                        if (list15 instanceof zzidw) {
                            zzidw zzidwVar2 = (zzidw) list15;
                            zziduVar.mo8251e(i55, 2);
                            int i56 = 0;
                            for (int i57 = 0; i57 < zzidwVar2.f19755u; i57++) {
                                zzidwVar2.m8302d(i57);
                                double d = zzidwVar2.f19754t[i57];
                                i56 += 8;
                            }
                            zziduVar.mo8267u(i56);
                            for (int i58 = 0; i58 < zzidwVar2.f19755u; i58++) {
                                zzidwVar2.m8302d(i58);
                                zziduVar.mo8270x(Double.doubleToRawLongBits(zzidwVar2.f19754t[i58]));
                            }
                        } else {
                            zziduVar.mo8251e(i55, 2);
                            int i59 = 0;
                            for (int i60 = 0; i60 < list15.size(); i60++) {
                                ((Double) list15.get(i60)).getClass();
                                i59 += 8;
                            }
                            zziduVar.mo8267u(i59);
                            for (int i61 = 0; i61 < list15.size(); i61++) {
                                zziduVar.mo8270x(Double.doubleToRawLongBits(((Double) list15.get(i61)).doubleValue()));
                            }
                        }
                    }
                    break;
                case 36:
                    i4 = i7;
                    i5 = i8;
                    int i62 = iArr[i6];
                    List list16 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar16 = zzigs.f19881a;
                    if (list16 != null && !list16.isEmpty()) {
                        if (list16 instanceof zzieg) {
                            zzieg zziegVar2 = (zzieg) list16;
                            zziduVar.mo8251e(i62, 2);
                            int i63 = 0;
                            for (int i64 = 0; i64 < zziegVar2.f19777u; i64++) {
                                zziegVar2.m8318d(i64);
                                float f2 = zziegVar2.f19776t[i64];
                                i63 += 4;
                            }
                            zziduVar.mo8267u(i63);
                            for (int i65 = 0; i65 < zziegVar2.f19777u; i65++) {
                                zziegVar2.m8318d(i65);
                                zziduVar.mo8268v(Float.floatToRawIntBits(zziegVar2.f19776t[i65]));
                            }
                        } else {
                            zziduVar.mo8251e(i62, 2);
                            int i66 = 0;
                            for (int i67 = 0; i67 < list16.size(); i67++) {
                                ((Float) list16.get(i67)).getClass();
                                i66 += 4;
                            }
                            zziduVar.mo8267u(i66);
                            for (int i68 = 0; i68 < list16.size(); i68++) {
                                zziduVar.mo8268v(Float.floatToRawIntBits(((Float) list16.get(i68)).floatValue()));
                            }
                        }
                    }
                    break;
                case 37:
                    i4 = i7;
                    i5 = i8;
                    int i69 = iArr[i6];
                    List list17 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar17 = zzigs.f19881a;
                    if (list17 != null && !list17.isEmpty()) {
                        if (list17 instanceof zzifn) {
                            zzifn zzifnVar6 = (zzifn) list17;
                            zziduVar.mo8251e(i69, 2);
                            int iM8281c = 0;
                            for (int i70 = 0; i70 < zzifnVar6.f19828u; i70++) {
                                iM8281c += zzidu.m8281c(zzifnVar6.m8361A(i70));
                            }
                            zziduVar.mo8267u(iM8281c);
                            for (int i71 = 0; i71 < zzifnVar6.f19828u; i71++) {
                                zziduVar.mo8269w(zzifnVar6.m8361A(i71));
                            }
                        } else {
                            zziduVar.mo8251e(i69, 2);
                            int iM8281c2 = 0;
                            for (int i72 = 0; i72 < list17.size(); i72++) {
                                iM8281c2 += zzidu.m8281c(((Long) list17.get(i72)).longValue());
                            }
                            zziduVar.mo8267u(iM8281c2);
                            for (int i73 = 0; i73 < list17.size(); i73++) {
                                zziduVar.mo8269w(((Long) list17.get(i73)).longValue());
                            }
                        }
                    }
                    break;
                case 38:
                    i4 = i7;
                    i5 = i8;
                    int i74 = iArr[i6];
                    List list18 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar18 = zzigs.f19881a;
                    if (list18 != null && !list18.isEmpty()) {
                        if (list18 instanceof zzifn) {
                            zzifn zzifnVar7 = (zzifn) list18;
                            zziduVar.mo8251e(i74, 2);
                            int iM8281c3 = 0;
                            for (int i75 = 0; i75 < zzifnVar7.f19828u; i75++) {
                                iM8281c3 += zzidu.m8281c(zzifnVar7.m8361A(i75));
                            }
                            zziduVar.mo8267u(iM8281c3);
                            for (int i76 = 0; i76 < zzifnVar7.f19828u; i76++) {
                                zziduVar.mo8269w(zzifnVar7.m8361A(i76));
                            }
                        } else {
                            zziduVar.mo8251e(i74, 2);
                            int iM8281c4 = 0;
                            for (int i77 = 0; i77 < list18.size(); i77++) {
                                iM8281c4 += zzidu.m8281c(((Long) list18.get(i77)).longValue());
                            }
                            zziduVar.mo8267u(iM8281c4);
                            for (int i78 = 0; i78 < list18.size(); i78++) {
                                zziduVar.mo8269w(((Long) list18.get(i78)).longValue());
                            }
                        }
                    }
                    break;
                case 39:
                    i4 = i7;
                    i5 = i8;
                    int i79 = iArr[i6];
                    List list19 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar19 = zzigs.f19881a;
                    if (list19 != null && !list19.isEmpty()) {
                        if (list19 instanceof zzieq) {
                            zzieq zzieqVar7 = (zzieq) list19;
                            zziduVar.mo8251e(i79, 2);
                            int iM8281c5 = 0;
                            for (int i80 = 0; i80 < zzieqVar7.f19793u; i80++) {
                                iM8281c5 += zzidu.m8281c(zzieqVar7.m8352o(i80));
                            }
                            zziduVar.mo8267u(iM8281c5);
                            for (int i81 = 0; i81 < zzieqVar7.f19793u; i81++) {
                                zziduVar.mo8266t(zzieqVar7.m8352o(i81));
                            }
                        } else {
                            zziduVar.mo8251e(i79, 2);
                            int iM8281c6 = 0;
                            for (int i82 = 0; i82 < list19.size(); i82++) {
                                iM8281c6 += zzidu.m8281c(((Integer) list19.get(i82)).intValue());
                            }
                            zziduVar.mo8267u(iM8281c6);
                            for (int i83 = 0; i83 < list19.size(); i83++) {
                                zziduVar.mo8266t(((Integer) list19.get(i83)).intValue());
                            }
                        }
                    }
                    break;
                case 40:
                    i4 = i7;
                    i5 = i8;
                    int i84 = iArr[i6];
                    List list20 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar20 = zzigs.f19881a;
                    if (list20 != null && !list20.isEmpty()) {
                        if (list20 instanceof zzifn) {
                            zzifn zzifnVar8 = (zzifn) list20;
                            zziduVar.mo8251e(i84, 2);
                            int i85 = 0;
                            for (int i86 = 0; i86 < zzifnVar8.f19828u; i86++) {
                                zzifnVar8.m8361A(i86);
                                i85 += 8;
                            }
                            zziduVar.mo8267u(i85);
                            for (int i87 = 0; i87 < zzifnVar8.f19828u; i87++) {
                                zziduVar.mo8270x(zzifnVar8.m8361A(i87));
                            }
                        } else {
                            zziduVar.mo8251e(i84, 2);
                            int i88 = 0;
                            for (int i89 = 0; i89 < list20.size(); i89++) {
                                ((Long) list20.get(i89)).getClass();
                                i88 += 8;
                            }
                            zziduVar.mo8267u(i88);
                            for (int i90 = 0; i90 < list20.size(); i90++) {
                                zziduVar.mo8270x(((Long) list20.get(i90)).longValue());
                            }
                        }
                    }
                    break;
                case 41:
                    i4 = i7;
                    i5 = i8;
                    int i91 = iArr[i6];
                    List list21 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar21 = zzigs.f19881a;
                    if (list21 != null && !list21.isEmpty()) {
                        if (list21 instanceof zzieq) {
                            zzieq zzieqVar8 = (zzieq) list21;
                            zziduVar.mo8251e(i91, 2);
                            int i92 = 0;
                            for (int i93 = 0; i93 < zzieqVar8.f19793u; i93++) {
                                zzieqVar8.m8352o(i93);
                                i92 += 4;
                            }
                            zziduVar.mo8267u(i92);
                            for (int i94 = 0; i94 < zzieqVar8.f19793u; i94++) {
                                zziduVar.mo8268v(zzieqVar8.m8352o(i94));
                            }
                        } else {
                            zziduVar.mo8251e(i91, 2);
                            int i95 = 0;
                            for (int i96 = 0; i96 < list21.size(); i96++) {
                                ((Integer) list21.get(i96)).getClass();
                                i95 += 4;
                            }
                            zziduVar.mo8267u(i95);
                            for (int i97 = 0; i97 < list21.size(); i97++) {
                                zziduVar.mo8268v(((Integer) list21.get(i97)).intValue());
                            }
                        }
                    }
                    break;
                case 42:
                    i4 = i7;
                    i5 = i8;
                    int i98 = iArr[i6];
                    List list22 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar22 = zzigs.f19881a;
                    if (list22 != null && !list22.isEmpty()) {
                        if (list22 instanceof zzidb) {
                            zzidb zzidbVar2 = (zzidb) list22;
                            zziduVar.mo8251e(i98, 2);
                            int i99 = 0;
                            for (int i100 = 0; i100 < zzidbVar2.f19705u; i100++) {
                                zzidbVar2.m8126d(i100);
                                boolean z = zzidbVar2.f19704t[i100];
                                i99++;
                            }
                            zziduVar.mo8267u(i99);
                            for (int i101 = 0; i101 < zzidbVar2.f19705u; i101++) {
                                zzidbVar2.m8126d(i101);
                                zziduVar.mo8265s(zzidbVar2.f19704t[i101] ? (byte) 1 : (byte) 0);
                            }
                        } else {
                            zziduVar.mo8251e(i98, 2);
                            int i102 = 0;
                            for (int i103 = 0; i103 < list22.size(); i103++) {
                                ((Boolean) list22.get(i103)).getClass();
                                i102++;
                            }
                            zziduVar.mo8267u(i102);
                            for (int i104 = 0; i104 < list22.size(); i104++) {
                                zziduVar.mo8265s(((Boolean) list22.get(i104)).booleanValue() ? (byte) 1 : (byte) 0);
                            }
                        }
                    }
                    break;
                case 43:
                    i4 = i7;
                    i5 = i8;
                    int i105 = iArr[i6];
                    List list23 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar23 = zzigs.f19881a;
                    if (list23 != null && !list23.isEmpty()) {
                        if (list23 instanceof zzieq) {
                            zzieq zzieqVar9 = (zzieq) list23;
                            zziduVar.mo8251e(i105, 2);
                            int iM8280b = 0;
                            for (int i106 = 0; i106 < zzieqVar9.f19793u; i106++) {
                                iM8280b += zzidu.m8280b(zzieqVar9.m8352o(i106));
                            }
                            zziduVar.mo8267u(iM8280b);
                            for (int i107 = 0; i107 < zzieqVar9.f19793u; i107++) {
                                zziduVar.mo8267u(zzieqVar9.m8352o(i107));
                            }
                        } else {
                            zziduVar.mo8251e(i105, 2);
                            int iM8280b2 = 0;
                            for (int i108 = 0; i108 < list23.size(); i108++) {
                                iM8280b2 += zzidu.m8280b(((Integer) list23.get(i108)).intValue());
                            }
                            zziduVar.mo8267u(iM8280b2);
                            for (int i109 = 0; i109 < list23.size(); i109++) {
                                zziduVar.mo8267u(((Integer) list23.get(i109)).intValue());
                            }
                        }
                    }
                    break;
                case 44:
                    i4 = i7;
                    i5 = i8;
                    int i110 = iArr[i6];
                    List list24 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar24 = zzigs.f19881a;
                    if (list24 != null && !list24.isEmpty()) {
                        if (list24 instanceof zzieq) {
                            zzieq zzieqVar10 = (zzieq) list24;
                            zziduVar.mo8251e(i110, 2);
                            int iM8281c7 = 0;
                            for (int i111 = 0; i111 < zzieqVar10.f19793u; i111++) {
                                iM8281c7 += zzidu.m8281c(zzieqVar10.m8352o(i111));
                            }
                            zziduVar.mo8267u(iM8281c7);
                            for (int i112 = 0; i112 < zzieqVar10.f19793u; i112++) {
                                zziduVar.mo8266t(zzieqVar10.m8352o(i112));
                            }
                        } else {
                            zziduVar.mo8251e(i110, 2);
                            int iM8281c8 = 0;
                            for (int i113 = 0; i113 < list24.size(); i113++) {
                                iM8281c8 += zzidu.m8281c(((Integer) list24.get(i113)).intValue());
                            }
                            zziduVar.mo8267u(iM8281c8);
                            for (int i114 = 0; i114 < list24.size(); i114++) {
                                zziduVar.mo8266t(((Integer) list24.get(i114)).intValue());
                            }
                        }
                    }
                    break;
                case 45:
                    i4 = i7;
                    i5 = i8;
                    int i115 = iArr[i6];
                    List list25 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar25 = zzigs.f19881a;
                    if (list25 != null && !list25.isEmpty()) {
                        if (list25 instanceof zzieq) {
                            zzieq zzieqVar11 = (zzieq) list25;
                            zziduVar.mo8251e(i115, 2);
                            int i116 = 0;
                            for (int i117 = 0; i117 < zzieqVar11.f19793u; i117++) {
                                zzieqVar11.m8352o(i117);
                                i116 += 4;
                            }
                            zziduVar.mo8267u(i116);
                            for (int i118 = 0; i118 < zzieqVar11.f19793u; i118++) {
                                zziduVar.mo8268v(zzieqVar11.m8352o(i118));
                            }
                        } else {
                            zziduVar.mo8251e(i115, 2);
                            int i119 = 0;
                            for (int i120 = 0; i120 < list25.size(); i120++) {
                                ((Integer) list25.get(i120)).getClass();
                                i119 += 4;
                            }
                            zziduVar.mo8267u(i119);
                            for (int i121 = 0; i121 < list25.size(); i121++) {
                                zziduVar.mo8268v(((Integer) list25.get(i121)).intValue());
                            }
                        }
                    }
                    break;
                case 46:
                    i4 = i7;
                    i5 = i8;
                    int i122 = iArr[i6];
                    List list26 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar26 = zzigs.f19881a;
                    if (list26 != null && !list26.isEmpty()) {
                        if (list26 instanceof zzifn) {
                            zzifn zzifnVar9 = (zzifn) list26;
                            zziduVar.mo8251e(i122, 2);
                            int i123 = 0;
                            for (int i124 = 0; i124 < zzifnVar9.f19828u; i124++) {
                                zzifnVar9.m8361A(i124);
                                i123 += 8;
                            }
                            zziduVar.mo8267u(i123);
                            for (int i125 = 0; i125 < zzifnVar9.f19828u; i125++) {
                                zziduVar.mo8270x(zzifnVar9.m8361A(i125));
                            }
                        } else {
                            zziduVar.mo8251e(i122, 2);
                            int i126 = 0;
                            for (int i127 = 0; i127 < list26.size(); i127++) {
                                ((Long) list26.get(i127)).getClass();
                                i126 += 8;
                            }
                            zziduVar.mo8267u(i126);
                            for (int i128 = 0; i128 < list26.size(); i128++) {
                                zziduVar.mo8270x(((Long) list26.get(i128)).longValue());
                            }
                        }
                    }
                    break;
                case 47:
                    i4 = i7;
                    i5 = i8;
                    int i129 = iArr[i6];
                    List list27 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar27 = zzigs.f19881a;
                    if (list27 != null && !list27.isEmpty()) {
                        if (list27 instanceof zzieq) {
                            zzieq zzieqVar12 = (zzieq) list27;
                            zziduVar.mo8251e(i129, 2);
                            int iM8280b3 = 0;
                            for (int i130 = 0; i130 < zzieqVar12.f19793u; i130++) {
                                int iM8352o2 = zzieqVar12.m8352o(i130);
                                iM8280b3 += zzidu.m8280b((iM8352o2 >> 31) ^ (iM8352o2 + iM8352o2));
                            }
                            zziduVar.mo8267u(iM8280b3);
                            for (int i131 = 0; i131 < zzieqVar12.f19793u; i131++) {
                                int iM8352o3 = zzieqVar12.m8352o(i131);
                                zziduVar.mo8267u((iM8352o3 >> 31) ^ (iM8352o3 + iM8352o3));
                            }
                        } else {
                            zziduVar.mo8251e(i129, 2);
                            int iM8280b4 = 0;
                            for (int i132 = 0; i132 < list27.size(); i132++) {
                                int iIntValue2 = ((Integer) list27.get(i132)).intValue();
                                iM8280b4 += zzidu.m8280b((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                            }
                            zziduVar.mo8267u(iM8280b4);
                            for (int i133 = 0; i133 < list27.size(); i133++) {
                                int iIntValue3 = ((Integer) list27.get(i133)).intValue();
                                zziduVar.mo8267u((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                            }
                        }
                    }
                    break;
                case 48:
                    i4 = i7;
                    i5 = i8;
                    int i134 = iArr[i6];
                    List list28 = (List) unsafe.getObject(obj, j2);
                    zzihf zzihfVar28 = zzigs.f19881a;
                    if (list28 != null && !list28.isEmpty()) {
                        if (list28 instanceof zzifn) {
                            zzifn zzifnVar10 = (zzifn) list28;
                            zziduVar.mo8251e(i134, 2);
                            int iM8281c9 = 0;
                            for (int i135 = 0; i135 < zzifnVar10.f19828u; i135++) {
                                long jM8361A2 = zzifnVar10.m8361A(i135);
                                iM8281c9 += zzidu.m8281c((jM8361A2 >> 63) ^ (jM8361A2 + jM8361A2));
                            }
                            zziduVar.mo8267u(iM8281c9);
                            for (int i136 = 0; i136 < zzifnVar10.f19828u; i136++) {
                                long jM8361A3 = zzifnVar10.m8361A(i136);
                                zziduVar.mo8269w((jM8361A3 >> 63) ^ (jM8361A3 + jM8361A3));
                            }
                        } else {
                            zziduVar.mo8251e(i134, 2);
                            int iM8281c10 = 0;
                            for (int i137 = 0; i137 < list28.size(); i137++) {
                                long jLongValue2 = ((Long) list28.get(i137)).longValue();
                                iM8281c10 += zzidu.m8281c((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                            }
                            zziduVar.mo8267u(iM8281c10);
                            for (int i138 = 0; i138 < list28.size(); i138++) {
                                long jLongValue3 = ((Long) list28.get(i138)).longValue();
                                zziduVar.mo8269w((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                            }
                        }
                    }
                    break;
                case 49:
                    i4 = i7;
                    i5 = i8;
                    int i139 = iArr[i6];
                    List list29 = (List) unsafe.getObject(obj, j2);
                    zzigr zzigrVarM8384D = zzigcVar.m8384D(i6);
                    zzihf zzihfVar29 = zzigs.f19881a;
                    if (list29 != null && !list29.isEmpty()) {
                        for (int i140 = 0; i140 < list29.size(); i140++) {
                            zzidvVar.m8299q(i139, list29.get(i140), zzigrVarM8384D);
                        }
                    }
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j2);
                    if (object2 != null) {
                        zzifr zzifrVar = ((zzifs) zzigcVar.m8385E(i6)).f19835a;
                        for (Map.Entry entry2 : ((zzift) object2).entrySet()) {
                            zziduVar.mo8251e(i9, i12);
                            zziduVar.mo8267u(zziee.m8308f(zzifrVar.f19832a, i2, entry2.getKey()) + zziee.m8308f(zzifrVar.f19833b, 2, entry2.getValue()));
                            zzifs.m8364a(zziduVar, zzifrVar, entry2.getKey(), entry2.getValue());
                            i7 = i7;
                            i8 = i8;
                            i12 = 2;
                        }
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 51:
                    if (zzigcVar.m8407t(i9, i6, obj)) {
                        zzidvVar.m8287e(i9, ((Double) zzihk.m8477k(j2, obj)).doubleValue());
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 52:
                    if (zzigcVar.m8407t(i9, i6, obj)) {
                        zzidvVar.m8286d(((Float) zzihk.m8477k(j2, obj)).floatValue(), i9);
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 53:
                    if (zzigcVar.m8407t(i9, i6, obj)) {
                        zzidvVar.m8284b(i9, m8378o(j2, obj));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 54:
                    if (zzigcVar.m8407t(i9, i6, obj)) {
                        zzidvVar.m8289g(i9, m8378o(j2, obj));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 55:
                    if (zzigcVar.m8407t(i9, i6, obj)) {
                        zzidvVar.m8290h(i9, m8377n(j2, obj));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 56:
                    if (zzigcVar.m8407t(i9, i6, obj)) {
                        zzidvVar.m8291i(i9, m8378o(j2, obj));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 57:
                    if (zzigcVar.m8407t(i9, i6, obj)) {
                        zzidvVar.m8292j(i9, m8377n(j2, obj));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 58:
                    if (zzigcVar.m8407t(i9, i6, obj)) {
                        zzidvVar.m8293k(i9, ((Boolean) zzihk.m8477k(j2, obj)).booleanValue());
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 59:
                    if (zzigcVar.m8407t(i9, i6, obj)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof String) {
                            zziduVar.mo8258l(i9, (String) object3);
                        } else {
                            zzidvVar.m8294l(i9, (zzidl) object3);
                        }
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 60:
                    if (zzigcVar.m8407t(i9, i6, obj)) {
                        zzidvVar.m8298p(i9, unsafe.getObject(obj, j2), zzigcVar.m8384D(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 61:
                    if (zzigcVar.m8407t(i9, i6, obj)) {
                        zzidvVar.m8294l(i9, (zzidl) unsafe.getObject(obj, j2));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 62:
                    if (zzigcVar.m8407t(i9, i6, obj)) {
                        zzidvVar.m8295m(i9, m8377n(j2, obj));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 63:
                    if (zzigcVar.m8407t(i9, i6, obj)) {
                        zzidvVar.m8288f(i9, m8377n(j2, obj));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 64:
                    if (zzigcVar.m8407t(i9, i6, obj)) {
                        zzidvVar.m8283a(i9, m8377n(j2, obj));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 65:
                    if (zzigcVar.m8407t(i9, i6, obj)) {
                        zzidvVar.m8285c(i9, m8378o(j2, obj));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 66:
                    if (zzigcVar.m8407t(i9, i6, obj)) {
                        zzidvVar.m8296n(i9, m8377n(j2, obj));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 67:
                    if (zzigcVar.m8407t(i9, i6, obj)) {
                        zzidvVar.m8297o(i9, m8378o(j2, obj));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                case 68:
                    if (zzigcVar.m8407t(i9, i6, obj)) {
                        zzidvVar.m8299q(i9, unsafe.getObject(obj, j2), zzigcVar.m8384D(i6));
                    } else {
                        continue;
                    }
                    i6 += 3;
                    zzigcVar = this;
                    break;
                default:
                    continue;
                    i6 += 3;
                    zzigcVar = this;
                    break;
            }
            i7 = i4;
            i8 = i5;
            i6 += 3;
            zzigcVar = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:140:0x021d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x01d1 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzigr
    /* JADX INFO: renamed from: h */
    public final boolean mo8400h(zziep zziepVar, zziep zziepVar2) {
        boolean zM8420c;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f19843a;
            if (i2 < iArr.length) {
                int iM8402j = m8402j(i2);
                int iM8374k = m8374k(iM8402j);
                if (iM8374k <= 50 || iM8374k >= 69) {
                    long j2 = iM8402j & 1048575;
                    switch (iM8374k) {
                        case 0:
                            if (m8403p(zziepVar, zziepVar2, i2)) {
                                zzihj zzihjVar = zzihk.f19905c;
                                if (Double.doubleToLongBits(zzihjVar.mo8464f(j2, zziepVar)) != Double.doubleToLongBits(zzihjVar.mo8464f(j2, zziepVar2))) {
                                }
                            }
                            break;
                        case 1:
                            if (m8403p(zziepVar, zziepVar2, i2)) {
                                zzihj zzihjVar2 = zzihk.f19905c;
                                if (Float.floatToIntBits(zzihjVar2.mo8462d(j2, zziepVar)) != Float.floatToIntBits(zzihjVar2.mo8462d(j2, zziepVar2))) {
                                }
                            }
                            break;
                        case 2:
                            if (!m8403p(zziepVar, zziepVar2, i2) || zzihk.m8475i(j2, zziepVar) != zzihk.m8475i(j2, zziepVar2)) {
                            }
                            break;
                        case 3:
                            if (!m8403p(zziepVar, zziepVar2, i2) || zzihk.m8475i(j2, zziepVar) != zzihk.m8475i(j2, zziepVar2)) {
                            }
                            break;
                        case 4:
                            if (!m8403p(zziepVar, zziepVar2, i2) || zzihk.m8473g(j2, zziepVar) != zzihk.m8473g(j2, zziepVar2)) {
                            }
                            break;
                        case 5:
                            if (!m8403p(zziepVar, zziepVar2, i2) || zzihk.m8475i(j2, zziepVar) != zzihk.m8475i(j2, zziepVar2)) {
                            }
                            break;
                        case 6:
                            if (!m8403p(zziepVar, zziepVar2, i2) || zzihk.m8473g(j2, zziepVar) != zzihk.m8473g(j2, zziepVar2)) {
                            }
                            break;
                        case 7:
                            if (m8403p(zziepVar, zziepVar2, i2)) {
                                zzihj zzihjVar3 = zzihk.f19905c;
                                if (zzihjVar3.mo8460b(j2, zziepVar) != zzihjVar3.mo8460b(j2, zziepVar2)) {
                                }
                            }
                            break;
                        case 8:
                            if (!m8403p(zziepVar, zziepVar2, i2) || !zzigs.m8420c(zzihk.m8477k(j2, zziepVar), zzihk.m8477k(j2, zziepVar2))) {
                            }
                            break;
                        case 9:
                            if (!m8403p(zziepVar, zziepVar2, i2) || !zzigs.m8420c(zzihk.m8477k(j2, zziepVar), zzihk.m8477k(j2, zziepVar2))) {
                            }
                            break;
                        case 10:
                            if (!m8403p(zziepVar, zziepVar2, i2) || !zzigs.m8420c(zzihk.m8477k(j2, zziepVar), zzihk.m8477k(j2, zziepVar2))) {
                            }
                            break;
                        case 11:
                            if (!m8403p(zziepVar, zziepVar2, i2) || zzihk.m8473g(j2, zziepVar) != zzihk.m8473g(j2, zziepVar2)) {
                            }
                            break;
                        case 12:
                            if (!m8403p(zziepVar, zziepVar2, i2) || zzihk.m8473g(j2, zziepVar) != zzihk.m8473g(j2, zziepVar2)) {
                            }
                            break;
                        case 13:
                            if (!m8403p(zziepVar, zziepVar2, i2) || zzihk.m8473g(j2, zziepVar) != zzihk.m8473g(j2, zziepVar2)) {
                            }
                            break;
                        case 14:
                            if (!m8403p(zziepVar, zziepVar2, i2) || zzihk.m8475i(j2, zziepVar) != zzihk.m8475i(j2, zziepVar2)) {
                            }
                            break;
                        case 15:
                            if (!m8403p(zziepVar, zziepVar2, i2) || zzihk.m8473g(j2, zziepVar) != zzihk.m8473g(j2, zziepVar2)) {
                            }
                            break;
                        case 16:
                            if (!m8403p(zziepVar, zziepVar2, i2) || zzihk.m8475i(j2, zziepVar) != zzihk.m8475i(j2, zziepVar2)) {
                            }
                            break;
                        case 17:
                            if (!m8403p(zziepVar, zziepVar2, i2) || !zzigs.m8420c(zzihk.m8477k(j2, zziepVar), zzihk.m8477k(j2, zziepVar2))) {
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
                            zM8420c = zzigs.m8420c(zzihk.m8477k(j2, zziepVar), zzihk.m8477k(j2, zziepVar2));
                            if (zM8420c) {
                            }
                            break;
                        case 50:
                            zM8420c = zzigs.m8420c(zzihk.m8477k(j2, zziepVar), zzihk.m8477k(j2, zziepVar2));
                            if (zM8420c) {
                            }
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
                            if (zzihk.m8473g(j3, zziepVar) == zzihk.m8473g(j3, zziepVar2) && zzigs.m8420c(zzihk.m8477k(j2, zziepVar), zzihk.m8477k(j2, zziepVar2))) {
                            }
                            break;
                        default:
                            continue;
                    }
                }
                i2 += 3;
            } else {
                int i3 = this.f19852j;
                while (true) {
                    int[] iArr2 = this.f19850h;
                    if (i3 < iArr2.length) {
                        int i4 = iArr2[i3];
                        long j4 = iArr[i4 + 2] & 1048575;
                        if (zzihk.m8473g(j4, zziepVar) == zzihk.m8473g(j4, zziepVar2)) {
                            if (!m8407t(0, i4, zziepVar)) {
                                long jM8402j = m8402j(i4) & 1048575;
                                if (!zzigs.m8420c(zzihk.m8477k(jM8402j, zziepVar), zzihk.m8477k(jM8402j, zziepVar2))) {
                                }
                            }
                            i3++;
                        }
                    } else if (zziepVar.zzt.equals(zziepVar2.zzt)) {
                        if (this.f19848f) {
                            return ((zziel) zziepVar).zza.equals(((zziel) zziepVar2).zza);
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0403 A[PHI: r17
  0x0403: PHI (r17v21 int) = (r17v3 int), (r17v4 int), (r17v10 int), (r17v12 int), (r17v13 int), (r17v14 int), (r17v18 int), (r17v22 int) binds: [B:203:0x05b1, B:199:0x0593, B:173:0x04f5, B:160:0x0492, B:156:0x0476, B:152:0x045a, B:145:0x0422, B:139:0x0401] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:193:0x055c A[PHI: r17
  0x055c: PHI (r17v8 int) = (r17v2 int), (r17v9 int) binds: [B:207:0x05cf, B:192:0x055a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzigr
    /* JADX INFO: renamed from: i */
    public final int mo8401i(zziep zziepVar) {
        int i2;
        int iM8280b;
        int iM8281c;
        int i3;
        int iMo8101k;
        int iM8419b;
        int iM8280b2;
        int size;
        int iM8427j;
        int iM8280b3;
        int iM8280b4;
        int iM8280b5;
        int iMo8101k2;
        int iM8280b6;
        int iM8281c2;
        zzigc<T> zzigcVar = this;
        zziep zziepVar2 = zziepVar;
        Unsafe unsafe = f19842n;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iM3769a = 0;
        while (true) {
            int[] iArr = zzigcVar.f19843a;
            if (i6 >= iArr.length) {
                int iM8456c = zziepVar2.zzt.m8456c() + iM3769a;
                if (!zzigcVar.f19848f) {
                    return iM8456c;
                }
                zzigt zzigtVar = ((zziel) zziepVar2).zza.f19767a;
                int i8 = zzigtVar.f19891t;
                int iM8309g = 0;
                for (int i9 = 0; i9 < i8; i9++) {
                    Map.Entry entryM8435b = zzigtVar.m8435b(i9);
                    iM8309g += zziee.m8309g((zzied) ((zzigu) entryM8435b).f19882s, ((zzigu) entryM8435b).f19883t);
                }
                for (Map.Entry entry : zzigtVar.m8436c()) {
                    iM8309g += zziee.m8309g((zzied) entry.getKey(), entry.getValue());
                }
                return iM8456c + iM8309g;
            }
            int iM8402j = zzigcVar.m8402j(i6);
            int iM8374k = m8374k(iM8402j);
            int i10 = iArr[i6];
            int i11 = iArr[i6 + 2];
            int i12 = i11 & i4;
            if (iM8374k <= 17) {
                if (i12 != i5) {
                    i7 = i12 == i4 ? 0 : unsafe.getInt(zziepVar2, i12);
                    i5 = i12;
                }
                i2 = 1 << (i11 >>> 20);
            } else {
                i2 = 0;
            }
            int i13 = iM8402j & i4;
            if (iM8374k >= zzief.f19770t.f19774s) {
                zzief.f19771u.getClass();
            }
            long j2 = i13;
            switch (iM8374k) {
                case 0:
                    if (zzigcVar.m8404q(zziepVar2, i6, i5, i7, i2)) {
                        iM3769a = AbstractC5152f.m3769a(i10 << 3, 8, iM3769a);
                    }
                    break;
                case 1:
                    if (zzigcVar.m8404q(zziepVar2, i6, i5, i7, i2)) {
                        iM3769a = AbstractC5152f.m3769a(i10 << 3, 4, iM3769a);
                    }
                    zzigcVar = this;
                    zziepVar2 = zziepVar;
                    break;
                case 2:
                    if (zzigcVar.m8404q(zziepVar2, i6, i5, i7, i2)) {
                        long j3 = unsafe.getLong(zziepVar2, j2);
                        iM8280b = zzidu.m8280b(i10 << 3);
                        iM8281c = zzidu.m8281c(j3);
                        iM3769a += iM8281c + iM8280b;
                    }
                    zzigcVar = this;
                    break;
                case 3:
                    if (zzigcVar.m8404q(zziepVar2, i6, i5, i7, i2)) {
                        long j4 = unsafe.getLong(zziepVar2, j2);
                        iM8280b = zzidu.m8280b(i10 << 3);
                        iM8281c = zzidu.m8281c(j4);
                        iM3769a += iM8281c + iM8280b;
                    }
                    zzigcVar = this;
                    break;
                case 4:
                    if (zzigcVar.m8404q(zziepVar2, i6, i5, i7, i2)) {
                        long j5 = unsafe.getInt(zziepVar2, j2);
                        iM8280b = zzidu.m8280b(i10 << 3);
                        iM8281c = zzidu.m8281c(j5);
                        iM3769a += iM8281c + iM8280b;
                    }
                    zzigcVar = this;
                    break;
                case 5:
                    if (zzigcVar.m8404q(zziepVar2, i6, i5, i7, i2)) {
                        iM3769a = AbstractC5152f.m3769a(i10 << 3, 8, iM3769a);
                    }
                    zzigcVar = this;
                    zziepVar2 = zziepVar;
                    break;
                case 6:
                    if (zzigcVar.m8404q(zziepVar2, i6, i5, i7, i2)) {
                        iM3769a = AbstractC5152f.m3769a(i10 << 3, 4, iM3769a);
                    }
                    zzigcVar = this;
                    zziepVar2 = zziepVar;
                    break;
                case 7:
                    if (zzigcVar.m8404q(zziepVar2, i6, i5, i7, i2)) {
                        iM3769a = AbstractC5152f.m3769a(i10 << 3, 1, iM3769a);
                    }
                    zzigcVar = this;
                    zziepVar2 = zziepVar;
                    break;
                case 8:
                    if (zzigcVar.m8404q(zziepVar2, i6, i5, i7, i2)) {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(zziepVar2, j2);
                        if (object instanceof zzidl) {
                            int iM8280b7 = zzidu.m8280b(i14);
                            int iMo8132h = ((zzidl) object).mo8132h();
                            iM3769a = AbstractC5152f.m3777i(iMo8132h, iMo8132h, iM8280b7, iM3769a);
                        } else {
                            int iM8280b8 = zzidu.m8280b(i14);
                            int iM8487b = zzihp.m8487b((String) object);
                            iM3769a = AbstractC5152f.m3777i(iM8487b, iM8487b, iM8280b8, iM3769a);
                        }
                    }
                    zzigcVar = this;
                    break;
                case 9:
                    if (zzigcVar.m8404q(zziepVar2, i6, i5, i7, i2)) {
                        Object object2 = unsafe.getObject(zziepVar2, j2);
                        zzigr zzigrVarM8384D = zzigcVar.m8384D(i6);
                        zzihf zzihfVar = zzigs.f19881a;
                        int iM8280b9 = zzidu.m8280b(i10 << 3);
                        int iMo8101k3 = ((zzicu) object2).mo8101k(zzigrVarM8384D);
                        iM3769a = AbstractC5152f.m3777i(iMo8101k3, iMo8101k3, iM8280b9, iM3769a);
                    }
                    break;
                case 10:
                    if (zzigcVar.m8404q(zziepVar2, i6, i5, i7, i2)) {
                        zzidl zzidlVar = (zzidl) unsafe.getObject(zziepVar2, j2);
                        int iM8280b10 = zzidu.m8280b(i10 << 3);
                        int iMo8132h2 = zzidlVar.mo8132h();
                        iM3769a = AbstractC5152f.m3777i(iMo8132h2, iMo8132h2, iM8280b10, iM3769a);
                    }
                    zzigcVar = this;
                    break;
                case 11:
                    if (zzigcVar.m8404q(zziepVar2, i6, i5, i7, i2)) {
                        iM3769a = AbstractC5152f.m3769a(unsafe.getInt(zziepVar2, j2), zzidu.m8280b(i10 << 3), iM3769a);
                    }
                    zzigcVar = this;
                    break;
                case 12:
                    if (zzigcVar.m8404q(zziepVar2, i6, i5, i7, i2)) {
                        long j6 = unsafe.getInt(zziepVar2, j2);
                        iM8280b = zzidu.m8280b(i10 << 3);
                        iM8281c = zzidu.m8281c(j6);
                        iM3769a += iM8281c + iM8280b;
                    }
                    zzigcVar = this;
                    break;
                case 13:
                    if (zzigcVar.m8404q(zziepVar2, i6, i5, i7, i2)) {
                        iM3769a = AbstractC5152f.m3769a(i10 << 3, 4, iM3769a);
                    }
                    zzigcVar = this;
                    zziepVar2 = zziepVar;
                    break;
                case 14:
                    if (zzigcVar.m8404q(zziepVar2, i6, i5, i7, i2)) {
                        iM3769a = AbstractC5152f.m3769a(i10 << 3, 8, iM3769a);
                    }
                    zzigcVar = this;
                    zziepVar2 = zziepVar;
                    break;
                case 15:
                    if (zzigcVar.m8404q(zziepVar2, i6, i5, i7, i2)) {
                        int i15 = unsafe.getInt(zziepVar2, j2);
                        iM3769a = AbstractC5152f.m3769a((i15 >> 31) ^ (i15 + i15), zzidu.m8280b(i10 << 3), iM3769a);
                    }
                    zzigcVar = this;
                    break;
                case 16:
                    if (zzigcVar.m8404q(zziepVar2, i6, i5, i7, i2)) {
                        long j7 = unsafe.getLong(zziepVar2, j2);
                        iM8280b = zzidu.m8280b(i10 << 3);
                        iM8281c = zzidu.m8281c((j7 >> 63) ^ (j7 + j7));
                        iM3769a += iM8281c + iM8280b;
                    }
                    zzigcVar = this;
                    break;
                case 17:
                    if (zzigcVar.m8404q(zziepVar2, i6, i5, i7, i2)) {
                        zzifz zzifzVar = (zzifz) unsafe.getObject(zziepVar2, j2);
                        zzigr zzigrVarM8384D2 = zzigcVar.m8384D(i6);
                        zzihf zzihfVar2 = zzigs.f19881a;
                        int iM8280b11 = zzidu.m8280b(i10 << 3);
                        i3 = iM8280b11 + iM8280b11;
                        iMo8101k = ((zzicu) zzifzVar).mo8101k(zzigrVarM8384D2);
                        iM3769a += iMo8101k + i3;
                    }
                    break;
                case 18:
                    iM8419b = zzigs.m8419b(i10, (List) unsafe.getObject(zziepVar2, j2));
                    iM3769a += iM8419b;
                    i5 = i5;
                    break;
                case 19:
                    iM8419b = zzigs.m8418a(i10, (List) unsafe.getObject(zziepVar2, j2));
                    iM3769a += iM8419b;
                    i5 = i5;
                    break;
                case 20:
                    i5 = i5;
                    List list = (List) unsafe.getObject(zziepVar2, j2);
                    zzihf zzihfVar3 = zzigs.f19881a;
                    if (list.size() == 0) {
                        iM8280b2 = 0;
                    } else {
                        iM8280b2 = (zzidu.m8280b(i10 << 3) * list.size()) + zzigs.m8426i(list);
                    }
                    iM3769a += iM8280b2;
                    i5 = i5;
                    break;
                case 21:
                    i5 = i5;
                    List list2 = (List) unsafe.getObject(zziepVar2, j2);
                    zzihf zzihfVar4 = zzigs.f19881a;
                    size = list2.size();
                    if (size == 0) {
                        iM8280b4 = 0;
                    } else {
                        iM8427j = zzigs.m8427j(list2);
                        iM8280b3 = zzidu.m8280b(i10 << 3);
                        iM8280b4 = (iM8280b3 * size) + iM8427j;
                    }
                    iM3769a += iM8280b4;
                    i5 = i5;
                    break;
                case 22:
                    i5 = i5;
                    List list3 = (List) unsafe.getObject(zziepVar2, j2);
                    zzihf zzihfVar5 = zzigs.f19881a;
                    size = list3.size();
                    if (size == 0) {
                        iM8280b4 = 0;
                    } else {
                        iM8427j = zzigs.m8430m(list3);
                        iM8280b3 = zzidu.m8280b(i10 << 3);
                        iM8280b4 = (iM8280b3 * size) + iM8427j;
                    }
                    iM3769a += iM8280b4;
                    i5 = i5;
                    break;
                case 23:
                    iM8419b = zzigs.m8419b(i10, (List) unsafe.getObject(zziepVar2, j2));
                    iM3769a += iM8419b;
                    i5 = i5;
                    break;
                case 24:
                    iM8419b = zzigs.m8418a(i10, (List) unsafe.getObject(zziepVar2, j2));
                    iM3769a += iM8419b;
                    i5 = i5;
                    break;
                case 25:
                    i5 = i5;
                    List list4 = (List) unsafe.getObject(zziepVar2, j2);
                    zzihf zzihfVar6 = zzigs.f19881a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iM8280b2 = 0;
                    } else {
                        iM8280b2 = (zzidu.m8280b(i10 << 3) + 1) * size2;
                    }
                    iM3769a += iM8280b2;
                    i5 = i5;
                    break;
                case 26:
                    i5 = i5;
                    List list5 = (List) unsafe.getObject(zziepVar2, j2);
                    zzihf zzihfVar7 = zzigs.f19881a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iM8280b4 = 0;
                    } else {
                        iM8280b4 = zzidu.m8280b(i10 << 3) * size3;
                        if (list5 instanceof zzifk) {
                            zzifk zzifkVar = (zzifk) list5;
                            for (int i16 = 0; i16 < size3; i16++) {
                                Object objZzc = zzifkVar.zzc();
                                if (objZzc instanceof zzidl) {
                                    int iMo8132h3 = ((zzidl) objZzc).mo8132h();
                                    iM8280b4 = AbstractC5152f.m3769a(iMo8132h3, iMo8132h3, iM8280b4);
                                } else {
                                    int iM8487b2 = zzihp.m8487b((String) objZzc);
                                    iM8280b4 = AbstractC5152f.m3769a(iM8487b2, iM8487b2, iM8280b4);
                                }
                            }
                        } else {
                            for (int i17 = 0; i17 < size3; i17++) {
                                Object obj = list5.get(i17);
                                if (obj instanceof zzidl) {
                                    int iMo8132h4 = ((zzidl) obj).mo8132h();
                                    iM8280b4 = AbstractC5152f.m3769a(iMo8132h4, iMo8132h4, iM8280b4);
                                } else {
                                    int iM8487b3 = zzihp.m8487b((String) obj);
                                    iM8280b4 = AbstractC5152f.m3769a(iM8487b3, iM8487b3, iM8280b4);
                                }
                            }
                        }
                    }
                    iM3769a += iM8280b4;
                    i5 = i5;
                    break;
                case 27:
                    i5 = i5;
                    List list6 = (List) unsafe.getObject(zziepVar2, j2);
                    zzigr zzigrVarM8384D3 = zzigcVar.m8384D(i6);
                    zzihf zzihfVar8 = zzigs.f19881a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iM8280b5 = 0;
                    } else {
                        iM8280b5 = zzidu.m8280b(i10 << 3) * size4;
                        for (int i18 = 0; i18 < size4; i18++) {
                            int iMo8101k4 = ((zzicu) list6.get(i18)).mo8101k(zzigrVarM8384D3);
                            iM8280b5 = AbstractC5152f.m3769a(iMo8101k4, iMo8101k4, iM8280b5);
                        }
                    }
                    iM3769a += iM8280b5;
                    i5 = i5;
                    break;
                case 28:
                    i5 = i5;
                    List list7 = (List) unsafe.getObject(zziepVar2, j2);
                    zzihf zzihfVar9 = zzigs.f19881a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iM8280b4 = 0;
                    } else {
                        iM8280b4 = zzidu.m8280b(i10 << 3) * size5;
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            int iMo8132h5 = ((zzidl) list7.get(i19)).mo8132h();
                            iM8280b4 = AbstractC5152f.m3769a(iMo8132h5, iMo8132h5, iM8280b4);
                        }
                    }
                    iM3769a += iM8280b4;
                    i5 = i5;
                    break;
                case 29:
                    i5 = i5;
                    List list8 = (List) unsafe.getObject(zziepVar2, j2);
                    zzihf zzihfVar10 = zzigs.f19881a;
                    size = list8.size();
                    if (size == 0) {
                        iM8280b4 = 0;
                    } else {
                        iM8427j = zzigs.m8431n(list8);
                        iM8280b3 = zzidu.m8280b(i10 << 3);
                        iM8280b4 = (iM8280b3 * size) + iM8427j;
                    }
                    iM3769a += iM8280b4;
                    i5 = i5;
                    break;
                case 30:
                    i5 = i5;
                    List list9 = (List) unsafe.getObject(zziepVar2, j2);
                    zzihf zzihfVar11 = zzigs.f19881a;
                    size = list9.size();
                    if (size == 0) {
                        iM8280b4 = 0;
                    } else {
                        iM8427j = zzigs.m8429l(list9);
                        iM8280b3 = zzidu.m8280b(i10 << 3);
                        iM8280b4 = (iM8280b3 * size) + iM8427j;
                    }
                    iM3769a += iM8280b4;
                    i5 = i5;
                    break;
                case 31:
                    iM8419b = zzigs.m8418a(i10, (List) unsafe.getObject(zziepVar2, j2));
                    iM3769a += iM8419b;
                    i5 = i5;
                    break;
                case 32:
                    iM8419b = zzigs.m8419b(i10, (List) unsafe.getObject(zziepVar2, j2));
                    iM3769a += iM8419b;
                    i5 = i5;
                    break;
                case 33:
                    i5 = i5;
                    List list10 = (List) unsafe.getObject(zziepVar2, j2);
                    zzihf zzihfVar12 = zzigs.f19881a;
                    size = list10.size();
                    if (size == 0) {
                        iM8280b4 = 0;
                    } else {
                        iM8427j = zzigs.m8432o(list10);
                        iM8280b3 = zzidu.m8280b(i10 << 3);
                        iM8280b4 = (iM8280b3 * size) + iM8427j;
                    }
                    iM3769a += iM8280b4;
                    i5 = i5;
                    break;
                case 34:
                    i5 = i5;
                    List list11 = (List) unsafe.getObject(zziepVar2, j2);
                    zzihf zzihfVar13 = zzigs.f19881a;
                    size = list11.size();
                    if (size == 0) {
                        iM8280b4 = 0;
                    } else {
                        iM8427j = zzigs.m8428k(list11);
                        iM8280b3 = zzidu.m8280b(i10 << 3);
                        iM8280b4 = (iM8280b3 * size) + iM8427j;
                    }
                    iM3769a += iM8280b4;
                    i5 = i5;
                    break;
                case 35:
                    i5 = i5;
                    List list12 = (List) unsafe.getObject(zziepVar2, j2);
                    zzihf zzihfVar14 = zzigs.f19881a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        iM3769a = AbstractC5152f.m3777i(size6, zzidu.m8280b(i10 << 3), size6, iM3769a);
                    }
                    i5 = i5;
                    break;
                case 36:
                    i5 = i5;
                    List list13 = (List) unsafe.getObject(zziepVar2, j2);
                    zzihf zzihfVar15 = zzigs.f19881a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        iM3769a = AbstractC5152f.m3777i(size7, zzidu.m8280b(i10 << 3), size7, iM3769a);
                    }
                    i5 = i5;
                    break;
                case 37:
                    i5 = i5;
                    int iM8426i = zzigs.m8426i((List) unsafe.getObject(zziepVar2, j2));
                    if (iM8426i > 0) {
                        iM3769a = AbstractC5152f.m3777i(iM8426i, zzidu.m8280b(i10 << 3), iM8426i, iM3769a);
                    }
                    i5 = i5;
                    break;
                case 38:
                    i5 = i5;
                    int iM8427j2 = zzigs.m8427j((List) unsafe.getObject(zziepVar2, j2));
                    if (iM8427j2 > 0) {
                        iM3769a = AbstractC5152f.m3777i(iM8427j2, zzidu.m8280b(i10 << 3), iM8427j2, iM3769a);
                    }
                    i5 = i5;
                    break;
                case 39:
                    i5 = i5;
                    int iM8430m = zzigs.m8430m((List) unsafe.getObject(zziepVar2, j2));
                    if (iM8430m > 0) {
                        iM3769a = AbstractC5152f.m3777i(iM8430m, zzidu.m8280b(i10 << 3), iM8430m, iM3769a);
                    }
                    i5 = i5;
                    break;
                case 40:
                    i5 = i5;
                    List list14 = (List) unsafe.getObject(zziepVar2, j2);
                    zzihf zzihfVar16 = zzigs.f19881a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        iM3769a = AbstractC5152f.m3777i(size8, zzidu.m8280b(i10 << 3), size8, iM3769a);
                    }
                    i5 = i5;
                    break;
                case 41:
                    i5 = i5;
                    List list15 = (List) unsafe.getObject(zziepVar2, j2);
                    zzihf zzihfVar17 = zzigs.f19881a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        iM3769a = AbstractC5152f.m3777i(size9, zzidu.m8280b(i10 << 3), size9, iM3769a);
                    }
                    i5 = i5;
                    break;
                case 42:
                    i5 = i5;
                    List list16 = (List) unsafe.getObject(zziepVar2, j2);
                    zzihf zzihfVar18 = zzigs.f19881a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        iM3769a = AbstractC5152f.m3777i(size10, zzidu.m8280b(i10 << 3), size10, iM3769a);
                    }
                    i5 = i5;
                    break;
                case 43:
                    i5 = i5;
                    int iM8431n = zzigs.m8431n((List) unsafe.getObject(zziepVar2, j2));
                    if (iM8431n > 0) {
                        iM3769a = AbstractC5152f.m3777i(iM8431n, zzidu.m8280b(i10 << 3), iM8431n, iM3769a);
                    }
                    i5 = i5;
                    break;
                case 44:
                    i5 = i5;
                    int iM8429l = zzigs.m8429l((List) unsafe.getObject(zziepVar2, j2));
                    if (iM8429l > 0) {
                        iM3769a = AbstractC5152f.m3777i(iM8429l, zzidu.m8280b(i10 << 3), iM8429l, iM3769a);
                    }
                    i5 = i5;
                    break;
                case 45:
                    i5 = i5;
                    List list17 = (List) unsafe.getObject(zziepVar2, j2);
                    zzihf zzihfVar19 = zzigs.f19881a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        iM3769a = AbstractC5152f.m3777i(size11, zzidu.m8280b(i10 << 3), size11, iM3769a);
                    }
                    i5 = i5;
                    break;
                case 46:
                    i5 = i5;
                    List list18 = (List) unsafe.getObject(zziepVar2, j2);
                    zzihf zzihfVar20 = zzigs.f19881a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        iM3769a = AbstractC5152f.m3777i(size12, zzidu.m8280b(i10 << 3), size12, iM3769a);
                    }
                    i5 = i5;
                    break;
                case 47:
                    i5 = i5;
                    int iM8432o = zzigs.m8432o((List) unsafe.getObject(zziepVar2, j2));
                    if (iM8432o > 0) {
                        iM3769a = AbstractC5152f.m3777i(iM8432o, zzidu.m8280b(i10 << 3), iM8432o, iM3769a);
                    }
                    i5 = i5;
                    break;
                case 48:
                    i5 = i5;
                    int iM8428k = zzigs.m8428k((List) unsafe.getObject(zziepVar2, j2));
                    if (iM8428k > 0) {
                        iM3769a = AbstractC5152f.m3777i(iM8428k, zzidu.m8280b(i10 << 3), iM8428k, iM3769a);
                    }
                    i5 = i5;
                    break;
                case 49:
                    i5 = i5;
                    List list19 = (List) unsafe.getObject(zziepVar2, j2);
                    zzigr zzigrVarM8384D4 = zzigcVar.m8384D(i6);
                    zzihf zzihfVar21 = zzigs.f19881a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        iMo8101k2 = 0;
                    } else {
                        iMo8101k2 = 0;
                        for (int i20 = 0; i20 < size13; i20++) {
                            zzifz zzifzVar2 = (zzifz) list19.get(i20);
                            int iM8280b12 = zzidu.m8280b(i10 << 3);
                            iMo8101k2 += ((zzicu) zzifzVar2).mo8101k(zzigrVarM8384D4) + iM8280b12 + iM8280b12;
                        }
                    }
                    iM3769a += iMo8101k2;
                    i5 = i5;
                    break;
                case 50:
                    zzift zziftVar = (zzift) unsafe.getObject(zziepVar2, j2);
                    zzifs zzifsVar = (zzifs) zzigcVar.m8385E(i6);
                    if (zziftVar.isEmpty()) {
                        iM8280b5 = 0;
                    } else {
                        iM8280b5 = 0;
                        for (Map.Entry entry2 : zziftVar.entrySet()) {
                            Object key = entry2.getKey();
                            Object value = entry2.getValue();
                            zzifr zzifrVar = zzifsVar.f19835a;
                            int iM8280b13 = zzidu.m8280b(i10 << 3);
                            int i21 = i5;
                            int iM8308f = zziee.m8308f(zzifrVar.f19832a, 1, key) + zziee.m8308f(zzifrVar.f19833b, 2, value);
                            iM8280b5 = AbstractC5152f.m3777i(iM8308f, iM8308f, iM8280b13, iM8280b5);
                            i5 = i21;
                        }
                    }
                    i5 = i5;
                    iM3769a += iM8280b5;
                    i5 = i5;
                    break;
                case 51:
                    if (zzigcVar.m8407t(i10, i6, zziepVar2)) {
                        iM3769a = AbstractC5152f.m3769a(i10 << 3, 8, iM3769a);
                    }
                    break;
                case 52:
                    if (zzigcVar.m8407t(i10, i6, zziepVar2)) {
                        iM3769a = AbstractC5152f.m3769a(i10 << 3, 4, iM3769a);
                    }
                    break;
                case 53:
                    if (zzigcVar.m8407t(i10, i6, zziepVar2)) {
                        long jM8378o = m8378o(j2, zziepVar2);
                        iM8280b6 = zzidu.m8280b(i10 << 3);
                        iM8281c2 = zzidu.m8281c(jM8378o);
                        iM3769a += iM8281c2 + iM8280b6;
                    }
                    break;
                case 54:
                    if (zzigcVar.m8407t(i10, i6, zziepVar2)) {
                        long jM8378o2 = m8378o(j2, zziepVar2);
                        iM8280b6 = zzidu.m8280b(i10 << 3);
                        iM8281c2 = zzidu.m8281c(jM8378o2);
                        iM3769a += iM8281c2 + iM8280b6;
                    }
                    break;
                case 55:
                    if (zzigcVar.m8407t(i10, i6, zziepVar2)) {
                        long jM8377n = m8377n(j2, zziepVar2);
                        iM8280b6 = zzidu.m8280b(i10 << 3);
                        iM8281c2 = zzidu.m8281c(jM8377n);
                        iM3769a += iM8281c2 + iM8280b6;
                    }
                    break;
                case 56:
                    if (zzigcVar.m8407t(i10, i6, zziepVar2)) {
                        iM3769a = AbstractC5152f.m3769a(i10 << 3, 8, iM3769a);
                    }
                    break;
                case 57:
                    if (zzigcVar.m8407t(i10, i6, zziepVar2)) {
                        iM3769a = AbstractC5152f.m3769a(i10 << 3, 4, iM3769a);
                    }
                    break;
                case 58:
                    if (zzigcVar.m8407t(i10, i6, zziepVar2)) {
                        iM3769a = AbstractC5152f.m3769a(i10 << 3, 1, iM3769a);
                    }
                    break;
                case 59:
                    if (zzigcVar.m8407t(i10, i6, zziepVar2)) {
                        int i22 = i10 << 3;
                        Object object3 = unsafe.getObject(zziepVar2, j2);
                        if (object3 instanceof zzidl) {
                            int iM8280b14 = zzidu.m8280b(i22);
                            int iMo8132h6 = ((zzidl) object3).mo8132h();
                            iM3769a = AbstractC5152f.m3777i(iMo8132h6, iMo8132h6, iM8280b14, iM3769a);
                        } else {
                            int iM8280b15 = zzidu.m8280b(i22);
                            int iM8487b4 = zzihp.m8487b((String) object3);
                            iM3769a = AbstractC5152f.m3777i(iM8487b4, iM8487b4, iM8280b15, iM3769a);
                        }
                    }
                    break;
                case 60:
                    if (zzigcVar.m8407t(i10, i6, zziepVar2)) {
                        Object object4 = unsafe.getObject(zziepVar2, j2);
                        zzigr zzigrVarM8384D5 = zzigcVar.m8384D(i6);
                        zzihf zzihfVar22 = zzigs.f19881a;
                        int iM8280b16 = zzidu.m8280b(i10 << 3);
                        int iMo8101k5 = ((zzicu) object4).mo8101k(zzigrVarM8384D5);
                        iM3769a = AbstractC5152f.m3777i(iMo8101k5, iMo8101k5, iM8280b16, iM3769a);
                    }
                    break;
                case 61:
                    if (zzigcVar.m8407t(i10, i6, zziepVar2)) {
                        zzidl zzidlVar2 = (zzidl) unsafe.getObject(zziepVar2, j2);
                        int iM8280b17 = zzidu.m8280b(i10 << 3);
                        int iMo8132h7 = zzidlVar2.mo8132h();
                        iM3769a = AbstractC5152f.m3777i(iMo8132h7, iMo8132h7, iM8280b17, iM3769a);
                    }
                    break;
                case 62:
                    if (zzigcVar.m8407t(i10, i6, zziepVar2)) {
                        iM3769a = AbstractC5152f.m3769a(m8377n(j2, zziepVar2), zzidu.m8280b(i10 << 3), iM3769a);
                    }
                    break;
                case 63:
                    if (zzigcVar.m8407t(i10, i6, zziepVar2)) {
                        long jM8377n2 = m8377n(j2, zziepVar2);
                        iM8280b6 = zzidu.m8280b(i10 << 3);
                        iM8281c2 = zzidu.m8281c(jM8377n2);
                        iM3769a += iM8281c2 + iM8280b6;
                    }
                    break;
                case 64:
                    if (zzigcVar.m8407t(i10, i6, zziepVar2)) {
                        iM3769a = AbstractC5152f.m3769a(i10 << 3, 4, iM3769a);
                    }
                    break;
                case 65:
                    if (zzigcVar.m8407t(i10, i6, zziepVar2)) {
                        iM3769a = AbstractC5152f.m3769a(i10 << 3, 8, iM3769a);
                    }
                    break;
                case 66:
                    if (zzigcVar.m8407t(i10, i6, zziepVar2)) {
                        int iM8377n = m8377n(j2, zziepVar2);
                        iM3769a = AbstractC5152f.m3769a((iM8377n >> 31) ^ (iM8377n + iM8377n), zzidu.m8280b(i10 << 3), iM3769a);
                    }
                    break;
                case 67:
                    if (zzigcVar.m8407t(i10, i6, zziepVar2)) {
                        long jM8378o3 = m8378o(j2, zziepVar2);
                        iM8280b6 = zzidu.m8280b(i10 << 3);
                        iM8281c2 = zzidu.m8281c((jM8378o3 >> 63) ^ (jM8378o3 + jM8378o3));
                        iM3769a += iM8281c2 + iM8280b6;
                    }
                    break;
                case 68:
                    if (zzigcVar.m8407t(i10, i6, zziepVar2)) {
                        zzifz zzifzVar3 = (zzifz) unsafe.getObject(zziepVar2, j2);
                        zzigr zzigrVarM8384D6 = zzigcVar.m8384D(i6);
                        zzihf zzihfVar23 = zzigs.f19881a;
                        int iM8280b18 = zzidu.m8280b(i10 << 3);
                        i3 = iM8280b18 + iM8280b18;
                        iMo8101k = ((zzicu) zzifzVar3).mo8101k(zzigrVarM8384D6);
                        iM3769a += iMo8101k + i3;
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m8402j(int i2) {
        return this.f19843a[i2 + 1];
    }

    /* JADX INFO: renamed from: p */
    public final boolean m8403p(zziep zziepVar, zziep zziepVar2, int i2) {
        return m8405r(i2, zziepVar) == m8405r(i2, zziepVar2);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m8404q(Object obj, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return m8405r(i2, obj);
        }
        return (i4 & i5) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m8405r(int i2, Object obj) {
        int i3 = this.f19843a[i2 + 2];
        long j2 = i3 & 1048575;
        if (j2 == 1048575) {
            int iM8402j = m8402j(i2);
            long j3 = iM8402j & 1048575;
            switch (m8374k(iM8402j)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzihk.f19905c.mo8464f(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(zzihk.f19905c.mo8462d(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (zzihk.m8475i(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (zzihk.m8475i(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (zzihk.m8473g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (zzihk.m8475i(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (zzihk.m8473g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return zzihk.f19905c.mo8460b(j3, obj);
                case 8:
                    Object objM8477k = zzihk.m8477k(j3, obj);
                    if (objM8477k instanceof String) {
                        if (((String) objM8477k).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objM8477k instanceof zzidl)) {
                            throw new IllegalArgumentException();
                        }
                        if (zzidl.f19719t.equals(objM8477k)) {
                            return false;
                        }
                    }
                case 9:
                    if (zzihk.m8477k(j3, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (zzidl.f19719t.equals(zzihk.m8477k(j3, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (zzihk.m8473g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (zzihk.m8473g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (zzihk.m8473g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (zzihk.m8475i(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (zzihk.m8473g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (zzihk.m8475i(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (zzihk.m8477k(j3, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i3 >>> 20)) & zzihk.m8473g(j2, obj)) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final void m8406s(int i2, Object obj) {
        int i3 = this.f19843a[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 == 1048575) {
            return;
        }
        zzihk.m8474h(obj, (1 << (i3 >>> 20)) | zzihk.m8473g(j2, obj), j2);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m8407t(int i2, int i3, Object obj) {
        return zzihk.m8473g((long) (this.f19843a[i3 + 2] & 1048575), obj) == i2;
    }

    /* JADX INFO: renamed from: u */
    public final void m8408u(int i2, int i3, Object obj) {
        zzihk.m8474h(obj, i2, this.f19843a[i3 + 2] & 1048575);
    }

    /* JADX INFO: renamed from: v */
    public final int m8409v(int i2, int i3) {
        int[] iArr = this.f19843a;
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

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 42281. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: y */
    public final int m8410y(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, com.google.android.gms.internal.ads.zzicz r43) {
        /*
            Method dump skipped, instruction units count: 4228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzigc.m8410y(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzicz):int");
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    public final Object zza() {
        return ((zziep) this.f19847e).m8345u();
    }
}
