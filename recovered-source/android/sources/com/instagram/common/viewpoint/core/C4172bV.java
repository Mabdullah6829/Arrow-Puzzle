package com.instagram.common.viewpoint.core;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bV */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4172bV {
    public static long A0F;
    public static byte[] A0G;
    public static String[] A0H = {"R0SbMgWAoC497HVFrz", "HjDMjTQFKfQjEPdjddKMHVEmssyIO6xJ", "qLmiUd82g2mhrwqPXxjSPUm4NIZHyVr2", "b8w5", "5ahVLoWejnV8u5u0zxB2Y4aA1Z0H734m", "82nB4Ww4zktBcOGVc7", "fE0nEfPNcAkneFTlCeTsSM9yzZ1yQJUc", "9xmO"};
    public InterfaceC3276Mr A00;
    public AbstractC3278Mt A01;
    public AbstractC4669jd A02;
    public C3921XS A03;
    public InterfaceC3936Xh A04;
    public InterfaceC4171bU A05;
    public boolean A06;
    public final C3326Ng A07;
    public final C4494gi A08;
    public final InterfaceC3784VA A09;
    public final C3957Y2 A0A;
    public final InterfaceC3998Yh A0B;
    public final C4439fp A0C;
    public final String A0D;
    public final boolean A0E;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {119, -120, 117, 118, -87, -88, -88, -93, -94, 119, -96, -99, -105, -97, -128, -99, -89, -88, -103, -94, -103, -90, 115, -96, -96, -99, -96, 78, -109, -90, -109, -111, -93, -94, -105, -100, -107, 78, -113, -111, -94, -105, -99, -100, -100, -55, -55, -58, -55, 119, -50, -65, -64, -61, -68, 119, -58, -57, -68, -59, -64, -59, -66, 119, -55, -46, -49, -55, -47, -59, -39, -43, -37, -40, -55, -53};
        String[] strArr = A0H;
        if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
            throw new RuntimeException();
        }
        A0H[5] = "";
        A0G = bArr;
    }

    static {
        A03();
        A0F = 0L;
    }

    public C4172bV(C4494gi c4494gi, String str, C4439fp c4439fp, C3957Y2 c3957y2, InterfaceC3784VA interfaceC3784VA, C3326Ng c3326Ng) {
        this(c4494gi, str, c4439fp, c3957y2, interfaceC3784VA, c3326Ng, new C3153Ks());
    }

    public C4172bV(C4494gi c4494gi, String str, C4439fp c4439fp, C3957Y2 c3957y2, InterfaceC3784VA interfaceC3784VA, C3326Ng c3326Ng, InterfaceC3998Yh interfaceC3998Yh) {
        this.A0E = true;
        this.A08 = c4494gi;
        this.A0D = str;
        this.A0C = c4439fp;
        this.A0A = c3957y2;
        this.A09 = interfaceC3784VA;
        this.A07 = c3326Ng;
        this.A0B = interfaceC3998Yh;
    }

    public C4172bV(C4494gi c4494gi, String str, C4439fp c4439fp, C3957Y2 c3957y2, InterfaceC3784VA interfaceC3784VA, C3326Ng c3326Ng, InterfaceC3998Yh interfaceC3998Yh, InterfaceC3936Xh interfaceC3936Xh) {
        this.A0E = true;
        this.A08 = c4494gi;
        this.A0D = str;
        this.A0C = c4439fp;
        this.A0A = c3957y2;
        this.A09 = interfaceC3784VA;
        this.A07 = c3326Ng;
        this.A0B = interfaceC3998Yh;
        this.A04 = interfaceC3936Xh;
    }

    private EnumC3275Mq A00(String str, String str2, Map<String, String> map) {
        String strA01 = A01(0, 22, 33);
        EnumC3275Mq actionOutcome = EnumC3275Mq.A09;
        try {
            AbstractC3966YB.A0c(map, this.A02);
            Uri uriA00 = AbstractC3904XB.A00(str2);
            if (this.A01 == null) {
                this.A01 = C3279Mu.A01(this.A08, this.A09, str, uriA00, new C4150b9(map).A03(this.A0C).A02(this.A0A).A05(), true, this.A06, this.A07);
                A02();
            }
            if (this.A01 instanceof C238487) {
                ((C238487) this.A01).A0N(this.A03);
            }
            if (this.A01 != null) {
                actionOutcome = this.A01.A0G(map.get(A01(64, 12, 83)));
                if (this.A06 && (this.A01 instanceof C238285)) {
                    actionOutcome = EnumC3275Mq.A08;
                }
            }
            if (!(((this.A01 instanceof C238184) || (this.A01 instanceof C238487)) && AbstractC3966YB.A0i(this.A08, actionOutcome, map)) && actionOutcome != EnumC3275Mq.A06) {
                if (this.A05 != null) {
                    this.A05.ADY();
                }
                this.A0B.A4j(this.A0D);
            }
        } catch (ActivityNotFoundException e) {
            Log.e(strA01, A01(44, 20, 68) + str2, e);
        } catch (Exception e2) {
            Log.e(strA01, A01(22, 22, 27), e2);
        }
        return actionOutcome;
    }

    private void A02() {
        if (this.A01 != null && this.A01.A0E() == null && this.A00 != null) {
            this.A01.A0F(this.A00);
        }
    }

    public static boolean A04(C4494gi c4494gi) {
        boolean zA2w = C3763Up.A2w(c4494gi);
        int iA07 = C3763Up.A07(c4494gi);
        long jCurrentTimeMillis = System.currentTimeMillis() - A0F;
        if (zA2w && A0F > 0 && jCurrentTimeMillis < iA07) {
            return true;
        }
        A0F = System.currentTimeMillis();
        return false;
    }

    public final EnumC3275Mq A05(String str, String str2, Map<String, String> extraData) {
        EnumC3275Mq enumC3275MqA00 = EnumC3275Mq.A09;
        new C3792VI(str, this.A09).A04(EnumC3791VH.A0J, extraData);
        if (this.A0A.A09(this.A08)) {
            this.A09.AB6(str, extraData);
        } else {
            enumC3275MqA00 = A00(str, str2, extraData);
            if (this.A02 != null && this.A02.A29().A0L() != null && this.A04 != null) {
                AbstractC3911XI.A07(this.A08.A02(), this.A02.A29().A0L(), this.A04);
            }
        }
        return enumC3275MqA00;
    }

    public final InterfaceC3276Mr A06() {
        if (this.A01 != null) {
            InterfaceC3276Mr interfaceC3276MrA0E = this.A01.A0E();
            String[] strArr = A0H;
            if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0H;
            strArr2[4] = "m9EeWSKmUQIcAT4bR8TqW1uNxXCrncrR";
            strArr2[6] = "ZpUrOoewPl5vbi76KZuNJwABiWDkIMaY";
            return interfaceC3276MrA0E;
        }
        return null;
    }

    public final void A07(InterfaceC3276Mr interfaceC3276Mr) {
        this.A00 = interfaceC3276Mr;
        A02();
    }

    public final void A08(AbstractC4669jd abstractC4669jd) {
        this.A02 = abstractC4669jd;
    }

    public final void A09(C3921XS c3921xs) {
        this.A03 = c3921xs;
    }

    public final void A0A(InterfaceC3936Xh interfaceC3936Xh) {
        this.A04 = interfaceC3936Xh;
    }

    public final void A0B(InterfaceC4171bU interfaceC4171bU) {
        this.A05 = interfaceC4171bU;
    }

    public final void A0C(boolean z) {
        this.A06 = z;
    }
}
