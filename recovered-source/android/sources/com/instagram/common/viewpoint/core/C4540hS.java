package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hS */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4540hS implements InterfaceC3998Yh {
    public static String[] A01 = {"8tOzOPKLz5DDIwqC88XBXxH90bmVDotF", "YCktuRbEMhZaz9U821mncTHWO05lwCqY", "Eq7g3criU65KDBPK", "XEHycrxPk7FQv1FkL381pmPNBNbKujpl", "niYnM4G6gzmxtC7fq", "sRQOtQAi", "8G5qrnHnaOtx52JqPPi", "6arHmIfqlBfM2iqNpfy3RxuQJelIt1eI"};
    public final WeakReference<C3568Re> A00;

    public C4540hS(C3568Re c3568Re) {
        this.A00 = new WeakReference<>(c3568Re);
    }

    private void A00(C3568Re c3568Re) {
        C4342eF c4342eFA07 = c3568Re.A07();
        if (c4342eFA07 != null && c3568Re.A04() != null) {
            c3568Re.A04().bringChildToFront(c4342eFA07);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3998Yh
    public void A44(View view, int i2, RelativeLayout.LayoutParams layoutParams) {
        C3568Re c3568Re = this.A00.get();
        if (c3568Re != null && c3568Re.A04() != null) {
            c3568Re.A04().addView(view, i2, layoutParams);
            A00(c3568Re);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3998Yh
    public void A45(View view, RelativeLayout.LayoutParams layoutParams) {
        C3568Re c3568Re = this.A00.get();
        if (c3568Re != null && c3568Re.A04() != null) {
            c3568Re.A04().addView(view, layoutParams);
            A00(c3568Re);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3998Yh
    public void A4j(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0C(str);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3998Yh
    public void A4k(String str, C3733UL c3733ul) {
        if (this.A00.get() != null) {
            this.A00.get().A0E(str, c3733ul);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3998Yh
    public void AAo(String str, C3332Nm c3332Nm) {
        if (this.A00.get() != null) {
            WeakReference<C3568Re> weakReference = this.A00;
            if (A01[4].length() == 0) {
                throw new RuntimeException();
            }
            A01[2] = "IO1gKUYJJG6YtU6JnI8y";
            weakReference.get().A0D(str, c3332Nm);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3998Yh
    public void ADJ(int i2) {
        C3568Re activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i2);
        }
    }
}
