package com.instagram.common.viewpoint.core;

import android.animation.AnimatorSet;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ek */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2775Ek extends RelativeLayout implements InterfaceC4437fn, InterfaceC4370ei {
    public static byte[] A0F;
    public static String[] A0G = {"3L6CoO6YtrcW", "MjcsiBOYcGfrGyZBxeZgAjKXsDYhFJK", "NbVxNqWnj3", "Ob7MM92eIAC3XgmL", "XSQst8sM3v9Waw60ED5t21eOsn1IQUtw", "wvdS5a619fbySZdqvbmzcB7w", "WLvo7626w9dzVwCTBg7InBeeg1a7HKE3", "kYDrs41aRZaYTR0SA8npQuCfjZz7Tio6"};
    public static final C2738E9 A0H;
    public static final C2732E3 A0I;
    public static final C2730E1 A0J;
    public static final C2725Dw A0K;
    public static final C2724Dv A0L;
    public static final C2721Ds A0M;
    public static final C2719Dq A0N;
    public static final C2718Dp A0O;
    public float A00;
    public int A01;
    public C3792VI A02;
    public C4378eq A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08;
    public final Handler A09;
    public final View.OnTouchListener A0A;
    public final C4494gi A0B;
    public final C3734UM<AbstractC3735UN, C3733UL> A0C;
    public final List<InterfaceC4382eu> A0D;
    public final InterfaceC4434fk A0E;

    public static String A0G(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0G;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[6] = "HxnswxUpcuHv1wuLD4berTHtADZcXTin";
            strArr2[4] = "I3xDTi7RY5fAtwEllKfD6KKH3DCBcY9z";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 57);
            i5++;
        }
    }

    public static void A0J() {
        A0F = new byte[]{93, -80, -94, -96, 93, -79, -84, -79, -98, -87, 93, -76, -98, -79, -96, -91, 93, -79, -90, -86, -94, 125, -81, -84, -84, -97, -88, -82, -90, -77, 90, -101, -82, 90};
    }

    static {
        A0J();
        A0J = new C2730E1();
        A0H = new C2738E9();
        A0K = new C2725Dw();
        A0L = new C2724Dv();
        A0I = new C2732E3();
        A0M = new C2721Ds();
        A0O = new C2718Dp();
        A0N = new C2719Dq();
    }

    public C2775Ek(C4494gi c4494gi) {
        super(c4494gi);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new C3734UM<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new ViewOnTouchListenerC4369eh(this);
        this.A0B = c4494gi;
        if (A0T(c4494gi)) {
            this.A0E = new TextureViewSurfaceTextureListenerC2666Cz(c4494gi);
        } else {
            this.A0E = new TextureViewSurfaceTextureListenerC2665Cy(c4494gi);
        }
        A0H();
    }

    public C2775Ek(C4494gi c4494gi, AttributeSet attributeSet) {
        super(c4494gi, attributeSet);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new C3734UM<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new ViewOnTouchListenerC4369eh(this);
        this.A0B = c4494gi;
        if (A0T(c4494gi)) {
            this.A0E = new TextureViewSurfaceTextureListenerC2666Cz(c4494gi, attributeSet);
        } else {
            this.A0E = new TextureViewSurfaceTextureListenerC2665Cy(c4494gi, attributeSet);
        }
        A0H();
    }

    public C2775Ek(C4494gi c4494gi, AttributeSet attributeSet, int i2) {
        super(c4494gi, attributeSet, i2);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new C3734UM<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new ViewOnTouchListenerC4369eh(this);
        this.A0B = c4494gi;
        if (A0T(c4494gi)) {
            this.A0E = new TextureViewSurfaceTextureListenerC2666Cz(c4494gi, attributeSet, i2);
        } else {
            this.A0E = new TextureViewSurfaceTextureListenerC2665Cy(c4494gi, attributeSet, i2);
        }
        A0H();
    }

    private float A06(InterfaceC4434fk interfaceC4434fk) {
        int videoHeight = interfaceC4434fk.getVideoHeight();
        if (videoHeight == 0) {
            return 1.0f;
        }
        int height = interfaceC4434fk.getVideoWidth();
        return height / videoHeight;
    }

    public static /* synthetic */ C2725Dw A0E() {
        C2725Dw c2725Dw = A0K;
        if (A0G[7].charAt(27) == '4') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[5] = "Ykw7x5qbt5Y8x48JghoZKWeO";
        strArr[0] = "cKnPTPxPmv7r";
        return c2725Dw;
    }

    private void A0H() {
        this.A07 = C3763Up.A0t(this.A0B);
        this.A0B.A0F().A3d();
        this.A0E.setRequestedVolume(1.0f);
        this.A0E.setVideoStateChangeListener(this);
        this.A03 = new C4378eq(this.A0B, this.A0E);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        AbstractC3966YB.A0K(this.A03);
        addView(this.A03, layoutParams);
        setOnTouchListener(this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I() {
        this.A08.postDelayed(new C2783Es(this), this.A01);
    }

    private final void A0K() {
        for (InterfaceC4382eu interfaceC4382eu : this.A0D) {
            boolean z = interfaceC4382eu instanceof AbstractC2742ED;
            String[] strArr = A0G;
            if (strArr[6].charAt(13) != strArr[4].charAt(13)) {
                throw new RuntimeException();
            }
            A0G[3] = "f6iKlyOeYddBSkQQnaXOCc7KzH8j";
            if (z) {
                A0R((AbstractC2742ED) interfaceC4382eu);
            }
            interfaceC4382eu.AAv(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(int i2) {
        if (C3763Up.A10(this.A0B)) {
            Toast.makeText(this.A0B, A0G(21, 13, 1) + (i2 / 1000.0f) + A0G(0, 21, 4), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(EnumC3791VH enumC3791VH) {
        if (this.A02 == null) {
            return;
        }
        this.A02.A04(enumC3791VH, null);
    }

    private void A0Q(InterfaceC4382eu interfaceC4382eu) {
        if (interfaceC4382eu instanceof AbstractC2742ED) {
            A0S((AbstractC2742ED) interfaceC4382eu);
        }
        interfaceC4382eu.AKV(this);
    }

    private void A0R(AbstractC2742ED abstractC2742ED) {
        if (abstractC2742ED.getParent() == null) {
            if (abstractC2742ED instanceof C20963S) {
                this.A03.A02(abstractC2742ED);
            } else {
                addView(abstractC2742ED);
            }
        }
    }

    private void A0S(AbstractC2742ED abstractC2742ED) {
        if (abstractC2742ED instanceof C20963S) {
            this.A03.A03(abstractC2742ED);
        } else {
            AbstractC3966YB.A0J(abstractC2742ED);
        }
    }

    private boolean A0T(C4494gi c4494gi) {
        return C3763Up.A31(c4494gi, C4421fX.A03());
    }

    public final void A0W() {
        this.A0E.setVideoStateChangeListener(null);
        this.A0E.destroy();
    }

    public final void A0X() {
        if (A0n()) {
            return;
        }
        this.A0E.A9d();
    }

    public final void A0Y() {
        Iterator<InterfaceC4382eu> it = this.A0D.iterator();
        while (it.hasNext()) {
            A0Q(it.next());
        }
        this.A0D.clear();
    }

    public final void A0Z(int i2) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A03.getLayoutParams();
        layoutParams.removeRule(13);
        layoutParams.removeRule(10);
        layoutParams.removeRule(9);
        if (this.A00 == 1.0f) {
            this.A00 = A06(this.A0E);
        }
        if (i2 == 1) {
            layoutParams.addRule(10);
        } else if (AbstractC3914XL.A05(this.A00)) {
            layoutParams.addRule(13);
        } else {
            layoutParams.addRule(9);
        }
        C4378eq c4378eq = this.A03;
        if (A0G[3].length() == 1) {
            throw new RuntimeException();
        }
        A0G[7] = "Fk13SNDKaQVX0dV87s1e6TAwbDOb9nQX";
        c4378eq.setLayoutParams(layoutParams);
    }

    public final void A0a(int i2) {
        this.A08.removeCallbacksAndMessages(null);
        this.A0E.seekTo(i2);
    }

    public final void A0b(int i2) {
        this.A0E.AKF(i2);
    }

    public final void A0c(AnimatorSet animatorSet, boolean z) {
        this.A03.A01(animatorSet, z);
    }

    public final void A0d(EnumC4373el enumC4373el) {
        C2778En c2778En = new C2778En(this);
        if (this.A07) {
            ExecutorC3959Y4.A00(c2778En);
        } else {
            this.A09.post(c2778En);
        }
        this.A0E.AK1(enumC4373el.A03());
    }

    public final void A0e(EnumC4381et enumC4381et, int i2) {
        if (this.A04 && this.A0E.getState() == EnumC4436fm.A06) {
            this.A04 = false;
        }
        this.A0E.AK6(enumC4381et, i2);
        if (A0G[7].charAt(27) == '4') {
            throw new RuntimeException();
        }
        A0G[3] = "hMpnI8E";
    }

    public final void A0f(InterfaceC4382eu interfaceC4382eu) {
        this.A0D.add(interfaceC4382eu);
    }

    public final void A0g(InterfaceC4382eu interfaceC4382eu) {
        this.A0D.remove(interfaceC4382eu);
        A0Q(interfaceC4382eu);
    }

    public final void A0h(boolean z) {
        A0i(z, 0);
    }

    public final void A0i(boolean z, int i2) {
        if (A0n()) {
            return;
        }
        this.A0E.AGr(z, i2);
    }

    public final void A0j(boolean z, boolean z2, int i2) {
        this.A06 = z2;
        A0i(z, i2);
    }

    public final boolean A0k() {
        return this.A0E.A9q();
    }

    public final boolean A0l() {
        return this.A0E.A9r();
    }

    public final boolean A0m() {
        return getVolume() == 0.0f;
    }

    public final boolean A0n() {
        return getState() == EnumC4436fm.A05;
    }

    public final boolean A0o() {
        return A0n() && this.A0E.AAc();
    }

    public final boolean A0p() {
        return getState() == EnumC4436fm.A0A;
    }

    public final boolean A0q() {
        return this.A07;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4370ei
    public final boolean AAQ() {
        return A0T(this.A0B);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4370ei
    public final boolean AAV() {
        return this.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4437fn
    public final void ADy(final long j2, final long j3, final long j4, final float f2) {
        if (!C3763Up.A20(this.A0B)) {
            return;
        }
        this.A0C.A02(new AbstractC2741EC(j2, j3, j4, f2) { // from class: com.facebook.ads.redexgen.X.4F
        });
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4437fn
    public final void AEo() {
        A0i(true, 4);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4437fn
    public final void AEp() {
        A0e(EnumC4381et.A04, 6);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4437fn
    public final void AFr(int i2, int i3) {
        C2780Ep c2780Ep = new C2780Ep(this, i2, i3);
        if (this.A07) {
            ExecutorC3959Y4.A00(c2780Ep);
        } else {
            this.A09.post(c2780Ep);
        }
        A0I();
        if (A0G[3].length() == 1) {
            throw new RuntimeException();
        }
        A0G[7] = "9p5A7Zams3NJ3CBp1FBA5yfXzv5AdeGa";
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4437fn
    public final void AGd(EnumC4436fm enumC4436fm) {
        int currentPositionInMillis = getCurrentPositionInMillis();
        int currentPositionMS = getDuration();
        C2782Er c2782Er = new C2782Er(this, enumC4436fm, currentPositionInMillis, currentPositionMS);
        if (this.A07) {
            ExecutorC3959Y4.A00(c2782Er);
        } else {
            this.A09.post(c2782Er);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4370ei
    public int getCurrentPositionInMillis() {
        return this.A0E.getCurrentPosition();
    }

    public int getDuration() {
        return this.A0E.getDuration();
    }

    public C3734UM<AbstractC3735UN, C3733UL> getEventBus() {
        return this.A0C;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4370ei
    public long getInitialBufferTime() {
        return this.A0E.getInitialBufferTime();
    }

    public List<InterfaceC4382eu> getPlugins() {
        return this.A0D;
    }

    public EnumC4436fm getState() {
        return this.A0E.getState();
    }

    public Handler getStateHandler() {
        return this.A09;
    }

    public TextureView getTextureView() {
        return (TextureView) this.A0E;
    }

    public int getVideoHeight() {
        return this.A0E.getVideoHeight();
    }

    public View getVideoImplView() {
        return this.A0E.getView();
    }

    public int getVideoProgressReportIntervalMs() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4370ei
    public EnumC4381et getVideoStartReason() {
        return this.A0E.getStartReason();
    }

    public View getVideoView() {
        return this.A03;
    }

    public int getVideoWidth() {
        return this.A0E.getVideoWidth();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4370ei
    public float getVolume() {
        return this.A0E.getVolume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.A0C.A02(A0N);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.A0C.A02(A0O);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        if (this.A0E != null) {
            this.A0E.setControlsAnchorView(view);
        }
    }

    public void setFunnelLoggingHandler(C3792VI c3792vi) {
        this.A02 = c3792vi;
    }

    public void setIsFullScreen(boolean z) {
        this.A05 = z;
        this.A0E.setFullScreen(z);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setRoundedCornerVideoView(float f2) {
        this.A03.setRoundedCornersVideoStyle(f2);
    }

    public void setVideoMPD(String str) {
        this.A0E.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i2) {
        this.A01 = i2;
    }

    public void setVideoURI(Uri uri) {
        if (uri == null) {
            A0Y();
        } else {
            A0K();
            if (A0G[2].length() != 10) {
                throw new RuntimeException();
            }
            A0G[2] = "2vtziZXFfU";
            this.A0E.setup(uri);
        }
        this.A04 = false;
    }

    public void setVideoURI(String str) {
        this.A0B.A0F().A3k(str);
        setVideoURI(str != null ? AbstractC3904XB.A00(str) : null);
    }

    public void setVolume(float f2) {
        if (f2 == 1.0f) {
            A0M(EnumC3791VH.A0n);
            this.A0B.A0F().A3o();
        } else {
            A0M(EnumC3791VH.A0m);
            this.A0B.A0F().A3n();
        }
        this.A0E.setRequestedVolume(f2);
        getEventBus().A02(A0M);
    }
}
