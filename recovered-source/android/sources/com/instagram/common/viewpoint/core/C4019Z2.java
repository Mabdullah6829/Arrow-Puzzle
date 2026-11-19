package com.instagram.common.viewpoint.core;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Z2 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4019Z2 extends FrameLayout {
    public static byte[] A0D;
    public static String[] A0E = {"EYRP1PEEhxzmFZofVXiCCrEXWQs6qPAa", "IPRTBS", "NsAYUXCCkxBbK0XyUhCt1xHChz5fZfMK", "fEJJ0", "6651Qynk9CVpAvzNTMvYSQKVDYa6iazW", "nD7S5n7VHEDKGeK1PzI1a27Vk58dSaaa", "vFV0GS7SjmRPmH7mLZ5yrXn6gSrRknN8", "LPfldR2r"};
    public static final int A0F;
    public boolean A00;
    public final C4674ji A01;
    public final AbstractC4669jd A02;
    public final C4494gi A03;
    public final InterfaceC3784VA A04;
    public final C3792VI A05;
    public final C3957Y2 A06;
    public final C3404Ow A07;
    public final AbstractC3398Oq A08;
    public final AbstractC4438fo A09;
    public final C4439fp A0A;
    public final String A0B;
    public final WeakReference<InterfaceC4018Z1> A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C4019Z2(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, C3648Sx c3648Sx, WeakReference<InterfaceC4018Z1> weakReference, int i2, int i3, int i4, int i5, C4674ji c4674ji, String str) {
        super(c4494gi);
        this.A06 = new C3957Y2();
        this.A03 = c4494gi;
        this.A04 = interfaceC3784VA;
        this.A01 = c4674ji;
        this.A0C = weakReference;
        this.A0B = str;
        AbstractC4669jd abstractC4669jdA0F = this.A01.A0F();
        if (abstractC4669jdA0F == null) {
            throw new IllegalStateException(A09(0, 32, 86));
        }
        this.A02 = this.A01.A0F();
        AbstractC3966YB.A0N(this, -1);
        this.A05 = new C3792VI(this.A01.A7O(), this.A04);
        this.A09 = A06();
        this.A0A = A07(i2, i5, i3, i4);
        LinearLayout linearLayout = new LinearLayout(c4494gi);
        linearLayout.setOrientation(1);
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        this.A08 = A04(c3648Sx);
        if (this.A08 != null) {
            linearLayout.addView(this.A08, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        this.A07 = A02(abstractC4669jdA0F);
        linearLayout.addView(this.A07, new LinearLayout.LayoutParams(-1, -2));
    }

    public static String A09(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b = (byte) ((bArrCopyOfRange[i5] - i4) - 99);
            if (A0E[6].charAt(17) == 'I') {
                throw new RuntimeException();
            }
            A0E[6] = "HyV3wef6DGt1nbLL1fRSvAmBe6VeBas4";
            bArrCopyOfRange[i5] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0F() {
        A0D = new byte[]{-6, 29, -39, 29, 26, 45, 26, -39, 27, 46, 39, 29, 37, 30, -39, 34, 44, -39, 28, 26, 39, 39, 40, 45, -39, 27, 30, -39, 39, 46, 37, 37, 52, 64, 62, -1, 55, 50, 52, 54, 51, 64, 64, 60, -1, 50, 53, 68, -1, 51, 50, 63, 63, 54, 67, -1, 52, 61, 58, 52, 60, 54, 53};
    }

    static {
        A0F();
        A0F = (int) (AbstractC3926XX.A02 * 40.0f);
    }

    private C3404Ow A02(AbstractC4669jd abstractC4669jd) {
        C3320Na c3320NaA00;
        C3311NR c3311nrA29 = abstractC4669jd.A29();
        AbstractC3438PW abstractC3438PW = new AbstractC3438PW() { // from class: com.facebook.ads.redexgen.X.6f
            public static byte[] A01;
            public static String[] A02 = {"69whQSJFXzC5tMS1mvBQof2SK7ErE5ZD", "1jHEgafKgZ1qGtZeFln5jYEaZuoTSi1L", "X7dL0uEA8hI8yFDxVjmpGWGPGaRf3imC", "xkNxR1N5ht6u5HrBYV6Jaj9BRbbqvvjX", "FzWiIV8jsRMCATg74qRy8XJg", "NPgeBhkCK5cdUCtVbQG3V7Bzbyz9qF6p", "wkBgnizDM2wMuU", "fQJYdDBiu8hI0YoMzyDMv7ESaoH1tCRU"};

            public static String A00(int i2, int i3, int i4) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                int i5 = 0;
                while (true) {
                    int length = bArrCopyOfRange.length;
                    String[] strArr = A02;
                    if (strArr[5].charAt(30) == strArr[3].charAt(30)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A02;
                    strArr2[5] = "zFlqgUHcpRBmVFunDUsFQIo1zDN3Ly6W";
                    strArr2[3] = "vgtBZdmtnd3XTM9GsG6r3isUaM0HNLHl";
                    if (i5 >= length) {
                        return new String(bArrCopyOfRange);
                    }
                    bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 4);
                    i5++;
                }
            }

            public static void A01() {
                A01 = new byte[]{-102};
            }

            static {
                A01();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC3998Yh
            public final void A4j(String str) {
                C3410P2.A00(this.A00.A03).A07(new Intent(str + A00(0, 1, 92) + this.A00.A0B));
            }
        };
        if (getOrientation() == 1) {
            c3320NaA00 = abstractC4669jd.A28().A01();
        } else {
            C3307NN c3307nnA28 = abstractC4669jd.A28();
            String[] strArr = A0E;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0E[7] = "bY8FFe1Y";
            c3320NaA00 = c3307nnA28.A00();
        }
        C3404Ow c3404Ow = new C3404Ow(this.A03, A0F, c3320NaA00, c3311nrA29.A0J().A06(), A09(32, 31, 110), this.A04, abstractC3438PW, this.A0A, this.A06, abstractC4669jd.A2A());
        c3404Ow.setInfo(c3311nrA29.A0I(), c3311nrA29.A0J(), this.A01.A7O(), abstractC4669jd.A2C().A01(), null, null);
        if (C3763Up.A1N(this.A03)) {
            c3404Ow.A0k();
        }
        return c3404Ow;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.6q] */
    private AbstractC3398Oq A04(C3648Sx c3648Sx) {
        final ViewOnClickListenerC4016Yz viewOnClickListenerC4016Yz = new ViewOnClickListenerC4016Yz(this);
        String videoUrl = this.A01.A0e();
        if (A0H(c3648Sx, this.A01) && videoUrl != null) {
            C22956g videoView = new C22956g(this.A03, this.A04, c3648Sx, this.A05, viewOnClickListenerC4016Yz, this.A02).A0I(this.A01.A7O(), videoUrl, this.A01.A0H() != null ? this.A01.A0H().getUrl() : null, this.A01.A0R(), this.A01.A0Q());
            if (C3763Up.A1R(this.A03)) {
                setViewAsCTA(videoView);
            }
            return videoView;
        }
        C3811Vb c3811VbA0H = this.A01.A0H();
        if (c3811VbA0H == null) {
            return null;
        }
        final C4494gi c4494gi = this.A03;
        final C3792VI c3792vi = this.A05;
        final AbstractC4669jd abstractC4669jd = this.A02;
        C23056q c23056qA0I = new AbstractC3398Oq(c4494gi, viewOnClickListenerC4016Yz, c3792vi, abstractC4669jd) { // from class: com.facebook.ads.redexgen.X.6q
            public final C4146b5 A00;

            {
                super(c4494gi, viewOnClickListenerC4016Yz, c3792vi, abstractC4669jd);
                this.A00 = new C4146b5(c4494gi);
                addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC3398Oq
            public final void A0E() {
                super.A0E();
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC3398Oq
            public final void A0F() {
                super.A0F();
                if (this.A04 != null) {
                    AbstractC3966YB.A0J(this.A04);
                    this.A04.setLayoutParams(AbstractC3398Oq.A0A(null));
                    addView(this.A04);
                }
            }

            public final C23056q A0I(String str) {
                new AsyncTaskC3183LM(this.A00, this.A08).A05(this.A00.getHeight(), this.A00.getWidth()).A06(new C3399Or(this)).A07(str);
                A0F();
                return this;
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC3398Oq
            public int getMediaViewId() {
                return this.A00.getId();
            }
        }.A0I(c3811VbA0H.getUrl());
        if (C3763Up.A1P(this.A03)) {
            setViewAsCTA(c23056qA0I);
        }
        return c23056qA0I;
    }

    private C3383Ob A06() {
        return new C3383Ob(this);
    }

    private C4439fp A07(int i2, int i3, int i4, int i5) {
        C4439fp c4439fp = new C4439fp(this, i2, i3, true, new WeakReference(this.A09), this.A03);
        c4439fp.A0W(i4);
        c4439fp.A0X(i5);
        return c4439fp;
    }

    private void A0C() {
        String strA0M = this.A01.A0M();
        if (!TextUtils.isEmpty(strA0M)) {
            C3899X6 c3899x6 = new C3899X6();
            C4494gi c4494gi = this.A03;
            Uri uriA00 = AbstractC3904XB.A00(strA0M);
            String adChoicesLinkUrl = this.A01.A7O();
            C3899X6.A0O(c3899x6, c4494gi, uriA00, adChoicesLinkUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A05.A04(EnumC3791VH.A0A, null);
        if (!AbstractC3389Oh.A00(this.A03.A02()).A0O(this.A03, false)) {
            A0C();
            return;
        }
        AbstractC4056Zd abstractC4056ZdA01 = AbstractC4057Ze.A01(this.A03, this.A04, this.A01.A7O(), this);
        if (abstractC4056ZdA01 == null) {
            A0C();
            return;
        }
        AbstractC3966YB.A0W(this);
        addView(abstractC4056ZdA01, new FrameLayout.LayoutParams(-1, -1));
        abstractC4056ZdA01.A0N();
    }

    private void A0E() {
        if (getVisibility() == 0 && this.A00 && hasWindowFocus()) {
            this.A0A.A0U();
        } else {
            this.A0A.A0V();
        }
    }

    public static boolean A0H(C3648Sx c3648Sx, C4674ji c4674ji) {
        String strA0e = c4674ji.A0e();
        if (TextUtils.isEmpty(strA0e)) {
            return false;
        }
        String videoUrl = c3648Sx.A0T(strA0e);
        return !TextUtils.isEmpty(videoUrl);
    }

    public final void A0I() {
        if (this.A08 != null) {
            this.A08.A0D();
        }
        if (this.A0A != null) {
            this.A0A.A0V();
        }
        AbstractC3966YB.A0J(this);
    }

    public final void A0J() {
        if (this.A08 != null) {
            AbstractC3398Oq abstractC3398Oq = this.A08;
            if (A0E[2].charAt(13) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[0] = "hgkEcT5pEsAUKYMkvVnojxGMD5WCOUSh";
            strArr[5] = "qBRuzdoZQfMYUt1SZmDdshQz8Ndd8EXP";
            abstractC3398Oq.A0E();
        }
    }

    private int getOrientation() {
        Activity activity = this.A03.A0E();
        if (activity != null) {
            return activity.getResources().getConfiguration().orientation;
        }
        return 1;
    }

    public C4439fp getViewabilityChecker() {
        return this.A0A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A00 = true;
        A0E();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00 = false;
        A0E();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        A0E();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A0E();
    }

    private void setViewAsCTA(View view) {
        view.setOnClickListener(new ViewOnClickListenerC4017Z0(this));
    }
}
