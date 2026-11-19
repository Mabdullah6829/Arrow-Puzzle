package p061g;

import android.app.Activity;
import com.google.ads.mediation.C5136d;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.internal.ads.zzbss;

/* JADX INFO: renamed from: g.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6336a extends InterstitialAdLoadCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f24376a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AdRequest f24377b;

    public C6336a(Activity activity, AdRequest adRequest) {
        this.f24376a = activity;
        this.f24377b = adRequest;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    /* JADX INFO: renamed from: a */
    public final void mo2731a(LoadAdError loadAdError) {
        AbstractC6341f.m12151a(this.f24376a);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    /* JADX INFO: renamed from: b */
    public final void mo2732b(Object obj) {
        InterstitialAd interstitialAd = (InterstitialAd) obj;
        AbstractC6341f.f24385c = (zzbss) interstitialAd;
        interstitialAd.mo3275c(new C5136d(this, 3));
    }
}
