package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gj */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2897Gj extends FrameLayout implements InterfaceC3999Yi {
    public static byte[] A0F;
    public static String[] A0G = {"TjJo4iSgng0vXhs45r72rqpPNY8skILr", "91ouIxxhnH3Z5", "W0nriFofCJUyd1UjJ1D34NnkecurTiQg", "io9DF8pP4zbnzlMZ0cU9ebyf5c8MGTpw", "GW5XhaY0JB8EDDs", "wmyPNYIHMh217", "CqbXOmo7iYNySqq5By1vz3nqMfrwlLlZ", "8HyCFF6UzaJGyjOzTS3wQDIkiaQQj"};
    public static final RelativeLayout.LayoutParams A0H;
    public boolean A00;
    public ViewGroup A01;
    public boolean A02;
    public final AbstractC4669jd A03;
    public final C3648Sx A04;
    public final C4494gi A05;
    public final InterfaceC3784VA A06;
    public final C3792VI A07;
    public final C3957Y2 A08;
    public final AbstractC3992Yb A09;
    public final InterfaceC3998Yh A0A;
    public final InterfaceC4047ZU A0B;
    public final C4439fp A0C;
    public final ViewOnSystemUiVisibilityChangeListenerC3952Xx A0D;
    public final AbstractC4438fo A0E;

    public static String A0Z(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 39);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0b() {
        A0F = new byte[]{-22, -19, -4, -23, -24};
    }

    public abstract void A0g();

    public abstract void A0h();

    public abstract void A0k(C3568Re c3568Re);

    public abstract boolean A0l();

    public abstract boolean A0m();

    static {
        A0b();
        A0H = new RelativeLayout.LayoutParams(-1, -1);
    }

    public AbstractC2897Gj(C4494gi c4494gi, InterfaceC4047ZU interfaceC4047ZU, InterfaceC3784VA interfaceC3784VA, AbstractC4669jd abstractC4669jd, C3648Sx c3648Sx, InterfaceC3998Yh interfaceC3998Yh) {
        super(c4494gi);
        this.A02 = false;
        this.A0E = new C2922H8(this);
        this.A08 = new C3957Y2();
        this.A00 = false;
        this.A05 = c4494gi;
        this.A0B = interfaceC4047ZU;
        this.A06 = interfaceC3784VA;
        this.A03 = abstractC4669jd;
        this.A04 = c3648Sx;
        this.A0A = interfaceC3998Yh;
        this.A07 = new C3792VI(this.A03.A2E(), this.A06);
        this.A0C = new C4439fp(this, 1, new WeakReference(this.A0E), this.A05);
        this.A0C.A0W(this.A03.A0m());
        this.A0C.A0X(this.A03.A0n());
        this.A09 = A0Y();
        this.A0D = new ViewOnSystemUiVisibilityChangeListenerC3952Xx(this);
        this.A0D.A05(EnumC3951Xw.A02);
        if (!A0m() && Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    private AbstractC3992Yb A0Y() {
        AbstractC3992Yb abstractC3992YbA0c = A0c();
        abstractC3992YbA0c.setFullscreen(true);
        int iA04 = this.A03.A29().A0H().A04();
        abstractC3992YbA0c.setPageDetails(this.A03.A2C(), this.A03.A2E(), iA04, this.A03.A2D());
        abstractC3992YbA0c.A0D(this.A03.A28().A01(), ViewOnClickListenerC3152Kr.A05(this.A03));
        if (this.A03.A29().A0H().A02() == 0) {
            this.A02 = true;
            abstractC3992YbA0c.setToolbarActionMode(8);
        } else if (iA04 < 0 && this.A03.A29().A0S()) {
            abstractC3992YbA0c.setToolbarActionMode(4);
        }
        if (this.A03.A29().A0H().A02() >= 0) {
            abstractC3992YbA0c.setProgressSpinnerInvisible(true);
        }
        abstractC3992YbA0c.setToolbarListener(new C2899Gl(this));
        return abstractC3992YbA0c;
    }

    private void A0a() {
        if (this.A03.A29().A0W()) {
            C4317dq c4317dqA0F = new C4315do(this.A05, this.A03.A29().A0I(), this.A03.A2C()).A0A(this.A03.A28().A01()).A0F();
            AbstractC3794VK.A04(c4317dqA0F, this.A07, EnumC3791VH.A0U);
            addView(c4317dqA0F, A0H);
            c4317dqA0F.A04(new C2912Gy(this));
            return;
        }
        A0h();
    }

    public AbstractC3992Yb A0c() {
        if (A0m()) {
            if (this.A03.A1W()) {
                return new C3446Pe(this.A05, getAppOpenAdVariant(), this.A03, 8, new C2903Gp(this));
            }
            return new C3437PU(this.A05, this.A03, 1);
        }
        return new FullScreenAdToolbar(this.A05, this.A0A, this.A07, 1, this.A03.A22(), this.A03.A1s());
    }

    public void A0d() {
        Rect requestedMargins;
        if (!this.A03.A1W() || (requestedMargins = this.A09.getRequestedMargins()) == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A09.getLayoutParams();
        layoutParams.setMargins(requestedMargins.left, requestedMargins.top, requestedMargins.right, requestedMargins.bottom);
        this.A09.setLayoutParams(layoutParams);
    }

    public final void A0e() {
        if (!this.A00) {
            this.A0C.A0U();
            this.A00 = true;
        }
    }

    public final void A0f() {
        if (this.A09.getToolbarActionMode() == 8) {
            this.A09.setToolbarActionMode(2);
        }
        if (this.A03.A29().A0H().A07() != null) {
            this.A03.A29().A0H().A07().A0S(0);
        }
        this.A03.A2K(false);
        this.A03.A29().A0M(-1);
    }

    public final void A0i(int i2, AbstractRunnableC3871Wc abstractRunnableC3871Wc, C2702DZ c2702dz) {
        new C3917XO(i2, new C2914H0(this, i2, c2702dz, abstractRunnableC3871Wc)).A07();
    }

    public final void A0j(ViewGroup viewGroup) {
        if (this.A03.A1W() && getAppOpenAdVariant() == EnumC3997Yg.A08) {
            C4188bl c4188bl = new C4188bl(this.A05);
            c4188bl.setRadius(AbstractC3924XV.A0v);
            c4188bl.addView(viewGroup, new ViewGroup.LayoutParams(-1, -1));
            this.A01 = c4188bl;
            return;
        }
        this.A01 = viewGroup;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AAu(Intent intent, Bundle bundle, C3568Re c3568Re) {
        this.A0A.A45(this, A0H);
        A0k(c3568Re);
        A0a();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AIv(Bundle bundle) {
    }

    private EnumC3997Yg getAppOpenAdVariant() {
        if (this.A03.A0v().equals(A0Z(0, 5, 93))) {
            return EnumC3997Yg.A08;
        }
        return EnumC3997Yg.A09;
    }

    public Integer getBackgroundColorForToolbar() {
        if (this.A03.A1W()) {
            return getAppOpenAdVariant().A03;
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public String getCurrentClientToken() {
        return this.A03.A2E();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!A0m() && Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
        A0d();
        if (A0G[6].charAt(4) == 'Z') {
            throw new RuntimeException();
        }
        A0G[3] = "kF6RESICu85JPno09mseATff07y9WxI4";
    }

    public void onDestroy() {
        this.A0D.A03();
        if (!TextUtils.isEmpty(this.A03.A2E())) {
            this.A06.AB7(this.A03.A2E(), new C4150b9().A03(this.A0C).A02(this.A08).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A08.A06(this.A05, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC3998Yh interfaceC3998Yh) {
    }

    public void setUpFullscreenMode(boolean z) {
        EnumC3951Xw enumC3951Xw;
        if (z) {
            enumC3951Xw = EnumC3951Xw.A03;
        } else {
            enumC3951Xw = EnumC3951Xw.A02;
        }
        this.A0D.A05(enumC3951Xw);
    }
}
