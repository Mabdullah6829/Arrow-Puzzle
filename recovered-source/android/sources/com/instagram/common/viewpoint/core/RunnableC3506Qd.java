package com.instagram.common.viewpoint.core;

import androidx.core.location.LocationRequestCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qd */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class RunnableC3506Qd implements Runnable {
    public static Comparator<C3505Qc> A04;
    public static byte[] A05;
    public static String[] A06 = {"ZWObiMwNkhaZGfEgqHenCxQvRQCezgXM", "iKaB5ntiNbaiz6tgW", "JplxjEE1IYbCInXXNCkbxZV0", "UEoPOy6vCmPnpiXEMXmcZKvRtDoHf0nN", "JvUlYJe7lgtJoJN1gtwvhyIs", "RcG3r4ysor4dcgCWVGn8CFYsdgQ7jZkt", "cxmAjzJ", "EyohaYHYoMvb6y9gFGiucolIeU60NsdM"};
    public static final ThreadLocal<RunnableC3506Qd> A07;
    public long A00;
    public long A01;
    public ArrayList<C23377M> A02 = new ArrayList<>();
    public ArrayList<C3505Qc> A03 = new ArrayList<>();

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{105, 109, 27, 117, 94, 72, 79, 94, 95, 27, 107, 73, 94, 93, 94, 79, 88, 83, 100, 96, 22, 102, 68, 83, 80, 83, 66, 85, 94};
    }

    static {
        A03();
        A07 = new ThreadLocal<>();
        A04 = new C3504Qb();
    }

    private AbstractC3548RK A00(C23377M c23377m, int i2, long j2) {
        if (A08(c23377m, i2)) {
            return null;
        }
        C3538RA c3538ra = c23377m.A0r;
        try {
            c23377m.A1M();
            AbstractC3548RK abstractC3548RKA0I = c3538ra.A0I(i2, false, j2);
            if (abstractC3548RKA0I != null) {
                if (abstractC3548RKA0I.A0e() && !abstractC3548RKA0I.A0f()) {
                    c3538ra.A0T(abstractC3548RKA0I.A0H);
                } else {
                    c3538ra.A0Z(abstractC3548RKA0I, false);
                }
            }
            return abstractC3548RKA0I;
        } finally {
            c23377m.A1o(false);
        }
    }

    private void A02() {
        C3505Qc c3505Qc;
        int size = this.A02.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C23377M c23377m = this.A02.get(i3);
            int viewCount = c23377m.getWindowVisibility();
            if (viewCount == 0) {
                c23377m.A02.A04(c23377m, false);
                int viewCount2 = c23377m.A02.A00;
                i2 += viewCount2;
            }
        }
        this.A03.ensureCapacity(i2);
        int j2 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C23377M c23377m2 = this.A02.get(i4);
            int viewCount3 = c23377m2.getWindowVisibility();
            if (viewCount3 == 0) {
                C4565hs c4565hs = c23377m2.A02;
                int viewCount4 = c4565hs.A01;
                int i5 = Math.abs(viewCount4);
                int viewCount5 = c4565hs.A02;
                int i6 = i5 + Math.abs(viewCount5);
                for (int i7 = 0; i7 < viewCount * 2; i7 += 2) {
                    int viewCount6 = this.A03.size();
                    if (j2 >= viewCount6) {
                        c3505Qc = new C3505Qc();
                        this.A03.add(c3505Qc);
                    } else {
                        c3505Qc = this.A03.get(j2);
                    }
                    int totalTaskCount = i7 + 1;
                    int totalTaskIndex = c4565hs.A03[totalTaskCount];
                    c3505Qc.A04 = totalTaskIndex <= i6;
                    c3505Qc.A02 = i6;
                    c3505Qc.A00 = totalTaskIndex;
                    c3505Qc.A03 = c23377m2;
                    int totalTaskCount2 = c4565hs.A03[i7];
                    c3505Qc.A01 = totalTaskCount2;
                    j2++;
                }
            }
        }
        Collections.sort(this.A03, A04);
    }

    private void A04(long j2) {
        for (int i2 = 0; i2 < i; i2++) {
            C3505Qc c3505Qc = this.A03.get(i2);
            if (A06[7].charAt(15) != 'g') {
                throw new RuntimeException();
            }
            A06[6] = "gpZ2KV2";
            C3505Qc c3505Qc2 = c3505Qc;
            if (c3505Qc2.A03 == null) {
                return;
            }
            A06(c3505Qc2, j2);
            c3505Qc2.A00();
        }
    }

    private final void A05(long j2) {
        A02();
        A04(j2);
    }

    private void A06(C3505Qc c3505Qc, long j2) {
        AbstractC3548RK abstractC3548RKA00 = A00(c3505Qc.A03, c3505Qc.A01, c3505Qc.A04 ? LocationRequestCompat.PASSIVE_INTERVAL : j2);
        if (abstractC3548RKA00 != null && abstractC3548RKA00.A09 != null && abstractC3548RKA00.A0e() && !abstractC3548RKA00.A0f()) {
            C23377M c23377m = abstractC3548RKA00.A09.get();
            if (A06[3].charAt(4) != 'O') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[0] = "y01bdO2VJYUoPT1JEr7HCeGbjhjinZRt";
            strArr[5] = "ogbTL45N3M3fzw26YptkCantwmvhDLLM";
            A07(c23377m, j2);
        }
    }

    private void A07(C23377M c23377m, long j2) {
        if (c23377m == null) {
            return;
        }
        if (c23377m.A0C && c23377m.A01.A06() != 0) {
            c23377m.A1P();
        }
        C4565hs c4565hs = c23377m.A02;
        c4565hs.A04(c23377m, true);
        if (c4565hs.A00 != 0) {
            try {
                AbstractC3412P4.A01(A01(0, 18, 83));
                c23377m.A0s.A05(c23377m.A04);
                for (int i2 = 0; i2 < c4565hs.A00 * 2; i2 += 2) {
                    A00(c23377m, c4565hs.A03[i2], j2);
                }
                AbstractC3412P4.A00();
            } catch (Throwable th) {
                AbstractC3412P4.A00();
                throw th;
            }
        }
    }

    public static boolean A08(C23377M c23377m, int i2) {
        int iA06 = c23377m.A01.A06();
        for (int i3 = 0; i3 < iA06; i3++) {
            AbstractC3548RK abstractC3548RKA0F = C23377M.A0F(c23377m.A01.A0A(i3));
            int childCount = abstractC3548RKA0F.A03;
            if (childCount == i2 && !abstractC3548RKA0F.A0f()) {
                return true;
            }
        }
        return false;
    }

    public final void A09(C23377M c23377m) {
        this.A02.add(c23377m);
    }

    public final void A0A(C23377M c23377m) {
        this.A02.remove(c23377m);
    }

    public final void A0B(C23377M c23377m, int i2, int i3) {
        if (c23377m.isAttachedToWindow()) {
            long j2 = this.A01;
            String[] strArr = A06;
            if (strArr[0].charAt(20) != strArr[5].charAt(20)) {
                throw new RuntimeException();
            }
            A06[6] = "T8Y6UBY";
            if (j2 == 0) {
                this.A01 = c23377m.getNanoTime();
                c23377m.post(this);
            }
        }
        c23377m.A02.A03(i2, i3);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC3412P4.A01(A01(18, 11, 94));
            if (this.A02.isEmpty()) {
                this.A01 = 0L;
                if (A06[6].length() != 7) {
                    throw new RuntimeException();
                }
                A06[7] = "jOxF3Mzmcdx8L8GgZmI4I6pGAsyGGZV3";
                AbstractC3412P4.A00();
                return;
            }
            int size = this.A02.size();
            long jMax = 0;
            for (int i2 = 0; i2 < size; i2++) {
                C23377M c23377m = this.A02.get(i2);
                if (c23377m.getWindowVisibility() == 0) {
                    jMax = Math.max(c23377m.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.A01 = 0L;
                AbstractC3412P4.A00();
            } else {
                A05(TimeUnit.MILLISECONDS.toNanos(jMax) + this.A00);
                this.A01 = 0L;
                AbstractC3412P4.A00();
            }
        } catch (Throwable th) {
            this.A01 = 0L;
            AbstractC3412P4.A00();
            throw th;
        }
    }
}
