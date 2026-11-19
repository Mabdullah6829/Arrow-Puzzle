package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4141b0 {
    public static String[] A07 = {"MaUhfef1XHChQSOAsPU", "01oMUC4JT554rhL", "9TYVZPZrh7WqyaB", "ShOi1FYvFM9bF84GqYiu0GZZ4HOF35Af", "s", "YvdeaQsxQHJ3CZVDgFIjqRdATcpqYXuO", "b384kAccrLIUxrnk6NdGu", "f4PnsWwvvRSNWXAtteJ0H"};
    public final String A00 = C4141b0.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<InterfaceC3216Lt> A03;
    public final WeakReference<InterfaceC4142b1> A04;
    public final WeakReference<C4439fp> A05;
    public final WeakReference<C3192LV> A06;

    public C4141b0(C3192LV c3192lv, InterfaceC4142b1 interfaceC4142b1, C4439fp c4439fp, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C4494gi c4494gi) {
        this.A06 = new WeakReference<>(c3192lv);
        this.A04 = new WeakReference<>(interfaceC4142b1);
        this.A05 = new WeakReference<>(c4439fp);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c4494gi.A0F());
    }

    private InterfaceC3216Lt A00() {
        InterfaceC3216Lt funnel = this.A03.get();
        if (funnel == null) {
            return new C4724kX();
        }
        return funnel;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return AbstractC3932Xd.A01(C3700Tn.A02());
    }

    @JavascriptInterface
    public void logFunnel(int i2, String str) {
        A00().AKr(i2, str);
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AKs();
        if (this.A06.get() != null && this.A01.get() != null && this.A02.get() != null && this.A02.get().get()) {
            this.A01.get().set(true);
            A00().AKt();
            if (this.A06.get().isShown()) {
                A00().AKu();
                new Handler(Looper.getMainLooper()).post(new C3204Lh(this.A05));
            }
            InterfaceC4142b1 interfaceC4142b1 = this.A04.get();
            if (interfaceC4142b1 != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC4140az(this, interfaceC4142b1));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        C3192LV webView = this.A06.get();
        if (webView == null || webView.A0J()) {
            A00().AKv(true);
            return;
        }
        InterfaceC4142b1 interfaceC4142b1 = this.A04.get();
        if (interfaceC4142b1 == null) {
            A00().AKv(true);
            return;
        }
        InterfaceC3216Lt interfaceC3216LtA00 = A00();
        String[] strArr = A07;
        if (strArr[3].charAt(2) == strArr[5].charAt(2)) {
            throw new RuntimeException();
        }
        A07[6] = "MExJxptNjWm815DyzsGP1";
        interfaceC3216LtA00.AKv(false);
        interfaceC4142b1.AF8();
    }
}
