package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6M */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C22756M extends AbstractC3079Jg {
    public C4035ZI A00;
    public InterfaceC4255cq A01;
    public C4335e8 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public RelativeLayout A06;
    public C2850Fy A07;
    public final C4494gi A08;
    public final AbstractC2739EA A09;
    public final AbstractC2733E4 A0A;
    public final AbstractC2731E2 A0B;
    public final AbstractC2729E0 A0C;
    public final AbstractC2720Dr A0D;
    public final String A0E;
    public final Paint A0F;
    public final Path A0G;
    public final RectF A0H;
    public final C4210c7 A0I;
    public static String[] A0J = {"MpRqvkZj1q70y", "JmeA7cKwz52Cf66UfzrPr0LMRH4SYAx7", "6sdDVsKAMYqDcEUPGSGZSzHS1QCr5tGd", "kTGZxaoWJV94XtNMqSwvdL", "Mc6tnSsqpweEwwZBrEzxWewdD5U0ZBnH", "pH8A6EuZ6tOwC2LEaYgoPeYfMAE", "hIXMP87egv28CzL5Z81pRvvAccgq29VA", "kjeLkimcHFb7T02SebLVQF"};
    public static final int A0L = (int) (AbstractC3926XX.A02 * 0.0f);
    public static final int A0M = (int) (AbstractC3926XX.A02 * 9.0f);
    public static final int A0K = (int) (AbstractC3926XX.A02 * 9.0f);

    public C22756M(C4210c7 c4210c7, boolean z, String str, C2850Fy c2850Fy) {
        super(c4210c7, z);
        this.A0G = new Path();
        this.A0H = new RectF();
        this.A0D = new AbstractC2720Dr() { // from class: com.facebook.ads.redexgen.X.6S
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C2721Ds c2721Ds) {
                if (this.A00.getVideoView() != null) {
                    this.A00.A07.A0P().setVolume(this.A00.getVideoView().getVolume());
                }
            }
        };
        this.A09 = new AbstractC2739EA() { // from class: com.facebook.ads.redexgen.X.6R
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C21494K c21494k) {
                this.A00.A01();
                Object tag = this.A00.getTag(-1593835536);
                if (tag != null) {
                    this.A00.A07.A0N().AGM(((Integer) tag).intValue());
                }
            }
        };
        this.A0B = new AbstractC2731E2() { // from class: com.facebook.ads.redexgen.X.6Q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C2732E3 c2732e3) {
                this.A00.A00();
                this.A00.A07.A0O().AGY(this.A00);
            }
        };
        this.A0A = new AbstractC2733E4() { // from class: com.facebook.ads.redexgen.X.6O
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C21404B c21404b) {
                this.A00.A01();
                this.A00.A07.A0O().AGW(this.A00);
            }
        };
        this.A0C = new AbstractC2729E0() { // from class: com.facebook.ads.redexgen.X.6N
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C2730E1 c2730e1) {
                this.A00.A05 = true;
                this.A00.A02();
            }
        };
        this.A0I = c4210c7;
        this.A07 = c2850Fy;
        this.A0E = str;
        this.A08 = c4210c7.A06();
        setGravity(17);
        setPadding(A0L, 0, A0L, A0L);
        AbstractC3966YB.A0N(this, 0);
        setUpView(this.A08);
        this.A0F = new Paint();
        this.A0F.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.A0F.setStyle(Paint.Style.FILL);
        this.A0F.setAlpha(16);
        this.A0F.setAntiAlias(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        if (this.A0I.A0E() != null && this.A02 != null) {
            C2702DZ c2702dzA0E = this.A0I.A0E();
            C2775Ek simpleVideoView = this.A02.getSimpleVideoView();
            if (A0J[2].charAt(30) != 'G') {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[6] = "7Tm7E6hvxl2lrINlaGqN4b4kJs9I709m";
            strArr[1] = "njm7q4dCrj2NJr9FsCrNNlLowJdEGDJD";
            c2702dzA0E.AAv(simpleVideoView);
            if (C3763Up.A2L(getContext())) {
                this.A0I.A0E().A09(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (this.A0I.A0E() != null) {
            this.A0I.A0E().A06();
            if (this.A02 != null) {
                this.A0I.A0E().AKV(this.A02.getSimpleVideoView());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    public void A02() {
        if (this.A01 == null) {
            return;
        }
        if (!A1V()) {
            if (!A1V()) {
                return;
            } else {
                return;
            }
        }
        boolean z = this.A05;
        if (A0J[4].charAt(16) == 'S') {
            throw new RuntimeException();
        }
        A0J[4] = "H2PvwmHOgvOi5klEuL8elNjNTBtJADxS";
        if (!z) {
            if (!A1V() || !this.A04) {
                return;
            }
        }
        this.A01.ACz();
    }

    private void A03(View view) {
        RelativeLayout.LayoutParams layoutParams;
        if (view == null || (layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.addRule(13, -1);
        view.setLayoutParams(layoutParams);
    }

    public static void A04(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        AbstractC3966YB.A0K(view);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4206c3
    public final boolean A0A() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4206c3
    public final boolean A1O() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3079Jg
    public final void A1R() {
        if (A1V() && this.A02 != null) {
            C4335e8 c4335e8 = this.A02;
            if (A0J[4].charAt(16) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[0] = "PPsdw83Xwgr8n";
            strArr[5] = "5ciU0wOzbld7CiHKSmuHpDfStOE";
            c4335e8.A01();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3079Jg
    public final void A1S() {
        if (A1V()) {
            A1T();
            if (this.A02 != null) {
                this.A02.A05(EnumC4381et.A02);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3079Jg
    public final void A1T() {
        float volume = this.A07.A0P().getVolume();
        if (!A1V() || this.A02 == null) {
            return;
        }
        float newVolume = this.A02.getVolume();
        if (volume != newVolume) {
            this.A02.setVolume(volume);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3079Jg
    public final boolean A1U() {
        return A1V() && this.A02 != null && this.A02.A06();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3079Jg
    public final boolean A1V() {
        return this.A03;
    }

    public final void A1W(Map<String, String> extraParams) {
        if (this.A02 != null) {
            this.A02.A02();
            if (A1V()) {
                this.A02.A04(getAdEventManager(), this.A0E, extraParams);
            }
        }
    }

    public final C4335e8 getVideoView() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4206c3, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A0G.reset();
        this.A0H.set(0.0f, 0.0f, getWidth(), getHeight());
        int i2 = 0;
        int radius = getResources().getConfiguration().orientation;
        boolean z = radius == 1;
        if (z) {
            i2 = A0K;
        }
        this.A0G.addRoundRect(this.A0H, i2, i2, Path.Direction.CW);
        canvas.drawPath(this.A0G, this.A0F);
        RectF rectF = this.A0H;
        int radius2 = A0L;
        float f2 = radius2;
        int width = getWidth();
        int radius3 = A0L;
        float f3 = width - radius3;
        int height = getHeight();
        int radius4 = A0L;
        rectF.set(f2, 0.0f, f3, height - radius4);
        if (z) {
            i2 = A0M;
        }
        this.A0G.addRoundRect(this.A0H, i2, i2, Path.Direction.CW);
        canvas.clipPath(this.A0G);
        super.onDraw(canvas);
    }

    public void setCTAInfo(C3322Nc c3322Nc, Map<String, String> extraData) {
        getCtaButton().setCta(c3322Nc, this.A0E, extraData);
    }

    public void setImageUrl(String str) {
        if (this.A00 != null) {
            this.A00.setVisibility(0);
            new AsyncTaskC3183LM(this.A00, this.A08).A04().A06(new C3139Ke(this)).A07(str);
        }
        if (this.A02 != null) {
            this.A02.setVisibility(8);
        }
    }

    public void setIsVideo(boolean z) {
        this.A03 = z;
    }

    public void setOnAssetsLoadedListener(InterfaceC4255cq interfaceC4255cq) {
        this.A01 = interfaceC4255cq;
    }

    public void setUpImageView(C4494gi c4494gi) {
        this.A00 = new C4035ZI(c4494gi);
        if (C3763Up.A1J(c4494gi)) {
            AbstractC4153bC.A00(this.A00, C3763Up.A1K(c4494gi), new ViewOnClickListenerC4179bc(this));
        }
        A04(this.A00);
    }

    public void setUpMediaContainer(C4494gi c4494gi) {
        this.A06 = new RelativeLayout(c4494gi);
        A04(this.A06);
        if (this.A00 != null) {
            this.A06.addView(this.A00);
            A03(this.A00);
        }
        if (this.A02 != null) {
            this.A06.addView(this.A02);
            A03(this.A02);
        }
        addView(this.A06);
    }

    public void setUpVideoView(C4494gi c4494gi) {
        this.A02 = new C4335e8(c4494gi, new C3792VI(this.A0E, getAdEventManager()));
        if (C3763Up.A1L(c4494gi)) {
            AbstractC4153bC.A00(this.A02, C3763Up.A1M(c4494gi), new ViewOnClickListenerC4180bd(this));
        }
        C4335e8 c4335e8 = this.A02;
        if (A0J[2].charAt(30) != 'G') {
            throw new RuntimeException();
        }
        A0J[4] = "tNSgYVifT5FMSy2OwNBjuNxtKDkDnPPF";
        A04(c4335e8);
    }

    private void setUpView(C4494gi c4494gi) {
        setUpImageView(c4494gi);
        setUpVideoView(c4494gi);
        setUpMediaContainer(c4494gi);
    }

    public void setVideoPlaceholderUrl(String str) {
        if (this.A02 != null) {
            this.A02.setPlaceholderUrl(str);
        }
    }

    public void setVideoUrl(String str) {
        if (this.A00 != null) {
            this.A00.setVisibility(8);
        }
        C4335e8 c4335e8 = this.A02;
        String[] strArr = A0J;
        if (strArr[6].charAt(10) != strArr[1].charAt(10)) {
            throw new RuntimeException();
        }
        A0J[2] = "Key351avhXFGNIES0xzUdjVz8AR1nkGO";
        if (c4335e8 != null) {
            this.A02.setVisibility(0);
            this.A02.setVideoURI(str);
            this.A02.A03(this.A0D);
            this.A02.A03(this.A09);
            this.A02.A03(this.A0B);
            this.A02.A03(this.A0A);
            this.A02.A03(this.A0C);
        }
    }
}
