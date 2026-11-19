package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4335e8 extends FrameLayout {
    public static final int A08 = AbstractC3924XV.A0b;
    public C22936e A00;
    public C2785Eu A01;
    public C21504L A02;
    public C2708Df A03;
    public C20963S A04;
    public C207434 A05;
    public final C4494gi A06;
    public final C3792VI A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A04(InterfaceC3784VA interfaceC3784VA, String str, Map<String, String> map) {
        A02();
        this.A02 = new C21504L(this.A06, interfaceC3784VA, this.A00, str, null, map);
        if (C3763Up.A20(this.A06)) {
            this.A01 = new C2785Eu(this.A06, interfaceC3784VA, this.A00, str, false, this.A02, map);
        } else {
            this.A01 = null;
        }
    }

    public C4335e8(C4494gi c4494gi, C3792VI c3792vi) {
        super(c4494gi);
        this.A07 = c3792vi;
        this.A06 = c4494gi;
        setUpView(c4494gi);
    }

    public final void A01() {
        A0i(true, 10);
    }

    public final void A02() {
        if (this.A01 != null) {
            this.A01.A07();
            this.A01 = null;
        }
        if (this.A02 != null) {
            this.A02.A0p();
            this.A02 = null;
        }
    }

    public final void A03(AbstractC3735UN abstractC3735UN) {
        getEventBus().A05(abstractC3735UN);
    }

    public final void A05(EnumC4381et enumC4381et) {
        A0e(enumC4381et, 13);
    }

    public final boolean A06() {
        return A0p();
    }

    public C2775Ek getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C4494gi c4494gi) {
        A0Y();
        this.A04 = new C20963S(c4494gi);
        A0f(this.A04);
        this.A03 = new C2708Df(c4494gi, this.A07);
        A0f(new C21193q(c4494gi));
        A0f(this.A03);
        this.A05 = new C207434(c4494gi, true, this.A07);
        A0f(this.A05);
        A0f(new C2710Dh(this.A05, EnumC4397f9.A02, true, true));
        if (!A0k()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        layoutParams.setMargins(A08, A08, A08, A08);
        this.A03.setLayoutParams(layoutParams);
        addView(this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.6e] */
    private void setUpVideo(final C4494gi c4494gi) {
        this.A00 = new C2775Ek(c4494gi) { // from class: com.facebook.ads.redexgen.X.6e
            @Override // android.widget.RelativeLayout, android.view.View
            public final void onMeasure(int i2, int i3) {
                int newWidthSpec = View.MeasureSpec.getMode(i2);
                if (newWidthSpec == 1073741824) {
                    i3 = i2;
                } else {
                    int newWidthSpec2 = View.MeasureSpec.getMode(i3);
                    if (newWidthSpec2 == 1073741824) {
                        i2 = i3;
                    }
                }
                super.onMeasure(i2, i3);
            }
        };
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        AbstractC3966YB.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new ViewOnClickListenerC4334e7(this));
    }

    private void setUpView(C4494gi c4494gi) {
        setUpVideo(c4494gi);
        setUpPlugins(c4494gi);
    }

    public void setVideoURI(String str) {
        setVideoURI(str);
    }

    public void setVolume(float f2) {
        setVolume(f2);
        this.A03.A09();
    }
}
