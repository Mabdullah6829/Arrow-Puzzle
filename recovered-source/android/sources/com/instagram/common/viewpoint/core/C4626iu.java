package com.instagram.common.viewpoint.core;

import android.os.Handler;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iu */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4626iu implements InterfaceC3846WC {
    public static byte[] A0E;
    public static String[] A0F = {"gvO2SkJ6judPPNAAbU10EdMFrysfMOoq", "C8fayNw08H03MAMa0MYSKK0pyo1qSvcR", "zD", "tQ435k35SGtCPZ", "PU5xmRYaUesfDikXgdcM0c", "Sj", "IzP0LuOvX3krWKzZjoX9w767Mf8waFqk", "fiC8qpcDm8TluoxAfEpO8PomLrdxugFO"};
    public InterfaceC3357OB A00;
    public C3709Tw A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;
    public final AdSize A06;
    public final C3290N6 A07;
    public final C4494gi A08;
    public final InterfaceC3784VA A09;
    public final EnumC3824Vq A0A;
    public final C3847WD A0B;
    public final Runnable A0C;
    public final String A0D;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{-47, -46, -125, -45, -49, -60, -58, -56, -48, -56, -47, -41, -125, -52, -47, -125, -43, -56, -42, -45, -46, -47, -42, -56};
    }

    static {
        A05();
        AbstractC3968YD.A02();
    }

    public C4626iu(C4494gi c4494gi, String str, EnumC3824Vq enumC3824Vq, AdSize adSize, int i2) {
        this.A08 = c4494gi;
        this.A0D = str;
        this.A0A = enumC3824Vq;
        this.A06 = adSize;
        this.A04 = i2;
        this.A0B = new C3847WD(this.A08);
        this.A0B.A0R(this);
        this.A07 = new C3290N6();
        this.A03 = true;
        this.A05 = new Handler();
        this.A0C = new AbstractC3476Q9<C4626iu>(this) { // from class: com.facebook.ads.redexgen.X.7e
            {
                super(this);
            }

            @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
            public final void A07() {
                C4626iu c4626iuA08 = A08();
                if (c4626iuA08 == null) {
                    return;
                }
                if (C3986YV.A02(c4626iuA08.A08)) {
                    c4626iuA08.A07();
                } else {
                    c4626iuA08.A05.postDelayed(c4626iuA08.A0C, 5000L);
                }
            }
        };
        this.A09 = c4494gi.A0A();
        DynamicLoaderFactory.makeLoader(this.A08).getInitApi().onAdLoadInvoked(this.A08);
    }

    private List<C4686ju> A04() {
        C3709Tw c3709Tw = this.A01;
        final ArrayList arrayList = new ArrayList(c3709Tw.A02());
        for (C3707Tu c3707TuA04 = c3709Tw.A04(); c3707TuA04 != null; c3707TuA04 = c3709Tw.A04()) {
            InterfaceC3285N1 interfaceC3285N1A00 = this.A07.A00(this.A08, AdPlacementType.NATIVE);
            if (interfaceC3285N1A00 != null && interfaceC3285N1A00.A8k() == AdPlacementType.NATIVE) {
                final C4686ju nativeAdapter = (C4686ju) interfaceC3285N1A00;
                nativeAdapter.A0L(this.A08, new AbstractC4627iv() { // from class: com.facebook.ads.redexgen.X.7f
                    @Override // com.instagram.common.viewpoint.core.InterfaceC3300NG
                    public final void AEw(C4686ju c4686ju) {
                        arrayList.add(nativeAdapter);
                    }
                }, this.A09, new C3354O8(c3707TuA04.A04(), c3709Tw.A05(), this.A0D, c3709Tw.A05().A0C()), C3732UK.A0K());
            }
        }
        return arrayList;
    }

    public final void A06() {
        this.A03 = false;
        this.A05.removeCallbacks(this.A0C);
    }

    public final void A07() {
        try {
            this.A0B.A0Q(new C3844WA(this.A08, this.A0D, this.A06 != null ? new C3942Xn(this.A06.getWidth(), this.A06.getHeight()) : null, this.A0A, this.A04, new C3828Vu(this.A08, null, null, null), AbstractC3948Xt.A01(C3763Up.A0N(this.A08)), this.A02, null, new C4615ij()));
        } catch (C3822Vn e) {
            ADp(C3821Vm.A02(e));
        }
    }

    public final void A08(InterfaceC3357OB interfaceC3357OB) {
        this.A00 = interfaceC3357OB;
    }

    public final void A09(String str) {
        this.A02 = str;
    }

    public final boolean A0A() {
        return this.A01 == null || this.A01.A0I();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3846WC
    public final void ADp(C3821Vm c3821Vm) {
        if (this.A03) {
            this.A05.postDelayed(this.A0C, 1800000L);
        }
        if (this.A00 != null) {
            this.A00.ADp(c3821Vm);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3846WC
    public final void AG7(C3544RG c3544rg) {
        C3709Tw c3709TwA00 = c3544rg.A00();
        if (c3709TwA00 != null) {
            if (this.A03) {
                long jA0A = c3709TwA00.A05().A0A();
                if (jA0A == 0) {
                    jA0A = 1800000;
                }
                this.A05.postDelayed(this.A0C, jA0A);
            }
            this.A01 = c3709TwA00;
            List<C4686ju> listA04 = A04();
            if (this.A00 != null) {
                boolean zIsEmpty = listA04.isEmpty();
                String[] strArr = A0F;
                if (strArr[7].charAt(9) == strArr[6].charAt(9)) {
                    throw new RuntimeException();
                }
                A0F[0] = "Ma8ASQR7F1ZvPn5hHoXinNcVvjUetiuh";
                if (zIsEmpty) {
                    this.A00.ADp(C3821Vm.A01(AdErrorType.NO_FILL, A03(0, 0, 63)));
                    return;
                } else {
                    this.A00.AEy(listA04);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException(A03(0, 24, 18));
    }
}
