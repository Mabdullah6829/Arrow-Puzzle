package com.google.ads.mediation;

import android.widget.FrameLayout;
import com.arrow.puzzle.escape.maze.free.game.activity.StartActivity;
import com.facebook.ads.NativeAd;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.zzd;
import com.google.android.gms.ads.formats.zze;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.zzbnd;
import p022N.AbstractC0355G;
import p061g.C6340e;

/* JADX INFO: renamed from: com.google.ads.mediation.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5137e extends AdListener implements zzg, zze, zzd {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2921s = 1;

    /* JADX INFO: renamed from: t */
    public final Object f2922t;

    /* JADX INFO: renamed from: u */
    public final Object f2923u;

    public C5137e(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f2922t = abstractAdViewAdapter;
        this.f2923u = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.formats.zzd
    /* JADX INFO: renamed from: a */
    public void mo2738a(zzbnd zzbndVar, String str) {
        ((MediationNativeListener) this.f2923u).mo3296m(zzbndVar, str);
    }

    @Override // com.google.android.gms.ads.AdListener
    /* JADX INFO: renamed from: b */
    public void mo2725b() {
        switch (this.f2921s) {
            case 0:
                ((MediationNativeListener) this.f2923u).mo3292a();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    /* JADX INFO: renamed from: c */
    public final void mo2726c(LoadAdError loadAdError) {
        switch (this.f2921s) {
            case 0:
                ((MediationNativeListener) this.f2923u).mo3299q(loadAdError);
                break;
            default:
                StartActivity startActivity = (StartActivity) this.f2923u;
                NativeAd nativeAd = new NativeAd(startActivity, AbstractC0355G.f693E);
                nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new C6340e(nativeAd, startActivity)).build());
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    /* JADX INFO: renamed from: d */
    public void mo2739d() {
        switch (this.f2921s) {
            case 0:
                ((MediationNativeListener) this.f2923u).mo3294h();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    /* JADX INFO: renamed from: e */
    public void mo2727e() {
        int i2 = this.f2921s;
    }

    @Override // com.google.android.gms.ads.AdListener
    /* JADX INFO: renamed from: g */
    public void mo2728g() {
        switch (this.f2921s) {
            case 0:
                ((MediationNativeListener) this.f2923u).mo3295j();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    /* JADX INFO: renamed from: k */
    public void mo2730k() {
        switch (this.f2921s) {
            case 0:
                ((MediationNativeListener) this.f2923u).mo3297o();
                break;
        }
    }

    public C5137e(FrameLayout frameLayout, StartActivity startActivity) {
        this.f2922t = frameLayout;
        this.f2923u = startActivity;
    }

    /* JADX INFO: renamed from: j */
    private final void m2737j() {
    }
}
