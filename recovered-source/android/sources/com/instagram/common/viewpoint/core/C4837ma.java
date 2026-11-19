package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ma */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4837ma extends AbstractC2970Hu {
    public static byte[] A06;
    public static String[] A07 = {"k0wYTkKie1JHeFYg", "DKl7H6qsoN4MQmGVFxhVfc9YoKR", "eOp5RF4DxMr8YboQGZKTl4GQk1b", "2gSlciuhxyUpZq2z", "EzoVAngWIMXE2t797gVmsxYwwugMTqE8", "YSwU3mnkrzPmwh4w8hA9Gpc9iPzLacTq", "wmfh6", "T9R7fvqNl5WyvyD6SUGUJNeU84vDYmq7"};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final C21864v A04;
    public final C21864v A05;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{68, 123, 118, 119, 125, 50, 116, 125, 96, 127, 115, 102, 50, 124, 125, 102, 50, 97, 103, 98, 98, 125, 96, 102, 119, 118, 40, 50, 43, 52, 57, 56, 50, 114, 60, 43, 62};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.AbstractC2970Hu
    public final boolean A0C(C21864v c21864v, long j2) throws C20883K {
        int iA0I = c21864v.A0I();
        long jA0D = j2 + (((long) c21864v.A0D()) * 1000);
        if (iA0I == 0 && !this.A02) {
            C21864v c21864v2 = new C21864v(new byte[c21864v.A07()]);
            c21864v.A0k(c21864v2.A0l(), 0, c21864v.A07());
            C2909Gv c2909GvA00 = C2909Gv.A00(c21864v2);
            this.A01 = c2909GvA00.A02;
            super.A00.A6e(new C20592p().A11(A00(28, 9, 29)).A0w(c2909GvA00.A04).A0r(c2909GvA00.A03).A0f(c2909GvA00.A01).A0Y(c2909GvA00.A00).A12(c2909GvA00.A05).A14());
            this.A02 = true;
            return false;
        }
        if (iA0I != 1 || !this.A02) {
            return false;
        }
        int i2 = this.A00;
        if (A07[1].length() != 27) {
            throw new RuntimeException();
        }
        A07[5] = "ywa4QqUhdtSZ68DIQ13xWUOznnvwilgI";
        boolean z = i2 == 1;
        if (A07[2].length() == 28) {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[6] = "IIAwH";
        strArr[0] = "qu1M6PwQ9kLePSP6";
        if (!this.A03 && !z) {
            return false;
        }
        byte[] bArrA0l = this.A04.A0l();
        bArrA0l[0] = 0;
        bArrA0l[1] = 0;
        bArrA0l[2] = 0;
        int i3 = 4 - this.A01;
        int i4 = 0;
        while (c21864v.A07() > 0) {
            c21864v.A0k(this.A04.A0l(), i3, this.A01);
            this.A04.A0f(0);
            int iA0L = this.A04.A0L();
            this.A05.A0f(0);
            super.A00.AIr(this.A05, 4);
            super.A00.AIr(c21864v, iA0L);
            i4 = i4 + 4 + iA0L;
        }
        super.A00.AIu(jA0D, z ? 1 : 0, i4, 0, null);
        this.A03 = true;
        return true;
    }

    static {
        A01();
    }

    public C4837ma(InterfaceC2953Hd interfaceC2953Hd) {
        super(interfaceC2953Hd);
        this.A05 = new C21864v(AbstractC2942HS.A03);
        this.A04 = new C21864v(4);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2970Hu
    public final boolean A0B(C21864v c21864v) throws C4838mb {
        int iA0I = c21864v.A0I();
        int header = iA0I >> 4;
        int frameType = header & 15;
        int i2 = iA0I & 15;
        if (i2 == 7) {
            this.A00 = frameType;
            return frameType != 5;
        }
        throw new C4838mb(A00(0, 28, 82) + i2);
    }
}
