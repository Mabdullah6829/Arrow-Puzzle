package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzelt {

    /* JADX INFO: renamed from: a */
    public final Context f14171a;

    /* JADX INFO: renamed from: b */
    public final VersionInfoParcel f14172b;

    /* JADX INFO: renamed from: c */
    public final zzfkn f14173c;

    /* JADX INFO: renamed from: d */
    public final zzclb f14174d;

    /* JADX INFO: renamed from: e */
    public final zzdzt f14175e;

    /* JADX INFO: renamed from: f */
    public zzfvg f14176f;

    public zzelt(Context context, VersionInfoParcel versionInfoParcel, zzfkn zzfknVar, zzclb zzclbVar, zzdzt zzdztVar) {
        this.f14171a = context;
        this.f14172b = versionInfoParcel;
        this.f14173c = zzfknVar;
        this.f14174d = zzclbVar;
        this.f14175e = zzdztVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m6279a() {
        zzclb zzclbVar;
        zzfkn zzfknVar = this.f14173c;
        if (zzfknVar.f15909T) {
            zzbio zzbioVar = zzbix.f8562h6;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8612k6)).booleanValue() && (zzclbVar = this.f14174d) != null) {
                    if (this.f14176f != null) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Omid javascript session service already started for ad.");
                        return false;
                    }
                    Context context = this.f14171a;
                    com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
                    if (!zztVar.f3724x.m6274a(context)) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Unable to initialize omid.");
                        return false;
                    }
                    zzflj zzfljVar = zzfknVar.f15911V;
                    zzfljVar.getClass();
                    if (zzfljVar.f16062a.optBoolean((String) zzbaVar.f3098c.m5030a(zzbix.f8646m6), true)) {
                        final VersionInfoParcel versionInfoParcel = this.f14172b;
                        zzelp zzelpVar = zztVar.f3724x;
                        final WebView webViewMo5620y = zzclbVar.mo5620y();
                        zzelpVar.getClass();
                        zzfvg zzfvgVar = (zzfvg) zzelp.m6272i(new zzelo() { // from class: com.google.android.gms.internal.ads.zzelk
                            @Override // com.google.android.gms.internal.ads.zzelo
                            public final Object zza() {
                                VersionInfoParcel versionInfoParcel2 = versionInfoParcel;
                                int i4 = versionInfoParcel2.f3397t;
                                int i5 = versionInfoParcel2.f3398u;
                                StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 1 + String.valueOf(i5).length());
                                sb.append(i4);
                                sb.append(".");
                                sb.append(i5);
                                String string = sb.toString();
                                if (TextUtils.isEmpty("Google")) {
                                    throw new IllegalArgumentException("Name is null or empty");
                                }
                                if (TextUtils.isEmpty(string)) {
                                    throw new IllegalArgumentException("Version is null or empty");
                                }
                                return new zzfvg(new zzfvi("Google", string), webViewMo5620y);
                            }
                        });
                        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8629l6)).booleanValue()) {
                            zzdzt zzdztVar = this.f14175e;
                            String str = zzfvgVar != null ? "1" : "0";
                            zzdzs zzdzsVarM6111a = zzdztVar.m6111a();
                            zzdzsVarM6111a.m6107b("omid_js_session_success", str);
                            zzdzsVarM6111a.m6108c();
                        }
                        if (zzfvgVar == null) {
                            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Unable to create javascript session service.");
                            return false;
                        }
                        int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3072e("Created omid javascript session service.");
                        this.f14176f = zzfvgVar;
                        zzclbVar.mo5595b0(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6280b() {
        zzclb zzclbVar;
        try {
            zzfvg zzfvgVar = this.f14176f;
            if (zzfvgVar == null || (zzclbVar = this.f14174d) == null) {
                return;
            }
            ArrayList arrayListMo5617w = zzclbVar.mo5617w();
            int size = arrayListMo5617w.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListMo5617w.get(i2);
                i2++;
                com.google.android.gms.ads.internal.zzt.f3698C.f3724x.getClass();
                zzelp.m6273j(new zzelm(zzfvgVar, (View) obj));
            }
            zzclbVar.mo5129b("onSdkLoaded", zzgyt.f18367y);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m6281c() {
        zzclb zzclbVar;
        if (this.f14176f == null || (zzclbVar = this.f14174d) == null) {
            return;
        }
        zzclbVar.mo5129b("onSdkImpression", zzgyt.f18367y);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m6282d(View view) {
        zzfvg zzfvgVar = this.f14176f;
        if (zzfvgVar != null) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3724x.getClass();
            zzelp.m6273j(new zzelm(zzfvgVar, view));
        }
    }
}
