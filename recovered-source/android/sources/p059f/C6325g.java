package p059f;

import com.arrow.puzzle.escape.maze.free.game.activity.MainActivity;
import com.google.ads.mediation.C5136d;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.internal.ads.zzbss;

/* JADX INFO: renamed from: f.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6325g extends InterstitialAdLoadCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MainActivity f24350a;

    public C6325g(MainActivity mainActivity) {
        this.f24350a = mainActivity;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    /* JADX INFO: renamed from: a */
    public final void mo2731a(LoadAdError loadAdError) {
        this.f24350a.f2906t = null;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    /* JADX INFO: renamed from: b */
    public final void mo2732b(Object obj) {
        InterstitialAd interstitialAd = (InterstitialAd) obj;
        this.f24350a.f2906t = (zzbss) interstitialAd;
        interstitialAd.mo3275c(new C5136d(this, 1));
    }
}
