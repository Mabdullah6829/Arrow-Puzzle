package com.instagram.common.viewpoint.core;

import androidx.core.location.LocationRequestCompat;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mg */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3265Mg {
    public static byte[] A05;
    public static String[] A06 = {"nQDli3B322dNyuNUEmcA1lNjVYYmcThQ", "JG8wfEU3nZ2EADYXO0uZDMHFqmVSkpWr", "8K0NmfCVVugnhGVgpCD", "5JHmUKWu4ei3dzUY0lNr", "xKwnuhTKVDH3YhaAiUGpqwLltg47C3CG", "Jcwv8MY0", "vBOLiuiZ", "hny3hth3cGmNH4IG9ndqfAmzri4VXjHL"};
    public C4714kN A00;
    public final int A01;
    public final String A02;
    public final ArrayList<C3264Mf> A03;
    public final TreeSet<C4712kL> A04;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 47);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{115, -57, -62, 115, -100, -70, -68, -63, -66, -67, -100, -56, -57, -51, -66, -57, -51, -57, -30, -22, -19, -26, -27, -95, -11, -16, -95, -13, -26, -17, -30, -18, -26, -95};
    }

    static {
        A01();
    }

    public C3265Mg(int i2, String str) {
        this(i2, str, C4714kN.A03);
    }

    public C3265Mg(int i2, String str, C4714kN c4714kN) {
        this.A01 = i2;
        this.A02 = str;
        this.A00 = c4714kN;
        this.A04 = new TreeSet<>();
        this.A03 = new ArrayList<>();
    }

    public final long A02(long j2, long j3) {
        boolean z = true;
        AbstractC21273y.A07(j2 >= 0);
        if (j3 < 0) {
            z = false;
        }
        AbstractC21273y.A07(z);
        C4712kL c4712kLA04 = A04(j2, j3);
        if (c4712kLA04.A03()) {
            return -Math.min(c4712kLA04.A04() ? LocationRequestCompat.PASSIVE_INTERVAL : c4712kLA04.A01, j3);
        }
        long j4 = j2 + j3;
        if (j4 < 0) {
            j4 = LocationRequestCompat.PASSIVE_INTERVAL;
        }
        long currentEndPosition = c4712kLA04.A02 + c4712kLA04.A01;
        if (currentEndPosition < j4) {
            TreeSet<C4712kL> treeSet = this.A04;
            String[] strArr = A06;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[2] = "31viDRwdD8ErVcI5dXS";
            strArr2[3] = "q1k4diPGE3D0s4ujqDJA";
            for (C4712kL c4712kL : treeSet.tailSet(c4712kLA04, false)) {
                if (c4712kL.A02 > currentEndPosition) {
                    break;
                }
                long j5 = c4712kL.A02;
                long queryEndPosition = c4712kL.A01;
                currentEndPosition = Math.max(currentEndPosition, j5 + queryEndPosition);
                if (currentEndPosition >= j4) {
                    break;
                }
            }
        }
        return Math.min(currentEndPosition - j2, j3);
    }

    public final C4714kN A03() {
        return this.A00;
    }

    public final C4712kL A04(long j2, long j3) {
        C4712kL c4712kLA03 = C4712kL.A03(this.A02, j2);
        C4712kL c4712kLFloor = this.A04.floor(c4712kLA03);
        if (c4712kLFloor != null && c4712kLFloor.A02 + c4712kLFloor.A01 > j2) {
            return c4712kLFloor;
        }
        C4712kL lookupSpan = this.A04.ceiling(c4712kLA03);
        if (lookupSpan != null) {
            long jMin = lookupSpan.A02 - j2;
            if (j3 != -1) {
                jMin = Math.min(jMin, j3);
            }
            j3 = jMin;
        }
        return C4712kL.A04(this.A02, j2, j3);
    }

    public final C4712kL A05(C4712kL c4712kL, long j2, boolean z) {
        AbstractC21273y.A08(this.A04.remove(c4712kL));
        File file = (File) AbstractC21273y.A01(c4712kL.A03);
        if (z) {
            File file2 = file.getParentFile();
            File fileA05 = C4712kL.A05((File) AbstractC21273y.A01(file2), this.A01, c4712kL.A02, j2);
            if (file.renameTo(fileA05)) {
                file = fileA05;
            } else {
                AbstractC21714g.A07(A00(4, 13, 42), A00(17, 17, 82) + file + A00(0, 4, 36) + fileA05);
            }
        }
        C4712kL newCacheSpan = c4712kL.A09(file, j2);
        this.A04.add(newCacheSpan);
        return newCacheSpan;
    }

    public final TreeSet<C4712kL> A06() {
        return this.A04;
    }

    public final void A07(long j2) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.A03.get(i2).A01 == j2) {
                this.A03.remove(i2);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void A08(C4712kL c4712kL) {
        this.A04.add(c4712kL);
    }

    public final boolean A09() {
        return this.A04.isEmpty();
    }

    public final boolean A0A() {
        return this.A03.isEmpty();
    }

    public final boolean A0B(long j2, long j3) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.A03.get(i2).A00(j2, j3)) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0C(long j2, long j3) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.A03.get(i2).A01(j2, j3)) {
                return false;
            }
        }
        this.A03.add(new C3264Mf(j2, j3));
        return true;
    }

    public final boolean A0D(C3258MZ c3258mz) {
        if (this.A04.remove(c3258mz)) {
            if (c3258mz.A03 != null) {
                c3258mz.A03.delete();
                return true;
            }
            return true;
        }
        String[] strArr = A06;
        if (strArr[2].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[2] = "U4uu0ltzeeg5QMm1KwS";
        strArr2[3] = "VtFGErd1YdVsfyUNL3Po";
        return false;
    }

    public final boolean A0E(C3270Ml c3270Ml) {
        C4714kN c4714kN = this.A00;
        C4714kN oldMetadata = this.A00;
        this.A00 = oldMetadata.A05(c3270Ml);
        C4714kN oldMetadata2 = this.A00;
        return !oldMetadata2.equals(c4714kN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3265Mg c3265Mg = (C3265Mg) obj;
        if (this.A01 == c3265Mg.A01 && this.A02.equals(c3265Mg.A02) && this.A04.equals(c3265Mg.A04) && this.A00.equals(c3265Mg.A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A01;
        int i2 = result * 31;
        int result2 = this.A02.hashCode();
        return ((i2 + result2) * 31) + this.A00.hashCode();
    }
}
