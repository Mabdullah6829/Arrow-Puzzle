package p061g;

import android.app.Activity;
import com.facebook.ads.AdError;
import com.facebook.ads.InterfaceC1889Ad;
import com.facebook.ads.InterstitialAdListener;

/* JADX INFO: renamed from: g.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6337b implements InterstitialAdListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f24378a;

    public C6337b(Activity activity) {
        this.f24378a = activity;
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(InterfaceC1889Ad interfaceC1889Ad) {
        AbstractC6341f.f24388f.m164d();
        AbstractC6341f.m12151a(this.f24378a);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(InterfaceC1889Ad interfaceC1889Ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(InterfaceC1889Ad interfaceC1889Ad) {
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(InterfaceC1889Ad interfaceC1889Ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(InterfaceC1889Ad interfaceC1889Ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(InterfaceC1889Ad interfaceC1889Ad, AdError adError) {
    }
}
