package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.internal.ads.zzbaw;
import com.google.android.gms.internal.ads.zzbax;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzdzy;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfsm;
import com.google.android.gms.internal.ads.zzhbb;
import com.google.android.gms.internal.ads.zzhcp;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class TaggingLibraryJsInterface {

    /* JADX INFO: renamed from: a */
    public final Context f3795a;

    /* JADX INFO: renamed from: b */
    public final WebView f3796b;

    /* JADX INFO: renamed from: c */
    public final zzbaw f3797c;

    /* JADX INFO: renamed from: d */
    public final zzflk f3798d;

    /* JADX INFO: renamed from: e */
    public final int f3799e;

    /* JADX INFO: renamed from: f */
    public final zzdzy f3800f;

    /* JADX INFO: renamed from: g */
    public final boolean f3801g;

    /* JADX INFO: renamed from: h */
    public final zzhcp f3802h = zzcfy.f9951f;

    /* JADX INFO: renamed from: i */
    public final zzfsm f3803i;

    /* JADX INFO: renamed from: j */
    public final zzj f3804j;

    /* JADX INFO: renamed from: k */
    public final zza f3805k;

    /* JADX INFO: renamed from: l */
    public final zze f3806l;

    public TaggingLibraryJsInterface(WebView webView, zzbaw zzbawVar, zzdzy zzdzyVar, zzfsm zzfsmVar, zzflk zzflkVar, zzj zzjVar, zza zzaVar, zze zzeVar) {
        this.f3796b = webView;
        Context context = webView.getContext();
        this.f3795a = context;
        this.f3797c = zzbawVar;
        this.f3800f = zzdzyVar;
        zzbix.m5032a(context);
        zzbio zzbioVar = zzbix.f8415Ya;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        this.f3799e = ((Integer) zzbaVar.f3098c.m5030a(zzbioVar)).intValue();
        this.f3801g = ((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8431Za)).booleanValue();
        this.f3803i = zzfsmVar;
        this.f3798d = zzflkVar;
        this.f3804j = zzjVar;
        this.f3805k = zzaVar;
        this.f3806l = zzeVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
            zztVar.f3711k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strMo3261h = this.f3797c.f7501b.mo3261h(this.f3795a, str, this.f3796b);
            if (!this.f3801g) {
                return strMo3261h;
            }
            zztVar.f3711k.getClass();
            zzv.m3348d(this.f3800f, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            return strMo3261h;
        } catch (RuntimeException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Exception getting click signals. ", e);
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("TaggingLibraryJsInterface.getClickSignals", e);
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(final String str, int i2) {
        if (i2 <= 0) {
            String strM2447n = AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 51), "Invalid timeout for getting click signals. Timeout=", i2);
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3070c(strM2447n);
            return "";
        }
        try {
            return (String) ((zzhbb) zzcfy.f9946a).submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbh
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.f3918a.getClickSignals(str);
                }
            }).get(Math.min(i2, this.f3799e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Exception getting click signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("TaggingLibraryJsInterface.getClickSignalsWithTimeout", e);
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        String string = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final zzbf zzbfVar = new zzbf(this, string);
        if (((Boolean) zzblc.f9108e.m5057c()).booleanValue()) {
            this.f3804j.m3334a(this.f3796b, zzbfVar);
            return string;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8465bb)).booleanValue()) {
            this.f3802h.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbj
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.util.zzu zzuVar = com.google.android.gms.ads.internal.zzt.f3698C.f3706f;
                    TaggingLibraryJsInterface taggingLibraryJsInterface = this.f3922s;
                    Context context = taggingLibraryJsInterface.f3795a;
                    CookieManager cookieManagerM3237h = zzuVar.m3237h();
                    boolean zAcceptThirdPartyCookies = cookieManagerM3237h != null ? cookieManagerM3237h.acceptThirdPartyCookies(taggingLibraryJsInterface.f3796b) : false;
                    Bundle bundle2 = bundle;
                    bundle2.putBoolean("accept_3p_cookie", zAcceptThirdPartyCookies);
                    QueryInfo.m3358a(context, new AdRequest((AdRequest.Builder) new AdRequest.Builder().m2741b(bundle2)), zzbfVar);
                }
            });
            return string;
        }
        QueryInfo.m3358a(this.f3795a, new AdRequest((AdRequest.Builder) new AdRequest.Builder().m2741b(bundle)), zzbfVar);
        return string;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
            zztVar.f3711k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strMo3262i = this.f3797c.f7501b.mo3262i(this.f3795a, this.f3796b, null);
            if (!this.f3801g) {
                return strMo3262i;
            }
            zztVar.f3711k.getClass();
            zzv.m3348d(this.f3800f, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            return strMo3262i;
        } catch (RuntimeException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Exception getting view signals. ", e);
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("TaggingLibraryJsInterface.getViewSignals", e);
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i2) {
        if (i2 <= 0) {
            String strM2447n = AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 50), "Invalid timeout for getting view signals. Timeout=", i2);
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3070c(strM2447n);
            return "";
        }
        try {
            return (String) ((zzhbb) zzcfy.f9946a).submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbg
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.f3917a.getViewSignals();
                }
            }).get(Math.min(i2, this.f3799e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Exception getting view signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("TaggingLibraryJsInterface.getViewSignalsWithTimeout", e);
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(final String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8499db)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzcfy.f9946a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbi
            @Override // java.lang.Runnable
            public final void run() {
                zzflk zzflkVar;
                TaggingLibraryJsInterface taggingLibraryJsInterface = this.f3920s;
                WebView webView = taggingLibraryJsInterface.f3796b;
                Context context = taggingLibraryJsInterface.f3795a;
                Uri uriM4705b = Uri.parse(str);
                try {
                    uriM4705b = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8806vd)).booleanValue() || (zzflkVar = taggingLibraryJsInterface.f3798d) == null) ? taggingLibraryJsInterface.f3797c.m4705b(uriM4705b, context, webView, null) : zzflkVar.m6489a(uriM4705b, context, webView, null);
                } catch (zzbax e) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3069b("Failed to append the click signal to URL: ", e);
                    com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("TaggingLibraryJsInterface.recordClick", e);
                }
                taggingLibraryJsInterface.f3803i.m6643b(uriM4705b.toString(), null, null, null);
            }
        });
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        int i2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i3 = jSONObject.getInt("x");
            int i4 = jSONObject.getInt("y");
            int i5 = jSONObject.getInt("duration_ms");
            float f2 = (float) jSONObject.getDouble("force");
            int i6 = jSONObject.getInt("type");
            if (i6 != 0) {
                i2 = 1;
                if (i6 != 1) {
                    i2 = 2;
                    if (i6 != 2) {
                        i2 = 3;
                        if (i6 != 3) {
                            i2 = -1;
                        }
                    }
                }
            } else {
                i2 = 0;
            }
            try {
                this.f3797c.f7501b.mo3255b(MotionEvent.obtain(0L, i5, i2, i3, i4, f2, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException e) {
                e = e;
                int i7 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("TaggingLibraryJsInterface.reportTouchEvent", e);
            } catch (JSONException e2) {
                e = e2;
                int i8 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("TaggingLibraryJsInterface.reportTouchEvent", e);
            }
        } catch (RuntimeException | JSONException e3) {
            e = e3;
        }
    }
}
