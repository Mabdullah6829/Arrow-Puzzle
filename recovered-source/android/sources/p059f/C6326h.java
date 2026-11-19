package p059f;

import com.arrow.puzzle.escape.maze.free.game.activity.MainActivity;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* JADX INFO: renamed from: f.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6326h extends RewardedAdLoadCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MainActivity f24351a;

    public C6326h(MainActivity mainActivity) {
        this.f24351a = mainActivity;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    /* JADX INFO: renamed from: a */
    public final void mo2731a(LoadAdError loadAdError) {
        this.f24351a.f2907u = null;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    /* JADX INFO: renamed from: b */
    public final void mo2732b(Object obj) {
        this.f24351a.f2907u = (RewardedAd) obj;
    }
}
