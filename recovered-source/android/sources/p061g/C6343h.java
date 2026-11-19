package p061g;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import p049b0.C1887c;

/* JADX INFO: renamed from: g.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6343h extends FullScreenContentCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1887c f24395a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f24396b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C6344i f24397c;

    public C6343h(C6344i c6344i, C1887c c1887c, Activity activity) {
        this.f24397c = c6344i;
        this.f24395a = c1887c;
        this.f24396b = activity;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    /* JADX INFO: renamed from: a */
    public final void mo2734a() {
        C6344i c6344i = this.f24397c;
        c6344i.f24398a = null;
        c6344i.f24400c = false;
        Log.d("AppOpenAdManager", "onAdDismissedFullScreenContent.");
        this.f24395a.getClass();
        c6344i.m12154a(this.f24396b);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    /* JADX INFO: renamed from: b */
    public final void mo2735b(AdError adError) {
        C6344i c6344i = this.f24397c;
        c6344i.f24398a = null;
        c6344i.f24400c = false;
        Log.d("AppOpenAdManager", "onAdFailedToShowFullScreenContent: " + adError.f2929b);
        c6344i.m12154a(this.f24396b);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    /* JADX INFO: renamed from: c */
    public final void mo2736c() {
        Log.d("AppOpenAdManager", "onAdShowedFullScreenContent.");
    }
}
