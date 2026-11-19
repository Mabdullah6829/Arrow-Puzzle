package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.VideoAutoplayBehavior;
import com.facebook.ads.VideoStartReason;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rz */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3589Rz implements MediaViewVideoRendererApi {
    public static byte[] A0G;
    public static String[] A0H = {"4Iqv8cTE9pbJV", "CYHnjvYzZ1Zp8VPlfffkEyqwlctrpQBL", "X8G7CA2UCcBTYjTzfkqICRpH9C9x48uG", "IuynGJFHahmt0", "YKtJTe5IUh", "gPGIa6LKGgSGxdMiTt4aCF2OLs57juUg", "T83", "DMaEshMk8cfihQw150z6d7U8VPkriS4i"};
    public static final String A0I;
    public MediaViewVideoRenderer A00;
    public VideoAutoplayBehavior A01;
    public C4494gi A03;
    public InterfaceC3807VX A04;
    public C23066r A05;
    public boolean A06;
    public boolean A07;
    public NativeAd A08;
    public final AbstractC2729E0 A0D = new AbstractC2729E0() { // from class: com.facebook.ads.redexgen.X.7K
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C2730E1 c2730e1) {
            this.A00.A00.onPrepared();
        }
    };
    public final AbstractC2731E2 A0C = new AbstractC2731E2() { // from class: com.facebook.ads.redexgen.X.7J
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C2732E3 c2732e3) {
            if (this.A00.A08 != null) {
                C3732UK.A0L(this.A00.A08.getInternalNativeAd()).A1o(true, true);
            }
            this.A00.A00.onPlayed();
        }
    };
    public final AbstractC2733E4 A0B = new AbstractC2733E4() { // from class: com.facebook.ads.redexgen.X.7I
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C21404B c21404b) {
            this.A00.A00.onPaused();
        }
    };
    public final AbstractC2726Dx A0E = new AbstractC2726Dx() { // from class: com.facebook.ads.redexgen.X.7H
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C2727Dy c2727Dy) {
            this.A00.A00.onSeek();
        }
    };
    public final AbstractC2739EA A09 = new AbstractC2739EA() { // from class: com.facebook.ads.redexgen.X.7G
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C21494K c21494k) {
            this.A00.A00.onCompleted();
            if (!C3763Up.A1j(this.A00.A00.getContext())) {
                return;
            }
            this.A00.A00.play(VideoStartReason.AUTO_STARTED);
        }
    };
    public final AbstractC2720Dr A0F = new AbstractC2720Dr() { // from class: com.facebook.ads.redexgen.X.7F
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C2721Ds c2721Ds) {
            this.A00.A00.onVolumeChanged();
        }
    };
    public final AbstractC2737E8 A0A = new AbstractC2737E8() { // from class: com.facebook.ads.redexgen.X.7D
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C2738E9 c2738e9) {
            if (this.A00.A08 != null) {
                C3732UK.A0L(this.A00.A08.getInternalNativeAd()).A1o(false, true);
            }
            this.A00.A00.onError();
        }
    };
    public C3576Rm A02 = new C3576Rm();

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 3);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0G = new byte[]{31, 56, 32, 55, 58, 63, 50, 118, 0, 63, 51, 33, 118, 53, 57, 56, 37, 34, 36, 35, 53, 34, 57, 36, 118, 38, 55, 36, 55, 59, 37, 118, 34, 47, 38, 51, 120, 126, 72, 72, 70, 68, 67, 74, 13, 64, 88, 94, 89, 13, 79, 72, 13, 93, 95, 72, 78, 72, 73, 72, 73, 13, 79, 84, 13, 76, 13, 78, 76, 65, 65, 13, 89, 66, 13, 72, 67, 74, 76, 74, 72, 126, 72, 72, 70, 1, 13, 76, 67, 73, 13, 75, 66, 65, 65, 66, 90, 72, 73, 13, 79, 84, 13, 76, 13, 78, 76, 65, 65, 13, 89, 66, 13, 73, 68, 94, 72, 67, 74, 76, 74, 72, 126, 72, 72, 70, 3, 38, 43, 49, 39, 44, 37, 35, 37, 39, 17, 39, 39, 41, 98, 33, 35, 46, 46, 39, 38, 98, 53, 43, 54, 42, 45, 55, 54, 98, 39, 44, 37, 35, 37, 39, 17, 39, 39, 41, 108, 108, 103, 110, 104, 110, 108, 90, 108, 108, 98, 41, 106, 104, 101, 101, 108, 109, 41, 126, 96, 125, 97, 102, 124, 125, 41, 109, 96, 122, 108, 103, 110, 104, 110, 108, 90, 108, 108, 98, 39};
    }

    static {
        A02();
        A0I = MediaViewVideoRenderer.class.getSimpleName();
    }

    public final void A03() {
        this.A00.pause(false);
        this.A05.setClientToken(null);
        this.A05.setVideoMPD(null);
        this.A05.setVideoURI((Uri) null);
        this.A05.setVideoCTA(null);
        this.A05.setNativeAd(null);
        this.A01 = VideoAutoplayBehavior.DEFAULT;
        if (this.A08 != null) {
            C3732UK.A0L(this.A08.getInternalNativeAd()).A1o(false, false);
        }
        this.A08 = null;
        if (this.A04 != null) {
            InterfaceC3807VX interfaceC3807VX = this.A04;
            if (A0H[6].length() != 3) {
                throw new RuntimeException();
            }
            A0H[6] = "qaG";
            interfaceC3807VX.AKY();
        }
    }

    public final void A04(NativeAd nativeAd) {
        this.A08 = nativeAd;
        C4494gi c4494giA16 = ((C3732UK) nativeAd.getInternalNativeAd()).A16();
        C4494gi adObjectContext = this.A03;
        adObjectContext.A0L(c4494giA16);
        C3592S2 c3592s2 = (C3592S2) nativeAd.getNativeAdApi();
        this.A05.setClientToken(C3732UK.A0L(nativeAd.getInternalNativeAd()).A1H());
        this.A05.setVideoMPD(c3592s2.A02());
        this.A05.setVideoURI(c3592s2.A03());
        C4686ju c4686juA12 = C3732UK.A0L(nativeAd.getInternalNativeAd()).A12();
        if (c4686juA12 != null) {
            this.A05.setVideoProgressReportIntervalMs(c4686juA12.A0B());
        }
        this.A05.setVideoCTA(nativeAd.getAdCallToAction());
        this.A05.setNativeAd(nativeAd);
        this.A01 = c3592s2.getVideoAutoplayBehavior();
        if (this.A04 != null) {
            this.A04.AJZ(nativeAd);
        }
    }

    public final void A05(InterfaceC3784VA interfaceC3784VA) {
        this.A05.setAdEventManager(interfaceC3784VA);
    }

    public final void A06(InterfaceC3807VX interfaceC3807VX) {
        this.A04 = interfaceC3807VX;
    }

    public final void A07(InterfaceC4012Yv interfaceC4012Yv) {
        this.A05.setListener(interfaceC4012Yv);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void destroy() {
        this.A05.A0W();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void disengageSeek(VideoStartReason videoStartReason) {
        if (!this.A06) {
            if (AdInternalSettings.isDebugBuild()) {
                String str = A0I;
                String strA01 = A01(127, 40, 65);
                if (A0H[6].length() != 3) {
                    throw new RuntimeException();
                }
                String[] strArr = A0H;
                strArr[0] = "GDpgiWeynUT3r";
                strArr[4] = "Fcrjr5dO1W";
                Log.w(str, strA01);
                return;
            }
            return;
        }
        this.A06 = false;
        if (this.A07) {
            this.A05.A0e(AbstractC3961Y6.A00(videoStartReason), 3);
        }
        this.A00.onSeekDisengaged();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void engageSeek() {
        if (this.A06) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.w(A0I, A01(167, 40, 10));
            }
        } else {
            this.A06 = true;
            this.A07 = EnumC4436fm.A0A.equals(this.A05.getState());
            this.A05.A0i(false, 1);
            this.A00.onSeekEngaged();
        }
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this.A02;
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final int getCurrentTimeMs() {
        return this.A05.getCurrentPositionInMillis();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final int getDuration() {
        return this.A05.getDuration();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final View getVideoView() {
        return this.A05.getVideoView();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final float getVolume() {
        return this.A05.getVolume();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaViewVideoRenderer mediaViewVideoRenderer) {
        C4494gi c4494giA03;
        this.A00 = mediaViewVideoRenderer;
        Context context = adViewConstructorParams.getContext();
        if (context instanceof C4494gi) {
            c4494giA03 = (C4494gi) context;
        } else {
            c4494giA03 = C3579Rp.A03(context);
        }
        this.A03 = c4494giA03;
        switch (adViewConstructorParams.getInitializationType()) {
            case 0:
                this.A05 = new C23066r(c4494giA03);
                break;
            case 1:
                this.A05 = new C23066r(c4494giA03, adViewConstructorParams.getAttributeSet());
                break;
            case 2:
                this.A05 = new C23066r(c4494giA03, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr());
                break;
            case 3:
                this.A05 = new C23066r(c4494giA03, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleRes());
                break;
            default:
                throw new IllegalArgumentException(A01(0, 37, 85));
        }
        this.A05.setEnableBackgroundVideo(mediaViewVideoRenderer.shouldAllowBackgroundPlayback());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.A05.setLayoutParams(layoutParams);
        this.A02.addView(this.A05, -1, layoutParams);
        EnumC3931Xc.A04(this.A05, EnumC3931Xc.A0B);
        this.A05.getEventBus().A03(this.A0D, this.A0C, this.A0B, this.A0E, this.A09, this.A0F, this.A0A);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void pause(boolean z) {
        this.A05.A0i(z, 2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void play(VideoStartReason videoStartReason) {
        this.A05.A0e(AbstractC3961Y6.A00(videoStartReason), 2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void seekTo(int i2) {
        if (!this.A06) {
            boolean zIsDebugBuild = AdInternalSettings.isDebugBuild();
            String[] strArr = A0H;
            if (strArr[0].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A0H[1] = "0wh1LQIbECU2tB2xLmMlqLa216eizCy3";
            if (zIsDebugBuild) {
                Log.w(A0I, A01(37, 90, 46));
                return;
            }
            return;
        }
        this.A05.A0a(i2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void setVolume(float f2) {
        this.A05.setVolume(f2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final boolean shouldAutoplay() {
        if (this.A05 == null || this.A05.getState() == EnumC4436fm.A06) {
            return false;
        }
        return this.A01 == VideoAutoplayBehavior.ON || this.A01 == VideoAutoplayBehavior.DEFAULT;
    }
}
