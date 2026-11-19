package p061g;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.arrow.puzzle.escape.maze.free.game.R;
import com.arrow.puzzle.escape.maze.free.game.activity.StartActivity;
import com.facebook.ads.AdError;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.InterfaceC1889Ad;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import java.util.ArrayList;

/* JADX INFO: renamed from: g.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6340e implements NativeAdListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ NativeAd f24381a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ StartActivity f24382b;

    public C6340e(NativeAd nativeAd, StartActivity startActivity) {
        this.f24381a = nativeAd;
        this.f24382b = startActivity;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(InterfaceC1889Ad interfaceC1889Ad) {
        NativeAd nativeAd = this.f24381a;
        if (nativeAd == interfaceC1889Ad) {
            nativeAd.unregisterView();
            StartActivity startActivity = this.f24382b;
            AbstractC6341f.f24383a = (FrameLayout) startActivity.findViewById(R.id.native_frame);
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(startActivity).inflate(R.layout.fb_native, (ViewGroup) AbstractC6341f.f24383a, false);
            AbstractC6341f.f24384b = linearLayout;
            AbstractC6341f.f24383a.addView(linearLayout);
            LinearLayout linearLayout2 = (LinearLayout) startActivity.findViewById(R.id.ad_choices_container);
            AdOptionsView adOptionsView = new AdOptionsView(startActivity, nativeAd, null);
            linearLayout2.removeAllViews();
            linearLayout2.addView(adOptionsView, 0);
            MediaView mediaView = (MediaView) AbstractC6341f.f24384b.findViewById(R.id.native_ad_icon);
            TextView textView = (TextView) AbstractC6341f.f24384b.findViewById(R.id.native_ad_title);
            MediaView mediaView2 = (MediaView) AbstractC6341f.f24384b.findViewById(R.id.native_ad_media);
            TextView textView2 = (TextView) AbstractC6341f.f24384b.findViewById(R.id.native_ad_social_context);
            TextView textView3 = (TextView) AbstractC6341f.f24384b.findViewById(R.id.native_ad_body);
            TextView textView4 = (TextView) AbstractC6341f.f24384b.findViewById(R.id.sponsored_label);
            TextView textView5 = (TextView) AbstractC6341f.f24384b.findViewById(R.id.native_ad_call_to_action);
            textView.setText(nativeAd.getAdvertiserName());
            textView3.setText(nativeAd.getAdBodyText());
            textView2.setText(nativeAd.getAdSocialContext());
            textView5.setVisibility(nativeAd.hasCallToAction() ? 0 : 4);
            textView5.setText(nativeAd.getAdCallToAction());
            textView4.setText(nativeAd.getSponsoredTranslation());
            ArrayList arrayList = new ArrayList();
            arrayList.add(textView);
            arrayList.add(textView5);
            nativeAd.registerViewForInteraction(AbstractC6341f.f24384b, mediaView2, mediaView, arrayList);
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(InterfaceC1889Ad interfaceC1889Ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(InterfaceC1889Ad interfaceC1889Ad) {
    }

    @Override // com.facebook.ads.NativeAdListener
    public final void onMediaDownloaded(InterfaceC1889Ad interfaceC1889Ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(InterfaceC1889Ad interfaceC1889Ad, AdError adError) {
    }
}
