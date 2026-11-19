package com.instagram.common.viewpoint.core;

import android.content.Context;
import androidx.constraintlayout.widget.C1137R;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterfaceC1889Ad;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.SH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3607SH implements RewardedVideoAdApi, Repairable {
    public static byte[] A04;
    public static String[] A05 = {"k8yEFjaDDmJNEMKVrce3vEWkKDhb9GrD", "5HJZEEaowyWiZ6x5JcW91LnqKILZK9iv", "JCdbC5zohUOjfclxz", "cbOkRGwJ0he66t85Zev39Ck1DLyP", "QnWh1EoQaEskbAIVlUx7Y0ywxM6b", "GMmjAnpO", "8CCIVLGxcMAoQXrfALv1hDyohO9DfryR", "UYxyoZ6BjjTfNK3ar4eEie7WMpDsFwCV"};
    public final InterfaceC1889Ad A00;
    public final C4589iI A01;
    public final C23487X A02;
    public final C4494gi A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 9);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{120, 124, 121, 121, 44, 40, 113, 45, 27, 74, 26, 22, 74, 76, 29, 75, 102, 48, 50, 97, 53, 97, 48, 55, 32, 117, 34, 113, 37, 46, 46, 34, 52, 19, 9, 24, 15, 19, 28, 17, 93, 24, 15, 15, 18, 15, 83, 119, 105, 94, 76, 90, 73, 95, 94, 95, 27, 77, 82, 95, 94, 84, 27, 90, 95, 27, 95, 94, 72, 79, 73, 84, 66, 94, 95, 59, 12, 30, 8, 27, 13, 12, 13, 73, 31, 0, 13, 12, 6, 73, 8, 13, 73, 5, 6, 8, 13, 73, 27, 12, 24, 28, 12, 26, 29, 12, 13, 33, 22, 4, 18, 1, 23, 22, 23, 83, 5, 26, 23, 22, 28, 83, 18, 23, 83, 0, 27, 28, 4, 83, 16, 18, 31, 31, 22, 23, 66, 67, 85, 82, 84, 73, 95, 73, 74, 68, 65, 100, 65, 22, 13, 10, 18};
    }

    static {
        A01();
    }

    public C3607SH(Context context, String str, InterfaceC1889Ad interfaceC1889Ad) {
        String string;
        this.A00 = interfaceC1889Ad;
        if (context instanceof C4494gi) {
            this.A03 = (C4494gi) context;
            string = this.A03.A0F().getId();
        } else {
            string = UUID.randomUUID().toString();
            this.A03 = C3579Rp.A07(context, string);
        }
        InterfaceC3216Lt interfaceC3216LtA0F = this.A03.A0F();
        String adId = AdPlacementType.REWARDED_VIDEO.toString();
        interfaceC3216LtA0F.A3T(adId, str);
        this.A01 = new C4589iI(this.A03, str, this.A00, new C4615ij());
        this.A03.A0O(this);
        this.A02 = new C23487X(this.A01, string);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final C3608SI buildLoadAdConfig() {
        return new C3608SI(this);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final C3609SJ buildShowAdConfig() {
        return new C3609SJ();
    }

    public final void A04() {
        if (C3763Up.A2M(this.A03)) {
            return;
        }
        this.A02.A08();
        this.A03.A0F().A3U();
    }

    public final void A05(RewardData rewardData) {
        this.A02.A0G(rewardData);
    }

    public final void A06(RewardedVideoAdListener rewardedVideoAdListener) {
        this.A01.A04 = rewardedVideoAdListener;
        this.A03.A0F().A3M(rewardedVideoAdListener != null);
        String[] strArr = A05;
        if (strArr[1].charAt(24) != strArr[0].charAt(24)) {
            throw new RuntimeException();
        }
        A05[6] = "1SRpemADNZd8xb9i9fuLSYNF0AwY2Tu2";
    }

    public final void A07(String str, AdExperienceType adExperienceType, boolean z) {
        if (str == null) {
            this.A03.A0F().A3Q();
        } else {
            C4494gi c4494gi = this.A03;
            if (A05[6].charAt(25) == 'H') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[3] = "67CWYk6q7caxeYWX3cgidRuGJDEH";
            strArr[4] = "JzT9b8y5FiDfchRrDecE58hhFV9F";
            c4494gi.A0F().A3P();
        }
        this.A02.A0F(this.A00, str, adExperienceType, z);
        this.A03.A0F().A3O();
    }

    public final boolean A08(RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        this.A03.A0F().A3Z();
        boolean zA0J = this.A02.A0J(this.A00, rewardedVideoShowAdConfig);
        this.A03.A0F().A3Y(zA0J);
        return zA0J;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.InterfaceC1889Ad
    public final void destroy() {
        AbstractC3832Vy.A05(A00(136, 7, 47), A00(48, 27, 50), A00(0, 8, 64));
        A04();
    }

    public final void finalize() {
        this.A02.A07();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.InterfaceC1889Ad
    public final String getPlacementId() {
        return this.A01.A0D;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final int getVideoDuration() {
        return this.A01.A00;
    }

    @Override // com.facebook.ads.InterfaceC1889Ad
    public final boolean isAdInvalidated() {
        boolean zA0H = this.A02.A0H();
        this.A03.A0F().A5f(zA0H);
        return zA0H;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean isAdLoaded() {
        return this.A02.A0I();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.InterfaceC1889Ad
    public final void loadAd() {
        AbstractC3832Vy.A05(A00(143, 6, 44), A00(75, 32, 96), A00(24, 8, 30));
        A07(null, null, true);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final void loadAd(RewardedVideoAd.RewardedVideoLoadAdConfig rewardedVideoLoadAdConfig) {
        ((C3608SI) rewardedVideoLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        if (this.A01.A04 != null) {
            this.A01.A04.onError(this.A00, new AdError(AdError.INTERNAL_ERROR_CODE, A00(32, 16, C1137R.styleable.ConstraintSet_pathMotionArc) + AbstractC3948Xt.A03(this.A01.A0B, th)));
        }
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.InterfaceC1889Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A01.A06 = extraHints.getHints();
        this.A01.A07 = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        AbstractC3832Vy.A05(A00(149, 4, 108), A00(107, 29, C1137R.styleable.ConstraintSet_transitionPathRotate), A00(8, 8, 38));
        return A08(new C3609SJ().withAppOrientation(-1).build());
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean show(RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        AbstractC3832Vy.A05(A00(149, 4, 108), A00(107, 29, C1137R.styleable.ConstraintSet_transitionPathRotate), A00(16, 8, 88));
        return A08(rewardedVideoShowAdConfig);
    }
}
