package com.google.ads.mediation;

import com.arrow.puzzle.escape.maze.free.game.activity.MainActivity;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import p022N.AbstractC0355G;
import p059f.C6325g;
import p059f.RunnableC6324f;
import p059f.RunnableC6327i;
import p061g.AbstractC6341f;
import p061g.C6336a;

/* JADX INFO: renamed from: com.google.ads.mediation.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5136d extends FullScreenContentCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2919a;

    /* JADX INFO: renamed from: b */
    public final Object f2920b;

    public C5136d(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f2919a = 0;
        this.f2920b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    /* JADX INFO: renamed from: a */
    public final void mo2734a() {
        switch (this.f2919a) {
            case 0:
                ((MediationInterstitialListener) this.f2920b).mo3289d();
                break;
            case 1:
                MainActivity mainActivity = ((C6325g) this.f2920b).f24350a;
                mainActivity.f2905s.post(new RunnableC6324f(this, 0));
                mainActivity.f2906t = null;
                mainActivity.m2721i();
                break;
            case 2:
                MainActivity mainActivity2 = (MainActivity) this.f2920b;
                mainActivity2.f2905s.post(new RunnableC6327i(this, 0));
                mainActivity2.f2907u = null;
                mainActivity2.m2722j();
                break;
            default:
                AbstractC6341f.f24388f.m164d();
                C6336a c6336a = (C6336a) this.f2920b;
                InterstitialAd.m3273b(c6336a.f24376a, AbstractC0355G.f689A, c6336a.f24377b, AbstractC6341f.f24392j);
                break;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    /* JADX INFO: renamed from: b */
    public void mo2735b(AdError adError) {
        switch (this.f2919a) {
            case 1:
                MainActivity mainActivity = ((C6325g) this.f2920b).f24350a;
                mainActivity.f2905s.post(new RunnableC6324f(this, 1));
                mainActivity.f2906t = null;
                break;
            case 2:
                MainActivity mainActivity2 = (MainActivity) this.f2920b;
                mainActivity2.f2905s.post(new RunnableC6327i(this, 1));
                mainActivity2.f2907u = null;
                mainActivity2.m2722j();
                break;
            case 3:
                AbstractC6341f.m12152b(((C6336a) this.f2920b).f24376a, AbstractC6341f.f24388f);
                break;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    /* JADX INFO: renamed from: c */
    public final void mo2736c() {
        switch (this.f2919a) {
            case 0:
                ((MediationInterstitialListener) this.f2920b).mo3290l();
                break;
            case 1:
                ((C6325g) this.f2920b).f24350a.f2905s.post(new RunnableC6324f(this, 2));
                break;
            case 2:
                ((MainActivity) this.f2920b).f2905s.post(new RunnableC6327i(this, 2));
                break;
        }
    }

    public /* synthetic */ C5136d(Object obj, int i2) {
        this.f2919a = i2;
        this.f2920b = obj;
    }

    /* JADX INFO: renamed from: d */
    private final void m2733d() {
    }
}
