package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzedk implements com.google.android.gms.ads.internal.overlay.zzr, zzcmx {

    /* JADX INFO: renamed from: A */
    public boolean f13679A;

    /* JADX INFO: renamed from: s */
    public final Context f13680s;

    /* JADX INFO: renamed from: t */
    public final VersionInfoParcel f13681t;

    /* JADX INFO: renamed from: u */
    public zzecz f13682u;

    /* JADX INFO: renamed from: v */
    public zzclb f13683v;

    /* JADX INFO: renamed from: w */
    public boolean f13684w;

    /* JADX INFO: renamed from: x */
    public boolean f13685x;

    /* JADX INFO: renamed from: y */
    public long f13686y;

    /* JADX INFO: renamed from: z */
    public com.google.android.gms.ads.internal.client.zzdk f13687z;

    public zzedk(Context context, VersionInfoParcel versionInfoParcel) {
        this.f13680s = context;
        this.f13681t = versionInfoParcel;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: B1 */
    public final void mo3015B1() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: G0 */
    public final void mo3016G0() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: K1 */
    public final void mo3017K1() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: U2 */
    public final void mo3018U2() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: W1 */
    public final void mo3019W1() {
    }

    @Override // com.google.android.gms.internal.ads.zzcmx
    /* JADX INFO: renamed from: a */
    public final synchronized void mo3001a(int i2, String str, String str2, boolean z) {
        if (z) {
            com.google.android.gms.ads.internal.util.zze.m3150k("Ad inspector loaded.");
            this.f13684w = true;
            m6176c();
            return;
        }
        int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Ad inspector failed to load.");
        try {
            zzcfk zzcfkVar = com.google.android.gms.ads.internal.zzt.f3698C.f3708h;
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 46 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
            sb.append("Failed to load UI. Error code: ");
            sb.append(i2);
            sb.append(", Description: ");
            sb.append(str);
            sb.append(", Failing URL: ");
            sb.append(str2);
            zzcfkVar.m5384d("InspectorUi.onAdWebViewFinishedLoading 0", new Exception(sb.toString()));
            com.google.android.gms.ads.internal.client.zzdk zzdkVar = this.f13687z;
            if (zzdkVar != null) {
                zzdkVar.mo2910h0(zzfmi.m6535d(17, null, null));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("InspectorUi.onAdWebViewFinishedLoading 1", e);
        }
        this.f13679A = true;
        this.f13683v.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: a3 */
    public final void mo3020a3() {
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6175b(com.google.android.gms.ads.internal.client.zzdk zzdkVar, zzbqs zzbqsVar, zzbql zzbqlVar, zzbpy zzbpyVar) {
        if (m6177d(zzdkVar)) {
            try {
                com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
                zzclr zzclrVar = zztVar.f3704d;
                zzclb zzclbVarM5647a = zzclr.m5647a(this.f13680s, this.f13681t, null, null, null, zzbhw.m4893a(), null, new zzcnl(0, 0, 0), null, null, null, null, null, "", false, false);
                this.f13683v = zzclbVarM5647a;
                zzclm zzclmVarMo5582K = zzclbVarM5647a.mo5582K();
                if (zzclmVarMo5582K == null) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Failed to obtain a web view for the ad inspector");
                    try {
                        zztVar.f3708h.m5384d("InspectorUi.openInspector 2", new NullPointerException("Failed to obtain a web view for the ad inspector"));
                        zzdkVar.mo2910h0(zzfmi.m6535d(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("InspectorUi.openInspector 3", e);
                        return;
                    }
                }
                this.f13687z = zzdkVar;
                Context context = this.f13680s;
                zzclmVarMo5582K.m5640l(null, null, null, null, null, false, null, null, null, null, null, null, null, zzbqsVar, null, new zzbqr(context), zzbqlVar, zzbpyVar, null, null, null, null);
                zzclmVarMo5582K.f10450y = this;
                this.f13683v.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8633la));
                com.google.android.gms.ads.internal.overlay.zzn.m3014a(context, new AdOverlayInfoParcel(this, this.f13683v, this.f13681t), true, null);
                zztVar.f3711k.getClass();
                this.f13686y = System.currentTimeMillis();
            } catch (zzclq e2) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed to obtain a web view for the ad inspector", e2);
                try {
                    com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("InspectorUi.openInspector 0", e2);
                    zzdkVar.mo2910h0(zzfmi.m6535d(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e3) {
                    com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("InspectorUi.openInspector 1", e3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m6176c() {
        if (this.f13684w && this.f13685x) {
            ((zzcfx) zzcfy.f9951f).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedj
                @Override // java.lang.Runnable
                public final void run() {
                    JSONObject jSONObject;
                    JSONObject jSONObject2;
                    zzedk zzedkVar = this.f13678s;
                    zzclb zzclbVar = zzedkVar.f13683v;
                    zzecz zzeczVar = zzedkVar.f13682u;
                    synchronized (zzeczVar) {
                        try {
                            jSONObject = new JSONObject();
                            try {
                                jSONObject.put("platform", "ANDROID");
                                String str = zzeczVar.f13640k;
                                if (!TextUtils.isEmpty(str)) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                                    sb.append("afma-sdk-a-v");
                                    sb.append(str);
                                    jSONObject.put("sdkVersion", sb.toString());
                                }
                                jSONObject.put("internalSdkVersion", zzeczVar.f13638i);
                                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                                jSONObject.put("adapters", zzeczVar.f13633d.m6160a());
                                zzbio zzbioVar = zzbix.f8200La;
                                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                                    String str2 = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.f9895g;
                                    if (!TextUtils.isEmpty(str2)) {
                                        jSONObject.put("plugin", str2);
                                    }
                                }
                                long j2 = zzeczVar.f13646q;
                                com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
                                zztVar.f3711k.getClass();
                                if (j2 < System.currentTimeMillis() / 1000) {
                                    zzeczVar.f13644o = "{}";
                                }
                                jSONObject.put("networkExtras", zzeczVar.f13644o);
                                jSONObject.put("adSlots", zzeczVar.m6170i());
                                jSONObject.put("appInfo", zzeczVar.f13634e.m6154a());
                                String str3 = zztVar.f3708h.m5387g().zzi().f9877e;
                                if (!TextUtils.isEmpty(str3)) {
                                    jSONObject.put("cld", new JSONObject(str3));
                                }
                                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8013Aa)).booleanValue() && (jSONObject2 = zzeczVar.f13645p) != null) {
                                    String string = jSONObject2.toString();
                                    StringBuilder sb2 = new StringBuilder(string.length() + 13);
                                    sb2.append("Server data: ");
                                    sb2.append(string);
                                    String string2 = sb2.toString();
                                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                    com.google.android.gms.ads.internal.util.client.zzo.m3068a(string2);
                                    jSONObject.put("serverData", zzeczVar.f13645p);
                                }
                                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8871za)).booleanValue()) {
                                    jSONObject.put("openAction", zzeczVar.f13651v);
                                    jSONObject.put("gesture", zzeczVar.f13647r);
                                }
                                jSONObject.put("isGamRegisteredTestDevice", zztVar.f3715o.m3102g());
                                com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a;
                                jSONObject.put("isSimulator", com.google.android.gms.ads.internal.util.client.zzf.m3042s());
                                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8234Na)).booleanValue()) {
                                    jSONObject.put("uiStorage", new JSONObject(zzeczVar.f13653x));
                                }
                                if (!TextUtils.isEmpty((CharSequence) zzbaVar.f3098c.m5030a(zzbix.f8268Pa))) {
                                    jSONObject.put("gmaDisk", zzeczVar.f13637h.f13675a);
                                }
                                if (!TextUtils.isEmpty((CharSequence) zzbaVar.f3098c.m5030a(zzbix.f8251Oa))) {
                                    jSONObject.put("userDisk", zzeczVar.f13636g.f13675a);
                                }
                            } catch (JSONException e) {
                                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("Inspector.toJson", e);
                                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Ad inspector encountered an error", e);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    zzclbVar.mo5130d("window.inspectorInfo", jSONObject.toString());
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: c1 */
    public final synchronized void mo3021c1(int i2) {
        this.f13683v.destroy();
        if (!this.f13679A) {
            com.google.android.gms.ads.internal.util.zze.m3150k("Inspector closed.");
            com.google.android.gms.ads.internal.client.zzdk zzdkVar = this.f13687z;
            if (zzdkVar != null) {
                try {
                    zzdkVar.mo2910h0(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f13685x = false;
        this.f13684w = false;
        this.f13686y = 0L;
        this.f13679A = false;
        this.f13687z = null;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m6177d(com.google.android.gms.ads.internal.client.zzdk zzdkVar) {
        zzbio zzbioVar = zzbix.f8616ka;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Ad inspector had an internal error.");
            try {
                zzdkVar.mo2910h0(zzfmi.m6535d(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f13682u == null) {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Ad inspector had an internal error.");
            try {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("InspectorUi.shouldOpenUi", new NullPointerException("InspectorManager null"));
                zzdkVar.mo2910h0(zzfmi.m6535d(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f13684w && !this.f13685x) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            if (System.currentTimeMillis() >= this.f13686y + ((long) ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8667na)).intValue())) {
                return true;
            }
        }
        int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Ad inspector cannot be opened because it is already open.");
        try {
            zzdkVar.mo2910h0(zzfmi.m6535d(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: d2 */
    public final void mo3022d2() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: s1 */
    public final void mo3023s1() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: u0 */
    public final void mo3024u0() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzh() {
        this.f13685x = true;
        m6176c();
    }
}
