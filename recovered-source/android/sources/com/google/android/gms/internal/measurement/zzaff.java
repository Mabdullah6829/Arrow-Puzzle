package com.google.android.gms.internal.measurement;

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
final class zzaff<T> implements zzafp<T> {

    /* JADX INFO: renamed from: m */
    public static final int[] f22074m = new int[0];

    /* JADX INFO: renamed from: n */
    public static final Unsafe f22075n = zzagg.m9709l();

    /* JADX INFO: renamed from: a */
    public final int[] f22076a;

    /* JADX INFO: renamed from: b */
    public final Object[] f22077b;

    /* JADX INFO: renamed from: c */
    public final int f22078c;

    /* JADX INFO: renamed from: d */
    public final int f22079d;

    /* JADX INFO: renamed from: e */
    public final zzafc f22080e;

    /* JADX INFO: renamed from: f */
    public final boolean f22081f;

    /* JADX INFO: renamed from: g */
    public final boolean f22082g;

    /* JADX INFO: renamed from: h */
    public final int[] f22083h;

    /* JADX INFO: renamed from: i */
    public final int f22084i;

    /* JADX INFO: renamed from: j */
    public final int f22085j;

    /* JADX INFO: renamed from: k */
    public final zzafz f22086k;

    /* JADX INFO: renamed from: l */
    public final zzadg f22087l;

    public zzaff(int[] iArr, Object[] objArr, int i2, int i3, zzafc zzafcVar, int[] iArr2, int i4, int i5, zzafz zzafzVar, zzadg zzadgVar) {
        this.f22076a = iArr;
        this.f22077b = objArr;
        this.f22078c = i2;
        this.f22079d = i3;
        this.f22082g = zzafcVar instanceof zzadu;
        boolean z = false;
        if (zzadgVar != null && (zzafcVar instanceof zzadr)) {
            z = true;
        }
        this.f22081f = z;
        this.f22083h = iArr2;
        this.f22084i = i4;
        this.f22085j = i5;
        this.f22086k = zzafzVar;
        this.f22087l = zzadgVar;
        this.f22080e = zzafcVar;
    }

    /* JADX INFO: renamed from: A */
    public static Field m9611A(Class cls, String str) {
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
    public static int m9612k(int i2) {
        return (i2 >>> 20) & 255;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m9613l(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzadu) {
            return ((zzadu) obj).m9568m();
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static void m9614m(Object obj) {
        if (!m9613l(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m9615n(long j2, Object obj) {
        return ((Integer) zzagg.m9706i(j2, obj)).intValue();
    }

    /* JADX INFO: renamed from: o */
    public static long m9616o(long j2, Object obj) {
        return ((Long) zzagg.m9706i(j2, obj)).longValue();
    }

    /* JADX INFO: renamed from: w */
    public static final int m9617w(byte[] bArr, int i2, int i3, zzagm zzagmVar, Class cls, zzacg zzacgVar) throws zzaeh {
        zzagm zzagmVar2 = zzagm.f22134u;
        switch (zzagmVar.ordinal()) {
            case 0:
                int i4 = i2 + 8;
                zzacgVar.f21959c = Double.valueOf(Double.longBitsToDouble(zzach.m9357e(i2, bArr)));
                return i4;
            case 1:
                int i5 = i2 + 4;
                zzacgVar.f21959c = Float.valueOf(Float.intBitsToFloat(zzach.m9356d(i2, bArr)));
                return i5;
            case 2:
            case 3:
                int iM9355c = zzach.m9355c(bArr, i2, zzacgVar);
                zzacgVar.f21959c = Long.valueOf(zzacgVar.f21958b);
                return iM9355c;
            case 4:
            case 12:
            case 13:
                int iM9353a = zzach.m9353a(bArr, i2, zzacgVar);
                zzacgVar.f21959c = Integer.valueOf(zzacgVar.f21957a);
                return iM9353a;
            case 5:
            case 15:
                int i6 = i2 + 8;
                zzacgVar.f21959c = Long.valueOf(zzach.m9357e(i2, bArr));
                return i6;
            case 6:
            case 14:
                int i7 = i2 + 4;
                zzacgVar.f21959c = Integer.valueOf(zzach.m9356d(i2, bArr));
                return i7;
            case 7:
                int iM9355c2 = zzach.m9355c(bArr, i2, zzacgVar);
                zzacgVar.f21959c = Boolean.valueOf(zzacgVar.f21958b != 0);
                return iM9355c2;
            case 8:
                return zzach.m9358f(bArr, i2, zzacgVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                zzafp zzafpVarM9649a = zzafl.f22093c.m9649a(cls);
                Object objZza = zzafpVarM9649a.zza();
                int iM9360h = zzach.m9360h(objZza, zzafpVarM9649a, bArr, i2, i3, zzacgVar);
                zzafpVarM9649a.mo9633c(objZza);
                zzacgVar.f21959c = objZza;
                return iM9360h;
            case 11:
                return zzach.m9359g(bArr, i2, zzacgVar);
            case 16:
                int iM9353a2 = zzach.m9353a(bArr, i2, zzacgVar);
                zzacgVar.f21959c = Integer.valueOf(zzacv.m9431j(zzacgVar.f21957a));
                return iM9353a2;
            case 17:
                int iM9355c3 = zzach.m9355c(bArr, i2, zzacgVar);
                zzacgVar.f21959c = Long.valueOf(zzacv.m9432k(zzacgVar.f21958b));
                return iM9355c3;
        }
    }

    /* JADX INFO: renamed from: x */
    public static zzaga m9618x(Object obj) {
        zzadu zzaduVar = (zzadu) obj;
        zzaga zzagaVar = zzaduVar.zzc;
        if (zzagaVar != zzaga.f22121f) {
            return zzagaVar;
        }
        zzaga zzagaVarM9686a = zzaga.m9686a();
        zzaduVar.zzc = zzagaVarM9686a;
        return zzagaVarM9686a;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0264  */
    /* JADX WARN: Code duplicated, block: B:125:0x0267  */
    /* JADX WARN: Code duplicated, block: B:128:0x0286  */
    /* JADX WARN: Code duplicated, block: B:129:0x0289  */
    /* JADX WARN: Code duplicated, block: B:169:0x0356  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ad  */
    /* JADX INFO: renamed from: z */
    public static zzaff m9619z(zzaez zzaezVar, zzafz zzafzVar, zzadh zzadhVar) {
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
        Field fieldM9611A;
        int i23;
        char cCharAt8;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Object obj;
        Field fieldM9611A2;
        int i29;
        Object obj2;
        Field fieldM9611A3;
        int i30;
        char cCharAt9;
        int i31;
        char cCharAt10;
        int i32;
        char cCharAt11;
        int i33;
        char cCharAt12;
        if (!(zzaezVar instanceof zzafn)) {
            throw null;
        }
        zzafn zzafnVar = (zzafn) zzaezVar;
        String str = zzafnVar.f22101b;
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
            iArr = f22074m;
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
        Unsafe unsafe = f22075n;
        Object[] objArr2 = zzafnVar.f22102c;
        Class<?> cls = zzafnVar.f22100a.getClass();
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
                    } else if (zzafnVar.zzc() == 1 || i78 != 0) {
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
                        fieldM9611A2 = (Field) obj;
                    } else {
                        fieldM9611A2 = m9611A(cls, (String) obj);
                        objArr4[i28] = fieldM9611A2;
                        iArr[i65] = i68;
                        i65++;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM9611A2);
                    i29 = i28 + 1;
                    obj2 = objArr4[i29];
                    if (obj2 instanceof Field) {
                        fieldM9611A3 = (Field) obj2;
                    } else {
                        fieldM9611A3 = m9611A(cls, (String) obj2);
                        objArr4[i29] = fieldM9611A3;
                    }
                    i73 = i83;
                    i19 = iObjectFieldOffset3;
                    i22 = 0;
                    i20 = 55296;
                    objArr = objArr3;
                    i5 = i5;
                    cls = cls;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM9611A3);
                    i21 = i88;
                }
                i7 = i26;
                i27 = i78;
                i28 = i85 + i85;
                int i89 = i27;
                obj = objArr4[i28];
                if (obj instanceof Field) {
                    fieldM9611A2 = (Field) obj;
                } else {
                    fieldM9611A2 = m9611A(cls, (String) obj);
                    objArr4[i28] = fieldM9611A2;
                    iArr[i65] = i68;
                    i65++;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM9611A2);
                i29 = i28 + 1;
                obj2 = objArr4[i29];
                if (obj2 instanceof Field) {
                    fieldM9611A3 = (Field) obj2;
                } else {
                    fieldM9611A3 = m9611A(cls, (String) obj2);
                    objArr4[i29] = fieldM9611A3;
                }
                i73 = i83;
                i19 = iObjectFieldOffset4;
                i22 = 0;
                i20 = 55296;
                objArr = objArr3;
                i5 = i5;
                cls = cls;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM9611A3);
                i21 = i89;
            } else {
                int i90 = i7 + 1;
                Field fieldM9611A4 = m9611A(cls, (String) objArr4[i7]);
                objArr = objArr3;
                if (i76 == 9 || i76 == 17) {
                    int i91 = i68 / 3;
                    objArr[i91 + i91 + 1] = fieldM9611A4.getType();
                } else {
                    if (i76 != 27) {
                        if (i76 == 49) {
                            i7 += 2;
                            i24 = 1;
                        } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                            i5 = i5;
                            if (zzafnVar.zzc() == 1 || i78 != 0) {
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM9611A4);
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
                                fieldM9611A = (Field) obj3;
                            } else {
                                fieldM9611A = m9611A(cls, (String) obj3);
                                objArr4[i99] = fieldM9611A;
                            }
                            i19 = iObjectFieldOffset;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM9611A);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM9611A4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM9611A4);
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
        return new zzaff(iArr3, objArr3, i3, i6, zzafnVar.f22100a, iArr, i8, i63, zzafzVar, zzadhVar);
    }

    /* JADX INFO: renamed from: B */
    public final void m9620B(int i2, Object obj, Object obj2) {
        if (m9643r(i2, obj2)) {
            int iM9640j = m9640j(i2) & 1048575;
            Unsafe unsafe = f22075n;
            long j2 = iM9640j;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                int i3 = this.f22076a[i2];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(AbstractC1456a.m2434a(i3, 38) + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            zzafp zzafpVarM9622D = m9622D(i2);
            if (!m9643r(i2, obj)) {
                if (m9613l(object)) {
                    Object objZza = zzafpVarM9622D.zza();
                    zzafpVarM9622D.mo9631a(objZza, object);
                    unsafe.putObject(obj, j2, objZza);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                m9644s(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!m9613l(object2)) {
                Object objZza2 = zzafpVarM9622D.zza();
                zzafpVarM9622D.mo9631a(objZza2, object2);
                unsafe.putObject(obj, j2, objZza2);
                object2 = objZza2;
            }
            zzafpVarM9622D.mo9631a(object2, object);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m9621C(int i2, Object obj, Object obj2) {
        int[] iArr = this.f22076a;
        int i3 = iArr[i2];
        if (m9645t(i3, i2, obj2)) {
            int iM9640j = m9640j(i2) & 1048575;
            Unsafe unsafe = f22075n;
            long j2 = iM9640j;
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
            zzafp zzafpVarM9622D = m9622D(i2);
            if (!m9645t(i3, i2, obj)) {
                if (m9613l(object)) {
                    Object objZza = zzafpVarM9622D.zza();
                    zzafpVarM9622D.mo9631a(objZza, object);
                    unsafe.putObject(obj, j2, objZza);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                m9646u(i3, i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!m9613l(object2)) {
                Object objZza2 = zzafpVarM9622D.zza();
                zzafpVarM9622D.mo9631a(objZza2, object2);
                unsafe.putObject(obj, j2, objZza2);
                object2 = objZza2;
            }
            zzafpVarM9622D.mo9631a(object2, object);
        }
    }

    /* JADX INFO: renamed from: D */
    public final zzafp m9622D(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        Object[] objArr = this.f22077b;
        zzafp zzafpVar = (zzafp) objArr[i4];
        if (zzafpVar != null) {
            return zzafpVar;
        }
        zzafp zzafpVarM9649a = zzafl.f22093c.m9649a((Class) objArr[i4 + 1]);
        objArr[i4] = zzafpVarM9649a;
        return zzafpVarM9649a;
    }

    /* JADX INFO: renamed from: E */
    public final Object m9623E(int i2) {
        int i3 = i2 / 3;
        return this.f22077b[i3 + i3];
    }

    /* JADX INFO: renamed from: F */
    public final zzadz m9624F(int i2) {
        int i3 = i2 / 3;
        return (zzadz) this.f22077b[i3 + i3 + 1];
    }

    /* JADX INFO: renamed from: G */
    public final Object m9625G(int i2, Object obj) {
        zzafp zzafpVarM9622D = m9622D(i2);
        int iM9640j = m9640j(i2) & 1048575;
        if (!m9643r(i2, obj)) {
            return zzafpVarM9622D.zza();
        }
        Object object = f22075n.getObject(obj, iM9640j);
        if (m9613l(object)) {
            return object;
        }
        Object objZza = zzafpVarM9622D.zza();
        if (object != null) {
            zzafpVarM9622D.mo9631a(objZza, object);
        }
        return objZza;
    }

    /* JADX INFO: renamed from: H */
    public final void m9626H(int i2, Object obj, Object obj2) {
        f22075n.putObject(obj, m9640j(i2) & 1048575, obj2);
        m9644s(i2, obj);
    }

    /* JADX INFO: renamed from: I */
    public final Object m9627I(int i2, int i3, Object obj) {
        zzafp zzafpVarM9622D = m9622D(i3);
        if (!m9645t(i2, i3, obj)) {
            return zzafpVarM9622D.zza();
        }
        Object object = f22075n.getObject(obj, m9640j(i3) & 1048575);
        if (m9613l(object)) {
            return object;
        }
        Object objZza = zzafpVarM9622D.zza();
        if (object != null) {
            zzafpVarM9622D.mo9631a(objZza, object);
        }
        return objZza;
    }

    /* JADX INFO: renamed from: J */
    public final void m9628J(int i2, Object obj, int i3, Object obj2) {
        f22075n.putObject(obj, m9640j(i3) & 1048575, obj2);
        m9646u(i2, i3, obj);
    }

    /* JADX INFO: renamed from: K */
    public final Object m9629K(Object obj, int i2, Object obj2, zzafz zzafzVar, Object obj3) {
        zzadz zzadzVarM9624F;
        int i3 = this.f22076a[i2];
        Object objM9706i = zzagg.m9706i(m9640j(i2) & 1048575, obj);
        if (objM9706i == null || (zzadzVarM9624F = m9624F(i2)) == null) {
            return obj2;
        }
        zzaeu zzaeuVar = ((zzaev) m9623E(i2)).f22068a;
        zzagm zzagmVar = zzaeuVar.f22066b;
        zzagm zzagmVar2 = zzaeuVar.f22065a;
        Iterator it = ((zzaew) objM9706i).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzadzVarM9624F.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zzafzVar.mo9682h(obj3);
                }
                int iM9539e = zzadk.m9539e(zzagmVar2, 1, entry.getKey()) + zzadk.m9539e(zzagmVar, 2, entry.getValue());
                zzacr zzacrVar = zzacr.f21972t;
                byte[] bArr = new byte[iM9539e];
                boolean z = zzada.f22004b;
                zzacx zzacxVar = new zzacx(bArr, iM9539e);
                try {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    zzadk.m9538d(zzacxVar, zzagmVar2, 1, key);
                    zzadk.m9538d(zzacxVar, zzagmVar, 2, value);
                    zzacxVar.m9512d();
                    zzafzVar.mo9678d(obj2, i3, new zzacq(bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: L */
    public final void m9630L(int i2, zzacw zzacwVar, Object obj) {
        long j2 = i2 & 1048575;
        if ((536870912 & i2) != 0) {
            zzagg.m9707j(j2, obj, zzacwVar.m9443H());
        } else if (this.f22082g) {
            zzagg.m9707j(j2, obj, zzacwVar.m9442G());
        } else {
            zzagg.m9707j(j2, obj, zzacwVar.m9446K());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // com.google.android.gms.internal.measurement.zzafp
    /* JADX INFO: renamed from: a */
    public final void mo9631a(Object obj, Object obj2) {
        Object obj3;
        m9614m(obj);
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.f22076a;
            if (i2 >= iArr.length) {
                Object obj4 = obj;
                zzafq.m9652b(obj4, obj2);
                if (!this.f22081f || ((zzadr) obj2).zzb.f22017a.isEmpty()) {
                    return;
                }
                throw null;
            }
            int iM9640j = m9640j(i2);
            int i3 = 1048575 & iM9640j;
            int iM9612k = m9612k(iM9640j);
            int i4 = iArr[i2];
            long j2 = i3;
            switch (iM9612k) {
                case 0:
                    if (!m9643r(i2, obj2)) {
                        obj3 = obj;
                    } else {
                        zzagf zzagfVar = zzagg.f22130c;
                        obj3 = obj;
                        zzagfVar.mo9697g(obj3, j2, zzagfVar.mo9696f(j2, obj2));
                        m9644s(i2, obj3);
                    }
                    break;
                case 1:
                    if (m9643r(i2, obj2)) {
                        zzagf zzagfVar2 = zzagg.f22130c;
                        zzagfVar2.mo9695e(obj, j2, zzagfVar2.mo9694d(j2, obj2));
                        m9644s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m9643r(i2, obj2)) {
                        zzagg.m9705h(obj, j2, zzagg.m9704g(j2, obj2));
                        m9644s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m9643r(i2, obj2)) {
                        zzagg.m9705h(obj, j2, zzagg.m9704g(j2, obj2));
                        m9644s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m9643r(i2, obj2)) {
                        zzagg.m9703f(obj, zzagg.m9702e(j2, obj2), j2);
                        m9644s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m9643r(i2, obj2)) {
                        zzagg.m9705h(obj, j2, zzagg.m9704g(j2, obj2));
                        m9644s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m9643r(i2, obj2)) {
                        zzagg.m9703f(obj, zzagg.m9702e(j2, obj2), j2);
                        m9644s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m9643r(i2, obj2)) {
                        zzagf zzagfVar3 = zzagg.f22130c;
                        zzagfVar3.mo9693c(obj, j2, zzagfVar3.mo9692b(j2, obj2));
                        m9644s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m9643r(i2, obj2)) {
                        zzagg.m9707j(j2, obj, zzagg.m9706i(j2, obj2));
                        m9644s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    m9620B(i2, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m9643r(i2, obj2)) {
                        zzagg.m9707j(j2, obj, zzagg.m9706i(j2, obj2));
                        m9644s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m9643r(i2, obj2)) {
                        zzagg.m9703f(obj, zzagg.m9702e(j2, obj2), j2);
                        m9644s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m9643r(i2, obj2)) {
                        zzagg.m9703f(obj, zzagg.m9702e(j2, obj2), j2);
                        m9644s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m9643r(i2, obj2)) {
                        zzagg.m9703f(obj, zzagg.m9702e(j2, obj2), j2);
                        m9644s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m9643r(i2, obj2)) {
                        zzagg.m9705h(obj, j2, zzagg.m9704g(j2, obj2));
                        m9644s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m9643r(i2, obj2)) {
                        zzagg.m9703f(obj, zzagg.m9702e(j2, obj2), j2);
                        m9644s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m9643r(i2, obj2)) {
                        zzagg.m9705h(obj, j2, zzagg.m9704g(j2, obj2));
                        m9644s(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    m9620B(i2, obj, obj2);
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
                    zzaef zzaefVarMo9370p = (zzaef) zzagg.m9706i(j2, obj);
                    zzaef zzaefVar = (zzaef) zzagg.m9706i(j2, obj2);
                    int size = zzaefVarMo9370p.size();
                    int size2 = zzaefVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzaefVarMo9370p.zza()) {
                            zzaefVarMo9370p = zzaefVarMo9370p.mo9370p(size2 + size);
                        }
                        zzaefVarMo9370p.addAll(zzaefVar);
                    }
                    if (size > 0) {
                        zzaefVar = zzaefVarMo9370p;
                    }
                    zzagg.m9707j(j2, obj, zzaefVar);
                    obj3 = obj;
                    break;
                case 50:
                    zzagb zzagbVar = zzafq.f22104a;
                    zzagg.m9707j(j2, obj, zzaex.m9607a(zzagg.m9706i(j2, obj), zzagg.m9706i(j2, obj2)));
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
                    if (m9645t(i4, i2, obj2)) {
                        zzagg.m9707j(j2, obj, zzagg.m9706i(j2, obj2));
                        m9646u(i4, i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    m9621C(i2, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m9645t(i4, i2, obj2)) {
                        zzagg.m9707j(j2, obj, zzagg.m9706i(j2, obj2));
                        m9646u(i4, i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    m9621C(i2, obj, obj2);
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

    @Override // com.google.android.gms.internal.measurement.zzafp
    /* JADX INFO: renamed from: b */
    public final boolean mo9632b(Object obj) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.f22084i) {
            int i7 = this.f22083h[i4];
            int iM9640j = m9640j(i7);
            int[] iArr = this.f22076a;
            int i8 = iArr[i7 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i6) {
                if (i9 != 1048575) {
                    i5 = f22075n.getInt(obj, i9);
                }
                i3 = i5;
                i2 = i9;
            } else {
                i2 = i6;
                i3 = i5;
            }
            Object obj2 = obj;
            if ((268435456 & iM9640j) == 0 || m9642q(obj2, i7, i2, i3, i10)) {
                int iM9612k = m9612k(iM9640j);
                if (iM9612k != 9 && iM9612k != 17) {
                    if (iM9612k != 27) {
                        if (iM9612k == 60 || iM9612k == 68) {
                            if (!m9645t(iArr[i7], i7, obj2) || m9622D(i7).mo9632b(zzagg.m9706i(iM9640j & 1048575, obj2))) {
                                i4++;
                                obj = obj2;
                                i6 = i2;
                                i5 = i3;
                            }
                        } else if (iM9612k != 49) {
                            if (iM9612k != 50) {
                                continue;
                            } else {
                                zzaew zzaewVar = (zzaew) zzagg.m9706i(iM9640j & 1048575, obj2);
                                if (!zzaewVar.isEmpty() && ((zzaev) m9623E(i7)).f22068a.f22066b.f22138s == zzagn.f22140A) {
                                    zzafp zzafpVarM9649a = null;
                                    for (Object obj3 : zzaewVar.values()) {
                                        if (zzafpVarM9649a == null) {
                                            zzafpVarM9649a = zzafl.f22093c.m9649a(obj3.getClass());
                                        }
                                        if (!zzafpVarM9649a.mo9632b(obj3)) {
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
                    List list = (List) zzagg.m9706i(iM9640j & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        zzafp zzafpVarM9622D = m9622D(i7);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (zzafpVarM9622D.mo9632b(list.get(i11))) {
                            }
                        }
                    }
                    i4++;
                    obj = obj2;
                    i6 = i2;
                    i5 = i3;
                } else if (!m9642q(obj2, i7, i2, i3, i10) || m9622D(i7).mo9632b(zzagg.m9706i(iM9640j & 1048575, obj2))) {
                    i4++;
                    obj = obj2;
                    i6 = i2;
                    i5 = i3;
                }
            }
            return false;
        }
        Object obj4 = obj;
        if (this.f22081f) {
            ((zzadr) obj4).zzb.m9544c();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzafp
    /* JADX INFO: renamed from: c */
    public final void mo9633c(Object obj) {
        if (!m9613l(obj)) {
            return;
        }
        if (obj instanceof zzadu) {
            zzadu zzaduVar = (zzadu) obj;
            zzaduVar.m9573s();
            zzaduVar.zza = 0;
            zzaduVar.m9569o();
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.f22076a;
            if (i2 >= iArr.length) {
                this.f22086k.mo9684j(obj);
                if (this.f22081f) {
                    this.f22087l.mo9536a(obj);
                    return;
                }
                return;
            }
            int iM9640j = m9640j(i2);
            int i3 = 1048575 & iM9640j;
            int iM9612k = m9612k(iM9640j);
            long j2 = i3;
            if (iM9612k != 9) {
                if (iM9612k != 60 && iM9612k != 68) {
                    switch (iM9612k) {
                        case 17:
                            if (m9643r(i2, obj)) {
                                m9622D(i2).mo9633c(f22075n.getObject(obj, j2));
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
                            ((zzaef) zzagg.m9706i(j2, obj)).zzb();
                            break;
                        case 50:
                            Unsafe unsafe = f22075n;
                            Object object = unsafe.getObject(obj, j2);
                            if (object != null) {
                                ((zzaew) object).f22070s = false;
                                unsafe.putObject(obj, j2, object);
                            }
                            break;
                    }
                } else if (m9645t(iArr[i2], i2, obj)) {
                    m9622D(i2).mo9633c(f22075n.getObject(obj, j2));
                }
            } else if (m9643r(i2, obj)) {
                m9622D(i2).mo9633c(f22075n.getObject(obj, j2));
            }
            i2 += 3;
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
    @Override // com.google.android.gms.internal.measurement.zzafp
    /* JADX INFO: renamed from: d */
    public final void mo9634d(Object obj, zzadb zzadbVar) {
        Map.Entry entry;
        int i2;
        int i3;
        int i4;
        int i5;
        zzaff<T> zzaffVar = this;
        zzada zzadaVar = zzadbVar.f22006a;
        if (zzaffVar.f22081f) {
            zzadk zzadkVar = ((zzadr) obj).zzb;
            if (zzadkVar.f22017a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzadkVar.m9543b().next();
            }
        } else {
            entry = null;
        }
        Unsafe unsafe = f22075n;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = zzaffVar.f22076a;
            if (i8 >= iArr.length) {
                if (entry == null) {
                    ((zzadu) obj).zzc.m9687b(zzadbVar);
                    return;
                } else {
                    throw null;
                }
            }
            int iM9640j = zzaffVar.m9640j(i8);
            int iM9612k = m9612k(iM9640j);
            int i10 = iArr[i8];
            if (iM9612k <= 17) {
                int i11 = iArr[i8 + 2];
                i2 = 1;
                int i12 = i11 & i6;
                if (i12 != i7) {
                    i9 = i12 == i6 ? 0 : unsafe.getInt(obj, i12);
                    i7 = i12;
                }
                i3 = 1 << (i11 >>> 20);
            } else {
                i2 = 1;
                i3 = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j2 = iM9640j & i6;
            switch (iM9612k) {
                case 0:
                    if (zzaffVar.m9642q(obj, i8, i7, i9, i3)) {
                        zzadbVar.m9519g(i10, zzagg.f22130c.mo9696f(j2, obj));
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 1:
                    if (zzaffVar.m9642q(obj, i8, i7, i9, i3)) {
                        zzadbVar.m9518f(zzagg.f22130c.mo9694d(j2, obj), i10);
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 2:
                    if (zzaffVar.m9642q(obj, i8, i7, i9, i3)) {
                        zzadbVar.m9516d(i10, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 3:
                    if (zzaffVar.m9642q(obj, i8, i7, i9, i3)) {
                        zzadbVar.m9521i(i10, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 4:
                    if (zzaffVar.m9642q(obj, i8, i7, i9, i3)) {
                        zzadbVar.m9522j(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 5:
                    if (zzaffVar.m9642q(obj, i8, i7, i9, i3)) {
                        zzadbVar.m9523k(i10, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 6:
                    if (zzaffVar.m9642q(obj, i8, i7, i9, i3)) {
                        zzadbVar.m9524l(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 7:
                    if (zzaffVar.m9642q(obj, i8, i7, i9, i3)) {
                        zzadbVar.m9525m(i10, zzagg.f22130c.mo9692b(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 8:
                    if (zzaffVar.m9642q(obj, i8, i7, i9, i3)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            zzadaVar.mo9488l(i10, (String) object);
                        } else {
                            zzadbVar.m9526n(i10, (zzacr) object);
                        }
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 9:
                    if (zzaffVar.m9642q(obj, i8, i7, i9, i3)) {
                        zzadbVar.m9530r(i10, unsafe.getObject(obj, j2), zzaffVar.m9622D(i8));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 10:
                    if (zzaffVar.m9642q(obj, i8, i7, i9, i3)) {
                        zzadbVar.m9526n(i10, (zzacr) unsafe.getObject(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 11:
                    if (zzaffVar.m9642q(obj, i8, i7, i9, i3)) {
                        zzadbVar.m9527o(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 12:
                    if (zzaffVar.m9642q(obj, i8, i7, i9, i3)) {
                        zzadbVar.m9520h(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 13:
                    if (zzaffVar.m9642q(obj, i8, i7, i9, i3)) {
                        zzadbVar.m9515c(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 14:
                    if (zzaffVar.m9642q(obj, i8, i7, i9, i3)) {
                        zzadbVar.m9517e(i10, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 15:
                    if (zzaffVar.m9642q(obj, i8, i7, i9, i3)) {
                        zzadbVar.m9528p(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 16:
                    if (zzaffVar.m9642q(obj, i8, i7, i9, i3)) {
                        zzadbVar.m9529q(i10, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 17:
                    if (zzaffVar.m9642q(obj, i8, i7, i9, i3)) {
                        zzadbVar.m9531s(i10, unsafe.getObject(obj, j2), zzaffVar.m9622D(i8));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 18:
                    i4 = i7;
                    i5 = i9;
                    int i13 = iArr[i8];
                    List list = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar = zzafq.f22104a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof zzadc) {
                            zzadc zzadcVar = (zzadc) list;
                            for (int i14 = 0; i14 < zzadcVar.f22009u; i14++) {
                                zzadcVar.m9533d(i14);
                                zzadaVar.mo9486j(i13, Double.doubleToRawLongBits(zzadcVar.f22008t[i14]));
                            }
                        } else {
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                zzadaVar.mo9486j(i13, Double.doubleToRawLongBits(((Double) list.get(i15)).doubleValue()));
                            }
                        }
                    }
                    break;
                case 19:
                    i4 = i7;
                    i5 = i9;
                    int i16 = iArr[i8];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar2 = zzafq.f22104a;
                    if (list2 != null && !list2.isEmpty()) {
                        if (list2 instanceof zzadm) {
                            zzadm zzadmVar = (zzadm) list2;
                            for (int i17 = 0; i17 < zzadmVar.f22027u; i17++) {
                                zzadmVar.m9546d(i17);
                                zzadaVar.mo9484h(i16, Float.floatToRawIntBits(zzadmVar.f22026t[i17]));
                            }
                        } else {
                            for (int i18 = 0; i18 < list2.size(); i18++) {
                                zzadaVar.mo9484h(i16, Float.floatToRawIntBits(((Float) list2.get(i18)).floatValue()));
                            }
                        }
                    }
                    break;
                case 20:
                    i4 = i7;
                    i5 = i9;
                    int i19 = iArr[i8];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar3 = zzafq.f22104a;
                    if (list3 != null && !list3.isEmpty()) {
                        if (list3 instanceof zzaeq) {
                            zzaeq zzaeqVar = (zzaeq) list3;
                            for (int i20 = 0; i20 < zzaeqVar.f22061u; i20++) {
                                zzadaVar.mo9485i(i19, zzaeqVar.mo9596A(i20));
                            }
                        } else {
                            for (int i21 = 0; i21 < list3.size(); i21++) {
                                zzadaVar.mo9485i(i19, ((Long) list3.get(i21)).longValue());
                            }
                        }
                    }
                    break;
                case 21:
                    i4 = i7;
                    i5 = i9;
                    int i22 = iArr[i8];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar4 = zzafq.f22104a;
                    if (list4 != null && !list4.isEmpty()) {
                        if (list4 instanceof zzaeq) {
                            zzaeq zzaeqVar2 = (zzaeq) list4;
                            for (int i23 = 0; i23 < zzaeqVar2.f22061u; i23++) {
                                zzadaVar.mo9485i(i22, zzaeqVar2.mo9596A(i23));
                            }
                        } else {
                            for (int i24 = 0; i24 < list4.size(); i24++) {
                                zzadaVar.mo9485i(i22, ((Long) list4.get(i24)).longValue());
                            }
                        }
                    }
                    break;
                case 22:
                    i4 = i7;
                    i5 = i9;
                    int i25 = iArr[i8];
                    List list5 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar5 = zzafq.f22104a;
                    if (list5 != null && !list5.isEmpty()) {
                        if (list5 instanceof zzadv) {
                            zzadv zzadvVar = (zzadv) list5;
                            for (int i26 = 0; i26 < zzadvVar.f22035u; i26++) {
                                zzadaVar.mo9482f(i25, zzadvVar.mo9578o(i26));
                            }
                        } else {
                            for (int i27 = 0; i27 < list5.size(); i27++) {
                                zzadaVar.mo9482f(i25, ((Integer) list5.get(i27)).intValue());
                            }
                        }
                    }
                    break;
                case 23:
                    i4 = i7;
                    i5 = i9;
                    int i28 = iArr[i8];
                    List list6 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar6 = zzafq.f22104a;
                    if (list6 != null && !list6.isEmpty()) {
                        if (list6 instanceof zzaeq) {
                            zzaeq zzaeqVar3 = (zzaeq) list6;
                            for (int i29 = 0; i29 < zzaeqVar3.f22061u; i29++) {
                                zzadaVar.mo9486j(i28, zzaeqVar3.mo9596A(i29));
                            }
                        } else {
                            for (int i30 = 0; i30 < list6.size(); i30++) {
                                zzadaVar.mo9486j(i28, ((Long) list6.get(i30)).longValue());
                            }
                        }
                    }
                    break;
                case 24:
                    i4 = i7;
                    i5 = i9;
                    int i31 = iArr[i8];
                    List list7 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar7 = zzafq.f22104a;
                    if (list7 != null && !list7.isEmpty()) {
                        if (list7 instanceof zzadv) {
                            zzadv zzadvVar2 = (zzadv) list7;
                            for (int i32 = 0; i32 < zzadvVar2.f22035u; i32++) {
                                zzadaVar.mo9484h(i31, zzadvVar2.mo9578o(i32));
                            }
                        } else {
                            for (int i33 = 0; i33 < list7.size(); i33++) {
                                zzadaVar.mo9484h(i31, ((Integer) list7.get(i33)).intValue());
                            }
                        }
                    }
                    break;
                case 25:
                    i4 = i7;
                    i5 = i9;
                    int i34 = iArr[i8];
                    List list8 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar8 = zzafq.f22104a;
                    if (list8 != null && !list8.isEmpty()) {
                        if (list8 instanceof zzaci) {
                            zzaci zzaciVar = (zzaci) list8;
                            for (int i35 = 0; i35 < zzaciVar.f21964u; i35++) {
                                zzaciVar.m9367I(i35);
                                zzadaVar.mo9487k(i34, zzaciVar.f21963t[i35]);
                            }
                        } else {
                            for (int i36 = 0; i36 < list8.size(); i36++) {
                                zzadaVar.mo9487k(i34, ((Boolean) list8.get(i36)).booleanValue());
                            }
                        }
                    }
                    break;
                case 26:
                    i4 = i7;
                    i5 = i9;
                    int i37 = iArr[i8];
                    List list9 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar9 = zzafq.f22104a;
                    if (list9 != null && !list9.isEmpty()) {
                        zzadbVar.m9513a(i37, list9);
                    }
                    break;
                case 27:
                    i4 = i7;
                    i5 = i9;
                    int i38 = iArr[i8];
                    List list10 = (List) unsafe.getObject(obj, j2);
                    zzafp zzafpVarM9622D = zzaffVar.m9622D(i8);
                    zzagb zzagbVar10 = zzafq.f22104a;
                    if (list10 != null && !list10.isEmpty()) {
                        for (int i39 = 0; i39 < list10.size(); i39++) {
                            zzadbVar.m9530r(i38, list10.get(i39), zzafpVarM9622D);
                        }
                    }
                    break;
                case 28:
                    i4 = i7;
                    i5 = i9;
                    int i40 = iArr[i8];
                    List list11 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar11 = zzafq.f22104a;
                    if (list11 != null && !list11.isEmpty()) {
                        zzadbVar.m9514b(i40, list11);
                    }
                    break;
                case 29:
                    i4 = i7;
                    i5 = i9;
                    int i41 = iArr[i8];
                    List list12 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar12 = zzafq.f22104a;
                    if (list12 != null && !list12.isEmpty()) {
                        if (list12 instanceof zzadv) {
                            zzadv zzadvVar3 = (zzadv) list12;
                            for (int i42 = 0; i42 < zzadvVar3.f22035u; i42++) {
                                zzadaVar.mo9483g(i41, zzadvVar3.mo9578o(i42));
                            }
                        } else {
                            for (int i43 = 0; i43 < list12.size(); i43++) {
                                zzadaVar.mo9483g(i41, ((Integer) list12.get(i43)).intValue());
                            }
                        }
                    }
                    break;
                case 30:
                    i4 = i7;
                    i5 = i9;
                    int i44 = iArr[i8];
                    List list13 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar13 = zzafq.f22104a;
                    if (list13 != null && !list13.isEmpty()) {
                        if (list13 instanceof zzadv) {
                            zzadv zzadvVar4 = (zzadv) list13;
                            for (int i45 = 0; i45 < zzadvVar4.f22035u; i45++) {
                                zzadaVar.mo9482f(i44, zzadvVar4.mo9578o(i45));
                            }
                        } else {
                            for (int i46 = 0; i46 < list13.size(); i46++) {
                                zzadaVar.mo9482f(i44, ((Integer) list13.get(i46)).intValue());
                            }
                        }
                    }
                    break;
                case 31:
                    i4 = i7;
                    i5 = i9;
                    int i47 = iArr[i8];
                    List list14 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar14 = zzafq.f22104a;
                    if (list14 != null && !list14.isEmpty()) {
                        if (list14 instanceof zzadv) {
                            zzadv zzadvVar5 = (zzadv) list14;
                            for (int i48 = 0; i48 < zzadvVar5.f22035u; i48++) {
                                zzadaVar.mo9484h(i47, zzadvVar5.mo9578o(i48));
                            }
                        } else {
                            for (int i49 = 0; i49 < list14.size(); i49++) {
                                zzadaVar.mo9484h(i47, ((Integer) list14.get(i49)).intValue());
                            }
                        }
                    }
                    break;
                case 32:
                    i4 = i7;
                    i5 = i9;
                    int i50 = iArr[i8];
                    List list15 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar15 = zzafq.f22104a;
                    if (list15 != null && !list15.isEmpty()) {
                        if (list15 instanceof zzaeq) {
                            zzaeq zzaeqVar4 = (zzaeq) list15;
                            for (int i51 = 0; i51 < zzaeqVar4.f22061u; i51++) {
                                zzadaVar.mo9486j(i50, zzaeqVar4.mo9596A(i51));
                            }
                        } else {
                            for (int i52 = 0; i52 < list15.size(); i52++) {
                                zzadaVar.mo9486j(i50, ((Long) list15.get(i52)).longValue());
                            }
                        }
                    }
                    break;
                case 33:
                    i4 = i7;
                    i5 = i9;
                    int i53 = iArr[i8];
                    List list16 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar16 = zzafq.f22104a;
                    if (list16 != null && !list16.isEmpty()) {
                        if (list16 instanceof zzadv) {
                            zzadv zzadvVar6 = (zzadv) list16;
                            for (int i54 = 0; i54 < zzadvVar6.f22035u; i54++) {
                                int iMo9578o = zzadvVar6.mo9578o(i54);
                                zzadaVar.mo9483g(i53, (iMo9578o >> 31) ^ (iMo9578o + iMo9578o));
                            }
                        } else {
                            for (int i55 = 0; i55 < list16.size(); i55++) {
                                int iIntValue = ((Integer) list16.get(i55)).intValue();
                                zzadaVar.mo9483g(i53, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                            }
                        }
                    }
                    break;
                case 34:
                    i4 = i7;
                    i5 = i9;
                    int i56 = iArr[i8];
                    List list17 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar17 = zzafq.f22104a;
                    if (list17 != null && !list17.isEmpty()) {
                        if (list17 instanceof zzaeq) {
                            zzaeq zzaeqVar5 = (zzaeq) list17;
                            for (int i57 = 0; i57 < zzaeqVar5.f22061u; i57++) {
                                long jMo9596A = zzaeqVar5.mo9596A(i57);
                                zzadaVar.mo9485i(i56, (jMo9596A >> 63) ^ (jMo9596A + jMo9596A));
                            }
                        } else {
                            for (int i58 = 0; i58 < list17.size(); i58++) {
                                long jLongValue = ((Long) list17.get(i58)).longValue();
                                zzadaVar.mo9485i(i56, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                            }
                        }
                    }
                    break;
                case 35:
                    i4 = i7;
                    i5 = i9;
                    int i59 = iArr[i8];
                    List list18 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar18 = zzafq.f22104a;
                    if (list18 != null && !list18.isEmpty()) {
                        if (list18 instanceof zzadc) {
                            zzadc zzadcVar2 = (zzadc) list18;
                            zzadaVar.mo9481e(i59, 2);
                            int i60 = 0;
                            for (int i61 = 0; i61 < zzadcVar2.f22009u; i61++) {
                                zzadcVar2.m9533d(i61);
                                double d = zzadcVar2.f22008t[i61];
                                i60 += 8;
                            }
                            zzadaVar.mo9497u(i60);
                            for (int i62 = 0; i62 < zzadcVar2.f22009u; i62++) {
                                zzadcVar2.m9533d(i62);
                                zzadaVar.mo9500x(Double.doubleToRawLongBits(zzadcVar2.f22008t[i62]));
                            }
                        } else {
                            zzadaVar.mo9481e(i59, 2);
                            int i63 = 0;
                            for (int i64 = 0; i64 < list18.size(); i64++) {
                                ((Double) list18.get(i64)).getClass();
                                i63 += 8;
                            }
                            zzadaVar.mo9497u(i63);
                            for (int i65 = 0; i65 < list18.size(); i65++) {
                                zzadaVar.mo9500x(Double.doubleToRawLongBits(((Double) list18.get(i65)).doubleValue()));
                            }
                        }
                    }
                    break;
                case 36:
                    i4 = i7;
                    i5 = i9;
                    int i66 = iArr[i8];
                    List list19 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar19 = zzafq.f22104a;
                    if (list19 != null && !list19.isEmpty()) {
                        if (list19 instanceof zzadm) {
                            zzadm zzadmVar2 = (zzadm) list19;
                            zzadaVar.mo9481e(i66, 2);
                            int i67 = 0;
                            for (int i68 = 0; i68 < zzadmVar2.f22027u; i68++) {
                                zzadmVar2.m9546d(i68);
                                float f2 = zzadmVar2.f22026t[i68];
                                i67 += 4;
                            }
                            zzadaVar.mo9497u(i67);
                            for (int i69 = 0; i69 < zzadmVar2.f22027u; i69++) {
                                zzadmVar2.m9546d(i69);
                                zzadaVar.mo9498v(Float.floatToRawIntBits(zzadmVar2.f22026t[i69]));
                            }
                        } else {
                            zzadaVar.mo9481e(i66, 2);
                            int i70 = 0;
                            for (int i71 = 0; i71 < list19.size(); i71++) {
                                ((Float) list19.get(i71)).getClass();
                                i70 += 4;
                            }
                            zzadaVar.mo9497u(i70);
                            for (int i72 = 0; i72 < list19.size(); i72++) {
                                zzadaVar.mo9498v(Float.floatToRawIntBits(((Float) list19.get(i72)).floatValue()));
                            }
                        }
                    }
                    break;
                case 37:
                    i4 = i7;
                    i5 = i9;
                    int i73 = iArr[i8];
                    List list20 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar20 = zzafq.f22104a;
                    if (list20 != null && !list20.isEmpty()) {
                        if (list20 instanceof zzaeq) {
                            zzaeq zzaeqVar6 = (zzaeq) list20;
                            zzadaVar.mo9481e(i73, 2);
                            int iM9511c = 0;
                            for (int i74 = 0; i74 < zzaeqVar6.f22061u; i74++) {
                                iM9511c += zzada.m9511c(zzaeqVar6.mo9596A(i74));
                            }
                            zzadaVar.mo9497u(iM9511c);
                            for (int i75 = 0; i75 < zzaeqVar6.f22061u; i75++) {
                                zzadaVar.mo9499w(zzaeqVar6.mo9596A(i75));
                            }
                        } else {
                            zzadaVar.mo9481e(i73, 2);
                            int iM9511c2 = 0;
                            for (int i76 = 0; i76 < list20.size(); i76++) {
                                iM9511c2 += zzada.m9511c(((Long) list20.get(i76)).longValue());
                            }
                            zzadaVar.mo9497u(iM9511c2);
                            for (int i77 = 0; i77 < list20.size(); i77++) {
                                zzadaVar.mo9499w(((Long) list20.get(i77)).longValue());
                            }
                        }
                    }
                    break;
                case 38:
                    i4 = i7;
                    i5 = i9;
                    int i78 = iArr[i8];
                    List list21 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar21 = zzafq.f22104a;
                    if (list21 != null && !list21.isEmpty()) {
                        if (list21 instanceof zzaeq) {
                            zzaeq zzaeqVar7 = (zzaeq) list21;
                            zzadaVar.mo9481e(i78, 2);
                            int iM9511c3 = 0;
                            for (int i79 = 0; i79 < zzaeqVar7.f22061u; i79++) {
                                iM9511c3 += zzada.m9511c(zzaeqVar7.mo9596A(i79));
                            }
                            zzadaVar.mo9497u(iM9511c3);
                            for (int i80 = 0; i80 < zzaeqVar7.f22061u; i80++) {
                                zzadaVar.mo9499w(zzaeqVar7.mo9596A(i80));
                            }
                        } else {
                            zzadaVar.mo9481e(i78, 2);
                            int iM9511c4 = 0;
                            for (int i81 = 0; i81 < list21.size(); i81++) {
                                iM9511c4 += zzada.m9511c(((Long) list21.get(i81)).longValue());
                            }
                            zzadaVar.mo9497u(iM9511c4);
                            for (int i82 = 0; i82 < list21.size(); i82++) {
                                zzadaVar.mo9499w(((Long) list21.get(i82)).longValue());
                            }
                        }
                    }
                    break;
                case 39:
                    i4 = i7;
                    i5 = i9;
                    int i83 = iArr[i8];
                    List list22 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar22 = zzafq.f22104a;
                    if (list22 != null && !list22.isEmpty()) {
                        if (list22 instanceof zzadv) {
                            zzadv zzadvVar7 = (zzadv) list22;
                            zzadaVar.mo9481e(i83, 2);
                            int iM9511c5 = 0;
                            for (int i84 = 0; i84 < zzadvVar7.f22035u; i84++) {
                                iM9511c5 += zzada.m9511c(zzadvVar7.mo9578o(i84));
                            }
                            zzadaVar.mo9497u(iM9511c5);
                            for (int i85 = 0; i85 < zzadvVar7.f22035u; i85++) {
                                zzadaVar.mo9496t(zzadvVar7.mo9578o(i85));
                            }
                        } else {
                            zzadaVar.mo9481e(i83, 2);
                            int iM9511c6 = 0;
                            for (int i86 = 0; i86 < list22.size(); i86++) {
                                iM9511c6 += zzada.m9511c(((Integer) list22.get(i86)).intValue());
                            }
                            zzadaVar.mo9497u(iM9511c6);
                            for (int i87 = 0; i87 < list22.size(); i87++) {
                                zzadaVar.mo9496t(((Integer) list22.get(i87)).intValue());
                            }
                        }
                    }
                    break;
                case 40:
                    i4 = i7;
                    i5 = i9;
                    int i88 = iArr[i8];
                    List list23 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar23 = zzafq.f22104a;
                    if (list23 != null && !list23.isEmpty()) {
                        if (list23 instanceof zzaeq) {
                            zzaeq zzaeqVar8 = (zzaeq) list23;
                            zzadaVar.mo9481e(i88, 2);
                            int i89 = 0;
                            for (int i90 = 0; i90 < zzaeqVar8.f22061u; i90++) {
                                zzaeqVar8.mo9596A(i90);
                                i89 += 8;
                            }
                            zzadaVar.mo9497u(i89);
                            for (int i91 = 0; i91 < zzaeqVar8.f22061u; i91++) {
                                zzadaVar.mo9500x(zzaeqVar8.mo9596A(i91));
                            }
                        } else {
                            zzadaVar.mo9481e(i88, 2);
                            int i92 = 0;
                            for (int i93 = 0; i93 < list23.size(); i93++) {
                                ((Long) list23.get(i93)).getClass();
                                i92 += 8;
                            }
                            zzadaVar.mo9497u(i92);
                            for (int i94 = 0; i94 < list23.size(); i94++) {
                                zzadaVar.mo9500x(((Long) list23.get(i94)).longValue());
                            }
                        }
                    }
                    break;
                case 41:
                    i4 = i7;
                    i5 = i9;
                    int i95 = iArr[i8];
                    List list24 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar24 = zzafq.f22104a;
                    if (list24 != null && !list24.isEmpty()) {
                        if (list24 instanceof zzadv) {
                            zzadv zzadvVar8 = (zzadv) list24;
                            zzadaVar.mo9481e(i95, 2);
                            int i96 = 0;
                            for (int i97 = 0; i97 < zzadvVar8.f22035u; i97++) {
                                zzadvVar8.mo9578o(i97);
                                i96 += 4;
                            }
                            zzadaVar.mo9497u(i96);
                            for (int i98 = 0; i98 < zzadvVar8.f22035u; i98++) {
                                zzadaVar.mo9498v(zzadvVar8.mo9578o(i98));
                            }
                        } else {
                            zzadaVar.mo9481e(i95, 2);
                            int i99 = 0;
                            for (int i100 = 0; i100 < list24.size(); i100++) {
                                ((Integer) list24.get(i100)).getClass();
                                i99 += 4;
                            }
                            zzadaVar.mo9497u(i99);
                            for (int i101 = 0; i101 < list24.size(); i101++) {
                                zzadaVar.mo9498v(((Integer) list24.get(i101)).intValue());
                            }
                        }
                    }
                    break;
                case 42:
                    i4 = i7;
                    i5 = i9;
                    int i102 = iArr[i8];
                    List list25 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar25 = zzafq.f22104a;
                    if (list25 != null && !list25.isEmpty()) {
                        if (list25 instanceof zzaci) {
                            zzaci zzaciVar2 = (zzaci) list25;
                            zzadaVar.mo9481e(i102, 2);
                            int i103 = 0;
                            for (int i104 = 0; i104 < zzaciVar2.f21964u; i104++) {
                                zzaciVar2.m9367I(i104);
                                boolean z = zzaciVar2.f21963t[i104];
                                i103++;
                            }
                            zzadaVar.mo9497u(i103);
                            for (int i105 = 0; i105 < zzaciVar2.f21964u; i105++) {
                                zzaciVar2.m9367I(i105);
                                zzadaVar.mo9495s(zzaciVar2.f21963t[i105] ? (byte) 1 : (byte) 0);
                            }
                        } else {
                            zzadaVar.mo9481e(i102, 2);
                            int i106 = 0;
                            for (int i107 = 0; i107 < list25.size(); i107++) {
                                ((Boolean) list25.get(i107)).getClass();
                                i106++;
                            }
                            zzadaVar.mo9497u(i106);
                            for (int i108 = 0; i108 < list25.size(); i108++) {
                                zzadaVar.mo9495s(((Boolean) list25.get(i108)).booleanValue() ? (byte) 1 : (byte) 0);
                            }
                        }
                    }
                    break;
                case 43:
                    i4 = i7;
                    i5 = i9;
                    int i109 = iArr[i8];
                    List list26 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar26 = zzafq.f22104a;
                    if (list26 != null && !list26.isEmpty()) {
                        if (list26 instanceof zzadv) {
                            zzadv zzadvVar9 = (zzadv) list26;
                            zzadaVar.mo9481e(i109, 2);
                            int iM9510b = 0;
                            for (int i110 = 0; i110 < zzadvVar9.f22035u; i110++) {
                                iM9510b += zzada.m9510b(zzadvVar9.mo9578o(i110));
                            }
                            zzadaVar.mo9497u(iM9510b);
                            for (int i111 = 0; i111 < zzadvVar9.f22035u; i111++) {
                                zzadaVar.mo9497u(zzadvVar9.mo9578o(i111));
                            }
                        } else {
                            zzadaVar.mo9481e(i109, 2);
                            int iM9510b2 = 0;
                            for (int i112 = 0; i112 < list26.size(); i112++) {
                                iM9510b2 += zzada.m9510b(((Integer) list26.get(i112)).intValue());
                            }
                            zzadaVar.mo9497u(iM9510b2);
                            for (int i113 = 0; i113 < list26.size(); i113++) {
                                zzadaVar.mo9497u(((Integer) list26.get(i113)).intValue());
                            }
                        }
                    }
                    break;
                case 44:
                    i4 = i7;
                    i5 = i9;
                    int i114 = iArr[i8];
                    List list27 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar27 = zzafq.f22104a;
                    if (list27 != null && !list27.isEmpty()) {
                        if (list27 instanceof zzadv) {
                            zzadv zzadvVar10 = (zzadv) list27;
                            zzadaVar.mo9481e(i114, 2);
                            int iM9511c7 = 0;
                            for (int i115 = 0; i115 < zzadvVar10.f22035u; i115++) {
                                iM9511c7 += zzada.m9511c(zzadvVar10.mo9578o(i115));
                            }
                            zzadaVar.mo9497u(iM9511c7);
                            for (int i116 = 0; i116 < zzadvVar10.f22035u; i116++) {
                                zzadaVar.mo9496t(zzadvVar10.mo9578o(i116));
                            }
                        } else {
                            zzadaVar.mo9481e(i114, 2);
                            int iM9511c8 = 0;
                            for (int i117 = 0; i117 < list27.size(); i117++) {
                                iM9511c8 += zzada.m9511c(((Integer) list27.get(i117)).intValue());
                            }
                            zzadaVar.mo9497u(iM9511c8);
                            for (int i118 = 0; i118 < list27.size(); i118++) {
                                zzadaVar.mo9496t(((Integer) list27.get(i118)).intValue());
                            }
                        }
                    }
                    break;
                case 45:
                    i4 = i7;
                    i5 = i9;
                    int i119 = iArr[i8];
                    List list28 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar28 = zzafq.f22104a;
                    if (list28 != null && !list28.isEmpty()) {
                        if (list28 instanceof zzadv) {
                            zzadv zzadvVar11 = (zzadv) list28;
                            zzadaVar.mo9481e(i119, 2);
                            int i120 = 0;
                            for (int i121 = 0; i121 < zzadvVar11.f22035u; i121++) {
                                zzadvVar11.mo9578o(i121);
                                i120 += 4;
                            }
                            zzadaVar.mo9497u(i120);
                            for (int i122 = 0; i122 < zzadvVar11.f22035u; i122++) {
                                zzadaVar.mo9498v(zzadvVar11.mo9578o(i122));
                            }
                        } else {
                            zzadaVar.mo9481e(i119, 2);
                            int i123 = 0;
                            for (int i124 = 0; i124 < list28.size(); i124++) {
                                ((Integer) list28.get(i124)).getClass();
                                i123 += 4;
                            }
                            zzadaVar.mo9497u(i123);
                            for (int i125 = 0; i125 < list28.size(); i125++) {
                                zzadaVar.mo9498v(((Integer) list28.get(i125)).intValue());
                            }
                        }
                    }
                    break;
                case 46:
                    i4 = i7;
                    i5 = i9;
                    int i126 = iArr[i8];
                    List list29 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar29 = zzafq.f22104a;
                    if (list29 != null && !list29.isEmpty()) {
                        if (list29 instanceof zzaeq) {
                            zzaeq zzaeqVar9 = (zzaeq) list29;
                            zzadaVar.mo9481e(i126, 2);
                            int i127 = 0;
                            for (int i128 = 0; i128 < zzaeqVar9.f22061u; i128++) {
                                zzaeqVar9.mo9596A(i128);
                                i127 += 8;
                            }
                            zzadaVar.mo9497u(i127);
                            for (int i129 = 0; i129 < zzaeqVar9.f22061u; i129++) {
                                zzadaVar.mo9500x(zzaeqVar9.mo9596A(i129));
                            }
                        } else {
                            zzadaVar.mo9481e(i126, 2);
                            int i130 = 0;
                            for (int i131 = 0; i131 < list29.size(); i131++) {
                                ((Long) list29.get(i131)).getClass();
                                i130 += 8;
                            }
                            zzadaVar.mo9497u(i130);
                            for (int i132 = 0; i132 < list29.size(); i132++) {
                                zzadaVar.mo9500x(((Long) list29.get(i132)).longValue());
                            }
                        }
                    }
                    break;
                case 47:
                    i4 = i7;
                    i5 = i9;
                    int i133 = iArr[i8];
                    List list30 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar30 = zzafq.f22104a;
                    if (list30 != null && !list30.isEmpty()) {
                        if (list30 instanceof zzadv) {
                            zzadv zzadvVar12 = (zzadv) list30;
                            zzadaVar.mo9481e(i133, 2);
                            int iM9510b3 = 0;
                            for (int i134 = 0; i134 < zzadvVar12.f22035u; i134++) {
                                int iMo9578o2 = zzadvVar12.mo9578o(i134);
                                iM9510b3 += zzada.m9510b((iMo9578o2 >> 31) ^ (iMo9578o2 + iMo9578o2));
                            }
                            zzadaVar.mo9497u(iM9510b3);
                            for (int i135 = 0; i135 < zzadvVar12.f22035u; i135++) {
                                int iMo9578o3 = zzadvVar12.mo9578o(i135);
                                zzadaVar.mo9497u((iMo9578o3 >> 31) ^ (iMo9578o3 + iMo9578o3));
                            }
                        } else {
                            zzadaVar.mo9481e(i133, 2);
                            int iM9510b4 = 0;
                            for (int i136 = 0; i136 < list30.size(); i136++) {
                                int iIntValue2 = ((Integer) list30.get(i136)).intValue();
                                iM9510b4 += zzada.m9510b((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                            }
                            zzadaVar.mo9497u(iM9510b4);
                            for (int i137 = 0; i137 < list30.size(); i137++) {
                                int iIntValue3 = ((Integer) list30.get(i137)).intValue();
                                zzadaVar.mo9497u((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                            }
                        }
                    }
                    break;
                case 48:
                    i4 = i7;
                    i5 = i9;
                    int i138 = iArr[i8];
                    List list31 = (List) unsafe.getObject(obj, j2);
                    zzagb zzagbVar31 = zzafq.f22104a;
                    if (list31 != null && !list31.isEmpty()) {
                        if (list31 instanceof zzaeq) {
                            zzaeq zzaeqVar10 = (zzaeq) list31;
                            zzadaVar.mo9481e(i138, 2);
                            int iM9511c9 = 0;
                            for (int i139 = 0; i139 < zzaeqVar10.f22061u; i139++) {
                                long jMo9596A2 = zzaeqVar10.mo9596A(i139);
                                iM9511c9 += zzada.m9511c((jMo9596A2 >> 63) ^ (jMo9596A2 + jMo9596A2));
                            }
                            zzadaVar.mo9497u(iM9511c9);
                            for (int i140 = 0; i140 < zzaeqVar10.f22061u; i140++) {
                                long jMo9596A3 = zzaeqVar10.mo9596A(i140);
                                zzadaVar.mo9499w((jMo9596A3 >> 63) ^ (jMo9596A3 + jMo9596A3));
                            }
                        } else {
                            zzadaVar.mo9481e(i138, 2);
                            int iM9511c10 = 0;
                            for (int i141 = 0; i141 < list31.size(); i141++) {
                                long jLongValue2 = ((Long) list31.get(i141)).longValue();
                                iM9511c10 += zzada.m9511c((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                            }
                            zzadaVar.mo9497u(iM9511c10);
                            for (int i142 = 0; i142 < list31.size(); i142++) {
                                long jLongValue3 = ((Long) list31.get(i142)).longValue();
                                zzadaVar.mo9499w((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                            }
                        }
                    }
                    break;
                case 49:
                    i4 = i7;
                    i5 = i9;
                    int i143 = iArr[i8];
                    List list32 = (List) unsafe.getObject(obj, j2);
                    zzafp zzafpVarM9622D2 = zzaffVar.m9622D(i8);
                    zzagb zzagbVar32 = zzafq.f22104a;
                    if (list32 != null && !list32.isEmpty()) {
                        for (int i144 = 0; i144 < list32.size(); i144++) {
                            zzadbVar.m9531s(i143, list32.get(i144), zzafpVarM9622D2);
                        }
                    }
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j2);
                    if (object2 != null) {
                        zzaeu zzaeuVar = ((zzaev) zzaffVar.m9623E(i8)).f22068a;
                        zzagm zzagmVar = zzaeuVar.f22066b;
                        zzagm zzagmVar2 = zzaeuVar.f22065a;
                        for (Map.Entry entry2 : ((zzaew) object2).entrySet()) {
                            zzadaVar.mo9481e(i10, 2);
                            int i145 = i7;
                            int i146 = i9;
                            int i147 = i2;
                            zzadaVar.mo9497u(zzadk.m9539e(zzagmVar2, i147, entry2.getKey()) + zzadk.m9539e(zzagmVar, 2, entry2.getValue()));
                            Object key = entry2.getKey();
                            Object value = entry2.getValue();
                            zzadk.m9538d(zzadaVar, zzagmVar2, i147, key);
                            zzadk.m9538d(zzadaVar, zzagmVar, 2, value);
                            i7 = i145;
                            i9 = i146;
                        }
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 51:
                    if (zzaffVar.m9645t(i10, i8, obj)) {
                        zzadbVar.m9519g(i10, ((Double) zzagg.m9706i(j2, obj)).doubleValue());
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 52:
                    if (zzaffVar.m9645t(i10, i8, obj)) {
                        zzadbVar.m9518f(((Float) zzagg.m9706i(j2, obj)).floatValue(), i10);
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 53:
                    if (zzaffVar.m9645t(i10, i8, obj)) {
                        zzadbVar.m9516d(i10, m9616o(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 54:
                    if (zzaffVar.m9645t(i10, i8, obj)) {
                        zzadbVar.m9521i(i10, m9616o(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 55:
                    if (zzaffVar.m9645t(i10, i8, obj)) {
                        zzadbVar.m9522j(i10, m9615n(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 56:
                    if (zzaffVar.m9645t(i10, i8, obj)) {
                        zzadbVar.m9523k(i10, m9616o(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 57:
                    if (zzaffVar.m9645t(i10, i8, obj)) {
                        zzadbVar.m9524l(i10, m9615n(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 58:
                    if (zzaffVar.m9645t(i10, i8, obj)) {
                        zzadbVar.m9525m(i10, ((Boolean) zzagg.m9706i(j2, obj)).booleanValue());
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 59:
                    if (zzaffVar.m9645t(i10, i8, obj)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof String) {
                            zzadaVar.mo9488l(i10, (String) object3);
                        } else {
                            zzadbVar.m9526n(i10, (zzacr) object3);
                        }
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 60:
                    if (zzaffVar.m9645t(i10, i8, obj)) {
                        zzadbVar.m9530r(i10, unsafe.getObject(obj, j2), zzaffVar.m9622D(i8));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 61:
                    if (zzaffVar.m9645t(i10, i8, obj)) {
                        zzadbVar.m9526n(i10, (zzacr) unsafe.getObject(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 62:
                    if (zzaffVar.m9645t(i10, i8, obj)) {
                        zzadbVar.m9527o(i10, m9615n(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 63:
                    if (zzaffVar.m9645t(i10, i8, obj)) {
                        zzadbVar.m9520h(i10, m9615n(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 64:
                    if (zzaffVar.m9645t(i10, i8, obj)) {
                        zzadbVar.m9515c(i10, m9615n(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 65:
                    if (zzaffVar.m9645t(i10, i8, obj)) {
                        zzadbVar.m9517e(i10, m9616o(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 66:
                    if (zzaffVar.m9645t(i10, i8, obj)) {
                        zzadbVar.m9528p(i10, m9615n(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 67:
                    if (zzaffVar.m9645t(i10, i8, obj)) {
                        zzadbVar.m9529q(i10, m9616o(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                case 68:
                    if (zzaffVar.m9645t(i10, i8, obj)) {
                        zzadbVar.m9531s(i10, unsafe.getObject(obj, j2), zzaffVar.m9622D(i8));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
                default:
                    continue;
                    i8 += 3;
                    i6 = 1048575;
                    zzaffVar = this;
                    break;
            }
            i7 = i4;
            i9 = i5;
            i8 += 3;
            i6 = 1048575;
            zzaffVar = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:140:0x03f5 A[PHI: r17
  0x03f5: PHI (r17v21 int) = (r17v3 int), (r17v4 int), (r17v10 int), (r17v12 int), (r17v13 int), (r17v14 int), (r17v18 int), (r17v22 int) binds: [B:208:0x05b4, B:204:0x0596, B:178:0x04f8, B:160:0x0484, B:156:0x0468, B:152:0x044c, B:145:0x0414, B:139:0x03f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:198:0x055f A[PHI: r17
  0x055f: PHI (r17v8 int) = (r17v2 int), (r17v9 int) binds: [B:212:0x05d2, B:197:0x055d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.zzafp
    /* JADX INFO: renamed from: e */
    public final int mo9635e(zzadu zzaduVar) {
        int i2;
        int iM9510b;
        int iM9511c;
        int iM9663m;
        int iMo9347j;
        int iM9662l;
        int iM9510b2;
        int size;
        int iM9655e;
        int iM9510b3;
        int iM9510b4;
        int iM9510b5;
        int iMo9347j2;
        int iM9510b6;
        int iM9511c2;
        zzaff<T> zzaffVar = this;
        zzadu zzaduVar2 = zzaduVar;
        Unsafe unsafe = f22075n;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int iM2457x = 0;
        while (true) {
            int[] iArr = zzaffVar.f22076a;
            if (i5 >= iArr.length) {
                int iM9688c = zzaduVar2.zzc.m9688c() + iM2457x;
                if (zzaffVar.f22081f) {
                    zzafr zzafrVar = ((zzadr) zzaduVar2).zzb.f22017a;
                    if (zzafrVar.f22114t > 0) {
                        Map.Entry entryM9666b = zzafrVar.m9666b(0);
                        zzadj zzadjVar = (zzadj) ((zzafs) entryM9666b).f22105s;
                        Object obj = ((zzafs) entryM9666b).f22106t;
                        zzadjVar.zzb();
                        throw null;
                    }
                    Iterator<T> it = zzafrVar.m9667c().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        zzadj zzadjVar2 = (zzadj) entry.getKey();
                        entry.getValue();
                        zzadjVar2.zzb();
                        throw null;
                    }
                }
                return iM9688c;
            }
            int iM9640j = zzaffVar.m9640j(i5);
            int iM9612k = m9612k(iM9640j);
            int i7 = iArr[i5];
            int i8 = iArr[i5 + 2];
            int i9 = i8 & i3;
            if (iM9612k <= 17) {
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(zzaduVar2, i9);
                    i4 = i9;
                }
                i2 = 1 << (i8 >>> 20);
            } else {
                i2 = 0;
            }
            int i10 = iM9640j & i3;
            if (iM9612k >= zzadl.f22020t.f22024s) {
                zzadl.f22021u.getClass();
            }
            long j2 = i10;
            switch (iM9612k) {
                case 0:
                    if (zzaffVar.m9642q(zzaduVar2, i5, i4, i6, i2)) {
                        iM2457x = AbstractC1456a.m2457x(i7 << 3, 8, iM2457x);
                    }
                    break;
                case 1:
                    if (zzaffVar.m9642q(zzaduVar2, i5, i4, i6, i2)) {
                        iM2457x = AbstractC1456a.m2457x(i7 << 3, 4, iM2457x);
                    }
                    zzaffVar = this;
                    zzaduVar2 = zzaduVar;
                    break;
                case 2:
                    if (zzaffVar.m9642q(zzaduVar2, i5, i4, i6, i2)) {
                        long j3 = unsafe.getLong(zzaduVar2, j2);
                        iM9510b = zzada.m9510b(i7 << 3);
                        iM9511c = zzada.m9511c(j3);
                        iM2457x += iM9511c + iM9510b;
                    }
                    zzaffVar = this;
                    break;
                case 3:
                    if (zzaffVar.m9642q(zzaduVar2, i5, i4, i6, i2)) {
                        long j4 = unsafe.getLong(zzaduVar2, j2);
                        iM9510b = zzada.m9510b(i7 << 3);
                        iM9511c = zzada.m9511c(j4);
                        iM2457x += iM9511c + iM9510b;
                    }
                    zzaffVar = this;
                    break;
                case 4:
                    if (zzaffVar.m9642q(zzaduVar2, i5, i4, i6, i2)) {
                        long j5 = unsafe.getInt(zzaduVar2, j2);
                        iM9510b = zzada.m9510b(i7 << 3);
                        iM9511c = zzada.m9511c(j5);
                        iM2457x += iM9511c + iM9510b;
                    }
                    zzaffVar = this;
                    break;
                case 5:
                    if (zzaffVar.m9642q(zzaduVar2, i5, i4, i6, i2)) {
                        iM2457x = AbstractC1456a.m2457x(i7 << 3, 8, iM2457x);
                    }
                    zzaffVar = this;
                    zzaduVar2 = zzaduVar;
                    break;
                case 6:
                    if (zzaffVar.m9642q(zzaduVar2, i5, i4, i6, i2)) {
                        iM2457x = AbstractC1456a.m2457x(i7 << 3, 4, iM2457x);
                    }
                    zzaffVar = this;
                    zzaduVar2 = zzaduVar;
                    break;
                case 7:
                    if (zzaffVar.m9642q(zzaduVar2, i5, i4, i6, i2)) {
                        iM2457x = AbstractC1456a.m2457x(i7 << 3, 1, iM2457x);
                    }
                    zzaffVar = this;
                    zzaduVar2 = zzaduVar;
                    break;
                case 8:
                    if (zzaffVar.m9642q(zzaduVar2, i5, i4, i6, i2)) {
                        int i11 = i7 << 3;
                        Object object = unsafe.getObject(zzaduVar2, j2);
                        if (object instanceof zzacr) {
                            int iM9510b7 = zzada.m9510b(i11);
                            int iMo9373b = ((zzacr) object).mo9373b();
                            iM2457x = AbstractC1456a.m2458y(iMo9373b, iMo9373b, iM9510b7, iM2457x);
                        } else {
                            int iM9510b8 = zzada.m9510b(i11);
                            int iM9717b = zzagl.m9717b((String) object);
                            iM2457x = AbstractC1456a.m2458y(iM9717b, iM9717b, iM9510b8, iM2457x);
                        }
                    }
                    zzaffVar = this;
                    break;
                case 9:
                    if (zzaffVar.m9642q(zzaduVar2, i5, i4, i6, i2)) {
                        iM9663m = zzafq.m9663m(i7, unsafe.getObject(zzaduVar2, j2), zzaffVar.m9622D(i5));
                        iM2457x += iM9663m;
                    }
                    break;
                case 10:
                    if (zzaffVar.m9642q(zzaduVar2, i5, i4, i6, i2)) {
                        zzacr zzacrVar = (zzacr) unsafe.getObject(zzaduVar2, j2);
                        int iM9510b9 = zzada.m9510b(i7 << 3);
                        int iMo9373b2 = zzacrVar.mo9373b();
                        iM2457x = AbstractC1456a.m2458y(iMo9373b2, iMo9373b2, iM9510b9, iM2457x);
                    }
                    zzaffVar = this;
                    break;
                case 11:
                    if (zzaffVar.m9642q(zzaduVar2, i5, i4, i6, i2)) {
                        iM2457x = AbstractC1456a.m2457x(unsafe.getInt(zzaduVar2, j2), zzada.m9510b(i7 << 3), iM2457x);
                    }
                    zzaffVar = this;
                    break;
                case 12:
                    if (zzaffVar.m9642q(zzaduVar2, i5, i4, i6, i2)) {
                        long j6 = unsafe.getInt(zzaduVar2, j2);
                        iM9510b = zzada.m9510b(i7 << 3);
                        iM9511c = zzada.m9511c(j6);
                        iM2457x += iM9511c + iM9510b;
                    }
                    zzaffVar = this;
                    break;
                case 13:
                    if (zzaffVar.m9642q(zzaduVar2, i5, i4, i6, i2)) {
                        iM2457x = AbstractC1456a.m2457x(i7 << 3, 4, iM2457x);
                    }
                    zzaffVar = this;
                    zzaduVar2 = zzaduVar;
                    break;
                case 14:
                    if (zzaffVar.m9642q(zzaduVar2, i5, i4, i6, i2)) {
                        iM2457x = AbstractC1456a.m2457x(i7 << 3, 8, iM2457x);
                    }
                    zzaffVar = this;
                    zzaduVar2 = zzaduVar;
                    break;
                case 15:
                    if (zzaffVar.m9642q(zzaduVar2, i5, i4, i6, i2)) {
                        int i12 = unsafe.getInt(zzaduVar2, j2);
                        iM2457x = AbstractC1456a.m2457x((i12 >> 31) ^ (i12 + i12), zzada.m9510b(i7 << 3), iM2457x);
                    }
                    zzaffVar = this;
                    break;
                case 16:
                    if (zzaffVar.m9642q(zzaduVar2, i5, i4, i6, i2)) {
                        long j7 = unsafe.getLong(zzaduVar2, j2);
                        iM9510b = zzada.m9510b(i7 << 3);
                        iM9511c = zzada.m9511c((j7 >> 63) ^ (j7 + j7));
                        iM2457x += iM9511c + iM9510b;
                    }
                    zzaffVar = this;
                    break;
                case 17:
                    if (zzaffVar.m9642q(zzaduVar2, i5, i4, i6, i2)) {
                        zzafc zzafcVar = (zzafc) unsafe.getObject(zzaduVar2, j2);
                        zzafp zzafpVarM9622D = zzaffVar.m9622D(i5);
                        zzagb zzagbVar = zzafq.f22104a;
                        int iM9510b10 = zzada.m9510b(i7 << 3);
                        iMo9347j = ((zzacb) zzafcVar).mo9347j(zzafpVarM9622D) + iM9510b10 + iM9510b10;
                        iM2457x += iMo9347j;
                    }
                    break;
                case 18:
                    iM9662l = zzafq.m9662l(i7, (List) unsafe.getObject(zzaduVar2, j2));
                    iM2457x += iM9662l;
                    i4 = i4;
                    break;
                case 19:
                    iM9662l = zzafq.m9661k(i7, (List) unsafe.getObject(zzaduVar2, j2));
                    iM2457x += iM9662l;
                    i4 = i4;
                    break;
                case 20:
                    i4 = i4;
                    List list = (List) unsafe.getObject(zzaduVar2, j2);
                    zzagb zzagbVar2 = zzafq.f22104a;
                    if (list.size() == 0) {
                        iM9510b2 = 0;
                    } else {
                        iM9510b2 = (zzada.m9510b(i7 << 3) * list.size()) + zzafq.m9654d(list);
                    }
                    iM2457x += iM9510b2;
                    i4 = i4;
                    break;
                case 21:
                    i4 = i4;
                    List list2 = (List) unsafe.getObject(zzaduVar2, j2);
                    zzagb zzagbVar3 = zzafq.f22104a;
                    size = list2.size();
                    if (size == 0) {
                        iM9510b4 = 0;
                    } else {
                        iM9655e = zzafq.m9655e(list2);
                        iM9510b3 = zzada.m9510b(i7 << 3);
                        iM9510b4 = (iM9510b3 * size) + iM9655e;
                    }
                    iM2457x += iM9510b4;
                    i4 = i4;
                    break;
                case 22:
                    i4 = i4;
                    List list3 = (List) unsafe.getObject(zzaduVar2, j2);
                    zzagb zzagbVar4 = zzafq.f22104a;
                    size = list3.size();
                    if (size == 0) {
                        iM9510b4 = 0;
                    } else {
                        iM9655e = zzafq.m9658h(list3);
                        iM9510b3 = zzada.m9510b(i7 << 3);
                        iM9510b4 = (iM9510b3 * size) + iM9655e;
                    }
                    iM2457x += iM9510b4;
                    i4 = i4;
                    break;
                case 23:
                    iM9662l = zzafq.m9662l(i7, (List) unsafe.getObject(zzaduVar2, j2));
                    iM2457x += iM9662l;
                    i4 = i4;
                    break;
                case 24:
                    iM9662l = zzafq.m9661k(i7, (List) unsafe.getObject(zzaduVar2, j2));
                    iM2457x += iM9662l;
                    i4 = i4;
                    break;
                case 25:
                    i4 = i4;
                    List list4 = (List) unsafe.getObject(zzaduVar2, j2);
                    zzagb zzagbVar5 = zzafq.f22104a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iM9510b2 = 0;
                    } else {
                        iM9510b2 = (zzada.m9510b(i7 << 3) + 1) * size2;
                    }
                    iM2457x += iM9510b2;
                    i4 = i4;
                    break;
                case 26:
                    i4 = i4;
                    List list5 = (List) unsafe.getObject(zzaduVar2, j2);
                    zzagb zzagbVar6 = zzafq.f22104a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iM9510b4 = 0;
                    } else {
                        iM9510b4 = zzada.m9510b(i7 << 3) * size3;
                        if (list5 instanceof zzaen) {
                            zzaen zzaenVar = (zzaen) list5;
                            for (int i13 = 0; i13 < size3; i13++) {
                                Object objZzc = zzaenVar.zzc();
                                if (objZzc instanceof zzacr) {
                                    int iMo9373b3 = ((zzacr) objZzc).mo9373b();
                                    iM9510b4 = AbstractC1456a.m2457x(iMo9373b3, iMo9373b3, iM9510b4);
                                } else {
                                    int iM9717b2 = zzagl.m9717b((String) objZzc);
                                    iM9510b4 = AbstractC1456a.m2457x(iM9717b2, iM9717b2, iM9510b4);
                                }
                            }
                        } else {
                            for (int i14 = 0; i14 < size3; i14++) {
                                Object obj2 = list5.get(i14);
                                if (obj2 instanceof zzacr) {
                                    int iMo9373b4 = ((zzacr) obj2).mo9373b();
                                    iM9510b4 = AbstractC1456a.m2457x(iMo9373b4, iMo9373b4, iM9510b4);
                                } else {
                                    int iM9717b3 = zzagl.m9717b((String) obj2);
                                    iM9510b4 = AbstractC1456a.m2457x(iM9717b3, iM9717b3, iM9510b4);
                                }
                            }
                        }
                    }
                    iM2457x += iM9510b4;
                    i4 = i4;
                    break;
                case 27:
                    i4 = i4;
                    List list6 = (List) unsafe.getObject(zzaduVar2, j2);
                    zzafp zzafpVarM9622D2 = zzaffVar.m9622D(i5);
                    zzagb zzagbVar7 = zzafq.f22104a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iM9510b5 = 0;
                    } else {
                        iM9510b5 = zzada.m9510b(i7 << 3) * size4;
                        for (int i15 = 0; i15 < size4; i15++) {
                            Object obj3 = list6.get(i15);
                            if (obj3 instanceof zzaem) {
                                int iM9598a = ((zzaem) obj3).m9598a();
                                iM9510b5 = AbstractC1456a.m2457x(iM9598a, iM9598a, iM9510b5);
                            } else {
                                int iMo9347j3 = ((zzacb) obj3).mo9347j(zzafpVarM9622D2);
                                iM9510b5 = AbstractC1456a.m2457x(iMo9347j3, iMo9347j3, iM9510b5);
                            }
                        }
                    }
                    iM2457x += iM9510b5;
                    i4 = i4;
                    break;
                case 28:
                    i4 = i4;
                    List list7 = (List) unsafe.getObject(zzaduVar2, j2);
                    zzagb zzagbVar8 = zzafq.f22104a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iM9510b4 = 0;
                    } else {
                        iM9510b4 = zzada.m9510b(i7 << 3) * size5;
                        for (int i16 = 0; i16 < list7.size(); i16++) {
                            int iMo9373b5 = ((zzacr) list7.get(i16)).mo9373b();
                            iM9510b4 = AbstractC1456a.m2457x(iMo9373b5, iMo9373b5, iM9510b4);
                        }
                    }
                    iM2457x += iM9510b4;
                    i4 = i4;
                    break;
                case 29:
                    i4 = i4;
                    List list8 = (List) unsafe.getObject(zzaduVar2, j2);
                    zzagb zzagbVar9 = zzafq.f22104a;
                    size = list8.size();
                    if (size == 0) {
                        iM9510b4 = 0;
                    } else {
                        iM9655e = zzafq.m9659i(list8);
                        iM9510b3 = zzada.m9510b(i7 << 3);
                        iM9510b4 = (iM9510b3 * size) + iM9655e;
                    }
                    iM2457x += iM9510b4;
                    i4 = i4;
                    break;
                case 30:
                    i4 = i4;
                    List list9 = (List) unsafe.getObject(zzaduVar2, j2);
                    zzagb zzagbVar10 = zzafq.f22104a;
                    size = list9.size();
                    if (size == 0) {
                        iM9510b4 = 0;
                    } else {
                        iM9655e = zzafq.m9657g(list9);
                        iM9510b3 = zzada.m9510b(i7 << 3);
                        iM9510b4 = (iM9510b3 * size) + iM9655e;
                    }
                    iM2457x += iM9510b4;
                    i4 = i4;
                    break;
                case 31:
                    iM9662l = zzafq.m9661k(i7, (List) unsafe.getObject(zzaduVar2, j2));
                    iM2457x += iM9662l;
                    i4 = i4;
                    break;
                case 32:
                    iM9662l = zzafq.m9662l(i7, (List) unsafe.getObject(zzaduVar2, j2));
                    iM2457x += iM9662l;
                    i4 = i4;
                    break;
                case 33:
                    i4 = i4;
                    List list10 = (List) unsafe.getObject(zzaduVar2, j2);
                    zzagb zzagbVar11 = zzafq.f22104a;
                    size = list10.size();
                    if (size == 0) {
                        iM9510b4 = 0;
                    } else {
                        iM9655e = zzafq.m9660j(list10);
                        iM9510b3 = zzada.m9510b(i7 << 3);
                        iM9510b4 = (iM9510b3 * size) + iM9655e;
                    }
                    iM2457x += iM9510b4;
                    i4 = i4;
                    break;
                case 34:
                    i4 = i4;
                    List list11 = (List) unsafe.getObject(zzaduVar2, j2);
                    zzagb zzagbVar12 = zzafq.f22104a;
                    size = list11.size();
                    if (size == 0) {
                        iM9510b4 = 0;
                    } else {
                        iM9655e = zzafq.m9656f(list11);
                        iM9510b3 = zzada.m9510b(i7 << 3);
                        iM9510b4 = (iM9510b3 * size) + iM9655e;
                    }
                    iM2457x += iM9510b4;
                    i4 = i4;
                    break;
                case 35:
                    i4 = i4;
                    List list12 = (List) unsafe.getObject(zzaduVar2, j2);
                    zzagb zzagbVar13 = zzafq.f22104a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        iM2457x = AbstractC1456a.m2458y(size6, zzada.m9510b(i7 << 3), size6, iM2457x);
                    }
                    i4 = i4;
                    break;
                case 36:
                    i4 = i4;
                    List list13 = (List) unsafe.getObject(zzaduVar2, j2);
                    zzagb zzagbVar14 = zzafq.f22104a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        iM2457x = AbstractC1456a.m2458y(size7, zzada.m9510b(i7 << 3), size7, iM2457x);
                    }
                    i4 = i4;
                    break;
                case 37:
                    i4 = i4;
                    int iM9654d = zzafq.m9654d((List) unsafe.getObject(zzaduVar2, j2));
                    if (iM9654d > 0) {
                        iM2457x = AbstractC1456a.m2458y(iM9654d, zzada.m9510b(i7 << 3), iM9654d, iM2457x);
                    }
                    i4 = i4;
                    break;
                case 38:
                    i4 = i4;
                    int iM9655e2 = zzafq.m9655e((List) unsafe.getObject(zzaduVar2, j2));
                    if (iM9655e2 > 0) {
                        iM2457x = AbstractC1456a.m2458y(iM9655e2, zzada.m9510b(i7 << 3), iM9655e2, iM2457x);
                    }
                    i4 = i4;
                    break;
                case 39:
                    i4 = i4;
                    int iM9658h = zzafq.m9658h((List) unsafe.getObject(zzaduVar2, j2));
                    if (iM9658h > 0) {
                        iM2457x = AbstractC1456a.m2458y(iM9658h, zzada.m9510b(i7 << 3), iM9658h, iM2457x);
                    }
                    i4 = i4;
                    break;
                case 40:
                    i4 = i4;
                    List list14 = (List) unsafe.getObject(zzaduVar2, j2);
                    zzagb zzagbVar15 = zzafq.f22104a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        iM2457x = AbstractC1456a.m2458y(size8, zzada.m9510b(i7 << 3), size8, iM2457x);
                    }
                    i4 = i4;
                    break;
                case 41:
                    i4 = i4;
                    List list15 = (List) unsafe.getObject(zzaduVar2, j2);
                    zzagb zzagbVar16 = zzafq.f22104a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        iM2457x = AbstractC1456a.m2458y(size9, zzada.m9510b(i7 << 3), size9, iM2457x);
                    }
                    i4 = i4;
                    break;
                case 42:
                    i4 = i4;
                    List list16 = (List) unsafe.getObject(zzaduVar2, j2);
                    zzagb zzagbVar17 = zzafq.f22104a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        iM2457x = AbstractC1456a.m2458y(size10, zzada.m9510b(i7 << 3), size10, iM2457x);
                    }
                    i4 = i4;
                    break;
                case 43:
                    i4 = i4;
                    int iM9659i = zzafq.m9659i((List) unsafe.getObject(zzaduVar2, j2));
                    if (iM9659i > 0) {
                        iM2457x = AbstractC1456a.m2458y(iM9659i, zzada.m9510b(i7 << 3), iM9659i, iM2457x);
                    }
                    i4 = i4;
                    break;
                case 44:
                    i4 = i4;
                    int iM9657g = zzafq.m9657g((List) unsafe.getObject(zzaduVar2, j2));
                    if (iM9657g > 0) {
                        iM2457x = AbstractC1456a.m2458y(iM9657g, zzada.m9510b(i7 << 3), iM9657g, iM2457x);
                    }
                    i4 = i4;
                    break;
                case 45:
                    i4 = i4;
                    List list17 = (List) unsafe.getObject(zzaduVar2, j2);
                    zzagb zzagbVar18 = zzafq.f22104a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        iM2457x = AbstractC1456a.m2458y(size11, zzada.m9510b(i7 << 3), size11, iM2457x);
                    }
                    i4 = i4;
                    break;
                case 46:
                    i4 = i4;
                    List list18 = (List) unsafe.getObject(zzaduVar2, j2);
                    zzagb zzagbVar19 = zzafq.f22104a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        iM2457x = AbstractC1456a.m2458y(size12, zzada.m9510b(i7 << 3), size12, iM2457x);
                    }
                    i4 = i4;
                    break;
                case 47:
                    i4 = i4;
                    int iM9660j = zzafq.m9660j((List) unsafe.getObject(zzaduVar2, j2));
                    if (iM9660j > 0) {
                        iM2457x = AbstractC1456a.m2458y(iM9660j, zzada.m9510b(i7 << 3), iM9660j, iM2457x);
                    }
                    i4 = i4;
                    break;
                case 48:
                    i4 = i4;
                    int iM9656f = zzafq.m9656f((List) unsafe.getObject(zzaduVar2, j2));
                    if (iM9656f > 0) {
                        iM2457x = AbstractC1456a.m2458y(iM9656f, zzada.m9510b(i7 << 3), iM9656f, iM2457x);
                    }
                    i4 = i4;
                    break;
                case 49:
                    i4 = i4;
                    List list19 = (List) unsafe.getObject(zzaduVar2, j2);
                    zzafp zzafpVarM9622D3 = zzaffVar.m9622D(i5);
                    zzagb zzagbVar20 = zzafq.f22104a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        iMo9347j2 = 0;
                    } else {
                        iMo9347j2 = 0;
                        for (int i17 = 0; i17 < size13; i17++) {
                            zzafc zzafcVar2 = (zzafc) list19.get(i17);
                            int iM9510b11 = zzada.m9510b(i7 << 3);
                            iMo9347j2 += ((zzacb) zzafcVar2).mo9347j(zzafpVarM9622D3) + iM9510b11 + iM9510b11;
                        }
                    }
                    iM2457x += iMo9347j2;
                    i4 = i4;
                    break;
                case 50:
                    zzaew zzaewVar = (zzaew) unsafe.getObject(zzaduVar2, j2);
                    zzaev zzaevVar = (zzaev) zzaffVar.m9623E(i5);
                    if (zzaewVar.isEmpty()) {
                        iMo9347j2 = 0;
                    } else {
                        iMo9347j2 = 0;
                        for (Map.Entry entry2 : zzaewVar.entrySet()) {
                            Object key = entry2.getKey();
                            Object value = entry2.getValue();
                            zzaeu zzaeuVar = zzaevVar.f22068a;
                            int iM9510b12 = zzada.m9510b(i7 << 3);
                            int i18 = i4;
                            int iM9539e = zzadk.m9539e(zzaeuVar.f22065a, 1, key) + zzadk.m9539e(zzaeuVar.f22066b, 2, value);
                            iMo9347j2 = AbstractC1456a.m2458y(iM9539e, iM9539e, iM9510b12, iMo9347j2);
                            i4 = i18;
                        }
                    }
                    i4 = i4;
                    iM2457x += iMo9347j2;
                    i4 = i4;
                    break;
                case 51:
                    if (zzaffVar.m9645t(i7, i5, zzaduVar2)) {
                        iM2457x = AbstractC1456a.m2457x(i7 << 3, 8, iM2457x);
                    }
                    break;
                case 52:
                    if (zzaffVar.m9645t(i7, i5, zzaduVar2)) {
                        iM2457x = AbstractC1456a.m2457x(i7 << 3, 4, iM2457x);
                    }
                    break;
                case 53:
                    if (zzaffVar.m9645t(i7, i5, zzaduVar2)) {
                        long jM9616o = m9616o(j2, zzaduVar2);
                        iM9510b6 = zzada.m9510b(i7 << 3);
                        iM9511c2 = zzada.m9511c(jM9616o);
                        iM2457x += iM9511c2 + iM9510b6;
                    }
                    break;
                case 54:
                    if (zzaffVar.m9645t(i7, i5, zzaduVar2)) {
                        long jM9616o2 = m9616o(j2, zzaduVar2);
                        iM9510b6 = zzada.m9510b(i7 << 3);
                        iM9511c2 = zzada.m9511c(jM9616o2);
                        iM2457x += iM9511c2 + iM9510b6;
                    }
                    break;
                case 55:
                    if (zzaffVar.m9645t(i7, i5, zzaduVar2)) {
                        long jM9615n = m9615n(j2, zzaduVar2);
                        iM9510b6 = zzada.m9510b(i7 << 3);
                        iM9511c2 = zzada.m9511c(jM9615n);
                        iM2457x += iM9511c2 + iM9510b6;
                    }
                    break;
                case 56:
                    if (zzaffVar.m9645t(i7, i5, zzaduVar2)) {
                        iM2457x = AbstractC1456a.m2457x(i7 << 3, 8, iM2457x);
                    }
                    break;
                case 57:
                    if (zzaffVar.m9645t(i7, i5, zzaduVar2)) {
                        iM2457x = AbstractC1456a.m2457x(i7 << 3, 4, iM2457x);
                    }
                    break;
                case 58:
                    if (zzaffVar.m9645t(i7, i5, zzaduVar2)) {
                        iM2457x = AbstractC1456a.m2457x(i7 << 3, 1, iM2457x);
                    }
                    break;
                case 59:
                    if (zzaffVar.m9645t(i7, i5, zzaduVar2)) {
                        int i19 = i7 << 3;
                        Object object2 = unsafe.getObject(zzaduVar2, j2);
                        if (object2 instanceof zzacr) {
                            int iM9510b13 = zzada.m9510b(i19);
                            int iMo9373b6 = ((zzacr) object2).mo9373b();
                            iM2457x = AbstractC1456a.m2458y(iMo9373b6, iMo9373b6, iM9510b13, iM2457x);
                        } else {
                            int iM9510b14 = zzada.m9510b(i19);
                            int iM9717b4 = zzagl.m9717b((String) object2);
                            iM2457x = AbstractC1456a.m2458y(iM9717b4, iM9717b4, iM9510b14, iM2457x);
                        }
                    }
                    break;
                case 60:
                    if (zzaffVar.m9645t(i7, i5, zzaduVar2)) {
                        iM9663m = zzafq.m9663m(i7, unsafe.getObject(zzaduVar2, j2), zzaffVar.m9622D(i5));
                        iM2457x += iM9663m;
                    }
                    break;
                case 61:
                    if (zzaffVar.m9645t(i7, i5, zzaduVar2)) {
                        zzacr zzacrVar2 = (zzacr) unsafe.getObject(zzaduVar2, j2);
                        int iM9510b15 = zzada.m9510b(i7 << 3);
                        int iMo9373b7 = zzacrVar2.mo9373b();
                        iM2457x = AbstractC1456a.m2458y(iMo9373b7, iMo9373b7, iM9510b15, iM2457x);
                    }
                    break;
                case 62:
                    if (zzaffVar.m9645t(i7, i5, zzaduVar2)) {
                        iM2457x = AbstractC1456a.m2457x(m9615n(j2, zzaduVar2), zzada.m9510b(i7 << 3), iM2457x);
                    }
                    break;
                case 63:
                    if (zzaffVar.m9645t(i7, i5, zzaduVar2)) {
                        long jM9615n2 = m9615n(j2, zzaduVar2);
                        iM9510b6 = zzada.m9510b(i7 << 3);
                        iM9511c2 = zzada.m9511c(jM9615n2);
                        iM2457x += iM9511c2 + iM9510b6;
                    }
                    break;
                case 64:
                    if (zzaffVar.m9645t(i7, i5, zzaduVar2)) {
                        iM2457x = AbstractC1456a.m2457x(i7 << 3, 4, iM2457x);
                    }
                    break;
                case 65:
                    if (zzaffVar.m9645t(i7, i5, zzaduVar2)) {
                        iM2457x = AbstractC1456a.m2457x(i7 << 3, 8, iM2457x);
                    }
                    break;
                case 66:
                    if (zzaffVar.m9645t(i7, i5, zzaduVar2)) {
                        int iM9615n = m9615n(j2, zzaduVar2);
                        iM2457x = AbstractC1456a.m2457x((iM9615n >> 31) ^ (iM9615n + iM9615n), zzada.m9510b(i7 << 3), iM2457x);
                    }
                    break;
                case 67:
                    if (zzaffVar.m9645t(i7, i5, zzaduVar2)) {
                        long jM9616o3 = m9616o(j2, zzaduVar2);
                        iM9510b6 = zzada.m9510b(i7 << 3);
                        iM9511c2 = zzada.m9511c((jM9616o3 >> 63) ^ (jM9616o3 + jM9616o3));
                        iM2457x += iM9511c2 + iM9510b6;
                    }
                    break;
                case 68:
                    if (zzaffVar.m9645t(i7, i5, zzaduVar2)) {
                        zzafc zzafcVar3 = (zzafc) unsafe.getObject(zzaduVar2, j2);
                        zzafp zzafpVarM9622D4 = zzaffVar.m9622D(i5);
                        zzagb zzagbVar21 = zzafq.f22104a;
                        int iM9510b16 = zzada.m9510b(i7 << 3);
                        iMo9347j = ((zzacb) zzafcVar3).mo9347j(zzafpVarM9622D4) + iM9510b16 + iM9510b16;
                        iM2457x += iMo9347j;
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:140:0x021d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x01d1 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzafp
    /* JADX INFO: renamed from: f */
    public final boolean mo9636f(zzadu zzaduVar, zzadu zzaduVar2) {
        boolean zM9651a;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f22076a;
            if (i2 < iArr.length) {
                int iM9640j = m9640j(i2);
                int iM9612k = m9612k(iM9640j);
                if (iM9612k <= 50 || iM9612k >= 69) {
                    long j2 = iM9640j & 1048575;
                    switch (iM9612k) {
                        case 0:
                            if (m9641p(zzaduVar, zzaduVar2, i2)) {
                                zzagf zzagfVar = zzagg.f22130c;
                                if (Double.doubleToLongBits(zzagfVar.mo9696f(j2, zzaduVar)) != Double.doubleToLongBits(zzagfVar.mo9696f(j2, zzaduVar2))) {
                                }
                            }
                            break;
                        case 1:
                            if (m9641p(zzaduVar, zzaduVar2, i2)) {
                                zzagf zzagfVar2 = zzagg.f22130c;
                                if (Float.floatToIntBits(zzagfVar2.mo9694d(j2, zzaduVar)) != Float.floatToIntBits(zzagfVar2.mo9694d(j2, zzaduVar2))) {
                                }
                            }
                            break;
                        case 2:
                            if (!m9641p(zzaduVar, zzaduVar2, i2) || zzagg.m9704g(j2, zzaduVar) != zzagg.m9704g(j2, zzaduVar2)) {
                            }
                            break;
                        case 3:
                            if (!m9641p(zzaduVar, zzaduVar2, i2) || zzagg.m9704g(j2, zzaduVar) != zzagg.m9704g(j2, zzaduVar2)) {
                            }
                            break;
                        case 4:
                            if (!m9641p(zzaduVar, zzaduVar2, i2) || zzagg.m9702e(j2, zzaduVar) != zzagg.m9702e(j2, zzaduVar2)) {
                            }
                            break;
                        case 5:
                            if (!m9641p(zzaduVar, zzaduVar2, i2) || zzagg.m9704g(j2, zzaduVar) != zzagg.m9704g(j2, zzaduVar2)) {
                            }
                            break;
                        case 6:
                            if (!m9641p(zzaduVar, zzaduVar2, i2) || zzagg.m9702e(j2, zzaduVar) != zzagg.m9702e(j2, zzaduVar2)) {
                            }
                            break;
                        case 7:
                            if (m9641p(zzaduVar, zzaduVar2, i2)) {
                                zzagf zzagfVar3 = zzagg.f22130c;
                                if (zzagfVar3.mo9692b(j2, zzaduVar) != zzagfVar3.mo9692b(j2, zzaduVar2)) {
                                }
                            }
                            break;
                        case 8:
                            if (!m9641p(zzaduVar, zzaduVar2, i2) || !zzafq.m9651a(zzagg.m9706i(j2, zzaduVar), zzagg.m9706i(j2, zzaduVar2))) {
                            }
                            break;
                        case 9:
                            if (!m9641p(zzaduVar, zzaduVar2, i2) || !zzafq.m9651a(zzagg.m9706i(j2, zzaduVar), zzagg.m9706i(j2, zzaduVar2))) {
                            }
                            break;
                        case 10:
                            if (!m9641p(zzaduVar, zzaduVar2, i2) || !zzafq.m9651a(zzagg.m9706i(j2, zzaduVar), zzagg.m9706i(j2, zzaduVar2))) {
                            }
                            break;
                        case 11:
                            if (!m9641p(zzaduVar, zzaduVar2, i2) || zzagg.m9702e(j2, zzaduVar) != zzagg.m9702e(j2, zzaduVar2)) {
                            }
                            break;
                        case 12:
                            if (!m9641p(zzaduVar, zzaduVar2, i2) || zzagg.m9702e(j2, zzaduVar) != zzagg.m9702e(j2, zzaduVar2)) {
                            }
                            break;
                        case 13:
                            if (!m9641p(zzaduVar, zzaduVar2, i2) || zzagg.m9702e(j2, zzaduVar) != zzagg.m9702e(j2, zzaduVar2)) {
                            }
                            break;
                        case 14:
                            if (!m9641p(zzaduVar, zzaduVar2, i2) || zzagg.m9704g(j2, zzaduVar) != zzagg.m9704g(j2, zzaduVar2)) {
                            }
                            break;
                        case 15:
                            if (!m9641p(zzaduVar, zzaduVar2, i2) || zzagg.m9702e(j2, zzaduVar) != zzagg.m9702e(j2, zzaduVar2)) {
                            }
                            break;
                        case 16:
                            if (!m9641p(zzaduVar, zzaduVar2, i2) || zzagg.m9704g(j2, zzaduVar) != zzagg.m9704g(j2, zzaduVar2)) {
                            }
                            break;
                        case 17:
                            if (!m9641p(zzaduVar, zzaduVar2, i2) || !zzafq.m9651a(zzagg.m9706i(j2, zzaduVar), zzagg.m9706i(j2, zzaduVar2))) {
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
                            zM9651a = zzafq.m9651a(zzagg.m9706i(j2, zzaduVar), zzagg.m9706i(j2, zzaduVar2));
                            if (zM9651a) {
                            }
                            break;
                        case 50:
                            zM9651a = zzafq.m9651a(zzagg.m9706i(j2, zzaduVar), zzagg.m9706i(j2, zzaduVar2));
                            if (zM9651a) {
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
                            if (zzagg.m9702e(j3, zzaduVar) == zzagg.m9702e(j3, zzaduVar2) && zzafq.m9651a(zzagg.m9706i(j2, zzaduVar), zzagg.m9706i(j2, zzaduVar2))) {
                            }
                            break;
                        default:
                            continue;
                    }
                }
                i2 += 3;
            } else {
                int i3 = this.f22085j;
                while (true) {
                    int[] iArr2 = this.f22083h;
                    if (i3 < iArr2.length) {
                        int i4 = iArr2[i3];
                        long j4 = iArr[i4 + 2] & 1048575;
                        if (zzagg.m9702e(j4, zzaduVar) == zzagg.m9702e(j4, zzaduVar2)) {
                            if (!m9645t(0, i4, zzaduVar)) {
                                long jM9640j = m9640j(i4) & 1048575;
                                if (!zzafq.m9651a(zzagg.m9706i(jM9640j, zzaduVar), zzagg.m9706i(jM9640j, zzaduVar2))) {
                                }
                            }
                            i3++;
                        }
                    } else if (zzaduVar.zzc.equals(zzaduVar2.zzc)) {
                        if (this.f22081f) {
                            return ((zzadr) zzaduVar).zzb.equals(((zzadr) zzaduVar2).zzb);
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    /* JADX INFO: renamed from: g */
    public final void mo9637g(Object obj, byte[] bArr, int i2, int i3, zzacg zzacgVar) {
        m9648y(obj, bArr, i2, i3, 0, zzacgVar);
    }

    /* JADX WARN: Code duplicated, block: B:202:0x05c3 A[LOOP:2: B:201:0x05c1->B:202:0x05c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:204:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:206:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:212:0x05e7 A[LOOP:1: B:211:0x05e5->B:212:0x05e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:215:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:233:0x05b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzafp
    /* JADX INFO: renamed from: h */
    public final void mo9638h(Object obj, zzacw zzacwVar, zzadf zzadfVar) throws Throwable {
        Object obj2;
        Object objM9629K;
        zzafz zzafzVar;
        Object obj3;
        Object objM9629K2;
        Object obj4;
        zzaff<T> zzaffVar;
        Object obj5;
        zzaff<T> zzaffVar2 = this;
        int[] iArr = zzaffVar2.f22083h;
        int i2 = zzaffVar2.f22085j;
        int i3 = zzaffVar2.f22084i;
        zzadfVar.getClass();
        m9614m(obj);
        Throwable th = null;
        zzafz zzafzVar2 = zzaffVar2.f22086k;
        Object objMo9682h = null;
        while (true) {
            try {
                int iM9477x = zzacwVar.m9477x();
                int iM9647v = (iM9477x < zzaffVar2.f22078c || iM9477x > zzaffVar2.f22079d) ? -1 : zzaffVar2.m9647v(iM9477x, 0);
                if (iM9647v >= 0) {
                    obj4 = obj;
                    int iM9640j = zzaffVar2.m9640j(iM9647v);
                    try {
                        try {
                            switch (m9612k(iM9640j)) {
                                case 0:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    try {
                                        obj5 = obj;
                                        try {
                                            zzagg.f22130c.mo9697g(obj5, iM9640j & 1048575, zzacwVar.m9478y());
                                            zzaffVar.m9644s(iM9647v, obj5);
                                            zzaffVar2 = zzaffVar;
                                            objMo9682h = obj3;
                                            th = null;
                                        } catch (zzaeg unused) {
                                            obj2 = obj5;
                                            objMo9682h = obj3;
                                            if (objMo9682h == null) {
                                                try {
                                                    objMo9682h = zzafzVar2.mo9682h(obj2);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                            }
                                            if (!zzafzVar2.m9685k(0, zzacwVar, objMo9682h)) {
                                                objM9629K2 = objMo9682h;
                                                while (i3 < i2) {
                                                    zzafz zzafzVar3 = zzafzVar2;
                                                    objM9629K2 = zzaffVar.m9629K(obj2, iArr[i3], objM9629K2, zzafzVar3, obj);
                                                    zzafzVar2 = zzafzVar3;
                                                    i3++;
                                                    zzaffVar = this;
                                                }
                                                if (objM9629K2 != null) {
                                                    zzafzVar2.mo9683i(obj2, objM9629K2);
                                                }
                                            }
                                            th = null;
                                            zzaffVar2 = this;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            obj2 = obj5;
                                        }
                                    } catch (zzaeg unused2) {
                                        obj2 = obj;
                                        objMo9682h = obj3;
                                        if (objMo9682h == null) {
                                            objMo9682h = zzafzVar2.mo9682h(obj2);
                                        }
                                        if (!zzafzVar2.m9685k(0, zzacwVar, objMo9682h)) {
                                            objM9629K2 = objMo9682h;
                                            while (i3 < i2) {
                                                zzafz zzafzVar4 = zzafzVar2;
                                                objM9629K2 = zzaffVar.m9629K(obj2, iArr[i3], objM9629K2, zzafzVar4, obj);
                                                zzafzVar2 = zzafzVar4;
                                                i3++;
                                                zzaffVar = this;
                                            }
                                            if (objM9629K2 != null) {
                                                zzafzVar2.mo9683i(obj2, objM9629K2);
                                            }
                                        }
                                        th = null;
                                        zzaffVar2 = this;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj2 = obj;
                                    }
                                    break;
                                case 1:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzagg.f22130c.mo9695e(obj4, iM9640j & 1048575, zzacwVar.m9479z());
                                    zzaffVar.m9644s(iM9647v, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 2:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzagg.m9705h(obj4, iM9640j & 1048575, zzacwVar.m9437B());
                                    zzaffVar.m9644s(iM9647v, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 3:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzagg.m9705h(obj4, iM9640j & 1048575, zzacwVar.m9436A());
                                    zzaffVar.m9644s(iM9647v, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 4:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzagg.m9703f(obj4, zzacwVar.m9438C(), iM9640j & 1048575);
                                    zzaffVar.m9644s(iM9647v, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 5:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzagg.m9705h(obj4, iM9640j & 1048575, zzacwVar.m9439D());
                                    zzaffVar.m9644s(iM9647v, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 6:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzagg.m9703f(obj4, zzacwVar.m9440E(), iM9640j & 1048575);
                                    zzaffVar.m9644s(iM9647v, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 7:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzagg.f22130c.mo9693c(obj4, iM9640j & 1048575, zzacwVar.m9441F());
                                    zzaffVar.m9644s(iM9647v, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 8:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar.m9630L(iM9640j, zzacwVar, obj4);
                                    zzaffVar.m9644s(iM9647v, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 9:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzafc zzafcVar = (zzafc) zzaffVar.m9625G(iM9647v, obj4);
                                    zzacwVar.m9444I(zzafcVar, zzaffVar.m9622D(iM9647v), zzadfVar);
                                    zzaffVar.m9626H(iM9647v, obj4, zzafcVar);
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 10:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzagg.m9707j(iM9640j & 1048575, obj4, zzacwVar.m9446K());
                                    zzaffVar.m9644s(iM9647v, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 11:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzagg.m9703f(obj4, zzacwVar.m9447L(), iM9640j & 1048575);
                                    zzaffVar.m9644s(iM9647v, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 12:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    int iM9448M = zzacwVar.m9448M();
                                    zzadz zzadzVarM9624F = zzaffVar.m9624F(iM9647v);
                                    if (zzadzVarM9624F != null && !zzadzVarM9624F.zza(iM9448M)) {
                                        zzagb zzagbVar = zzafq.f22104a;
                                        objMo9682h = obj3 == null ? zzafzVar2.mo9682h(obj4) : obj3;
                                        zzafzVar2.mo9675a(objMo9682h, iM9477x, iM9448M);
                                        zzaffVar2 = zzaffVar;
                                        th = null;
                                    }
                                    zzagg.m9703f(obj4, iM9448M, iM9640j & 1048575);
                                    zzaffVar.m9644s(iM9647v, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 13:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzagg.m9703f(obj4, zzacwVar.m9449N(), iM9640j & 1048575);
                                    zzaffVar.m9644s(iM9647v, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 14:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzagg.m9705h(obj4, iM9640j & 1048575, zzacwVar.m9450O());
                                    zzaffVar.m9644s(iM9647v, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 15:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzagg.m9703f(obj4, zzacwVar.m9451P(), iM9640j & 1048575);
                                    zzaffVar.m9644s(iM9647v, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 16:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzagg.m9705h(obj4, iM9640j & 1048575, zzacwVar.m9452Q());
                                    zzaffVar.m9644s(iM9647v, obj4);
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 17:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzafc zzafcVar2 = (zzafc) zzaffVar.m9625G(iM9647v, obj4);
                                    zzacwVar.m9445J(zzafcVar2, zzaffVar.m9622D(iM9647v), zzadfVar);
                                    zzaffVar.m9626H(iM9647v, obj4, zzafcVar2);
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 18:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzacwVar.m9453R(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 19:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzacwVar.m9454S(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 20:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzacwVar.m9456a(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 21:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzacwVar.m9455T(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 22:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzacwVar.m9457b(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 23:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzacwVar.m9458c(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 24:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzacwVar.m9459d(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 25:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzacwVar.m9460e(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 26:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    if ((536870912 & iM9640j) != 0) {
                                        zzacwVar.m9461f(zzaeo.m9601a(iM9640j & 1048575, obj4), true);
                                    } else {
                                        zzacwVar.m9461f(zzaeo.m9601a(iM9640j & 1048575, obj4), false);
                                    }
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 27:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzacwVar.m9462g(zzaeo.m9601a(iM9640j & 1048575, obj4), zzaffVar.m9622D(iM9647v), zzadfVar);
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 28:
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzacwVar.m9464i(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 29:
                                    zzaffVar = zzaffVar2;
                                    obj2 = obj4;
                                    obj3 = objMo9682h;
                                    try {
                                        zzacwVar.m9465j(zzaeo.m9601a(iM9640j & 1048575, obj2));
                                        zzaffVar2 = zzaffVar;
                                        objMo9682h = obj3;
                                        th = null;
                                    } catch (zzaeg unused3) {
                                        objMo9682h = obj3;
                                        if (objMo9682h == null) {
                                            objMo9682h = zzafzVar2.mo9682h(obj2);
                                        }
                                        if (!zzafzVar2.m9685k(0, zzacwVar, objMo9682h)) {
                                            objM9629K2 = objMo9682h;
                                            while (i3 < i2) {
                                                zzafz zzafzVar5 = zzafzVar2;
                                                objM9629K2 = zzaffVar.m9629K(obj2, iArr[i3], objM9629K2, zzafzVar5, obj);
                                                zzafzVar2 = zzafzVar5;
                                                i3++;
                                                zzaffVar = this;
                                            }
                                            if (objM9629K2 != null) {
                                                zzafzVar2.mo9683i(obj2, objM9629K2);
                                            }
                                        }
                                        th = null;
                                        zzaffVar2 = this;
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                    break;
                                case 30:
                                    zzaffVar = zzaffVar2;
                                    zzaef zzaefVarM9601a = zzaeo.m9601a(iM9640j & 1048575, obj4);
                                    zzacwVar.m9466k(zzaefVarM9601a);
                                    obj5 = obj4;
                                    try {
                                        objMo9682h = zzafq.m9653c(obj5, iM9477x, zzaefVarM9601a, zzaffVar.m9624F(iM9647v), objMo9682h, zzafzVar2);
                                        zzaffVar2 = zzaffVar;
                                        th = null;
                                    } catch (zzaeg unused4) {
                                        obj3 = objMo9682h;
                                        obj2 = obj5;
                                        objMo9682h = obj3;
                                        if (objMo9682h == null) {
                                            objMo9682h = zzafzVar2.mo9682h(obj2);
                                        }
                                        if (!zzafzVar2.m9685k(0, zzacwVar, objMo9682h)) {
                                            objM9629K2 = objMo9682h;
                                            while (i3 < i2) {
                                                zzafz zzafzVar6 = zzafzVar2;
                                                objM9629K2 = zzaffVar.m9629K(obj2, iArr[i3], objM9629K2, zzafzVar6, obj);
                                                zzafzVar2 = zzafzVar6;
                                                i3++;
                                                zzaffVar = this;
                                            }
                                            if (objM9629K2 != null) {
                                                zzafzVar2.mo9683i(obj2, objM9629K2);
                                            }
                                        }
                                        th = null;
                                        zzaffVar2 = this;
                                    }
                                    break;
                                case 31:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.m9467l(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 32:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.m9468m(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 33:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.m9469n(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 34:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.m9470o(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 35:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.m9453R(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 36:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.m9454S(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 37:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.m9456a(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 38:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.m9455T(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 39:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.m9457b(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 40:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.m9458c(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 41:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.m9459d(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 42:
                                    zzaffVar = zzaffVar2;
                                    zzacwVar.m9460e(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 43:
                                    zzaffVar = zzaffVar2;
                                    obj2 = obj4;
                                    try {
                                        zzacwVar.m9465j(zzaeo.m9601a(iM9640j & 1048575, obj2));
                                        obj3 = objMo9682h;
                                        zzaffVar2 = zzaffVar;
                                        objMo9682h = obj3;
                                        th = null;
                                    } catch (zzaeg unused5) {
                                        obj3 = objMo9682h;
                                        objMo9682h = obj3;
                                        if (objMo9682h == null) {
                                            objMo9682h = zzafzVar2.mo9682h(obj2);
                                        }
                                        if (!zzafzVar2.m9685k(0, zzacwVar, objMo9682h)) {
                                            objM9629K2 = objMo9682h;
                                            while (i3 < i2) {
                                                zzafz zzafzVar7 = zzafzVar2;
                                                objM9629K2 = zzaffVar.m9629K(obj2, iArr[i3], objM9629K2, zzafzVar7, obj);
                                                zzafzVar2 = zzafzVar7;
                                                i3++;
                                                zzaffVar = this;
                                            }
                                            if (objM9629K2 != null) {
                                                zzafzVar2.mo9683i(obj2, objM9629K2);
                                            }
                                        }
                                        th = null;
                                        zzaffVar2 = this;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        obj3 = objMo9682h;
                                        objMo9682h = obj3;
                                        objM9629K = objMo9682h;
                                        while (i3 < i2) {
                                            zzafz zzafzVar8 = zzafzVar2;
                                            objM9629K = m9629K(obj2, iArr[i3], objM9629K, zzafzVar8, obj);
                                            i3++;
                                            zzafzVar2 = zzafzVar8;
                                        }
                                        zzafzVar = zzafzVar2;
                                        if (objM9629K != null) {
                                            zzafzVar.mo9683i(obj2, objM9629K);
                                        }
                                        throw th;
                                    }
                                    break;
                                case 44:
                                    zzaef zzaefVarM9601a2 = zzaeo.m9601a(iM9640j & 1048575, obj4);
                                    zzacwVar.m9466k(zzaefVarM9601a2);
                                    zzaffVar = zzaffVar2;
                                    try {
                                        try {
                                            objMo9682h = zzafq.m9653c(obj4, iM9477x, zzaefVarM9601a2, zzaffVar2.m9624F(iM9647v), objMo9682h, zzafzVar2);
                                            zzaffVar2 = zzaffVar;
                                            th = null;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            obj2 = obj4;
                                            obj3 = objMo9682h;
                                            objMo9682h = obj3;
                                            objM9629K = objMo9682h;
                                            while (i3 < i2) {
                                                zzafz zzafzVar9 = zzafzVar2;
                                                objM9629K = m9629K(obj2, iArr[i3], objM9629K, zzafzVar9, obj);
                                                i3++;
                                                zzafzVar2 = zzafzVar9;
                                            }
                                            zzafzVar = zzafzVar2;
                                            if (objM9629K != null) {
                                                zzafzVar.mo9683i(obj2, objM9629K);
                                            }
                                            throw th;
                                        }
                                    } catch (zzaeg unused6) {
                                        obj2 = obj4;
                                        obj3 = objMo9682h;
                                        objMo9682h = obj3;
                                        if (objMo9682h == null) {
                                            objMo9682h = zzafzVar2.mo9682h(obj2);
                                        }
                                        if (!zzafzVar2.m9685k(0, zzacwVar, objMo9682h)) {
                                            objM9629K2 = objMo9682h;
                                            while (i3 < i2) {
                                                zzafz zzafzVar10 = zzafzVar2;
                                                objM9629K2 = zzaffVar.m9629K(obj2, iArr[i3], objM9629K2, zzafzVar10, obj);
                                                zzafzVar2 = zzafzVar10;
                                                i3++;
                                                zzaffVar = this;
                                            }
                                            if (objM9629K2 != null) {
                                                zzafzVar2.mo9683i(obj2, objM9629K2);
                                            }
                                        }
                                        th = null;
                                        zzaffVar2 = this;
                                        break;
                                    }
                                    break;
                                case 45:
                                    zzacwVar.m9467l(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 46:
                                    zzacwVar.m9468m(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 47:
                                    zzacwVar.m9469n(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 48:
                                    zzacwVar.m9470o(zzaeo.m9601a(iM9640j & 1048575, obj4));
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 49:
                                    zzacwVar.m9463h(zzaeo.m9601a(iM9640j & 1048575, obj4), zzaffVar2.m9622D(iM9647v), zzadfVar);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 50:
                                    Object objM9623E = zzaffVar2.m9623E(iM9647v);
                                    long jM9640j = zzaffVar2.m9640j(iM9647v) & 1048575;
                                    Object objM9706i = zzagg.m9706i(jM9640j, obj4);
                                    if (objM9706i == null) {
                                        objM9706i = zzaew.f22069t.m9605a();
                                        zzagg.m9707j(jM9640j, obj4, objM9706i);
                                    } else if (!((zzaew) objM9706i).f22070s) {
                                        Object objM9605a = zzaew.f22069t.m9605a();
                                        zzaex.m9607a(objM9605a, objM9706i);
                                        zzagg.m9707j(jM9640j, obj4, objM9605a);
                                        objM9706i = objM9605a;
                                    }
                                    zzacwVar.m9471p((zzaew) objM9706i, ((zzaev) objM9623E).f22068a, zzadfVar);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 51:
                                    zzagg.m9707j(iM9640j & 1048575, obj4, Double.valueOf(zzacwVar.m9478y()));
                                    zzaffVar2.m9646u(iM9477x, iM9647v, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 52:
                                    zzagg.m9707j(iM9640j & 1048575, obj4, Float.valueOf(zzacwVar.m9479z()));
                                    zzaffVar2.m9646u(iM9477x, iM9647v, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 53:
                                    zzagg.m9707j(iM9640j & 1048575, obj4, Long.valueOf(zzacwVar.m9437B()));
                                    zzaffVar2.m9646u(iM9477x, iM9647v, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 54:
                                    zzagg.m9707j(iM9640j & 1048575, obj4, Long.valueOf(zzacwVar.m9436A()));
                                    zzaffVar2.m9646u(iM9477x, iM9647v, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 55:
                                    zzagg.m9707j(iM9640j & 1048575, obj4, Integer.valueOf(zzacwVar.m9438C()));
                                    zzaffVar2.m9646u(iM9477x, iM9647v, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 56:
                                    zzagg.m9707j(iM9640j & 1048575, obj4, Long.valueOf(zzacwVar.m9439D()));
                                    zzaffVar2.m9646u(iM9477x, iM9647v, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 57:
                                    zzagg.m9707j(iM9640j & 1048575, obj4, Integer.valueOf(zzacwVar.m9440E()));
                                    zzaffVar2.m9646u(iM9477x, iM9647v, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 58:
                                    zzagg.m9707j(iM9640j & 1048575, obj4, Boolean.valueOf(zzacwVar.m9441F()));
                                    zzaffVar2.m9646u(iM9477x, iM9647v, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 59:
                                    zzaffVar2.m9630L(iM9640j, zzacwVar, obj4);
                                    zzaffVar2.m9646u(iM9477x, iM9647v, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 60:
                                    zzafc zzafcVar3 = (zzafc) zzaffVar2.m9627I(iM9477x, iM9647v, obj4);
                                    zzacwVar.m9444I(zzafcVar3, zzaffVar2.m9622D(iM9647v), zzadfVar);
                                    zzaffVar2.m9628J(iM9477x, obj4, iM9647v, zzafcVar3);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 61:
                                    zzagg.m9707j(iM9640j & 1048575, obj4, zzacwVar.m9446K());
                                    zzaffVar2.m9646u(iM9477x, iM9647v, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 62:
                                    zzagg.m9707j(iM9640j & 1048575, obj4, Integer.valueOf(zzacwVar.m9447L()));
                                    zzaffVar2.m9646u(iM9477x, iM9647v, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 63:
                                    int iM9448M2 = zzacwVar.m9448M();
                                    zzadz zzadzVarM9624F2 = zzaffVar2.m9624F(iM9647v);
                                    if (zzadzVarM9624F2 == null || zzadzVarM9624F2.zza(iM9448M2)) {
                                        zzagg.m9707j(iM9640j & 1048575, obj4, Integer.valueOf(iM9448M2));
                                        zzaffVar2.m9646u(iM9477x, iM9647v, obj4);
                                        zzaffVar = zzaffVar2;
                                        obj3 = objMo9682h;
                                        zzaffVar2 = zzaffVar;
                                        objMo9682h = obj3;
                                    } else {
                                        zzagb zzagbVar2 = zzafq.f22104a;
                                        Object objMo9682h2 = objMo9682h == null ? zzafzVar2.mo9682h(obj4) : objMo9682h;
                                        zzafzVar2.mo9675a(objMo9682h2, iM9477x, iM9448M2);
                                        objMo9682h = objMo9682h2;
                                    }
                                    th = null;
                                    break;
                                case 64:
                                    zzagg.m9707j(iM9640j & 1048575, obj4, Integer.valueOf(zzacwVar.m9449N()));
                                    zzaffVar2.m9646u(iM9477x, iM9647v, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 65:
                                    zzagg.m9707j(iM9640j & 1048575, obj4, Long.valueOf(zzacwVar.m9450O()));
                                    zzaffVar2.m9646u(iM9477x, iM9647v, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 66:
                                    zzagg.m9707j(iM9640j & 1048575, obj4, Integer.valueOf(zzacwVar.m9451P()));
                                    zzaffVar2.m9646u(iM9477x, iM9647v, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 67:
                                    zzagg.m9707j(iM9640j & 1048575, obj4, Long.valueOf(zzacwVar.m9452Q()));
                                    zzaffVar2.m9646u(iM9477x, iM9647v, obj4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                case 68:
                                    zzafc zzafcVar4 = (zzafc) zzaffVar2.m9627I(iM9477x, iM9647v, obj4);
                                    zzacwVar.m9445J(zzafcVar4, zzaffVar2.m9622D(iM9647v), zzadfVar);
                                    zzaffVar2.m9628J(iM9477x, obj4, iM9647v, zzafcVar4);
                                    zzaffVar = zzaffVar2;
                                    obj3 = objMo9682h;
                                    zzaffVar2 = zzaffVar;
                                    objMo9682h = obj3;
                                    th = null;
                                    break;
                                default:
                                    if (objMo9682h == null) {
                                        objMo9682h = zzafzVar2.mo9682h(obj4);
                                    }
                                    try {
                                        if (!zzafzVar2.m9685k(0, zzacwVar, objMo9682h)) {
                                            objM9629K2 = objMo9682h;
                                            while (i3 < i2) {
                                                zzafz zzafzVar11 = zzafzVar2;
                                                objM9629K2 = zzaffVar2.m9629K(obj, iArr[i3], objM9629K2, zzafzVar11, obj);
                                                obj4 = obj;
                                                zzafzVar2 = zzafzVar11;
                                                i3++;
                                            }
                                            obj2 = obj4;
                                        }
                                    } catch (zzaeg unused7) {
                                        zzaffVar = zzaffVar2;
                                        obj2 = obj4;
                                        if (objMo9682h == null) {
                                            objMo9682h = zzafzVar2.mo9682h(obj2);
                                        }
                                        if (!zzafzVar2.m9685k(0, zzacwVar, objMo9682h)) {
                                            objM9629K2 = objMo9682h;
                                            while (i3 < i2) {
                                                zzafz zzafzVar12 = zzafzVar2;
                                                objM9629K2 = zzaffVar.m9629K(obj2, iArr[i3], objM9629K2, zzafzVar12, obj);
                                                zzafzVar2 = zzafzVar12;
                                                i3++;
                                                zzaffVar = this;
                                            }
                                            if (objM9629K2 != null) {
                                                zzafzVar2.mo9683i(obj2, objM9629K2);
                                            }
                                        }
                                        th = null;
                                        zzaffVar2 = this;
                                    }
                                    break;
                            }
                        } catch (zzaeg unused8) {
                            zzaffVar = zzaffVar2;
                            obj2 = obj4;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        obj2 = obj4;
                        obj3 = objMo9682h;
                        objMo9682h = obj3;
                        objM9629K = objMo9682h;
                        while (i3 < i2) {
                            zzafz zzafzVar13 = zzafzVar2;
                            objM9629K = m9629K(obj2, iArr[i3], objM9629K, zzafzVar13, obj);
                            i3++;
                            zzafzVar2 = zzafzVar13;
                        }
                        zzafzVar = zzafzVar2;
                        if (objM9629K != null) {
                            zzafzVar.mo9683i(obj2, objM9629K);
                        }
                        throw th;
                    }
                } else if (iM9477x == Integer.MAX_VALUE) {
                    objM9629K2 = objMo9682h;
                    while (i3 < i2) {
                        zzafz zzafzVar14 = zzafzVar2;
                        objM9629K2 = zzaffVar2.m9629K(obj, iArr[i3], objM9629K2, zzafzVar14, obj);
                        zzafzVar2 = zzafzVar14;
                        i3++;
                    }
                    obj2 = obj;
                } else {
                    obj4 = obj;
                    try {
                        if ((zzaffVar2.f22081f ? (zzadt) zzadfVar.f22014a.get(new zzade(iM9477x, zzaffVar2.f22080e)) : th) != null) {
                            throw th;
                        }
                        if (objMo9682h == null) {
                            objMo9682h = zzafzVar2.mo9682h(obj4);
                        }
                        try {
                            if (!zzafzVar2.m9685k(0, zzacwVar, objMo9682h)) {
                                objM9629K2 = objMo9682h;
                                while (i3 < i2) {
                                    zzafz zzafzVar15 = zzafzVar2;
                                    objM9629K2 = zzaffVar2.m9629K(obj, iArr[i3], objM9629K2, zzafzVar15, obj);
                                    obj4 = obj;
                                    zzafzVar2 = zzafzVar15;
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
                        obj3 = objMo9682h;
                        objMo9682h = obj3;
                    }
                }
            } catch (Throwable th11) {
                th = th11;
                obj2 = obj;
            }
            objMo9682h = obj3;
            objM9629K = objMo9682h;
            while (i3 < i2) {
                zzafz zzafzVar16 = zzafzVar2;
                objM9629K = m9629K(obj2, iArr[i3], objM9629K, zzafzVar16, obj);
                i3++;
                zzafzVar2 = zzafzVar16;
            }
            zzafzVar = zzafzVar2;
            if (objM9629K != null) {
                zzafzVar.mo9683i(obj2, objM9629K);
            }
            throw th;
        }
        if (objM9629K2 != null) {
            zzafzVar2.mo9683i(obj2, objM9629K2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    /* JADX INFO: renamed from: i */
    public final int mo9639i(zzadu zzaduVar) {
        int i2;
        long jDoubleToLongBits;
        int i3;
        int iFloatToIntBits;
        int iM9702e;
        int i4;
        int iHashCode = 0;
        for (int i5 = 0; i5 < this.f22076a.length; i5 += 3) {
            int iM9640j = m9640j(i5);
            int iM9612k = m9612k(iM9640j);
            if (iM9612k <= 50 || iM9612k >= 69) {
                long j2 = iM9640j & 1048575;
                int iHashCode2 = 37;
                switch (iM9612k) {
                    case 0:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzagg.f22130c.mo9696f(j2, zzaduVar));
                        byte[] bArr = zzaed.f22038a;
                        iM9702e = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + iM9702e;
                        break;
                    case 1:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzagg.f22130c.mo9694d(j2, zzaduVar));
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 2:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.m9704g(j2, zzaduVar);
                        byte[] bArr2 = zzaed.f22038a;
                        iM9702e = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + iM9702e;
                        break;
                    case 3:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.m9704g(j2, zzaduVar);
                        byte[] bArr3 = zzaed.f22038a;
                        iM9702e = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + iM9702e;
                        break;
                    case 4:
                        i2 = iHashCode * 53;
                        iM9702e = zzagg.m9702e(j2, zzaduVar);
                        iHashCode = i2 + iM9702e;
                        break;
                    case 5:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.m9704g(j2, zzaduVar);
                        byte[] bArr4 = zzaed.f22038a;
                        iM9702e = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + iM9702e;
                        break;
                    case 6:
                        i2 = iHashCode * 53;
                        iM9702e = zzagg.m9702e(j2, zzaduVar);
                        iHashCode = i2 + iM9702e;
                        break;
                    case 7:
                        i3 = iHashCode * 53;
                        boolean zMo9692b = zzagg.f22130c.mo9692b(j2, zzaduVar);
                        byte[] bArr5 = zzaed.f22038a;
                        iFloatToIntBits = zMo9692b ? 1231 : 1237;
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 8:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = ((String) zzagg.m9706i(j2, zzaduVar)).hashCode();
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 9:
                        i4 = iHashCode * 53;
                        Object objM9706i = zzagg.m9706i(j2, zzaduVar);
                        if (objM9706i != null) {
                            iHashCode2 = objM9706i.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
                        break;
                    case 10:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = zzagg.m9706i(j2, zzaduVar).hashCode();
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 11:
                        i2 = iHashCode * 53;
                        iM9702e = zzagg.m9702e(j2, zzaduVar);
                        iHashCode = i2 + iM9702e;
                        break;
                    case 12:
                        i2 = iHashCode * 53;
                        iM9702e = zzagg.m9702e(j2, zzaduVar);
                        iHashCode = i2 + iM9702e;
                        break;
                    case 13:
                        i2 = iHashCode * 53;
                        iM9702e = zzagg.m9702e(j2, zzaduVar);
                        iHashCode = i2 + iM9702e;
                        break;
                    case 14:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.m9704g(j2, zzaduVar);
                        byte[] bArr6 = zzaed.f22038a;
                        iM9702e = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + iM9702e;
                        break;
                    case 15:
                        i2 = iHashCode * 53;
                        iM9702e = zzagg.m9702e(j2, zzaduVar);
                        iHashCode = i2 + iM9702e;
                        break;
                    case 16:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.m9704g(j2, zzaduVar);
                        byte[] bArr7 = zzaed.f22038a;
                        iM9702e = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + iM9702e;
                        break;
                    case 17:
                        i4 = iHashCode * 53;
                        Object objM9706i2 = zzagg.m9706i(j2, zzaduVar);
                        if (objM9706i2 != null) {
                            iHashCode2 = objM9706i2.hashCode();
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
                        iFloatToIntBits = zzagg.m9706i(j2, zzaduVar).hashCode();
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 50:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = zzagg.m9706i(j2, zzaduVar).hashCode();
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i6 = this.f22085j;
        while (true) {
            int[] iArr = this.f22083h;
            if (i6 >= iArr.length) {
                int iHashCode3 = zzaduVar.zzc.hashCode() + (iHashCode * 53);
                return this.f22081f ? (iHashCode3 * 53) + ((zzadr) zzaduVar).zzb.f22017a.hashCode() : iHashCode3;
            }
            int i7 = iArr[i6];
            if (!m9645t(0, i7, zzaduVar)) {
                iHashCode = zzagg.m9706i(m9640j(i7) & 1048575, zzaduVar).hashCode() + (iHashCode * 53);
            }
            i6++;
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m9640j(int i2) {
        return this.f22076a[i2 + 1];
    }

    /* JADX INFO: renamed from: p */
    public final boolean m9641p(zzadu zzaduVar, zzadu zzaduVar2, int i2) {
        return m9643r(i2, zzaduVar) == m9643r(i2, zzaduVar2);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m9642q(Object obj, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return m9643r(i2, obj);
        }
        return (i4 & i5) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m9643r(int i2, Object obj) {
        int i3 = this.f22076a[i2 + 2];
        long j2 = i3 & 1048575;
        if (j2 == 1048575) {
            int iM9640j = m9640j(i2);
            long j3 = iM9640j & 1048575;
            switch (m9612k(iM9640j)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzagg.f22130c.mo9696f(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(zzagg.f22130c.mo9694d(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (zzagg.m9704g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (zzagg.m9704g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (zzagg.m9702e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (zzagg.m9704g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (zzagg.m9702e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return zzagg.f22130c.mo9692b(j3, obj);
                case 8:
                    Object objM9706i = zzagg.m9706i(j3, obj);
                    if (objM9706i instanceof String) {
                        if (((String) objM9706i).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objM9706i instanceof zzacr)) {
                            throw new IllegalArgumentException();
                        }
                        if (zzacr.f21972t.equals(objM9706i)) {
                            return false;
                        }
                    }
                case 9:
                    if (zzagg.m9706i(j3, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (zzacr.f21972t.equals(zzagg.m9706i(j3, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (zzagg.m9702e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (zzagg.m9702e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (zzagg.m9702e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (zzagg.m9704g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (zzagg.m9702e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (zzagg.m9704g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (zzagg.m9706i(j3, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i3 >>> 20)) & zzagg.m9702e(j2, obj)) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final void m9644s(int i2, Object obj) {
        int i3 = this.f22076a[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 == 1048575) {
            return;
        }
        zzagg.m9703f(obj, (1 << (i3 >>> 20)) | zzagg.m9702e(j2, obj), j2);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m9645t(int i2, int i3, Object obj) {
        return zzagg.m9702e((long) (this.f22076a[i3 + 2] & 1048575), obj) == i2;
    }

    /* JADX INFO: renamed from: u */
    public final void m9646u(int i2, int i3, Object obj) {
        zzagg.m9703f(obj, i2, this.f22076a[i3 + 2] & 1048575);
    }

    /* JADX INFO: renamed from: v */
    public final int m9647v(int i2, int i3) {
        int[] iArr = this.f22076a;
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
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 42141. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: y */
    public final int m9648y(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.measurement.zzacg r42) {
        /*
            Method dump skipped, instruction units count: 4214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzaff.m9648y(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzacg):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final Object zza() {
        return ((zzadu) this.f22080e).m9570p();
    }
}
