package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.WW */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3865WW implements InterfaceC3784VA {
    public static InterfaceC3784VA A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final C4490ge A00;
    public final InterfaceC3739UR A01;
    public final InterfaceC3783V9 A02;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{50, 119, 100, 119, 124, 102, 60, 54, 3, 3, 18, 26, 7, 3, 30, 25, 16, 87, 3, 24, 87, 27, 24, 16, 87, 22, 25, 87, 30, 25, 1, 22, 27, 30, 19, 87, 66, 100, 119, 117, 115, 87, 85, 94, 85, 66, 89, 83, 29, 16, 25, 12};
    }

    static {
        A03();
        A05 = C3865WW.class.getSimpleName();
        A06 = false;
    }

    public C3865WW(C4490ge c4490ge) {
        InterfaceC3782V8 dispatchCallback;
        this.A00 = c4490ge;
        if (AbstractC3765Ur.A0T(c4490ge)) {
            this.A01 = AbstractC3737UP.A00(c4490ge);
            dispatchCallback = AbstractC3789VF.A00(c4490ge, this.A01);
        } else {
            C231671 c231671A01 = AbstractC3737UP.A01(c4490ge);
            dispatchCallback = AbstractC3789VF.A01(c4490ge, c231671A01);
            this.A01 = c231671A01;
        }
        this.A02 = new C3881Wm(c4490ge, dispatchCallback);
        ExecutorC3971YG.A08.execute(new C3867WY(this));
        A04(c4490ge);
    }

    public static synchronized InterfaceC3784VA A01(C4490ge c4490ge) {
        if (A03 == null) {
            A03 = new C3865WW(c4490ge);
        }
        return A03;
    }

    public static synchronized void A04(C4490ge c4490ge) {
        if (A06) {
            return;
        }
        c4490ge.A04().ACn();
        A06 = true;
    }

    private void A05(C3781V7 c3781v7) {
        if (!c3781v7.A0A()) {
            Log.e(A05, A02(7, 29, 55) + c3781v7.A06() + A02(0, 7, 82));
        } else {
            A06(c3781v7);
            this.A01.AL6(c3781v7, new C3866WX(this, c3781v7));
        }
    }

    private void A06(C3781V7 c3781v7) {
        switch (C3785VB.A00[c3781v7.A06().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                C3691Te c3691Te = new C3691Te(new Exception(A02(36, 5, 86)));
                c3691Te.A05(1);
                try {
                    c3691Te.A07(new JSONObject().put(A02(48, 4, 41), c3781v7.A06().toString()));
                    break;
                } catch (JSONException unused) {
                }
                this.A00.A08().ABD(A02(41, 7, 112), AbstractC3690Td.A1H, c3691Te);
                break;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3784VA
    public final void AB3(String str, Map<String, String> data) {
        A05(new C3780V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3786VC.A04).A02(EnumC3787VD.A04).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3784VA
    public final void AB5(String str, Map<String, String> data) {
        A05(new C3780V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3786VC.A04).A02(EnumC3787VD.A06).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3784VA
    public final void AB6(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3780V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3786VC.A04).A02(EnumC3787VD.A07).A06(AbstractC3794VK.A0A(str, EnumC3791VH.A0I)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3784VA
    public final void AB7(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3780V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3786VC.A04).A02(EnumC3787VD.A08).A06(AbstractC3794VK.A0A(str, EnumC3791VH.A06)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3784VA
    public final void ABB(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3780V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3786VC.A04).A02(EnumC3787VD.A0B).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3784VA
    public final void ABF(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3780V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3786VC.A04).A02(EnumC3787VD.A0C).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3784VA
    public final void ABJ(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3780V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3786VC.A05).A02(EnumC3787VD.A0D).A06(AbstractC3794VK.A0A(str, EnumC3791VH.A0T)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3784VA
    public final void ABK(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3780V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3786VC.A05).A02(EnumC3787VD.A0E).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3784VA
    public final void ABL(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3780V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3786VC.A05).A02(EnumC3787VD.A0F).A06(AbstractC3794VK.A0A(str, EnumC3791VH.A0V)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3784VA
    public final void ABM(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3780V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3786VC.A05).A02(EnumC3787VD.A0K).A06(AbstractC3794VK.A0A(str, EnumC3791VH.A0W)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3784VA
    public final void ABn(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3780V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3786VC.A05).A02(EnumC3787VD.A0H).A06(AbstractC3794VK.A0A(str, EnumC3791VH.A0X)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3784VA
    public final void ABp(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3780V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3786VC.A04).A02(EnumC3787VD.A0J).A06(AbstractC3794VK.A0A(str, EnumC3791VH.A0a)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3784VA
    public final void ABq(String str, Map<String, String> data, String str2, EnumC3786VC enumC3786VC) {
        A05(new C3780V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(enumC3786VC).A02(EnumC3787VD.A00(str2)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3784VA
    public final void ABr(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C3781V7 adEvent = new C3780V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3786VC.A04).A02(EnumC3787VD.A0L).A07(this.A00);
        A05(adEvent);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3784VA
    public final void ABx(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3780V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3786VC.A05).A02(EnumC3787VD.A0N).A06(AbstractC3794VK.A0A(str, EnumC3791VH.A0i)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3784VA
    public final void ABy(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3780V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3786VC.A05).A02(EnumC3787VD.A0O).A06(AbstractC3794VK.A0A(str, EnumC3791VH.A0j)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3784VA
    public final void AC0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3780V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A01(EnumC3786VC.A04).A02(EnumC3787VD.A0P).A06(AbstractC3794VK.A0A(str, EnumC3791VH.A0k)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3784VA
    public final void AC3(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3780V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3786VC.A04).A02(EnumC3787VD.A0G).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3784VA
    public final void AC8(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3780V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3786VC.A05).A02(EnumC3787VD.A0Q).A06(AbstractC3794VK.A0A(str, EnumC3791VH.A0o)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3784VA
    public final void AC9(String str, Map<String, String> data) {
        A05(new C3780V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3786VC.A05).A02(EnumC3787VD.A0V).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3784VA
    public final void ACB(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3780V6().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3786VC.A05).A02(EnumC3787VD.A0W).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3784VA
    public final void AGz(String str) {
        new AsyncTaskC4465gF(this.A00).execute(str);
    }
}
