package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.constraintlayout.widget.C1137R;
import androidx.core.view.ViewCompat;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import androidx.work.WorkRequest;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzalo {

    /* JADX INFO: renamed from: a */
    public static final byte[] f5828a;

    static {
        String str = zzfm.f16091a;
        f5828a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: a */
    public static int m4191a(int i2) {
        return (i2 >> 24) & 255;
    }

    /* JADX WARN: Code duplicated, block: B:312:0x0651  */
    /* JADX WARN: Code duplicated, block: B:71:0x013d  */
    /* JADX WARN: Code duplicated, block: B:72:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0141  */
    /* JADX WARN: Code duplicated, block: B:74:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0145  */
    /* JADX WARN: Code duplicated, block: B:76:0x0148  */
    /* JADX WARN: Code duplicated, block: B:79:0x014d A[PHI: r6
  0x014d: PHI (r6v7 int) = (r6v8 int), (r6v4 int) binds: [B:84:0x0158, B:73:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0153  */
    /* JADX WARN: Code duplicated, block: B:83:0x0156  */
    /* JADX WARN: Code duplicated, block: B:85:0x015a  */
    /* JADX WARN: Code duplicated, block: B:86:0x015d A[DONT_INVERT, PHI: r6 r8 r15
  0x015d: PHI (r6v5 int) = (r6v4 int), (r6v6 int) binds: [B:70:0x013b, B:80:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x015d: PHI (r8v4 int) = (r8v3 int), (r8v5 int) binds: [B:70:0x013b, B:80:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x015d: PHI (r15v6 int) = (r15v5 int), (r15v8 int) binds: [B:70:0x013b, B:80:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x015f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static ArrayList m4192b(zzfz zzfzVar, zzagt zzagtVar, long j2, zzq zzqVar, boolean z, boolean z2, zzgti zzgtiVar) {
        int i2;
        long jM6521w;
        long jM6374P;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        long jM6521w2;
        long j3;
        String str;
        zzamq[] zzamqVarArr;
        int i5;
        ArrayList arrayList;
        zzfz zzfzVar2;
        zzhao zzhaoVar;
        zzhao zzhaoVar2;
        boolean z5;
        zzamp zzampVar;
        zzap zzapVar;
        zzfz zzfzVarM6801c;
        Pair pairM4198h;
        zzga zzgaVarM6800b;
        zzeu zzeuVar;
        zzq zzqVarM8828a;
        String str2;
        String str3;
        String str4;
        int i6;
        String str5;
        int i7;
        int i8;
        int i9;
        boolean z6;
        int i10;
        char c;
        String str6;
        boolean z7;
        zzgo zzgoVar;
        boolean z8;
        boolean z9;
        long j4;
        zzgwt zzgwtVarM7216n;
        String str7;
        boolean z10;
        boolean z11;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        int i11 = 0;
        while (true) {
            ArrayList arrayList4 = zzfzVar.f16831d;
            if (i11 >= arrayList4.size()) {
                return arrayList3;
            }
            zzfz zzfzVar3 = (zzfz) arrayList4.get(i11);
            if (zzfzVar3.f16892a != 1953653099) {
                arrayList2 = arrayList3;
                i5 = i11;
            } else {
                zzga zzgaVarM6800b2 = zzfzVar.m6800b(1836476516);
                zzgaVarM6800b2.getClass();
                zzfz zzfzVarM6801c2 = zzfzVar3.m6801c(1835297121);
                zzfzVarM6801c2.getClass();
                zzga zzgaVarM6800b3 = zzfzVarM6801c2.m6800b(1751411826);
                zzgaVarM6800b3.getClass();
                zzeu zzeuVar2 = zzgaVarM6800b3.f16879b;
                zzeuVar2.m6363E(16);
                int iM6376b = zzeuVar2.m6376b();
                if (iM6376b == 1936684398) {
                    i2 = 1;
                } else if (iM6376b == 1986618469) {
                    i2 = 2;
                } else if (iM6376b == 1952807028 || iM6376b == 1935832172 || iM6376b == 1937072756 || iM6376b == 1668047728 || iM6376b == 1937072752) {
                    i2 = 3;
                } else {
                    i2 = iM6376b == 1835365473 ? 5 : -1;
                }
                int i12 = 0;
                if (i2 == -1) {
                    arrayList = arrayList3;
                    i5 = i11;
                    zzfzVar2 = zzfzVar3;
                    zzampVar = null;
                } else {
                    zzga zzgaVarM6800b4 = zzfzVar3.m6800b(1953196132);
                    zzgaVarM6800b4.getClass();
                    zzeu zzeuVar3 = zzgaVarM6800b4.f16879b;
                    zzeuVar3.m6363E(8);
                    int iM4191a = m4191a(zzeuVar3.m6376b());
                    zzeuVar3.m6365G(iM4191a == 0 ? 8 : 16);
                    int iM6376b2 = zzeuVar3.m6376b();
                    zzeuVar3.m6365G(4);
                    int i13 = zzeuVar3.f14888b;
                    int i14 = 0;
                    while (true) {
                        int i15 = iM4191a == 0 ? 4 : 8;
                        jM6521w = -9223372036854775807L;
                        if (i14 >= i15) {
                            zzeuVar3.m6365G(i15);
                        } else {
                            if (zzeuVar3.f14887a[i13 + i14] != -1) {
                                jM6374P = iM4191a == 0 ? zzeuVar3.m6374P() : zzeuVar3.m6384j();
                                if (jM6374P != 0) {
                                    break;
                                }
                                break;
                            }
                            i14++;
                        }
                        jM6374P = -9223372036854775807L;
                        break;
                    }
                    zzeuVar3.m6365G(10);
                    int iM6370L = zzeuVar3.m6370L();
                    zzeuVar3.m6365G(4);
                    int iM6376b3 = zzeuVar3.m6376b();
                    int iM6376b4 = zzeuVar3.m6376b();
                    zzeuVar3.m6365G(4);
                    int iM6376b5 = zzeuVar3.m6376b();
                    int iM6376b6 = zzeuVar3.m6376b();
                    if (iM6376b3 == 0) {
                        if (iM6376b4 == 65536) {
                            if (iM6376b5 != -65536) {
                                if (iM6376b5 == 65536) {
                                    z10 = iM6376b6 != 0;
                                    z11 = true;
                                    iM6376b5 = 65536;
                                }
                                iM6376b4 = 65536;
                            } else {
                                z10 = iM6376b6 != 0;
                                z11 = true;
                            }
                            if (z11 != z10) {
                                i3 = 90;
                            } else {
                                iM6376b4 = 65536;
                            }
                            i4 = i3;
                        }
                        iM6376b3 = 0;
                        if (iM6376b3 == 0) {
                            if (iM6376b3 != -65536) {
                                i3 = 180;
                                i4 = i3;
                            } else {
                                i3 = 180;
                                i4 = i3;
                            }
                            i4 = 0;
                        } else {
                            if (iM6376b4 == -65536) {
                                if (iM6376b5 != 65536) {
                                    if (iM6376b5 == -65536) {
                                        if (iM6376b6 == 0) {
                                            z4 = false;
                                        } else {
                                            z4 = true;
                                        }
                                        z3 = z4;
                                        iM6376b5 = -65536;
                                    }
                                    iM6376b4 = -65536;
                                } else if (iM6376b6 == 0) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                if (true != z3) {
                                    i3 = 270;
                                } else {
                                    iM6376b4 = -65536;
                                }
                                i4 = i3;
                            }
                            iM6376b3 = 0;
                            if (iM6376b3 != -65536) {
                                i3 = 180;
                                i4 = i3;
                            } else {
                                i3 = 180;
                                i4 = i3;
                            }
                            i4 = 0;
                        }
                    } else if (iM6376b3 == 0) {
                        if (iM6376b4 == -65536) {
                            if (iM6376b5 != 65536) {
                                if (iM6376b5 == -65536) {
                                    if (iM6376b6 == 0) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    z3 = z4;
                                    iM6376b5 = -65536;
                                }
                                iM6376b4 = -65536;
                            } else if (iM6376b6 == 0) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (true != z3) {
                                i3 = 270;
                            } else {
                                iM6376b4 = -65536;
                            }
                            i4 = i3;
                        }
                        iM6376b3 = 0;
                        if (iM6376b3 != -65536) {
                            i3 = 180;
                            i4 = i3;
                        } else {
                            i3 = 180;
                            i4 = i3;
                        }
                        i4 = 0;
                    } else if ((iM6376b3 != -65536 || iM6376b3 == 65536) && iM6376b4 == 0 && iM6376b5 == 0 && iM6376b6 == -65536) {
                        i3 = 180;
                        i4 = i3;
                    } else {
                        i4 = 0;
                    }
                    zzeuVar3.m6365G(16);
                    short sM6372N = zzeuVar3.m6372N();
                    zzeuVar3.m6365G(2);
                    short sM6372N2 = zzeuVar3.m6372N();
                    long j5 = j2 == -9223372036854775807L ? jM6374P : j2;
                    long j6 = m4194d(zzgaVarM6800b2.f16879b).f17009c;
                    if (j5 == -9223372036854775807L) {
                        j3 = j6;
                        jM6521w2 = -9223372036854775807L;
                    } else {
                        jM6521w2 = zzfm.m6521w(j5, 1000000L, j6, RoundingMode.DOWN);
                        j3 = j6;
                    }
                    zzfz zzfzVarM6801c3 = zzfzVarM6801c2.m6801c(1835626086);
                    zzfzVarM6801c3.getClass();
                    zzfz zzfzVarM6801c4 = zzfzVarM6801c3.m6801c(1937007212);
                    zzfzVarM6801c4.getClass();
                    zzga zzgaVarM6800b5 = zzfzVarM6801c2.m6800b(1835296868);
                    zzgaVarM6800b5.getClass();
                    zzeu zzeuVar4 = zzgaVarM6800b5.f16879b;
                    zzeuVar4.m6363E(8);
                    int iM4191a2 = m4191a(zzeuVar4.m6376b());
                    zzeuVar4.m6365G(iM4191a2 == 0 ? 8 : 16);
                    long jM6374P2 = zzeuVar4.m6374P();
                    int i16 = zzeuVar4.f14888b;
                    int i17 = 0;
                    while (true) {
                        int i18 = iM4191a2 == 0 ? 4 : 8;
                        if (i17 >= i18) {
                            zzeuVar4.m6365G(i18);
                            break;
                        }
                        int i19 = i17;
                        if (zzeuVar4.f14887a[i16 + i17] != -1) {
                            long jM6374P3 = iM4191a2 == 0 ? zzeuVar4.m6374P() : zzeuVar4.m6384j();
                            if (jM6374P3 == 0) {
                                break;
                            }
                            jM6521w = zzfm.m6521w(jM6374P3, 1000000L, jM6374P2, RoundingMode.DOWN);
                            break;
                        }
                        i17 = i19 + 1;
                        i16 = i16;
                    }
                    int iM6370L2 = zzeuVar4.m6370L();
                    int i20 = 3;
                    char c2 = 2;
                    char[] cArr = {(char) (((iM6370L2 >> 10) & 31) + 96), (char) (((iM6370L2 >> 5) & 31) + 96), (char) ((iM6370L2 & 31) + 96)};
                    int i21 = 0;
                    while (true) {
                        if (i21 >= i20) {
                            str = new String(cArr);
                            break;
                        }
                        char c3 = cArr[i21];
                        if (c3 < 'a' || c3 > 'z') {
                            str = null;
                            break;
                        }
                        i21++;
                        i20 = 3;
                    }
                    zzalh zzalhVar = new zzalh(str, jM6374P2, jM6521w);
                    String str8 = str;
                    zzga zzgaVarM6800b6 = zzfzVarM6801c4.m6800b(1937011556);
                    String str9 = "BoxParsers";
                    if (zzgaVarM6800b6 == null) {
                        zzeh.m6211c("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                        arrayList = arrayList3;
                        i5 = i11;
                        zzfzVar2 = zzfzVar3;
                        zzampVar = null;
                    } else {
                        zzeu zzeuVar5 = zzgaVarM6800b6.f16879b;
                        zzeuVar5.m6363E(12);
                        int iM6376b7 = zzeuVar5.m6376b();
                        long j7 = jM6521w2;
                        zzalk zzalkVar = new zzalk(iM6376b7);
                        int i22 = 0;
                        while (true) {
                            String str10 = "text/x-unknown";
                            String str11 = str9;
                            zzamqVarArr = zzalkVar.f5815a;
                            if (i22 >= iM6376b7) {
                                break;
                            }
                            int i23 = i2;
                            int i24 = zzeuVar5.f14888b;
                            int iM6376b8 = zzeuVar5.m6376b();
                            int i25 = i24;
                            String str12 = "childAtomSize must be positive";
                            zzage.m4111a("childAtomSize must be positive", iM6376b8 > 0 ? 1 : i12);
                            int iM6376b9 = zzeuVar5.m6376b();
                            int i26 = iM6370L;
                            if (iM6376b9 == 1635148593 || iM6376b9 == 1635148595 || iM6376b9 == 1701733238 || iM6376b9 == 1831958048 || iM6376b9 == 1836070006 || iM6376b9 == 1752589105 || iM6376b9 == 1751479857 || iM6376b9 == 1987470129 || iM6376b9 == 1987471665 || iM6376b9 == 1932670515 || iM6376b9 == 1211250227 || iM6376b9 == 1748121139 || iM6376b9 == 1987063864 || iM6376b9 == 1987063865 || iM6376b9 == 1635135537 || iM6376b9 == 1685479798 || iM6376b9 == 1685479729 || iM6376b9 == 1685481573 || iM6376b9 == 1685481521 || iM6376b9 == 1634760241 || iM6376b9 == 1684108849) {
                                sM6372N = sM6372N;
                                int i27 = iM6376b2;
                                iM6376b7 = iM6376b7;
                                sM6372N2 = sM6372N2;
                                i11 = i11;
                                long j8 = j7;
                                String str13 = str11;
                                zzalhVar = zzalhVar;
                                i23 = i23;
                                int i28 = iM6376b8;
                                i26 = i26;
                                zzeuVar = zzeuVar5;
                                String str14 = str8;
                                i22 = i22;
                                zzeuVar.m6363E(i25 + 16);
                                zzeuVar.m6365G(16);
                                int iM6370L3 = zzeuVar.m6370L();
                                int iM6370L4 = zzeuVar.m6370L();
                                arrayList3 = arrayList3;
                                zzeuVar.m6365G(50);
                                int i29 = zzeuVar.f14888b;
                                j7 = j8;
                                int iIntValue = 1701733238;
                                if (iM6376b9 == 1701733238) {
                                    Pair pairM4201k = m4201k(zzeuVar, i25, i28);
                                    if (pairM4201k != null) {
                                        iIntValue = ((Integer) pairM4201k.first).intValue();
                                        zzqVarM8828a = zzqVar == null ? null : zzqVar.m8828a(((zzamq) pairM4201k.second).f6011b);
                                        zzamqVarArr[i22] = (zzamq) pairM4201k.second;
                                    } else {
                                        zzqVarM8828a = zzqVar;
                                    }
                                    zzeuVar.m6363E(i29);
                                } else {
                                    iIntValue = iM6376b9;
                                    zzqVarM8828a = zzqVar;
                                }
                                i25 = i25;
                                if (iIntValue == 1831958048) {
                                    str2 = "video/mpeg";
                                } else if (iIntValue == 1211250227) {
                                    iIntValue = 1211250227;
                                    str2 = "video/3gpp";
                                } else {
                                    str2 = null;
                                }
                                zzq zzqVar2 = zzqVarM8828a;
                                zzfzVar3 = zzfzVar3;
                                int i30 = i4;
                                float fM6382h = 1.0f;
                                int iM8029c = -1;
                                zzgo zzgoVar2 = null;
                                int i31 = 8;
                                List listM7216n = null;
                                int i32 = -1;
                                int i33 = -1;
                                int i34 = -1;
                                int i35 = -1;
                                int i36 = -1;
                                boolean z12 = false;
                                int i37 = -1;
                                ByteBuffer byteBufferOrder = null;
                                String string = null;
                                byte[] bArrCopyOfRange = null;
                                zzald zzaldVar = null;
                                zzalf zzalfVar = null;
                                zzfw zzfwVarM6736a = null;
                                int i38 = i29;
                                int i39 = 8;
                                String str15 = str2;
                                int i40 = -1;
                                while (i38 - i25 < i28) {
                                    zzeuVar.m6363E(i38);
                                    int i41 = zzeuVar.f14888b;
                                    int iM6376b10 = zzeuVar.m6376b();
                                    int i42 = i38;
                                    if (iM6376b10 != 0) {
                                        i6 = iM6376b10;
                                    } else {
                                        if (zzeuVar.f14888b - i25 == i28) {
                                            break;
                                        }
                                        i6 = 0;
                                    }
                                    zzage.m4111a(str12, i6 > 0);
                                    int iM6376b11 = zzeuVar.m6376b();
                                    if (iM6376b11 == 1635148611) {
                                        int i43 = i41 + 8;
                                        zzage.m4111a(null, str15 == null);
                                        zzeuVar.m6363E(i43);
                                        zzaff zzaffVarM4063a = zzaff.m4063a(zzeuVar);
                                        listM7216n = zzaffVarM4063a.f5163a;
                                        zzalkVar.f5817c = zzaffVarM4063a.f5164b;
                                        if (z12) {
                                            z9 = true;
                                        } else {
                                            fM6382h = zzaffVarM4063a.f5173k;
                                            z9 = false;
                                        }
                                        String str16 = zzaffVarM4063a.f5174l;
                                        int i44 = zzaffVarM4063a.f5172j;
                                        int i45 = zzaffVarM4063a.f5169g;
                                        int i46 = zzaffVarM4063a.f5170h;
                                        int i47 = zzaffVarM4063a.f5171i;
                                        int i48 = zzaffVarM4063a.f5167e;
                                        i8 = zzaffVarM4063a.f5168f;
                                        z12 = z9;
                                        string = str16;
                                        zzgoVar2 = zzgoVar2;
                                        i40 = i45;
                                        iM8029c = i47;
                                        i7 = i48;
                                        str5 = "video/avc";
                                        i35 = i44;
                                        i33 = i46;
                                    } else {
                                        if (iM6376b11 == 1752589123) {
                                            int i49 = i41 + 8;
                                            zzage.m4111a(null, str15 == null);
                                            zzeuVar.m6363E(i49);
                                            zzagu zzaguVarM4125a = zzagu.m4125a(zzeuVar, false, null);
                                            listM7216n = zzaguVarM4125a.f5270a;
                                            zzalkVar.f5817c = zzaguVarM4125a.f5271b;
                                            if (z12) {
                                                z8 = true;
                                            } else {
                                                fM6382h = zzaguVarM4125a.f5281l;
                                                z8 = false;
                                            }
                                            int i50 = zzaguVarM4125a.f5282m;
                                            int i51 = zzaguVarM4125a.f5272c;
                                            String str17 = zzaguVarM4125a.f5283n;
                                            int i52 = zzaguVarM4125a.f5280k;
                                            if (i52 == -1) {
                                                i52 = i32;
                                            }
                                            int i53 = zzaguVarM4125a.f5273d;
                                            int i54 = zzaguVarM4125a.f5274e;
                                            int i55 = zzaguVarM4125a.f5277h;
                                            int i56 = zzaguVarM4125a.f5278i;
                                            boolean z13 = z8;
                                            int i57 = zzaguVarM4125a.f5279j;
                                            int i58 = zzaguVarM4125a.f5275f;
                                            int i59 = zzaguVarM4125a.f5276g;
                                            zzgoVar2 = zzaguVarM4125a.f5284o;
                                            i8 = i59;
                                            string = str17;
                                            i37 = i53;
                                            iM8029c = i57;
                                            i7 = i58;
                                            str5 = "video/hevc";
                                            i35 = i50;
                                            i36 = i54;
                                            i40 = i55;
                                            z12 = z13;
                                            i34 = i51;
                                            i32 = i52;
                                            i33 = i56;
                                        } else if (iM6376b11 == 1818785347) {
                                            int i60 = i41 + 8;
                                            zzage.m4111a("lhvC must follow hvcC atom", "video/hevc".equals(str15));
                                            if (zzgoVar2 == null) {
                                                z7 = false;
                                                zzgoVar = null;
                                            } else if (zzgoVar2.f17902a.size() >= 2) {
                                                zzgoVar = zzgoVar2;
                                                z7 = true;
                                            } else {
                                                zzgoVar = zzgoVar2;
                                                z7 = false;
                                            }
                                            zzage.m4111a("must have at least two layers", z7);
                                            zzeuVar.m6363E(i60);
                                            zzgoVar.getClass();
                                            zzagu zzaguVarM4125a2 = zzagu.m4125a(zzeuVar, true, zzgoVar);
                                            zzage.m4111a("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", zzalkVar.f5817c == zzaguVarM4125a2.f5271b);
                                            int i61 = zzaguVarM4125a2.f5277h;
                                            if (i61 != -1) {
                                                zzage.m4111a("colorSpace must be the same for both views", i40 == i61);
                                            }
                                            int i62 = zzaguVarM4125a2.f5278i;
                                            if (i62 != -1) {
                                                zzage.m4111a("colorRange must be the same for both views", i33 == i62);
                                            }
                                            int i63 = zzaguVarM4125a2.f5279j;
                                            if (i63 != -1) {
                                                zzage.m4111a("colorTransfer must be the same for both views", iM8029c == i63);
                                            }
                                            zzage.m4111a("bitdepthLuma must be the same for both views", i39 == zzaguVarM4125a2.f5275f);
                                            zzage.m4111a("bitdepthChroma must be the same for both views", i31 == zzaguVarM4125a2.f5276g);
                                            if (listM7216n != null) {
                                                zzgzi zzgziVar = zzgwt.f18303t;
                                                zzgwq zzgwqVar = new zzgwq();
                                                zzgwqVar.m7204d(listM7216n);
                                                zzgwqVar.m7204d(zzaguVarM4125a2.f5270a);
                                                listM7216n = zzgwqVar.m7214f();
                                            } else {
                                                zzage.m4111a("initializationData must be already set from hvcC atom", false);
                                            }
                                            string = zzaguVarM4125a2.f5283n;
                                            str12 = str12;
                                            str5 = "video/mv-hevc";
                                            zzgoVar2 = zzgoVar;
                                            i7 = i39;
                                            i8 = i31;
                                            zzalkVar = zzalkVar;
                                            iIntValue = iIntValue;
                                        } else if (iM6376b11 == 1987470147) {
                                            int i64 = i41 + 8;
                                            zzage.m4111a(null, str15 == null);
                                            zzeuVar.m6363E(i64);
                                            zzahp zzahpVarM4133a = zzahp.m4133a(zzeuVar);
                                            listM7216n = zzahpVarM4133a.f5339a;
                                            zzalkVar.f5817c = zzahpVarM4133a.f5340b;
                                            String str18 = zzahpVarM4133a.f5341c;
                                            i8 = zzahpVarM4133a.f5342d;
                                            i7 = i8;
                                            str12 = str12;
                                            zzgoVar2 = zzgoVar2;
                                            string = str18;
                                            str5 = "video/vvc";
                                            zzalkVar = zzalkVar;
                                            iIntValue = iIntValue;
                                            str13 = str13;
                                            i35 = 16;
                                        } else {
                                            if (iM6376b11 == 1986361461) {
                                                zzeuVar.m6363E(i41 + 8);
                                                int i65 = zzeuVar.f14888b;
                                                str5 = str15;
                                                zzalg zzalgVar = null;
                                                while (i65 - i41 < i6) {
                                                    zzeuVar.m6363E(i65);
                                                    int iM6376b12 = zzeuVar.m6376b();
                                                    zzage.m4111a(str12, iM6376b12 > 0);
                                                    zzalk zzalkVar2 = zzalkVar;
                                                    if (zzeuVar.m6376b() == 1702454643) {
                                                        zzeuVar.m6363E(i65 + 8);
                                                        int i66 = zzeuVar.f14888b;
                                                        while (true) {
                                                            if (i66 - i65 >= iM6376b12) {
                                                                str6 = str12;
                                                                zzalgVar = null;
                                                                break;
                                                            }
                                                            zzeuVar.m6363E(i66);
                                                            int iM6376b13 = zzeuVar.m6376b();
                                                            zzage.m4111a(str12, iM6376b13 > 0);
                                                            int i67 = i66;
                                                            if (zzeuVar.m6376b() == 1937011305) {
                                                                zzeuVar.m6365G(4);
                                                                int iM6369K = zzeuVar.m6369K();
                                                                str6 = str12;
                                                                zzalgVar = new zzalg(new zzalj(1 == (iM6369K & 1), (iM6369K & 2) == 2, (iM6369K & 8) == 8));
                                                                break;
                                                            }
                                                            i66 = i67 + iM6376b13;
                                                            str12 = str12;
                                                        }
                                                    } else {
                                                        str6 = str12;
                                                    }
                                                    i65 += iM6376b12;
                                                    zzalkVar = zzalkVar2;
                                                    str12 = str6;
                                                }
                                                str12 = str12;
                                                zzalkVar = zzalkVar;
                                                zzaln zzalnVar = zzalgVar == null ? null : new zzaln(zzalgVar);
                                                if (zzalnVar != null) {
                                                    zzalj zzaljVar = zzalnVar.f5827a.f5809a;
                                                    if (zzgoVar2 == null) {
                                                        zzgoVar2 = null;
                                                    } else if (zzgoVar2.f17902a.size() >= 2) {
                                                        zzage.m4111a("both eye views must be marked as available", zzaljVar.f5812a && zzaljVar.f5813b);
                                                        zzage.m4111a("for MV-HEVC, eye_views_reversed must be set to false", !zzaljVar.f5814c);
                                                    }
                                                    if (i32 == -1) {
                                                        zzgoVar2 = zzgoVar2;
                                                        i7 = i39;
                                                        i8 = i31;
                                                        iIntValue = iIntValue;
                                                        if (true != zzaljVar.f5814c) {
                                                            i32 = 4;
                                                        } else {
                                                            i32 = 5;
                                                        }
                                                    } else {
                                                        zzgoVar2 = zzgoVar2;
                                                        i7 = i39;
                                                        i8 = i31;
                                                        iIntValue = iIntValue;
                                                        str13 = str13;
                                                    }
                                                }
                                                zzgoVar2 = zzgoVar2;
                                                i7 = i39;
                                                i8 = i31;
                                                iIntValue = iIntValue;
                                                i9 = i33;
                                                str13 = str13;
                                            } else {
                                                str12 = str12;
                                                zzalkVar = zzalkVar;
                                                str5 = str15;
                                                if (iM6376b11 == 1685480259 || iM6376b11 == 1685485123 || iM6376b11 == 1685485379) {
                                                    zzgoVar2 = zzgoVar2;
                                                    i7 = i39;
                                                    i8 = i31;
                                                    iIntValue = iIntValue;
                                                    i9 = i33;
                                                    str13 = str13;
                                                    zzfwVarM6736a = zzfw.m6736a(zzeuVar);
                                                } else {
                                                    if (iM6376b11 == 1987076931) {
                                                        int i68 = i41 + 12;
                                                        zzage.m4111a(null, str5 == null);
                                                        zzeuVar.m6363E(i68);
                                                        byte bM6369K = (byte) zzeuVar.m6369K();
                                                        byte bM6369K2 = (byte) zzeuVar.m6369K();
                                                        int iM6369K2 = zzeuVar.m6369K();
                                                        int i69 = iM6369K2 >> 4;
                                                        int i70 = iM6369K2 >> 1;
                                                        String str19 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                        if (str19.equals("video/x-vnd.on2.vp9")) {
                                                            byte[] bArr = zzdr.f12695a;
                                                            i10 = 1;
                                                            c = 3;
                                                            listM7216n = zzgwt.m7216n(new byte[]{1, 1, bM6369K, 2, 1, bM6369K2, 3, 1, (byte) i69, 4, 1, (byte) (i70 & 7)});
                                                        } else {
                                                            i10 = 1;
                                                            c = 3;
                                                        }
                                                        int i71 = iM6369K2 & 1;
                                                        int iM6369K3 = zzeuVar.m6369K();
                                                        int iM6369K4 = zzeuVar.m6369K();
                                                        int iM8028b = zzi.m8028b(iM6369K3);
                                                        i33 = i10 != i71 ? 2 : 1;
                                                        iM8029c = zzi.m8029c(iM6369K4);
                                                        zzgoVar2 = zzgoVar2;
                                                        i8 = i69;
                                                        i7 = i8;
                                                        str5 = str19;
                                                        i40 = iM8028b;
                                                    } else {
                                                        if (iM6376b11 == 1635135811) {
                                                            int i72 = i6 - 8;
                                                            byte[] bArr2 = new byte[i72];
                                                            zzeuVar.m6366H(bArr2, 0, i72);
                                                            listM7216n = zzgwt.m7216n(bArr2);
                                                            zzafe zzafeVarM4062a = zzafe.m4062a(bArr2);
                                                            if (zzafeVarM4062a != null) {
                                                                String str20 = zzafeVarM4062a.f5162e;
                                                                int i73 = zzafeVarM4062a.f5161d;
                                                                i33 = zzafeVarM4062a.f5160c;
                                                                int i74 = zzafeVarM4062a.f5159b;
                                                                string = str20;
                                                                iM8029c = i73;
                                                                i31 = zzafeVarM4062a.f5158a;
                                                                i40 = i74;
                                                                i39 = i31;
                                                            }
                                                            str5 = "video/av01";
                                                        } else if (iM6376b11 == 1668050025) {
                                                            if (byteBufferOrder == null) {
                                                                byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                            }
                                                            ByteBuffer byteBuffer = byteBufferOrder;
                                                            byteBuffer.position(21);
                                                            byteBuffer.putShort(zzeuVar.m6372N());
                                                            byteBuffer.putShort(zzeuVar.m6372N());
                                                            byteBufferOrder = byteBuffer;
                                                        } else {
                                                            if (iM6376b11 == 1835295606) {
                                                                if (byteBufferOrder == null) {
                                                                    byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                                }
                                                                ByteBuffer byteBuffer2 = byteBufferOrder;
                                                                short sM6372N3 = zzeuVar.m6372N();
                                                                short sM6372N4 = zzeuVar.m6372N();
                                                                short sM6372N5 = zzeuVar.m6372N();
                                                                short sM6372N6 = zzeuVar.m6372N();
                                                                zzgoVar2 = zzgoVar2;
                                                                short sM6372N7 = zzeuVar.m6372N();
                                                                iIntValue = iIntValue;
                                                                short sM6372N8 = zzeuVar.m6372N();
                                                                i8 = i31;
                                                                short sM6372N9 = zzeuVar.m6372N();
                                                                i7 = i39;
                                                                short sM6372N10 = zzeuVar.m6372N();
                                                                long jM6374P4 = zzeuVar.m6374P();
                                                                long jM6374P5 = zzeuVar.m6374P();
                                                                i9 = i33;
                                                                byteBuffer2.position(1);
                                                                byteBuffer2.putShort(sM6372N7);
                                                                byteBuffer2.putShort(sM6372N8);
                                                                byteBuffer2.putShort(sM6372N3);
                                                                byteBuffer2.putShort(sM6372N4);
                                                                byteBuffer2.putShort(sM6372N5);
                                                                byteBuffer2.putShort(sM6372N6);
                                                                byteBuffer2.putShort(sM6372N9);
                                                                byteBuffer2.putShort(sM6372N10);
                                                                byteBuffer2.putShort((short) (jM6374P4 / WorkRequest.MIN_BACKOFF_MILLIS));
                                                                byteBuffer2.putShort((short) (jM6374P5 / WorkRequest.MIN_BACKOFF_MILLIS));
                                                                byteBufferOrder = byteBuffer2;
                                                            } else {
                                                                zzgoVar2 = zzgoVar2;
                                                                i7 = i39;
                                                                i8 = i31;
                                                                iIntValue = iIntValue;
                                                                i9 = i33;
                                                                if (iM6376b11 == 1681012275) {
                                                                    zzage.m4111a(null, str5 == null);
                                                                    str5 = "video/3gpp";
                                                                } else if (iM6376b11 == 1702061171) {
                                                                    zzage.m4111a(null, str5 == null);
                                                                    zzalf zzalfVarM4200j = m4200j(i41, zzeuVar);
                                                                    String str21 = zzalfVarM4200j.f5805a;
                                                                    byte[] bArr3 = zzalfVarM4200j.f5806b;
                                                                    if (bArr3 != null) {
                                                                        listM7216n = zzgwt.m7216n(bArr3);
                                                                    }
                                                                    zzalfVar = zzalfVarM4200j;
                                                                    str5 = str21;
                                                                } else if (iM6376b11 == 1651798644) {
                                                                    zzeuVar.m6363E(i41 + 8);
                                                                    zzeuVar.m6365G(4);
                                                                    zzaldVar = new zzald(zzeuVar.m6374P(), zzeuVar.m6374P());
                                                                } else if (iM6376b11 == 1885434736) {
                                                                    zzeuVar.m6363E(i41 + 8);
                                                                    fM6382h = zzeuVar.m6382h() / zzeuVar.m6382h();
                                                                    str13 = str13;
                                                                    i33 = i9;
                                                                    z12 = true;
                                                                } else if (iM6376b11 == 1937126244) {
                                                                    int i75 = i41 + 8;
                                                                    while (true) {
                                                                        if (i75 - i41 >= i6) {
                                                                            bArrCopyOfRange = null;
                                                                            break;
                                                                        }
                                                                        zzeuVar.m6363E(i75);
                                                                        int iM6376b14 = zzeuVar.m6376b() + i75;
                                                                        if (zzeuVar.m6376b() == 1886547818) {
                                                                            bArrCopyOfRange = Arrays.copyOfRange(zzeuVar.f14887a, i75, iM6376b14);
                                                                            break;
                                                                        }
                                                                        i75 = iM6376b14;
                                                                    }
                                                                } else if (iM6376b11 == 1936995172) {
                                                                    int iM6369K5 = zzeuVar.m6369K();
                                                                    zzeuVar.m6365G(3);
                                                                    if (iM6369K5 == 0) {
                                                                        int iM6369K6 = zzeuVar.m6369K();
                                                                        if (iM6369K6 == 0) {
                                                                            str13 = str13;
                                                                            i33 = i9;
                                                                            i32 = 0;
                                                                        } else if (iM6369K6 == 1) {
                                                                            str13 = str13;
                                                                            i33 = i9;
                                                                            i32 = 1;
                                                                        } else if (iM6369K6 == 2) {
                                                                            str13 = str13;
                                                                            i33 = i9;
                                                                            i32 = 2;
                                                                        } else if (iM6369K6 == 3) {
                                                                            i32 = 3;
                                                                            i33 = i9;
                                                                        }
                                                                    }
                                                                } else if (iM6376b11 == 1634760259) {
                                                                    int i76 = i6 - 12;
                                                                    byte[] bArr4 = new byte[i76];
                                                                    zzeuVar.m6363E(i41 + 12);
                                                                    zzeuVar.m6366H(bArr4, 0, i76);
                                                                    byte[] bArr5 = zzdr.f12695a;
                                                                    zzgtr.m7130c(i76, "Invalid APV CSD length: %s", i76 >= 17);
                                                                    byte b = bArr4[0];
                                                                    zzgtr.m7130c(b, "Invalid APV CSD version: %s", b == 1);
                                                                    int i77 = bArr4[5] & 255;
                                                                    int i78 = bArr4[6] & 255;
                                                                    int i79 = bArr4[7] & 255;
                                                                    String str22 = zzfm.f16091a;
                                                                    Locale locale = Locale.US;
                                                                    StringBuilder sbM409q = AbstractC0271e0.m409q("apv1.apvf", i77, ".apvl", i78, ".apvb");
                                                                    sbM409q.append(i79);
                                                                    string = sbM409q.toString();
                                                                    listM7216n = zzgwt.m7216n(bArr4);
                                                                    zzeu zzeuVar6 = new zzeu(bArr4);
                                                                    zzh zzhVar = new zzh();
                                                                    byte[] bArr6 = zzeuVar6.f14887a;
                                                                    zzet zzetVar = new zzet(bArr6, bArr6.length);
                                                                    zzetVar.m6341d(zzeuVar6.f14888b * 8);
                                                                    int i80 = 1;
                                                                    zzetVar.m6349l(1);
                                                                    int i81 = 8;
                                                                    int iM6345h = zzetVar.m6345h(8);
                                                                    int i82 = 0;
                                                                    while (i82 < iM6345h) {
                                                                        zzetVar.m6349l(i80);
                                                                        int iM6345h2 = zzetVar.m6345h(i81);
                                                                        int i83 = 0;
                                                                        while (i83 < iM6345h2) {
                                                                            zzetVar.m6343f(6);
                                                                            boolean zM6344g = zzetVar.m6344g();
                                                                            zzetVar.m6342e();
                                                                            zzetVar.m6349l(11);
                                                                            zzetVar.m6343f(4);
                                                                            int iM6345h3 = zzetVar.m6345h(4) + 8;
                                                                            zzhVar.f18418e = iM6345h3;
                                                                            zzhVar.f18419f = iM6345h3;
                                                                            zzetVar.m6349l(1);
                                                                            if (zM6344g) {
                                                                                int iM6345h4 = zzetVar.m6345h(i81);
                                                                                int iM6345h5 = zzetVar.m6345h(i81);
                                                                                zzetVar.m6349l(1);
                                                                                boolean zM6344g2 = zzetVar.m6344g();
                                                                                zzhVar.f18414a = zzi.m8028b(iM6345h4);
                                                                                zzhVar.f18415b = true != zM6344g2 ? 2 : 1;
                                                                                zzhVar.f18416c = zzi.m8029c(iM6345h5);
                                                                            }
                                                                            i83++;
                                                                            i81 = 8;
                                                                        }
                                                                        i82++;
                                                                        i81 = 8;
                                                                        i80 = 1;
                                                                    }
                                                                    zzi zziVarM7286a = zzhVar.m7286a();
                                                                    int i84 = zziVarM7286a.f19551e;
                                                                    int i85 = zziVarM7286a.f19552f;
                                                                    i40 = zziVarM7286a.f19547a;
                                                                    i7 = i84;
                                                                    i8 = i85;
                                                                    i33 = zziVarM7286a.f19548b;
                                                                    str5 = "video/apv";
                                                                    str13 = str13;
                                                                    iM8029c = zziVarM7286a.f19549c;
                                                                } else if (iM6376b11 == 1668246642) {
                                                                    if (i40 != -1) {
                                                                        str13 = str13;
                                                                    } else if (iM8029c == -1) {
                                                                        int iM6376b15 = zzeuVar.m6376b();
                                                                        if (iM6376b15 == 1852009592 || iM6376b15 == 1852009571) {
                                                                            str13 = str13;
                                                                            int iM6370L5 = zzeuVar.m6370L();
                                                                            int iM6370L6 = zzeuVar.m6370L();
                                                                            zzeuVar.m6365G(2);
                                                                            if (i6 != 19) {
                                                                                z6 = false;
                                                                            } else if ((zzeuVar.m6369K() & 128) != 0) {
                                                                                i6 = 19;
                                                                                z6 = true;
                                                                            } else {
                                                                                i6 = 19;
                                                                                z6 = false;
                                                                            }
                                                                            int iM8028b2 = zzi.m8028b(iM6370L5);
                                                                            int i86 = true != z6 ? 2 : 1;
                                                                            iM8029c = zzi.m8029c(iM6370L6);
                                                                            i33 = i86;
                                                                            i40 = iM8028b2;
                                                                        } else {
                                                                            str13 = str13;
                                                                            zzeh.m6211c(str13, "Unsupported color type: ".concat(zzgb.m6835a(iM6376b15)));
                                                                            iM8029c = -1;
                                                                            i40 = -1;
                                                                            i33 = i9;
                                                                        }
                                                                    } else {
                                                                        str13 = str13;
                                                                        i40 = -1;
                                                                    }
                                                                }
                                                            }
                                                            i33 = i9;
                                                        }
                                                        i7 = i39;
                                                        i8 = i31;
                                                    }
                                                    str13 = str13;
                                                }
                                            }
                                            i33 = i9;
                                        }
                                        i38 = i42 + i6;
                                        str13 = str13;
                                        i28 = i28;
                                        str15 = str5;
                                        zzgoVar2 = zzgoVar2;
                                        zzalkVar = zzalkVar;
                                        iIntValue = iIntValue;
                                        str12 = str12;
                                        i31 = i8;
                                        i39 = i7;
                                    }
                                    i38 = i42 + i6;
                                    str13 = str13;
                                    i28 = i28;
                                    str15 = str5;
                                    zzgoVar2 = zzgoVar2;
                                    zzalkVar = zzalkVar;
                                    iIntValue = iIntValue;
                                    str12 = str12;
                                    i31 = i8;
                                    i39 = i7;
                                }
                                iM6376b8 = i28;
                                int i87 = i39;
                                int i88 = i31;
                                zzalk zzalkVar3 = zzalkVar;
                                String str23 = str15;
                                int i89 = i33;
                                str11 = str13;
                                c2 = 2;
                                if (zzfwVarM6736a != null) {
                                    str3 = zzfwVarM6736a.f16688a;
                                    str4 = "video/dolby-vision";
                                } else {
                                    str3 = string;
                                    str4 = str23;
                                }
                                if (str4 == null) {
                                    str8 = str14;
                                    i4 = i30;
                                    iM6376b2 = i27;
                                    zzalkVar = zzalkVar3;
                                } else {
                                    zzt zztVar = new zzt();
                                    iM6376b2 = i27;
                                    zztVar.m8851c(iM6376b2);
                                    zztVar.m8853e(str4);
                                    zztVar.f20798j = str3;
                                    zztVar.f20809u = iM6370L3;
                                    zztVar.f20810v = iM6370L4;
                                    zztVar.f20811w = i37;
                                    zztVar.f20812x = i36;
                                    zztVar.f20775A = fM6382h;
                                    i4 = i30;
                                    zztVar.f20814z = i4;
                                    zztVar.f20776B = bArrCopyOfRange;
                                    zztVar.f20777C = i32;
                                    zztVar.f20805q = listM7216n;
                                    zztVar.f20804p = i35;
                                    zztVar.f20779E = i34;
                                    zztVar.f20806r = zzqVar2;
                                    str8 = str14;
                                    zztVar.f20792d = str8;
                                    zzh zzhVar2 = new zzh();
                                    zzhVar2.f18414a = i40;
                                    zzhVar2.f18415b = i89;
                                    zzhVar2.f18416c = iM8029c;
                                    zzhVar2.f18417d = byteBufferOrder != null ? byteBufferOrder.array() : null;
                                    zzhVar2.f18418e = i87;
                                    zzhVar2.f18419f = i88;
                                    zztVar.f20778D = zzhVar2.m7286a();
                                    zzald zzaldVar2 = zzaldVar;
                                    if (zzaldVar2 != null) {
                                        zztVar.f20796h = zzhaq.m7305b(zzaldVar2.f5794a);
                                        zztVar.f20797i = zzhaq.m7305b(zzaldVar2.f5795b);
                                    } else {
                                        zzalf zzalfVar2 = zzalfVar;
                                        if (zzalfVar2 != null) {
                                            zztVar.f20796h = zzhaq.m7305b(zzalfVar2.f5807c);
                                            zztVar.f20797i = zzhaq.m7305b(zzalfVar2.f5808d);
                                        }
                                    }
                                    zzalkVar = zzalkVar3;
                                    zzalkVar.f5816b = zztVar.m8850b();
                                }
                            } else if (iM6376b9 == 1836069985 || iM6376b9 == 1701733217 || iM6376b9 == 1633889587 || iM6376b9 == 1700998451 || iM6376b9 == 1633889588 || iM6376b9 == 1835823201 || iM6376b9 == 1685353315 || iM6376b9 == 1685353317 || iM6376b9 == 1685353320 || iM6376b9 == 1685353324 || iM6376b9 == 1685353336 || iM6376b9 == 1935764850 || iM6376b9 == 1935767394 || iM6376b9 == 1819304813 || iM6376b9 == 1936684916 || iM6376b9 == 1953984371 || iM6376b9 == 778924082 || iM6376b9 == 778924083 || iM6376b9 == 1835557169 || iM6376b9 == 1835560241 || iM6376b9 == 1634492771 || iM6376b9 == 1634492791 || iM6376b9 == 1970037111 || iM6376b9 == 1332770163 || iM6376b9 == 1716281667 || iM6376b9 == 1767992678 || iM6376b9 == 1768973165 || iM6376b9 == 1718641517) {
                                int i90 = i22;
                                m4199i(zzeuVar5, iM6376b9, i25, iM6376b8, iM6376b2, str8, z2, zzqVar, zzalkVar, i90);
                                zzeuVar = zzeuVar5;
                                String str24 = str8;
                                i25 = i25;
                                iM6376b8 = iM6376b8;
                                zzalkVar = zzalkVar;
                                i22 = i90;
                                arrayList3 = arrayList3;
                                j7 = j7;
                                zzfzVar3 = zzfzVar3;
                                i4 = i4;
                                str11 = str11;
                                str8 = str24;
                                iM6376b2 = iM6376b2;
                                c2 = 2;
                            } else {
                                if (iM6376b9 != 1414810956 && iM6376b9 != 1954034535 && iM6376b9 != 2004251764 && iM6376b9 != 1937010800 && iM6376b9 != 1664495672 && iM6376b9 != 1836070003) {
                                    if (iM6376b9 != 1952807028) {
                                        if (iM6376b9 == 1835365492) {
                                            zzeuVar5.m6363E(i25 + 16);
                                            zzeuVar5.m6387m();
                                            String strM6387m = zzeuVar5.m6387m();
                                            if (strM6387m != null) {
                                                zzt zztVar2 = new zzt();
                                                zztVar2.m8851c(iM6376b2);
                                                zztVar2.m8853e(strM6387m);
                                                zzalkVar.f5816b = new zzv(zztVar2);
                                            }
                                        } else if (iM6376b9 == 1667329389) {
                                            zzt zztVar3 = new zzt();
                                            zztVar3.m8851c(iM6376b2);
                                            zztVar3.m8853e("application/x-camera-motion");
                                            zzalkVar.f5816b = new zzv(zztVar3);
                                        }
                                        zzeuVar = zzeuVar5;
                                        sM6372N = sM6372N;
                                        i22 = i22;
                                        zzalkVar = zzalkVar;
                                        iM6376b7 = iM6376b7;
                                        sM6372N2 = sM6372N2;
                                        i11 = i11;
                                        zzfzVar3 = zzfzVar3;
                                        c2 = c2;
                                        j7 = j7;
                                        zzalhVar = zzalhVar;
                                        i23 = i23;
                                        iM6376b8 = iM6376b8;
                                        i26 = i26;
                                        str11 = str11;
                                    }
                                }
                                zzeuVar5.m6363E(i25 + 16);
                                if (iM6376b9 == 1414810956) {
                                    str10 = "application/ttml+xml";
                                } else if (iM6376b9 == 1954034535) {
                                    int i91 = iM6376b8 - 16;
                                    byte[] bArr7 = new byte[i91];
                                    zzeuVar5.m6366H(bArr7, i12, i91);
                                    str10 = "application/x-quicktime-tx3g";
                                    zzeuVar5 = zzeuVar5;
                                    zzgwtVarM7216n = zzgwt.m7216n(bArr7);
                                    sM6372N = sM6372N;
                                    i22 = i22;
                                    j4 = Long.MAX_VALUE;
                                    if (str10 != null) {
                                        zzt zztVar4 = new zzt();
                                        zztVar4.m8851c(iM6376b2);
                                        zztVar4.m8853e(str10);
                                        zztVar4.f20792d = str8;
                                        zztVar4.f20807s = j4;
                                        zztVar4.f20805q = zzgwtVarM7216n;
                                        zzalkVar.f5816b = new zzv(zztVar4);
                                    }
                                    sM6372N = sM6372N;
                                    zzeuVar = zzeuVar5;
                                } else if (iM6376b9 == 2004251764) {
                                    str10 = "application/x-mp4-vtt";
                                } else if (iM6376b9 == 1937010800) {
                                    zzeuVar5 = zzeuVar5;
                                    str10 = "application/ttml+xml";
                                    j4 = 0;
                                    zzgwtVarM7216n = null;
                                    if (str10 != null) {
                                        zzt zztVar5 = new zzt();
                                        zztVar5.m8851c(iM6376b2);
                                        zztVar5.m8853e(str10);
                                        zztVar5.f20792d = str8;
                                        zztVar5.f20807s = j4;
                                        zztVar5.f20805q = zzgwtVarM7216n;
                                        zzalkVar.f5816b = new zzv(zztVar5);
                                    }
                                    sM6372N = sM6372N;
                                    zzeuVar = zzeuVar5;
                                } else if (iM6376b9 == 1664495672) {
                                    zzalkVar.f5818d = 1;
                                    str10 = "application/x-mp4-cea-608";
                                } else {
                                    if (iM6376b9 == 1836070003) {
                                        int i92 = zzeuVar5.f14888b;
                                        zzeuVar5.m6365G(4);
                                        if (zzeuVar5.m6376b() == 1702061171) {
                                            byte[] bArr8 = m4200j(i92, zzeuVar5).f5806b;
                                            if (bArr8 == null || bArr8.length != 64) {
                                                zzeuVar = zzeuVar5;
                                                sM6372N = sM6372N;
                                                i22 = i22;
                                            } else {
                                                zzgtr.m7133f(bArr8.length == 64);
                                                ArrayList arrayList5 = new ArrayList(16);
                                                int i93 = 0;
                                                while (i93 < bArr8.length - 3) {
                                                    zzeu zzeuVar7 = zzeuVar5;
                                                    byte[] bArr9 = bArr8;
                                                    int iM7306c = zzhaq.m7306c(bArr8[i93], bArr8[i93 + 1], bArr9[i93 + 2], bArr9[i93 + 3]);
                                                    String str25 = zzfm.f16091a;
                                                    int i94 = ((iM7306c >> 8) & 255) - 128;
                                                    int i95 = (iM7306c >> 16) & 255;
                                                    int i96 = (iM7306c & 255) - 128;
                                                    arrayList5.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(((i96 * 17790) / 10000) + i95, 255)) | (Math.max(0, Math.min(((i94 * 14075) / 10000) + i95, 255)) << 16) | (Math.max(0, Math.min((i95 - ((i96 * 3455) / 10000)) - ((i94 * 7169) / 10000), 255)) << 8))));
                                                    i93 += 4;
                                                    zzeuVar5 = zzeuVar7;
                                                    bArr8 = bArr9;
                                                    i22 = i22;
                                                }
                                                zzeuVar5 = zzeuVar5;
                                                i22 = i22;
                                                Iterator it = arrayList5.iterator();
                                                StringBuilder sb = new StringBuilder();
                                                zzgtl.m7126a(sb, it, ", ");
                                                String string2 = sb.toString();
                                                StringBuilder sb2 = new StringBuilder(AbstractC1456a.m2438e(AbstractC1456a.m2438e(String.valueOf((int) sM6372N).length() + 7, 10, String.valueOf((int) sM6372N2)), 1, string2));
                                                sb2.append("size: ");
                                                sb2.append((int) sM6372N);
                                                sb2.append("x");
                                                sb2.append((int) sM6372N2);
                                                String strM2450q = AbstractC1456a.m2450q(sb2, "\npalette: ", string2, "\n");
                                                String str26 = zzfm.f16091a;
                                                zzgwtVarM7216n = zzgwt.m7216n(strM2450q.getBytes(StandardCharsets.UTF_8));
                                                str7 = "application/vobsub";
                                            }
                                        } else {
                                            zzeuVar5 = zzeuVar5;
                                            i22 = i22;
                                            zzgwtVarM7216n = null;
                                            str7 = null;
                                        }
                                        str10 = str7;
                                        sM6372N = sM6372N;
                                        j4 = Long.MAX_VALUE;
                                    } else {
                                        zzeuVar5 = zzeuVar5;
                                        i22 = i22;
                                        sM6372N = sM6372N;
                                        j4 = Long.MAX_VALUE;
                                        zzgwtVarM7216n = null;
                                    }
                                    if (str10 != null) {
                                        zzt zztVar6 = new zzt();
                                        zztVar6.m8851c(iM6376b2);
                                        zztVar6.m8853e(str10);
                                        zztVar6.f20792d = str8;
                                        zztVar6.f20807s = j4;
                                        zztVar6.f20805q = zzgwtVarM7216n;
                                        zzalkVar.f5816b = new zzv(zztVar6);
                                    }
                                    sM6372N = sM6372N;
                                    zzeuVar = zzeuVar5;
                                }
                                j4 = Long.MAX_VALUE;
                                zzgwtVarM7216n = null;
                                if (str10 != null) {
                                    zzt zztVar7 = new zzt();
                                    zztVar7.m8851c(iM6376b2);
                                    zztVar7.m8853e(str10);
                                    zztVar7.f20792d = str8;
                                    zztVar7.f20807s = j4;
                                    zztVar7.f20805q = zzgwtVarM7216n;
                                    zzalkVar.f5816b = new zzv(zztVar7);
                                }
                                sM6372N = sM6372N;
                                zzeuVar = zzeuVar5;
                            }
                            zzeuVar.m6363E(i25 + iM6376b8);
                            i22++;
                            i4 = i4;
                            zzeuVar5 = zzeuVar;
                            str9 = str11;
                            c2 = c2;
                            iM6376b2 = iM6376b2;
                            str8 = str8;
                            i11 = i11;
                            sM6372N2 = sM6372N2;
                            iM6376b7 = iM6376b7;
                            arrayList3 = arrayList3;
                            j7 = j7;
                            zzfzVar3 = zzfzVar3;
                            i2 = i23;
                            iM6370L = i26;
                            zzalhVar = zzalhVar;
                            i12 = 0;
                            zzalkVar = zzalkVar;
                            sM6372N = sM6372N;
                        }
                        int i97 = i2;
                        int i98 = iM6370L;
                        zzalk zzalkVar4 = zzalkVar;
                        i5 = i11;
                        long j9 = j7;
                        zzalh zzalhVar2 = zzalhVar;
                        int i99 = iM6376b2;
                        arrayList = arrayList3;
                        int iM6376b16 = -1;
                        zzfzVar2 = zzfzVar3;
                        zzfz zzfzVarM6801c5 = zzfzVar2.m6801c(1953654118);
                        if (zzfzVarM6801c5 != null && (zzgaVarM6800b = zzfzVarM6801c5.m6800b(1667785072)) != null) {
                            zzeu zzeuVar8 = zzgaVarM6800b.f16879b;
                            zzeuVar8.m6363E(8);
                            if (zzeuVar8.m6360B() >= 4) {
                                iM6376b16 = zzeuVar8.m6376b();
                            }
                        }
                        if (z || (zzfzVarM6801c = zzfzVar2.m6801c(1701082227)) == null || (pairM4198h = m4198h(zzfzVarM6801c)) == null) {
                            zzhaoVar = null;
                            zzhaoVar2 = null;
                        } else {
                            zzhaoVar2 = (zzhao) pairM4198h.first;
                            zzhaoVar = (zzhao) pairM4198h.second;
                        }
                        zzv zzvVarM8850b = zzalkVar4.f5816b;
                        if (zzvVarM8850b == null) {
                            zzampVar = null;
                        } else {
                            if (i98 != 0) {
                                zzfy zzfyVar = new zzfy(i98);
                                zzt zztVarM8927a = zzvVarM8850b.m8927a();
                                zzap zzapVar2 = zzvVarM8850b.f21058l;
                                if (zzapVar2 != null) {
                                    z5 = true;
                                    zzapVar = zzapVar2.m4289d(zzfyVar);
                                } else {
                                    z5 = true;
                                    zzapVar = new zzap(zzfyVar);
                                }
                                zztVarM8927a.f20799k = zzapVar;
                                zzvVarM8850b = zztVarM8927a.m8850b();
                            } else {
                                z5 = true;
                            }
                            boolean zEquals = Objects.equals(zzvVarM8850b.f21061o, "text/x-unknown") ^ z5;
                            zzamo zzamoVar = new zzamo();
                            zzamoVar.f5982a = i99;
                            zzamoVar.f5983b = i97;
                            zzamoVar.f5984c = zzalhVar2.f5810a;
                            zzamoVar.f5985d = j3;
                            zzamoVar.f5986e = j9;
                            zzamoVar.f5987f = zzalhVar2.f5811b;
                            zzamoVar.f5988g = zzvVarM8850b;
                            zzamoVar.f5989h = zzalkVar4.f5818d;
                            zzamoVar.f5990i = (zzamq[]) zzamqVarArr.clone();
                            zzamoVar.f5991j = zzalkVar4.f5817c;
                            zzamoVar.f5992k = zzhaoVar2;
                            zzamoVar.f5993l = zzhaoVar;
                            zzamoVar.f5994m = zEquals;
                            zzamoVar.f5995n = iM6376b16;
                            zzamoVar.f5988g.getClass();
                            zzampVar = new zzamp(zzamoVar);
                        }
                    }
                }
                zzamp zzampVar2 = (zzamp) zzgtiVar.apply(zzampVar);
                if (zzampVar2 != null) {
                    zzfz zzfzVarM6801c6 = zzfzVar2.m6801c(1835297121);
                    zzfzVarM6801c6.getClass();
                    zzfz zzfzVarM6801c7 = zzfzVarM6801c6.m6801c(1835626086);
                    zzfzVarM6801c7.getClass();
                    zzfz zzfzVarM6801c8 = zzfzVarM6801c7.m6801c(1937007212);
                    zzfzVarM6801c8.getClass();
                    zzams zzamsVarM4197g = m4197g(zzampVar2, zzfzVarM6801c8, zzagtVar);
                    arrayList2 = arrayList;
                    arrayList2.add(zzamsVarM4197g);
                } else {
                    arrayList2 = arrayList;
                }
            }
            i11 = i5 + 1;
            arrayList3 = arrayList2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x02d5 A[Catch: all -> 0x0094, TryCatch #3 {all -> 0x0094, blocks: (B:22:0x007d, B:24:0x0089, B:27:0x0097, B:31:0x00a4, B:34:0x00b1, B:37:0x00be, B:40:0x00cb, B:43:0x00d8, B:45:0x00e4, B:53:0x0100, B:54:0x011e, B:55:0x0131, B:58:0x013d, B:61:0x014a, B:64:0x0157, B:67:0x0164, B:70:0x0171, B:73:0x017e, B:76:0x018b, B:79:0x0198, B:82:0x01a5, B:85:0x01b2, B:89:0x01c4, B:91:0x01c8, B:93:0x01d9, B:95:0x01e2, B:97:0x01e9, B:103:0x01f6, B:109:0x0205, B:153:0x02d5, B:110:0x021b, B:112:0x0222, B:114:0x022e, B:115:0x0242, B:128:0x026b, B:131:0x0278, B:134:0x0285, B:137:0x0292, B:140:0x029e, B:143:0x02aa, B:146:0x02b4, B:149:0x02c0, B:152:0x02cc, B:154:0x02f3, B:155:0x02fa), top: B:256:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:203:0x039e  */
    /* JADX WARN: Code duplicated, block: B:212:0x03b7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v32 */
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
    /* JADX INFO: renamed from: c */
    public static zzap m4193c(zzga zzgaVar) {
        int i2;
        boolean z;
        zzap zzapVar;
        zzap zzapVar2;
        zzap zzapVarM4288c;
        zzap zzapVar3;
        zzap zzapVar4;
        int iM6380f;
        zzap zzapVar5;
        Object objM4217b;
        String str;
        zzeu zzeuVar = zzgaVar.f16879b;
        int i3 = 8;
        zzeuVar.m6363E(8);
        boolean z2 = false;
        zzap zzapVar6 = new zzap(new zzao[0]);
        while (zzeuVar.m6360B() >= i3) {
            int i4 = zzeuVar.f14888b;
            int iM6376b = zzeuVar.m6376b() + i4;
            int iM6376b2 = zzeuVar.m6376b();
            boolean z3 = true;
            String str2 = null;
            if (iM6376b2 == 1835365473) {
                zzeuVar.m6363E(i4);
                zzeuVar.m6365G(i3);
                m4196f(zzeuVar);
                boolean z4 = z2;
                while (true) {
                    int i5 = zzeuVar.f14888b;
                    if (i5 < iM6376b) {
                        int iM6376b3 = zzeuVar.m6376b() + i5;
                        if (zzeuVar.m6376b() == 1768715124) {
                            zzeuVar.m6363E(i5);
                            zzeuVar.m6365G(i3);
                            ArrayList arrayList = new ArrayList();
                            ?? r3 = z4;
                            while (true) {
                                int i6 = zzeuVar.f14888b;
                                if (i6 >= iM6376b3) {
                                    break;
                                }
                                int iM6376b4 = zzeuVar.m6376b() + i6;
                                int iM6376b5 = zzeuVar.m6376b();
                                int i7 = (iM6376b5 >> 24) & 255;
                                if (i7 == 169 || i7 == 253) {
                                    int i8 = iM6376b5 & ViewCompat.MEASURED_SIZE_MASK;
                                    if (i8 == 6516084) {
                                        int iM6376b6 = zzeuVar.m6376b();
                                        if (zzeuVar.m6376b() == 1684108385) {
                                            zzeuVar.m6365G(8);
                                            String strM6386l = zzeuVar.m6386l(iM6376b6 - 16);
                                            objM4217b = new zzajm("und", strM6386l, strM6386l);
                                        } else {
                                            zzeh.m6211c("MetadataUtil", "Failed to parse comment attribute: ".concat(zzgb.m6835a(iM6376b5)));
                                            objM4217b = null;
                                        }
                                    } else if (i8 == 7233901 || i8 == 7631467) {
                                        objM4217b = zzaly.m4217b(iM6376b5, "TIT2", zzeuVar);
                                    } else if (i8 == 6516589 || i8 == 7828084) {
                                        objM4217b = zzaly.m4217b(iM6376b5, "TCOM", zzeuVar);
                                    } else if (i8 == 6578553) {
                                        objM4217b = zzaly.m4217b(iM6376b5, "TDRC", zzeuVar);
                                    } else if (i8 == 4280916) {
                                        objM4217b = zzaly.m4217b(iM6376b5, "TPE1", zzeuVar);
                                    } else if (i8 == 7630703) {
                                        objM4217b = zzaly.m4217b(iM6376b5, "TSSE", zzeuVar);
                                    } else if (i8 == 6384738) {
                                        objM4217b = zzaly.m4217b(iM6376b5, "TALB", zzeuVar);
                                    } else if (i8 == 7108978) {
                                        objM4217b = zzaly.m4217b(iM6376b5, "USLT", zzeuVar);
                                    } else if (i8 == 6776174) {
                                        objM4217b = zzaly.m4217b(iM6376b5, "TCON", zzeuVar);
                                    } else if (i8 == 6779504) {
                                        objM4217b = zzaly.m4217b(iM6376b5, "TIT1", zzeuVar);
                                    } else if (i8 == 7173742) {
                                        objM4217b = zzaly.m4217b(iM6376b5, "MVNM", zzeuVar);
                                    } else if (i8 == 7173737) {
                                        objM4217b = zzaly.m4218c(iM6376b5, "MVIN", zzeuVar, true, false);
                                    } else {
                                        String strM6835a = zzgb.m6835a(iM6376b5);
                                        StringBuilder sb = new StringBuilder(strM6835a.length() + 32);
                                        sb.append("Skipped unknown metadata entry: ");
                                        sb.append(strM6835a);
                                        zzeh.m6209a("MetadataUtil", sb.toString());
                                        objM4217b = null;
                                    }
                                } else if (iM6376b5 == 1735291493) {
                                    try {
                                        String strM4160a = zzajt.m4160a(zzaly.m4219d(zzeuVar) - 1);
                                        if (strM4160a != null) {
                                            objM4217b = new zzajx("TCON", str2, zzgwt.m7216n(strM4160a));
                                        } else {
                                            zzeh.m6211c("MetadataUtil", "Failed to parse standard genre code");
                                            objM4217b = str2;
                                        }
                                    } catch (Throwable th) {
                                        zzeuVar.m6363E(iM6376b4);
                                        throw th;
                                    }
                                } else if (iM6376b5 == 1684632427) {
                                    objM4217b = zzaly.m4220e(1684632427, "TPOS", zzeuVar);
                                } else if (iM6376b5 == 1953655662) {
                                    objM4217b = zzaly.m4220e(1953655662, "TRCK", zzeuVar);
                                } else if (iM6376b5 == 1953329263) {
                                    objM4217b = zzaly.m4218c(1953329263, "TBPM", zzeuVar, z3, r3);
                                } else if (iM6376b5 == 1668311404) {
                                    objM4217b = zzaly.m4218c(1668311404, "TCMP", zzeuVar, z3, z3);
                                } else if (iM6376b5 == 1668249202) {
                                    int iM6376b7 = zzeuVar.m6376b();
                                    if (zzeuVar.m6376b() == 1684108385) {
                                        int iM6376b8 = zzeuVar.m6376b() & ViewCompat.MEASURED_SIZE_MASK;
                                        if (iM6376b8 == 13) {
                                            str = "image/jpeg";
                                        } else if (iM6376b8 == 14) {
                                            str = "image/png";
                                            iM6376b8 = 14;
                                        } else {
                                            str = str2;
                                        }
                                        if (str == null) {
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(iM6376b8).length() + 30);
                                            sb2.append("Unrecognized cover art flags: ");
                                            sb2.append(iM6376b8);
                                            zzeh.m6211c("MetadataUtil", sb2.toString());
                                        } else {
                                            zzeuVar.m6365G(4);
                                            int i9 = iM6376b7 - 16;
                                            byte[] bArr = new byte[i9];
                                            zzeuVar.m6366H(bArr, r3, i9);
                                            objM4217b = new zzaji(str, str2, 3, bArr);
                                        }
                                    } else {
                                        zzeh.m6211c("MetadataUtil", "Failed to parse cover art attribute");
                                    }
                                    objM4217b = str2;
                                } else if (iM6376b5 == 1631670868) {
                                    objM4217b = zzaly.m4217b(1631670868, "TPE2", zzeuVar);
                                } else if (iM6376b5 == 1936682605) {
                                    objM4217b = zzaly.m4217b(1936682605, "TSOT", zzeuVar);
                                } else if (iM6376b5 == 1936679276) {
                                    objM4217b = zzaly.m4217b(1936679276, "TSOA", zzeuVar);
                                } else if (iM6376b5 == 1936679282) {
                                    objM4217b = zzaly.m4217b(1936679282, "TSOP", zzeuVar);
                                } else if (iM6376b5 == 1936679265) {
                                    objM4217b = zzaly.m4217b(1936679265, "TSO2", zzeuVar);
                                } else if (iM6376b5 == 1936679791) {
                                    objM4217b = zzaly.m4217b(1936679791, "TSOC", zzeuVar);
                                } else if (iM6376b5 == 1920233063) {
                                    objM4217b = zzaly.m4218c(1920233063, "ITUNESADVISORY", zzeuVar, r3, r3);
                                } else if (iM6376b5 == 1885823344) {
                                    objM4217b = zzaly.m4218c(1885823344, "ITUNESGAPLESS", zzeuVar, r3, z3);
                                } else if (iM6376b5 == 1936683886) {
                                    objM4217b = zzaly.m4217b(1936683886, "TVSHOWSORT", zzeuVar);
                                } else if (iM6376b5 == 1953919848) {
                                    objM4217b = zzaly.m4217b(1953919848, "TVSHOW", zzeuVar);
                                } else {
                                    if (iM6376b5 == 757935405) {
                                        String strM6386l2 = str2;
                                        String strM6386l3 = strM6386l2;
                                        int i10 = -1;
                                        int i11 = -1;
                                        while (true) {
                                            int i12 = zzeuVar.f14888b;
                                            if (i12 >= iM6376b4) {
                                                break;
                                            }
                                            int iM6376b9 = zzeuVar.m6376b();
                                            int iM6376b10 = zzeuVar.m6376b();
                                            zzeuVar.m6365G(4);
                                            if (iM6376b10 == 1835360622) {
                                                strM6386l2 = zzeuVar.m6386l(iM6376b9 - 12);
                                            } else {
                                                int i13 = iM6376b9 - 12;
                                                if (iM6376b10 == 1851878757) {
                                                    strM6386l3 = zzeuVar.m6386l(i13);
                                                } else {
                                                    if (iM6376b10 == 1684108385) {
                                                        i11 = iM6376b9;
                                                    }
                                                    if (iM6376b10 == 1684108385) {
                                                        i10 = i12;
                                                    }
                                                    zzeuVar.m6365G(i13);
                                                }
                                            }
                                        }
                                        if (strM6386l2 != null && strM6386l3 != null && i10 != -1) {
                                            zzeuVar.m6363E(i10);
                                            zzeuVar.m6365G(16);
                                            objM4217b = new zzaju(strM6386l2, strM6386l3, zzeuVar.m6386l(i11 - 16));
                                        }
                                    } else {
                                        String strM6835a2 = zzgb.m6835a(iM6376b5);
                                        StringBuilder sb3 = new StringBuilder(strM6835a2.length() + 32);
                                        sb3.append("Skipped unknown metadata entry: ");
                                        sb3.append(strM6835a2);
                                        zzeh.m6209a("MetadataUtil", sb3.toString());
                                    }
                                    objM4217b = null;
                                }
                                zzeuVar.m6363E(iM6376b4);
                                if (objM4217b != null) {
                                    arrayList.add(objM4217b);
                                }
                                r3 = 0;
                                z3 = true;
                                str2 = null;
                            }
                            if (!arrayList.isEmpty()) {
                                zzapVar5 = new zzap(arrayList);
                                break;
                            }
                            break;
                        }
                        zzeuVar.m6363E(iM6376b3);
                        i3 = 8;
                        z4 = false;
                        z3 = true;
                        str2 = null;
                    }
                    zzapVar5 = null;
                    break;
                }
                zzapVar6 = zzapVar6.m4288c(zzapVar5);
                i2 = 8;
            } else {
                if (iM6376b2 == 1936553057) {
                    zzeuVar.m6363E(i4);
                    zzeuVar.m6365G(12);
                    while (true) {
                        int i14 = zzeuVar.f14888b;
                        if (i14 < iM6376b) {
                            int iM6376b11 = zzeuVar.m6376b();
                            if (zzeuVar.m6376b() == 1935766900) {
                                if (iM6376b11 >= 16) {
                                    zzeuVar.m6365G(4);
                                    int i15 = 0;
                                    int i16 = -1;
                                    for (int i17 = 0; i17 < 2; i17++) {
                                        int iM6369K = zzeuVar.m6369K();
                                        int iM6369K2 = zzeuVar.m6369K();
                                        if (iM6369K == 0) {
                                            i16 = iM6369K2;
                                        } else if (iM6369K == 1) {
                                            i15 = iM6369K2;
                                        }
                                    }
                                    if (i16 == 12) {
                                        iM6380f = 240;
                                    } else if (i16 == 13) {
                                        iM6380f = C1137R.styleable.ConstraintSet_stateLabels;
                                    } else {
                                        if (i16 != 21) {
                                            iM6380f = -2147483647;
                                        } else {
                                            i2 = 8;
                                            if (zzeuVar.m6360B() < 8 || zzeuVar.f14888b + 8 > iM6376b) {
                                                iM6380f = -2147483647;
                                            } else {
                                                int iM6376b12 = zzeuVar.m6376b();
                                                int iM6376b13 = zzeuVar.m6376b();
                                                if (iM6376b12 < 12 || iM6376b13 != 1936877170) {
                                                    iM6380f = -2147483647;
                                                } else {
                                                    iM6380f = zzeuVar.m6380f();
                                                }
                                            }
                                        }
                                        if (iM6380f == -2147483647) {
                                            zzapVar4 = new zzap(new zzakb(iM6380f, i15));
                                        }
                                        zzapVar6 = zzapVar6.m4288c(zzapVar4);
                                    }
                                    i2 = 8;
                                    if (iM6380f == -2147483647) {
                                        zzapVar4 = new zzap(new zzakb(iM6380f, i15));
                                    }
                                    zzapVar6 = zzapVar6.m4288c(zzapVar4);
                                }
                                zzapVar4 = null;
                                zzapVar6 = zzapVar6.m4288c(zzapVar4);
                            } else {
                                zzeuVar.m6363E(i14 + iM6376b11);
                            }
                        }
                        i2 = 8;
                        zzapVar4 = null;
                        zzapVar6 = zzapVar6.m4288c(zzapVar4);
                    }
                } else {
                    i2 = 8;
                    if (iM6376b2 == -1451722374) {
                        short sM6372N = zzeuVar.m6372N();
                        zzeuVar.m6365G(2);
                        String strM6385k = zzeuVar.m6385k(sM6372N, StandardCharsets.UTF_8);
                        int iMax = Math.max(strM6385k.lastIndexOf(43), strM6385k.lastIndexOf(45));
                        try {
                            try {
                                zzgc zzgcVar = new zzgc(Float.parseFloat(strM6385k.substring(0, iMax)), Float.parseFloat(strM6385k.substring(iMax, strM6385k.length() - 1)));
                                zzao[] zzaoVarArr = new zzao[1];
                                z = false;
                                try {
                                    zzaoVarArr[0] = zzgcVar;
                                    zzapVar3 = new zzap(zzaoVarArr);
                                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                    zzapVar3 = null;
                                }
                            } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                                z = false;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                            z = false;
                        }
                        zzapVarM4288c = zzapVar6.m4288c(zzapVar3);
                    } else {
                        z = false;
                        if (iM6376b2 == 1667788908) {
                            try {
                                zzeuVar.m6365G(5);
                                int iM6376b14 = zzeuVar.m6376b();
                                ArrayList arrayList2 = new ArrayList();
                                for (int i18 = 0; i18 < iM6376b14; i18++) {
                                    long jM6378d = zzeuVar.m6378d() / WorkRequest.MIN_BACKOFF_MILLIS;
                                    if (jM6378d < 0) {
                                        jM6378d = -9223372036854775807L;
                                    }
                                    String strM6385k2 = zzeuVar.m6385k(zzeuVar.m6369K(), StandardCharsets.UTF_8);
                                    zzaiy zzaiyVar = new zzaiy();
                                    zzaiyVar.f5496a = jM6378d;
                                    zzapVar = null;
                                    try {
                                        zzx zzxVar = new zzx(null, strM6385k2);
                                        zzaiyVar.f5499d = zzxVar;
                                        arrayList2.add(new zzaja(zzaiyVar.f5496a, zzaiyVar.f5497b, zzaiyVar.f5498c, zzxVar));
                                    } catch (IndexOutOfBoundsException unused4) {
                                    }
                                }
                                zzapVar = null;
                                zzapVar2 = arrayList2.isEmpty() ? zzapVar : new zzap(arrayList2);
                            } catch (IndexOutOfBoundsException unused5) {
                                zzapVar = null;
                            }
                            zzapVarM4288c = zzapVar6.m4288c(zzapVar2);
                        }
                    }
                    zzapVar6 = zzapVarM4288c;
                }
                zzeuVar.m6363E(iM6376b);
                i3 = i2;
                z2 = z;
            }
            z = false;
            zzeuVar.m6363E(iM6376b);
            i3 = i2;
            z2 = z;
        }
        return zzapVar6;
    }

    /* JADX INFO: renamed from: d */
    public static zzgd m4194d(zzeu zzeuVar) {
        long jM6378d;
        long jM6378d2;
        zzeuVar.m6363E(8);
        if (m4191a(zzeuVar.m6376b()) == 0) {
            jM6378d = zzeuVar.m6374P();
            jM6378d2 = zzeuVar.m6374P();
        } else {
            jM6378d = zzeuVar.m6378d();
            jM6378d2 = zzeuVar.m6378d();
        }
        return new zzgd(jM6378d, jM6378d2, zzeuVar.m6374P());
    }

    /* JADX INFO: renamed from: e */
    public static zzap m4195e(zzfz zzfzVar) {
        zzfx zzfxVar;
        zzga zzgaVarM6800b = zzfzVar.m6800b(1751411826);
        zzga zzgaVarM6800b2 = zzfzVar.m6800b(1801812339);
        zzga zzgaVarM6800b3 = zzfzVar.m6800b(1768715124);
        if (zzgaVarM6800b != null && zzgaVarM6800b2 != null && zzgaVarM6800b3 != null) {
            zzeu zzeuVar = zzgaVarM6800b.f16879b;
            zzeuVar.m6363E(16);
            if (zzeuVar.m6376b() == 1835299937) {
                zzeu zzeuVar2 = zzgaVarM6800b2.f16879b;
                zzeuVar2.m6363E(12);
                int iM6376b = zzeuVar2.m6376b();
                String[] strArr = new String[iM6376b];
                for (int i2 = 0; i2 < iM6376b; i2++) {
                    int iM6376b2 = zzeuVar2.m6376b();
                    zzeuVar2.m6365G(4);
                    strArr[i2] = zzeuVar2.m6385k(iM6376b2 - 8, StandardCharsets.UTF_8);
                }
                zzeu zzeuVar3 = zzgaVarM6800b3.f16879b;
                zzeuVar3.m6363E(8);
                ArrayList arrayList = new ArrayList();
                while (zzeuVar3.m6360B() > 8) {
                    int iM6376b3 = zzeuVar3.m6376b() + zzeuVar3.f14888b;
                    int iM6376b4 = zzeuVar3.m6376b() - 1;
                    if (iM6376b4 < 0 || iM6376b4 >= iM6376b) {
                        AbstractC5152f.m3776h(new StringBuilder(String.valueOf(iM6376b4).length() + 41), "Skipped metadata with unknown key index: ", iM6376b4, "BoxParsers");
                    } else {
                        String str = strArr[iM6376b4];
                        while (true) {
                            int i3 = zzeuVar3.f14888b;
                            if (i3 < iM6376b3) {
                                int iM6376b5 = zzeuVar3.m6376b();
                                if (zzeuVar3.m6376b() == 1684108385) {
                                    int iM6376b6 = zzeuVar3.m6376b();
                                    int iM6376b7 = zzeuVar3.m6376b();
                                    int i4 = iM6376b5 - 16;
                                    byte[] bArr = new byte[i4];
                                    zzeuVar3.m6366H(bArr, 0, i4);
                                    try {
                                        zzfxVar = new zzfx(str, bArr, iM6376b7, iM6376b6);
                                        break;
                                    } catch (Exception unused) {
                                        AbstractC5152f.m3775g(str, "Failed to parse metadata entry with key: ", "MetadataUtil");
                                        zzfxVar = null;
                                        break;
                                    }
                                }
                                zzeuVar3.m6363E(i3 + iM6376b5);
                            }
                            zzfxVar = null;
                            break;
                        }
                        if (zzfxVar != null) {
                            arrayList.add(zzfxVar);
                        }
                    }
                    zzeuVar3.m6363E(iM6376b3);
                }
                if (!arrayList.isEmpty()) {
                    return new zzap(arrayList);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static void m4196f(zzeu zzeuVar) {
        int i2 = zzeuVar.f14888b;
        zzeuVar.m6365G(4);
        if (zzeuVar.m6376b() != 1751411826) {
            i2 += 4;
        }
        zzeuVar.m6363E(i2);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x026a  */
    /* JADX WARN: Code duplicated, block: B:106:0x027a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0299 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x029b  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d1 A[LOOP:15: B:122:0x02c7->B:126:0x02d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:127:0x02d7 A[EDGE_INSN: B:127:0x02d7->B:128:0x02d9 BREAK  A[LOOP:15: B:122:0x02c7->B:126:0x02d1]] */
    /* JADX WARN: Code duplicated, block: B:129:0x02db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x02dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x02df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x02e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x02e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:136:0x0301  */
    /* JADX WARN: Code duplicated, block: B:137:0x030f  */
    /* JADX WARN: Code duplicated, block: B:138:0x031e  */
    /* JADX WARN: Code duplicated, block: B:140:0x032e  */
    /* JADX WARN: Code duplicated, block: B:141:0x033b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0393  */
    /* JADX WARN: Code duplicated, block: B:145:0x0396  */
    /* JADX WARN: Code duplicated, block: B:150:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:157:0x042f  */
    /* JADX WARN: Code duplicated, block: B:159:0x043c  */
    /* JADX WARN: Code duplicated, block: B:188:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:190:0x0502  */
    /* JADX WARN: Code duplicated, block: B:192:0x050d  */
    /* JADX WARN: Code duplicated, block: B:195:0x0518 A[LOOP:4: B:193:0x0515->B:195:0x0518, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:198:0x0541  */
    /* JADX WARN: Code duplicated, block: B:201:0x0550  */
    /* JADX WARN: Code duplicated, block: B:202:0x0552  */
    /* JADX WARN: Code duplicated, block: B:205:0x0563  */
    /* JADX WARN: Code duplicated, block: B:207:0x0571  */
    /* JADX WARN: Code duplicated, block: B:209:0x0597  */
    /* JADX WARN: Code duplicated, block: B:210:0x0599 A[LOOP:9: B:210:0x0599->B:215:0x05a5, LOOP_START, PHI: r2
  0x0599: PHI (r2v19 int) = (r2v18 int), (r2v21 int) binds: [B:208:0x0595, B:215:0x05a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:217:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:221:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:223:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:224:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:227:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:237:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:239:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:245:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:248:0x0607  */
    /* JADX WARN: Code duplicated, block: B:249:0x0609  */
    /* JADX WARN: Code duplicated, block: B:251:0x0612  */
    /* JADX WARN: Code duplicated, block: B:255:0x0632  */
    /* JADX WARN: Code duplicated, block: B:256:0x0634  */
    /* JADX WARN: Code duplicated, block: B:259:0x063a  */
    /* JADX WARN: Code duplicated, block: B:260:0x063d  */
    /* JADX WARN: Code duplicated, block: B:262:0x0640  */
    /* JADX WARN: Code duplicated, block: B:264:0x0644  */
    /* JADX WARN: Code duplicated, block: B:266:0x0649  */
    /* JADX WARN: Code duplicated, block: B:268:0x064d  */
    /* JADX WARN: Code duplicated, block: B:269:0x0650  */
    /* JADX WARN: Code duplicated, block: B:271:0x0653  */
    /* JADX WARN: Code duplicated, block: B:272:0x0659  */
    /* JADX WARN: Code duplicated, block: B:275:0x0667  */
    /* JADX WARN: Code duplicated, block: B:277:0x0675  */
    /* JADX WARN: Code duplicated, block: B:278:0x0687  */
    /* JADX WARN: Code duplicated, block: B:281:0x0695  */
    /* JADX WARN: Code duplicated, block: B:283:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:285:0x06be  */
    /* JADX WARN: Code duplicated, block: B:300:0x071f  */
    /* JADX WARN: Code duplicated, block: B:313:0x05c6 A[EDGE_INSN: B:313:0x05c6->B:229:0x05c6 BREAK  A[LOOP:6: B:219:0x05ad->B:228:0x05c3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x05c6 A[EDGE_INSN: B:314:0x05c6->B:229:0x05c6 BREAK  A[LOOP:6: B:219:0x05ad->B:228:0x05c3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x021f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0148  */
    /* JADX WARN: Code duplicated, block: B:64:0x014b  */
    /* JADX WARN: Code duplicated, block: B:66:0x014f  */
    /* JADX WARN: Code duplicated, block: B:69:0x015b A[LOOP:0: B:67:0x0155->B:69:0x015b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x016e A[LOOP:1: B:71:0x016c->B:72:0x016e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0190  */
    /* JADX WARN: Code duplicated, block: B:77:0x019c A[LOOP:3: B:76:0x019a->B:77:0x019c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x0206  */
    /* JADX WARN: Code duplicated, block: B:86:0x020c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0214 A[LOOP:13: B:85:0x020a->B:88:0x0214, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x0241 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0244  */
    /* JADX WARN: Code duplicated, block: B:97:0x0249 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x024b A[LOOP:14: B:96:0x0247->B:98:0x024b, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r24v14 */
    /* JADX WARN: Type inference failed for: r24v15 */
    /* JADX WARN: Type inference failed for: r24v16 */
    /* JADX WARN: Type inference failed for: r24v29 */
    /* JADX WARN: Type inference failed for: r24v30 */
    /* JADX WARN: Type inference failed for: r24v31 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [int[]] */
    /* JADX WARN: Type inference failed for: r29v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX INFO: renamed from: g */
    public static zzams m4197g(zzamp zzampVar, zzfz zzfzVar, zzagt zzagtVar) throws zzat {
        zzali zzalmVar;
        boolean z;
        int iM6382h;
        int iM6382h2;
        int iM6382h3;
        int i2;
        boolean z2;
        ArrayList arrayList;
        ?? r31;
        long[] jArr;
        int[] iArr;
        zzeu zzeuVar;
        long[] jArrCopyOf;
        int i3;
        ?? r3;
        zzali zzaliVar;
        int i4;
        int i5;
        zzeu zzeuVar2;
        int iM6382h4;
        long j2;
        long j3;
        long j4;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM6382h5;
        long[] jArr2;
        ?? CopyOf;
        long j5;
        int i10;
        int i11;
        int i12;
        int i13;
        long j6;
        int i14;
        long j7;
        long[] jArr3;
        ?? r29;
        long[] jArr4;
        String str;
        int i15;
        long j8;
        ?? r24;
        int i16;
        ?? r25;
        int iZzc;
        int iM6376b;
        int i17;
        boolean zM4190a;
        int[] iArr2;
        long j9;
        int i18;
        zzv zzvVar;
        zzhao zzhaoVar;
        long j10;
        long jM6521w;
        int[] iArrM7307d;
        zzhao zzhaoVar2;
        int i19;
        zzamp zzampVar2;
        long j11;
        int i20;
        long j12;
        zzamp zzampVar3;
        long[] jArr5;
        int[] iArr3;
        ?? r15;
        int i21;
        boolean z3;
        int[] iArr4;
        int[] iArr5;
        boolean z4;
        int i22;
        int i23;
        int i24;
        boolean z5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        ArrayList arrayList2;
        boolean z6;
        boolean z7;
        long[] jArr6;
        int[] iArr9;
        ?? r6;
        ArrayList arrayList3;
        long[] jArr7;
        int i25;
        int i26;
        boolean z8;
        long jM7303a;
        ?? r7;
        boolean z9;
        long jM7303a2;
        int i27;
        long[] jArr8;
        int i28;
        int[] iArr10;
        int i29;
        int i30;
        ?? r8;
        int i31;
        long jM6521w2;
        boolean z10;
        int[] iArr11;
        int[] iArr12;
        long jM7303a3;
        int[] iArr13;
        int i32;
        long jM6521w3;
        int iBinarySearch;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        boolean z11;
        boolean z12;
        long jM7303a4;
        int i39;
        long j13;
        long jM6521w4;
        int i40;
        long[] jArr9;
        int[] iArr14;
        long j14;
        int i41;
        int i42;
        int i43;
        long[] jArr10;
        int[] iArr15;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        long j15;
        int i49;
        zzamp zzampVar4 = zzampVar;
        zzv zzvVar2 = zzampVar4.f6002g;
        zzga zzgaVarM6800b = zzfzVar.m6800b(1937011578);
        if (zzgaVarM6800b != null) {
            zzalmVar = new zzall(zzgaVarM6800b, zzvVar2);
        } else {
            zzga zzgaVarM6800b2 = zzfzVar.m6800b(1937013298);
            if (zzgaVarM6800b2 == null) {
                throw zzat.m4383a(null, "Track has no sample table size information");
            }
            zzalmVar = new zzalm(zzgaVarM6800b2);
        }
        int iZza = zzalmVar.zza();
        if (iZza == 0) {
            return new zzams(zzampVar4, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
        }
        if (zzampVar4.f5997b == 2) {
            long j16 = zzampVar4.f6001f;
            if (j16 > 0) {
                zzvVar2.getClass();
                zzt zztVar = new zzt(zzvVar2);
                float f2 = iZza / (j16 / 1000000.0f);
                zzgtr.m7128a(f2 == -1.0f || f2 > 0.0f);
                zztVar.f20813y = f2;
                zzv zzvVar3 = new zzv(zztVar);
                zzamo zzamoVar = new zzamo(zzampVar4);
                zzamoVar.f5988g = zzvVar3;
                zzampVar4 = new zzamp(zzamoVar);
            }
        }
        zzga zzgaVarM6800b3 = zzfzVar.m6800b(1937007471);
        if (zzgaVarM6800b3 == null) {
            zzgaVarM6800b3 = zzfzVar.m6800b(1668232756);
            zzgaVarM6800b3.getClass();
            z = true;
        } else {
            z = false;
        }
        zzga zzgaVarM6800b4 = zzfzVar.m6800b(1937011555);
        zzgaVarM6800b4.getClass();
        zzeu zzeuVar3 = zzgaVarM6800b4.f16879b;
        zzga zzgaVarM6800b5 = zzfzVar.m6800b(1937011827);
        zzgaVarM6800b5.getClass();
        zzeu zzeuVar4 = zzgaVarM6800b5.f16879b;
        zzga zzgaVarM6800b6 = zzfzVar.m6800b(1937011571);
        zzeu zzeuVar5 = zzgaVarM6800b6 != null ? zzgaVarM6800b6.f16879b : null;
        zzga zzgaVarM6800b7 = zzfzVar.m6800b(1668576371);
        zzeu zzeuVar6 = zzgaVarM6800b7 != null ? zzgaVarM6800b7.f16879b : null;
        zzale zzaleVar = new zzale(zzeuVar3, zzgaVarM6800b3.f16879b, z);
        zzeuVar4.m6363E(12);
        int iM6382h6 = zzeuVar4.m6382h() - 1;
        int iM6382h7 = zzeuVar4.m6382h();
        int iM6382h8 = zzeuVar4.m6382h();
        if (zzeuVar6 != null) {
            zzeuVar6.m6363E(12);
            iM6382h = zzeuVar6.m6382h();
        } else {
            iM6382h = 0;
        }
        if (zzeuVar5 != null) {
            zzeuVar5.m6363E(12);
            iM6382h2 = zzeuVar5.m6382h();
            if (iM6382h2 > 0) {
                iM6382h3 = zzeuVar5.m6382h() - 1;
            } else {
                iM6382h3 = -1;
                zzeuVar5 = null;
            }
        } else {
            iM6382h2 = 0;
            iM6382h3 = -1;
        }
        int iZzb = zzalmVar.zzb();
        zzv zzvVar4 = zzampVar4.f6002g;
        if (iZzb != -1) {
            String str2 = zzvVar4.f21061o;
            i2 = 1;
            if (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && iM6382h6 == 0) {
                if (iM6382h == 0 && iM6382h2 == 0) {
                    z2 = true;
                    iM6382h6 = 0;
                } else {
                    iM6382h6 = 0;
                }
            }
            arrayList = new ArrayList();
            if (zzeuVar5 == null) {
                r31 = i2;
            } else {
                r31 = 0;
            }
            if (z2) {
                i40 = zzaleVar.f5796a;
                jArr9 = new long[i40];
                iArr14 = new int[i40];
                while (zzaleVar.m4190a()) {
                    int i50 = zzaleVar.f5797b;
                    jArr9[i50] = zzaleVar.f5799d;
                    iArr14[i50] = zzaleVar.f5798c;
                }
                j14 = iM6382h8;
                i41 = 8192 / iZzb;
                i43 = 0;
                for (i42 = 0; i42 < i40; i42++) {
                    int i51 = iArr14[i42];
                    String str3 = zzfm.f16091a;
                    i43 += ((i51 + i41) - 1) / i41;
                }
                jArr10 = new long[i43];
                iArr = new int[i43];
                jArr3 = new long[i43];
                iArr15 = new int[i43];
                i44 = 0;
                i45 = 0;
                i46 = 0;
                i47 = 0;
                i48 = 0;
                while (i44 < i40) {
                    int i52 = iArr14[i44];
                    j15 = jArr9[i44];
                    int i53 = i40;
                    i49 = i52;
                    while (i49 > 0) {
                        int iMin = Math.min(i41, i49);
                        jArr10[i48] = j15;
                        int i54 = i49;
                        int i55 = iZzb * iMin;
                        iArr[i48] = i55;
                        int i56 = i46 + i55;
                        int iMax = Math.max(i47, i55);
                        jArr3[i48] = ((long) i45) * j14;
                        iArr15[i48] = i2;
                        j15 += (long) iArr[i48];
                        i45 += iMin;
                        i48++;
                        i47 = iMax;
                        i49 = i54 - iMin;
                        i46 = i56;
                    }
                    i44++;
                    i40 = i53;
                }
                j7 = i46;
                j6 = ((long) i45) * j14;
                i13 = i47;
                jArr4 = jArr10;
                i14 = i43;
                r29 = iArr15;
            } else {
                jArr = new long[iZza];
                iArr = new int[iZza];
                zzeuVar = zzeuVar6;
                jArrCopyOf = new long[iZza];
                i3 = iM6382h2;
                r3 = new int[iZza];
                zzaliVar = zzalmVar;
                i4 = iM6382h6;
                i5 = iM6382h;
                zzeuVar2 = zzeuVar5;
                iM6382h4 = iM6382h3;
                j2 = 0;
                j3 = 0;
                j4 = 0;
                i6 = 0;
                i7 = 0;
                i8 = 0;
                i9 = 0;
                iM6382h5 = 0;
                while (true) {
                    if (i6 < iZza) {
                        zzampVar4 = zzampVar4;
                        jArr2 = jArr;
                        CopyOf = r3;
                        break;
                    }
                    j8 = j2;
                    r24 = i2;
                    while (true) {
                        if (i9 == 0) {
                            zzampVar4 = zzampVar4;
                            i16 = i9;
                            r25 = r24;
                            break;
                        }
                        zM4190a = zzaleVar.m4190a();
                        zzampVar4 = zzampVar4;
                        if (zM4190a) {
                            i16 = 0;
                            r25 = zM4190a;
                            break;
                        }
                        j8 = zzaleVar.f5799d;
                        i9 = zzaleVar.f5798c;
                        zzampVar4 = zzampVar4;
                        r24 = zM4190a;
                    }
                    if (r25 == 0) {
                        zzeh.m6211c("BoxParsers", "Unexpected end of chunk data");
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr, i6);
                        int[] iArrCopyOf = Arrays.copyOf(iArr, i6);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i6);
                        jArr2 = jArrCopyOf2;
                        iArr = iArrCopyOf;
                        iZza = i6;
                        CopyOf = Arrays.copyOf((int[]) r3, i6);
                        break;
                    }
                    if (zzeuVar != null) {
                        iM6376b = i7;
                        i17 = i5;
                        while (iM6382h5 == 0) {
                            if (i17 > 0) {
                                iM6382h5 = 0;
                                break;
                            }
                            i17--;
                            iM6382h5 = zzeuVar.m6382h();
                            iM6376b = zzeuVar.m6376b();
                        }
                        iM6382h5--;
                        i5 = i17;
                        i7 = iM6376b;
                    }
                    iZzc = zzaliVar.zzc();
                    long[] jArr11 = jArrCopyOf;
                    int i57 = i16;
                    long j17 = iZzc;
                    j4 += j17;
                    if (iZzc > i8) {
                        i8 = iZzc;
                    }
                    jArr[i6] = j8;
                    iArr[i6] = iZzc;
                    jArr11[i6] = j3 + ((long) i7);
                    r3[i6] = r31;
                    if (i6 == iM6382h4) {
                        r3[i6] = i2;
                        arrayList.add(Integer.valueOf(i6));
                    }
                    if (zzeuVar2 != null && i6 == iM6382h4 && (i3 = i3 - 1) > 0) {
                        iM6382h4 = zzeuVar2.m6382h() - 1;
                    }
                    j3 += (long) iM6382h8;
                    iM6382h7--;
                    if (iM6382h7 != 0) {
                        if (i4 > 0) {
                            i4--;
                            iM6382h7 = zzeuVar4.m6382h();
                            iM6382h8 = zzeuVar4.m6376b();
                        } else {
                            iM6382h7 = 0;
                        }
                    }
                    long j18 = j8 + j17;
                    i9 = i57 - 1;
                    i6++;
                    jArrCopyOf = jArr11;
                    zzampVar4 = zzampVar4;
                    j2 = j18;
                }
                j5 = j3 + ((long) i7);
                if (zzeuVar != null) {
                    i10 = i2;
                    break;
                }
                i15 = i5;
                while (true) {
                    if (i15 > 0) {
                        i10 = i2;
                        break;
                    }
                    if (zzeuVar.m6382h() != 0) {
                        i10 = 0;
                        break;
                    }
                    zzeuVar.m6376b();
                    i15--;
                }
                if (i3 == 0) {
                    i11 = iM6382h7;
                    i12 = i3;
                } else if (iM6382h7 == 0) {
                    if (i9 == 0) {
                        if (i4 == 0) {
                            jArrCopyOf = jArrCopyOf;
                            i10 = i10;
                            i4 = i4;
                            iM6382h5 = iM6382h5;
                            i12 = 0;
                            i11 = 0;
                            i9 = 0;
                        } else if (iM6382h5 == 0) {
                            jArrCopyOf = jArrCopyOf;
                            i10 = i10;
                            iM6382h5 = iM6382h5;
                            i12 = 0;
                            i11 = 0;
                            i9 = 0;
                            i4 = 0;
                        } else if (i10 == 0) {
                            jArrCopyOf = jArrCopyOf;
                            i10 = 0;
                            i12 = 0;
                            i11 = 0;
                            i9 = 0;
                            i4 = 0;
                            iM6382h5 = 0;
                        } else {
                            jArrCopyOf = jArrCopyOf;
                            j5 = j5;
                            zzampVar4 = zzampVar4;
                        }
                        int i58 = zzampVar4.f5996a;
                        int length = String.valueOf(i4).length() + String.valueOf(i9).length() + String.valueOf(i11).length() + String.valueOf(i12).length() + String.valueOf(i58).length() + 66 + 35 + 26 + 33 + 36;
                        int length2 = String.valueOf(iM6382h5).length();
                        if (i2 != i10) {
                            str = ", ctts invalid";
                        } else {
                            str = "";
                        }
                        StringBuilder sb = new StringBuilder(str.length() + length + length2);
                        AbstractC1456a.m2455v(sb, "Inconsistent stbl box for track ", i58, ": remainingSynchronizationSamples ", i12);
                        AbstractC1456a.m2455v(sb, ", remainingSamplesAtTimestampDelta ", i11, ", remainingSamplesInChunk ", i9);
                        AbstractC1456a.m2455v(sb, ", remainingTimestampDeltaChanges ", i4, ", remainingSamplesAtTimestampOffset ", iM6382h5);
                        sb.append(str);
                        zzeh.m6211c("BoxParsers", sb.toString());
                    } else {
                        i12 = 0;
                        i11 = 0;
                    }
                    i13 = i8;
                    j6 = j5;
                    i14 = iZza;
                    j7 = j4;
                    jArr3 = jArrCopyOf;
                    r29 = CopyOf;
                    jArr4 = jArr2;
                } else {
                    i11 = iM6382h7;
                    i12 = 0;
                }
                int i59 = zzampVar4.f5996a;
                int length3 = String.valueOf(i4).length() + String.valueOf(i9).length() + String.valueOf(i11).length() + String.valueOf(i12).length() + String.valueOf(i59).length() + 66 + 35 + 26 + 33 + 36;
                int length4 = String.valueOf(iM6382h5).length();
                if (i2 != i10) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                StringBuilder sb2 = new StringBuilder(str.length() + length3 + length4);
                AbstractC1456a.m2455v(sb2, "Inconsistent stbl box for track ", i59, ": remainingSynchronizationSamples ", i12);
                AbstractC1456a.m2455v(sb2, ", remainingSamplesAtTimestampDelta ", i11, ", remainingSamplesInChunk ", i9);
                AbstractC1456a.m2455v(sb2, ", remainingTimestampDeltaChanges ", i4, ", remainingSamplesAtTimestampOffset ", iM6382h5);
                sb2.append(str);
                zzeh.m6211c("BoxParsers", sb2.toString());
                i13 = i8;
                j6 = j5;
                i14 = iZza;
                j7 = j4;
                jArr3 = jArrCopyOf;
                r29 = CopyOf;
                jArr4 = jArr2;
            }
            iArr2 = iArr;
            j9 = zzampVar4.f6001f;
            if (j9 > 0) {
                jM6521w4 = zzfm.m6521w(j7 * 8, 1000000L, j9, RoundingMode.HALF_DOWN);
                if (jM6521w4 > 0 && jM6521w4 < 2147483647L) {
                    zzvVar4.getClass();
                    zzt zztVar2 = new zzt(zzvVar4);
                    zztVar2.f20796h = (int) jM6521w4;
                    zzv zzvVar5 = new zzv(zztVar2);
                    zzamo zzamoVar2 = new zzamo(zzampVar4);
                    zzamoVar2.f5988g = zzvVar5;
                    zzampVar4 = new zzamp(zzamoVar2);
                }
            }
            i18 = zzampVar4.f5997b;
            zzvVar = zzampVar4.f6002g;
            zzhaoVar = zzampVar4.f6005j;
            j10 = zzampVar4.f5998c;
            RoundingMode roundingMode = RoundingMode.DOWN;
            jM6521w = zzfm.m6521w(j6, 1000000L, j10, roundingMode);
            iArrM7307d = zzhaq.m7307d(arrayList);
            zzhaoVar2 = zzampVar4.f6004i;
            if (zzhaoVar2 == null) {
                zzfm.m6522x(jArr3, j10);
                return new zzams(zzampVar4, jArr4, iArr2, i13, jArr3, r29, iArrM7307d, r31, jM6521w, i14);
            }
            i19 = zzhaoVar2.f18432t;
            if (i19 == 1 || i18 != 1) {
                zzampVar2 = zzampVar4;
                j11 = j6;
                i20 = 1;
            } else {
                int length5 = jArr3.length;
                if (length5 >= 2) {
                    zzhaoVar.getClass();
                    long jM7303a5 = zzhaoVar.m7303a(0);
                    long jM7303a6 = zzhaoVar2.m7303a(0);
                    long j19 = zzampVar4.f5999d;
                    long jM6521w5 = jM7303a5 + zzfm.m6521w(jM7303a6, j10, j19, roundingMode);
                    int i60 = length5 - 1;
                    zzampVar2 = zzampVar4;
                    j11 = j6;
                    int iMax2 = Math.max(0, Math.min(4, i60));
                    int iMax3 = Math.max(0, Math.min(length5 - 4, i60));
                    if (jArr3[0] > jM7303a5 || jM7303a5 >= jArr3[iMax2] || jArr3[iMax3] >= jM6521w5 || jM6521w5 > j11 + 2) {
                        j10 = j10;
                    } else {
                        long jMax = Math.max(0L, j11 - jM6521w5);
                        long j20 = jM7303a5 - jArr3[0];
                        long j21 = zzvVar.f21039I;
                        long jM6521w6 = zzfm.m6521w(j20, j21, j10, roundingMode);
                        long jM6521w7 = zzfm.m6521w(jMax, j21, j10, roundingMode);
                        if (jM6521w6 != 0) {
                            j10 = j10;
                            j13 = jM6521w6;
                        } else if (jM6521w7 != 0) {
                            j10 = j10;
                            j13 = 0;
                        }
                        if (j13 <= 2147483647L && jM6521w7 <= 2147483647L) {
                            zzagtVar.f5268a = (int) j13;
                            zzagtVar.f5269b = (int) jM6521w7;
                            zzfm.m6522x(jArr3, j10);
                            return new zzams(zzampVar2, jArr4, iArr2, i13, jArr3, r29, iArrM7307d, r31, zzfm.m6521w(zzhaoVar2.m7303a(0), 1000000L, j19, roundingMode), i14);
                        }
                    }
                } else {
                    zzampVar2 = zzampVar4;
                    j11 = j6;
                }
                j10 = j10;
                i20 = 1;
            }
            if (i19 == i20) {
                if (zzhaoVar2.m7303a(0) == 0) {
                    zzhaoVar.getClass();
                    jM7303a4 = zzhaoVar.m7303a(0);
                    for (i39 = 0; i39 < jArr3.length; i39++) {
                        jArr3[i39] = zzfm.m6521w(jArr3[i39] - jM7303a4, 1000000L, j10, RoundingMode.DOWN);
                    }
                    return new zzams(zzampVar2, jArr4, iArr2, i13, jArr3, r29, iArrM7307d, r31, zzfm.m6521w(j11 - jM7303a4, 1000000L, j10, RoundingMode.DOWN), i14);
                }
                i20 = 1;
            }
            j12 = j10;
            zzampVar3 = zzampVar2;
            jArr5 = jArr4;
            iArr3 = iArr2;
            r15 = r29;
            i21 = i14;
            if (i18 == i20) {
                z3 = true;
            } else {
                z3 = false;
            }
            iArr4 = new int[i19];
            iArr5 = new int[i19];
            zzhaoVar.getClass();
            z4 = z3;
            i22 = 0;
            i23 = 0;
            i24 = 0;
            z5 = false;
            while (i23 < i19) {
                int[] iArr16 = iArr3;
                iArr12 = iArr4;
                jM7303a3 = zzhaoVar.m7303a(i23);
                if (jM7303a3 != -1) {
                    iArr13 = iArr5;
                    i32 = i23;
                    long j22 = j12;
                    j12 = j22;
                    jM6521w3 = zzfm.m6521w(zzhaoVar2.m7303a(i23), j22, zzampVar3.f5999d, RoundingMode.DOWN) + jM7303a3;
                    iArr12[i32] = zzfm.m6517s(jArr3, jM7303a3, true);
                    iBinarySearch = Arrays.binarySearch(jArr3, jM6521w3);
                    if (iBinarySearch < 0) {
                        iBinarySearch = ~iBinarySearch;
                    } else {
                        while (true) {
                            i33 = iBinarySearch + 1;
                            if (i33 >= jArr3.length || jArr3[i33] != jM6521w3) {
                                break;
                            }
                            iBinarySearch = i33;
                        }
                        if (!z4) {
                            iBinarySearch = i33;
                        }
                    }
                    i34 = iBinarySearch - 1;
                    i35 = 0;
                    while (true) {
                        i36 = i34;
                        if (iBinarySearch >= jArr3.length) {
                            break;
                        }
                        if (jArr3[iBinarySearch] < jM6521w3) {
                            i34 = iBinarySearch;
                        } else {
                            i35++;
                            if (i35 > zzvVar.f21063q) {
                                break;
                            }
                            i34 = i36;
                        }
                        iBinarySearch++;
                    }
                    iArr13[i32] = i36 + 1;
                    i37 = iArr12[i32];
                    while (true) {
                        i38 = iArr12[i32];
                        if (i38 > 0 || (r15[i38] & 1) != 0) {
                            break;
                            break;
                        }
                        iArr12[i32] = i38 - 1;
                    }
                    if (i38 == 0) {
                        z11 = false;
                        if ((r15[0] & 1) == 0) {
                            iArr12[i32] = i37;
                            while (true) {
                                i38 = iArr12[i32];
                                if (i38 >= iArr13[i32] || (r15[i38] & 1) != 0) {
                                    break;
                                }
                                iArr12[i32] = i38 + 1;
                            }
                        }
                    } else {
                        z11 = false;
                    }
                    int i61 = iArr13[i32];
                    int i62 = (i61 - i38) + i24;
                    if (i22 != i38) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    z5 |= z12;
                    i22 = i61;
                    i24 = i62;
                } else {
                    iArr13 = iArr5;
                    i32 = i23;
                }
                i23 = i32 + 1;
                arrayList = arrayList;
                iArr4 = iArr12;
                iArr5 = iArr13;
                iArr3 = iArr16;
            }
            iArr6 = iArr3;
            iArr7 = iArr4;
            iArr8 = iArr5;
            arrayList2 = arrayList;
            if (i24 != i21) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = z5 | z6;
            if (z7) {
                jArr6 = new long[i24];
            } else {
                jArr6 = jArr5;
            }
            if (z7) {
                iArr9 = new int[i24];
            } else {
                iArr9 = iArr6;
            }
            if (true == z7) {
                i13 = 0;
            }
            if (z7) {
                iArr11 = new int[i24];
            } else {
                r6 = r15;
            }
            if (z7) {
                r6 = iArr11;
                arrayList3 = new ArrayList();
            } else {
                r6 = iArr11;
                arrayList3 = arrayList2;
            }
            jArr7 = new long[i24];
            i25 = 0;
            i26 = 0;
            z8 = false;
            jM7303a = 0;
            r7 = r6;
            while (i26 < i19) {
                jM7303a2 = zzhaoVar.m7303a(i26);
                int i63 = i19;
                i27 = iArr7[i26];
                jArr8 = jArr7;
                i28 = iArr8[i26];
                if (z7) {
                    int i64 = i28 - i27;
                    System.arraycopy(jArr5, i27, jArr6, i25, i64);
                    iArr10 = iArr6;
                    System.arraycopy(iArr10, i27, iArr9, i25, i64);
                    System.arraycopy(r15, i27, r7, i25, i64);
                } else {
                    iArr10 = iArr6;
                }
                z8 = z8;
                i29 = i25;
                i30 = i13;
                r8 = r7;
                while (i27 < i28) {
                    i31 = i27;
                    ?? r210 = r8;
                    long j23 = zzampVar3.f5999d;
                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                    long jM6521w8 = zzfm.m6521w(jM7303a, 1000000L, j23, roundingMode2);
                    jM6521w2 = zzfm.m6521w(jArr3[i31] - jM7303a2, 1000000L, j12, roundingMode2);
                    if (jM6521w2 < 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    z8 = (!z10) | z8;
                    jArr8[i29] = jM6521w8 + jM6521w2;
                    if (z7 && iArr9[i29] > i30) {
                        i30 = iArr10[i31];
                    }
                    if (!z7 && r31 == 0 && (r210[i29] & 1) != 0) {
                        arrayList3.add(Integer.valueOf(i29));
                    }
                    i29++;
                    i27 = i31 + 1;
                    r8 = r210;
                }
                jM7303a = zzhaoVar2.m7303a(i26) + jM7303a;
                i26++;
                i13 = i30;
                iArr6 = iArr10;
                i19 = i63;
                jArr5 = jArr5;
                jArr7 = jArr8;
                r7 = r8;
                i25 = i29;
            }
            ?? r211 = r7;
            long[] jArr12 = jArr7;
            z9 = z8;
            long jM6521w9 = zzfm.m6521w(jM7303a, 1000000L, zzampVar3.f5999d, RoundingMode.DOWN);
            if (z9) {
                zzvVar.getClass();
                zzt zztVar3 = new zzt(zzvVar);
                zztVar3.f20808t = true;
                zzv zzvVar6 = new zzv(zztVar3);
                zzamo zzamoVar3 = new zzamo(zzampVar3);
                zzamoVar3.f5988g = zzvVar6;
                zzampVar3 = new zzamp(zzamoVar3);
            }
            return new zzams(zzampVar3, jArr6, iArr9, i13, jArr12, r211, zzhaq.m7307d(arrayList3), r31, jM6521w9, jArr6.length);
        }
        i2 = 1;
        z2 = false;
        arrayList = new ArrayList();
        if (zzeuVar5 == null) {
            r31 = i2;
        } else {
            r31 = 0;
        }
        if (z2) {
            i40 = zzaleVar.f5796a;
            jArr9 = new long[i40];
            iArr14 = new int[i40];
            while (zzaleVar.m4190a()) {
                int i510 = zzaleVar.f5797b;
                jArr9[i510] = zzaleVar.f5799d;
                iArr14[i510] = zzaleVar.f5798c;
            }
            j14 = iM6382h8;
            i41 = 8192 / iZzb;
            i43 = 0;
            while (i42 < i40) {
                int i511 = iArr14[i42];
                String str4 = zzfm.f16091a;
                i43 += ((i511 + i41) - 1) / i41;
            }
            jArr10 = new long[i43];
            iArr = new int[i43];
            jArr3 = new long[i43];
            iArr15 = new int[i43];
            i44 = 0;
            i45 = 0;
            i46 = 0;
            i47 = 0;
            i48 = 0;
            while (i44 < i40) {
                int i512 = iArr14[i44];
                j15 = jArr9[i44];
                int i513 = i40;
                i49 = i512;
                while (i49 > 0) {
                    int iMin2 = Math.min(i41, i49);
                    jArr10[i48] = j15;
                    int i514 = i49;
                    int i515 = iZzb * iMin2;
                    iArr[i48] = i515;
                    int i516 = i46 + i515;
                    int iMax4 = Math.max(i47, i515);
                    jArr3[i48] = ((long) i45) * j14;
                    iArr15[i48] = i2;
                    j15 += (long) iArr[i48];
                    i45 += iMin2;
                    i48++;
                    i47 = iMax4;
                    i49 = i514 - iMin2;
                    i46 = i516;
                }
                i44++;
                i40 = i513;
            }
            j7 = i46;
            j6 = ((long) i45) * j14;
            i13 = i47;
            jArr4 = jArr10;
            i14 = i43;
            r29 = iArr15;
        } else {
            jArr = new long[iZza];
            iArr = new int[iZza];
            zzeuVar = zzeuVar6;
            jArrCopyOf = new long[iZza];
            i3 = iM6382h2;
            r3 = new int[iZza];
            zzaliVar = zzalmVar;
            i4 = iM6382h6;
            i5 = iM6382h;
            zzeuVar2 = zzeuVar5;
            iM6382h4 = iM6382h3;
            j2 = 0;
            j3 = 0;
            j4 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = 0;
            iM6382h5 = 0;
            while (true) {
                if (i6 < iZza) {
                    zzampVar4 = zzampVar4;
                    jArr2 = jArr;
                    CopyOf = r3;
                    break;
                }
                j8 = j2;
                r24 = i2;
                while (true) {
                    if (i9 == 0) {
                        zzampVar4 = zzampVar4;
                        i16 = i9;
                        r25 = r24;
                        break;
                    }
                    zM4190a = zzaleVar.m4190a();
                    zzampVar4 = zzampVar4;
                    if (zM4190a) {
                        i16 = 0;
                        r25 = zM4190a;
                        break;
                    }
                    j8 = zzaleVar.f5799d;
                    i9 = zzaleVar.f5798c;
                    zzampVar4 = zzampVar4;
                    r24 = zM4190a;
                }
                if (r25 == 0) {
                    zzeh.m6211c("BoxParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf3 = Arrays.copyOf(jArr, i6);
                    int[] iArrCopyOf2 = Arrays.copyOf(iArr, i6);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i6);
                    jArr2 = jArrCopyOf3;
                    iArr = iArrCopyOf2;
                    iZza = i6;
                    CopyOf = Arrays.copyOf((int[]) r3, i6);
                    break;
                }
                if (zzeuVar != null) {
                    iM6376b = i7;
                    i17 = i5;
                    while (iM6382h5 == 0) {
                        if (i17 > 0) {
                            iM6382h5 = 0;
                            break;
                        }
                        i17--;
                        iM6382h5 = zzeuVar.m6382h();
                        iM6376b = zzeuVar.m6376b();
                    }
                    iM6382h5--;
                    i5 = i17;
                    i7 = iM6376b;
                }
                iZzc = zzaliVar.zzc();
                long[] jArr13 = jArrCopyOf;
                int i517 = i16;
                long j110 = iZzc;
                j4 += j110;
                if (iZzc > i8) {
                    i8 = iZzc;
                }
                jArr[i6] = j8;
                iArr[i6] = iZzc;
                jArr13[i6] = j3 + ((long) i7);
                r3[i6] = r31;
                if (i6 == iM6382h4) {
                    r3[i6] = i2;
                    arrayList.add(Integer.valueOf(i6));
                }
                if (zzeuVar2 != null) {
                    iM6382h4 = zzeuVar2.m6382h() - 1;
                }
                j3 += (long) iM6382h8;
                iM6382h7--;
                if (iM6382h7 != 0) {
                    if (i4 > 0) {
                        i4--;
                        iM6382h7 = zzeuVar4.m6382h();
                        iM6382h8 = zzeuVar4.m6376b();
                    } else {
                        iM6382h7 = 0;
                    }
                }
                long j111 = j8 + j110;
                i9 = i517 - 1;
                i6++;
                jArrCopyOf = jArr13;
                zzampVar4 = zzampVar4;
                j2 = j111;
            }
            j5 = j3 + ((long) i7);
            if (zzeuVar != null) {
                i10 = i2;
                break;
            }
            i15 = i5;
            while (true) {
                if (i15 > 0) {
                    i10 = i2;
                    break;
                }
                if (zzeuVar.m6382h() != 0) {
                    i10 = 0;
                    break;
                }
                zzeuVar.m6376b();
                i15--;
            }
            if (i3 == 0) {
                i11 = iM6382h7;
                i12 = i3;
            } else if (iM6382h7 == 0) {
                if (i9 == 0) {
                    if (i4 == 0) {
                        jArrCopyOf = jArrCopyOf;
                        i10 = i10;
                        i4 = i4;
                        iM6382h5 = iM6382h5;
                        i12 = 0;
                        i11 = 0;
                        i9 = 0;
                    } else if (iM6382h5 == 0) {
                        jArrCopyOf = jArrCopyOf;
                        i10 = i10;
                        iM6382h5 = iM6382h5;
                        i12 = 0;
                        i11 = 0;
                        i9 = 0;
                        i4 = 0;
                    } else if (i10 == 0) {
                        jArrCopyOf = jArrCopyOf;
                        i10 = 0;
                        i12 = 0;
                        i11 = 0;
                        i9 = 0;
                        i4 = 0;
                        iM6382h5 = 0;
                    } else {
                        jArrCopyOf = jArrCopyOf;
                        j5 = j5;
                        zzampVar4 = zzampVar4;
                    }
                    int i518 = zzampVar4.f5996a;
                    int length6 = String.valueOf(i4).length() + String.valueOf(i9).length() + String.valueOf(i11).length() + String.valueOf(i12).length() + String.valueOf(i518).length() + 66 + 35 + 26 + 33 + 36;
                    int length7 = String.valueOf(iM6382h5).length();
                    if (i2 != i10) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    StringBuilder sb3 = new StringBuilder(str.length() + length6 + length7);
                    AbstractC1456a.m2455v(sb3, "Inconsistent stbl box for track ", i518, ": remainingSynchronizationSamples ", i12);
                    AbstractC1456a.m2455v(sb3, ", remainingSamplesAtTimestampDelta ", i11, ", remainingSamplesInChunk ", i9);
                    AbstractC1456a.m2455v(sb3, ", remainingTimestampDeltaChanges ", i4, ", remainingSamplesAtTimestampOffset ", iM6382h5);
                    sb3.append(str);
                    zzeh.m6211c("BoxParsers", sb3.toString());
                } else {
                    i12 = 0;
                    i11 = 0;
                }
                i13 = i8;
                j6 = j5;
                i14 = iZza;
                j7 = j4;
                jArr3 = jArrCopyOf;
                r29 = CopyOf;
                jArr4 = jArr2;
            } else {
                i11 = iM6382h7;
                i12 = 0;
            }
            int i519 = zzampVar4.f5996a;
            int length8 = String.valueOf(i4).length() + String.valueOf(i9).length() + String.valueOf(i11).length() + String.valueOf(i12).length() + String.valueOf(i519).length() + 66 + 35 + 26 + 33 + 36;
            int length9 = String.valueOf(iM6382h5).length();
            if (i2 != i10) {
                str = ", ctts invalid";
            } else {
                str = "";
            }
            StringBuilder sb4 = new StringBuilder(str.length() + length8 + length9);
            AbstractC1456a.m2455v(sb4, "Inconsistent stbl box for track ", i519, ": remainingSynchronizationSamples ", i12);
            AbstractC1456a.m2455v(sb4, ", remainingSamplesAtTimestampDelta ", i11, ", remainingSamplesInChunk ", i9);
            AbstractC1456a.m2455v(sb4, ", remainingTimestampDeltaChanges ", i4, ", remainingSamplesAtTimestampOffset ", iM6382h5);
            sb4.append(str);
            zzeh.m6211c("BoxParsers", sb4.toString());
            i13 = i8;
            j6 = j5;
            i14 = iZza;
            j7 = j4;
            jArr3 = jArrCopyOf;
            r29 = CopyOf;
            jArr4 = jArr2;
        }
        iArr2 = iArr;
        j9 = zzampVar4.f6001f;
        if (j9 > 0) {
            jM6521w4 = zzfm.m6521w(j7 * 8, 1000000L, j9, RoundingMode.HALF_DOWN);
            if (jM6521w4 > 0) {
                zzvVar4.getClass();
                zzt zztVar4 = new zzt(zzvVar4);
                zztVar4.f20796h = (int) jM6521w4;
                zzv zzvVar7 = new zzv(zztVar4);
                zzamo zzamoVar4 = new zzamo(zzampVar4);
                zzamoVar4.f5988g = zzvVar7;
                zzampVar4 = new zzamp(zzamoVar4);
            }
        }
        i18 = zzampVar4.f5997b;
        zzvVar = zzampVar4.f6002g;
        zzhaoVar = zzampVar4.f6005j;
        j10 = zzampVar4.f5998c;
        RoundingMode roundingMode3 = RoundingMode.DOWN;
        jM6521w = zzfm.m6521w(j6, 1000000L, j10, roundingMode3);
        iArrM7307d = zzhaq.m7307d(arrayList);
        zzhaoVar2 = zzampVar4.f6004i;
        if (zzhaoVar2 == null) {
            zzfm.m6522x(jArr3, j10);
            return new zzams(zzampVar4, jArr4, iArr2, i13, jArr3, r29, iArrM7307d, r31, jM6521w, i14);
        }
        i19 = zzhaoVar2.f18432t;
        if (i19 == 1) {
            zzampVar2 = zzampVar4;
            j11 = j6;
            i20 = 1;
        } else {
            zzampVar2 = zzampVar4;
            j11 = j6;
            i20 = 1;
        }
        if (i19 == i20) {
            if (zzhaoVar2.m7303a(0) == 0) {
                zzhaoVar.getClass();
                jM7303a4 = zzhaoVar.m7303a(0);
                while (i39 < jArr3.length) {
                    jArr3[i39] = zzfm.m6521w(jArr3[i39] - jM7303a4, 1000000L, j10, RoundingMode.DOWN);
                }
                return new zzams(zzampVar2, jArr4, iArr2, i13, jArr3, r29, iArrM7307d, r31, zzfm.m6521w(j11 - jM7303a4, 1000000L, j10, RoundingMode.DOWN), i14);
            }
            i20 = 1;
        }
        j12 = j10;
        zzampVar3 = zzampVar2;
        jArr5 = jArr4;
        iArr3 = iArr2;
        r15 = r29;
        i21 = i14;
        if (i18 == i20) {
            z3 = true;
        } else {
            z3 = false;
        }
        iArr4 = new int[i19];
        iArr5 = new int[i19];
        zzhaoVar.getClass();
        z4 = z3;
        i22 = 0;
        i23 = 0;
        i24 = 0;
        z5 = false;
        while (i23 < i19) {
            int[] iArr17 = iArr3;
            iArr12 = iArr4;
            jM7303a3 = zzhaoVar.m7303a(i23);
            if (jM7303a3 != -1) {
                iArr13 = iArr5;
                i32 = i23;
                long j24 = j12;
                j12 = j24;
                jM6521w3 = zzfm.m6521w(zzhaoVar2.m7303a(i23), j24, zzampVar3.f5999d, RoundingMode.DOWN) + jM7303a3;
                iArr12[i32] = zzfm.m6517s(jArr3, jM7303a3, true);
                iBinarySearch = Arrays.binarySearch(jArr3, jM6521w3);
                if (iBinarySearch < 0) {
                    iBinarySearch = ~iBinarySearch;
                } else {
                    while (true) {
                        i33 = iBinarySearch + 1;
                        if (i33 >= jArr3.length) {
                            break;
                        }
                        break;
                        break;
                        iBinarySearch = i33;
                    }
                    if (!z4) {
                        iBinarySearch = i33;
                    }
                }
                i34 = iBinarySearch - 1;
                i35 = 0;
                while (true) {
                    i36 = i34;
                    if (iBinarySearch >= jArr3.length) {
                        break;
                        break;
                    }
                    if (jArr3[iBinarySearch] < jM6521w3) {
                        i34 = iBinarySearch;
                    } else {
                        i35++;
                        if (i35 > zzvVar.f21063q) {
                            break;
                            break;
                        }
                        i34 = i36;
                    }
                    iBinarySearch++;
                }
                iArr13[i32] = i36 + 1;
                i37 = iArr12[i32];
                while (true) {
                    i38 = iArr12[i32];
                    if (i38 > 0) {
                        break;
                    }
                    iArr12[i32] = i38 - 1;
                }
                if (i38 == 0) {
                    z11 = false;
                    if ((r15[0] & 1) == 0) {
                        iArr12[i32] = i37;
                        while (true) {
                            i38 = iArr12[i32];
                            if (i38 >= iArr13[i32]) {
                                break;
                            }
                            break;
                            break;
                            iArr12[i32] = i38 + 1;
                        }
                    }
                } else {
                    z11 = false;
                }
                int i65 = iArr13[i32];
                int i66 = (i65 - i38) + i24;
                if (i22 != i38) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                z5 |= z12;
                i22 = i65;
                i24 = i66;
            } else {
                iArr13 = iArr5;
                i32 = i23;
            }
            i23 = i32 + 1;
            arrayList = arrayList;
            iArr4 = iArr12;
            iArr5 = iArr13;
            iArr3 = iArr17;
        }
        iArr6 = iArr3;
        iArr7 = iArr4;
        iArr8 = iArr5;
        arrayList2 = arrayList;
        if (i24 != i21) {
            z6 = true;
        } else {
            z6 = false;
        }
        z7 = z5 | z6;
        if (z7) {
            jArr6 = new long[i24];
        } else {
            jArr6 = jArr5;
        }
        if (z7) {
            iArr9 = new int[i24];
        } else {
            iArr9 = iArr6;
        }
        if (true == z7) {
            i13 = 0;
        }
        if (z7) {
            iArr11 = new int[i24];
        } else {
            r6 = r15;
        }
        if (z7) {
            r6 = iArr11;
            arrayList3 = new ArrayList();
        } else {
            r6 = iArr11;
            arrayList3 = arrayList2;
        }
        jArr7 = new long[i24];
        i25 = 0;
        i26 = 0;
        z8 = false;
        jM7303a = 0;
        r7 = r6;
        while (i26 < i19) {
            jM7303a2 = zzhaoVar.m7303a(i26);
            int i67 = i19;
            i27 = iArr7[i26];
            jArr8 = jArr7;
            i28 = iArr8[i26];
            if (z7) {
                int i68 = i28 - i27;
                System.arraycopy(jArr5, i27, jArr6, i25, i68);
                iArr10 = iArr6;
                System.arraycopy(iArr10, i27, iArr9, i25, i68);
                System.arraycopy(r15, i27, r7, i25, i68);
            } else {
                iArr10 = iArr6;
            }
            z8 = z8;
            i29 = i25;
            i30 = i13;
            r8 = r7;
            while (i27 < i28) {
                i31 = i27;
                ?? r212 = r8;
                long j25 = zzampVar3.f5999d;
                RoundingMode roundingMode4 = RoundingMode.DOWN;
                long jM6521w10 = zzfm.m6521w(jM7303a, 1000000L, j25, roundingMode4);
                jM6521w2 = zzfm.m6521w(jArr3[i31] - jM7303a2, 1000000L, j12, roundingMode4);
                if (jM6521w2 < 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                z8 = (!z10) | z8;
                jArr8[i29] = jM6521w10 + jM6521w2;
                if (z7) {
                    i30 = iArr10[i31];
                }
                if (!z7) {
                }
                i29++;
                i27 = i31 + 1;
                r8 = r212;
            }
            jM7303a = zzhaoVar2.m7303a(i26) + jM7303a;
            i26++;
            i13 = i30;
            iArr6 = iArr10;
            i19 = i67;
            jArr5 = jArr5;
            jArr7 = jArr8;
            r7 = r8;
            i25 = i29;
        }
        ?? r213 = r7;
        long[] jArr14 = jArr7;
        z9 = z8;
        long jM6521w11 = zzfm.m6521w(jM7303a, 1000000L, zzampVar3.f5999d, RoundingMode.DOWN);
        if (z9) {
            zzvVar.getClass();
            zzt zztVar5 = new zzt(zzvVar);
            zztVar5.f20808t = true;
            zzv zzvVar8 = new zzv(zztVar5);
            zzamo zzamoVar5 = new zzamo(zzampVar3);
            zzamoVar5.f5988g = zzvVar8;
            zzampVar3 = new zzamp(zzamoVar5);
        }
        return new zzams(zzampVar3, jArr6, iArr9, i13, jArr14, r213, zzhaq.m7307d(arrayList3), r31, jM6521w11, jArr6.length);
    }

    /* JADX INFO: renamed from: h */
    public static Pair m4198h(zzfz zzfzVar) {
        zzga zzgaVarM6800b = zzfzVar.m6800b(1701606260);
        if (zzgaVarM6800b == null) {
            return null;
        }
        zzeu zzeuVar = zzgaVarM6800b.f16879b;
        zzeuVar.m6363E(8);
        int iM4191a = m4191a(zzeuVar.m6376b());
        int iM6382h = zzeuVar.m6382h();
        zzhan zzhanVar = new zzhan();
        zzhanVar.f18429b = 0;
        zzhanVar.f18428a = new long[iM6382h];
        zzhan zzhanVar2 = new zzhan();
        zzhanVar2.f18429b = 0;
        zzhanVar2.f18428a = new long[iM6382h];
        for (int i2 = 0; i2 < iM6382h; i2++) {
            zzhanVar.m7302a(iM4191a == 1 ? zzeuVar.m6384j() : zzeuVar.m6374P());
            zzhanVar2.m7302a(iM4191a == 1 ? zzeuVar.m6378d() : zzeuVar.m6376b());
            if (zzeuVar.m6372N() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzeuVar.m6365G(2);
        }
        int i3 = zzhanVar.f18429b;
        zzhao zzhaoVar = zzhao.f18430u;
        zzhao zzhaoVar2 = i3 == 0 ? zzhaoVar : new zzhao(zzhanVar.f18428a, i3);
        int i4 = zzhanVar2.f18429b;
        if (i4 != 0) {
            zzhaoVar = new zzhao(zzhanVar2.f18428a, i4);
        }
        return Pair.create(zzhaoVar2, zzhaoVar);
    }

    /* JADX WARN: Code duplicated, block: B:202:0x0449  */
    /* JADX WARN: Code duplicated, block: B:254:0x059f A[PHI: r4
  0x059f: PHI (r4v66 int) = (r4v53 int), (r4v49 int) binds: [B:354:0x06cb, B:252:0x059b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:296:0x061b  */
    /* JADX WARN: Code duplicated, block: B:358:0x06d6 A[LOOP:5: B:357:0x06d4->B:358:0x06d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:376:0x0728  */
    /* JADX WARN: Code duplicated, block: B:417:0x07d4 A[PHI: r33
  0x07d4: PHI (r33v16 int) = (r33v14 int), (r33v13 int) binds: [B:422:0x07df, B:415:0x07d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0144  */
    /* JADX INFO: renamed from: i */
    public static void m4199i(zzeu zzeuVar, int i2, int i3, int i4, int i5, String str, boolean z, zzq zzqVar, zzalk zzalkVar, int i6) throws zzat {
        int iM6370L;
        int iM6376b;
        int iRound;
        int iM6382h;
        int iM6501c;
        String str2;
        String str3;
        String str4;
        int i7;
        int i8;
        zzgwt zzgwtVarM7216n;
        String str5;
        zzalf zzalfVar;
        int i9;
        String str6;
        int i10;
        int i11;
        int i12;
        int i13;
        int iM6345h;
        int i14;
        boolean z2;
        boolean z3;
        int iM6345h2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z4;
        int iM6345h3;
        int i20;
        String str7;
        zzeu zzeuVar2 = zzeuVar;
        int i21 = i2;
        int i22 = i4;
        zzq zzqVarM8828a = zzqVar;
        zzeuVar2.m6363E(i3 + 16);
        if (z) {
            iM6370L = zzeuVar2.m6370L();
            zzeuVar2.m6365G(6);
        } else {
            zzeuVar2.m6365G(8);
            iM6370L = 0;
        }
        int i23 = 2;
        if (iM6370L == 0 || iM6370L == 1) {
            int iM6370L2 = zzeuVar2.m6370L();
            zzeuVar2.m6365G(6);
            int iM6380f = zzeuVar2.m6380f();
            zzeuVar2.m6363E(zzeuVar2.f14888b - 4);
            iM6376b = zzeuVar2.m6376b();
            if (iM6370L == 1) {
                zzeuVar2.m6365G(16);
            }
            iRound = iM6380f;
            iM6382h = iM6370L2;
            iM6501c = -1;
        } else {
            if (iM6370L != 2) {
                return;
            }
            zzeuVar2.m6365G(16);
            iRound = (int) Math.round(Double.longBitsToDouble(zzeuVar2.m6378d()));
            iM6382h = zzeuVar2.m6382h();
            zzeuVar2.m6365G(4);
            int iM6382h2 = zzeuVar2.m6382h();
            int iM6382h3 = zzeuVar2.m6382h();
            int i24 = iM6382h3 & 1;
            int i25 = iM6382h3 & 2;
            iM6501c = i24 != 0 ? zzfm.m6501c(iM6382h2, i25 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN) : zzfm.m6500b(iM6382h2, i25 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            if (iM6501c == 0) {
                iM6501c = -1;
            }
            zzeuVar2.m6365G(8);
            iM6376b = 0;
        }
        if (i21 == 1767992678) {
            iRound = -1;
            iM6382h = -1;
        } else {
            if (i21 == 1935764850) {
                iRound = 8000;
            } else if (i21 == 1935767394) {
                iRound = 16000;
                i21 = 1935767394;
            }
            iM6382h = 1;
        }
        int i26 = zzeuVar2.f14888b;
        int iIntValue = 1701733217;
        if (i21 == 1701733217) {
            Pair pairM4201k = m4201k(zzeuVar2, i3, i22);
            if (pairM4201k != null) {
                iIntValue = ((Integer) pairM4201k.first).intValue();
                zzqVarM8828a = zzqVarM8828a == null ? null : zzqVarM8828a.m8828a(((zzamq) pairM4201k.second).f6011b);
                zzalkVar.f5815a[i6] = (zzamq) pairM4201k.second;
            }
            i21 = iIntValue;
            zzeuVar2.m6363E(i26);
        }
        String str8 = "audio/mhm1";
        String str9 = "audio/ac3";
        if (i21 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i21 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i21 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i21 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i21 == 1685353320 || i21 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i21 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i21 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i21 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (i21 == 1935767394) {
            str2 = "audio/amr-wb";
        } else if (i21 != 1936684916) {
            if (i21 == 1953984371) {
                iM6501c = 268435456;
            } else if (i21 == 1819304813) {
                if (iM6501c == -1) {
                    iM6501c = i23;
                }
            } else if (i21 == 778924082 || i21 == 778924083) {
                str2 = "audio/mpeg";
            } else if (i21 == 1835557169) {
                str2 = "audio/mha1";
            } else if (i21 == 1835560241) {
                str2 = "audio/mhm1";
            } else if (i21 == 1634492771) {
                str2 = "audio/alac";
            } else if (i21 == 1634492791) {
                str2 = "audio/g711-alaw";
            } else if (i21 == 1970037111) {
                str2 = "audio/g711-mlaw";
            } else if (i21 == 1332770163) {
                str2 = "audio/opus";
            } else if (i21 == 1716281667) {
                str2 = "audio/flac";
            } else if (i21 == 1835823201) {
                str2 = "audio/true-hd";
            } else if (i21 == 1767992678) {
                str2 = "audio/iamf";
                i21 = 1767992678;
            } else {
                str2 = null;
            }
            str2 = "audio/raw";
        } else {
            iM6501c = i23;
            str2 = "audio/raw";
        }
        int i27 = iRound;
        int iM6500b = iM6501c;
        List listM7217q = null;
        String str10 = null;
        zzalf zzalfVar2 = null;
        zzald zzaldVar = null;
        while (i26 - i3 < i22) {
            zzeuVar2.m6363E(i26);
            int iM6376b2 = zzeuVar2.m6376b();
            iM6382h = iM6382h;
            zzage.m4111a("childAtomSize must be positive", iM6376b2 > 0);
            int iM6376b3 = zzeuVar2.m6376b();
            if (iM6376b3 == 1835557187) {
                zzeuVar2.m6363E(i26 + 8);
                zzeuVar2.m6365G(1);
                int iM6369K = zzeuVar2.m6369K();
                zzeuVar2.m6365G(1);
                String str11 = Objects.equals(str2, str8) ? String.format("mhm1.%02X", Integer.valueOf(iM6369K)) : String.format("mha1.%02X", Integer.valueOf(iM6369K));
                int iM6370L3 = zzeuVar2.m6370L();
                byte[] bArr = new byte[iM6370L3];
                str10 = str11;
                zzeuVar2.m6366H(bArr, 0, iM6370L3);
                if (listM7217q == null) {
                    listM7217q = zzgwt.m7216n(bArr);
                    iM6382h = iM6382h;
                    i21 = i21;
                    str9 = str9;
                    str2 = str2;
                    str3 = str8;
                    iM6376b2 = iM6376b2;
                    i26 = i26;
                    zzeuVar2 = zzeuVar2;
                } else {
                    listM7217q = zzgwt.m7217q(bArr, (byte[]) listM7217q.get(0));
                    i21 = i21;
                    str9 = str9;
                    str2 = str2;
                    str3 = str8;
                    iM6376b2 = iM6376b2;
                    i26 = i26;
                    zzeuVar2 = zzeuVar2;
                }
            } else if (iM6376b3 == 1835557200) {
                zzeuVar2.m6363E(i26 + 8);
                int iM6369K2 = zzeuVar2.m6369K();
                if (iM6369K2 > 0) {
                    byte[] bArr2 = new byte[iM6369K2];
                    zzeuVar2.m6366H(bArr2, 0, iM6369K2);
                    if (listM7217q == null) {
                        listM7217q = zzgwt.m7216n(bArr2);
                        str3 = str8;
                        iM6376b2 = iM6376b2;
                        zzeuVar2 = zzeuVar2;
                    } else {
                        listM7217q = zzgwt.m7217q((byte[]) listM7217q.get(0), bArr2);
                        i21 = i21;
                        str9 = str9;
                        str2 = str2;
                        str3 = str8;
                        iM6376b2 = iM6376b2;
                        i26 = i26;
                        zzeuVar2 = zzeuVar2;
                    }
                } else {
                    iM6382h = iM6382h;
                    i21 = i21;
                    str9 = str9;
                    str4 = str2;
                    str3 = str8;
                    iM6376b2 = iM6376b2;
                    listM7217q = listM7217q;
                    i26 = i26;
                    i27 = i27;
                    zzeuVar2 = zzeuVar2;
                    str2 = str4;
                    i27 = i27;
                    listM7217q = listM7217q;
                }
            } else {
                str3 = str8;
                if (iM6376b3 == 1702061171) {
                    String str12 = str2;
                    i21 = i21;
                    str4 = str12;
                    iM6382h = iM6382h;
                    zzeuVar2 = zzeuVar2;
                    str9 = str9;
                    iM6376b2 = iM6376b2;
                    listM7217q = listM7217q;
                    i26 = i26;
                    i27 = i27;
                    i7 = i26;
                    i8 = -1;
                } else if (z && iM6376b3 == 2002876005) {
                    int i28 = zzeuVar2.f14888b;
                    zzage.m4111a(null, i28 >= i26);
                    while (true) {
                        if (i28 - i26 < iM6376b2) {
                            zzeuVar2.m6363E(i28);
                            int iM6376b4 = zzeuVar2.m6376b();
                            zzage.m4111a("childAtomSize must be positive", iM6376b4 > 0);
                            int i29 = i28;
                            if (zzeuVar2.m6376b() != 1702061171) {
                                i28 = i29 + iM6376b4;
                            } else {
                                str4 = str2;
                                i7 = i29;
                            }
                        } else {
                            str4 = str2;
                            i7 = -1;
                        }
                    }
                    i8 = -1;
                } else if (iM6376b3 == 1651798644) {
                    zzeuVar2.m6363E(i26 + 8);
                    zzeuVar2.m6365G(4);
                    iM6376b2 = iM6376b2;
                    zzaldVar = new zzald(zzeuVar2.m6374P(), zzeuVar2.m6374P());
                    listM7217q = listM7217q;
                    zzeuVar2 = zzeuVar2;
                } else {
                    iM6376b2 = iM6376b2;
                    List list = listM7217q;
                    int[] iArr = zzafa.f5144d;
                    int[] iArr2 = zzafa.f5142b;
                    if (iM6376b3 == 1684103987) {
                        zzeuVar2.m6363E(i26 + 8);
                        String string = Integer.toString(i5);
                        zzet zzetVar = new zzet();
                        zzetVar.m6338a(zzeuVar2);
                        int i30 = iArr2[zzetVar.m6345h(i23)];
                        zzetVar.m6343f(8);
                        int i31 = iArr[zzetVar.m6345h(3)];
                        if (zzetVar.m6345h(1) != 0) {
                            i31++;
                        }
                        int i32 = zzafa.f5145e[zzetVar.m6345h(5)] * 1000;
                        zzetVar.m6348k();
                        zzeuVar2.m6363E(zzetVar.m6340c());
                        zzt zztVar = new zzt();
                        zztVar.f20789a = string;
                        zztVar.m8853e(str9);
                        zztVar.f20780F = i31;
                        zztVar.f20782H = i30;
                        zztVar.f20806r = zzqVarM8828a;
                        zztVar.f20792d = str;
                        zztVar.f20796h = i32;
                        zztVar.f20797i = i32;
                        zzalkVar.f5816b = new zzv(zztVar);
                        zzeuVar2 = zzeuVar2;
                        i21 = i21;
                        str9 = str9;
                        str4 = str2;
                        listM7217q = list;
                        i26 = i26;
                        i27 = i27;
                        iM6382h = iM6382h;
                    } else if (iM6376b3 == 1684366131) {
                        zzeuVar2.m6363E(i26 + 8);
                        String string2 = Integer.toString(i5);
                        zzet zzetVar2 = new zzet();
                        zzetVar2.m6338a(zzeuVar2);
                        int iM6345h4 = zzetVar2.m6345h(13) * 1000;
                        str9 = str9;
                        zzetVar2.m6343f(3);
                        int i33 = iArr2[zzetVar2.m6345h(2)];
                        zzetVar2.m6343f(10);
                        int i34 = iArr[zzetVar2.m6345h(3)];
                        if (zzetVar2.m6345h(1) != 0) {
                            i34++;
                        }
                        zzetVar2.m6343f(3);
                        int iM6345h5 = zzetVar2.m6345h(4);
                        zzetVar2.m6343f(1);
                        int i35 = i34;
                        if (iM6345h5 > 0) {
                            zzetVar2.m6343f(6);
                            i34 = zzetVar2.m6345h(1) != 0 ? i35 + 2 : i35;
                            zzetVar2.m6343f(1);
                        }
                        listM7217q = list;
                        if (zzetVar2.m6339b() > 7) {
                            zzetVar2.m6343f(7);
                            if (zzetVar2.m6345h(1) != 0) {
                                str7 = "audio/eac3-joc";
                            } else {
                                str7 = "audio/eac3";
                            }
                        } else {
                            str7 = "audio/eac3";
                        }
                        zzetVar2.m6348k();
                        zzeuVar2.m6363E(zzetVar2.m6340c());
                        zzt zztVar2 = new zzt();
                        zztVar2.f20789a = string2;
                        zztVar2.m8853e(str7);
                        zztVar2.f20780F = i34;
                        zztVar2.f20782H = i33;
                        zztVar2.f20806r = zzqVarM8828a;
                        zztVar2.f20792d = str;
                        zztVar2.f20797i = iM6345h4;
                        zzalkVar.f5816b = new zzv(zztVar2);
                        zzeuVar2 = zzeuVar2;
                        i21 = i21;
                        str4 = str2;
                    } else {
                        str9 = str9;
                        listM7217q = list;
                        if (iM6376b3 == 1684103988) {
                            zzeuVar2.m6363E(i26 + 8);
                            String string3 = Integer.toString(i5);
                            zzet zzetVar3 = new zzet();
                            zzetVar3.m6338a(zzeuVar2);
                            int iM6339b = zzetVar3.m6339b();
                            int iM6345h6 = zzetVar3.m6345h(3);
                            if (iM6345h6 > 1) {
                                StringBuilder sb = new StringBuilder(String.valueOf(iM6345h6).length() + 30);
                                sb.append("Unsupported AC-4 DSI version: ");
                                sb.append(iM6345h6);
                                throw zzat.m4384b(sb.toString());
                            }
                            int iM6345h7 = zzetVar3.m6345h(7);
                            int i36 = true != zzetVar3.m6344g() ? 44100 : 48000;
                            zzetVar3.m6343f(4);
                            int iM6345h8 = zzetVar3.m6345h(9);
                            if (iM6345h7 > 1) {
                                if (iM6345h6 == 0) {
                                    throw zzat.m4384b("Invalid AC-4 DSI version: 0");
                                }
                                if (zzetVar3.m6344g()) {
                                    zzetVar3.m6343f(16);
                                    if (zzetVar3.m6344g()) {
                                        zzetVar3.m6343f(128);
                                    }
                                }
                            }
                            if (iM6345h6 == 1) {
                                if (zzetVar3.m6339b() < 66) {
                                    throw zzat.m4384b("Invalid AC-4 DSI bitrate.");
                                }
                                zzetVar3.m6343f(66);
                                zzetVar3.m6348k();
                            }
                            zzafb zzafbVar = new zzafb();
                            zzafbVar.f5147a = true;
                            zzafbVar.f5148b = -1;
                            zzafbVar.f5149c = -1;
                            zzafbVar.f5150d = true;
                            zzafbVar.f5151e = 2;
                            zzafbVar.f5152f = 1;
                            zzafbVar.f5153g = 0;
                            int i37 = 0;
                            while (true) {
                                if (i37 < iM6345h8) {
                                    if (iM6345h6 == 0) {
                                        boolean zM6344g = zzetVar3.m6344g();
                                        i21 = i21;
                                        str6 = str2;
                                        iM6345h = zzetVar3.m6345h(5);
                                        i14 = 0;
                                        z2 = false;
                                        z3 = zM6344g;
                                        iM6345h2 = zzetVar3.m6345h(5);
                                        i15 = 0;
                                    } else {
                                        int i38 = iM6345h8;
                                        iM6345h2 = zzetVar3.m6345h(8);
                                        str6 = str2;
                                        int iM6345h9 = zzetVar3.m6345h(8);
                                        i21 = i21;
                                        int iM6345h10 = iM6345h9 == 255 ? zzetVar3.m6345h(16) + 255 : iM6345h9;
                                        if (iM6345h2 > 2) {
                                            zzetVar3.m6343f(iM6345h10 * 8);
                                            i37++;
                                            iM6345h8 = i38;
                                            str2 = str6;
                                            i21 = i21;
                                        } else {
                                            int iM6339b2 = (iM6339b - zzetVar3.m6339b()) / 8;
                                            int i39 = iM6345h10;
                                            int iM6345h11 = zzetVar3.m6345h(5);
                                            z2 = iM6345h11 == 31;
                                            i15 = iM6339b2;
                                            z3 = false;
                                            iM6345h = iM6345h11;
                                            i14 = i39;
                                        }
                                    }
                                    zzafbVar.f5152f = iM6345h2;
                                    boolean z5 = z2;
                                    if (z3 || z5 || iM6345h != 6) {
                                        zzafbVar.f5153g = zzetVar3.m6345h(3);
                                        if (zzetVar3.m6344g()) {
                                            zzetVar3.m6343f(5);
                                        }
                                        zzetVar3.m6343f(2);
                                        if (iM6345h6 == 1) {
                                            if (iM6345h2 == 1) {
                                                zzetVar3.m6343f(2);
                                            } else if (iM6345h2 == 2) {
                                                iM6345h2 = 2;
                                                zzetVar3.m6343f(2);
                                            }
                                        }
                                        zzetVar3.m6343f(5);
                                        zzetVar3.m6343f(10);
                                        if (iM6345h6 == 1) {
                                            if (iM6345h2 > 0) {
                                                zzafbVar.f5147a = zzetVar3.m6344g();
                                            }
                                            if (zzafbVar.f5147a) {
                                                if (iM6345h2 != 1) {
                                                    if (iM6345h2 == 2) {
                                                        i19 = 2;
                                                    } else {
                                                        i17 = iM6345h2;
                                                    }
                                                    zzetVar3.m6343f(24);
                                                    i16 = 1;
                                                } else {
                                                    i19 = 1;
                                                }
                                                int iM6345h12 = zzetVar3.m6345h(5);
                                                if (iM6345h12 >= 0 && iM6345h12 <= 15) {
                                                    zzafbVar.f5148b = iM6345h12;
                                                }
                                                if (iM6345h12 >= 11 && iM6345h12 <= 14) {
                                                    zzafbVar.f5150d = zzetVar3.m6344g();
                                                    zzafbVar.f5151e = zzetVar3.m6345h(2);
                                                }
                                                i17 = i19;
                                                zzetVar3.m6343f(24);
                                                i16 = 1;
                                            } else {
                                                i16 = 1;
                                                i17 = iM6345h2;
                                            }
                                            if (iM6345h2 != i16) {
                                                i18 = 2;
                                                if (iM6345h2 == 2) {
                                                }
                                                iM6345h2 = i17;
                                            } else {
                                                i18 = 2;
                                            }
                                            if (zzetVar3.m6344g() && zzetVar3.m6344g()) {
                                                zzetVar3.m6343f(i18);
                                            }
                                            if (zzetVar3.m6344g()) {
                                                zzetVar3.m6342e();
                                                int i40 = 8;
                                                int iM6345h13 = zzetVar3.m6345h(8);
                                                int i41 = 0;
                                                while (i41 < iM6345h13) {
                                                    zzetVar3.m6343f(i40);
                                                    i41++;
                                                    i40 = 8;
                                                }
                                            }
                                            iM6345h2 = i17;
                                        }
                                        if (!z3 && !z5) {
                                            zzetVar3.m6342e();
                                            if (iM6345h == 0 || iM6345h == 1 || iM6345h == 2) {
                                                if (iM6345h2 == 0) {
                                                    for (int i42 = 0; i42 < 2; i42++) {
                                                        zzafd.m4059c(zzetVar3, zzafbVar);
                                                    }
                                                    iM6345h2 = 0;
                                                } else {
                                                    for (int i43 = 0; i43 < 2; i43++) {
                                                        zzafd.m4060d(zzetVar3, zzafbVar);
                                                    }
                                                }
                                            } else if (iM6345h == 3 || iM6345h == 4) {
                                                if (iM6345h2 == 0) {
                                                    for (int i44 = 0; i44 < 3; i44++) {
                                                        zzafd.m4059c(zzetVar3, zzafbVar);
                                                    }
                                                    iM6345h2 = 0;
                                                } else {
                                                    for (int i45 = 0; i45 < 3; i45++) {
                                                        zzafd.m4060d(zzetVar3, zzafbVar);
                                                    }
                                                }
                                            } else if (iM6345h != 5) {
                                                int iM6345h14 = zzetVar3.m6345h(7);
                                                for (int i46 = 0; i46 < iM6345h14; i46++) {
                                                    zzetVar3.m6343f(8);
                                                }
                                            } else if (iM6345h2 == 0) {
                                                zzafd.m4059c(zzetVar3, zzafbVar);
                                                iM6345h2 = 0;
                                            } else {
                                                int iM6345h15 = zzetVar3.m6345h(3);
                                                for (int i47 = 0; i47 < iM6345h15 + 2; i47++) {
                                                    zzafd.m4060d(zzetVar3, zzafbVar);
                                                }
                                            }
                                        } else if (iM6345h2 == 0) {
                                            zzafd.m4059c(zzetVar3, zzafbVar);
                                            iM6345h2 = 0;
                                        } else {
                                            zzafd.m4060d(zzetVar3, zzafbVar);
                                        }
                                        zzetVar3.m6342e();
                                        if (zzetVar3.m6344g()) {
                                            iM6345h3 = zzetVar3.m6345h(7);
                                            for (i20 = 0; i20 < iM6345h3; i20++) {
                                                zzetVar3.m6343f(15);
                                            }
                                        }
                                    } else {
                                        iM6345h3 = zzetVar3.m6345h(7);
                                        while (i20 < iM6345h3) {
                                            zzetVar3.m6343f(15);
                                        }
                                    }
                                    if (iM6345h2 > 0) {
                                        if (zzetVar3.m6344g()) {
                                            if (zzetVar3.m6339b() < 66) {
                                                z4 = false;
                                            } else {
                                                zzetVar3.m6343f(66);
                                                z4 = true;
                                            }
                                            if (!z4) {
                                                throw zzat.m4384b("Can't parse bitrate DSI.");
                                            }
                                        }
                                        if (zzetVar3.m6344g()) {
                                            zzetVar3.m6348k();
                                            zzetVar3.m6349l(zzetVar3.m6345h(16));
                                            int iM6345h16 = zzetVar3.m6345h(5);
                                            for (int i48 = 0; i48 < iM6345h16; i48++) {
                                                zzetVar3.m6343f(3);
                                                zzetVar3.m6343f(8);
                                            }
                                        }
                                    }
                                    i10 = 8;
                                    zzetVar3.m6348k();
                                    if (iM6345h6 == 1) {
                                        int iM6339b3 = ((iM6339b - zzetVar3.m6339b()) / 8) - i15;
                                        if (i14 < iM6339b3) {
                                            throw zzat.m4384b("pres_bytes is smaller than presentation bytes read.");
                                        }
                                        zzetVar3.m6349l(i14 - iM6339b3);
                                    }
                                    if (zzafbVar.f5147a && zzafbVar.f5148b == -1) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(i37).length() + 45);
                                        sb2.append("Can't determine channel mode of presentation ");
                                        sb2.append(i37);
                                        throw zzat.m4384b(sb2.toString());
                                    }
                                } else {
                                    i21 = i21;
                                    str6 = str2;
                                    i10 = 8;
                                }
                                if (zzafbVar.f5147a) {
                                    int i49 = zzafbVar.f5148b;
                                    boolean z6 = zzafbVar.f5150d;
                                    int i50 = zzafbVar.f5151e;
                                    switch (i49) {
                                        case 0:
                                            i12 = 11;
                                            i13 = 1;
                                            break;
                                        case 1:
                                            i12 = 11;
                                            i13 = 2;
                                            break;
                                        case 2:
                                            i12 = 11;
                                            i13 = 3;
                                            break;
                                        case 3:
                                            i12 = 11;
                                            i13 = 5;
                                            break;
                                        case 4:
                                            i12 = 11;
                                            i13 = 6;
                                            break;
                                        case 5:
                                        case 7:
                                        case 9:
                                            i12 = 11;
                                            i13 = 7;
                                            break;
                                        case 6:
                                        case 8:
                                        case 10:
                                            i13 = i10;
                                            i12 = 11;
                                            break;
                                        case 11:
                                            i12 = 11;
                                            i13 = 11;
                                            break;
                                        case 12:
                                            i13 = 12;
                                            i12 = 11;
                                            break;
                                        case 13:
                                            i12 = 11;
                                            i13 = 13;
                                            break;
                                        case 14:
                                            i12 = 11;
                                            i13 = 14;
                                            break;
                                        case 15:
                                            i12 = 11;
                                            i13 = 24;
                                            break;
                                        default:
                                            i12 = 11;
                                            i13 = -1;
                                            break;
                                    }
                                    if (i49 == i12 || i49 == 12 || i49 == 13 || i49 == 14) {
                                        if (!z6) {
                                            i13 -= 2;
                                        }
                                        if (i50 == 0) {
                                            i11 = i13 - 4;
                                        } else if (i50 != 1) {
                                            i11 = i13;
                                        } else {
                                            i11 = i13 - 2;
                                        }
                                    } else {
                                        i11 = i13;
                                    }
                                } else {
                                    int i51 = zzafbVar.f5149c;
                                    if (i51 > 0) {
                                        i11 = i51 + 1;
                                        if (zzafbVar.f5153g == 4 && i11 == 17) {
                                            i11 = 21;
                                        }
                                    } else {
                                        int i52 = zzafbVar.f5153g;
                                        if (i52 == 0) {
                                            i11 = 2;
                                        } else if (i52 == 1) {
                                            i11 = 6;
                                        } else if (i52 == 2) {
                                            i11 = i10;
                                        } else if (i52 == 3) {
                                            i11 = 10;
                                        } else if (i52 != 4) {
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(i52).length() + 33);
                                            sb3.append("AC-4 level ");
                                            sb3.append(i52);
                                            sb3.append(" has not been defined.");
                                            zzeh.m6211c("Ac4Util", sb3.toString());
                                            i11 = 2;
                                        } else {
                                            i11 = 12;
                                        }
                                    }
                                }
                                if (i11 <= 0) {
                                    throw zzat.m4384b("Cannot determine channel count of presentation.");
                                }
                                Object[] objArr = {Integer.valueOf(iM6345h7), Integer.valueOf(zzafbVar.f5152f), Integer.valueOf(zzafbVar.f5153g)};
                                String str13 = zzfm.f16091a;
                                String str14 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                zzt zztVar3 = new zzt();
                                zztVar3.f20789a = string3;
                                zztVar3.m8853e("audio/ac4");
                                zztVar3.f20780F = i11;
                                zztVar3.f20782H = i36;
                                zztVar3.f20806r = zzqVarM8828a;
                                zztVar3.f20792d = str;
                                zztVar3.f20798j = str14;
                                zzalkVar.f5816b = new zzv(zztVar3);
                                zzeuVar2 = zzeuVar;
                                str4 = str6;
                            }
                        } else {
                            i21 = i21;
                            str2 = str2;
                            i26 = i26;
                            if (iM6376b3 == 1684892784) {
                                if (iM6376b <= 0) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(iM6376b).length() + 49);
                                    sb4.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                    sb4.append(iM6376b);
                                    throw zzat.m4383a(null, sb4.toString());
                                }
                                zzeuVar2 = zzeuVar;
                                i27 = iM6376b;
                                listM7217q = listM7217q;
                                iM6382h = 2;
                            } else if (iM6376b3 == 1684305011 || iM6376b3 == 1969517683) {
                                zzeuVar2 = zzeuVar;
                                i21 = i21;
                                zzt zztVar4 = new zzt();
                                zztVar4.m8851c(i5);
                                str4 = str2;
                                zztVar4.m8853e(str4);
                                iM6382h = iM6382h;
                                zztVar4.f20780F = iM6382h;
                                i27 = i27;
                                zztVar4.f20782H = i27;
                                zztVar4.f20806r = zzqVarM8828a;
                                zztVar4.f20792d = str;
                                zzalkVar.f5816b = new zzv(zztVar4);
                                i21 = i21;
                            } else {
                                if (iM6376b3 == 1682927731) {
                                    int i53 = iM6376b2 - 8;
                                    byte[] bArr3 = f5828a;
                                    int length = bArr3.length;
                                    byte[] bArrCopyOf = Arrays.copyOf(bArr3, length + i53);
                                    zzeuVar2 = zzeuVar;
                                    zzeuVar2.m6363E(i26 + 8);
                                    zzeuVar2.m6366H(bArrCopyOf, length, i53);
                                    listM7217q = zzgx.m7233a(bArrCopyOf);
                                } else {
                                    zzeuVar2 = zzeuVar;
                                    if (iM6376b3 == 1684425825) {
                                        byte[] bArr4 = new byte[iM6376b2 - 8];
                                        bArr4[0] = 102;
                                        bArr4[1] = 76;
                                        bArr4[2] = 97;
                                        bArr4[3] = 67;
                                        zzeuVar2.m6363E(i26 + 12);
                                        zzeuVar2.m6366H(bArr4, 4, iM6376b2 - 12);
                                        listM7217q = zzgwt.m7216n(bArr4);
                                    } else if (iM6376b3 == 1634492771) {
                                        int i54 = iM6376b2 - 12;
                                        byte[] bArr5 = new byte[i54];
                                        zzeuVar2.m6363E(i26 + 12);
                                        zzeuVar2.m6366H(bArr5, 0, i54);
                                        byte[] bArr6 = zzdr.f12695a;
                                        zzeu zzeuVar3 = new zzeu(bArr5);
                                        zzeuVar3.m6363E(5);
                                        int iM6369K3 = zzeuVar3.m6369K();
                                        zzeuVar3.m6363E(9);
                                        int iM6369K4 = zzeuVar3.m6369K();
                                        zzeuVar3.m6363E(20);
                                        int[] iArr3 = {zzeuVar3.m6382h(), iM6369K4, iM6369K3};
                                        int i55 = iArr3[0];
                                        int i56 = iArr3[1];
                                        int iM6500b2 = zzfm.m6500b(iM6369K3, ByteOrder.LITTLE_ENDIAN);
                                        if (iM6500b2 == 0) {
                                            iM6500b2 = -1;
                                        }
                                        listM7217q = zzgwt.m7216n(bArr5);
                                        iM6382h = i56;
                                        iM6500b = iM6500b2;
                                        i27 = i55;
                                    } else if (iM6376b3 == 1767990114) {
                                        zzeuVar2.m6363E(i26 + 9);
                                        int iM7304a = zzhaq.m7304a(zzeuVar2.m6390p());
                                        byte[] bArr7 = new byte[iM7304a];
                                        zzeuVar2.m6366H(bArr7, 0, iM7304a);
                                        byte[] bArr8 = zzdr.f12695a;
                                        zzeu zzeuVar4 = new zzeu(bArr7);
                                        String str15 = null;
                                        String str16 = null;
                                        while (zzeuVar4.m6360B() > 0 && (str15 == null || str16 == null)) {
                                            int iM6369K5 = zzeuVar4.m6369K();
                                            int i57 = iM6369K5 >> 3;
                                            int i58 = iM6369K5 & 2;
                                            int i59 = iM6369K5 & 1;
                                            int iM7304a2 = zzhaq.m7304a(zzeuVar4.m6390p());
                                            if (i57 > 4 && i57 < 24 && i58 != 0) {
                                                do {
                                                } while ((zzeuVar4.m6369K() & 128) != 0);
                                                for (i9 = 128; (zzeuVar4.m6369K() & i9) != 0; i9 = 128) {
                                                }
                                            }
                                            if (i59 != 0) {
                                                zzeuVar4.m6365G(zzhaq.m7304a(zzeuVar4.m6390p()));
                                            }
                                            int i60 = zzeuVar4.f14888b + iM7304a2;
                                            if (i57 == 31) {
                                                zzeuVar4.m6365G(4);
                                                Object[] objArr2 = {Integer.valueOf(zzeuVar4.m6369K()), Integer.valueOf(zzeuVar4.m6369K())};
                                                String str17 = zzfm.f16091a;
                                                str15 = String.format(Locale.US, "iamf.%03X.%03X", objArr2);
                                            } else {
                                                if (i57 == 0) {
                                                    while ((zzeuVar4.m6369K() & 128) != 0) {
                                                    }
                                                    String strM6385k = zzeuVar4.m6385k(4, StandardCharsets.UTF_8);
                                                    if (strM6385k.equals("mp4a")) {
                                                        while ((zzeuVar4.m6369K() & 128) != 0) {
                                                        }
                                                        zzeuVar4.m6365G(2);
                                                        zzet zzetVar4 = new zzet();
                                                        zzetVar4.m6338a(zzeuVar4);
                                                        int iM6345h17 = zzetVar4.m6345h(5);
                                                        if (iM6345h17 == 31) {
                                                            iM6345h17 = zzetVar4.m6345h(6) + 32;
                                                        }
                                                        StringBuilder sb5 = new StringBuilder(strM6385k.length() + 4 + String.valueOf(iM6345h17).length());
                                                        sb5.append(strM6385k);
                                                        sb5.append(".40.");
                                                        sb5.append(iM6345h17);
                                                        strM6385k = sb5.toString();
                                                    }
                                                    str16 = strM6385k;
                                                }
                                                zzeuVar4.m6363E(i60);
                                            }
                                            zzeuVar4.m6363E(i60);
                                        }
                                        String strM2450q = (str15 == null || str16 == null) ? null : AbstractC1456a.m2450q(new StringBuilder(str15.length() + 1 + str16.length()), str15, ".", str16);
                                        zzgwtVarM7216n = zzgwt.m7216n(bArr7);
                                        iM6382h = iM6382h;
                                        str10 = strM2450q;
                                        listM7217q = zzgwtVarM7216n;
                                    } else if (iM6376b3 == 1885564227) {
                                        zzeuVar2.m6363E(i26 + 12);
                                        ByteOrder byteOrder = (zzeuVar2.m6369K() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                        int iM6369K6 = zzeuVar2.m6369K();
                                        i21 = i21;
                                        iM6500b = i21 == 1768973165 ? zzfm.m6500b(iM6369K6, byteOrder) : i21 == 1718641517 ? zzfm.m6501c(iM6369K6, byteOrder) : iM6500b;
                                        if (iM6500b == 0) {
                                            iM6500b = -1;
                                        }
                                        if (iM6500b != -1) {
                                            str2 = "audio/raw";
                                        }
                                        listM7217q = listM7217q;
                                    } else {
                                        iM6382h = iM6382h;
                                        i27 = i27;
                                        str4 = str2;
                                    }
                                }
                                iM6382h = iM6382h;
                            }
                        }
                    }
                    str2 = str4;
                    i27 = i27;
                    listM7217q = listM7217q;
                }
                if (i7 != i8) {
                    zzalf zzalfVarM4200j = m4200j(i7, zzeuVar2);
                    str4 = zzalfVarM4200j.f5805a;
                    byte[] bArr9 = zzalfVarM4200j.f5806b;
                    if (bArr9 == null) {
                        i21 = i21;
                        zzalfVar2 = zzalfVarM4200j;
                        str2 = str4;
                        i27 = i27;
                        listM7217q = listM7217q;
                    } else if ("audio/vorbis".equals(str4)) {
                        zzham zzhamVar = zzaho.f5334a;
                        zzeu zzeuVar5 = new zzeu(bArr9);
                        int i61 = 1;
                        zzeuVar5.m6365G(1);
                        int i62 = 0;
                        while (true) {
                            zzalfVar = zzalfVarM4200j;
                            if (zzeuVar5.m6360B() > 0) {
                                i21 = i21;
                                if (zzeuVar5.m6367I() == 255) {
                                    zzeuVar5.m6365G(i61);
                                    i62 += 255;
                                    zzalfVarM4200j = zzalfVar;
                                    i21 = i21;
                                    i61 = 1;
                                }
                            } else {
                                i21 = i21;
                            }
                        }
                        int iM6369K7 = zzeuVar5.m6369K() + i62;
                        int i63 = 0;
                        while (zzeuVar5.m6360B() > 0 && zzeuVar5.m6367I() == 255) {
                            zzeuVar5.m6365G(1);
                            i63 += 255;
                        }
                        int iM6369K8 = zzeuVar5.m6369K() + i63;
                        byte[] bArr10 = new byte[iM6369K7];
                        int i64 = zzeuVar5.f14888b;
                        System.arraycopy(bArr9, i64, bArr10, 0, iM6369K7);
                        int i65 = i64 + iM6369K7 + iM6369K8;
                        int length2 = bArr9.length - i65;
                        byte[] bArr11 = new byte[length2];
                        System.arraycopy(bArr9, i65, bArr11, 0, length2);
                        listM7217q = zzgwt.m7217q(bArr10, bArr11);
                        zzalfVar2 = zzalfVar;
                        str2 = str4;
                        i27 = i27;
                    } else {
                        i21 = i21;
                        if ("audio/mp4a-latm".equals(str4)) {
                            zzaex zzaexVarM4054a = zzaey.m4054a(new zzet(bArr9, bArr9.length), false);
                            i27 = zzaexVarM4054a.f5136a;
                            iM6382h = zzaexVarM4054a.f5137b;
                            str5 = zzaexVarM4054a.f5138c;
                        } else {
                            str5 = str10;
                        }
                        zzgwtVarM7216n = zzgwt.m7216n(bArr9);
                        zzalfVar2 = zzalfVarM4200j;
                        str2 = str4;
                        i27 = i27;
                        str10 = str5;
                        listM7217q = zzgwtVarM7216n;
                    }
                } else {
                    i21 = i21;
                    str2 = str4;
                    i27 = i27;
                    listM7217q = listM7217q;
                }
            }
            i26 += iM6376b2;
            i22 = i4;
            zzeuVar2 = zzeuVar2;
            str8 = str3;
            str9 = str9;
            str2 = str2;
            i21 = i21;
            i23 = 2;
        }
        String str18 = str2;
        List list2 = listM7217q;
        int i66 = i27;
        if (zzalkVar.f5816b != null || str18 == null) {
            return;
        }
        zzt zztVar5 = new zzt();
        zztVar5.m8851c(i5);
        zztVar5.m8853e(str18);
        zztVar5.f20798j = str10;
        zztVar5.f20780F = iM6382h;
        zztVar5.f20782H = i66;
        zztVar5.f20783I = iM6500b;
        zztVar5.f20805q = list2;
        zztVar5.f20806r = zzqVarM8828a;
        zztVar5.f20792d = str;
        zzalf zzalfVar3 = zzalfVar2;
        if (zzalfVar3 != null) {
            zztVar5.f20796h = zzhaq.m7305b(zzalfVar3.f5807c);
            zztVar5.f20797i = zzhaq.m7305b(zzalfVar3.f5808d);
        } else {
            zzald zzaldVar2 = zzaldVar;
            if (zzaldVar2 != null) {
                zztVar5.f20796h = zzhaq.m7305b(zzaldVar2.f5794a);
                zztVar5.f20797i = zzhaq.m7305b(zzaldVar2.f5795b);
            }
        }
        zzalkVar.f5816b = new zzv(zztVar5);
    }

    /* JADX INFO: renamed from: j */
    public static zzalf m4200j(int i2, zzeu zzeuVar) {
        zzeuVar.m6363E(i2 + 12);
        zzeuVar.m6365G(1);
        m4202l(zzeuVar);
        zzeuVar.m6365G(2);
        int iM6369K = zzeuVar.m6369K();
        if ((iM6369K & 128) != 0) {
            zzeuVar.m6365G(2);
        }
        if ((iM6369K & 64) != 0) {
            zzeuVar.m6365G(zzeuVar.m6369K());
        }
        if ((iM6369K & 32) != 0) {
            zzeuVar.m6365G(2);
        }
        zzeuVar.m6365G(1);
        m4202l(zzeuVar);
        String strM4353e = zzas.m4353e(zzeuVar.m6369K());
        if ("audio/mpeg".equals(strM4353e) || "audio/vnd.dts".equals(strM4353e) || "audio/vnd.dts.hd".equals(strM4353e)) {
            return new zzalf(strM4353e, null, -1L, -1L);
        }
        zzeuVar.m6365G(4);
        long jM6374P = zzeuVar.m6374P();
        long jM6374P2 = zzeuVar.m6374P();
        zzeuVar.m6365G(1);
        int iM4202l = m4202l(zzeuVar);
        long j2 = jM6374P2;
        byte[] bArr = new byte[iM4202l];
        zzeuVar.m6366H(bArr, 0, iM4202l);
        if (j2 <= 0) {
            j2 = -1;
        }
        return new zzalf(strM4353e, bArr, j2, jM6374P > 0 ? jM6374P : -1L);
    }

    /* JADX INFO: renamed from: k */
    public static Pair m4201k(zzeu zzeuVar, int i2, int i3) throws zzat {
        zzamq zzamqVar;
        Pair pairCreate;
        int i4;
        int i5;
        int i6 = zzeuVar.f14888b;
        while (i6 - i2 < i3) {
            zzeuVar.m6363E(i6);
            int iM6376b = zzeuVar.m6376b();
            zzage.m4111a("childAtomSize must be positive", iM6376b > 0);
            if (zzeuVar.m6376b() == 1936289382) {
                int i7 = i6 + 8;
                int i8 = 0;
                int i9 = -1;
                Integer numValueOf = null;
                String strM6385k = null;
                while (i7 - i6 < iM6376b) {
                    zzeuVar.m6363E(i7);
                    int iM6376b2 = zzeuVar.m6376b();
                    int iM6376b3 = zzeuVar.m6376b();
                    if (iM6376b3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzeuVar.m6376b());
                    } else if (iM6376b3 == 1935894637) {
                        zzeuVar.m6365G(4);
                        strM6385k = zzeuVar.m6385k(4, StandardCharsets.UTF_8);
                    } else if (iM6376b3 == 1935894633) {
                        i9 = i7;
                        i8 = iM6376b2;
                    }
                    i7 += iM6376b2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strM6385k) || "cbc1".equals(strM6385k) || "cens".equals(strM6385k) || "cbcs".equals(strM6385k)) {
                    zzage.m4111a("frma atom is mandatory", numValueOf != null);
                    zzage.m4111a("schi atom is mandatory", i9 != -1);
                    int i10 = i9 + 8;
                    while (true) {
                        if (i10 - i9 >= i8) {
                            zzamqVar = null;
                            break;
                        }
                        zzeuVar.m6363E(i10);
                        int iM6376b4 = zzeuVar.m6376b();
                        if (zzeuVar.m6376b() == 1952804451) {
                            int iM4191a = m4191a(zzeuVar.m6376b());
                            zzeuVar.m6365G(1);
                            if (iM4191a == 0) {
                                zzeuVar.m6365G(1);
                                i5 = 0;
                                i4 = 0;
                            } else {
                                int iM6369K = zzeuVar.m6369K();
                                i4 = iM6369K & 15;
                                i5 = (iM6369K & 240) >> 4;
                            }
                            boolean z = zzeuVar.m6369K() == 1;
                            int iM6369K2 = zzeuVar.m6369K();
                            byte[] bArr2 = new byte[16];
                            zzeuVar.m6366H(bArr2, 0, 16);
                            if (z && iM6369K2 == 0) {
                                int iM6369K3 = zzeuVar.m6369K();
                                byte[] bArr3 = new byte[iM6369K3];
                                zzeuVar.m6366H(bArr3, 0, iM6369K3);
                                bArr = bArr3;
                            }
                            zzamqVar = new zzamq(z, strM6385k, iM6369K2, bArr2, i5, i4, bArr);
                            break;
                        }
                        i10 += iM6376b4;
                    }
                    zzage.m4111a("tenc atom is mandatory", zzamqVar != null);
                    String str = zzfm.f16091a;
                    pairCreate = Pair.create(numValueOf, zzamqVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i6 += iM6376b;
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static int m4202l(zzeu zzeuVar) {
        int iM6369K = zzeuVar.m6369K();
        int i2 = iM6369K & 127;
        while ((iM6369K & 128) == 128) {
            iM6369K = zzeuVar.m6369K();
            i2 = (i2 << 7) | (iM6369K & 127);
        }
        return i2;
    }
}
