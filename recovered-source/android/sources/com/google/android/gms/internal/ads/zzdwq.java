package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdwq {

    /* JADX INFO: renamed from: a */
    public final Context f13188a;

    /* JADX INFO: renamed from: b */
    public final zzbaw f13189b;

    /* JADX INFO: renamed from: c */
    public final zzbke f13190c;

    /* JADX INFO: renamed from: d */
    public final VersionInfoParcel f13191d;

    /* JADX INFO: renamed from: e */
    public final com.google.android.gms.ads.internal.zza f13192e;

    /* JADX INFO: renamed from: f */
    public final zzbhw f13193f;

    /* JADX INFO: renamed from: g */
    public final zzdga f13194g;

    /* JADX INFO: renamed from: h */
    public final zzekz f13195h;

    /* JADX INFO: renamed from: i */
    public final zzflk f13196i;

    /* JADX INFO: renamed from: j */
    public final zzdzt f13197j;

    /* JADX INFO: renamed from: k */
    public final zzcna f13198k;

    public zzdwq(Context context, zzbaw zzbawVar, zzbke zzbkeVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbhw zzbhwVar, zzdga zzdgaVar, zzekz zzekzVar, zzflk zzflkVar, zzdzt zzdztVar, zzcna zzcnaVar) {
        this.f13188a = context;
        this.f13189b = zzbawVar;
        this.f13190c = zzbkeVar;
        this.f13191d = versionInfoParcel;
        this.f13192e = zzaVar;
        this.f13193f = zzbhwVar;
        this.f13194g = zzdgaVar;
        this.f13195h = zzekzVar;
        this.f13196i = zzflkVar;
        this.f13197j = zzdztVar;
        this.f13198k = zzcnaVar;
    }

    /* JADX INFO: renamed from: a */
    public final zzclb m6077a(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfkn zzfknVar, zzfkq zzfkqVar) throws zzclq {
        zzcnl zzcnlVarM5676a = zzcnl.m5676a(zzrVar);
        String str = zzrVar.f3257s;
        zzclb zzclbVarM5647a = zzclr.m5647a(this.f13188a, this.f13191d, this.f13192e, new zzdwf(this), this.f13189b, this.f13193f, this.f13190c, zzcnlVarM5676a, this.f13197j, this.f13195h, zzfknVar, zzfkqVar, this.f13196i, str, false, false);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8876zf)).booleanValue()) {
            WebView webViewMo5620y = zzclbVarM5647a.mo5620y();
            if (this.f13198k.f10583a != null) {
                try {
                    WebViewCompat.setProfile(webViewMo5620y, "GMA_WEBVIEW_PROFILE");
                    com.google.android.gms.ads.internal.util.zze.m3150k("WebViewCompat Profile is defined");
                    return zzclbVarM5647a;
                } catch (IllegalStateException e) {
                    String strConcat = "WebViewCompat error: ".concat(e.toString());
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f(strConcat);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8859yf)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("WebViewCompat.setProfile", e);
                    }
                }
            }
        }
        return zzclbVarM5647a;
    }
}
