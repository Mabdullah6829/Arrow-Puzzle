package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.FW */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2823FW {
    public static String[] A07 = {"yeCTR", "vbYpGeRKHwsNyxajpSfuheCIvaYNa3MM", "oEndzsHg4", "8UJlx4orYPxMpFHWptRgD2Ht", "cT5Bq67DmISXhs3jX", "HBUYvmEJLfhzIFqS0furUTPx", "Yflab", "bdcCFsYTxOJVXsfU13RZ00QELBiL0cIH"};
    public static final Comparator<C2822FV> A08 = new Comparator() { // from class: com.facebook.ads.redexgen.X.FS
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C2823FW.A00((C2822FV) obj, (C2822FV) obj2);
        }
    };
    public static final Comparator<C2822FV> A09 = new Comparator() { // from class: com.facebook.ads.redexgen.X.FT
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((C2822FV) obj).A00, ((C2822FV) obj2).A00);
        }
    };
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final C2822FV[] A06 = new C2822FV[5];
    public final ArrayList<C2822FV> A05 = new ArrayList<>();
    public int A00 = -1;

    public C2823FW(int i2) {
        this.A04 = i2;
    }

    public static /* synthetic */ int A00(C2822FV c2822fv, C2822FV c2822fv2) {
        return c2822fv.A01 - c2822fv2.A01;
    }

    private void A02() {
        if (this.A00 != 1) {
            Collections.sort(this.A05, A08);
            this.A00 = 1;
        }
    }

    private void A03() {
        if (this.A00 != 0) {
            Collections.sort(this.A05, A09);
            this.A00 = 0;
        }
    }

    private final void A04(int i2, float f2) {
        C2822FV oldestSample;
        A02();
        if (this.A02 > 0) {
            C2822FV[] c2822fvArr = this.A06;
            int i3 = this.A02 - 1;
            this.A02 = i3;
            oldestSample = c2822fvArr[i3];
        } else {
            oldestSample = new C2822FV();
        }
        int i4 = this.A01;
        this.A01 = i4 + 1;
        oldestSample.A01 = i4;
        oldestSample.A02 = i2;
        oldestSample.A00 = f2;
        this.A05.add(oldestSample);
        this.A03 += i2;
        while (this.A03 > this.A04) {
            int excessWeight = this.A03 - this.A04;
            C2822FV c2822fv = this.A05.get(0);
            if (c2822fv.A02 <= excessWeight) {
                this.A03 -= c2822fv.A02;
                this.A05.remove(0);
                if (this.A02 < 5) {
                    C2822FV[] c2822fvArr2 = this.A06;
                    int excessWeight2 = this.A02;
                    this.A02 = excessWeight2 + 1;
                    c2822fvArr2[excessWeight2] = c2822fv;
                }
            } else {
                c2822fv.A02 -= excessWeight;
                this.A03 -= excessWeight;
            }
        }
    }

    public final float A05(float f2) {
        A03();
        float f3 = this.A03 * f2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = this.A05.size();
            int accumulatedWeight = A07[7].charAt(16);
            if (accumulatedWeight != 49) {
                throw new RuntimeException();
            }
            A07[7] = "tMnKu67VMHjg0RGb1V9fdd44wq1tOS9W";
            if (i3 < size) {
                C2822FV c2822fv = this.A05.get(i3);
                i2 += c2822fv.A02;
                float desiredWeight = i2;
                if (desiredWeight >= f3) {
                    float desiredWeight2 = c2822fv.A00;
                    return desiredWeight2;
                }
                i3++;
            } else {
                if (this.A05.isEmpty()) {
                    return Float.NaN;
                }
                float desiredWeight3 = this.A05.get(this.A05.size() - 1).A00;
                return desiredWeight3;
            }
        }
    }

    public final void A06() {
        this.A05.clear();
        this.A00 = -1;
        this.A01 = 0;
        this.A03 = 0;
    }

    @MetaExoPlayerCustomization("D20155618 Samples OutOfBounds Error Check Fix")
    public final void A07(int i2, float f2) {
        C2822FV oldestSample;
        if (MetaExoPlayerUpgradeConfig.A03(EnumC4663jX.A1F)) {
            A04(i2, f2);
            return;
        }
        A02();
        if (this.A02 > 0) {
            C2822FV[] c2822fvArr = this.A06;
            int i3 = this.A02 - 1;
            this.A02 = i3;
            oldestSample = c2822fvArr[i3];
        } else {
            oldestSample = new C2822FV();
        }
        int i4 = this.A01;
        this.A01 = i4 + 1;
        oldestSample.A01 = i4;
        oldestSample.A02 = i2;
        oldestSample.A00 = f2;
        this.A05.add(oldestSample);
        this.A03 += i2;
        while (this.A03 > this.A04 && !this.A05.isEmpty()) {
            int excessWeight = this.A03 - this.A04;
            C2822FV c2822fv = this.A05.get(0);
            if (c2822fv.A02 <= excessWeight) {
                this.A03 -= c2822fv.A02;
                String[] strArr = A07;
                if (strArr[3].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A07;
                strArr2[3] = "3KNEloHV0yOGYGtjjhul0kjR";
                strArr2[5] = "CQhg8nP9eAQ7nTj9eI4Xv7HE";
                this.A05.remove(0);
                if (this.A02 < 5) {
                    C2822FV[] c2822fvArr2 = this.A06;
                    String[] strArr3 = A07;
                    if (strArr3[6].length() != strArr3[0].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A07;
                    strArr4[2] = "1EJuh5GaS";
                    strArr4[4] = "pMRpDkTII4u81yBOo";
                    int excessWeight2 = this.A02;
                    this.A02 = excessWeight2 + 1;
                    c2822fvArr2[excessWeight2] = c2822fv;
                } else {
                    continue;
                }
            } else {
                c2822fv.A02 -= excessWeight;
                this.A03 -= excessWeight;
            }
        }
    }
}
