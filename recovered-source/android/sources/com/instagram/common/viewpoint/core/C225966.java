package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.PointerIconCompat;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.66 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C225966 extends FrameLayout implements InterfaceC3999Yi, InterfaceC3029Is {
    public static byte[] A0I;
    public static String[] A0J = {"UTx0mthy689a2sWy4JVu0tmbo5tf7DAX", "DpQrJfF4GGVCKG366ycalUQvQmaAeTpv", "eTaJ9UlZkoiVo78onrsfkh8qyWU6l07Y", "ASk", "tRl9yBUHWghtVC3MTlEkON1DGIMHt5L9", "IjjI8eijgHBxehc5IxL2bCSmbEZHlZYm", "ajbOHBl4KDnxYMWXO0J67", "uiq3lL8JcMvDgND3txStxUQziaPHduab"};
    public C3568Re A00;
    public InterfaceC3574Rk A01;
    public InterfaceC4283dI A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AbstractC4669jd A06;
    public final C4494gi A07;
    public final InterfaceC3784VA A08;
    public final C3792VI A09;
    public final ViewOnSystemUiVisibilityChangeListenerC3952Xx A0A;
    public final C3957Y2 A0B;
    public final InterfaceC3998Yh A0C;
    public final InterfaceC4047ZU A0D;
    public final C4269d4 A0E;
    public final C4277dC A0F;
    public final AbstractC4438fo A0G;
    public final C4439fp A0H;

    public static String A0B(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0I = new byte[]{24, 47, 47, 50, 47, 125, 62, 47, 56, 60, 41, 52, 51, 58, 125, 62, 50, 51, 59, 52, 58, 125, 23, 14, 18, 19, 78, 69, 76, 68, 67, 72, 73, 114, 76, 73, 36, 47, 38, 46, 41, 34, 35, 24, 38, 35, 24, 46, 41, 35, 34, 63, 46, 37, 44, 36, 35, 40, 41, 18, 44, 41, 18, 57, 34, 57, 44, 33, 91, 80, 89, 81, 86, 93, 92, 103, 76, 81, 85, 93, 103, 75, 72, 93, 86, 76, 35, 44, 41, 35, 43, 31, 51, 47, 53, 50, 35, 37, 74, 76, 90, 77, 92, 83, 86, 92, 84};
    }

    static {
        A0D();
    }

    public C225966(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, InterfaceC3998Yh interfaceC3998Yh, AbstractC4669jd abstractC4669jd, InterfaceC4047ZU interfaceC4047ZU, int i2) {
        super(c4494gi);
        this.A01 = new C3077Je(this);
        this.A0G = new C3076Jd(this);
        this.A03 = true;
        this.A07 = c4494gi;
        this.A08 = interfaceC3784VA;
        this.A0C = interfaceC3998Yh;
        this.A06 = abstractC4669jd;
        this.A0D = interfaceC4047ZU;
        C4277dC c4277dCA02 = AbstractC4278dD.A02(abstractC4669jd.A1D());
        if (c4277dCA02 == null) {
            this.A0F = new C4277dC(this.A07, abstractC4669jd, interfaceC3784VA, i2);
            this.A04 = false;
        } else {
            this.A0F = c4277dCA02;
            this.A04 = true;
        }
        this.A09 = this.A0F.A0K();
        this.A0B = this.A0F.A0L();
        this.A0F.A0c(new C3067JU(this));
        AbstractC3966YB.A0G(PointerIconCompat.TYPE_HELP, this.A0F.A0O());
        if (this.A06.A1U()) {
            this.A0E = new C4269d4(this.A07, this.A08, this.A06, new C3648Sx(this.A07), this.A09, this.A0C, this.A0D, new C3066JT(this));
            this.A0E.A0N();
            this.A0F.A0O().setOnTouchListener(new ViewOnTouchListenerC4265d0(this));
            addView(this.A0E, new FrameLayout.LayoutParams(-1, -1));
        } else {
            this.A0E = null;
        }
        ViewGroup mediaView = getMediaView();
        this.A0H = new C4439fp(mediaView, 1, new WeakReference(this.A0G), this.A07);
        this.A0H.A0W(this.A06.A0m());
        this.A0H.A0X(this.A06.A0n());
        this.A0F.A0e(this.A0H);
        this.A0A = new ViewOnSystemUiVisibilityChangeListenerC3952Xx(this);
        this.A0A.A05(EnumC3951Xw.A02);
        setBackgroundColor(0);
        if (C3763Up.A1z(c4494gi)) {
            c4494gi.A0B().AKp(mediaView, abstractC4669jd.A2E(), false, false, true);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            boolean zA2L = abstractC4669jd.A2L();
            String strA0B = A0B(68, 18, 20);
            String strA0B2 = A0B(36, 16, 107);
            String strA0B3 = A0B(52, 16, 97);
            String strA0B4 = A0B(26, 10, 1);
            if (zA2L) {
                jSONObject.put(strA0B4, true);
                jSONObject.put(strA0B3, 2);
                jSONObject.put(strA0B2, 0);
                jSONObject.put(strA0B, this.A06.A0r());
            } else if (C3905XC.A05(abstractC4669jd.A0z())) {
                jSONObject.put(strA0B4, true);
                jSONObject.put(strA0B3, 2);
                jSONObject.put(strA0B2, 1);
                jSONObject.put(strA0B, this.A06.A0r());
            }
            this.A0F.A0j(jSONObject);
        } catch (JSONException unused) {
            this.A0F.A0M().A04(AbstractC3690Td.A15, A0B(0, 26, 113));
        }
    }

    private void A0C() {
        C4317dq c4317dqA0F = new C4315do(this.A07, this.A06.A29().A0I(), this.A06.A2C()).A0A(this.A06.A28().A01()).A0F();
        addView(c4317dqA0F, new FrameLayout.LayoutParams(-1, -1));
        c4317dqA0F.A04(new C3057JK(this));
    }

    private final void A0E() {
        this.A0F.A0d(this);
        if (!this.A04) {
            this.A07.A0F().A66();
            this.A0F.A0X();
        } else {
            this.A07.A0F().A67();
            if (this.A0F.A0k()) {
                AKD();
                if (C3763Up.A1z(this.A07)) {
                    this.A07.A0B().ADb();
                }
            }
        }
        ViewGroup viewGroup = (ViewGroup) this.A0F.A0O().getParent();
        if (viewGroup != null) {
            C4277dC c4277dC = this.A0F;
            String[] strArr = A0J;
            if (strArr[0].charAt(1) != strArr[2].charAt(1)) {
                throw new RuntimeException();
            }
            A0J[6] = "m5i7x933C7hHEFpC39NkE";
            ViewGroup parent = c4277dC.A0O();
            viewGroup.removeView(parent);
        }
        addView(this.A0F.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A0C.A45(this, new RelativeLayout.LayoutParams(-1, -1));
        if (this.A06.A1V()) {
            this.A0A.A05(EnumC3951Xw.A03);
        }
    }

    private void A0F(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C4172bV c4172bV = new C4172bV(this.A07, this.A0D.A7M(), this.A0H, this.A0B, this.A08, this.A06.A2A(), this.A0C);
        HashMap map = new HashMap();
        map.put(A0B(86, 12, 108), A0B(98, 9, 19));
        c4172bV.A05(this.A06.A2E(), str, map);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void A9f() {
        A0F(this.A06.A29().A0J().A05());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void A9g(String str) {
        A0F(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void A9k() {
        this.A0C.A4j(this.A0D.A6l());
        C4362ea serverSideRewardHandler = new C4362ea(this.A07, this.A0D, this.A06.A1G(), this.A0C);
        serverSideRewardHandler.A06();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void AAm() {
        new Handler(Looper.getMainLooper()).post(new C3060JN(this));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AAu(Intent intent, Bundle bundle, C3568Re c3568Re) {
        C4277dC.A0B().incrementAndGet();
        c3568Re.A0A(this.A01);
        this.A00 = c3568Re;
        A0E();
        if (this.A06.A29().A0W()) {
            A0C();
        } else {
            this.A0F.A0W();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void AE0() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void AE4() {
        if (this.A0E != null) {
            this.A0E.A0P();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void AEu(boolean z) {
        if (this.A0E != null) {
            this.A0E.A0R(z);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AFA(boolean z) {
        if (this.A0E != null) {
            this.A0E.A0S(z);
        }
        if (z) {
            this.A0F.A0Q();
        } else {
            this.A0F.A0T();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AFi(boolean z) {
        if (this.A0E != null) {
            this.A0E.A0T(z);
        }
        if (this.A03) {
            this.A03 = false;
        } else if (z) {
            this.A0F.A0P();
        } else {
            this.A0F.A0Y();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void AFz() {
        if (this.A0E != null) {
            this.A0E.A0Q();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void AGX(boolean z) {
        if (this.A0E != null) {
            this.A0E.A0U(z);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void AGZ(boolean z) {
        if (this.A0E != null) {
            this.A0E.A0V(z);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void AGo(String str) {
        String urlString = this.A06.A2F(str);
        if (urlString == null) {
            return;
        }
        C3899X6.A0O(new C3899X6(), this.A07, AbstractC3904XB.A00(urlString), this.A06.A2E());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AIv(Bundle bundle) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void AKD() {
        if (!this.A05) {
            this.A0H.A0U();
            this.A05 = true;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void close() {
        if (this.A00 == null) {
            return;
        }
        this.A07.A0F().AB0();
        this.A00.finish(4);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public String getCurrentClientToken() {
        return this.A06.A2E();
    }

    private ViewGroup getMediaView() {
        if (this.A0E != null) {
            return this.A0E;
        }
        return this.A0F.A0O();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void onDestroy() {
        if (C3763Up.A1z(this.A07)) {
            this.A07.A0B().AKU(getMediaView());
        }
        C4269d4 c4269d4 = this.A0E;
        String[] strArr = A0J;
        if (strArr[4].charAt(27) != strArr[5].charAt(27)) {
            throw new RuntimeException();
        }
        A0J[6] = "GZe1biqFkGajjfTMFdC84";
        if (c4269d4 != null) {
            this.A0E.A0O();
        }
        this.A0A.A03();
        this.A08.AB7(this.A06.A2E(), new C4150b9().A02(this.A0B).A03(this.A0H).A05());
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        AbstractC4278dD.A04(this.A06.A1D());
        C4277dC.A0B().decrementAndGet();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC3998Yh interfaceC3998Yh) {
    }

    public void setRtfActionsJavascriptListener(InterfaceC4283dI interfaceC4283dI) {
        this.A02 = interfaceC4283dI;
    }
}
