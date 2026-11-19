package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.view.Surface;
import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4421fX {
    public static byte[] A02;
    public final C2493AA A00;
    public final C4872nA A01 = new C4872nA();

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-64, -54, -66, -64, 1, -1, 19, 17, 3, -64, -66, -40, -66, -64, -74, -64, -76, -74, 6, -7, 2, -8, -7, 6, -7, 6, -35, 2, -8, -7, 12, -74, -76, -50, -76, -74, -54, 37, -9, -6, 9, 16, -73, 2, -6, 8, 8, -10, -4, -6, -73, -75, -49, -75, -73, -75, 92, -82, -77, -86, -97, 92, 90, 116, 90, 92};
    }

    public C4421fX(C4494gi c4494gi) {
        InterfaceC2777Em trackSelectionFactory = new C4889nR(this.A01);
        C24659h c24659h = new C24659h(trackSelectionFactory);
        InterfaceC231974 loadControl = new C4982ox();
        this.A00 = AbstractC22906b.A00(new C4979ou(c4494gi), c24659h, loadControl, this.A01);
    }

    public static String A01(C5045pz c5045pz) {
        boolean z = c5045pz instanceof C2496AD;
        String strA00 = A00(36, 2, C1137R.styleable.ConstraintSet_polarRelativeTo);
        String strA01 = A00(0, 14, 108);
        if (z) {
            C2496AD c2496ad = (C2496AD) c5045pz;
            return A00(55, 11, 8) + c2496ad.A03 + A00(14, 22, 98) + c2496ad.A02 + strA01 + c2496ad.getCause() + strA00;
        }
        return A00(41, 14, 99) + c5045pz.getMessage() + strA01 + c5045pz.getCause() + strA00;
    }

    public static boolean A03() {
        return true;
    }

    public final int A04() {
        return this.A00.A0I();
    }

    public final int A05() {
        return this.A00.A00();
    }

    public final long A06() {
        return this.A00.A7e();
    }

    public final long A07() {
        return this.A00.A7s();
    }

    public final C4419fV A08() {
        C5064qI vf = this.A00.A0K();
        if (vf == null) {
            return null;
        }
        return new C4419fV(vf.A0L, vf.A0A);
    }

    public final void A09() {
        this.A00.A0L();
    }

    public final void A0A() {
        this.A00.A02();
    }

    public final void A0B() {
        this.A00.A01();
    }

    public final void A0C(float f2) {
        this.A00.A0M(f2);
    }

    public final void A0D(long j2) {
        this.A00.A04(j2);
    }

    public final void A0E(Surface surface) {
        this.A00.A0N(surface);
    }

    public final void A0F(C4490ge c4490ge, Uri uri) {
        if (C3763Up.A2z(c4490ge, A03())) {
            C4425fb cacheManager = C4425fb.A06(c4490ge);
            InterfaceC22255Y cachedDataSourceFactory = cacheManager.A0H(c4490ge);
            this.A00.A0Q(new C24729o(cachedDataSourceFactory).A04(uri));
            return;
        }
        InterfaceC2664Cx mediaSource = new C24729o(new C4999pE(c4490ge, AbstractC22035C.A0j(c4490ge, A00(38, 3, 100)), this.A01)).A04(uri);
        this.A00.A0Q(mediaSource);
    }

    public final void A0G(InterfaceC4418fU interfaceC4418fU) {
        this.A00.A0O(new C2673D6(this, interfaceC4418fU));
    }

    public final void A0H(final InterfaceC4420fW interfaceC4420fW) {
        this.A00.A0P(new InterfaceC4970ol() { // from class: com.facebook.ads.redexgen.X.2s
            @Override // com.instagram.common.viewpoint.core.InterfaceC22125L
            public final void AGa(int i2, int i3, int i4, float f2) {
                interfaceC4420fW.AGa(i2, i3, i4, f2);
            }
        });
    }

    public final void A0I(boolean z) {
        this.A00.A0S(z);
    }

    public final boolean A0J() {
        return this.A00.A0T();
    }

    public final boolean A0K() {
        return this.A00.A0J() != null;
    }
}
