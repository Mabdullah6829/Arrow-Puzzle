package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.widget.C1137R;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.at */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4134at extends WebViewClient {
    public static byte[] A05;
    public final WeakReference<C4494gi> A02;
    public final WeakReference<InterfaceC4131aq> A03;
    public final WeakReference<C4126al> A04;
    public final InterfaceC4130ap A01 = new InterfaceC4130ap() { // from class: com.facebook.ads.redexgen.X.M4
        @Override // com.instagram.common.viewpoint.core.InterfaceC4130ap
        public final boolean AAf(String str) {
            return C4134at.A04(str);
        }
    };
    public WeakReference<InterfaceC4132ar> A00 = new WeakReference<>(null);

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{28, 31, 18, 8, 9, 71, 31, 17, 28, 19, 22, 37, 42, 27, 37, 39, 48, 45, 50, 45, 48, 61, 12, 3, 9, 31, 2, 4, 9, 67, 4, 3, 25, 8, 3, 25, 67, 12, 14, 25, 4, 2, 3, 67, 59, 36, 40, 58, 119, 120, 114, 100, 121, 127, 114, 56, 127, 120, 98, 115, 120, 98, 56, 117, 119, 98, 115, 113, 121, 100, 111, 56, 84, 68, 89, 65, 69, 87, 84, 90, 83, 117, 101, 120, 96, 100, 114, 101, 72, 113, 118, 123, 123, 117, 118, 116, 124, 72, 98, 101, 123, 51, 54, 35, 54, 97, 102, 124, 109, 102, 124, 2, 5, 27, 77, 87, 31, 13, 10, 55, 30, 1, 13, 31};
    }

    public C4134at(WeakReference<C4494gi> weakReference, WeakReference<InterfaceC4131aq> weakReference2, WeakReference<C4126al> weakReference3) {
        this.A02 = weakReference;
        this.A03 = weakReference2;
        this.A04 = weakReference3;
    }

    private void A02(String str, C4494gi c4494gi) {
        c4494gi.A08().ABC(A00(11, 11, 104), AbstractC3690Td.A09, new C3691Te(A00(111, 5, 91) + str));
    }

    private boolean A03(WebView webView, String str) {
        Intent intent;
        String strA00 = A00(C1137R.styleable.ConstraintSet_pathMotionArc, 8, 68);
        C4494gi c4494gi = this.A02.get();
        if (c4494gi != null) {
            if ((C3226M3.A0A && (TextUtils.isEmpty(str) || A00(0, 11, 81).equals(str))) || !this.A01.AAf(str)) {
                return true;
            }
            try {
                Uri uri = AbstractC3904XB.A00(str);
                String scheme = uri.getScheme();
                try {
                    boolean zA14 = C3763Up.A14(c4494gi);
                    String strA01 = A00(48, 33, 58);
                    String strA02 = A00(22, 26, 65);
                    String strA03 = A00(105, 6, 36);
                    if (zA14) {
                        if (!C3226M3.A0D.contains(scheme) && !A00(101, 4, 123).equals(scheme)) {
                            if (strA03.equalsIgnoreCase(scheme)) {
                                intent = Intent.parseUri(str, 1);
                                intent.setComponent(null);
                                intent.setSelector(null);
                            } else {
                                intent = new Intent(strA02, uri);
                            }
                            intent.addCategory(strA01);
                            if (Build.VERSION.SDK_INT >= 30) {
                                intent.setFlags(268436480);
                            } else {
                                intent.setFlags(268435456);
                            }
                            try {
                                if (!C3889Wu.A0D(c4494gi, intent)) {
                                    A02(str, c4494gi);
                                }
                                return true;
                            } catch (C3887Ws unused) {
                                if (strA03.equals(scheme)) {
                                    String stringExtra = intent.getStringExtra(A00(81, 20, 59));
                                    if (!TextUtils.isEmpty(stringExtra)) {
                                        if (!C3889Wu.A0D(c4494gi, new Intent(strA02, AbstractC3904XB.A00(stringExtra)))) {
                                            A02(str, c4494gi);
                                        }
                                        return true;
                                    }
                                }
                                C3691Te c3691Te = new C3691Te(A00(111, 5, 91) + str);
                                c3691Te.A05(1);
                                c4494gi.A08().ABD(A00(11, 11, 104), AbstractC3690Td.A06, c3691Te);
                                return true;
                            }
                        }
                        return false;
                    }
                    if (!C3226M3.A0A || !strA03.equalsIgnoreCase(scheme)) {
                        if ((C3226M3.A0A && AbstractC3930Xb.A04(str)) || !C3226M3.A0D.contains(scheme)) {
                            return C3889Wu.A0D(c4494gi, new Intent(strA02, uri));
                        }
                    } else {
                        Intent uri2 = Intent.parseUri(str, 1);
                        uri2.addCategory(strA01);
                        uri2.setComponent(null);
                        uri2.setSelector(null);
                        if (c4494gi.getPackageManager().resolveActivity(uri2, 65536) != null && C3889Wu.A0D(c4494gi, uri2)) {
                            webView.goBack();
                            return true;
                        }
                    }
                } catch (Exception e) {
                    c4494gi.A08().ABD(strA00, AbstractC3690Td.A2d, new C3691Te(e));
                    c4494gi.A0F().AA2(e.toString());
                }
                return false;
            } catch (SecurityException e2) {
                c4494gi.A08().ABD(strA00, AbstractC3690Td.A2d, new C3691Te(e2));
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean A04(String str) {
        return true;
    }

    public final void A05(WeakReference<InterfaceC4132ar> weakReference) {
        this.A00 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C4126al timingLogger = this.A04.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        InterfaceC4131aq interfaceC4131aq = this.A03.get();
        if (interfaceC4131aq != null) {
            interfaceC4131aq.AF7(str);
        }
        InterfaceC4132ar interfaceC4132ar = this.A00.get();
        if (interfaceC4132ar != null) {
            interfaceC4132ar.ADB(webView.canGoBack());
            interfaceC4132ar.ADx(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC4131aq listener = this.A03.get();
        if (listener != null) {
            listener.AF9(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        C4494gi c4494gi = this.A02.get();
        if (c4494gi != null) {
            StringBuilder sb = new StringBuilder();
            String strA00 = A00(0, 0, 109);
            String errorMessage = AbstractC3930Xb.A01(i2, sb.append(strA00).append(str).toString(), strA00 + str2);
            c4494gi.A0F().A9z(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C4494gi c4494gi = this.A02.get();
        if (c4494gi != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb = new StringBuilder();
            String strA00 = A00(0, 0, 109);
            String errorMessage = AbstractC3930Xb.A01(errorCode, sb.append(strA00).append((Object) webResourceError.getDescription()).toString(), strA00 + webResourceRequest.getUrl());
            c4494gi.A0F().A9z(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C4494gi context = this.A02.get();
        if (context != null) {
            context.A0F().AA0();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C4494gi context = this.A02.get();
        if (context != null) {
            context.A0F().AA1();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC4139ay.A0D(AbstractC3690Td.A2e);
        InterfaceC4131aq listener = this.A03.get();
        if (listener != null) {
            listener.AFe();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A03(webView, str);
    }
}
