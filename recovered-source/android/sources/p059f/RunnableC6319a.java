package p059f;

import com.arrow.puzzle.escape.maze.free.game.activity.MainActivity;
import com.google.ads.mediation.C5136d;
import com.google.android.gms.ads.rewarded.RewardedAd;
import p001B.C0092r;

/* JADX INFO: renamed from: f.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC6319a implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f24341s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ MainActivity f24342t;

    public /* synthetic */ RunnableC6319a(MainActivity mainActivity, int i2) {
        this.f24341s = i2;
        this.f24342t = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24341s) {
            case 0:
                this.f24342t.f2905s.evaluateJavascript("integration.noRewardedAdAvailable();", null);
                break;
            case 1:
                this.f24342t.f2905s.evaluateJavascript("integration.rewarded();", null);
                break;
            case 2:
                this.f24342t.m2720h();
                break;
            case 3:
                MainActivity mainActivity = this.f24342t;
                if (!mainActivity.f2910x) {
                    mainActivity.m2720h();
                    mainActivity.f2905s.loadUrl("javascript:awebapp.itspro(0)");
                } else {
                    mainActivity.f2905s.loadUrl("javascript:awebapp.itspro(1)");
                }
                break;
            default:
                MainActivity mainActivity2 = this.f24342t;
                RewardedAd rewardedAd = mainActivity2.f2907u;
                if (rewardedAd == null) {
                    mainActivity2.f2905s.post(new RunnableC6319a(mainActivity2, 0));
                } else {
                    rewardedAd.mo3362c(new C5136d(mainActivity2, 2));
                    mainActivity2.f2907u.mo3363d(mainActivity2, new C0092r(mainActivity2, 11));
                }
                break;
        }
    }
}
