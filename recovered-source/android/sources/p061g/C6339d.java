package p061g;

import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.arrow.puzzle.escape.maze.free.game.R;
import com.arrow.puzzle.escape.maze.free.game.activity.StartActivity;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzfb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbys;

/* JADX INFO: renamed from: g.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6339d implements NativeAd.OnNativeAdLoadedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ StartActivity f24379a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FrameLayout f24380b;

    public C6339d(FrameLayout frameLayout, StartActivity startActivity) {
        this.f24379a = startActivity;
        this.f24380b = frameLayout;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    /* JADX INFO: renamed from: a */
    public final void mo3309a(zzbys zzbysVar) {
        boolean z;
        if (this.f24379a.isDestroyed() || this.f24379a.isFinishing() || this.f24379a.isChangingConfigurations()) {
            zzbysVar.m5266e();
            return;
        }
        zzbys zzbysVar2 = AbstractC6341f.f24390h;
        if (zzbysVar2 != null) {
            zzbysVar2.m5266e();
        }
        AbstractC6341f.f24390h = zzbysVar;
        NativeAdView nativeAdView = (NativeAdView) this.f24379a.getLayoutInflater().inflate(R.layout.ad_unified, (ViewGroup) null);
        nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(R.id.ad_media));
        nativeAdView.setHeadlineView(nativeAdView.findViewById(R.id.ad_headline));
        nativeAdView.setBodyView(nativeAdView.findViewById(R.id.ad_body));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(R.id.ad_call_to_action));
        nativeAdView.setIconView(nativeAdView.findViewById(R.id.ad_app_icon));
        nativeAdView.setPriceView(nativeAdView.findViewById(R.id.ad_price));
        nativeAdView.setStarRatingView(nativeAdView.findViewById(R.id.ad_stars));
        nativeAdView.setStoreView(nativeAdView.findViewById(R.id.ad_store));
        nativeAdView.setAdvertiserView(nativeAdView.findViewById(R.id.ad_advertiser));
        ((TextView) nativeAdView.getHeadlineView()).setText(zzbysVar.mo3306b());
        nativeAdView.getMediaView().setMediaContent(zzbysVar.m5269h());
        if (zzbysVar.mo3305a() == null) {
            nativeAdView.getBodyView().setVisibility(4);
        } else {
            nativeAdView.getBodyView().setVisibility(0);
            ((TextView) nativeAdView.getBodyView()).setText(zzbysVar.mo3305a());
        }
        if (zzbysVar.m5268g() == null) {
            nativeAdView.getCallToActionView().setVisibility(4);
        } else {
            nativeAdView.getCallToActionView().setVisibility(0);
            ((TextView) nativeAdView.getCallToActionView()).setText(zzbysVar.m5268g());
        }
        if (zzbysVar.f9559c == null) {
            nativeAdView.getIconView().setVisibility(8);
        } else {
            ((ImageView) nativeAdView.getIconView()).setImageDrawable(zzbysVar.f9559c.f9556b);
            nativeAdView.getIconView().setVisibility(0);
        }
        if (zzbysVar.m5270i() == null) {
            nativeAdView.getPriceView().setVisibility(4);
        } else {
            nativeAdView.getPriceView().setVisibility(0);
            ((TextView) nativeAdView.getPriceView()).setText(zzbysVar.m5270i());
        }
        if (zzbysVar.m5272k() == null) {
            nativeAdView.getStoreView().setVisibility(4);
        } else {
            nativeAdView.getStoreView().setVisibility(0);
            ((TextView) nativeAdView.getStoreView()).setText(zzbysVar.m5272k());
        }
        if (zzbysVar.m5271j() == null) {
            nativeAdView.getStarRatingView().setVisibility(4);
        } else {
            ((RatingBar) nativeAdView.getStarRatingView()).setRating(zzbysVar.m5271j().floatValue());
            nativeAdView.getStarRatingView().setVisibility(0);
        }
        if (zzbysVar.m5267f() == null) {
            nativeAdView.getAdvertiserView().setVisibility(4);
        } else {
            ((TextView) nativeAdView.getAdvertiserView()).setText(zzbysVar.m5267f());
            nativeAdView.getAdvertiserView().setVisibility(0);
        }
        nativeAdView.setNativeAd(zzbysVar);
        zzfb zzfbVarM5269h = zzbysVar.m5269h();
        VideoController videoController = zzfbVarM5269h.f3179b;
        try {
            zzbmi zzbmiVar = zzfbVarM5269h.f3178a;
            if (zzbmiVar.zzj() != null) {
                videoController.m2761b(zzbmiVar.zzj());
            }
        } catch (RemoteException e) {
            zzo.m3071d("Exception occurred while getting video controller", e);
        }
        synchronized (videoController.f2982a) {
            z = videoController.f2983b != null;
        }
        if (z) {
            videoController.m2760a(new C6338c());
        }
        FrameLayout frameLayout = this.f24380b;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f24380b.addView(nativeAdView);
    }
}
