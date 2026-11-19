package p059f;

import android.widget.FrameLayout;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: renamed from: f.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6320b extends AdListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ FrameLayout f24343s;

    public C6320b(FrameLayout frameLayout) {
        this.f24343s = frameLayout;
    }

    @Override // com.google.android.gms.ads.AdListener
    /* JADX INFO: renamed from: c */
    public final void mo2726c(LoadAdError loadAdError) {
        this.f24343s.setVisibility(8);
    }

    @Override // com.google.android.gms.ads.AdListener
    /* JADX INFO: renamed from: e */
    public final void mo2727e() {
    }
}
