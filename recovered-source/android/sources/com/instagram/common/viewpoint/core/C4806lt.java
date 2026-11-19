package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4806lt extends AbstractC3074Jb {
    public static byte[] A05;
    public static String[] A06 = {"uV3egKqPt", "vbtXlOI", "gip2ILD7nBGTUOP5yb7zSULibNYEk", "ypzju5tbq0Qdtgd67o3qNaulkzBfCJSX", "gCa1Tkio4U0hXnRqOcWVPONwWAtrpMS5", "m", "OXoEHzgO5FTzqO33f", "i"};
    public int A00;
    public C2957Hh A01;
    public C2959Hj A02;
    public C3075Jc A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C3075Jc A02(C21864v c21864v) throws IOException {
        if (this.A02 == null) {
            this.A02 = AbstractC2960Hk.A06(c21864v);
            return null;
        }
        if (this.A01 == null) {
            this.A01 = AbstractC2960Hk.A04(c21864v);
            return null;
        }
        C2959Hj c2959Hj = this.A02;
        C2957Hh c2957Hh = this.A01;
        byte[] bArr = new byte[c21864v.A0A()];
        System.arraycopy(c21864v.A0l(), 0, bArr, 0, c21864v.A0A());
        C2958Hi[] c2958HiArrA0D = AbstractC2960Hk.A0D(c21864v, c2959Hj.A05);
        return new C3075Jc(c2959Hj, c2957Hh, bArr, c2958HiArrA0D, AbstractC2960Hk.A00(c2958HiArrA0D.length - 1));
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-108, -88, -105, -100, -94, 98, -87, -94, -91, -107, -100, -90};
    }

    static {
        A04();
    }

    public static int A00(byte b, int i2, int i3) {
        return (b >> i3) & (255 >>> (8 - i2));
    }

    public static int A01(byte b, C3075Jc c3075Jc) {
        if (!c3075Jc.A04[A00(b, c3075Jc.A00, 1)].A03) {
            int modeNumber = c3075Jc.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = c3075Jc.A02.A04;
        return modeNumber2;
    }

    public static void A05(C21864v c21864v, long j2) {
        if (c21864v.A08() < c21864v.A0A() + 4) {
            c21864v.A0i(Arrays.copyOf(c21864v.A0l(), c21864v.A0A() + 4));
        } else {
            c21864v.A0e(c21864v.A0A() + 4);
        }
        byte[] bArrA0l = c21864v.A0l();
        bArrA0l[c21864v.A0A() - 4] = (byte) (j2 & 255);
        bArrA0l[c21864v.A0A() - 3] = (byte) ((j2 >>> 8) & 255);
        bArrA0l[c21864v.A0A() - 2] = (byte) ((j2 >>> 16) & 255);
        bArrA0l[c21864v.A0A() - 1] = (byte) (255 & (j2 >>> 24));
    }

    public static boolean A06(C21864v c21864v) {
        try {
            return AbstractC2960Hk.A0C(1, c21864v, true);
        } catch (C20883K unused) {
            return false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3074Jb
    public final long A09(C21864v c21864v) {
        int i2 = 0;
        if ((c21864v.A0l()[0] & 1) == 1) {
            return -1L;
        }
        byte b = c21864v.A0l()[0];
        if (A06[4].charAt(1) != 'C') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[0] = "17tCp0Qcd";
        strArr[6] = "uqZ30DdcDRhFwj0kQ";
        int samplesInPacket = A01(b, (C3075Jc) AbstractC21273y.A02(this.A03));
        if (this.A04) {
            int packetBlockSize = this.A00;
            i2 = (packetBlockSize + samplesInPacket) / 4;
        }
        A05(c21864v, i2);
        this.A04 = true;
        this.A00 = samplesInPacket;
        return i2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3074Jb
    public final void A0A(long j2) {
        super.A0A(j2);
        this.A04 = j2 != 0;
        this.A00 = this.A02 != null ? this.A02.A03 : 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3074Jb
    public final void A0B(boolean z) {
        super.A0B(z);
        if (z) {
            this.A03 = null;
            this.A02 = null;
            this.A01 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3074Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(C21864v c21864v, long j2, C3073Ja c3073Ja) throws IOException {
        if (this.A03 != null) {
            AbstractC21273y.A01(c3073Ja.A00);
            return false;
        }
        this.A03 = A02(c21864v);
        if (this.A03 == null) {
            return true;
        }
        C3075Jc c3075Jc = this.A03;
        C2959Hj c2959Hj = c3075Jc.A02;
        ArrayList<byte[]> codecInitializationData = new ArrayList<>();
        codecInitializationData.add(c2959Hj.A09);
        codecInitializationData.add(c3075Jc.A03);
        c3073Ja.A00 = new C20592p().A11(A03(0, 12, 22)).A0a(c2959Hj.A02).A0j(c2959Hj.A00).A0b(c2959Hj.A05).A0m(c2959Hj.A06).A12(codecInitializationData).A0v(AbstractC2960Hk.A02(MetaExoPlayerCustomizedCollections.A02(c3075Jc.A01.A02))).A14();
        return true;
    }
}
