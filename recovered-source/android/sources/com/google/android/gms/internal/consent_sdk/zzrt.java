package com.google.android.gms.internal.consent_sdk;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzrt<T> implements zzsa<T> {

    /* JADX INFO: renamed from: g */
    public static final int[] f21778g = new int[0];

    /* JADX INFO: renamed from: h */
    public static final Unsafe f21779h = zzsw.m9291i();

    /* JADX INFO: renamed from: a */
    public final int[] f21780a;

    /* JADX INFO: renamed from: b */
    public final Object[] f21781b;

    /* JADX INFO: renamed from: c */
    public final zzrq f21782c;

    /* JADX INFO: renamed from: d */
    public final boolean f21783d;

    /* JADX INFO: renamed from: e */
    public final zzsp f21784e;

    /* JADX INFO: renamed from: f */
    public final zzqb f21785f;

    public zzrt(int[] iArr, Object[] objArr, zzrq zzrqVar, int[] iArr2, int i2, zzsp zzspVar, zzqb zzqbVar) {
        this.f21780a = iArr;
        this.f21781b = objArr;
        boolean z = false;
        if (zzqbVar != null && (zzrqVar instanceof zzqk)) {
            z = true;
        }
        this.f21783d = z;
        this.f21784e = zzspVar;
        this.f21785f = zzqbVar;
        this.f21782c = zzrqVar;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0243  */
    /* JADX WARN: Code duplicated, block: B:126:0x0249  */
    /* JADX WARN: Code duplicated, block: B:129:0x0261  */
    /* JADX WARN: Code duplicated, block: B:130:0x0264  */
    /* JADX WARN: Code duplicated, block: B:184:0x037b  */
    /* JADX INFO: renamed from: g */
    public static zzrt m9239g(zzrn zzrnVar, zzsp zzspVar, zzqc zzqcVar) {
        int i2;
        int iCharAt;
        int iCharAt2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        char cCharAt;
        int i7;
        char cCharAt2;
        int i8;
        char cCharAt3;
        int i9;
        char cCharAt4;
        int i10;
        int i11;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        int i15;
        int i16;
        Object[] objArr;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        char c;
        int i20;
        int i21;
        int i22;
        int i23;
        Field fieldM9243m;
        char cCharAt7;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        Object obj;
        Field fieldM9243m2;
        int i30;
        Object obj2;
        Field fieldM9243m3;
        int i31;
        char cCharAt8;
        int i32;
        int i33;
        char cCharAt9;
        int i34;
        char cCharAt10;
        int i35;
        char cCharAt11;
        if (!(zzrnVar instanceof zzrz)) {
            throw null;
        }
        zzrz zzrzVar = (zzrz) zzrnVar;
        String str = zzrzVar.f21799b;
        int length = str.length();
        char c2 = 55296;
        if (str.charAt(0) >= 55296) {
            int i36 = 1;
            while (true) {
                i2 = i36 + 1;
                if (str.charAt(i36) < 55296) {
                    break;
                }
                i36 = i2;
            }
        } else {
            i2 = 1;
        }
        int i37 = i2 + 1;
        int iCharAt3 = str.charAt(i2);
        if (iCharAt3 >= 55296) {
            int i38 = iCharAt3 & 8191;
            int i39 = 13;
            while (true) {
                i35 = i37 + 1;
                cCharAt11 = str.charAt(i37);
                if (cCharAt11 < 55296) {
                    break;
                }
                i38 |= (cCharAt11 & 8191) << i39;
                i39 += 13;
                i37 = i35;
            }
            iCharAt3 = i38 | (cCharAt11 << i39);
            i37 = i35;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i3 = 0;
            i5 = 0;
            iArr = f21778g;
            i4 = 0;
        } else {
            int i40 = i37 + 1;
            int iCharAt4 = str.charAt(i37);
            if (iCharAt4 >= 55296) {
                int i41 = iCharAt4 & 8191;
                int i42 = 13;
                while (true) {
                    i13 = i40 + 1;
                    cCharAt6 = str.charAt(i40);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt6 & 8191) << i42;
                    i42 += 13;
                    i40 = i13;
                }
                iCharAt4 = i41 | (cCharAt6 << i42);
                i40 = i13;
            }
            int i43 = i40 + 1;
            int iCharAt5 = str.charAt(i40);
            if (iCharAt5 >= 55296) {
                int i44 = iCharAt5 & 8191;
                int i45 = 13;
                while (true) {
                    i12 = i43 + 1;
                    cCharAt5 = str.charAt(i43);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt5 & 8191) << i45;
                    i45 += 13;
                    i43 = i12;
                }
                iCharAt5 = i44 | (cCharAt5 << i45);
                i43 = i12;
            }
            int i46 = i43 + 1;
            if (str.charAt(i43) >= 55296) {
                while (true) {
                    i11 = i46 + 1;
                    if (str.charAt(i46) < 55296) {
                        break;
                    }
                    i46 = i11;
                }
                i46 = i11;
            }
            int i47 = i46 + 1;
            if (str.charAt(i46) >= 55296) {
                while (true) {
                    i10 = i47 + 1;
                    if (str.charAt(i47) < 55296) {
                        break;
                    }
                    i47 = i10;
                }
                i47 = i10;
            }
            int i48 = i47 + 1;
            iCharAt = str.charAt(i47);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i9 = i48 + 1;
                    cCharAt4 = str.charAt(i48);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt4 & 8191) << i50;
                    i50 += 13;
                    i48 = i9;
                }
                iCharAt = i49 | (cCharAt4 << i50);
                i48 = i9;
            }
            int i51 = i48 + 1;
            iCharAt2 = str.charAt(i48);
            if (iCharAt2 >= 55296) {
                int i52 = iCharAt2 & 8191;
                int i53 = 13;
                while (true) {
                    i8 = i51 + 1;
                    cCharAt3 = str.charAt(i51);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt3 & 8191) << i53;
                    i53 += 13;
                    i51 = i8;
                }
                iCharAt2 = i52 | (cCharAt3 << i53);
                i51 = i8;
            }
            int i54 = i51 + 1;
            int iCharAt6 = str.charAt(i51);
            if (iCharAt6 >= 55296) {
                int i55 = iCharAt6 & 8191;
                int i56 = 13;
                while (true) {
                    i7 = i54 + 1;
                    cCharAt2 = str.charAt(i54);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt2 & 8191) << i56;
                    i56 += 13;
                    i54 = i7;
                }
                iCharAt6 = i55 | (cCharAt2 << i56);
                i54 = i7;
            }
            int i57 = i54 + 1;
            int iCharAt7 = str.charAt(i54);
            if (iCharAt7 >= 55296) {
                int i58 = iCharAt7 & 8191;
                int i59 = 13;
                while (true) {
                    i6 = i57 + 1;
                    cCharAt = str.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i59;
                    i59 += 13;
                    i57 = i6;
                }
                iCharAt7 = i58 | (cCharAt << i59);
                i57 = i6;
            }
            int i60 = iCharAt7 + iCharAt2 + iCharAt6;
            i3 = iCharAt4 + iCharAt4 + iCharAt5;
            i4 = iCharAt4;
            i37 = i57;
            iArr = new int[i60];
            i5 = iCharAt7;
        }
        Unsafe unsafe = f21779h;
        Object[] objArr2 = zzrzVar.f21800c;
        Class<?> cls = zzrzVar.f21798a.getClass();
        int i61 = iCharAt2 + i5;
        int i62 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i62];
        int i63 = i5;
        int i64 = 0;
        int i65 = 0;
        while (i37 < length) {
            int i66 = i37 + 1;
            int iCharAt8 = str.charAt(i37);
            if (iCharAt8 >= c2) {
                int i67 = iCharAt8 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i34 = i68 + 1;
                    cCharAt10 = str.charAt(i68);
                    if (cCharAt10 < c2) {
                        break;
                    }
                    i67 |= (cCharAt10 & 8191) << i69;
                    i69 += 13;
                    i68 = i34;
                }
                iCharAt8 = i67 | (cCharAt10 << i69);
                i14 = i34;
            } else {
                i14 = i66;
            }
            int i70 = i14 + 1;
            int iCharAt9 = str.charAt(i14);
            if (iCharAt9 >= c2) {
                int i71 = iCharAt9 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i33 = i72 + 1;
                    cCharAt9 = str.charAt(i72);
                    i15 = length;
                    if (cCharAt9 < 55296) {
                        break;
                    }
                    i71 |= (cCharAt9 & 8191) << i73;
                    i73 += 13;
                    i72 = i33;
                    length = i15;
                }
                iCharAt9 = i71 | (cCharAt9 << i73);
                i16 = i33;
            } else {
                i15 = length;
                i16 = i70;
            }
            if ((iCharAt9 & 1024) != 0) {
                iArr[i64] = i65;
                i64++;
            }
            int i74 = iCharAt9 & 255;
            int i75 = iCharAt8;
            int i76 = iCharAt9 & 2048;
            if (i74 >= 51) {
                int i77 = i16 + 1;
                int iCharAt10 = str.charAt(i16);
                if (iCharAt10 >= 55296) {
                    int i78 = iCharAt10 & 8191;
                    int i79 = i77;
                    int i80 = 13;
                    while (true) {
                        i31 = i79 + 1;
                        cCharAt8 = str.charAt(i79);
                        i32 = i78;
                        if (cCharAt8 < 55296) {
                            break;
                        }
                        i78 = i32 | ((cCharAt8 & 8191) << i80);
                        i80 += 13;
                        i79 = i31;
                    }
                    iCharAt10 = i32 | (cCharAt8 << i80);
                    i26 = i31;
                } else {
                    i26 = i77;
                }
                int i81 = iCharAt10;
                int i82 = i74 - 51;
                int i83 = i26;
                if (i82 == 9 || i82 == 17) {
                    i27 = i3 + 1;
                    int i84 = i65 / 3;
                    objArr3[i84 + i84 + 1] = objArr2[i3];
                } else {
                    if (i82 != 12) {
                        i28 = i76;
                    } else if (zzrzVar.zzc() == 1 || i76 != 0) {
                        i27 = i3 + 1;
                        int i85 = i65 / 3;
                        objArr3[i85 + i85 + 1] = objArr2[i3];
                    } else {
                        i28 = 0;
                    }
                    i29 = i81 + i81;
                    obj = objArr2[i29];
                    int i86 = i28;
                    if (obj instanceof Field) {
                        fieldM9243m2 = (Field) obj;
                    } else {
                        fieldM9243m2 = m9243m(cls, (String) obj);
                        objArr2[i29] = fieldM9243m2;
                    }
                    int i87 = i4;
                    objArr = objArr3;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM9243m2);
                    i30 = i29 + 1;
                    obj2 = objArr2[i30];
                    if (obj2 instanceof Field) {
                        fieldM9243m3 = (Field) obj2;
                    } else {
                        fieldM9243m3 = m9243m(cls, (String) obj2);
                        objArr2[i30] = fieldM9243m3;
                    }
                    i17 = i87;
                    i19 = i86;
                    str = str;
                    i18 = i3;
                    i22 = 0;
                    c = 55296;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM9243m3);
                    i23 = iObjectFieldOffset3;
                    i20 = i83;
                }
                i3 = i27;
                i28 = i76;
                i29 = i81 + i81;
                obj = objArr2[i29];
                int i88 = i28;
                if (obj instanceof Field) {
                    fieldM9243m2 = (Field) obj;
                } else {
                    fieldM9243m2 = m9243m(cls, (String) obj);
                    objArr2[i29] = fieldM9243m2;
                }
                int i89 = i4;
                objArr = objArr3;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM9243m2);
                i30 = i29 + 1;
                obj2 = objArr2[i30];
                if (obj2 instanceof Field) {
                    fieldM9243m3 = (Field) obj2;
                } else {
                    fieldM9243m3 = m9243m(cls, (String) obj2);
                    objArr2[i30] = fieldM9243m3;
                }
                i17 = i89;
                i19 = i88;
                str = str;
                i18 = i3;
                i22 = 0;
                c = 55296;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM9243m3);
                i23 = iObjectFieldOffset4;
                i20 = i83;
            } else {
                int i90 = i4;
                objArr = objArr3;
                int i91 = i3 + 1;
                Field fieldM9243m4 = m9243m(cls, (String) objArr2[i3]);
                i17 = i90;
                if (i74 == 9 || i74 == 17) {
                    i18 = i91;
                    int i92 = i65 / 3;
                    objArr[i92 + i92 + 1] = fieldM9243m4.getType();
                } else {
                    if (i74 != 27) {
                        if (i74 == 49) {
                            i25 = i3 + 2;
                            i24 = 1;
                        } else {
                            if (i74 == 12 || i74 == 30 || i74 == 44) {
                                i18 = i91;
                                if (zzrzVar.zzc() == 1 || i76 != 0) {
                                    i25 = i3 + 2;
                                    int i93 = i65 / 3;
                                    objArr[i93 + i93 + 1] = objArr2[i18];
                                    i18 = i25;
                                }
                            } else if (i74 == 50) {
                                int i94 = i3 + 2;
                                int i95 = i63 + 1;
                                iArr[i63] = i65;
                                int i96 = i65 / 3;
                                int i97 = i96 + i96;
                                objArr[i97] = objArr2[i91];
                                if (i76 != 0) {
                                    objArr[i97 + 1] = objArr2[i94];
                                    i19 = i76;
                                    i63 = i95;
                                    i18 = i3 + 3;
                                } else {
                                    i63 = i95;
                                    i18 = i94;
                                }
                            } else {
                                i18 = i91;
                            }
                            i19 = 0;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM9243m4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt9 & 4096) != 0 || i74 > 17) {
                            c = 55296;
                            i20 = i16;
                            i21 = 0;
                        } else {
                            int i98 = i16 + 1;
                            int iCharAt11 = str.charAt(i16);
                            if (iCharAt11 >= 55296) {
                                int i99 = iCharAt11 & 8191;
                                int i100 = 13;
                                while (true) {
                                    i20 = i98 + 1;
                                    cCharAt7 = str.charAt(i98);
                                    if (cCharAt7 < 55296) {
                                        break;
                                    }
                                    i99 |= (cCharAt7 & 8191) << i100;
                                    i100 += 13;
                                    i98 = i20;
                                }
                                iCharAt11 = i99 | (cCharAt7 << i100);
                            } else {
                                i20 = i98;
                            }
                            int i101 = (iCharAt11 / 32) + i17 + i17;
                            Object obj3 = objArr2[i101];
                            if (obj3 instanceof Field) {
                                fieldM9243m = (Field) obj3;
                            } else {
                                fieldM9243m = m9243m(cls, (String) obj3);
                                objArr2[i101] = fieldM9243m;
                            }
                            i21 = iCharAt11 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM9243m);
                            c = 55296;
                        }
                        if (i74 >= 18 && i74 <= 49) {
                            iArr[i61] = iObjectFieldOffset;
                            i61++;
                        }
                        i22 = i21;
                        i23 = iObjectFieldOffset;
                    } else {
                        i24 = 1;
                        i25 = i3 + 2;
                    }
                    int i102 = i65 / 3;
                    objArr[i102 + i102 + i24] = objArr2[i91];
                    i18 = i25;
                }
                i19 = i76;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM9243m4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt9 & 4096) != 0) {
                    c = 55296;
                    i20 = i16;
                    i21 = 0;
                } else {
                    c = 55296;
                    i20 = i16;
                    i21 = 0;
                }
                if (i74 >= 18) {
                    iArr[i61] = iObjectFieldOffset;
                    i61++;
                }
                i22 = i21;
                i23 = iObjectFieldOffset;
            }
            int i103 = i65 + 1;
            iArr2[i65] = i75;
            int i104 = i65 + 2;
            int i105 = i22;
            iArr2[i103] = ((iCharAt9 & 512) != 0 ? 536870912 : 0) | ((iCharAt9 & 256) != 0 ? 268435456 : 0) | (i19 != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20) | i23;
            i65 += 3;
            iArr2[i104] = (i105 << 20) | iObjectFieldOffset2;
            str = str;
            i37 = i20;
            length = i15;
            i4 = i17;
            i3 = i18;
            c2 = c;
            objArr3 = objArr;
        }
        return new zzrt(iArr2, objArr3, zzrzVar.f21798a, iArr, i5, zzspVar, zzqcVar);
    }

    /* JADX INFO: renamed from: h */
    public static int m9240h(long j2, Object obj) {
        return ((Integer) zzsw.m9290h(j2, obj)).intValue();
    }

    /* JADX INFO: renamed from: i */
    public static int m9241i(int i2) {
        return (i2 >>> 20) & 255;
    }

    /* JADX INFO: renamed from: k */
    public static long m9242k(long j2, Object obj) {
        return ((Long) zzsw.m9290h(j2, obj)).longValue();
    }

    /* JADX INFO: renamed from: m */
    public static Field m9243m(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    /* JADX INFO: renamed from: a */
    public final void mo9244a(Object obj) {
        if (!(obj == null ? false : obj instanceof zzqm ? ((zzqm) obj).m9223d() : true)) {
            return;
        }
        if (obj instanceof zzqm) {
            zzqm zzqmVar = (zzqm) obj;
            zzqmVar.m9222c();
            zzqmVar.zza = 0;
            zzqmVar.m9226j();
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.f21780a;
            if (i2 >= iArr.length) {
                this.f21784e.mo9278a(obj);
                if (this.f21783d) {
                    this.f21785f.mo9207a(obj);
                    return;
                }
                return;
            }
            int iM9250j = m9250j(i2);
            int i3 = 1048575 & iM9250j;
            int iM9241i = m9241i(iM9250j);
            long j2 = i3;
            if (iM9241i != 9) {
                if (iM9241i != 60 && iM9241i != 68) {
                    switch (iM9241i) {
                        case 17:
                            if (m9253o(i2, obj)) {
                                m9251l(i2).mo9244a(f21779h.getObject(obj, j2));
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
                            ((zzqr) zzsw.m9290h(j2, obj)).zzb();
                            break;
                        case 50:
                            Unsafe unsafe = f21779h;
                            Object object = unsafe.getObject(obj, j2);
                            if (object != null) {
                                ((zzrk) object).f21775s = false;
                                unsafe.putObject(obj, j2, object);
                            }
                            break;
                    }
                } else if (m9249f(iArr[i2], i2, obj)) {
                    m9251l(i2).mo9244a(f21779h.getObject(obj, j2));
                }
            } else if (m9253o(i2, obj)) {
                m9251l(i2).mo9244a(f21779h.getObject(obj, j2));
            }
            i2 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00db A[PHI: r1
  0x00db: PHI (r1v37 int) = (r1v13 int), (r1v38 int) binds: [B:86:0x01ea, B:44:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    /* JADX INFO: renamed from: b */
    public final int mo9245b(zzqm zzqmVar) {
        int i2;
        long jDoubleToLongBits;
        int i3;
        int iFloatToIntBits;
        int iM9287e;
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr = this.f21780a;
            if (i6 >= iArr.length) {
                zzqmVar.zzc.getClass();
                int i8 = (i7 * 53) + 506991;
                return this.f21783d ? (i8 * 53) + ((zzqk) zzqmVar).zzb.f21729a.hashCode() : i8;
            }
            int iM9250j = m9250j(i6);
            int i9 = 1048575 & iM9250j;
            int iM9241i = m9241i(iM9250j);
            int i10 = iArr[i6];
            long j2 = i9;
            int i11 = 1237;
            int iHashCode = 37;
            switch (iM9241i) {
                case 0:
                    i2 = i7 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzsw.f21825c.mo9279a(j2, zzqmVar));
                    Charset charset = zzqs.f21747a;
                    iM9287e = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i2 + iM9287e;
                    break;
                case 1:
                    i3 = i7 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzsw.f21825c.mo9280b(j2, zzqmVar));
                    i7 = iFloatToIntBits + i3;
                    break;
                case 2:
                    i2 = i7 * 53;
                    jDoubleToLongBits = zzsw.m9288f(j2, zzqmVar);
                    Charset charset2 = zzqs.f21747a;
                    iM9287e = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i2 + iM9287e;
                    break;
                case 3:
                    i2 = i7 * 53;
                    jDoubleToLongBits = zzsw.m9288f(j2, zzqmVar);
                    Charset charset3 = zzqs.f21747a;
                    iM9287e = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i2 + iM9287e;
                    break;
                case 4:
                    i2 = i7 * 53;
                    iM9287e = zzsw.m9287e(j2, zzqmVar);
                    i7 = i2 + iM9287e;
                    break;
                case 5:
                    i2 = i7 * 53;
                    jDoubleToLongBits = zzsw.m9288f(j2, zzqmVar);
                    Charset charset4 = zzqs.f21747a;
                    iM9287e = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i2 + iM9287e;
                    break;
                case 6:
                    i2 = i7 * 53;
                    iM9287e = zzsw.m9287e(j2, zzqmVar);
                    i7 = i2 + iM9287e;
                    break;
                case 7:
                    i4 = i7 * 53;
                    boolean zMo9282d = zzsw.f21825c.mo9282d(j2, zzqmVar);
                    Charset charset5 = zzqs.f21747a;
                    if (zMo9282d) {
                        i11 = 1231;
                    }
                    i7 = i11 + i4;
                    break;
                case 8:
                    i3 = i7 * 53;
                    iFloatToIntBits = ((String) zzsw.m9290h(j2, zzqmVar)).hashCode();
                    i7 = iFloatToIntBits + i3;
                    break;
                case 9:
                    i5 = i7 * 53;
                    Object objM9290h = zzsw.m9290h(j2, zzqmVar);
                    if (objM9290h != null) {
                        iHashCode = objM9290h.hashCode();
                    }
                    i7 = i5 + iHashCode;
                    break;
                case 10:
                    i3 = i7 * 53;
                    iFloatToIntBits = zzsw.m9290h(j2, zzqmVar).hashCode();
                    i7 = iFloatToIntBits + i3;
                    break;
                case 11:
                    i2 = i7 * 53;
                    iM9287e = zzsw.m9287e(j2, zzqmVar);
                    i7 = i2 + iM9287e;
                    break;
                case 12:
                    i2 = i7 * 53;
                    iM9287e = zzsw.m9287e(j2, zzqmVar);
                    i7 = i2 + iM9287e;
                    break;
                case 13:
                    i2 = i7 * 53;
                    iM9287e = zzsw.m9287e(j2, zzqmVar);
                    i7 = i2 + iM9287e;
                    break;
                case 14:
                    i2 = i7 * 53;
                    jDoubleToLongBits = zzsw.m9288f(j2, zzqmVar);
                    Charset charset6 = zzqs.f21747a;
                    iM9287e = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i2 + iM9287e;
                    break;
                case 15:
                    i2 = i7 * 53;
                    iM9287e = zzsw.m9287e(j2, zzqmVar);
                    i7 = i2 + iM9287e;
                    break;
                case 16:
                    i2 = i7 * 53;
                    jDoubleToLongBits = zzsw.m9288f(j2, zzqmVar);
                    Charset charset7 = zzqs.f21747a;
                    iM9287e = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i7 = i2 + iM9287e;
                    break;
                case 17:
                    i5 = i7 * 53;
                    Object objM9290h2 = zzsw.m9290h(j2, zzqmVar);
                    if (objM9290h2 != null) {
                        iHashCode = objM9290h2.hashCode();
                    }
                    i7 = i5 + iHashCode;
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
                    i3 = i7 * 53;
                    iFloatToIntBits = zzsw.m9290h(j2, zzqmVar).hashCode();
                    i7 = iFloatToIntBits + i3;
                    break;
                case 50:
                    i3 = i7 * 53;
                    iFloatToIntBits = zzsw.m9290h(j2, zzqmVar).hashCode();
                    i7 = iFloatToIntBits + i3;
                    break;
                case 51:
                    if (m9249f(i10, i6, zzqmVar)) {
                        i2 = i7 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) zzsw.m9290h(j2, zzqmVar)).doubleValue());
                        Charset charset8 = zzqs.f21747a;
                        iM9287e = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i2 + iM9287e;
                    }
                    break;
                case 52:
                    if (m9249f(i10, i6, zzqmVar)) {
                        i3 = i7 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) zzsw.m9290h(j2, zzqmVar)).floatValue());
                        i7 = iFloatToIntBits + i3;
                    }
                    break;
                case 53:
                    if (m9249f(i10, i6, zzqmVar)) {
                        i2 = i7 * 53;
                        jDoubleToLongBits = m9242k(j2, zzqmVar);
                        Charset charset9 = zzqs.f21747a;
                        iM9287e = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i2 + iM9287e;
                    }
                    break;
                case 54:
                    if (m9249f(i10, i6, zzqmVar)) {
                        i2 = i7 * 53;
                        jDoubleToLongBits = m9242k(j2, zzqmVar);
                        Charset charset10 = zzqs.f21747a;
                        iM9287e = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i2 + iM9287e;
                    }
                    break;
                case 55:
                    if (m9249f(i10, i6, zzqmVar)) {
                        i2 = i7 * 53;
                        iM9287e = m9240h(j2, zzqmVar);
                        i7 = i2 + iM9287e;
                    }
                    break;
                case 56:
                    if (m9249f(i10, i6, zzqmVar)) {
                        i2 = i7 * 53;
                        jDoubleToLongBits = m9242k(j2, zzqmVar);
                        Charset charset11 = zzqs.f21747a;
                        iM9287e = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i2 + iM9287e;
                    }
                    break;
                case 57:
                    if (m9249f(i10, i6, zzqmVar)) {
                        i2 = i7 * 53;
                        iM9287e = m9240h(j2, zzqmVar);
                        i7 = i2 + iM9287e;
                    }
                    break;
                case 58:
                    if (m9249f(i10, i6, zzqmVar)) {
                        i4 = i7 * 53;
                        boolean zBooleanValue = ((Boolean) zzsw.m9290h(j2, zzqmVar)).booleanValue();
                        Charset charset12 = zzqs.f21747a;
                        if (zBooleanValue) {
                            i11 = 1231;
                        }
                        i7 = i11 + i4;
                    }
                    break;
                case 59:
                    if (m9249f(i10, i6, zzqmVar)) {
                        i3 = i7 * 53;
                        iFloatToIntBits = ((String) zzsw.m9290h(j2, zzqmVar)).hashCode();
                        i7 = iFloatToIntBits + i3;
                    }
                    break;
                case 60:
                    if (m9249f(i10, i6, zzqmVar)) {
                        i3 = i7 * 53;
                        iFloatToIntBits = zzsw.m9290h(j2, zzqmVar).hashCode();
                        i7 = iFloatToIntBits + i3;
                    }
                    break;
                case 61:
                    if (m9249f(i10, i6, zzqmVar)) {
                        i3 = i7 * 53;
                        iFloatToIntBits = zzsw.m9290h(j2, zzqmVar).hashCode();
                        i7 = iFloatToIntBits + i3;
                    }
                    break;
                case 62:
                    if (m9249f(i10, i6, zzqmVar)) {
                        i2 = i7 * 53;
                        iM9287e = m9240h(j2, zzqmVar);
                        i7 = i2 + iM9287e;
                    }
                    break;
                case 63:
                    if (m9249f(i10, i6, zzqmVar)) {
                        i2 = i7 * 53;
                        iM9287e = m9240h(j2, zzqmVar);
                        i7 = i2 + iM9287e;
                    }
                    break;
                case 64:
                    if (m9249f(i10, i6, zzqmVar)) {
                        i2 = i7 * 53;
                        iM9287e = m9240h(j2, zzqmVar);
                        i7 = i2 + iM9287e;
                    }
                    break;
                case 65:
                    if (m9249f(i10, i6, zzqmVar)) {
                        i2 = i7 * 53;
                        jDoubleToLongBits = m9242k(j2, zzqmVar);
                        Charset charset13 = zzqs.f21747a;
                        iM9287e = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i2 + iM9287e;
                    }
                    break;
                case 66:
                    if (m9249f(i10, i6, zzqmVar)) {
                        i2 = i7 * 53;
                        iM9287e = m9240h(j2, zzqmVar);
                        i7 = i2 + iM9287e;
                    }
                    break;
                case 67:
                    if (m9249f(i10, i6, zzqmVar)) {
                        i2 = i7 * 53;
                        jDoubleToLongBits = m9242k(j2, zzqmVar);
                        Charset charset14 = zzqs.f21747a;
                        iM9287e = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i7 = i2 + iM9287e;
                    }
                    break;
                case 68:
                    if (m9249f(i10, i6, zzqmVar)) {
                        i3 = i7 * 53;
                        iFloatToIntBits = zzsw.m9290h(j2, zzqmVar).hashCode();
                        i7 = iFloatToIntBits + i3;
                    }
                    break;
            }
            i6 += 3;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    /* JADX INFO: renamed from: c */
    public final boolean mo9246c(zzqm zzqmVar, zzqm zzqmVar2) {
        boolean zM9257a;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f21780a;
            if (i2 < iArr.length) {
                int iM9250j = m9250j(i2);
                long j2 = iM9250j & 1048575;
                switch (m9241i(iM9250j)) {
                    case 0:
                        if (m9252n(zzqmVar, zzqmVar2, i2)) {
                            zzsv zzsvVar = zzsw.f21825c;
                            if (Double.doubleToLongBits(zzsvVar.mo9279a(j2, zzqmVar)) == Double.doubleToLongBits(zzsvVar.mo9279a(j2, zzqmVar2))) {
                                continue;
                                i2 += 3;
                            }
                        }
                        break;
                    case 1:
                        if (m9252n(zzqmVar, zzqmVar2, i2)) {
                            zzsv zzsvVar2 = zzsw.f21825c;
                            if (Float.floatToIntBits(zzsvVar2.mo9280b(j2, zzqmVar)) == Float.floatToIntBits(zzsvVar2.mo9280b(j2, zzqmVar2))) {
                                continue;
                                i2 += 3;
                            }
                        }
                        break;
                    case 2:
                        if (m9252n(zzqmVar, zzqmVar2, i2) && zzsw.m9288f(j2, zzqmVar) == zzsw.m9288f(j2, zzqmVar2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 3:
                        if (m9252n(zzqmVar, zzqmVar2, i2) && zzsw.m9288f(j2, zzqmVar) == zzsw.m9288f(j2, zzqmVar2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 4:
                        if (m9252n(zzqmVar, zzqmVar2, i2) && zzsw.m9287e(j2, zzqmVar) == zzsw.m9287e(j2, zzqmVar2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 5:
                        if (m9252n(zzqmVar, zzqmVar2, i2) && zzsw.m9288f(j2, zzqmVar) == zzsw.m9288f(j2, zzqmVar2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 6:
                        if (m9252n(zzqmVar, zzqmVar2, i2) && zzsw.m9287e(j2, zzqmVar) == zzsw.m9287e(j2, zzqmVar2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 7:
                        if (m9252n(zzqmVar, zzqmVar2, i2)) {
                            zzsv zzsvVar3 = zzsw.f21825c;
                            if (zzsvVar3.mo9282d(j2, zzqmVar) == zzsvVar3.mo9282d(j2, zzqmVar2)) {
                                continue;
                                i2 += 3;
                            }
                        }
                        break;
                    case 8:
                        if (m9252n(zzqmVar, zzqmVar2, i2) && zzsc.m9257a(zzsw.m9290h(j2, zzqmVar), zzsw.m9290h(j2, zzqmVar2))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 9:
                        if (m9252n(zzqmVar, zzqmVar2, i2) && zzsc.m9257a(zzsw.m9290h(j2, zzqmVar), zzsw.m9290h(j2, zzqmVar2))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 10:
                        if (m9252n(zzqmVar, zzqmVar2, i2) && zzsc.m9257a(zzsw.m9290h(j2, zzqmVar), zzsw.m9290h(j2, zzqmVar2))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 11:
                        if (m9252n(zzqmVar, zzqmVar2, i2) && zzsw.m9287e(j2, zzqmVar) == zzsw.m9287e(j2, zzqmVar2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 12:
                        if (m9252n(zzqmVar, zzqmVar2, i2) && zzsw.m9287e(j2, zzqmVar) == zzsw.m9287e(j2, zzqmVar2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 13:
                        if (m9252n(zzqmVar, zzqmVar2, i2) && zzsw.m9287e(j2, zzqmVar) == zzsw.m9287e(j2, zzqmVar2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 14:
                        if (m9252n(zzqmVar, zzqmVar2, i2) && zzsw.m9288f(j2, zzqmVar) == zzsw.m9288f(j2, zzqmVar2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 15:
                        if (m9252n(zzqmVar, zzqmVar2, i2) && zzsw.m9287e(j2, zzqmVar) == zzsw.m9287e(j2, zzqmVar2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 16:
                        if (m9252n(zzqmVar, zzqmVar2, i2) && zzsw.m9288f(j2, zzqmVar) == zzsw.m9288f(j2, zzqmVar2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 17:
                        if (m9252n(zzqmVar, zzqmVar2, i2) && zzsc.m9257a(zzsw.m9290h(j2, zzqmVar), zzsw.m9290h(j2, zzqmVar2))) {
                            continue;
                            i2 += 3;
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
                        zM9257a = zzsc.m9257a(zzsw.m9290h(j2, zzqmVar), zzsw.m9290h(j2, zzqmVar2));
                        break;
                    case 50:
                        zM9257a = zzsc.m9257a(zzsw.m9290h(j2, zzqmVar), zzsw.m9290h(j2, zzqmVar2));
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
                        if (zzsw.m9287e(j3, zzqmVar) == zzsw.m9287e(j3, zzqmVar2) && zzsc.m9257a(zzsw.m9290h(j2, zzqmVar), zzsw.m9290h(j2, zzqmVar2))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    default:
                        continue;
                        i2 += 3;
                        break;
                }
                if (zM9257a) {
                    i2 += 3;
                }
            } else if (zzqmVar.zzc.equals(zzqmVar2.zzc)) {
                if (this.f21783d) {
                    return ((zzqk) zzqmVar).zzb.equals(((zzqk) zzqmVar2).zzb);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:91:0x0244  */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    /* JADX INFO: renamed from: d */
    public final int mo9247d(zzqm zzqmVar) {
        int i2;
        int iM9184c;
        int iM9185d;
        int iM9184c2;
        int iMo9150d;
        int iM9184c3;
        int iM9263g;
        int iMo9144b;
        int size;
        int iM9267k;
        int iM9184c4;
        int iM9183b;
        int iM9184c5;
        int iM9184c6;
        int size2;
        int iM9184c7;
        int iM9184c8;
        int iM9185d2;
        int iM9184c9;
        int iMo9150d2;
        int iM9184c10;
        zzrt<T> zzrtVar = this;
        zzqm zzqmVar2 = zzqmVar;
        Unsafe unsafe = f21779h;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int iM2435b = 0;
        while (true) {
            int[] iArr = zzrtVar.f21780a;
            if (i5 >= iArr.length) {
                zzsq zzsqVar = zzqmVar2.zzc;
                int i7 = zzsqVar.f21820b;
                if (i7 == -1) {
                    zzsqVar.f21820b = 0;
                    i7 = 0;
                }
                int i8 = i7 + iM2435b;
                if (zzrtVar.f21783d) {
                    zzsd zzsdVar = ((zzqk) zzqmVar2).zzb.f21729a;
                    if (zzsdVar.f21813t > 0) {
                        Map.Entry entryM9272d = zzsdVar.m9272d(0);
                        zzqe zzqeVar = (zzqe) ((zzse) entryM9272d).f21803s;
                        Object obj = ((zzse) entryM9272d).f21804t;
                        zzqeVar.zzb();
                        throw null;
                    }
                    Iterator<T> it = zzsdVar.m9270b().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        zzqe zzqeVar2 = (zzqe) entry.getKey();
                        entry.getValue();
                        zzqeVar2.zzb();
                        throw null;
                    }
                }
                return i8;
            }
            int iM9250j = zzrtVar.m9250j(i5);
            int iM9241i = m9241i(iM9250j);
            int i9 = iArr[i5];
            int i10 = iArr[i5 + 2];
            int i11 = i10 & i3;
            if (iM9241i <= 17) {
                if (i11 != i4) {
                    i6 = i11 == i3 ? 0 : unsafe.getInt(zzqmVar2, i11);
                    i4 = i11;
                }
                i2 = 1 << (i10 >>> 20);
            } else {
                i2 = 0;
            }
            int i12 = iM9250j & i3;
            if (iM9241i >= zzqg.f21732t.f21736s) {
                zzqg.f21733u.getClass();
            }
            long j2 = i12;
            switch (iM9241i) {
                case 0:
                    if (zzrtVar.m9254p(zzqmVar2, i5, i4, i6, i2)) {
                        iM2435b = AbstractC1456a.m2435b(i9 << 3, 8, iM2435b);
                    }
                    break;
                case 1:
                    if (zzrtVar.m9254p(zzqmVar2, i5, i4, i6, i2)) {
                        iM2435b = AbstractC1456a.m2435b(i9 << 3, 4, iM2435b);
                    }
                    zzrtVar = this;
                    zzqmVar2 = zzqmVar;
                    break;
                case 2:
                    if (zzrtVar.m9254p(zzqmVar2, i5, i4, i6, i2)) {
                        long j3 = unsafe.getLong(zzqmVar2, j2);
                        iM9184c = zzpv.m9184c(i9 << 3);
                        iM9185d = zzpv.m9185d(j3);
                        iM2435b += iM9185d + iM9184c;
                    }
                    zzrtVar = this;
                    break;
                case 3:
                    if (zzrtVar.m9254p(zzqmVar2, i5, i4, i6, i2)) {
                        long j4 = unsafe.getLong(zzqmVar2, j2);
                        iM9184c = zzpv.m9184c(i9 << 3);
                        iM9185d = zzpv.m9185d(j4);
                        iM2435b += iM9185d + iM9184c;
                    }
                    zzrtVar = this;
                    break;
                case 4:
                    if (zzrtVar.m9254p(zzqmVar2, i5, i4, i6, i2)) {
                        long j5 = unsafe.getInt(zzqmVar2, j2);
                        iM9184c = zzpv.m9184c(i9 << 3);
                        iM9185d = zzpv.m9185d(j5);
                        iM2435b += iM9185d + iM9184c;
                    }
                    zzrtVar = this;
                    break;
                case 5:
                    if (zzrtVar.m9254p(zzqmVar2, i5, i4, i6, i2)) {
                        iM2435b = AbstractC1456a.m2435b(i9 << 3, 8, iM2435b);
                    }
                    zzrtVar = this;
                    zzqmVar2 = zzqmVar;
                    break;
                case 6:
                    if (zzrtVar.m9254p(zzqmVar2, i5, i4, i6, i2)) {
                        iM2435b = AbstractC1456a.m2435b(i9 << 3, 4, iM2435b);
                    }
                    zzrtVar = this;
                    zzqmVar2 = zzqmVar;
                    break;
                case 7:
                    if (zzrtVar.m9254p(zzqmVar2, i5, i4, i6, i2)) {
                        iM2435b = AbstractC1456a.m2435b(i9 << 3, 1, iM2435b);
                    }
                    zzrtVar = this;
                    zzqmVar2 = zzqmVar;
                    break;
                case 8:
                    if (zzrtVar.m9254p(zzqmVar2, i5, i4, i6, i2)) {
                        int i13 = i9 << 3;
                        Object object = unsafe.getObject(zzqmVar2, j2);
                        if (object instanceof zzpm) {
                            iM9184c2 = zzpv.m9184c(i13);
                            iMo9150d = ((zzpm) object).mo9150d();
                            iM9184c3 = zzpv.m9184c(iMo9150d);
                            iM2435b += iM9184c3 + iMo9150d + iM9184c2;
                        } else {
                            iM9184c = zzpv.m9184c(i13);
                            iM9185d = zzpv.m9183b((String) object);
                            iM2435b += iM9185d + iM9184c;
                        }
                    }
                    zzrtVar = this;
                    break;
                case 9:
                    if (zzrtVar.m9254p(zzqmVar2, i5, i4, i6, i2)) {
                        iM9263g = zzsc.m9263g(i9, unsafe.getObject(zzqmVar2, j2), zzrtVar.m9251l(i5));
                        iM2435b += iM9263g;
                    }
                    break;
                case 10:
                    if (zzrtVar.m9254p(zzqmVar2, i5, i4, i6, i2)) {
                        zzpm zzpmVar = (zzpm) unsafe.getObject(zzqmVar2, j2);
                        iM9184c2 = zzpv.m9184c(i9 << 3);
                        iMo9150d = zzpmVar.mo9150d();
                        iM9184c3 = zzpv.m9184c(iMo9150d);
                        iM2435b += iM9184c3 + iMo9150d + iM9184c2;
                    }
                    zzrtVar = this;
                    break;
                case 11:
                    if (zzrtVar.m9254p(zzqmVar2, i5, i4, i6, i2)) {
                        iM2435b = AbstractC1456a.m2435b(unsafe.getInt(zzqmVar2, j2), zzpv.m9184c(i9 << 3), iM2435b);
                    }
                    zzrtVar = this;
                    break;
                case 12:
                    if (zzrtVar.m9254p(zzqmVar2, i5, i4, i6, i2)) {
                        long j6 = unsafe.getInt(zzqmVar2, j2);
                        iM9184c = zzpv.m9184c(i9 << 3);
                        iM9185d = zzpv.m9185d(j6);
                        iM2435b += iM9185d + iM9184c;
                    }
                    zzrtVar = this;
                    break;
                case 13:
                    if (zzrtVar.m9254p(zzqmVar2, i5, i4, i6, i2)) {
                        iM2435b = AbstractC1456a.m2435b(i9 << 3, 4, iM2435b);
                    }
                    zzrtVar = this;
                    zzqmVar2 = zzqmVar;
                    break;
                case 14:
                    if (zzrtVar.m9254p(zzqmVar2, i5, i4, i6, i2)) {
                        iM2435b = AbstractC1456a.m2435b(i9 << 3, 8, iM2435b);
                    }
                    zzrtVar = this;
                    zzqmVar2 = zzqmVar;
                    break;
                case 15:
                    if (zzrtVar.m9254p(zzqmVar2, i5, i4, i6, i2)) {
                        int i14 = unsafe.getInt(zzqmVar2, j2);
                        iM2435b = AbstractC1456a.m2435b((i14 >> 31) ^ (i14 + i14), zzpv.m9184c(i9 << 3), iM2435b);
                    }
                    zzrtVar = this;
                    break;
                case 16:
                    if (zzrtVar.m9254p(zzqmVar2, i5, i4, i6, i2)) {
                        long j7 = unsafe.getLong(zzqmVar2, j2);
                        iM9184c = zzpv.m9184c(i9 << 3);
                        iM9185d = zzpv.m9185d((j7 >> 63) ^ (j7 + j7));
                        iM2435b += iM9185d + iM9184c;
                    }
                    zzrtVar = this;
                    break;
                case 17:
                    if (zzrtVar.m9254p(zzqmVar2, i5, i4, i6, i2)) {
                        zzrq zzrqVar = (zzrq) unsafe.getObject(zzqmVar2, j2);
                        zzsa zzsaVarM9251l = zzrtVar.m9251l(i5);
                        zzsr zzsrVar = zzsc.f21802a;
                        int iM9184c11 = zzpv.m9184c(i9 << 3);
                        iMo9144b = ((zzpa) zzrqVar).mo9144b(zzsaVarM9251l) + iM9184c11 + iM9184c11;
                        iM2435b += iMo9144b;
                    }
                    break;
                case 18:
                    iM9263g = zzsc.m9260d(i9, (List) unsafe.getObject(zzqmVar2, j2));
                    iM2435b += iM9263g;
                    break;
                case 19:
                    iM9263g = zzsc.m9259c(i9, (List) unsafe.getObject(zzqmVar2, j2));
                    iM2435b += iM9263g;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(zzqmVar2, j2);
                    zzsr zzsrVar2 = zzsc.f21802a;
                    if (list.size() == 0) {
                        iM9263g = 0;
                    } else {
                        iM9263g = (zzpv.m9184c(i9 << 3) * list.size()) + zzsc.m9262f(list);
                    }
                    iM2435b += iM9263g;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(zzqmVar2, j2);
                    zzsr zzsrVar3 = zzsc.f21802a;
                    size = list2.size();
                    if (size == 0) {
                        iM9263g = 0;
                    } else {
                        iM9267k = zzsc.m9267k(list2);
                        iM9184c4 = zzpv.m9184c(i9 << 3);
                        iM9263g = iM9267k + (iM9184c4 * size);
                    }
                    iM2435b += iM9263g;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(zzqmVar2, j2);
                    zzsr zzsrVar4 = zzsc.f21802a;
                    size = list3.size();
                    if (size == 0) {
                        iM9263g = 0;
                    } else {
                        iM9267k = zzsc.m9261e(list3);
                        iM9184c4 = zzpv.m9184c(i9 << 3);
                        iM9263g = iM9267k + (iM9184c4 * size);
                    }
                    iM2435b += iM9263g;
                    break;
                case 23:
                    iM9263g = zzsc.m9260d(i9, (List) unsafe.getObject(zzqmVar2, j2));
                    iM2435b += iM9263g;
                    break;
                case 24:
                    iM9263g = zzsc.m9259c(i9, (List) unsafe.getObject(zzqmVar2, j2));
                    iM2435b += iM9263g;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(zzqmVar2, j2);
                    zzsr zzsrVar5 = zzsc.f21802a;
                    int size3 = list4.size();
                    if (size3 == 0) {
                        iM9263g = 0;
                    } else {
                        iM9263g = size3 * (zzpv.m9184c(i9 << 3) + 1);
                    }
                    iM2435b += iM9263g;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(zzqmVar2, j2);
                    zzsr zzsrVar6 = zzsc.f21802a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iM9183b = 0;
                    } else {
                        int iM9184c12 = zzpv.m9184c(i9 << 3) * size4;
                        if (list5 instanceof zzrb) {
                            zzrb zzrbVar = (zzrb) list5;
                            iM9183b = iM9184c12;
                            for (int i15 = 0; i15 < size4; i15++) {
                                Object objZza = zzrbVar.zza();
                                if (objZza instanceof zzpm) {
                                    int iMo9150d3 = ((zzpm) objZza).mo9150d();
                                    iM9183b = AbstractC1456a.m2435b(iMo9150d3, iMo9150d3, iM9183b);
                                } else {
                                    iM9183b = zzpv.m9183b((String) objZza) + iM9183b;
                                }
                            }
                        } else {
                            iM9183b = iM9184c12;
                            for (int i16 = 0; i16 < size4; i16++) {
                                Object obj2 = list5.get(i16);
                                if (obj2 instanceof zzpm) {
                                    int iMo9150d4 = ((zzpm) obj2).mo9150d();
                                    iM9183b = AbstractC1456a.m2435b(iMo9150d4, iMo9150d4, iM9183b);
                                } else {
                                    iM9183b = zzpv.m9183b((String) obj2) + iM9183b;
                                }
                            }
                        }
                    }
                    iM2435b += iM9183b;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(zzqmVar2, j2);
                    zzsa zzsaVarM9251l2 = zzrtVar.m9251l(i5);
                    zzsr zzsrVar7 = zzsc.f21802a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iM9184c5 = 0;
                    } else {
                        iM9184c5 = zzpv.m9184c(i9 << 3) * size5;
                        for (int i17 = 0; i17 < size5; i17++) {
                            Object obj3 = list6.get(i17);
                            if (obj3 instanceof zzra) {
                                int iM9229a = ((zzra) obj3).m9229a();
                                iM9184c5 = AbstractC1456a.m2435b(iM9229a, iM9229a, iM9184c5);
                            } else {
                                int iMo9144b2 = ((zzpa) obj3).mo9144b(zzsaVarM9251l2);
                                iM9184c5 = AbstractC1456a.m2435b(iMo9144b2, iMo9144b2, iM9184c5);
                            }
                        }
                    }
                    iM2435b += iM9184c5;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(zzqmVar2, j2);
                    zzsr zzsrVar8 = zzsc.f21802a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iM9184c6 = 0;
                    } else {
                        iM9184c6 = zzpv.m9184c(i9 << 3) * size6;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int iMo9150d5 = ((zzpm) list7.get(i18)).mo9150d();
                            iM9184c6 = AbstractC1456a.m2435b(iMo9150d5, iMo9150d5, iM9184c6);
                        }
                    }
                    iM2435b += iM9184c6;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(zzqmVar2, j2);
                    zzsr zzsrVar9 = zzsc.f21802a;
                    size = list8.size();
                    if (size == 0) {
                        iM9263g = 0;
                    } else {
                        iM9267k = zzsc.m9266j(list8);
                        iM9184c4 = zzpv.m9184c(i9 << 3);
                        iM9263g = iM9267k + (iM9184c4 * size);
                    }
                    iM2435b += iM9263g;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(zzqmVar2, j2);
                    zzsr zzsrVar10 = zzsc.f21802a;
                    size = list9.size();
                    if (size == 0) {
                        iM9263g = 0;
                    } else {
                        iM9267k = zzsc.m9258b(list9);
                        iM9184c4 = zzpv.m9184c(i9 << 3);
                        iM9263g = iM9267k + (iM9184c4 * size);
                    }
                    iM2435b += iM9263g;
                    break;
                case 31:
                    iM9263g = zzsc.m9259c(i9, (List) unsafe.getObject(zzqmVar2, j2));
                    iM2435b += iM9263g;
                    break;
                case 32:
                    iM9263g = zzsc.m9260d(i9, (List) unsafe.getObject(zzqmVar2, j2));
                    iM2435b += iM9263g;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(zzqmVar2, j2);
                    zzsr zzsrVar11 = zzsc.f21802a;
                    size = list10.size();
                    if (size == 0) {
                        iM9263g = 0;
                    } else {
                        iM9267k = zzsc.m9264h(list10);
                        iM9184c4 = zzpv.m9184c(i9 << 3);
                        iM9263g = iM9267k + (iM9184c4 * size);
                    }
                    iM2435b += iM9263g;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(zzqmVar2, j2);
                    zzsr zzsrVar12 = zzsc.f21802a;
                    size = list11.size();
                    if (size == 0) {
                        iM9263g = 0;
                    } else {
                        iM9267k = zzsc.m9265i(list11);
                        iM9184c4 = zzpv.m9184c(i9 << 3);
                        iM9263g = iM9267k + (iM9184c4 * size);
                    }
                    iM2435b += iM9263g;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(zzqmVar2, j2);
                    zzsr zzsrVar13 = zzsc.f21802a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iM9184c7 = zzpv.m9184c(i9 << 3);
                        iM9184c8 = zzpv.m9184c(size2);
                        iM9185d2 = iM9184c8 + iM9184c7;
                        iM2435b += iM9185d2 + size2;
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(zzqmVar2, j2);
                    zzsr zzsrVar14 = zzsc.f21802a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iM9184c7 = zzpv.m9184c(i9 << 3);
                        iM9184c8 = zzpv.m9184c(size2);
                        iM9185d2 = iM9184c8 + iM9184c7;
                        iM2435b += iM9185d2 + size2;
                    }
                    break;
                case 37:
                    size2 = zzsc.m9262f((List) unsafe.getObject(zzqmVar2, j2));
                    if (size2 > 0) {
                        iM9184c7 = zzpv.m9184c(i9 << 3);
                        iM9184c8 = zzpv.m9184c(size2);
                        iM9185d2 = iM9184c8 + iM9184c7;
                        iM2435b += iM9185d2 + size2;
                    }
                    break;
                case 38:
                    size2 = zzsc.m9267k((List) unsafe.getObject(zzqmVar2, j2));
                    if (size2 > 0) {
                        iM9184c7 = zzpv.m9184c(i9 << 3);
                        iM9184c8 = zzpv.m9184c(size2);
                        iM9185d2 = iM9184c8 + iM9184c7;
                        iM2435b += iM9185d2 + size2;
                    }
                    break;
                case 39:
                    size2 = zzsc.m9261e((List) unsafe.getObject(zzqmVar2, j2));
                    if (size2 > 0) {
                        iM9184c7 = zzpv.m9184c(i9 << 3);
                        iM9184c8 = zzpv.m9184c(size2);
                        iM9185d2 = iM9184c8 + iM9184c7;
                        iM2435b += iM9185d2 + size2;
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(zzqmVar2, j2);
                    zzsr zzsrVar15 = zzsc.f21802a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iM9184c7 = zzpv.m9184c(i9 << 3);
                        iM9184c8 = zzpv.m9184c(size2);
                        iM9185d2 = iM9184c8 + iM9184c7;
                        iM2435b += iM9185d2 + size2;
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(zzqmVar2, j2);
                    zzsr zzsrVar16 = zzsc.f21802a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iM9184c7 = zzpv.m9184c(i9 << 3);
                        iM9184c8 = zzpv.m9184c(size2);
                        iM9185d2 = iM9184c8 + iM9184c7;
                        iM2435b += iM9185d2 + size2;
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(zzqmVar2, j2);
                    zzsr zzsrVar17 = zzsc.f21802a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iM9184c7 = zzpv.m9184c(i9 << 3);
                        iM9184c8 = zzpv.m9184c(size2);
                        iM9185d2 = iM9184c8 + iM9184c7;
                        iM2435b += iM9185d2 + size2;
                    }
                    break;
                case 43:
                    size2 = zzsc.m9266j((List) unsafe.getObject(zzqmVar2, j2));
                    if (size2 > 0) {
                        iM9184c7 = zzpv.m9184c(i9 << 3);
                        iM9184c8 = zzpv.m9184c(size2);
                        iM9185d2 = iM9184c8 + iM9184c7;
                        iM2435b += iM9185d2 + size2;
                    }
                    break;
                case 44:
                    size2 = zzsc.m9258b((List) unsafe.getObject(zzqmVar2, j2));
                    if (size2 > 0) {
                        iM9184c7 = zzpv.m9184c(i9 << 3);
                        iM9184c8 = zzpv.m9184c(size2);
                        iM9185d2 = iM9184c8 + iM9184c7;
                        iM2435b += iM9185d2 + size2;
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(zzqmVar2, j2);
                    zzsr zzsrVar18 = zzsc.f21802a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iM9184c7 = zzpv.m9184c(i9 << 3);
                        iM9184c8 = zzpv.m9184c(size2);
                        iM9185d2 = iM9184c8 + iM9184c7;
                        iM2435b += iM9185d2 + size2;
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(zzqmVar2, j2);
                    zzsr zzsrVar19 = zzsc.f21802a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iM9184c7 = zzpv.m9184c(i9 << 3);
                        iM9184c8 = zzpv.m9184c(size2);
                        iM9185d2 = iM9184c8 + iM9184c7;
                        iM2435b += iM9185d2 + size2;
                    }
                    break;
                case 47:
                    size2 = zzsc.m9264h((List) unsafe.getObject(zzqmVar2, j2));
                    if (size2 > 0) {
                        iM9184c7 = zzpv.m9184c(i9 << 3);
                        iM9184c8 = zzpv.m9184c(size2);
                        iM9185d2 = iM9184c8 + iM9184c7;
                        iM2435b += iM9185d2 + size2;
                    }
                    break;
                case 48:
                    size2 = zzsc.m9265i((List) unsafe.getObject(zzqmVar2, j2));
                    if (size2 > 0) {
                        iM9184c7 = zzpv.m9184c(i9 << 3);
                        iM9184c8 = zzpv.m9184c(size2);
                        iM9185d2 = iM9184c8 + iM9184c7;
                        iM2435b += iM9185d2 + size2;
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(zzqmVar2, j2);
                    zzsa zzsaVarM9251l3 = zzrtVar.m9251l(i5);
                    zzsr zzsrVar20 = zzsc.f21802a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iM9184c5 = 0;
                    } else {
                        iM9184c5 = 0;
                        for (int i19 = 0; i19 < size7; i19++) {
                            zzrq zzrqVar2 = (zzrq) list19.get(i19);
                            int iM9184c13 = zzpv.m9184c(i9 << 3);
                            iM9184c5 += ((zzpa) zzrqVar2).mo9144b(zzsaVarM9251l3) + iM9184c13 + iM9184c13;
                        }
                    }
                    iM2435b += iM9184c5;
                    break;
                case 50:
                    int i20 = i5 / 3;
                    zzrk zzrkVar = (zzrk) unsafe.getObject(zzqmVar2, j2);
                    zzrj zzrjVar = (zzrj) zzrtVar.f21781b[i20 + i20];
                    if (zzrkVar.isEmpty()) {
                        iM9183b = 0;
                    } else {
                        iM9183b = 0;
                        for (Map.Entry entry2 : zzrkVar.entrySet()) {
                            Object key = entry2.getKey();
                            Object value = entry2.getValue();
                            zzri zzriVar = zzrjVar.f21773a;
                            int iM9184c14 = zzpv.m9184c(i9 << 3);
                            int iM9209a = zzqf.m9209a(zzriVar.f21771a, 1, key) + zzqf.m9209a(zzriVar.f21772b, 2, value);
                            iM9183b += zzpv.m9184c(iM9209a) + iM9209a + iM9184c14;
                        }
                    }
                    iM2435b += iM9183b;
                    break;
                case 51:
                    if (zzrtVar.m9249f(i9, i5, zzqmVar2)) {
                        iM2435b = AbstractC1456a.m2435b(i9 << 3, 8, iM2435b);
                    }
                    break;
                case 52:
                    if (zzrtVar.m9249f(i9, i5, zzqmVar2)) {
                        iM2435b = AbstractC1456a.m2435b(i9 << 3, 4, iM2435b);
                    }
                    break;
                case 53:
                    if (zzrtVar.m9249f(i9, i5, zzqmVar2)) {
                        long jM9242k = m9242k(j2, zzqmVar2);
                        size2 = zzpv.m9184c(i9 << 3);
                        iM9185d2 = zzpv.m9185d(jM9242k);
                        iM2435b += iM9185d2 + size2;
                    }
                    break;
                case 54:
                    if (zzrtVar.m9249f(i9, i5, zzqmVar2)) {
                        long jM9242k2 = m9242k(j2, zzqmVar2);
                        size2 = zzpv.m9184c(i9 << 3);
                        iM9185d2 = zzpv.m9185d(jM9242k2);
                        iM2435b += iM9185d2 + size2;
                    }
                    break;
                case 55:
                    if (zzrtVar.m9249f(i9, i5, zzqmVar2)) {
                        long jM9240h = m9240h(j2, zzqmVar2);
                        size2 = zzpv.m9184c(i9 << 3);
                        iM9185d2 = zzpv.m9185d(jM9240h);
                        iM2435b += iM9185d2 + size2;
                    }
                    break;
                case 56:
                    if (zzrtVar.m9249f(i9, i5, zzqmVar2)) {
                        iM2435b = AbstractC1456a.m2435b(i9 << 3, 8, iM2435b);
                    }
                    break;
                case 57:
                    if (zzrtVar.m9249f(i9, i5, zzqmVar2)) {
                        iM2435b = AbstractC1456a.m2435b(i9 << 3, 4, iM2435b);
                    }
                    break;
                case 58:
                    if (zzrtVar.m9249f(i9, i5, zzqmVar2)) {
                        iM2435b = AbstractC1456a.m2435b(i9 << 3, 1, iM2435b);
                    }
                    break;
                case 59:
                    if (zzrtVar.m9249f(i9, i5, zzqmVar2)) {
                        int i21 = i9 << 3;
                        Object object2 = unsafe.getObject(zzqmVar2, j2);
                        if (object2 instanceof zzpm) {
                            iM9184c9 = zzpv.m9184c(i21);
                            iMo9150d2 = ((zzpm) object2).mo9150d();
                            iM9184c10 = zzpv.m9184c(iMo9150d2);
                            iM2435b += iM9184c10 + iMo9150d2 + iM9184c9;
                        } else {
                            size2 = zzpv.m9184c(i21);
                            iM9185d2 = zzpv.m9183b((String) object2);
                            iM2435b += iM9185d2 + size2;
                        }
                    }
                    break;
                case 60:
                    if (zzrtVar.m9249f(i9, i5, zzqmVar2)) {
                        iM9263g = zzsc.m9263g(i9, unsafe.getObject(zzqmVar2, j2), zzrtVar.m9251l(i5));
                        iM2435b += iM9263g;
                    }
                    break;
                case 61:
                    if (zzrtVar.m9249f(i9, i5, zzqmVar2)) {
                        zzpm zzpmVar2 = (zzpm) unsafe.getObject(zzqmVar2, j2);
                        iM9184c9 = zzpv.m9184c(i9 << 3);
                        iMo9150d2 = zzpmVar2.mo9150d();
                        iM9184c10 = zzpv.m9184c(iMo9150d2);
                        iM2435b += iM9184c10 + iMo9150d2 + iM9184c9;
                    }
                    break;
                case 62:
                    if (zzrtVar.m9249f(i9, i5, zzqmVar2)) {
                        iM2435b = AbstractC1456a.m2435b(m9240h(j2, zzqmVar2), zzpv.m9184c(i9 << 3), iM2435b);
                    }
                    break;
                case 63:
                    if (zzrtVar.m9249f(i9, i5, zzqmVar2)) {
                        long jM9240h2 = m9240h(j2, zzqmVar2);
                        size2 = zzpv.m9184c(i9 << 3);
                        iM9185d2 = zzpv.m9185d(jM9240h2);
                        iM2435b += iM9185d2 + size2;
                    }
                    break;
                case 64:
                    if (zzrtVar.m9249f(i9, i5, zzqmVar2)) {
                        iM2435b = AbstractC1456a.m2435b(i9 << 3, 4, iM2435b);
                    }
                    break;
                case 65:
                    if (zzrtVar.m9249f(i9, i5, zzqmVar2)) {
                        iM2435b = AbstractC1456a.m2435b(i9 << 3, 8, iM2435b);
                    }
                    break;
                case 66:
                    if (zzrtVar.m9249f(i9, i5, zzqmVar2)) {
                        int iM9240h = m9240h(j2, zzqmVar2);
                        iM2435b = AbstractC1456a.m2435b((iM9240h >> 31) ^ (iM9240h + iM9240h), zzpv.m9184c(i9 << 3), iM2435b);
                    }
                    break;
                case 67:
                    if (zzrtVar.m9249f(i9, i5, zzqmVar2)) {
                        long jM9242k3 = m9242k(j2, zzqmVar2);
                        size2 = zzpv.m9184c(i9 << 3);
                        iM9185d2 = zzpv.m9185d((jM9242k3 >> 63) ^ (jM9242k3 + jM9242k3));
                        iM2435b += iM9185d2 + size2;
                    }
                    break;
                case 68:
                    if (zzrtVar.m9249f(i9, i5, zzqmVar2)) {
                        zzrq zzrqVar3 = (zzrq) unsafe.getObject(zzqmVar2, j2);
                        zzsa zzsaVarM9251l4 = zzrtVar.m9251l(i5);
                        zzsr zzsrVar21 = zzsc.f21802a;
                        int iM9184c15 = zzpv.m9184c(i9 << 3);
                        iMo9144b = ((zzpa) zzrqVar3).mo9144b(zzsaVarM9251l4) + iM9184c15 + iM9184c15;
                        iM2435b += iMo9144b;
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
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
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    /* JADX INFO: renamed from: e */
    public final void mo9248e(Object obj, zzpw zzpwVar) {
        Map.Entry entry;
        int i2;
        int i3;
        int i4;
        int i5;
        zzrt<T> zzrtVar = this;
        zzpv zzpvVar = zzpwVar.f21723a;
        if (zzrtVar.f21783d) {
            zzqf zzqfVar = ((zzqk) obj).zzb;
            if (zzqfVar.f21729a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzqfVar.m9212b().next();
            }
        } else {
            entry = null;
        }
        Unsafe unsafe = f21779h;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = zzrtVar.f21780a;
            if (i8 >= iArr.length) {
                if (entry == null) {
                    zzsq zzsqVar = ((zzqm) obj).zzc;
                    return;
                } else {
                    throw null;
                }
            }
            int iM9250j = zzrtVar.m9250j(i8);
            int iM9241i = m9241i(iM9250j);
            int i10 = iArr[i8];
            if (iM9241i <= 17) {
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
            long j2 = iM9250j & i6;
            switch (iM9241i) {
                case 0:
                    if (zzrtVar.m9254p(obj, i8, i7, i9, i3)) {
                        zzpwVar.m9195i(i10, zzsw.f21825c.mo9279a(j2, obj));
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 1:
                    if (zzrtVar.m9254p(obj, i8, i7, i9, i3)) {
                        zzpwVar.m9199m(zzsw.f21825c.mo9280b(j2, obj), i10);
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 2:
                    if (zzrtVar.m9254p(obj, i8, i7, i9, i3)) {
                        zzpwVar.m9202p(i10, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 3:
                    if (zzrtVar.m9254p(obj, i8, i7, i9, i3)) {
                        zzpwVar.m9191e(i10, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 4:
                    if (zzrtVar.m9254p(obj, i8, i7, i9, i3)) {
                        zzpwVar.m9201o(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 5:
                    if (zzrtVar.m9254p(obj, i8, i7, i9, i3)) {
                        zzpwVar.m9198l(i10, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 6:
                    if (zzrtVar.m9254p(obj, i8, i7, i9, i3)) {
                        zzpwVar.m9197k(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 7:
                    if (zzrtVar.m9254p(obj, i8, i7, i9, i3)) {
                        zzpwVar.m9192f(i10, zzsw.f21825c.mo9282d(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 8:
                    if (zzrtVar.m9254p(obj, i8, i7, i9, i3)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            zzpvVar.mo9172r(i10, (String) object);
                        } else {
                            zzpwVar.m9193g(i10, (zzpm) object);
                        }
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 9:
                    if (zzrtVar.m9254p(obj, i8, i7, i9, i3)) {
                        zzpwVar.m9203q(i10, unsafe.getObject(obj, j2), zzrtVar.m9251l(i8));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 10:
                    if (zzrtVar.m9254p(obj, i8, i7, i9, i3)) {
                        zzpwVar.m9193g(i10, (zzpm) unsafe.getObject(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 11:
                    if (zzrtVar.m9254p(obj, i8, i7, i9, i3)) {
                        zzpwVar.m9190d(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 12:
                    if (zzrtVar.m9254p(obj, i8, i7, i9, i3)) {
                        zzpwVar.m9196j(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 13:
                    if (zzrtVar.m9254p(obj, i8, i7, i9, i3)) {
                        zzpwVar.m9204r(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 14:
                    if (zzrtVar.m9254p(obj, i8, i7, i9, i3)) {
                        zzpwVar.m9205s(i10, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 15:
                    if (zzrtVar.m9254p(obj, i8, i7, i9, i3)) {
                        zzpwVar.m9187a(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 16:
                    if (zzrtVar.m9254p(obj, i8, i7, i9, i3)) {
                        zzpwVar.m9188b(i10, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 17:
                    if (zzrtVar.m9254p(obj, i8, i7, i9, i3)) {
                        zzpwVar.m9200n(i10, unsafe.getObject(obj, j2), zzrtVar.m9251l(i8));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 18:
                    i4 = i7;
                    i5 = i9;
                    int i13 = iArr[i8];
                    List list = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar = zzsc.f21802a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof zzpx) {
                            zzpx zzpxVar = (zzpx) list;
                            for (int i14 = 0; i14 < zzpxVar.f21726u; i14++) {
                                zzpxVar.m9206b(i14);
                                zzpvVar.mo9167m(i13, Double.doubleToRawLongBits(zzpxVar.f21725t[i14]));
                            }
                        } else {
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                zzpvVar.mo9167m(i13, Double.doubleToRawLongBits(((Double) list.get(i15)).doubleValue()));
                            }
                        }
                    }
                    break;
                case 19:
                    i4 = i7;
                    i5 = i9;
                    int i16 = iArr[i8];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar2 = zzsc.f21802a;
                    if (list2 != null && !list2.isEmpty()) {
                        if (list2 instanceof zzqh) {
                            zzqh zzqhVar = (zzqh) list2;
                            for (int i17 = 0; i17 < zzqhVar.f21739u; i17++) {
                                zzqhVar.m9214b(i17);
                                zzpvVar.mo9165k(i16, Float.floatToRawIntBits(zzqhVar.f21738t[i17]));
                            }
                        } else {
                            for (int i18 = 0; i18 < list2.size(); i18++) {
                                zzpvVar.mo9165k(i16, Float.floatToRawIntBits(((Float) list2.get(i18)).floatValue()));
                            }
                        }
                    }
                    break;
                case 20:
                    i4 = i7;
                    i5 = i9;
                    int i19 = iArr[i8];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar3 = zzsc.f21802a;
                    if (list3 != null && !list3.isEmpty()) {
                        if (list3 instanceof zzre) {
                            zzre zzreVar = (zzre) list3;
                            for (int i20 = 0; i20 < zzreVar.f21767u; i20++) {
                                zzpvVar.mo9177w(i19, zzreVar.m9232b(i20));
                            }
                        } else {
                            for (int i21 = 0; i21 < list3.size(); i21++) {
                                zzpvVar.mo9177w(i19, ((Long) list3.get(i21)).longValue());
                            }
                        }
                    }
                    break;
                case 21:
                    i4 = i7;
                    i5 = i9;
                    int i22 = iArr[i8];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar4 = zzsc.f21802a;
                    if (list4 != null && !list4.isEmpty()) {
                        if (list4 instanceof zzre) {
                            zzre zzreVar2 = (zzre) list4;
                            for (int i23 = 0; i23 < zzreVar2.f21767u; i23++) {
                                zzpvVar.mo9177w(i22, zzreVar2.m9232b(i23));
                            }
                        } else {
                            for (int i24 = 0; i24 < list4.size(); i24++) {
                                zzpvVar.mo9177w(i22, ((Long) list4.get(i24)).longValue());
                            }
                        }
                    }
                    break;
                case 22:
                    i4 = i7;
                    i5 = i9;
                    int i25 = iArr[i8];
                    List list5 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar5 = zzsc.f21802a;
                    if (list5 != null && !list5.isEmpty()) {
                        if (list5 instanceof zzqn) {
                            zzqn zzqnVar = (zzqn) list5;
                            for (int i26 = 0; i26 < zzqnVar.f21746u; i26++) {
                                zzpvVar.mo9169o(i25, zzqnVar.m9228b(i26));
                            }
                        } else {
                            for (int i27 = 0; i27 < list5.size(); i27++) {
                                zzpvVar.mo9169o(i25, ((Integer) list5.get(i27)).intValue());
                            }
                        }
                    }
                    break;
                case 23:
                    i4 = i7;
                    i5 = i9;
                    int i28 = iArr[i8];
                    List list6 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar6 = zzsc.f21802a;
                    if (list6 != null && !list6.isEmpty()) {
                        if (list6 instanceof zzre) {
                            zzre zzreVar3 = (zzre) list6;
                            for (int i29 = 0; i29 < zzreVar3.f21767u; i29++) {
                                zzpvVar.mo9167m(i28, zzreVar3.m9232b(i29));
                            }
                        } else {
                            for (int i30 = 0; i30 < list6.size(); i30++) {
                                zzpvVar.mo9167m(i28, ((Long) list6.get(i30)).longValue());
                            }
                        }
                    }
                    break;
                case 24:
                    i4 = i7;
                    i5 = i9;
                    int i31 = iArr[i8];
                    List list7 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar7 = zzsc.f21802a;
                    if (list7 != null && !list7.isEmpty()) {
                        if (list7 instanceof zzqn) {
                            zzqn zzqnVar2 = (zzqn) list7;
                            for (int i32 = 0; i32 < zzqnVar2.f21746u; i32++) {
                                zzpvVar.mo9165k(i31, zzqnVar2.m9228b(i32));
                            }
                        } else {
                            for (int i33 = 0; i33 < list7.size(); i33++) {
                                zzpvVar.mo9165k(i31, ((Integer) list7.get(i33)).intValue());
                            }
                        }
                    }
                    break;
                case 25:
                    i4 = i7;
                    i5 = i9;
                    int i34 = iArr[i8];
                    List list8 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar8 = zzsc.f21802a;
                    if (list8 != null && !list8.isEmpty()) {
                        if (list8 instanceof zzpd) {
                            zzpd zzpdVar = (zzpd) list8;
                            for (int i35 = 0; i35 < zzpdVar.f21708u; i35++) {
                                zzpdVar.m9146b(i35);
                                zzpvVar.mo9161g(i34, zzpdVar.f21707t[i35]);
                            }
                        } else {
                            for (int i36 = 0; i36 < list8.size(); i36++) {
                                zzpvVar.mo9161g(i34, ((Boolean) list8.get(i36)).booleanValue());
                            }
                        }
                    }
                    break;
                case 26:
                    i4 = i7;
                    i5 = i9;
                    int i37 = iArr[i8];
                    List list9 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar9 = zzsc.f21802a;
                    if (list9 != null && !list9.isEmpty()) {
                        zzpwVar.m9189c(i37, list9);
                    }
                    break;
                case 27:
                    i4 = i7;
                    i5 = i9;
                    int i38 = iArr[i8];
                    List list10 = (List) unsafe.getObject(obj, j2);
                    zzsa zzsaVarM9251l = zzrtVar.m9251l(i8);
                    zzsr zzsrVar10 = zzsc.f21802a;
                    if (list10 != null && !list10.isEmpty()) {
                        for (int i39 = 0; i39 < list10.size(); i39++) {
                            zzpwVar.m9203q(i38, list10.get(i39), zzsaVarM9251l);
                        }
                    }
                    break;
                case 28:
                    i4 = i7;
                    i5 = i9;
                    int i40 = iArr[i8];
                    List list11 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar11 = zzsc.f21802a;
                    if (list11 != null && !list11.isEmpty()) {
                        zzpwVar.m9194h(i40, list11);
                    }
                    break;
                case 29:
                    i4 = i7;
                    i5 = i9;
                    int i41 = iArr[i8];
                    List list12 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar12 = zzsc.f21802a;
                    if (list12 != null && !list12.isEmpty()) {
                        if (list12 instanceof zzqn) {
                            zzqn zzqnVar3 = (zzqn) list12;
                            for (int i42 = 0; i42 < zzqnVar3.f21746u; i42++) {
                                zzpvVar.mo9175u(i41, zzqnVar3.m9228b(i42));
                            }
                        } else {
                            for (int i43 = 0; i43 < list12.size(); i43++) {
                                zzpvVar.mo9175u(i41, ((Integer) list12.get(i43)).intValue());
                            }
                        }
                    }
                    break;
                case 30:
                    i4 = i7;
                    i5 = i9;
                    int i44 = iArr[i8];
                    List list13 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar13 = zzsc.f21802a;
                    if (list13 != null && !list13.isEmpty()) {
                        if (list13 instanceof zzqn) {
                            zzqn zzqnVar4 = (zzqn) list13;
                            for (int i45 = 0; i45 < zzqnVar4.f21746u; i45++) {
                                zzpvVar.mo9169o(i44, zzqnVar4.m9228b(i45));
                            }
                        } else {
                            for (int i46 = 0; i46 < list13.size(); i46++) {
                                zzpvVar.mo9169o(i44, ((Integer) list13.get(i46)).intValue());
                            }
                        }
                    }
                    break;
                case 31:
                    i4 = i7;
                    i5 = i9;
                    int i47 = iArr[i8];
                    List list14 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar14 = zzsc.f21802a;
                    if (list14 != null && !list14.isEmpty()) {
                        if (list14 instanceof zzqn) {
                            zzqn zzqnVar5 = (zzqn) list14;
                            for (int i48 = 0; i48 < zzqnVar5.f21746u; i48++) {
                                zzpvVar.mo9165k(i47, zzqnVar5.m9228b(i48));
                            }
                        } else {
                            for (int i49 = 0; i49 < list14.size(); i49++) {
                                zzpvVar.mo9165k(i47, ((Integer) list14.get(i49)).intValue());
                            }
                        }
                    }
                    break;
                case 32:
                    i4 = i7;
                    i5 = i9;
                    int i50 = iArr[i8];
                    List list15 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar15 = zzsc.f21802a;
                    if (list15 != null && !list15.isEmpty()) {
                        if (list15 instanceof zzre) {
                            zzre zzreVar4 = (zzre) list15;
                            for (int i51 = 0; i51 < zzreVar4.f21767u; i51++) {
                                zzpvVar.mo9167m(i50, zzreVar4.m9232b(i51));
                            }
                        } else {
                            for (int i52 = 0; i52 < list15.size(); i52++) {
                                zzpvVar.mo9167m(i50, ((Long) list15.get(i52)).longValue());
                            }
                        }
                    }
                    break;
                case 33:
                    i4 = i7;
                    i5 = i9;
                    int i53 = iArr[i8];
                    List list16 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar16 = zzsc.f21802a;
                    if (list16 != null && !list16.isEmpty()) {
                        if (list16 instanceof zzqn) {
                            zzqn zzqnVar6 = (zzqn) list16;
                            for (int i54 = 0; i54 < zzqnVar6.f21746u; i54++) {
                                int iM9228b = zzqnVar6.m9228b(i54);
                                zzpvVar.mo9175u(i53, (iM9228b >> 31) ^ (iM9228b + iM9228b));
                            }
                        } else {
                            for (int i55 = 0; i55 < list16.size(); i55++) {
                                int iIntValue = ((Integer) list16.get(i55)).intValue();
                                zzpvVar.mo9175u(i53, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                            }
                        }
                    }
                    break;
                case 34:
                    i4 = i7;
                    i5 = i9;
                    int i56 = iArr[i8];
                    List list17 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar17 = zzsc.f21802a;
                    if (list17 != null && !list17.isEmpty()) {
                        if (list17 instanceof zzre) {
                            zzre zzreVar5 = (zzre) list17;
                            for (int i57 = 0; i57 < zzreVar5.f21767u; i57++) {
                                long jM9232b = zzreVar5.m9232b(i57);
                                zzpvVar.mo9177w(i56, (jM9232b >> 63) ^ (jM9232b + jM9232b));
                            }
                        } else {
                            for (int i58 = 0; i58 < list17.size(); i58++) {
                                long jLongValue = ((Long) list17.get(i58)).longValue();
                                zzpvVar.mo9177w(i56, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                            }
                        }
                    }
                    break;
                case 35:
                    i4 = i7;
                    i5 = i9;
                    int i59 = iArr[i8];
                    List list18 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar18 = zzsc.f21802a;
                    if (list18 != null && !list18.isEmpty()) {
                        if (list18 instanceof zzpx) {
                            zzpx zzpxVar2 = (zzpx) list18;
                            zzpvVar.mo9174t(i59, 2);
                            int i60 = 0;
                            for (int i61 = 0; i61 < zzpxVar2.f21726u; i61++) {
                                zzpxVar2.m9206b(i61);
                                double d = zzpxVar2.f21725t[i61];
                                i60 += 8;
                            }
                            zzpvVar.mo9176v(i60);
                            for (int i62 = 0; i62 < zzpxVar2.f21726u; i62++) {
                                zzpxVar2.m9206b(i62);
                                zzpvVar.mo9168n(Double.doubleToRawLongBits(zzpxVar2.f21725t[i62]));
                            }
                        } else {
                            zzpvVar.mo9174t(i59, 2);
                            int i63 = 0;
                            for (int i64 = 0; i64 < list18.size(); i64++) {
                                ((Double) list18.get(i64)).getClass();
                                i63 += 8;
                            }
                            zzpvVar.mo9176v(i63);
                            for (int i65 = 0; i65 < list18.size(); i65++) {
                                zzpvVar.mo9168n(Double.doubleToRawLongBits(((Double) list18.get(i65)).doubleValue()));
                            }
                        }
                    }
                    break;
                case 36:
                    i4 = i7;
                    i5 = i9;
                    int i66 = iArr[i8];
                    List list19 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar19 = zzsc.f21802a;
                    if (list19 != null && !list19.isEmpty()) {
                        if (list19 instanceof zzqh) {
                            zzqh zzqhVar2 = (zzqh) list19;
                            zzpvVar.mo9174t(i66, 2);
                            int i67 = 0;
                            for (int i68 = 0; i68 < zzqhVar2.f21739u; i68++) {
                                zzqhVar2.m9214b(i68);
                                float f2 = zzqhVar2.f21738t[i68];
                                i67 += 4;
                            }
                            zzpvVar.mo9176v(i67);
                            for (int i69 = 0; i69 < zzqhVar2.f21739u; i69++) {
                                zzqhVar2.m9214b(i69);
                                zzpvVar.mo9166l(Float.floatToRawIntBits(zzqhVar2.f21738t[i69]));
                            }
                        } else {
                            zzpvVar.mo9174t(i66, 2);
                            int i70 = 0;
                            for (int i71 = 0; i71 < list19.size(); i71++) {
                                ((Float) list19.get(i71)).getClass();
                                i70 += 4;
                            }
                            zzpvVar.mo9176v(i70);
                            for (int i72 = 0; i72 < list19.size(); i72++) {
                                zzpvVar.mo9166l(Float.floatToRawIntBits(((Float) list19.get(i72)).floatValue()));
                            }
                        }
                    }
                    break;
                case 37:
                    i4 = i7;
                    i5 = i9;
                    int i73 = iArr[i8];
                    List list20 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar20 = zzsc.f21802a;
                    if (list20 != null && !list20.isEmpty()) {
                        if (list20 instanceof zzre) {
                            zzre zzreVar6 = (zzre) list20;
                            zzpvVar.mo9174t(i73, 2);
                            int iM9185d = 0;
                            for (int i74 = 0; i74 < zzreVar6.f21767u; i74++) {
                                iM9185d += zzpv.m9185d(zzreVar6.m9232b(i74));
                            }
                            zzpvVar.mo9176v(iM9185d);
                            for (int i75 = 0; i75 < zzreVar6.f21767u; i75++) {
                                zzpvVar.mo9178x(zzreVar6.m9232b(i75));
                            }
                        } else {
                            zzpvVar.mo9174t(i73, 2);
                            int iM9185d2 = 0;
                            for (int i76 = 0; i76 < list20.size(); i76++) {
                                iM9185d2 += zzpv.m9185d(((Long) list20.get(i76)).longValue());
                            }
                            zzpvVar.mo9176v(iM9185d2);
                            for (int i77 = 0; i77 < list20.size(); i77++) {
                                zzpvVar.mo9178x(((Long) list20.get(i77)).longValue());
                            }
                        }
                    }
                    break;
                case 38:
                    i4 = i7;
                    i5 = i9;
                    int i78 = iArr[i8];
                    List list21 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar21 = zzsc.f21802a;
                    if (list21 != null && !list21.isEmpty()) {
                        if (list21 instanceof zzre) {
                            zzre zzreVar7 = (zzre) list21;
                            zzpvVar.mo9174t(i78, 2);
                            int iM9185d3 = 0;
                            for (int i79 = 0; i79 < zzreVar7.f21767u; i79++) {
                                iM9185d3 += zzpv.m9185d(zzreVar7.m9232b(i79));
                            }
                            zzpvVar.mo9176v(iM9185d3);
                            for (int i80 = 0; i80 < zzreVar7.f21767u; i80++) {
                                zzpvVar.mo9178x(zzreVar7.m9232b(i80));
                            }
                        } else {
                            zzpvVar.mo9174t(i78, 2);
                            int iM9185d4 = 0;
                            for (int i81 = 0; i81 < list21.size(); i81++) {
                                iM9185d4 += zzpv.m9185d(((Long) list21.get(i81)).longValue());
                            }
                            zzpvVar.mo9176v(iM9185d4);
                            for (int i82 = 0; i82 < list21.size(); i82++) {
                                zzpvVar.mo9178x(((Long) list21.get(i82)).longValue());
                            }
                        }
                    }
                    break;
                case 39:
                    i4 = i7;
                    i5 = i9;
                    int i83 = iArr[i8];
                    List list22 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar22 = zzsc.f21802a;
                    if (list22 != null && !list22.isEmpty()) {
                        if (list22 instanceof zzqn) {
                            zzqn zzqnVar7 = (zzqn) list22;
                            zzpvVar.mo9174t(i83, 2);
                            int iM9185d5 = 0;
                            for (int i84 = 0; i84 < zzqnVar7.f21746u; i84++) {
                                iM9185d5 += zzpv.m9185d(zzqnVar7.m9228b(i84));
                            }
                            zzpvVar.mo9176v(iM9185d5);
                            for (int i85 = 0; i85 < zzqnVar7.f21746u; i85++) {
                                zzpvVar.mo9170p(zzqnVar7.m9228b(i85));
                            }
                        } else {
                            zzpvVar.mo9174t(i83, 2);
                            int iM9185d6 = 0;
                            for (int i86 = 0; i86 < list22.size(); i86++) {
                                iM9185d6 += zzpv.m9185d(((Integer) list22.get(i86)).intValue());
                            }
                            zzpvVar.mo9176v(iM9185d6);
                            for (int i87 = 0; i87 < list22.size(); i87++) {
                                zzpvVar.mo9170p(((Integer) list22.get(i87)).intValue());
                            }
                        }
                    }
                    break;
                case 40:
                    i4 = i7;
                    i5 = i9;
                    int i88 = iArr[i8];
                    List list23 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar23 = zzsc.f21802a;
                    if (list23 != null && !list23.isEmpty()) {
                        if (list23 instanceof zzre) {
                            zzre zzreVar8 = (zzre) list23;
                            zzpvVar.mo9174t(i88, 2);
                            int i89 = 0;
                            for (int i90 = 0; i90 < zzreVar8.f21767u; i90++) {
                                zzreVar8.m9232b(i90);
                                i89 += 8;
                            }
                            zzpvVar.mo9176v(i89);
                            for (int i91 = 0; i91 < zzreVar8.f21767u; i91++) {
                                zzpvVar.mo9168n(zzreVar8.m9232b(i91));
                            }
                        } else {
                            zzpvVar.mo9174t(i88, 2);
                            int i92 = 0;
                            for (int i93 = 0; i93 < list23.size(); i93++) {
                                ((Long) list23.get(i93)).getClass();
                                i92 += 8;
                            }
                            zzpvVar.mo9176v(i92);
                            for (int i94 = 0; i94 < list23.size(); i94++) {
                                zzpvVar.mo9168n(((Long) list23.get(i94)).longValue());
                            }
                        }
                    }
                    break;
                case 41:
                    i4 = i7;
                    i5 = i9;
                    int i95 = iArr[i8];
                    List list24 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar24 = zzsc.f21802a;
                    if (list24 != null && !list24.isEmpty()) {
                        if (list24 instanceof zzqn) {
                            zzqn zzqnVar8 = (zzqn) list24;
                            zzpvVar.mo9174t(i95, 2);
                            int i96 = 0;
                            for (int i97 = 0; i97 < zzqnVar8.f21746u; i97++) {
                                zzqnVar8.m9228b(i97);
                                i96 += 4;
                            }
                            zzpvVar.mo9176v(i96);
                            for (int i98 = 0; i98 < zzqnVar8.f21746u; i98++) {
                                zzpvVar.mo9166l(zzqnVar8.m9228b(i98));
                            }
                        } else {
                            zzpvVar.mo9174t(i95, 2);
                            int i99 = 0;
                            for (int i100 = 0; i100 < list24.size(); i100++) {
                                ((Integer) list24.get(i100)).getClass();
                                i99 += 4;
                            }
                            zzpvVar.mo9176v(i99);
                            for (int i101 = 0; i101 < list24.size(); i101++) {
                                zzpvVar.mo9166l(((Integer) list24.get(i101)).intValue());
                            }
                        }
                    }
                    break;
                case 42:
                    i4 = i7;
                    i5 = i9;
                    int i102 = iArr[i8];
                    List list25 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar25 = zzsc.f21802a;
                    if (list25 != null && !list25.isEmpty()) {
                        if (list25 instanceof zzpd) {
                            zzpd zzpdVar2 = (zzpd) list25;
                            zzpvVar.mo9174t(i102, 2);
                            int i103 = 0;
                            for (int i104 = 0; i104 < zzpdVar2.f21708u; i104++) {
                                zzpdVar2.m9146b(i104);
                                boolean z = zzpdVar2.f21707t[i104];
                                i103++;
                            }
                            zzpvVar.mo9176v(i103);
                            for (int i105 = 0; i105 < zzpdVar2.f21708u; i105++) {
                                zzpdVar2.m9146b(i105);
                                zzpvVar.mo9160f(zzpdVar2.f21707t[i105] ? (byte) 1 : (byte) 0);
                            }
                        } else {
                            zzpvVar.mo9174t(i102, 2);
                            int i106 = 0;
                            for (int i107 = 0; i107 < list25.size(); i107++) {
                                ((Boolean) list25.get(i107)).getClass();
                                i106++;
                            }
                            zzpvVar.mo9176v(i106);
                            for (int i108 = 0; i108 < list25.size(); i108++) {
                                zzpvVar.mo9160f(((Boolean) list25.get(i108)).booleanValue() ? (byte) 1 : (byte) 0);
                            }
                        }
                    }
                    break;
                case 43:
                    i4 = i7;
                    i5 = i9;
                    int i109 = iArr[i8];
                    List list26 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar26 = zzsc.f21802a;
                    if (list26 != null && !list26.isEmpty()) {
                        if (list26 instanceof zzqn) {
                            zzqn zzqnVar9 = (zzqn) list26;
                            zzpvVar.mo9174t(i109, 2);
                            int iM9184c = 0;
                            for (int i110 = 0; i110 < zzqnVar9.f21746u; i110++) {
                                iM9184c += zzpv.m9184c(zzqnVar9.m9228b(i110));
                            }
                            zzpvVar.mo9176v(iM9184c);
                            for (int i111 = 0; i111 < zzqnVar9.f21746u; i111++) {
                                zzpvVar.mo9176v(zzqnVar9.m9228b(i111));
                            }
                        } else {
                            zzpvVar.mo9174t(i109, 2);
                            int iM9184c2 = 0;
                            for (int i112 = 0; i112 < list26.size(); i112++) {
                                iM9184c2 += zzpv.m9184c(((Integer) list26.get(i112)).intValue());
                            }
                            zzpvVar.mo9176v(iM9184c2);
                            for (int i113 = 0; i113 < list26.size(); i113++) {
                                zzpvVar.mo9176v(((Integer) list26.get(i113)).intValue());
                            }
                        }
                    }
                    break;
                case 44:
                    i4 = i7;
                    i5 = i9;
                    int i114 = iArr[i8];
                    List list27 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar27 = zzsc.f21802a;
                    if (list27 != null && !list27.isEmpty()) {
                        if (list27 instanceof zzqn) {
                            zzqn zzqnVar10 = (zzqn) list27;
                            zzpvVar.mo9174t(i114, 2);
                            int iM9185d7 = 0;
                            for (int i115 = 0; i115 < zzqnVar10.f21746u; i115++) {
                                iM9185d7 += zzpv.m9185d(zzqnVar10.m9228b(i115));
                            }
                            zzpvVar.mo9176v(iM9185d7);
                            for (int i116 = 0; i116 < zzqnVar10.f21746u; i116++) {
                                zzpvVar.mo9170p(zzqnVar10.m9228b(i116));
                            }
                        } else {
                            zzpvVar.mo9174t(i114, 2);
                            int iM9185d8 = 0;
                            for (int i117 = 0; i117 < list27.size(); i117++) {
                                iM9185d8 += zzpv.m9185d(((Integer) list27.get(i117)).intValue());
                            }
                            zzpvVar.mo9176v(iM9185d8);
                            for (int i118 = 0; i118 < list27.size(); i118++) {
                                zzpvVar.mo9170p(((Integer) list27.get(i118)).intValue());
                            }
                        }
                    }
                    break;
                case 45:
                    i4 = i7;
                    i5 = i9;
                    int i119 = iArr[i8];
                    List list28 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar28 = zzsc.f21802a;
                    if (list28 != null && !list28.isEmpty()) {
                        if (list28 instanceof zzqn) {
                            zzqn zzqnVar11 = (zzqn) list28;
                            zzpvVar.mo9174t(i119, 2);
                            int i120 = 0;
                            for (int i121 = 0; i121 < zzqnVar11.f21746u; i121++) {
                                zzqnVar11.m9228b(i121);
                                i120 += 4;
                            }
                            zzpvVar.mo9176v(i120);
                            for (int i122 = 0; i122 < zzqnVar11.f21746u; i122++) {
                                zzpvVar.mo9166l(zzqnVar11.m9228b(i122));
                            }
                        } else {
                            zzpvVar.mo9174t(i119, 2);
                            int i123 = 0;
                            for (int i124 = 0; i124 < list28.size(); i124++) {
                                ((Integer) list28.get(i124)).getClass();
                                i123 += 4;
                            }
                            zzpvVar.mo9176v(i123);
                            for (int i125 = 0; i125 < list28.size(); i125++) {
                                zzpvVar.mo9166l(((Integer) list28.get(i125)).intValue());
                            }
                        }
                    }
                    break;
                case 46:
                    i4 = i7;
                    i5 = i9;
                    int i126 = iArr[i8];
                    List list29 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar29 = zzsc.f21802a;
                    if (list29 != null && !list29.isEmpty()) {
                        if (list29 instanceof zzre) {
                            zzre zzreVar9 = (zzre) list29;
                            zzpvVar.mo9174t(i126, 2);
                            int i127 = 0;
                            for (int i128 = 0; i128 < zzreVar9.f21767u; i128++) {
                                zzreVar9.m9232b(i128);
                                i127 += 8;
                            }
                            zzpvVar.mo9176v(i127);
                            for (int i129 = 0; i129 < zzreVar9.f21767u; i129++) {
                                zzpvVar.mo9168n(zzreVar9.m9232b(i129));
                            }
                        } else {
                            zzpvVar.mo9174t(i126, 2);
                            int i130 = 0;
                            for (int i131 = 0; i131 < list29.size(); i131++) {
                                ((Long) list29.get(i131)).getClass();
                                i130 += 8;
                            }
                            zzpvVar.mo9176v(i130);
                            for (int i132 = 0; i132 < list29.size(); i132++) {
                                zzpvVar.mo9168n(((Long) list29.get(i132)).longValue());
                            }
                        }
                    }
                    break;
                case 47:
                    i4 = i7;
                    i5 = i9;
                    int i133 = iArr[i8];
                    List list30 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar30 = zzsc.f21802a;
                    if (list30 != null && !list30.isEmpty()) {
                        if (list30 instanceof zzqn) {
                            zzqn zzqnVar12 = (zzqn) list30;
                            zzpvVar.mo9174t(i133, 2);
                            int iM9184c3 = 0;
                            for (int i134 = 0; i134 < zzqnVar12.f21746u; i134++) {
                                int iM9228b2 = zzqnVar12.m9228b(i134);
                                iM9184c3 += zzpv.m9184c((iM9228b2 >> 31) ^ (iM9228b2 + iM9228b2));
                            }
                            zzpvVar.mo9176v(iM9184c3);
                            for (int i135 = 0; i135 < zzqnVar12.f21746u; i135++) {
                                int iM9228b3 = zzqnVar12.m9228b(i135);
                                zzpvVar.mo9176v((iM9228b3 >> 31) ^ (iM9228b3 + iM9228b3));
                            }
                        } else {
                            zzpvVar.mo9174t(i133, 2);
                            int iM9184c4 = 0;
                            for (int i136 = 0; i136 < list30.size(); i136++) {
                                int iIntValue2 = ((Integer) list30.get(i136)).intValue();
                                iM9184c4 += zzpv.m9184c((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                            }
                            zzpvVar.mo9176v(iM9184c4);
                            for (int i137 = 0; i137 < list30.size(); i137++) {
                                int iIntValue3 = ((Integer) list30.get(i137)).intValue();
                                zzpvVar.mo9176v((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                            }
                        }
                    }
                    break;
                case 48:
                    i4 = i7;
                    i5 = i9;
                    int i138 = iArr[i8];
                    List list31 = (List) unsafe.getObject(obj, j2);
                    zzsr zzsrVar31 = zzsc.f21802a;
                    if (list31 != null && !list31.isEmpty()) {
                        if (list31 instanceof zzre) {
                            zzre zzreVar10 = (zzre) list31;
                            zzpvVar.mo9174t(i138, 2);
                            int iM9185d9 = 0;
                            for (int i139 = 0; i139 < zzreVar10.f21767u; i139++) {
                                long jM9232b2 = zzreVar10.m9232b(i139);
                                iM9185d9 += zzpv.m9185d((jM9232b2 >> 63) ^ (jM9232b2 + jM9232b2));
                            }
                            zzpvVar.mo9176v(iM9185d9);
                            for (int i140 = 0; i140 < zzreVar10.f21767u; i140++) {
                                long jM9232b3 = zzreVar10.m9232b(i140);
                                zzpvVar.mo9178x((jM9232b3 >> 63) ^ (jM9232b3 + jM9232b3));
                            }
                        } else {
                            zzpvVar.mo9174t(i138, 2);
                            int iM9185d10 = 0;
                            for (int i141 = 0; i141 < list31.size(); i141++) {
                                long jLongValue2 = ((Long) list31.get(i141)).longValue();
                                iM9185d10 += zzpv.m9185d((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                            }
                            zzpvVar.mo9176v(iM9185d10);
                            for (int i142 = 0; i142 < list31.size(); i142++) {
                                long jLongValue3 = ((Long) list31.get(i142)).longValue();
                                zzpvVar.mo9178x((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                            }
                        }
                    }
                    break;
                case 49:
                    i4 = i7;
                    i5 = i9;
                    int i143 = iArr[i8];
                    List list32 = (List) unsafe.getObject(obj, j2);
                    zzsa zzsaVarM9251l2 = zzrtVar.m9251l(i8);
                    zzsr zzsrVar32 = zzsc.f21802a;
                    if (list32 != null && !list32.isEmpty()) {
                        for (int i144 = 0; i144 < list32.size(); i144++) {
                            zzpwVar.m9200n(i143, list32.get(i144), zzsaVarM9251l2);
                        }
                    }
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j2);
                    if (object2 != null) {
                        int i145 = i8 / 3;
                        zzri zzriVar = ((zzrj) zzrtVar.f21781b[i145 + i145]).f21773a;
                        zzsz zzszVar = zzriVar.f21772b;
                        zzsz zzszVar2 = zzriVar.f21771a;
                        for (Map.Entry entry2 : ((zzrk) object2).entrySet()) {
                            zzpvVar.mo9174t(i10, 2);
                            int i146 = i7;
                            int i147 = i9;
                            int i148 = i2;
                            zzpvVar.mo9176v(zzqf.m9209a(zzszVar2, i148, entry2.getKey()) + zzqf.m9209a(zzszVar, 2, entry2.getValue()));
                            Object key = entry2.getKey();
                            Object value = entry2.getValue();
                            zzqf.m9210d(zzpvVar, zzszVar2, i148, key);
                            zzqf.m9210d(zzpvVar, zzszVar, 2, value);
                            i7 = i146;
                            i9 = i147;
                        }
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 51:
                    if (zzrtVar.m9249f(i10, i8, obj)) {
                        zzpwVar.m9195i(i10, ((Double) zzsw.m9290h(j2, obj)).doubleValue());
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 52:
                    if (zzrtVar.m9249f(i10, i8, obj)) {
                        zzpwVar.m9199m(((Float) zzsw.m9290h(j2, obj)).floatValue(), i10);
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 53:
                    if (zzrtVar.m9249f(i10, i8, obj)) {
                        zzpwVar.m9202p(i10, m9242k(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 54:
                    if (zzrtVar.m9249f(i10, i8, obj)) {
                        zzpwVar.m9191e(i10, m9242k(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 55:
                    if (zzrtVar.m9249f(i10, i8, obj)) {
                        zzpwVar.m9201o(i10, m9240h(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 56:
                    if (zzrtVar.m9249f(i10, i8, obj)) {
                        zzpwVar.m9198l(i10, m9242k(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 57:
                    if (zzrtVar.m9249f(i10, i8, obj)) {
                        zzpwVar.m9197k(i10, m9240h(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 58:
                    if (zzrtVar.m9249f(i10, i8, obj)) {
                        zzpwVar.m9192f(i10, ((Boolean) zzsw.m9290h(j2, obj)).booleanValue());
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 59:
                    if (zzrtVar.m9249f(i10, i8, obj)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof String) {
                            zzpvVar.mo9172r(i10, (String) object3);
                        } else {
                            zzpwVar.m9193g(i10, (zzpm) object3);
                        }
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 60:
                    if (zzrtVar.m9249f(i10, i8, obj)) {
                        zzpwVar.m9203q(i10, unsafe.getObject(obj, j2), zzrtVar.m9251l(i8));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 61:
                    if (zzrtVar.m9249f(i10, i8, obj)) {
                        zzpwVar.m9193g(i10, (zzpm) unsafe.getObject(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 62:
                    if (zzrtVar.m9249f(i10, i8, obj)) {
                        zzpwVar.m9190d(i10, m9240h(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 63:
                    if (zzrtVar.m9249f(i10, i8, obj)) {
                        zzpwVar.m9196j(i10, m9240h(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 64:
                    if (zzrtVar.m9249f(i10, i8, obj)) {
                        zzpwVar.m9204r(i10, m9240h(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 65:
                    if (zzrtVar.m9249f(i10, i8, obj)) {
                        zzpwVar.m9205s(i10, m9242k(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 66:
                    if (zzrtVar.m9249f(i10, i8, obj)) {
                        zzpwVar.m9187a(i10, m9240h(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 67:
                    if (zzrtVar.m9249f(i10, i8, obj)) {
                        zzpwVar.m9188b(i10, m9242k(j2, obj));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                case 68:
                    if (zzrtVar.m9249f(i10, i8, obj)) {
                        zzpwVar.m9200n(i10, unsafe.getObject(obj, j2), zzrtVar.m9251l(i8));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
                default:
                    continue;
                    i8 += 3;
                    i6 = 1048575;
                    zzrtVar = this;
                    break;
            }
            i7 = i4;
            i9 = i5;
            i8 += 3;
            i6 = 1048575;
            zzrtVar = this;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m9249f(int i2, int i3, Object obj) {
        return zzsw.m9287e((long) (this.f21780a[i3 + 2] & 1048575), obj) == i2;
    }

    /* JADX INFO: renamed from: j */
    public final int m9250j(int i2) {
        return this.f21780a[i2 + 1];
    }

    /* JADX INFO: renamed from: l */
    public final zzsa m9251l(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        Object[] objArr = this.f21781b;
        zzsa zzsaVar = (zzsa) objArr[i4];
        if (zzsaVar != null) {
            return zzsaVar;
        }
        zzsa zzsaVarM9255a = zzrx.f21791c.m9255a((Class) objArr[i4 + 1]);
        objArr[i4] = zzsaVarM9255a;
        return zzsaVarM9255a;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m9252n(zzqm zzqmVar, zzqm zzqmVar2, int i2) {
        return m9253o(i2, zzqmVar) == m9253o(i2, zzqmVar2);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m9253o(int i2, Object obj) {
        int i3 = this.f21780a[i2 + 2];
        long j2 = i3 & 1048575;
        if (j2 == 1048575) {
            int iM9250j = m9250j(i2);
            long j3 = iM9250j & 1048575;
            switch (m9241i(iM9250j)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzsw.f21825c.mo9279a(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(zzsw.f21825c.mo9280b(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (zzsw.m9288f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (zzsw.m9288f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (zzsw.m9287e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (zzsw.m9288f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (zzsw.m9287e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return zzsw.f21825c.mo9282d(j3, obj);
                case 8:
                    Object objM9290h = zzsw.m9290h(j3, obj);
                    if (objM9290h instanceof String) {
                        if (((String) objM9290h).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objM9290h instanceof zzpm)) {
                            throw new IllegalArgumentException();
                        }
                        if (zzpm.f21713t.equals(objM9290h)) {
                            return false;
                        }
                    }
                case 9:
                    if (zzsw.m9290h(j3, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (zzpm.f21713t.equals(zzsw.m9290h(j3, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (zzsw.m9287e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (zzsw.m9287e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (zzsw.m9287e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (zzsw.m9288f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (zzsw.m9287e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (zzsw.m9288f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (zzsw.m9290h(j3, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i3 >>> 20)) & zzsw.m9287e(j2, obj)) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m9254p(Object obj, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return m9253o(i2, obj);
        }
        return (i4 & i5) != 0;
    }
}
