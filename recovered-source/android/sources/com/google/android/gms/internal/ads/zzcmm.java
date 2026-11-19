package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcmm {

    /* JADX INFO: renamed from: a */
    public final zzcml f10575a;

    /* JADX INFO: renamed from: b */
    public final zzcmn f10576b;

    public zzcmm(zzcmn zzcmnVar, zzcml zzcmlVar) {
        this.f10575a = zzcmlVar;
        this.f10576b = zzcmnVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.m3150k("Click string is empty, not proceeding.");
            return "";
        }
        Object obj = this.f10576b;
        zzbaw zzbawVarMo5611q = ((zzcmu) obj).mo5611q();
        if (zzbawVarMo5611q == null) {
            com.google.android.gms.ads.internal.util.zze.m3150k("Signal utils is empty, ignoring.");
            return "";
        }
        zzbar zzbarVar = zzbawVarMo5611q.f7501b;
        if (zzbarVar == null) {
            com.google.android.gms.ads.internal.util.zze.m3150k("Signals object is empty, ignoring.");
            return "";
        }
        View view = (View) obj;
        if (view.getContext() != null) {
            return zzbarVar.mo3256c(view.getContext(), str, ((zzcmw) obj).mo5577H(), ((zzcme) obj).f10541s.f10585a);
        }
        com.google.android.gms.ads.internal.util.zze.m3150k("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        Object obj = this.f10576b;
        zzbaw zzbawVarMo5611q = ((zzcmu) obj).mo5611q();
        if (zzbawVarMo5611q == null) {
            com.google.android.gms.ads.internal.util.zze.m3150k("Signal utils is empty, ignoring.");
            return "";
        }
        zzbar zzbarVar = zzbawVarMo5611q.f7501b;
        if (zzbarVar == null) {
            com.google.android.gms.ads.internal.util.zze.m3150k("Signals object is empty, ignoring.");
            return "";
        }
        View view = (View) obj;
        if (view.getContext() != null) {
            return zzbarVar.mo3262i(view.getContext(), ((zzcmw) obj).mo5577H(), ((zzcme) obj).f10541s.f10585a);
        }
        com.google.android.gms.ads.internal.util.zze.m3150k("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignalsJson() {
        Object obj = this.f10576b;
        zzbix.m5032a(((View) obj).getContext());
        String viewSignals = getViewSignals();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8604jf)).booleanValue()) {
            return viewSignals;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ms", viewSignals);
            zzclm zzclmVarMo5582K = ((zzclb) obj).mo5582K();
            zzdbv zzdbvVar = zzclmVarMo5582K != null ? zzclmVarMo5582K.f10436S : null;
            if (zzdbvVar != null) {
                long j2 = zzdbvVar.f11972a.get();
                if (j2 > 0) {
                    jSONObject.put("plcmtid", j2);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.m3151l("Error constructing JSON.", e);
            return "";
        }
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (!TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmj
                @Override // java.lang.Runnable
                public final void run() {
                    zzcml zzcmlVar = this.f10572s.f10575a;
                    Uri uri = Uri.parse(str);
                    zzclm zzclmVar = ((zzcme) ((zzcmk) zzcmlVar).f10574a).f10505F;
                    if (zzclmVar != null) {
                        zzclmVar.m5637g(uri);
                    } else {
                        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3070c("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    }
                }
            });
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("URL is empty, ignoring message");
        }
    }
}
