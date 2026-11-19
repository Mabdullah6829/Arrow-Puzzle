package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzagu {

    /* JADX INFO: renamed from: a */
    public final List f5270a;

    /* JADX INFO: renamed from: b */
    public final int f5271b;

    /* JADX INFO: renamed from: c */
    public final int f5272c;

    /* JADX INFO: renamed from: d */
    public final int f5273d;

    /* JADX INFO: renamed from: e */
    public final int f5274e;

    /* JADX INFO: renamed from: f */
    public final int f5275f;

    /* JADX INFO: renamed from: g */
    public final int f5276g;

    /* JADX INFO: renamed from: h */
    public final int f5277h;

    /* JADX INFO: renamed from: i */
    public final int f5278i;

    /* JADX INFO: renamed from: j */
    public final int f5279j;

    /* JADX INFO: renamed from: k */
    public final int f5280k;

    /* JADX INFO: renamed from: l */
    public final float f5281l;

    /* JADX INFO: renamed from: m */
    public final int f5282m;

    /* JADX INFO: renamed from: n */
    public final String f5283n;

    /* JADX INFO: renamed from: o */
    public final zzgo f5284o;

    public zzagu(List list, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, float f2, int i12, String str, zzgo zzgoVar) {
        this.f5270a = list;
        this.f5271b = i2;
        this.f5272c = i3;
        this.f5273d = i4;
        this.f5274e = i5;
        this.f5275f = i6;
        this.f5276g = i7;
        this.f5277h = i8;
        this.f5278i = i9;
        this.f5279j = i10;
        this.f5280k = i11;
        this.f5281l = f2;
        this.f5282m = i12;
        this.f5283n = str;
        this.f5284o = zzgoVar;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0275  */
    /* JADX WARN: Code duplicated, block: B:120:0x0278  */
    /* JADX INFO: renamed from: a */
    public static zzagu m4125a(zzeu zzeuVar, boolean z, zzgo zzgoVar) throws zzat {
        boolean z2;
        boolean z3;
        String str;
        int i2;
        char c;
        zzgk zzgkVar;
        int i3;
        int i4;
        int i5 = 4;
        boolean z4 = true;
        if (z) {
            try {
                zzeuVar.m6365G(4);
            } catch (ArrayIndexOutOfBoundsException e) {
                e = e;
                z3 = true;
                if (z3 != z) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw zzat.m4383a(e, "Error parsing".concat(str));
            }
        } else {
            try {
                zzeuVar.m6365G(21);
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                z2 = z4;
                z3 = z2;
                if (z3 != z) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw zzat.m4383a(e, "Error parsing".concat(str));
            }
        }
        int iM6369K = zzeuVar.m6369K() & 3;
        int iM6369K2 = zzeuVar.m6369K();
        int i6 = zzeuVar.f14888b;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < iM6369K2; i9++) {
            zzeuVar.m6365G(1);
            int iM6370L = zzeuVar.m6370L();
            for (int i10 = 0; i10 < iM6370L; i10++) {
                int iM6370L2 = zzeuVar.m6370L();
                i8 += iM6370L2 + 4;
                zzeuVar.m6365G(iM6370L2);
            }
        }
        zzeuVar.m6363E(i6);
        byte[] bArr = new byte[i8];
        zzgo zzgoVar2 = zzgoVar;
        int i11 = 0;
        float f2 = 1.0f;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        int i21 = -1;
        String strM6032a = null;
        int i22 = 0;
        while (i22 < iM6369K2) {
            int iM6369K3 = zzeuVar.m6369K() & 63;
            int iM6370L3 = zzeuVar.m6370L();
            z2 = z4;
            int i23 = i7;
            zzgo zzgoVarM7084e = zzgoVar2;
            while (i23 < iM6370L3) {
                try {
                    int iM6370L4 = zzeuVar.m6370L();
                    int i24 = i23;
                    System.arraycopy(zzgr.f18091a, i7, bArr, i11, i5);
                    int i25 = i11 + 4;
                    System.arraycopy(zzeuVar.f14887a, zzeuVar.f14888b, bArr, i25, iM6370L4);
                    int i26 = 32;
                    if (iM6369K3 == 32) {
                        if (i24 == 0) {
                            zzgoVarM7084e = zzgr.m7084e(bArr, i25, i25 + iM6370L4);
                            i2 = iM6369K;
                            i4 = 0;
                            i3 = 0;
                        }
                        c = '?';
                        i11 = i25 + iM6370L4;
                        zzeuVar.m6365G(iM6370L4);
                        i23 = i4 + 1;
                        i5 = 4;
                        i7 = i3;
                        iM6369K = i2;
                    } else {
                        i26 = iM6369K3;
                    }
                    i2 = iM6369K;
                    if (i26 != 33) {
                        i25 = i25;
                        int i27 = 8;
                        if (i26 == 39 && i24 == 0) {
                            int i28 = i11 + 6;
                            int i29 = (i25 + iM6370L4) - 1;
                            while (true) {
                                byte b = bArr[i29];
                                if (b != 0) {
                                    if (b == 0) {
                                        c = '?';
                                        zzgkVar = null;
                                        break;
                                    }
                                    if (i29 > i28) {
                                        zzgy zzgyVar = new zzgy(bArr, i28, i29 + 1);
                                        while (true) {
                                            if (zzgyVar.m7254c(16)) {
                                                int i30 = i27;
                                                int iM7256e = zzgyVar.m7256e(i30);
                                                int i31 = 0;
                                                while (iM7256e == 255) {
                                                    i31 += 255;
                                                    iM7256e = zzgyVar.m7256e(i30);
                                                }
                                                int i32 = i31 + iM7256e;
                                                int iM7256e2 = zzgyVar.m7256e(i30);
                                                int i33 = 0;
                                                while (iM7256e2 == 255) {
                                                    i33 += 255;
                                                    iM7256e2 = zzgyVar.m7256e(8);
                                                }
                                                i27 = 8;
                                                int i34 = i33 + iM7256e2;
                                                if (i34 != 0) {
                                                    if (zzgyVar.m7254c(i34)) {
                                                        if (i32 == 176) {
                                                            int iM7258g = zzgyVar.m7258g();
                                                            boolean zM7255d = zzgyVar.m7255d();
                                                            int iM7258g2 = zM7255d ? zzgyVar.m7258g() : 0;
                                                            int iM7258g3 = zzgyVar.m7258g();
                                                            int i35 = -1;
                                                            int i36 = 0;
                                                            while (true) {
                                                                if (i36 > iM7258g3) {
                                                                    c = '?';
                                                                    zzgkVar = new zzgk(i35);
                                                                    break;
                                                                }
                                                                int iM7258g4 = zzgyVar.m7258g();
                                                                zzgyVar.m7258g();
                                                                int i37 = i36;
                                                                int iM7256e3 = zzgyVar.m7256e(6);
                                                                if (iM7256e3 == 63) {
                                                                    c = '?';
                                                                } else {
                                                                    zzgyVar.m7256e(iM7256e3 == 0 ? Math.max(0, iM7258g - 30) : Math.max(0, (iM7256e3 + iM7258g) - 31));
                                                                    if (zM7255d) {
                                                                        int iM7256e4 = zzgyVar.m7256e(6);
                                                                        if (iM7256e4 == 63) {
                                                                            c = '?';
                                                                        } else {
                                                                            zzgyVar.m7256e(iM7256e4 == 0 ? Math.max(0, iM7258g2 - 30) : Math.max(0, (iM7256e4 + iM7258g2) - 31));
                                                                        }
                                                                    }
                                                                    if (zzgyVar.m7255d()) {
                                                                        zzgyVar.m7253b(10);
                                                                    }
                                                                    i36 = i37 + 1;
                                                                    i35 = iM7258g4;
                                                                }
                                                                zzgkVar = null;
                                                                break;
                                                            }
                                                        }
                                                        zzgyVar.m7253b(i34 * 8);
                                                    }
                                                }
                                            }
                                            c = '?';
                                            zzgkVar = null;
                                            break;
                                        }
                                    }
                                } else if (i29 > i28) {
                                    i29--;
                                }
                                zzgkVar = null;
                                c = '?';
                                break;
                            }
                            if (zzgkVar == null || zzgoVarM7084e == null) {
                                i3 = 0;
                            } else {
                                i3 = 0;
                                if (zzgkVar.f17636a == ((zzge) zzgoVarM7084e.f17902a.get(0)).f17073b) {
                                    i4 = i24;
                                    i20 = 4;
                                } else {
                                    i20 = 5;
                                }
                                i11 = i25 + iM6370L4;
                                zzeuVar.m6365G(iM6370L4);
                                i23 = i4 + 1;
                                i5 = 4;
                                i7 = i3;
                                iM6369K = i2;
                            }
                        }
                        i4 = i24;
                        i11 = i25 + iM6370L4;
                        zzeuVar.m6365G(iM6370L4);
                        i23 = i4 + 1;
                        i5 = 4;
                        i7 = i3;
                        iM6369K = i2;
                    } else if (i24 == 0) {
                        zzgl zzglVarM7085f = zzgr.m7085f(bArr, i25, i25 + iM6370L4, zzgoVarM7084e);
                        int i38 = zzglVarM7085f.f17686a + 1;
                        int i39 = zzglVarM7085f.f17692g;
                        int i40 = zzglVarM7085f.f17693h;
                        int i41 = zzglVarM7085f.f17688c + 8;
                        int i42 = zzglVarM7085f.f17689d + 8;
                        int i43 = zzglVarM7085f.f17696k;
                        int i44 = zzglVarM7085f.f17697l;
                        int i45 = zzglVarM7085f.f17698m;
                        float f3 = zzglVarM7085f.f17694i;
                        int i46 = zzglVarM7085f.f17695j;
                        zzgg zzggVar = zzglVarM7085f.f17687b;
                        if (zzggVar != null) {
                            strM6032a = zzdr.m6032a(zzggVar.f17184a, zzggVar.f17185b, zzggVar.f17186c, zzggVar.f17187d, zzggVar.f17188e, zzggVar.f17189f);
                        }
                        i19 = i45;
                        f2 = f3;
                        i21 = i46;
                        i4 = i24;
                        i16 = i42;
                        i17 = i43;
                        i18 = i44;
                        i15 = i41;
                        i13 = i39;
                        i14 = i40;
                        i3 = 0;
                        i12 = i38;
                        c = '?';
                        i11 = i25 + iM6370L4;
                        zzeuVar.m6365G(iM6370L4);
                        i23 = i4 + 1;
                        i5 = 4;
                        i7 = i3;
                        iM6369K = i2;
                    } else {
                        i25 = i25;
                    }
                    i3 = 0;
                    c = '?';
                    i4 = i24;
                    i11 = i25 + iM6370L4;
                    zzeuVar.m6365G(iM6370L4);
                    i23 = i4 + 1;
                    i5 = 4;
                    i7 = i3;
                    iM6369K = i2;
                } catch (ArrayIndexOutOfBoundsException e3) {
                    e = e3;
                    z3 = z2;
                    if (z3 != z) {
                        str = "HEVC config";
                    } else {
                        str = "L-HEVC config";
                    }
                    throw zzat.m4383a(e, "Error parsing".concat(str));
                }
            }
            i22++;
            zzgoVar2 = zzgoVarM7084e;
            z4 = z2;
            iM6369K = iM6369K;
            i5 = 4;
        }
        z2 = z4;
        return new zzagu(i8 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iM6369K + 1, i12, i13, i14, i15, i16, i17, i18, i19, i20, f2, i21, strM6032a, zzgoVar2);
    }
}
