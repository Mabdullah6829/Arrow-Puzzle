package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ij */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3020Ij extends RelativeLayout implements InterfaceC3919XQ {
    public static byte[] A0E;
    public static String[] A0F = {"uUMDphsbcltlMAasrXzhzXIIsD27sBrh", "kD4ASPr1mkkPPQg7686pKphnCznMXNdE", "3u4w9tHTXiQc09zCQQwrpogVyGpuea0B", "uLxjLzdSNqmjg5WlrsUTBNxe2IHJHDsH", "sowIyJkgs7pChNHWV216bYY5IvqkL5", "woZqrf3JBfr8DagdWcXdOyEt75sBOiDm", "mZPGIv6MosabarlDevuwzM4J02qRjqBR", "rZe00TaCIEKWr55DYJNI366SEGcMY1oV"};
    public static final int A0G;
    public String A00;
    public boolean A01;
    public final int A02;
    public final AbstractC4438fo A03;
    public final boolean A04;
    public final boolean A05;
    public final AbstractC4669jd A06;
    public final C4494gi A07;
    public final InterfaceC3784VA A08;
    public final C3921XS A09;
    public final C3957Y2 A0A;
    public final InterfaceC3998Yh A0B;
    public final InterfaceC4047ZU A0C;
    public final C4439fp A0D;

    public static String A19(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A1A() {
        A0E = new byte[]{95, 16, 25, 95, 5, 32, 100};
        if (A0F[4].length() == 22) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[2] = "lGg0879wdsNhw7V1Qtd20OQ8gEXobd5O";
        strArr[0] = "a2lydBkKvgM6UKG9QoQR6B5cBx9Kev1F";
    }

    public abstract EnumC3275Mq A1D(String str);

    public abstract void A1G();

    public abstract void A1H();

    public abstract void A1J(boolean z);

    public abstract void A1K(boolean z);

    public abstract boolean A1L();

    public abstract boolean A1M();

    public abstract boolean A1N();

    public abstract C4311dk getFullScreenAdStyle();

    static {
        A1A();
        A0G = (int) (AbstractC3926XX.A02 * 80.0f);
    }

    public AbstractC3020Ij(C4494gi c4494gi, InterfaceC4047ZU interfaceC4047ZU, InterfaceC3784VA interfaceC3784VA, AbstractC4669jd abstractC4669jd, int i2, boolean z, boolean z2, InterfaceC3998Yh interfaceC3998Yh, int i3) {
        super(c4494gi);
        this.A0A = new C3957Y2();
        this.A01 = false;
        this.A00 = A19(0, 0, 48);
        this.A03 = new C3024In(this);
        this.A02 = i2;
        this.A07 = c4494gi;
        this.A05 = z;
        this.A04 = z2;
        this.A0B = interfaceC3998Yh;
        this.A0C = interfaceC4047ZU;
        this.A06 = abstractC4669jd;
        this.A08 = interfaceC3784VA;
        this.A0D = new C4439fp(this, 1, new WeakReference(this.A03), c4494gi);
        this.A0D.A0W(abstractC4669jd.A0m());
        this.A0D.A0X(abstractC4669jd.A0n());
        this.A09 = C3921XS.A00(this.A07, this.A06, this);
        if (this.A06.A1c()) {
            this.A00 = A18(this.A02, i3);
        }
    }

    public static String A18(int i2, int i3) {
        return A19(4, 3, 9) + (i2 + 1) + A19(0, 4, 50) + i3;
    }

    public void A1E() {
        this.A09.A03();
    }

    public final void A1F() {
        if (!this.A01) {
            this.A0D.A0U();
            this.A01 = true;
        }
    }

    public void A1I(boolean z) {
    }

    public AbstractC4669jd getAdDataBundle() {
        return this.A06;
    }

    public C4439fp getAdViewabilityChecker() {
        return this.A0D;
    }

    public C3957Y2 getTouchDataRecorder() {
        return this.A0A;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
