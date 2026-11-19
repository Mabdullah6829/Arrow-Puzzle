package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbum;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzbut;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzcgb;
import com.google.android.gms.internal.ads.zzcgd;
import com.google.android.gms.internal.ads.zzdzs;
import com.google.android.gms.internal.ads.zzdzt;
import com.google.android.gms.internal.ads.zzfqg;
import com.google.android.gms.internal.ads.zzfqt;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhcf;
import com.google.android.gms.internal.ads.zzhcp;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzf {

    /* JADX INFO: renamed from: a */
    public Context f3651a;

    /* JADX INFO: renamed from: b */
    public long f3652b = 0;

    /* JADX INFO: renamed from: b */
    public static final void m3249b(zzdzt zzdztVar, String str, long j2) {
        if (zzdztVar != null) {
            if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8519ee)).booleanValue()) {
                zzdzs zzdzsVarM6111a = zzdztVar.m6111a();
                zzdzsVarM6111a.m6107b("action", "lat_init");
                zzdzsVarM6111a.m6107b(str, Long.toString(j2));
                zzdzsVarM6111a.m6108c();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3250a(Context context, VersionInfoParcel versionInfoParcel, boolean z, zzcff zzcffVar, String str, String str2, Runnable runnable, final zzfqt zzfqtVar, final zzdzt zzdztVar, final Long l2, boolean z2) {
        PackageInfo packageInfoM3663b;
        zzt zztVar = zzt.f3698C;
        DefaultClock defaultClock = zztVar.f3711k;
        DefaultClock defaultClock2 = zztVar.f3711k;
        defaultClock.getClass();
        if (SystemClock.elapsedRealtime() - this.f3652b < 5000) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Not retrying to fetch app settings");
            return;
        }
        defaultClock2.getClass();
        this.f3652b = SystemClock.elapsedRealtime();
        if (zzcffVar != null && !TextUtils.isEmpty(zzcffVar.f9877e)) {
            long j2 = zzcffVar.f9878f;
            defaultClock2.getClass();
            if (System.currentTimeMillis() - j2 <= ((Long) zzba.f3095e.f3098c.m5030a(zzbix.f8442a5)).longValue() && zzcffVar.f9880h) {
                return;
            }
        }
        if (context == null) {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f3651a = applicationContext;
        final zzfqg zzfqgVarM6562l = zzfqg.m6562l(context, 4);
        zzfqgVarM6562l.zza();
        zzbup zzbupVarM5145b = zztVar.f3718r.m5145b(this.f3651a, versionInfoParcel, zzfqtVar);
        zzbuj zzbujVar = zzbum.f9398a;
        zzbut zzbutVarM5148a = zzbupVarM5145b.m5148a("google.afma.config.fetchAppSettings", zzbujVar, zzbujVar);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            zzbio zzbioVar = zzbix.f8436a;
            zzba zzbaVar = zzba.f3095e;
            jSONObject.put("experiment_ids", TextUtils.join(",", zzbaVar.f3096a.m5023a()));
            jSONObject.put("js", versionInfoParcel.f3396s);
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8285Qa)).booleanValue()) {
                jSONObject.put("inspector_enabled", z2);
            }
            try {
                ApplicationInfo applicationInfo = this.f3651a.getApplicationInfo();
                if (applicationInfo != null && (packageInfoM3663b = Wrappers.m3665a(context).m3663b(0, applicationInfo.packageName)) != null) {
                    jSONObject.put("version", packageInfoM3663b.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.m3150k("Error fetching PackageInfo.");
            }
            ListenableFuture listenableFutureM5149a = zzbutVarM5148a.m5149a(jSONObject);
            zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.ads.internal.zzd
                @Override // com.google.android.gms.internal.ads.zzhbn
                /* JADX INFO: renamed from: b */
                public final ListenableFuture mo3248b(Object obj) throws JSONException {
                    Long l3 = l2;
                    zzdzt zzdztVar2 = zzdztVar;
                    zzfqg zzfqgVar = zzfqgVarM6562l;
                    zzfqt zzfqtVar2 = zzfqtVar;
                    JSONObject jSONObject2 = (JSONObject) obj;
                    int i5 = 0;
                    boolean zOptBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (zOptBoolean) {
                        String string = jSONObject2.getString("appSettingsJson");
                        zzt zztVar2 = zzt.f3698C;
                        com.google.android.gms.ads.internal.util.zzj zzjVarM5387g = zztVar2.f3708h.m5387g();
                        zzjVarM5387g.m3180e();
                        synchronized (zzjVarM5387g.f3585a) {
                            try {
                                zztVar2.f3711k.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                if (string == null || string.equals(zzjVarM5387g.f3598n.f9877e)) {
                                    zzjVarM5387g.f3598n.f9878f = jCurrentTimeMillis;
                                } else {
                                    zzjVarM5387g.f3598n = new zzcff(string, jCurrentTimeMillis);
                                    SharedPreferences.Editor editor = zzjVarM5387g.f3591g;
                                    if (editor != null) {
                                        editor.putString("app_settings_json", string);
                                        zzjVarM5387g.f3591g.putLong("app_settings_last_update_ms", jCurrentTimeMillis);
                                        zzjVarM5387g.f3591g.apply();
                                    }
                                    zzjVarM5387g.m3181f();
                                    ArrayList arrayList = zzjVarM5387g.f3587c;
                                    int size = arrayList.size();
                                    while (i5 < size) {
                                        Object obj2 = arrayList.get(i5);
                                        i5++;
                                        ((Runnable) obj2).run();
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (l3 != null) {
                            zzt.f3698C.f3711k.getClass();
                            zzf.m3249b(zzdztVar2, "cld_s", SystemClock.elapsedRealtime() - l3.longValue());
                        }
                    }
                    String strOptString = jSONObject2.optString("errorReason", "");
                    if (!TextUtils.isEmpty(strOptString)) {
                        zzfqgVar.mo6565g(strOptString);
                    }
                    zzfqgVar.mo6563L(zOptBoolean);
                    zzfqtVar2.m6588b(zzfqgVar.mo6564e());
                    return zzhcf.m7367a(null);
                }
            };
            zzhcp zzhcpVar = zzcfy.f9953h;
            ListenableFuture listenableFutureM7374h = zzhcf.m7374h(listenableFutureM5149a, zzhbnVar, zzhcpVar);
            if (runnable != null) {
                ((zzcgd) listenableFutureM5149a).addListener(runnable, zzhcpVar);
            }
            if (l2 != null) {
                ((zzcgd) listenableFutureM5149a).addListener(new Runnable() { // from class: com.google.android.gms.ads.internal.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzt.f3698C.f3711k.getClass();
                        zzf.m3249b(zzdztVar, "cld_r", SystemClock.elapsedRealtime() - l2.longValue());
                    }
                }, zzhcpVar);
            }
            if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8062D8)).booleanValue()) {
                zzcgb.m5395b(listenableFutureM7374h, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                zzcgb.m5394a(listenableFutureM7374h, "ConfigLoader.maybeFetchNewAppSettings", zzhcpVar);
            }
        } catch (Exception e) {
            int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error requesting application settings", e);
            zzfqgVarM6562l.mo6566h(e);
            zzfqgVarM6562l.mo6563L(false);
            zzfqtVar.m6588b(zzfqgVarM6562l.mo6564e());
        }
    }
}
