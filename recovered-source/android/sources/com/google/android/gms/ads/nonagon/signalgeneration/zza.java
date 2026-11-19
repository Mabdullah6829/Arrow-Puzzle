package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzgxd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zza {

    /* JADX INFO: renamed from: a */
    public final Context f3807a;

    /* JADX INFO: renamed from: b */
    public final ApplicationInfo f3808b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f3809c;

    /* JADX INFO: renamed from: d */
    public final VersionInfoParcel f3810d;

    /* JADX INFO: renamed from: e */
    public final JSONObject f3811e = new JSONObject();

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f3812f = new AtomicBoolean(false);

    public zza(Context context, ArrayList arrayList, VersionInfoParcel versionInfoParcel) {
        this.f3807a = context;
        this.f3808b = context.getApplicationInfo();
        this.f3809c = arrayList;
        this.f3810d = versionInfoParcel;
    }

    /* JADX INFO: renamed from: a */
    public final void m3314a(WebView webView) {
        if (this.f3812f.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoM3663b = null;
        ApplicationInfo applicationInfo = this.f3808b;
        if (applicationInfo != null) {
            try {
                packageInfoM3663b = Wrappers.m3665a(this.f3807a).m3663b(0, applicationInfo.packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        JSONObject jSONObject = this.f3811e;
        if (packageInfoM3663b != null) {
            try {
                jSONObject.put("vc", packageInfoM3663b.versionCode);
                jSONObject.put("vnm", packageInfoM3663b.versionName);
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("PawAppSignalGenerator.initialize", e);
            }
        }
        if (applicationInfo != null) {
            jSONObject.put("pn", applicationInfo.packageName);
        }
        ArrayList arrayList = this.f3809c;
        ArrayList arrayList2 = new ArrayList();
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8600jb)).split(",", -1)) {
            if (arrayList.contains(str)) {
                arrayList2.add(str);
            }
        }
        jSONObject.put("eid", arrayList2);
        jSONObject.put("js", this.f3810d.f3396s);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != null) {
                jSONObject.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
        if (((Boolean) zzblc.f9105b.m5057c()).booleanValue() && WebViewFeature.isFeatureSupported(WebViewFeature.DOCUMENT_START_SCRIPT) && webView != null) {
            WebViewCompat.addDocumentStartJavaScript(webView, String.format(Locale.getDefault(), (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8584ib), m3315b()), zzgxd.m7238m());
        }
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m3315b() {
        if (!this.f3812f.get()) {
            m3314a(null);
        }
        return this.f3811e;
    }
}
