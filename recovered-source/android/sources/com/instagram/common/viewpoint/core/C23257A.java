package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7A */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C23257A {
    public static byte[] A0E;
    public static String[] A0F = {"qTjlphzGhjtz23pZpbkrfGV3", "gcvQ0aFRAZsVeDDMvPpq9fmBIR43z3dS", "1g2pSH5s64tGUAh3eJ0e3X43Q9jzw3mq", "lB1M4R9KcDs1NZsKBVQ3JQYLP4RbMvTH", "7AgciWFjZyCuzmH359m88XAJrahqi7eF", "Et2BwvNp", "Oz1eJxJHgMWzrYsZQ0zZlFN1YCxGY3CZ", "Iy7o67ktSbvMBIxm3lxnuK7UTKgUaVFx"};
    public C23267B A00;
    public boolean A01;
    public boolean A02;
    public long A03;
    public C23257A A04;
    public C4894nW A05 = C4894nW.A06;
    public C2788Ex A06;
    public final InterfaceC4913np A07;
    public final Object A08;
    public final InterfaceC2696DT[] A09;
    public final InterfaceC232479 A0A;
    public final AbstractC2787Ew A0B;
    public final InterfaceC23667p[] A0C;
    public final boolean[] A0D;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0E = new byte[]{81, 121, 120, 117, 125, 76, 121, 110, 117, 115, 120, 84, 115, 112, 120, 121, 110, 28, 41, 62, 37, 35, 40, 108, 62, 41, 32, 41, 45, 63, 41, 108, 42, 45, 37, 32, 41, 40, 98};
    }

    static {
        A04();
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old exoplayer method. requires deleting")
    public C23257A(InterfaceC23667p[] interfaceC23667pArr, long j2, AbstractC2787Ew abstractC2787Ew, InterfaceC2791F0 interfaceC2791F0, InterfaceC2664Cx interfaceC2664Cx, C23267B c23267b, C2788Ex c2788Ex) {
        this.A0C = interfaceC23667pArr;
        this.A03 = j2 - c23267b.A03;
        this.A0B = abstractC2787Ew;
        this.A08 = AbstractC21273y.A01(c23267b.A04.A04);
        this.A00 = c23267b;
        this.A06 = c2788Ex;
        this.A09 = new InterfaceC2696DT[interfaceC23667pArr.length];
        this.A0D = new boolean[interfaceC23667pArr.length];
        this.A0A = new C4974op(this, interfaceC2664Cx);
        this.A07 = A00(c23267b.A04, this.A0A, interfaceC2791F0, c23267b.A03, c23267b.A01);
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "MediaSourceList is temporarily changed to MediaSourceAdapter")
    public static InterfaceC4913np A00(C4912no c4912no, InterfaceC232479 interfaceC232479, InterfaceC2791F0 interfaceC2791F0, long j2, long j3) {
        InterfaceC4913np interfaceC4913npA5W = interfaceC232479.A5W(c4912no, interfaceC2791F0, j2);
        if (j3 != -9223372036854775807L) {
            return new C24789v(interfaceC4913npA5W, true, 0L, j3);
        }
        return interfaceC4913npA5W;
    }

    private void A02() {
        if (!A08()) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            boolean rendererEnabled = this.A06.A00(i2);
            InterfaceC4876nE interfaceC4876nE = this.A06.A04[i2];
            if (rendererEnabled && interfaceC4876nE != null) {
                interfaceC4876nE.A5x();
            }
        }
    }

    private void A03() {
        if (!A08()) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            boolean rendererEnabled = this.A06.A00(i2);
            InterfaceC4876nE interfaceC4876nE = this.A06.A04[i2];
            if (rendererEnabled && interfaceC4876nE != null) {
                interfaceC4876nE.A6K();
            }
        }
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Temporary bridging of MediaSourceList with MediaSourceAdapter")
    public static void A05(InterfaceC232479 interfaceC232479, InterfaceC4913np interfaceC4913np) {
        try {
            if (interfaceC4913np instanceof C24789v) {
                interfaceC232479.AHk(((C24789v) interfaceC4913np).A05);
            } else {
                interfaceC232479.AHk(interfaceC4913np);
            }
        } catch (RuntimeException e) {
            AbstractC21714g.A08(A01(0, 17, 10), A01(17, 22, 90), e);
        }
    }

    private void A06(InterfaceC2696DT[] interfaceC2696DTArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.A0C[i2].A9N() == -2 && this.A06.A00(i2)) {
                interfaceC2696DTArr[i2] = new C4915nr();
            }
        }
    }

    private void A07(InterfaceC2696DT[] interfaceC2696DTArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.A0C[i2].A9N() == -2) {
                interfaceC2696DTArr[i2] = null;
            }
        }
    }

    private boolean A08() {
        return this.A04 == null;
    }

    public final long A09() {
        if (!this.A02) {
            return this.A00.A03;
        }
        long jA78 = this.A01 ? this.A07.A78() : Long.MIN_VALUE;
        return jA78 == Long.MIN_VALUE ? this.A00.A00 : jA78;
    }

    public final long A0A() {
        if (this.A02) {
            return this.A07.A8b();
        }
        return 0L;
    }

    public final long A0B() {
        return this.A03;
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"})
    public final long A0C(long j2) {
        return this.A07.A76(j2);
    }

    public final long A0D(long j2) {
        return j2 - A0B();
    }

    public final long A0E(long j2) {
        return A0B() + j2;
    }

    public final long A0F(C2788Ex c2788Ex, long j2, boolean z) {
        return A0G(c2788Ex, j2, z, new boolean[this.A0C.length]);
    }

    public final long A0G(C2788Ex c2788Ex, long j2, boolean z, boolean[] zArr) {
        int i2 = 0;
        while (true) {
            boolean z2 = false;
            if (i2 < c2788Ex.A00) {
                boolean[] zArr2 = this.A0D;
                if (!z) {
                    boolean zA01 = c2788Ex.A01(this.A06, i2);
                    if (A0F[5].length() != 8) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0F;
                    strArr[4] = "ZW5cY05fUZ7YDJtoLiROAD1s3u7pqZaY";
                    strArr[3] = "DBvv8TdqbKzS7YgGUgxEKNMIgeBwY4FK";
                    if (zA01) {
                        z2 = true;
                    }
                }
                zArr2[i2] = z2;
                i2++;
            } else {
                A07(this.A09);
                A02();
                this.A06 = c2788Ex;
                A03();
                long jAJ9 = this.A07.AJ9(c2788Ex.A04, this.A0D, this.A09, zArr, j2);
                A06(this.A09);
                this.A01 = false;
                for (int i3 = 0; i3 < this.A09.length; i3++) {
                    if (this.A09[i3] != null) {
                        AbstractC21273y.A08(c2788Ex.A00(i3));
                        if (this.A0C[i3].A9N() != -2) {
                            this.A01 = true;
                        }
                    } else {
                        AbstractC21273y.A08(c2788Ex.A04[i3] == null);
                    }
                }
                return jAJ9;
            }
        }
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"})
    public final long A0H(boolean z) {
        if (!z) {
            return this.A03;
        }
        return this.A00.A03 + this.A03;
    }

    public final C23257A A0I() {
        return this.A04;
    }

    public final C4894nW A0J() {
        return this.A05;
    }

    public final C2788Ex A0K() {
        return this.A06;
    }

    public final C2788Ex A0L(float f2, Timeline timeline) throws C2496AD {
        C2788Ex c2788ExA0b = this.A0B.A0b(this.A0C, A0J(), this.A00.A04, timeline);
        for (InterfaceC4876nE interfaceC4876nE : c2788ExA0b.A04) {
            if (interfaceC4876nE != null) {
                interfaceC4876nE.AFJ(f2);
            }
        }
        return c2788ExA0b;
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "MediaSourceAdapter to be replaced with MediaSourceList")
    public final void A0M() {
        A02();
        A05(this.A0A, this.A07);
    }

    public final void A0N(float f2, Timeline timeline) throws C2496AD {
        this.A02 = true;
        this.A05 = this.A07.A9M();
        long jA0F = A0F(A0L(f2, timeline), this.A00.A03, false);
        this.A03 += this.A00.A03 - jA0F;
        this.A00 = this.A00.A00(jA0F);
    }

    public final void A0O(long j2) {
        AbstractC21273y.A08(A08());
        this.A07.A5C(A0D(j2));
    }

    public final void A0P(long j2) {
        AbstractC21273y.A08(A08());
        if (this.A02) {
            this.A07.AHW(A0D(j2));
        }
    }

    public final void A0Q(C23257A c23257a) {
        if (c23257a == this.A04) {
            return;
        }
        A02();
        this.A04 = c23257a;
        A03();
    }

    public final boolean A0R() {
        return this.A02 && (!this.A01 || this.A07.A78() == Long.MIN_VALUE);
    }
}
