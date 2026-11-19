package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcla extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    public final zzclx f10391a;

    public zzcla(zzclx zzclxVar) {
        this.f10391a = zzclxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final Context m5566b(WebView webView) {
        if (!(webView instanceof zzclb)) {
            return webView.getContext();
        }
        zzclb zzclbVar = (zzclb) webView;
        Activity activityZzj = zzclbVar.zzj();
        return activityZzj != null ? activityZzj : zzclbVar.getContext();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5567a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        com.google.android.gms.ads.internal.zzb zzbVar;
        try {
            zzclx zzclxVar = this.f10391a;
            if (zzclxVar != null && zzclxVar.mo5582K() != null && zzclxVar.mo5582K().f10432O != null && (zzbVar = zzclxVar.mo5582K().f10432O) != null && !zzbVar.m3246a()) {
                StringBuilder sb = new StringBuilder(str.length() + 9 + String.valueOf(str3).length() + 2);
                sb.append("window.");
                sb.append(str);
                sb.append("('");
                sb.append(str3);
                sb.append("')");
                zzbVar.m3247b(sb.toString());
                return false;
            }
            com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            AlertDialog.Builder builderM3212k = com.google.android.gms.ads.internal.util.zzs.m3212k(context);
            builderM3212k.setTitle(str2);
            if (!z) {
                builderM3212k.setMessage(str3).setPositiveButton(R.string.ok, new zzckv(jsResult)).setNegativeButton(R.string.cancel, new zzcku(jsResult)).setOnCancelListener(new zzckt(jsResult)).create().show();
                return true;
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            builderM3212k.setView(linearLayout).setPositiveButton(R.string.ok, new zzcky(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new zzckx(jsPromptResult)).setOnCancelListener(new zzckw(jsPromptResult)).create().show();
            return true;
        } catch (WindowManager.BadTokenException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Fail to display Dialog.", e);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzclb)) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVarMo5585O = ((zzclb) webView).mo5585O();
        if (zzmVarMo5585O != null) {
            zzmVarMo5585O.zzb();
        } else {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Tried to close an AdWebView not associated with an overlay.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        int iLineNumber = consoleMessage.lineNumber();
        int length = String.valueOf(strMessage).length();
        StringBuilder sb = new StringBuilder(AbstractC0271e0.m395c(length + 6 + String.valueOf(strSourceId).length(), 1, String.valueOf(iLineNumber).length(), 1));
        AbstractC0271e0.m413u(sb, "JS: ", strMessage, " (", strSourceId);
        String strM2448o = AbstractC1456a.m2448o(sb, ":", iLineNumber, ")");
        if (strM2448o.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i2 = zzckz.f10385a[consoleMessage.messageLevel().ordinal()];
        if (i2 == 1) {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3070c(strM2448o);
        } else if (i2 == 2) {
            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f(strM2448o);
        } else if (i2 == 3 || i2 == 4 || i2 != 5) {
            int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3072e(strM2448o);
        } else {
            int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3068a(strM2448o);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        zzclx zzclxVar = this.f10391a;
        if (((zzcme) zzclxVar.f10483s).m5656G0() != null) {
            webView2.setWebViewClient(((zzcme) zzclxVar.f10483s).m5656G0());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j2, long j3, long j4, WebStorage.QuotaUpdater quotaUpdater) {
        long j5 = 5242880 - j4;
        if (j5 <= 0) {
            quotaUpdater.updateQuota(j2);
            return;
        }
        if (j2 == 0) {
            if (j3 > j5 || j3 > 1048576) {
                j3 = 0;
            }
        } else if (j3 == 0) {
            j3 = Math.min(Math.min(131072L, j5) + j2, 1048576L);
        } else {
            if (j3 <= Math.min(1048576 - j2, j5)) {
                j2 += j3;
            }
            j3 = j2;
        }
        quotaUpdater.updateQuota(j3);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (callback != null) {
            com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            zzclx zzclxVar = this.f10391a;
            boolean z = com.google.android.gms.ads.internal.util.zzs.m3204c(zzclxVar.getContext(), "android.permission.ACCESS_FINE_LOCATION") || com.google.android.gms.ads.internal.util.zzs.m3204c(zzclxVar.getContext(), "android.permission.ACCESS_COARSE_LOCATION");
            zzbio zzbioVar = zzbix.f8136He;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                callback.invoke(str, false, true);
            } else {
                callback.invoke(str, z, true);
            }
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8153Ie)).booleanValue()) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("AdWebChromeClient.onGeolocationPermissionsShowPrompt()");
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzm zzmVarMo5585O = ((zzcme) this.f10391a.f10483s).mo5585O();
        if (zzmVarMo5585O != null) {
            zzmVarMo5585O.zzc();
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not get ad overlay when hiding custom view.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return m5567a(m5566b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return m5567a(m5566b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return m5567a(m5566b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return m5567a(m5566b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i2, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVarMo5585O = ((zzcme) this.f10391a.f10483s).mo5585O();
        if (zzmVarMo5585O == null) {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        Activity activity = zzmVarMo5585O.f3361t;
        FrameLayout frameLayout = new FrameLayout(activity);
        zzmVarMo5585O.f3367z = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        zzmVarMo5585O.f3367z.addView(view, -1, -1);
        activity.setContentView(zzmVarMo5585O.f3367z);
        zzmVarMo5585O.f3355K = true;
        zzmVarMo5585O.f3345A = customViewCallback;
        zzmVarMo5585O.f3366y = true;
        zzmVarMo5585O.m3012t4(i2);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
