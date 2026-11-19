package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.C1137R;
import com.facebook.ads.DefaultMediaViewVideoRenderer;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.AdComponentView;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdComponentViewParentApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4524hC extends C3576Rm implements MediaViewApi, Repairable, InterfaceC3655T4, InterfaceC4055Zc {
    public static byte[] A0L;
    public static String[] A0M = {"opPNeHLRCwNMjghH70VvpS5N8kNNBiJu", "eEOY2RUjN4bpbDsCyz0GPhNNbfKnjNLD", "VFQc0pqb8IELGhnpfLoj2hUSBo2VhTCu", "GBUHck22", "gxS7cL5mKFosIlCCzwl1gr8LaZQoy", "JvRhV7isjcFk5", "Q8NK4BrUIZ6kI5bk", "yT7QEu4e"};
    public static final String A0N;
    public View A02;
    public View A03;
    public ImageView A04;
    public ImageView A05;
    public RelativeLayout A06;
    public MediaView A07;
    public MediaViewListener A08;
    public MediaViewVideoRenderer A09;
    public AdComponentViewParentApi A0A;
    public C4494gi A0C;
    public C3917XO A0D;
    public C19450x A0E;
    public C4146b5 A0F;
    public C4174bX A0G;
    public C225562 A0H;
    public C4342eF A0I;
    public boolean A0J;
    public boolean A0K;
    public EnumC3585Rv A0B = EnumC3585Rv.A04;
    public int A01 = 0;
    public int A00 = 0;

    public static String A05(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0M;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[6] = "ck5ggAbj2vioxfDq";
            strArr2[4] = "NneLGMvrJ83sFMBsADIKrHrKRcoTv";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 74);
            i5++;
        }
    }

    public static void A0C() {
        A0L = new byte[]{-61, -31, -14, -17, -11, -13, -27, -20, -96, -14, -27, -18, -28, -27, -14, -27, -14, -96, -19, -11, -13, -12, -96, -30, -27, -96, -13, -27, -12, -96, -30, -27, -26, -17, -14, -27, -96, -18, -31, -12, -23, -10, -27, -63, -28, -82, 9, 5, 4, 56, 39, 44, 40, 49, 38, 40, 17, 40, 55, 58, 50, 53, 46, -52, -16, -28, -22, -24, -93, -11, -24, -15, -25, -24, -11, -24, -11, -93, -16, -8, -10, -9, -93, -27, -24, -93, -10, -24, -9, -93, -27, -24, -23, -14, -11, -24, -93, -15, -28, -9, -20, -7, -24, -60, -25, -79, -7, 29, 17, 23, 21, -48, 34, 21, 30, 20, 21, 34, 21, 34, -48, 29, 37, 35, 36, -48, 18, 21, -48, 35, 21, 36, -48, 18, 21, 22, 31, 34, 21, -48, 30, 17, 36, 25, 38, 21, -14, 17, 30, 30, 21, 34, -15, 20, -34, -83, -46, -38, -59, -48, -51, -56, -124, -70, -51, -55, -37, -124, -57, -45, -46, -41, -40, -42, -39, -57, -40, -45, -42, -124, -44, -59, -42, -59, -47, -41, -124, -40, -35, -44, -55, -110, -62, -43, -24, -35, -22, -39, -108, -75, -40, -108, -67, -41, -29, -30, -108, -35, -25, -108, -30, -23, -32, -32, -94, -26, -7, -12, -11, -1, -80, 2, -11, -2, -12, -11, 2, -11, 2, -80, -3, 5, 3, 4, -80, -14, -11, -80, 3, -11, 4, -80, -14, -11, -10, -1, 2, -11, -80, -2, -15, 4, -7, 6, -11, -47, -12, -66, -41, -26, -33, -70, -58, -60, -123, -67, -72, -70, -68, -71, -58, -58, -62, -123, -72, -69, -54, -123, -59, -72, -53, -64, -51, -68, -123, -70, -61, -64, -70, -62, -68, -69, -15, -28, -33, -32, -22, -48, -19, -25, -72};
    }

    static {
        A0C();
        A0N = MediaView.class.getSimpleName();
    }

    private void A06() {
        this.A0C.A0F().ABd();
        this.A0G = new C4174bX(this.A0C, false);
        this.A0G.setImagePadding(AbstractC3924XV.A0A);
        this.A0G.setImage(EnumC3977YM.FILL_CLOSE);
        this.A0G.A03(0, -7829368, 0, false);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC3924XV.A0G, AbstractC3924XV.A0G);
        layoutParams.addRule(11);
        layoutParams.addRule(6, this.A02.getId());
        layoutParams.setMargins(AbstractC3924XV.A00, AbstractC3924XV.A0U, AbstractC3924XV.A0U, AbstractC3924XV.A00);
        A0D(this.A0G, layoutParams);
        this.A0A.bringChildToFront(this.A0G);
    }

    private void A07() {
        if (this.A0H != null) {
            this.A0H.setVisibility(8);
            AbstractC3449Ph.A0A(this.A0H.getDynamicWebViewController().A0O(), new ColorDrawable(0));
            this.A07.removeView(this.A0H);
            this.A0H = null;
        }
    }

    private void A08() {
        if (this.A0D != null && !this.A0D.A04()) {
            this.A0D.A06();
        }
    }

    private void A09() {
        if (this.A0D != null && !this.A0D.A04()) {
            this.A0D.A07();
        }
    }

    private void A0A() {
        if (!this.A0K) {
            if (this.A03 != null) {
                AbstractC3966YB.A0J(this.A0E);
            }
            float f2 = AbstractC3926XX.A02;
            float density = 4.0f * f2;
            int hPadding = Math.round(density);
            float density2 = 12.0f * f2;
            int vPadding = Math.round(density2);
            this.A0E.setChildSpacing(hPadding);
            this.A0E.setPadding(0, vPadding, 0, vPadding);
            this.A0E.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03 = this.A0E;
            this.A07.addView(this.A03, layoutParams);
            return;
        }
        throw new IllegalStateException(A05(0, 46, 54));
    }

    private void A0B() {
        EnumC3931Xc.A04(this.A07, EnumC3931Xc.A0B);
        EnumC3931Xc.A04(this.A0F, EnumC3931Xc.A0B);
        EnumC3931Xc.A04(this.A09, EnumC3931Xc.A0B);
        EnumC3931Xc.A04(this.A03, EnumC3931Xc.A0B);
    }

    private final void A0D(View view, ViewGroup.LayoutParams layoutParams) {
        A01(false);
        this.A07.addView(view, layoutParams);
        A01(true);
    }

    private void A0E(View view, C3732UK c3732uk) {
        if (this.A0I != null) {
            this.A07.removeView(this.A0I);
        }
        if (!c3732uk.A1t()) {
            return;
        }
        String strA1I = c3732uk.A1I();
        if (this.A07.getContext() == null) {
            return;
        }
        this.A0I = AbstractC4341eE.A01(this.A0C, strA1I);
        if (this.A0I != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(5, view.getId());
            layoutParams.addRule(7, view.getId());
            layoutParams.addRule(6, view.getId());
            layoutParams.addRule(8, view.getId());
            layoutParams.addRule(16, view.getId());
            layoutParams.addRule(17, view.getId());
            A0D(this.A0I, layoutParams);
            this.A0A.bringChildToFront(this.A0I);
        }
    }

    private void A0F(ImageView imageView) {
        if (!this.A0K) {
            ImageView imageView2 = this.A04;
            if (A0M[5].length() != 13) {
                throw new RuntimeException();
            }
            A0M[1] = "0pGJtKTiEG7M1QZmgSqLESVqtH6XSoGw";
            if (imageView2 != null) {
                AbstractC3966YB.A0J(this.A04);
            }
            imageView.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A07.addView(imageView, layoutParams);
            imageView.setId(AbstractC3966YB.A00());
            this.A04 = imageView;
            return;
        }
        throw new IllegalStateException(A05(106, 49, 102));
    }

    private final void A0G(C4494gi c4494gi, AttributeSet attributeSet, int i2, int i3, MediaView mediaView) {
        this.A07 = mediaView;
        A0F(new ImageView(c4494gi, attributeSet, i2, i3));
        A0S(new C4146b5(c4494gi, attributeSet, i2, i3));
        this.A0E = new C19450x(c4494gi, attributeSet, i2);
        A0A();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c4494gi, attributeSet, i2, i3));
        A0B();
    }

    private final void A0H(C4494gi c4494gi, AttributeSet attributeSet, int i2, MediaView mediaView) {
        this.A07 = mediaView;
        A0F(new ImageView(c4494gi, attributeSet, i2));
        A0S(new C4146b5(c4494gi, attributeSet, i2));
        this.A0E = new C19450x(c4494gi, attributeSet, i2);
        A0A();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c4494gi, attributeSet, i2));
        A0B();
    }

    private final void A0I(C4494gi c4494gi, AttributeSet attributeSet, MediaView mediaView) {
        this.A07 = mediaView;
        A0F(new ImageView(c4494gi, attributeSet));
        A0S(new C4146b5(c4494gi, attributeSet));
        this.A0E = new C19450x(c4494gi, attributeSet);
        A0A();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c4494gi, attributeSet));
        A0B();
    }

    private final void A0J(C4494gi c4494gi, MediaView mediaView) {
        this.A07 = mediaView;
        A0F(new ImageView(c4494gi));
        A0S(new C4146b5(c4494gi));
        this.A0E = new C19450x(c4494gi);
        A0A();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c4494gi));
        A0B();
    }

    private void A0K(C3732UK c3732uk) {
        c3732uk.A1j(this);
    }

    private void A0L(final C3732UK c3732uk) {
        if (this.A0G != null) {
            this.A0G.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Rw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A0Z(c3732uk, view);
                }
            });
        }
    }

    private void A0M(C3732UK c3732uk) {
        if (this.A0D != null) {
            this.A0D.A06();
            this.A0D = null;
        }
        if (this.A0G != null) {
            this.A07.removeView(this.A0G);
            this.A0G = null;
        }
        if (c3732uk.A1q()) {
            A06();
            A0L(c3732uk);
            A0P(c3732uk);
            A0K(c3732uk);
        }
    }

    private void A0N(C3732UK c3732uk) {
        this.A00 = 0;
        if (this.A05 != null) {
            this.A07.removeView(this.A05);
            String[] strArr = A0M;
            if (strArr[2].charAt(31) != strArr[0].charAt(31)) {
                throw new RuntimeException();
            }
            A0M[5] = "SLqcyKPzacI72";
            this.A05 = null;
        }
        if (c3732uk.A1r()) {
            this.A0C.A0F().ABe();
            this.A05 = new ImageView(this.A0C);
            this.A05.setImageBitmap(AbstractC3978YN.A01(EnumC3977YM.FILL_CLOSE));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC3924XV.A0G, AbstractC3924XV.A0G);
            layoutParams.addRule(11);
            layoutParams.addRule(6, this.A02.getId());
            layoutParams.setMargins(AbstractC3924XV.A00, AbstractC3924XV.A0U, AbstractC3924XV.A0U, AbstractC3924XV.A00);
            A0D(this.A05, layoutParams);
            this.A0A.bringChildToFront(this.A05);
            A0O(c3732uk);
        }
    }

    private void A0O(final C3732UK c3732uk) {
        if (this.A05 != null) {
            this.A05.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Rx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A0a(c3732uk, view);
                }
            });
        }
    }

    private void A0P(C3732UK c3732uk) {
        if (this.A0G != null) {
            int iA0y = c3732uk.A0y();
            this.A0D = new C3917XO(iA0y, new C4525hD(this, iA0y));
            this.A0D.A07();
        }
    }

    private void A0Q(final C3732UK c3732uk, boolean z) {
        if (this.A06 != null) {
            this.A07.removeView(this.A06);
            if (A0M[5].length() != 13) {
                throw new RuntimeException();
            }
            A0M[5] = "ljpGBw4ulgnIo";
            this.A06 = null;
        }
        if (c3732uk.A13() != null && c3732uk.A13().A2U()) {
            this.A06 = new RelativeLayout(this.A0C);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (z) {
                layoutParams.addRule(10);
            } else {
                layoutParams.addRule(12);
                layoutParams.addRule(21);
            }
            C4084a5 c4084a5 = new C4084a5(this.A0C, EnumC4101aM.A05);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            if (z) {
                layoutParams2.setMargins(AbstractC3924XV.A0A, AbstractC3924XV.A0A, AbstractC3924XV.A00, AbstractC3924XV.A00);
            } else {
                int i2 = AbstractC3924XV.A00;
                String[] strArr = A0M;
                if (strArr[6].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0M;
                strArr2[2] = "wMv0uQjYnC0gE49Cu2XgtVhibZPJIfwu";
                strArr2[0] = "eHWX3hnc2MQEr3W9NzLO2AooGOj1mFxu";
                layoutParams2.setMargins(i2, AbstractC3924XV.A00, AbstractC3924XV.A0U, AbstractC3924XV.A0U);
            }
            this.A06.addView(c4084a5, layoutParams2);
            c4084a5.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Ry
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A0Y(c3732uk, view);
                }
            });
            A0D(this.A06, layoutParams);
            this.A0A.bringChildToFront(this.A06);
        }
    }

    private void A0R(C3732UK c3732uk, boolean z, C3811Vb c3811Vb) {
        AsyncTaskC3183LM asyncTaskC3183LMA04 = new AsyncTaskC3183LM(this.A04, this.A0C).A04();
        if (z) {
            asyncTaskC3183LMA04.A06(new C4532hK(this, c3732uk));
        }
        asyncTaskC3183LMA04.A07(c3811Vb.getUrl());
    }

    private void A0S(C4146b5 c4146b5) {
        if (!this.A0K) {
            if (this.A0F != null) {
                this.A07.removeView(this.A0F);
            }
            c4146b5.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A07.addView(c4146b5, layoutParams);
            this.A0F = c4146b5;
            return;
        }
        throw new IllegalStateException(A05(63, 43, 57));
    }

    private boolean A0T(NativeAd nativeAd) {
        List<NativeAd> carousel = ((C3592S2) nativeAd.getNativeAdApi()).A04();
        if (carousel == null) {
            return false;
        }
        Iterator<NativeAd> it = carousel.iterator();
        while (it.hasNext()) {
            if (it.next().getAdCoverImage() == null) {
                return false;
            }
        }
        if (A0M[5].length() != 13) {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[6] = "NNKiamhSotpSBh0S";
        strArr[4] = "WQowSckFUFZtjqKDGN1yGWQ8HKryj";
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0U(NativeAd nativeAd) {
        return !TextUtils.isEmpty(((C3592S2) nativeAd.getNativeAdApi()).A03());
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0318  */
    public final void A0W(NativeAd nativeAd) {
        AbstractC4670je abstractC4670je;
        ViewParent parent;
        C4494gi adObjectContext = ((C3732UK) nativeAd.getInternalNativeAd()).A16();
        adObjectContext.A0O(this);
        this.A0C.A0L(adObjectContext);
        this.A0C.A0K(adObjectContext.A0F());
        this.A0K = true;
        C3732UK c3732ukA0L = C3732UK.A0L(nativeAd.getInternalNativeAd());
        c3732ukA0L.A1a(this.A07);
        this.A04.setVisibility(8);
        this.A04.setImageDrawable(null);
        if (c3732ukA0L.A13() != null && c3732ukA0L.A13().A1g()) {
            if (!TextUtils.isEmpty(c3732ukA0L.A13().A29().A0H().A09())) {
                this.A0B = EnumC3585Rv.A05;
                c3732ukA0L.A16().A0F().AJt(EnumC3228M5.A0A);
            } else {
                this.A0B = EnumC3585Rv.A03;
                c3732ukA0L.A16().A0F().AJt(EnumC3228M5.A09);
            }
            A07();
            this.A0F.setVisibility(8);
            this.A0F.setImage(null, null);
            this.A09.setVisibility(8);
            this.A09.unsetNativeAd();
            ((C3589Rz) this.A09.getMediaViewVideoRendererApi()).A03();
            if (this.A03 != null) {
                this.A03.setVisibility(8);
                if (this.A03 instanceof C4137aw) {
                    ((C4137aw) this.A03).A04();
                } else {
                    ((C23377M) this.A03).setAdapter(null);
                }
            }
            A01(false);
            this.A0H = new C225562(this.A0C, this.A0C.A0A(), new C4530hI(this, c3732ukA0L, nativeAd), c3732ukA0L.A13(), A05(261, 31, 13), 4, c3732ukA0L.A1E());
            EnumC3931Xc.A04(this.A0H, EnumC3931Xc.A0B);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            this.A07.addView(this.A0H, layoutParams);
            this.A02 = this.A0H;
            bringChildToFront(this.A0H);
            this.A0H.setVisibility(0);
            A0E(this.A0H, c3732ukA0L);
            A01(true);
        } else if (A0T(nativeAd)) {
            this.A0B = EnumC3585Rv.A02;
            c3732ukA0L.A16().A0F().AJt(EnumC3228M5.A04);
            boolean z = c3732ukA0L.A1C() == EnumC3814Ve.A0B;
            if (!C3763Up.A2v(this.A0C) || z) {
                this.A03 = this.A0E;
                ((C19450x) this.A03).setCurrentPosition(0);
                ((C19450x) this.A03).setShowTextInCarousel(z);
                if (z) {
                    final C4494gi c4494gi = this.A0C;
                    final C19450x c19450x = (C19450x) this.A03;
                    final List<C3732UK> listA1N = c3732ukA0L.A1N();
                    final C3813Vd c3813VdA1B = c3732ukA0L.A1B();
                    abstractC4670je = new AbstractC4670je(c4494gi, c19450x, listA1N, c3813VdA1B) { // from class: com.facebook.ads.redexgen.X.7r
                        public final C4494gi A00;
                        public final C3813Vd A01;

                        {
                            super(c19450x, listA1N, c4494gi);
                            this.A00 = c4494gi;
                            this.A01 = c3813VdA1B == null ? new C3813Vd() : c3813VdA1B;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // com.instagram.common.viewpoint.core.AbstractC3518Qq
                        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
                        public final C3439PX A0F(ViewGroup viewGroup, int i2) {
                            return new C3439PX(new C4004Yn(this.A00, this.A01));
                        }

                        @Override // com.instagram.common.viewpoint.core.AbstractC3518Qq
                        /* JADX INFO: renamed from: A0Q */
                        public final void A0K(C3439PX c3439px, int i2) {
                            super.A0K(c3439px, i2);
                            C4004Yn c4004Yn = (C4004Yn) c3439px.A0p();
                            A0O(c4004Yn.getImageCardView(), i2);
                            if (((AbstractC4670je) this).A01.get(i2) != null) {
                                c4004Yn.setTitle(((AbstractC4670je) this).A01.get(i2).getAdHeadline());
                                c4004Yn.setSubtitle(((AbstractC4670je) this).A01.get(i2).getAdLinkDescription());
                                c4004Yn.setButtonText(((AbstractC4670je) this).A01.get(i2).getAdCallToAction());
                            }
                            C3732UK c3732uk = ((AbstractC4670je) this).A01.get(i2);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(c4004Yn);
                            c3732uk.A1V(c4004Yn, c4004Yn, arrayList);
                        }
                    };
                } else {
                    final C19450x c19450x2 = (C19450x) this.A03;
                    final List<C3732UK> listA1N2 = c3732ukA0L.A1N();
                    final C4494gi c4494gi2 = this.A0C;
                    abstractC4670je = new AbstractC4670je(c19450x2, listA1N2, c4494gi2) { // from class: com.facebook.ads.redexgen.X.7q
                        public final C4494gi A00;

                        {
                            this.A00 = c4494gi2;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // com.instagram.common.viewpoint.core.AbstractC3518Qq
                        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
                        public final C3439PX A0F(ViewGroup viewGroup, int i2) {
                            return new C3439PX(new C4010Yt(this.A00));
                        }

                        @Override // com.instagram.common.viewpoint.core.AbstractC3518Qq
                        /* JADX INFO: renamed from: A0Q, reason: merged with bridge method [inline-methods] */
                        public final void A0K(C3439PX c3439px, int i2) {
                            super.A0K(c3439px, i2);
                            C4010Yt c4010Yt = (C4010Yt) c3439px.A0p();
                            C4035ZI imageView = (C4035ZI) c4010Yt.getImageCardView();
                            imageView.setImageDrawable(null);
                            A0O(imageView, i2);
                            C3732UK childAd = ((AbstractC4670je) this).A01.get(i2);
                            childAd.A16().A0L(this.A00);
                            childAd.A1U(c4010Yt, c4010Yt);
                        }
                    };
                }
                abstractC4670je.A0P(new C4529hH(this, c3732ukA0L));
                ((C23377M) this.A03).setAdapter(abstractC4670je);
            } else {
                A01(false);
                int width = this.A07.getWidth();
                if (width == 0) {
                    if (this.A07.getParent() instanceof ViewGroup) {
                        parent = this.A07.getParent();
                    } else {
                        parent = null;
                    }
                    ViewGroup viewGroup = (ViewGroup) parent;
                    while (width == 0 && viewGroup != null) {
                        width = viewGroup.getWidth();
                        boolean z2 = viewGroup.getParent() instanceof ViewGroup;
                        String[] strArr = A0M;
                        if (strArr[2].charAt(31) != strArr[0].charAt(31)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0M;
                        strArr2[6] = "X2xGJjQ8zu6cU8Eo";
                        strArr2[4] = "AZj2zr3QMe0wQwV9kynIxRcnRDB4X";
                        viewGroup = (ViewGroup) (z2 ? viewGroup.getParent() : null);
                    }
                }
                AbstractC3966YB.A0J(this.A03);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(13);
                this.A03 = new C4137aw(this.A0C);
                this.A07.addView(this.A03, layoutParams2);
                ((C4137aw) this.A03).A05(c3732ukA0L, width);
                AbstractC3966YB.A0K(this.A03);
                A01(true);
            }
            this.A02 = this.A03;
            A07();
            this.A0F.setVisibility(8);
            this.A0F.setImage(null, null);
            this.A09.setVisibility(8);
            this.A09.unsetNativeAd();
            ((C3589Rz) this.A09.getMediaViewVideoRendererApi()).A03();
            bringChildToFront(this.A03);
            this.A03.setVisibility(0);
            A0E(this.A03, c3732ukA0L);
        } else {
            boolean zA0U = A0U(nativeAd);
            String[] strArr3 = A0M;
            if (strArr3[3].length() != strArr3[7].length()) {
                throw new RuntimeException();
            }
            A0M[5] = "QrlGDx1qLp0kN";
            if (zA0U) {
                this.A0B = EnumC3585Rv.A05;
                this.A01 = ((C3592S2) nativeAd.getNativeAdApi()).A01();
                c3732ukA0L.A16().A0F().AJt(EnumC3228M5.A0D);
                c3732ukA0L.A1n(this.A0J);
                this.A02 = this.A09.getMediaViewVideoRendererApi().getVideoView();
                A07();
                this.A0F.setVisibility(8);
                this.A0F.setImage(null, null);
                if (this.A03 != null) {
                    this.A03.setVisibility(8);
                    if (this.A03 instanceof C4137aw) {
                        ((C4137aw) this.A03).A04();
                    } else {
                        ((C23377M) this.A03).setAdapter(null);
                    }
                }
                bringChildToFront(this.A09);
                MediaViewVideoRenderer mediaViewVideoRenderer = this.A09;
                String[] strArr4 = A0M;
                if (strArr4[2].charAt(31) != strArr4[0].charAt(31)) {
                    String[] strArr5 = A0M;
                    strArr5[2] = "KRt7yuKunmEFowe58PEdTHnfFAzQvUNu";
                    strArr5[0] = "FpiuEPXAVB8biFGx18DJjcPDa6TrT1Ju";
                    mediaViewVideoRenderer.setNativeAd(nativeAd);
                    ((C3589Rz) this.A09.getMediaViewVideoRendererApi()).A04(nativeAd);
                    this.A09.setVisibility(0);
                    if (c3732ukA0L.getAdCoverImage() != null) {
                        new AsyncTaskC3183LM(this.A07, this.A0C).A05(this.A07.getHeight(), this.A07.getWidth()).A06(new C4528hG(this, c3732ukA0L)).A07(c3732ukA0L.getAdCoverImage().getUrl());
                    }
                } else {
                    String[] strArr6 = A0M;
                    strArr6[6] = "rknJE6EzKshvoL3E";
                    strArr6[4] = "1VlRGSe6v9ZgAEzaXTE4MJVCDSD8V";
                    mediaViewVideoRenderer.setNativeAd(nativeAd);
                    ((C3589Rz) this.A09.getMediaViewVideoRendererApi()).A04(nativeAd);
                    this.A09.setVisibility(0);
                    if (c3732ukA0L.getAdCoverImage() != null) {
                        new AsyncTaskC3183LM(this.A07, this.A0C).A05(this.A07.getHeight(), this.A07.getWidth()).A06(new C4528hG(this, c3732ukA0L)).A07(c3732ukA0L.getAdCoverImage().getUrl());
                    }
                }
                if (BuildConfigApi.isDebug()) {
                    Log.i(A0N, A05(292, 9, 49) + ((C3592S2) nativeAd.getNativeAdApi()).A03());
                }
                A0E(this.A09, c3732ukA0L);
            } else if (nativeAd.getAdCoverImage() != null) {
                this.A0B = EnumC3585Rv.A03;
                c3732ukA0L.A16().A0F().AJt(EnumC3228M5.A0B);
                this.A02 = this.A0F.getBodyImageView();
                A07();
                this.A09.setVisibility(8);
                this.A09.unsetNativeAd();
                ((C3589Rz) this.A09.getMediaViewVideoRendererApi()).A03();
                if (this.A03 != null) {
                    this.A03.setVisibility(8);
                    if (this.A03 instanceof C4137aw) {
                        ((C4137aw) this.A03).A04();
                    } else {
                        ((C23377M) this.A03).setAdapter(null);
                    }
                }
                bringChildToFront(this.A0F);
                this.A0F.setVisibility(0);
                new AsyncTaskC3183LM(this.A0F, this.A0C).A05(this.A07.getHeight(), this.A07.getWidth()).A06(new C4527hF(this, c3732ukA0L)).A07(c3732ukA0L.getAdCoverImage().getUrl());
                A0E(this.A0F, c3732ukA0L);
            }
        }
        A0Q(c3732ukA0L, false);
        A0M(c3732ukA0L);
        A0N(c3732ukA0L);
    }

    public final void A0X(NativeAdBaseApi nativeAdBaseApi, boolean z) {
        C4494gi c4494giA16 = ((C3732UK) nativeAdBaseApi).A16();
        C4494gi adObjectContext = this.A0C;
        adObjectContext.A0L(c4494giA16);
        c4494giA16.A0O(this);
        this.A0K = true;
        C3732UK c3732ukA0L = C3732UK.A0L(nativeAdBaseApi);
        c3732ukA0L.A1Z(this.A07);
        this.A0F.setVisibility(8);
        this.A0F.setImage(null, null);
        this.A09.setVisibility(8);
        this.A09.unsetNativeAd();
        ((C3589Rz) this.A09.getMediaViewVideoRendererApi()).A03();
        if (this.A03 != null) {
            this.A03.setVisibility(8);
            if (this.A03 instanceof C4137aw) {
                ((C4137aw) this.A03).A04();
            } else {
                ((C23377M) this.A03).setAdapter(null);
            }
        }
        this.A04.setVisibility(0);
        bringChildToFront(this.A04);
        this.A02 = this.A04;
        C3811Vb adIcon = c3732ukA0L.getAdIcon();
        if (adIcon != null) {
            C3648Sx c3648SxA14 = c3732ukA0L.A14();
            if (A0M[1].charAt(7) == 'A') {
                throw new RuntimeException();
            }
            String[] strArr = A0M;
            strArr[3] = "8vonm0Gh";
            strArr[7] = "EfYx5Mmt";
            Bitmap bitmapA0N = c3648SxA14.A0N(adIcon.getUrl());
            if (bitmapA0N != null) {
                this.A04.setImageBitmap(bitmapA0N);
                if (z) {
                    this.A07.post(new C4533hL(this, c3732ukA0L));
                }
            } else {
                A0R(c3732ukA0L, z, adIcon);
            }
        } else {
            InterfaceC3708Tv interfaceC3708TvA1A = c3732ukA0L.A1A();
            AdErrorType adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
            c4494giA16.A0F().A3N(c3732ukA0L.A11(), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            if (interfaceC3708TvA1A != null) {
                interfaceC3708TvA1A.ADp(C3821Vm.A00(adErrorType));
            }
            Log.e(A05(46, 17, C1137R.styleable.ConstraintSet_transitionEasing), adErrorType.getDefaultErrorMessage());
            if (nativeAdBaseApi.isAdLoaded()) {
                C4494gi adObjectContext2 = this.A0C;
                adObjectContext2.A08().ABC(A05(258, 3, 44), AbstractC3690Td.A0W, new C3691Te(A05(192, 23, 42)));
            }
        }
        A0E(this.A04, c3732ukA0L);
        if (c3732ukA0L.A1s() && !c3732ukA0L.A1p()) {
            A0Q(c3732ukA0L, true);
        }
    }

    public final /* synthetic */ void A0Y(C3732UK c3732uk, View view) {
        this.A0C.A0F().AAy(EnumC4101aM.A05.name().toLowerCase(Locale.US));
        c3732uk.A1O();
    }

    public final /* synthetic */ void A0Z(C3732UK c3732uk, View view) {
        if (this.A0D != null && c3732uk.A17() != null) {
            if (this.A0D.A04()) {
                this.A0C.A0F().ABb();
                c3732uk.A17().A04();
            } else {
                this.A0C.A0F().ABc();
                c3732uk.A17().onClick(view);
            }
        }
    }

    public final /* synthetic */ void A0a(C3732UK c3732uk, View view) {
        if (c3732uk.A17() != null) {
            if (this.A00 < c3732uk.A0z()) {
                this.A0C.A0F().ABZ();
                c3732uk.A17().onClick(view);
            } else {
                this.A0C.A0F().ABY();
                c3732uk.A17().A04();
            }
            this.A00++;
        }
    }

    public final boolean A0b() {
        if (this.A03 != null) {
            View view = this.A03;
            if (A0M[5].length() != 13) {
                throw new RuntimeException();
            }
            String[] strArr = A0M;
            strArr[3] = "f43XNCk8";
            strArr[7] = "DdRxJSTL";
            if (view.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3655T4
    public final C4494gi A6m() {
        return this.A0C;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4055Zc
    public final void ACr() {
        A09();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4055Zc
    public final void ACs() {
        A08();
    }

    @Override // com.instagram.common.viewpoint.core.C3576Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void bringChildToFront(View view) {
        if (view != this.A03 && view != this.A09 && view != this.A0F) {
            ImageView imageView = this.A04;
            if (A0M[5].length() != 13) {
                throw new RuntimeException();
            }
            A0M[1] = "R8dYcckG0onv7yQggjKFRkmHXZbq9UJh";
            if (view != imageView) {
                return;
            }
        }
        this.A0A.bringChildToFront(view);
        if (this.A0I != null) {
            this.A0A.bringChildToFront(this.A0I);
        }
        if (this.A06 != null) {
            this.A0A.bringChildToFront(this.A06);
        }
        if (this.A0G != null) {
            this.A0A.bringChildToFront(this.A0G);
        }
        if (this.A05 != null) {
            this.A0A.bringChildToFront(this.A05);
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void destroy() {
        this.A09.pause(false);
        this.A09.getMediaViewVideoRendererApi().destroy();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final View getAdContentsView() {
        return this.A02;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaHeight() {
        if (this.A0F.getVisibility() == 0) {
            return this.A0F.getImageHeight();
        }
        if (this.A09.getVisibility() == 0) {
            return this.A09.getMediaViewVideoRendererApi().getVideoView().getHeight();
        }
        if (this.A07.getVisibility() == 0) {
            return this.A07.getHeight();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (r3.getVisibility() == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        return r4.A09.getMediaViewVideoRendererApi().getVideoView().getWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if (r3.getVisibility() == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        if (r4.A07.getVisibility() != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        return r4.A07.getWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        return 0;
     */
    @Override // com.facebook.ads.internal.api.MediaViewApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getMediaWidth() {
        /*
            r4 = this;
            com.facebook.ads.redexgen.X.b5 r0 = r4.A0F
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L35
            com.facebook.ads.redexgen.X.b5 r0 = r4.A0F
            int r3 = r0.getImageWidth()
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C4524hC.A0M
            r0 = 2
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 31
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L28
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L28:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C4524hC.A0M
            java.lang.String r1 = "us0p5hBNoGIfish2"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "DFvDCw92fILzmemlu9XfPwpsPQRiq"
            r0 = 4
            r2[r0] = r1
            return r3
        L35:
            com.facebook.ads.MediaViewVideoRenderer r3 = r4.A09
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C4524hC.A0M
            r0 = 1
            r1 = r1[r0]
            r0 = 7
            char r1 = r1.charAt(r0)
            r0 = 65
            if (r1 == r0) goto L66
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C4524hC.A0M
            java.lang.String r1 = "7zc9sXuG"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "ncWuDUJK"
            r0 = 7
            r2[r0] = r1
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L6d
        L57:
            com.facebook.ads.MediaViewVideoRenderer r0 = r4.A09
            com.facebook.ads.internal.api.MediaViewVideoRendererApi r0 = r0.getMediaViewVideoRendererApi()
            android.view.View r0 = r0.getVideoView()
            int r0 = r0.getWidth()
            return r0
        L66:
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L6d
            goto L57
        L6d:
            com.facebook.ads.MediaView r0 = r4.A07
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L7c
            com.facebook.ads.MediaView r0 = r4.A07
            int r0 = r0.getWidth()
            return r0
        L7c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C4524hC.getMediaWidth():int");
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getVideoDuration() {
        this.A0C.A0F().ABm();
        return this.A01;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaView mediaView) {
        Context context = adViewConstructorParams.getContext();
        if (context instanceof C4494gi) {
            this.A0C = (C4494gi) context;
        } else {
            this.A0C = C3579Rp.A03(context);
        }
        this.A0C.A0O(this);
        switch (adViewConstructorParams.getInitializationType()) {
            case 0:
                A0J(this.A0C, mediaView);
                break;
            case 1:
                A0I(this.A0C, adViewConstructorParams.getAttributeSet(), mediaView);
                break;
            case 2:
                C4494gi c4494gi = this.A0C;
                AttributeSet attributeSet = adViewConstructorParams.getAttributeSet();
                if (A0M[1].charAt(7) == 'A') {
                    throw new RuntimeException();
                }
                A0M[1] = "4tObUcmoIw93Quo4uXvWt9YCbUPkknut";
                A0H(c4494gi, attributeSet, adViewConstructorParams.getDefStyleAttr(), mediaView);
                break;
                break;
            case 3:
                A0G(this.A0C, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), adViewConstructorParams.getDefStyleRes(), mediaView);
                break;
            default:
                throw new IllegalArgumentException(A05(155, 37, 26));
        }
        A01(true);
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final boolean isVideoContent() {
        this.A0C.A0F().ABl();
        return this.A0B == EnumC3585Rv.A05;
    }

    @Override // com.instagram.common.viewpoint.core.C3576Rm, com.facebook.ads.internal.api.AdComponentViewApi
    public final void onAttachedToView(AdComponentView adComponentView, AdComponentViewParentApi adComponentViewParentApi) {
        super.onAttachedToView(adComponentView, adComponentViewParentApi);
        this.A0A = adComponentViewParentApi;
    }

    @Override // com.instagram.common.viewpoint.core.C3576Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A09();
    }

    @Override // com.instagram.common.viewpoint.core.C3576Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A08();
    }

    @Override // com.instagram.common.viewpoint.core.C3576Rm, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            A09();
        } else {
            A08();
        }
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        int width = this.A07.getWidth();
        int currentHeight = this.A07.getHeight();
        if (width > 0 && currentHeight > 0) {
            this.A07.repair(th);
            this.A07.getLayoutParams().width = width;
            this.A07.getLayoutParams().height = currentHeight;
            this.A07.setBackgroundColor(-3355444);
            return;
        }
        this.A07.repair(th);
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setListener(MediaViewListener mediaViewListener) {
        this.A08 = mediaViewListener;
        if (mediaViewListener == null) {
            ((C3589Rz) this.A09.getMediaViewVideoRendererApi()).A07(null);
        } else {
            ((C3589Rz) this.A09.getMediaViewVideoRendererApi()).A07(new C4526hE(this, mediaViewListener));
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        if (!this.A0K) {
            if (this.A09 != null) {
                this.A07.removeView(this.A09);
                this.A09.getMediaViewVideoRendererApi().destroy();
            }
            ((C3589Rz) mediaViewVideoRenderer.getMediaViewVideoRendererApi()).A05(this.A0C.A0A());
            mediaViewVideoRenderer.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            ((C4524hC) this.A07.getMediaViewApi()).A0D(mediaViewVideoRenderer, layoutParams);
            this.A09 = mediaViewVideoRenderer;
            this.A0J = !(this.A09 instanceof DefaultMediaViewVideoRenderer);
            mediaViewVideoRenderer.setId(AbstractC3966YB.A00());
            return;
        }
        throw new IllegalStateException(A05(215, 43, 70));
    }
}
