package com.facebook.ads.internal.dynamicloading;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.RewardedInterstitialAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import com.facebook.ads.internal.api.AdSettingsApi;
import com.facebook.ads.internal.api.AdSizeApi;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.api.AudienceNetworkAdsApi;
import com.facebook.ads.internal.api.AudienceNetworkExportedActivityApi;
import com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi;
import com.facebook.ads.internal.api.BidderTokenProviderApi;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.InitApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.api.NativeAdLayoutApi;
import com.facebook.ads.internal.api.NativeAdScrollViewApi;
import com.facebook.ads.internal.api.NativeAdViewApi;
import com.facebook.ads.internal.api.NativeAdViewAttributesApi;
import com.facebook.ads.internal.api.NativeAdViewTypeApi;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import com.facebook.ads.internal.api.NativeBannerAdApi;
import com.facebook.ads.internal.api.NativeBannerAdViewApi;
import com.facebook.ads.internal.api.NativeComponentTagApi;
import com.facebook.ads.internal.api.RewardedInterstitialAdApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.instagram.common.viewpoint.core.AbstractC3564Ra;
import com.instagram.common.viewpoint.core.AbstractC3909XG;
import com.instagram.common.viewpoint.core.C3566Rc;
import com.instagram.common.viewpoint.core.C3567Rd;
import com.instagram.common.viewpoint.core.C3568Re;
import com.instagram.common.viewpoint.core.C3569Rf;
import com.instagram.common.viewpoint.core.C3571Rh;
import com.instagram.common.viewpoint.core.C3577Rn;
import com.instagram.common.viewpoint.core.C3579Rp;
import com.instagram.common.viewpoint.core.C3581Rr;
import com.instagram.common.viewpoint.core.C3582Rs;
import com.instagram.common.viewpoint.core.C3589Rz;
import com.instagram.common.viewpoint.core.C3592S2;
import com.instagram.common.viewpoint.core.C3593S3;
import com.instagram.common.viewpoint.core.C3594S4;
import com.instagram.common.viewpoint.core.C3595S5;
import com.instagram.common.viewpoint.core.C3596S6;
import com.instagram.common.viewpoint.core.C3600SA;
import com.instagram.common.viewpoint.core.C3601SB;
import com.instagram.common.viewpoint.core.C3602SC;
import com.instagram.common.viewpoint.core.C3603SD;
import com.instagram.common.viewpoint.core.C3607SH;
import com.instagram.common.viewpoint.core.C3712Tz;
import com.instagram.common.viewpoint.core.C3714U2;
import com.instagram.common.viewpoint.core.C3732UK;
import com.instagram.common.viewpoint.core.C3777V3;
import com.instagram.common.viewpoint.core.C3778V4;
import com.instagram.common.viewpoint.core.C3811Vb;
import com.instagram.common.viewpoint.core.C3812Vc;
import com.instagram.common.viewpoint.core.C3813Vd;
import com.instagram.common.viewpoint.core.C3822Vn;
import com.instagram.common.viewpoint.core.C3833Vz;
import com.instagram.common.viewpoint.core.C4523hB;
import com.instagram.common.viewpoint.core.C4524hC;
import com.instagram.common.viewpoint.core.C4541hT;
import com.instagram.common.viewpoint.core.InterfaceC3810Va;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class DynamicLoaderImpl implements DynamicLoader, RemoteRenderingApi {
    public static AdSettingsApi A00;
    public static AudienceNetworkAdsApi A01;
    public static NativeAdViewApi A02;
    public static NativeBannerAdViewApi A03;
    public static C3577Rn A04;
    public static String[] A05 = {"FC7PnIQgfKJQfBdQKCurjH6JKIFxjroV", "Ez", "t7pjhhQGIazlhmf4UkwJSh", "Iyhtqk6gC8uyo8Dul94yaDEfv0PrNxAT", "5egoyUR4tSKxNoVVXreZdHvR7BDPW4Oi", "IYlCvOKkAZQkBJEI1e2UxVPIL3gdF2Y", "0QNvsKlwTsAv0tvLZz9yZ17i9BLNPSLj", "RauEdYPLg0wTIRL3lDclFm017FzJm5su"};
    public static final InitApi A06 = new C3581Rr();

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdOptionsViewApi createAdOptionsView(Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout, AdOptionsView.Orientation orientation, int i2, AdOptionsView adOptionsView) {
        return new C4541hT(context, nativeAdBase, nativeAdLayout, orientation, i2, adOptionsView);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdOptionsViewApi createAdOptionsView(Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout, AdOptionsView adOptionsView) {
        return new C4541hT(context, nativeAdBase, nativeAdLayout, adOptionsView);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdSettingsApi createAdSettingsApi() {
        if (A00 == null) {
            A00 = new C3566Rc();
        }
        return A00;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdSizeApi createAdSizeApi(int i2) {
        return new C3712Tz(this, AbstractC3909XG.A02(i2));
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdViewApi createAdViewApi(Context context, String str, AdSize adSize, AdViewParentApi adViewParentApi, AdView adView) {
        return (AdViewApi) AbstractC3564Ra.A00(new C3567Rd(context, str, adSize, adViewParentApi, adView), AdViewApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdViewApi createAdViewApi(Context context, String str, String str2, AdViewParentApi adViewParentApi, AdView adView) throws Exception {
        try {
            return (AdViewApi) AbstractC3564Ra.A00(new C3567Rd(context, str, str2, adViewParentApi, adView), AdViewApi.class);
        } catch (C3822Vn e) {
            throw new Exception(e.A01());
        }
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AudienceNetworkActivityApi createAudienceNetworkActivity(AudienceNetworkActivity audienceNetworkActivity, AudienceNetworkActivityApi audienceNetworkActivityApi) {
        return new C3569Rf(audienceNetworkActivity, audienceNetworkActivityApi, new C3568Re(audienceNetworkActivity, audienceNetworkActivityApi));
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AudienceNetworkAdsApi createAudienceNetworkAdsApi() {
        if (A01 == null) {
            A01 = new C3571Rh();
        }
        AudienceNetworkAdsApi audienceNetworkAdsApi = A01;
        if (A05[2].length() != 22) {
            throw new RuntimeException();
        }
        A05[3] = "WLYy1k58X1wQ2fFP1Kpc3q8pOUGU5mJB";
        return audienceNetworkAdsApi;
    }

    @Override // com.facebook.ads.internal.dynamicloading.RemoteRenderingApi
    public AudienceNetworkExportedActivityApi createAudienceNetworkExportedActivityApi(Activity activity) {
        return new C3777V3(activity);
    }

    @Override // com.facebook.ads.internal.dynamicloading.RemoteRenderingApi
    public AudienceNetworkRemoteServiceApi createAudienceNetworkRemoteService(Service service) {
        return new C3778V4(service);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public BidderTokenProviderApi createBidderTokenProviderApi() {
        return getBidderTokenProviderApi();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public DefaultMediaViewVideoRendererApi createDefaultMediaViewVideoRendererApi() {
        return new C3833Vz();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public InterstitialAdApi createInterstitialAd(Context context, String str, InterstitialAd interstitialAd) {
        return (InterstitialAdApi) AbstractC3564Ra.A00(new C3582Rs(context, str, interstitialAd), InterstitialAdApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public MediaViewApi createMediaViewApi() {
        return new C4524hC();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public MediaViewVideoRendererApi createMediaViewVideoRendererApi() {
        return new C3589Rz();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public C3592S2 createNativeAdApi(NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        return new C3592S2(nativeAd, nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public C3592S2 createNativeAdApi(NativeAdBase nativeAdBase, NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        return new C3592S2(nativeAdBase, nativeAd, nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdBaseApi createNativeAdBaseApi(Context context, String str) {
        return new C3732UK(context, str, (InterfaceC3810Va) C3732UK.A0K(), false);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdBaseApi createNativeAdBaseApi(NativeAdBaseApi nativeAdBaseApi) {
        return new C3732UK((C3732UK) nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdBase createNativeAdBaseFromBidPayload(Context context, String str, String str2) throws Exception {
        try {
            return C3732UK.A0A(context, str, str2);
        } catch (C3822Vn e) {
            throw new Exception(e.A01());
        }
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdImageApi createNativeAdImageApi(JSONObject jSONObject) {
        return C3811Vb.A00(jSONObject);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdLayoutApi createNativeAdLayoutApi() {
        return new C4523hB();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public C3812Vc createNativeAdRatingApi(JSONObject jSONObject) {
        return C3812Vc.A00(jSONObject);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdScrollViewApi createNativeAdScrollViewApi(NativeAdScrollView nativeAdScrollView, Context context, NativeAdsManager nativeAdsManager, NativeAdScrollView.AdViewProvider adViewProvider, int i2, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i3) {
        return new C3593S3(nativeAdScrollView, context, nativeAdsManager, adViewProvider, i2, type, nativeAdViewAttributes, i3);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdViewApi createNativeAdViewApi() {
        if (A02 == null) {
            A02 = new C3594S4();
        }
        return A02;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdViewAttributesApi createNativeAdViewAttributesApi() {
        return new C3813Vd();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdViewTypeApi createNativeAdViewTypeApi(int i2) {
        return new C3595S5(i2);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdsManagerApi createNativeAdsManagerApi(Context context, String str, int i2) {
        return (NativeAdsManagerApi) AbstractC3564Ra.A00(new C3596S6(context, str, i2), NativeAdsManagerApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeBannerAdApi createNativeBannerAdApi(NativeBannerAd nativeBannerAd, NativeAdBaseApi nativeAdBaseApi) {
        return new C3600SA(nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeBannerAdViewApi createNativeBannerAdViewApi() {
        if (A03 == null) {
            A03 = new C3601SB();
        }
        return A03;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeComponentTagApi createNativeComponentTagApi() {
        return new C3602SC();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public RewardedInterstitialAdApi createRewardedInterstitialAd(Context context, String str, RewardedInterstitialAd rewardedInterstitialAd) {
        return (RewardedInterstitialAdApi) AbstractC3564Ra.A00(new C3603SD(context, str, rewardedInterstitialAd), RewardedInterstitialAdApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public RewardedVideoAdApi createRewardedVideoAd(Context context, String str, RewardedVideoAd rewardedVideoAd) {
        return (RewardedVideoAdApi) AbstractC3564Ra.A00(new C3607SH(context, str, rewardedVideoAd), RewardedVideoAdApi.class);
    }

    public static C3577Rn getBidderTokenProviderApi() {
        if (A04 == null) {
            A04 = new C3577Rn();
        }
        return A04;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public InitApi getInitApi() {
        return A06;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public void maybeInitInternally(Context context) {
        C3714U2.A0A(C3579Rp.A09(context));
    }
}
