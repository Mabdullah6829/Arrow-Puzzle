package com.instagram.common.viewpoint.core;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.67 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC226067 extends AbstractC3079Jg implements InterfaceC3919XQ {
    public static byte[] A0L;
    public static String[] A0M = {"XgHadHW09EVAxZ9Csjyh8Iwd", "cGY", "0gnHO0byxZtUV0t5q6", "nitlVKI6s75UlUdu4qHy2TBluRJ6Vnqb", "dqu", "CAnKNEP5j3LNWAO1IgUwk41cBq", "Gj8h5dX0pUMTu0Q6FRM85YsFx7LjGw4a", "ydUjPQqek3X4wwrCfoz9Rz5n"};
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public RelativeLayout A00;
    public C4035ZI A01;

    @Nullable
    public InterfaceC4255cq A02;
    public C2850Fy A03;
    public C4335e8 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Path A09;
    public final RectF A0A;
    public final C4494gi A0B;
    public final C3921XS A0C;
    public final InterfaceC3998Yh A0D;
    public final C4210c7 A0E;
    public final AbstractC2739EA A0F;
    public final AbstractC2733E4 A0G;
    public final AbstractC2731E2 A0H;
    public final AbstractC2729E0 A0I;
    public final AbstractC2720Dr A0J;
    public final String A0K;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0M;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[1] = "5LW";
            strArr2[4] = "hlZ";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 11);
            i5++;
        }
    }

    public static void A03() {
        A0L = new byte[]{68, 70, 85, 72, 82, 84, 66, 75, 120, 68, 70, 85, 67};
    }

    public abstract void A1X(C4494gi c4494gi);

    static {
        A03();
        A0O = (int) (AbstractC3926XX.A02 * 1.0f);
        A0P = (int) (AbstractC3926XX.A02 * 4.0f);
        A0N = (int) (AbstractC3926XX.A02 * 6.0f);
    }

    public AbstractC226067(C4210c7 c4210c7, boolean z, String str, C2850Fy c2850Fy) {
        super(c4210c7, z);
        this.A09 = new Path();
        this.A0A = new RectF();
        this.A0J = new AbstractC2720Dr() { // from class: com.facebook.ads.redexgen.X.6C
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C2721Ds c2721Ds) {
                this.A00.A03.A0P().setVolume(this.A00.getVideoView().getVolume());
            }
        };
        this.A0F = new AbstractC2739EA() { // from class: com.facebook.ads.redexgen.X.6B
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C21494K c21494k) {
                this.A00.A03.A0N().AGM(((Integer) this.A00.getTag(-1593835536)).intValue());
            }
        };
        this.A0H = new AbstractC2731E2() { // from class: com.facebook.ads.redexgen.X.6A
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C2732E3 c2732e3) {
                this.A00.A03.A0O().AGY(this.A00);
            }
        };
        this.A0G = new AbstractC2733E4() { // from class: com.facebook.ads.redexgen.X.69
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C21404B c21404b) {
                this.A00.A03.A0O().AGW(this.A00);
            }
        };
        this.A0I = new AbstractC2729E0() { // from class: com.facebook.ads.redexgen.X.68
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C2730E1 c2730e1) {
                this.A00.A07 = true;
                this.A00.A02();
            }
        };
        this.A0D = c4210c7.A0C();
        this.A0E = c4210c7;
        this.A03 = c2850Fy;
        this.A0K = str;
        this.A0B = c4210c7.A06();
        this.A0C = C3921XS.A00(c4210c7.A06(), c4210c7.A05(), this);
        setGravity(17);
        setPadding(A0O, 0, A0O, A0O);
        AbstractC3966YB.A0N(this, 0);
        setUpView(this.A0B);
        this.A08 = new Paint();
        this.A08.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.A08.setStyle(Paint.Style.FILL);
        this.A08.setAlpha(16);
        this.A08.setAntiAlias(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        if (this.A02 == null) {
            return;
        }
        if ((A1V() && this.A07) || (!A1V() && this.A06)) {
            this.A02.ACz();
        }
    }

    private void A04(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        AbstractC3966YB.A0K(view);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4206c3
    public boolean A0A() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4206c3
    public final void A1C() {
        super.A1C();
        this.A0C.A03();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4206c3
    public final boolean A1O() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3079Jg
    public final void A1R() {
        if (A1V()) {
            this.A04.A01();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3079Jg
    public final void A1S() {
        if (A1V()) {
            A1T();
            C4335e8 c4335e8 = this.A04;
            EnumC4381et enumC4381et = EnumC4381et.A02;
            if (A0M[2].length() == 4) {
                throw new RuntimeException();
            }
            A0M[2] = "GrzUS";
            c4335e8.A05(enumC4381et);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3079Jg
    public final void A1T() {
        float volume = this.A03.A0P().getVolume();
        if (A1V()) {
            float newVolume = this.A04.getVolume();
            if (volume != newVolume) {
                C4335e8 c4335e8 = this.A04;
                if (A0M[5].length() == 9) {
                    throw new RuntimeException();
                }
                String[] strArr = A0M;
                strArr[1] = "cdp";
                strArr[4] = "iOc";
                c4335e8.setVolume(volume);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3079Jg
    public final boolean A1U() {
        if (A1V()) {
            boolean zA06 = this.A04.A06();
            if (A0M[2].length() == 4) {
                throw new RuntimeException();
            }
            A0M[2] = "SbvNib3Q04NWLkmSI4CaBbpy";
            if (zA06) {
                return true;
            }
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3079Jg
    public final boolean A1V() {
        return this.A05;
    }

    public final /* synthetic */ void A1W(View view) {
        getCtaButton().A0E(A01(0, 13, 44));
    }

    public final void A1Y(Map<String, String> extraParams) {
        this.A04.A02();
        if (A1V()) {
            this.A04.A04(getAdEventManager(), this.A0K, extraParams);
        }
    }

    public final RelativeLayout getMediaContainer() {
        return this.A00;
    }

    public final C4335e8 getVideoView() {
        return this.A04;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A09.reset();
        this.A0A.set(0.0f, 0.0f, getWidth(), getHeight());
        this.A09.addRoundRect(this.A0A, A0N, A0N, Path.Direction.CW);
        canvas.drawPath(this.A09, this.A08);
        this.A0A.set(A0O, 0.0f, getWidth() - A0O, getHeight() - A0O);
        this.A09.addRoundRect(this.A0A, A0P, A0P, Path.Direction.CW);
        canvas.clipPath(this.A09);
        super.onDraw(canvas);
    }

    public void setAdTitleAndDescription(String str, String str2) {
        getTitleDescContainer().A04(str, str2, null, true, false);
    }

    public void setCTAInfo(C3322Nc c3322Nc, Map<String, String> extraData) {
        getCtaButton().setCta(c3322Nc, this.A0K, extraData);
    }

    public void setImageUrl(String str) {
        this.A01.setVisibility(0);
        this.A04.setVisibility(8);
        new AsyncTaskC3183LM(this.A01, this.A0B).A04().A06(new C3078Jf(this)).A07(str);
    }

    public void setIsVideo(boolean z) {
        this.A05 = z;
    }

    public void setOnAssetsLoadedListener(InterfaceC4255cq interfaceC4255cq) {
        this.A02 = interfaceC4255cq;
    }

    public void setUpImageView(C4494gi c4494gi) {
        this.A01 = new C4035ZI(c4494gi);
        if (C3763Up.A1J(c4494gi)) {
            AbstractC4153bC.A00(this.A01, C3763Up.A1K(c4494gi), new ViewOnClickListenerC4261cw(this));
        }
        A04(this.A01);
    }

    public void setUpMediaContainer(C4494gi c4494gi) {
        this.A00 = new RelativeLayout(c4494gi);
        A04(this.A00);
        C3920XR c3920xrA02 = this.A0C.A02(this.A0E.A05());
        this.A0E.A06().A0H().A00(c3920xrA02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A0C);
        if (this.A0E.A05().A1e() && C3763Up.A2w(this.A0B)) {
            this.A00.setOnClickListener(new ViewOnClickListenerC4260cv(this));
        } else {
            if (!c3920xrA02.A00) {
                return;
            }
            this.A00.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.cu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A1W(view);
                }
            });
        }
    }

    public void setUpVideoView(C4494gi c4494gi) {
        this.A04 = new C4335e8(c4494gi, new C3792VI(this.A0K, getAdEventManager()));
        if (C3763Up.A1L(c4494gi)) {
            AbstractC4153bC.A00(this.A04, C3763Up.A1M(c4494gi), new ViewOnClickListenerC4262cx(this));
        }
        A04(this.A04);
    }

    private void setUpView(C4494gi c4494gi) {
        setUpImageView(c4494gi);
        setUpVideoView(c4494gi);
        setUpMediaContainer(c4494gi);
        this.A00.addView(this.A01);
        this.A00.addView(this.A04);
        A1X(c4494gi);
    }

    public void setVideoPlaceholderUrl(String str) {
        this.A04.setPlaceholderUrl(str);
    }

    public void setVideoUrl(String str) {
        this.A01.setVisibility(8);
        this.A04.setVisibility(0);
        this.A04.setVideoURI(str);
        this.A04.A03(this.A0J);
        this.A04.A03(this.A0F);
        this.A04.A03(this.A0H);
        this.A04.A03(this.A0G);
        this.A04.A03(this.A0I);
    }
}
