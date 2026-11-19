package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahp {

    /* JADX INFO: renamed from: a */
    public final List f5339a;

    /* JADX INFO: renamed from: b */
    public final int f5340b;

    /* JADX INFO: renamed from: c */
    public final String f5341c;

    /* JADX INFO: renamed from: d */
    public final int f5342d;

    public zzahp(List list, int i2, String str, int i3) {
        this.f5339a = list;
        this.f5340b = i2;
        this.f5341c = str;
        this.f5342d = i3;
    }

    /* JADX INFO: renamed from: a */
    public static zzahp m4133a(zzeu zzeuVar) throws zzat {
        int iM6369K;
        int iM6369K2;
        int i2;
        int i3;
        int i4;
        try {
            if (zzeuVar.m6376b() != 0) {
                throw zzat.m4383a(null, "Unsupported VVC version");
            }
            int iM6369K3 = zzeuVar.m6369K();
            int i5 = iM6369K3 >> 1;
            int i6 = 1;
            String str = "L";
            if ((iM6369K3 & 1) != 0) {
                zzeuVar.m6365G(1);
                int iM6369K4 = zzeuVar.m6369K() >> 4;
                iM6369K = zzeuVar.m6369K() >> 5;
                int iM6369K5 = zzeuVar.m6369K() & 63;
                int iM6369K6 = zzeuVar.m6369K();
                i2 = iM6369K6 >> 1;
                str = (iM6369K6 & 1) != 0 ? "H" : "L";
                iM6369K2 = zzeuVar.m6369K();
                zzeuVar.m6365G(iM6369K5);
                int i7 = iM6369K4 & 7;
                if (i7 > 1) {
                    int iM6369K7 = zzeuVar.m6369K();
                    for (int i8 = 0; i8 < i7 - 1; i8++) {
                        if (((iM6369K7 >> (7 - i8)) & 1) != 0) {
                            zzeuVar.m6365G(1);
                        }
                    }
                }
                zzeuVar.m6365G(zzeuVar.m6369K() * 4);
                zzeuVar.m6365G(6);
            } else {
                iM6369K = 0;
                iM6369K2 = 0;
                i2 = 0;
            }
            int iM6369K8 = zzeuVar.m6369K();
            int i9 = zzeuVar.f14888b;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                i3 = 12;
                i4 = 13;
                if (i10 >= iM6369K8) {
                    break;
                }
                int iM6369K9 = zzeuVar.m6369K() & 31;
                int iM6370L = (iM6369K9 == 13 || iM6369K9 == 12) ? 1 : zzeuVar.m6370L();
                for (int i12 = 0; i12 < iM6370L; i12++) {
                    int iM6370L2 = zzeuVar.m6370L();
                    i11 = iM6370L2 + 4 + i11;
                    zzeuVar.m6365G(iM6370L2);
                }
                i10++;
            }
            zzeuVar.m6363E(i9);
            byte[] bArr = new byte[i11];
            int i13 = 0;
            int i14 = 0;
            while (i13 < iM6369K8) {
                int iM6369K10 = zzeuVar.m6369K() & 31;
                int iM6370L3 = (iM6369K10 == i4 || iM6369K10 == i3) ? i6 : zzeuVar.m6370L();
                int i15 = i6;
                for (int i16 = 0; i16 < iM6370L3; i16++) {
                    int iM6370L4 = zzeuVar.m6370L();
                    System.arraycopy(zzgr.f18091a, 0, bArr, i14, 4);
                    int i17 = i14 + 4;
                    zzeuVar.m6366H(bArr, i17, iM6370L4);
                    i14 = i17 + iM6370L4;
                }
                i13++;
                i6 = i15;
                i3 = 12;
                i4 = 13;
            }
            Locale locale = Locale.US;
            return new zzahp(zzgwt.m7216n(bArr), (i5 & 3) + 1, "vvc1." + i2 + "." + str + iM6369K2, iM6369K + 8);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzat.m4383a(e, "Error parsing VVC configuration");
        }
    }
}
