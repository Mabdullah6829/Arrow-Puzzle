package com.instagram.common.viewpoint.core;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jA */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4642jA implements InterfaceC3640Sp {
    public final C3334No A00;
    public final InterfaceC3349O3 A01;
    public final C3648Sx A02;
    public final C4494gi A03;
    public final boolean A04;

    public C4642jA(C4494gi c4494gi, InterfaceC3349O3 interfaceC3349O3, C3648Sx c3648Sx, C3334No c3334No, boolean z) {
        this.A03 = c4494gi;
        this.A01 = interfaceC3349O3;
        this.A02 = c3648Sx;
        this.A00 = c3334No;
        this.A04 = z;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        C3350O4 playableWebViewClient = new C3350O4(this.A00, this.A01, this.A04);
        webView.setWebViewClient(playableWebViewClient);
        webView.loadUrl(this.A00.A0L());
        playableWebViewClient.A03();
    }

    private void A01(boolean z) {
        if (this.A00.A0G() == EnumC3335Np.A05) {
            A00();
            return;
        }
        String strA0L = this.A00.A0L();
        if (z) {
            C3648Sx c3648Sx = this.A02;
            String markupUrlResult = this.A00.A0L();
            strA0L = c3648Sx.A0S(markupUrlResult);
        }
        this.A00.A0T(strA0L);
        this.A01.AFG();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3640Sp
    public final void ADL() {
        if (this.A04) {
            this.A01.AFF(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3640Sp
    public final void ADT() {
        A01(true);
    }
}
