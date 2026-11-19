package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1V */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C19791V extends C24058S implements Comparable<C19791V> {
    public static String[] A01 = {"kvWdB3TE4F02CvBMsBFKzpbhVf73VbPo", "pIhQPOOT2xsrqrTjtTEUrnlklrU2j4Xx", "pdYckjhCIzgQgDgJpRux4fo9y3MK9tam", "XLFgtw4chSUawlDhyOF7PI6ZgPIPNXPT", "wXiI6RESjxFaJi9cRzlxvGX2h498oRyj", "Xh6QYYa7B1600WPBULoDPW4oSxfbsPz9", "bCs754CcQZSDfR1NSOnMEHTumHpSYrD0", "OFiOLoEO5ZOYdCRe7y5ePAMAMobk5MLR"};
    public long A00;

    public C19791V() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C19791V c19791v) {
        if (A05() != c19791v.A05()) {
            return A05() ? 1 : -1;
        }
        long j2 = this.A01 - c19791v.A01;
        if (j2 == 0) {
            long j3 = this.A00;
            long delta = c19791v.A00;
            j2 = j3 - delta;
            if (j2 == 0) {
                return 0;
            }
        }
        String[] strArr = A01;
        if (strArr[7].charAt(9) != strArr[6].charAt(9)) {
            throw new RuntimeException();
        }
        A01[5] = "UnaoajjPsJhIzAMYj8TXxoU3mdsqoDpP";
        return j2 > 0 ? 1 : -1;
    }
}
