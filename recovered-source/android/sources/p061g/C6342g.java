package p061g;

import android.util.Log;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import java.util.Date;

/* JADX INFO: renamed from: g.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6342g extends AppOpenAd.AppOpenAdLoadCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6344i f24394a;

    public C6342g(C6344i c6344i) {
        this.f24394a = c6344i;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    /* JADX INFO: renamed from: a */
    public final void mo2731a(LoadAdError loadAdError) {
        this.f24394a.f24399b = false;
        Log.d("AppOpenAdManager", "onAdFailedToLoad: " + loadAdError.f2929b);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    /* JADX INFO: renamed from: b */
    public final void mo2732b(Object obj) {
        C6344i c6344i = this.f24394a;
        c6344i.f24398a = (AppOpenAd) obj;
        c6344i.f24399b = false;
        c6344i.f24401d = new Date().getTime();
        Log.d("AppOpenAdManager", "onAdLoaded.");
    }
}
