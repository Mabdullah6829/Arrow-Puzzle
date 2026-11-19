package com.instagram.common.viewpoint.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7E */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C23297E {
    public static String[] A0B = {"ytES6GjYCCZeLRsctY", "", "JAF1Tg0UjyffIggj5BNMmxVlRkgdhjMr", "rlk3ZCySajOx3", "MCGN0v", "", "6TmcGiXQ57FFOBCo2j", "Z1k2a4cknNke6aCh8ssxRFJ66FmodiBm"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C23257A A04;
    public C23257A A05;
    public C23257A A06;
    public Object A07;
    public boolean A08;
    public final C5031pl A09 = new C5031pl();
    public final C5029pj A0A = new C5029pj();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C4912no A06(Timeline timeline, Object obj, long j2, long j3, C5031pl c5031pl) {
        timeline.A0J(obj, c5031pl);
        int iA08 = c5031pl.A08(j2);
        return iA08 == -1 ? new C4912no(obj, j3) : new C4912no(obj, iA08, c5031pl.A05(iA08), j3);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final C23267B A0I(Timeline timeline, C23267B c23267b) {
        long jA0A;
        long j2 = c23267b.A01;
        boolean zA08 = A08(timeline, c23267b.A04, j2);
        boolean zA09 = A09(timeline, c23267b.A04, zA08);
        timeline.A0J(c23267b.A04.A04, this.A09);
        if (c23267b.A04.A00()) {
            jA0A = this.A09.A0E(c23267b.A04.A00, c23267b.A04.A01);
        } else {
            jA0A = j2 == Long.MIN_VALUE ? this.A09.A0A() : j2;
        }
        return new C23267B(c23267b.A04, c23267b.A03, j2, c23267b.A02, jA0A, zA08, zA09);
    }

    private long A00(Timeline timeline, Object obj) {
        int oldFrontPeriodIndex;
        int holderWindowIndex = timeline.A0J(obj, this.A09).A00;
        if (this.A07 != null && (oldFrontPeriodIndex = timeline.A0A(this.A07)) != -1) {
            int windowIndex = timeline.A0H(oldFrontPeriodIndex, this.A09).A00;
            if (windowIndex == holderWindowIndex) {
                return this.A03;
            }
        }
        for (C23257A mediaPeriodHolder = A0D(); mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.A0I()) {
            if (mediaPeriodHolder.A08.equals(obj)) {
                return mediaPeriodHolder.A00.A04.A03;
            }
        }
        for (C23257A c23257aA0D = A0D(); c23257aA0D != null; c23257aA0D = c23257aA0D.A0I()) {
            int iA0A = timeline.A0A(c23257aA0D.A08);
            if (iA0A != -1) {
                int windowIndex2 = timeline.A0H(iA0A, this.A09).A00;
                if (windowIndex2 == holderWindowIndex) {
                    return c23257aA0D.A00.A04.A03;
                }
            }
        }
        long j2 = this.A02;
        this.A02 = 1 + j2;
        return j2;
    }

    private C23267B A01(Timeline timeline, C23257A c23257a, long j2) {
        long jLongValue;
        C23297E c23297e = this;
        C23267B c23267b = c23257a.A00;
        if (c23267b.A07) {
            int iA0A = timeline.A0A(c23267b.A04.A04);
            C5031pl c5031pl = c23297e.A09;
            C5029pj c5029pj = c23297e.A0A;
            int currentPeriodIndex = c23297e.A01;
            int iA09 = timeline.A09(iA0A, c5031pl, c5029pj, currentPeriodIndex, c23297e.A08);
            if (iA09 == -1) {
                return null;
            }
            int i2 = timeline.A0I(iA09, c23297e.A09, true).A00;
            Object obj = c23297e.A09.A04;
            long j3 = c23267b.A04.A03;
            if (timeline.A0K(i2, c23297e.A0A).A00 == iA09) {
                Pair<Object, Long> defaultPosition = timeline.A0F(c23297e.A0A, c23297e.A09, i2, -9223372036854775807L, Math.max(0L, (c23257a.A0B() + c23267b.A00) - j2));
                if (defaultPosition == null) {
                    return null;
                }
                obj = defaultPosition.first;
                jLongValue = ((Long) defaultPosition.second).longValue();
                C23257A c23257aA0I = c23257a.A0I();
                if (c23257aA0I != null && c23257aA0I.A08.equals(obj)) {
                    j3 = c23257aA0I.A00.A04.A03;
                    c23297e = this;
                } else {
                    c23297e = this;
                    j3 = c23297e.A02;
                    long startPositionUs = 1 + j3;
                    String[] strArr = A0B;
                    if (strArr[6].length() == strArr[4].length()) {
                        throw new RuntimeException();
                    }
                    A0B[0] = "5yy5YdDharfiXP";
                    c23297e.A02 = startPositionUs;
                }
            } else {
                jLongValue = 0;
            }
            return A02(timeline, A06(timeline, obj, jLongValue, j3, c23297e.A09), jLongValue, jLongValue);
        }
        C4912no c4912no = c23267b.A04;
        timeline.A0J(c4912no.A04, c23297e.A09);
        if (c4912no.A00()) {
            int i3 = c4912no.A00;
            int iA04 = c23297e.A09.A04(i3);
            if (iA04 != -1) {
                int iA06 = c23297e.A09.A06(i3, c4912no.A01);
                if (iA06 < iA04) {
                    if (!c23297e.A09.A0I(i3, iA06)) {
                        return null;
                    }
                    return A03(timeline, c4912no.A04, i3, iA06, c23267b.A02, c4912no.A03);
                }
                return A04(timeline, c4912no.A04, c23267b.A02, c4912no.A03);
            }
            String[] strArr2 = A0B;
            if (strArr2[5].length() != strArr2[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0B;
            strArr3[5] = "";
            strArr3[1] = "";
            return null;
        }
        if (c23267b.A01 != Long.MIN_VALUE) {
            int iA08 = c23297e.A09.A08(c23267b.A01);
            if (iA08 == -1) {
                return A04(timeline, c4912no.A04, c23267b.A01, c4912no.A03);
            }
            int iA05 = c23297e.A09.A05(iA08);
            if (!c23297e.A09.A0I(iA08, iA05)) {
                return null;
            }
            return A03(timeline, c4912no.A04, iA08, iA05, c23267b.A01, c4912no.A03);
        }
        int iA03 = c23297e.A09.A03();
        if (iA03 == 0) {
            return null;
        }
        int i4 = iA03 - 1;
        if (A0B[7].charAt(7) == 'k') {
            A0B[0] = "u0JZC9rSowd61rcMlDOlOE";
            if (c23297e.A09.A0D(i4) != Long.MIN_VALUE) {
                return null;
            }
        } else if (c23297e.A09.A0D(i4) != Long.MIN_VALUE) {
            return null;
        }
        if (c23297e.A09.A0H(i4)) {
            return null;
        }
        int iA07 = c23297e.A09.A05(i4);
        if (!c23297e.A09.A0I(i4, iA07)) {
            return null;
        }
        return A03(timeline, c4912no.A04, i4, iA07, c23297e.A09.A0A(), c4912no.A03);
    }

    private C23267B A02(Timeline timeline, C4912no c4912no, long j2, long j3) {
        timeline.A0J(c4912no.A04, this.A09);
        if (c4912no.A00()) {
            if (!this.A09.A0I(c4912no.A00, c4912no.A01)) {
                return null;
            }
            return A03(timeline, c4912no.A04, c4912no.A00, c4912no.A01, j2, c4912no.A03);
        }
        return A04(timeline, c4912no.A04, j3, c4912no.A03);
    }

    private C23267B A03(Timeline timeline, Object obj, int i2, int i3, long startPositionUs, long j2) {
        long jA09;
        C4912no c4912no = new C4912no(obj, i2, i3, j2);
        boolean zA08 = A08(timeline, c4912no, Long.MIN_VALUE);
        boolean zA09 = A09(timeline, c4912no, zA08);
        long jA0E = timeline.A0J(c4912no.A04, this.A09).A0E(c4912no.A00, c4912no.A01);
        if (i3 == this.A09.A05(i2)) {
            C5031pl c5031pl = this.A09;
            if (A0B[0].length() == 8) {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[6] = "btiW32P1CxlKUaykVb";
            strArr[4] = "aD0NnH";
            jA09 = c5031pl.A09();
        } else {
            jA09 = 0;
        }
        return new C23267B(c4912no, jA09, Long.MIN_VALUE, startPositionUs, jA0E, zA08, zA09);
    }

    private C23267B A04(Timeline timeline, Object obj, long j2, long j3) {
        long jA0D;
        long jA0A;
        C4912no c4912no = new C4912no(obj, j3);
        timeline.A0J(c4912no.A04, this.A09);
        int iA07 = this.A09.A07(j2);
        if (iA07 == -1) {
            jA0D = Long.MIN_VALUE;
        } else {
            C5031pl c5031pl = this.A09;
            String[] strArr = A0B;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[6] = "hcjC8Oe5bspAHclLrN";
            strArr2[4] = "7U4c4Z";
            jA0D = c5031pl.A0D(iA07);
        }
        boolean isLastInTimeline = A08(timeline, c4912no, jA0D);
        boolean zA09 = A09(timeline, c4912no, isLastInTimeline);
        if (jA0D == Long.MIN_VALUE) {
            jA0A = this.A09.A0A();
        } else {
            jA0A = jA0D;
        }
        return new C23267B(c4912no, j2, jA0D, -9223372036854775807L, jA0A, isLastInTimeline, zA09);
    }

    private C23267B A05(C23507Z c23507z) {
        return A02(c23507z.A03, c23507z.A05, c23507z.A01, c23507z.A02);
    }

    private boolean A07(Timeline timeline) {
        C23257A nextMediaPeriodHolder = A0D();
        if (nextMediaPeriodHolder == null) {
            return true;
        }
        int iA0A = timeline.A0A(nextMediaPeriodHolder.A08);
        if (A0B[3].length() != 26) {
            A0B[0] = "XXauRi";
            while (true) {
                iA0A = timeline.A09(iA0A, this.A09, this.A0A, this.A01, this.A08);
                while (lastValidPeriodHolder != null && !nextMediaPeriodHolder.A00.A07) {
                    nextMediaPeriodHolder = nextMediaPeriodHolder.A0I();
                }
                C23257A c23257aA0I = nextMediaPeriodHolder.A0I();
                if (iA0A == -1 || c23257aA0I == null || timeline.A0A(c23257aA0I.A08) != iA0A) {
                    boolean zA0S = A0S(nextMediaPeriodHolder);
                    String[] strArr = A0B;
                    if (strArr[5].length() != strArr[1].length()) {
                        nextMediaPeriodHolder.A00 = A0I(timeline, nextMediaPeriodHolder.A00);
                        if (!zA0S) {
                            return true;
                        }
                    } else {
                        String[] strArr2 = A0B;
                        strArr2[6] = "90zfs8gzmg4UDoZfId";
                        strArr2[4] = "a4jnrj";
                        nextMediaPeriodHolder.A00 = A0I(timeline, nextMediaPeriodHolder.A00);
                        if (!zA0S) {
                            return true;
                        }
                    }
                    return !A0N();
                }
                nextMediaPeriodHolder = c23257aA0I;
                if (A0B[7].charAt(7) != 'k') {
                    break;
                }
                A0B[2] = "Cr1P4n0WQ70sIc2hdXVlmIoPdJb3W1mn";
            }
        }
        throw new RuntimeException();
    }

    private boolean A08(Timeline timeline, C4912no c4912no, long j2) {
        int adGroupCount = timeline.A0J(c4912no.A04, this.A09).A03();
        if (adGroupCount == 0) {
            return true;
        }
        int i2 = adGroupCount - 1;
        boolean zA00 = c4912no.A00();
        if (this.A09.A0D(i2) != Long.MIN_VALUE) {
            return !zA00 && j2 == Long.MIN_VALUE;
        }
        int lastAdGroupIndex = this.A09.A04(i2);
        if (lastAdGroupIndex == -1) {
            return false;
        }
        if (((zA00 && c4912no.A00 == i2 && c4912no.A01 == lastAdGroupIndex + (-1)) ? 1 : 0) == 0) {
            return !zA00 && this.A09.A05(i2) == lastAdGroupIndex;
        }
        return true;
    }

    private boolean A09(Timeline timeline, C4912no c4912no, boolean z) {
        int iA0A = timeline.A0A(c4912no.A04);
        return !timeline.A0K(timeline.A0H(iA0A, this.A09).A00, this.A0A).A0D && timeline.A0O(iA0A, this.A09, this.A0A, this.A01, this.A08) && z;
    }

    private boolean A0A(C23257A c23257a, C23267B c23267b) {
        C23267B c23267b2 = c23257a.A00;
        return c23267b2.A03 == c23267b.A03 && c23267b2.A01 == c23267b.A01 && c23267b2.A04.equals(c23267b.A04);
    }

    public final C23257A A0B() {
        if (this.A05 != null) {
            if (this.A05 == this.A06) {
                C23257A c23257a = this.A05;
                if (A0B[3].length() == 26) {
                    throw new RuntimeException();
                }
                A0B[2] = "cSlSOVjTMxyZvCYIIsIM7Z4RVriFSMIi";
                this.A06 = c23257a.A0I();
            }
            this.A05.A0M();
            this.A05 = this.A05.A0I();
            this.A00--;
            if (this.A00 == 0) {
                this.A04 = null;
            }
        } else {
            this.A05 = this.A04;
            this.A06 = this.A04;
        }
        C23257A c23257a2 = this.A05;
        if (A0B[0].length() != 8) {
            A0B[7] = "hdbErrckm1X5j4dXkt1ObCB8O8NcABpS";
            return c23257a2;
        }
        A0B[3] = "prScRK6qkOjWt";
        return c23257a2;
    }

    public final C23257A A0C() {
        AbstractC21273y.A08((this.A06 == null || this.A06.A0I() == null) ? false : true);
        this.A06 = this.A06.A0I();
        return this.A06;
    }

    public final C23257A A0D() {
        return A0N() ? this.A05 : this.A04;
    }

    public final C23257A A0E() {
        return this.A04;
    }

    public final C23257A A0F() {
        return this.A05;
    }

    public final C23257A A0G() {
        return this.A06;
    }

    public final C23267B A0H(long j2, C23507Z c23507z) {
        if (this.A04 == null) {
            return A05(c23507z);
        }
        return A01(c23507z.A03, this.A04, j2);
    }

    public final InterfaceC4913np A0J(InterfaceC23667p[] interfaceC23667pArr, long j2, AbstractC2787Ew abstractC2787Ew, InterfaceC2791F0 interfaceC2791F0, InterfaceC2664Cx interfaceC2664Cx, C23267B c23267b, C2788Ex c2788Ex) {
        long jA0B;
        if (this.A04 != null) {
            jA0B = this.A04.A0B() + this.A04.A00.A00;
        } else {
            jA0B = c23267b.A03 + j2;
        }
        C23257A c23257a = new C23257A(interfaceC23667pArr, jA0B, abstractC2787Ew, interfaceC2791F0, interfaceC2664Cx, c23267b, c2788Ex);
        if (this.A04 != null) {
            AbstractC21273y.A08(A0N());
            this.A04.A0Q(c23257a);
        }
        this.A07 = null;
        this.A04 = c23257a;
        this.A00++;
        return c23257a.A07;
    }

    public final C4912no A0K(Timeline timeline, Object obj, long j2) {
        return A06(timeline, obj, j2, A00(timeline, obj), this.A09);
    }

    public final void A0L(long j2) {
        if (this.A04 != null) {
            this.A04.A0P(j2);
        }
    }

    public final void A0M(boolean z) {
        C23257A c23257aA0D = A0D();
        if (c23257aA0D != null) {
            this.A07 = z ? c23257aA0D.A08 : null;
            this.A03 = c23257aA0D.A00.A04.A03;
            c23257aA0D.A0M();
            A0S(c23257aA0D);
        } else if (!z) {
            this.A07 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A0N() {
        return this.A05 != null;
    }

    public final boolean A0O() {
        if (this.A04 != null) {
            if (!this.A04.A00.A05 && this.A04.A0R()) {
                long j2 = this.A04.A00.A00;
                if (A0B[2].charAt(6) == 'F') {
                    throw new RuntimeException();
                }
                A0B[3] = "WQJhcBpqvfFlde6mvMcdcISTeYvrM";
                if (j2 == -9223372036854775807L || this.A00 >= 100) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A0P(Timeline timeline, int i2) {
        this.A01 = i2;
        return A07(timeline);
    }

    public final boolean A0Q(Timeline timeline, C4912no c4912no, long j2) {
        int iA0A = timeline.A0A(c4912no.A04);
        C23257A c23257a = null;
        for (C23257A c23257aA0D = A0D(); c23257aA0D != null; c23257aA0D = c23257aA0D.A0I()) {
            if (c23257a == null) {
                c23257aA0D.A00 = A0I(timeline, c23257aA0D.A00);
            } else {
                if (iA0A != -1) {
                    boolean zEquals = c23257aA0D.A08.equals(timeline.A0M(iA0A));
                    if (A0B[3].length() == 26) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0B;
                    strArr[6] = "ytUDxXblB5dYuzkyb9";
                    strArr[4] = "n5GR8r";
                    if (zEquals) {
                        C23267B c23267bA01 = A01(timeline, c23257a, j2);
                        if (c23267bA01 == null) {
                            return true ^ A0S(c23257a);
                        }
                        c23257aA0D.A00 = A0I(timeline, c23257aA0D.A00);
                        if (!A0A(c23257aA0D, c23267bA01)) {
                            return true ^ A0S(c23257a);
                        }
                    }
                }
                return true ^ A0S(c23257a);
            }
            if (c23257aA0D.A00.A07) {
                iA0A = timeline.A09(iA0A, this.A09, this.A0A, this.A01, this.A08);
            }
            c23257a = c23257aA0D;
        }
        return true;
    }

    public final boolean A0R(Timeline timeline, boolean z) {
        this.A08 = z;
        return A07(timeline);
    }

    public final boolean A0S(C23257A c23257a) {
        AbstractC21273y.A08(c23257a != null);
        boolean z = false;
        this.A04 = c23257a;
        while (c23257a.A0I() != null) {
            c23257a = c23257a.A0I();
            if (c23257a == this.A06) {
                this.A06 = this.A05;
                z = true;
            }
            c23257a.A0M();
            this.A00--;
        }
        this.A04.A0Q(null);
        return z;
    }

    public final boolean A0T(InterfaceC4913np interfaceC4913np) {
        return this.A04 != null && this.A04.A07 == interfaceC4913np;
    }
}
