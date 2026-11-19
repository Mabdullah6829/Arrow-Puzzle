package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzfve implements WebViewCompat.WebMessageListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzfvg f16642a;

    public zzfve(zzfvg zzfvgVar) {
        this.f16642a = zzfvgVar;
    }

    @Override // androidx.webkit.WebViewCompat.WebMessageListener
    public final void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy) {
        try {
            JSONObject jSONObject = new JSONObject(webMessageCompat.getData());
            String string = jSONObject.getString(FirebaseAnalytics.Param.METHOD);
            String string2 = jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getString("adSessionId");
            boolean zEquals = string.equals("startSession");
            zzfvg zzfvgVar = this.f16642a;
            if (zEquals) {
                zzfvgVar.m6729a(string2);
                return;
            }
            if (string.equals("finishSession")) {
                HashMap map = zzfvgVar.f16646d;
                zzfuu zzfuuVar = (zzfuu) map.get(string2);
                if (zzfuuVar != null) {
                    zzfuuVar.mo6722b();
                    map.remove(string2);
                }
            }
        } catch (JSONException e) {
            zzfwp.m6752a("Error parsing JS message in JavaScriptSessionService.", e);
        }
    }
}
