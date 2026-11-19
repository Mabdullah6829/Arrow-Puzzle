package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcji implements zzbpx {
    /* JADX INFO: renamed from: b */
    public static final Integer m5515b(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = (String) map.get(str);
            String strM2451r = AbstractC1456a.m2451r(new StringBuilder(str.length() + 39 + String.valueOf(str2).length()), "Precache invalid numeric parameter '", str, "': ", str2);
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f(strM2451r);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        zzcjh zzcjhVar;
        zzciz zzcizVar;
        zzcjk zzcjkVar;
        zzcjh zzcjnVar;
        zzchu zzchuVar = (zzchu) obj;
        if (com.google.android.gms.ads.internal.util.client.zzo.m3077j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcja zzcjaVar = com.google.android.gms.ads.internal.zzt.f3698C.f3699A;
        if (map.containsKey("abort")) {
            if (zzcjaVar.m5504a(zzchuVar)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numM5515b = m5515b("periodicReportIntervalMs", map);
        m5515b("exoPlayerRenderingIntervalMs", map);
        m5515b("exoPlayerIdleIntervalMs", map);
        zzcht zzchtVar = new zzcht((String) map.get("flags"));
        boolean z = zzchtVar.f10090k;
        zzciz zzcizVar2 = null;
        int i2 = 0;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        strArr2[i3] = jSONArray.getString(i3);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z) {
                ArrayList arrayList = zzcjaVar.f10184s;
                int size = arrayList.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        zzcizVar = null;
                        break;
                    }
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    zzcizVar = (zzciz) obj2;
                    if (zzcizVar.f10179b == zzchuVar && str.equals(zzcizVar.f10181d)) {
                        break;
                    }
                }
            } else {
                ArrayList arrayList2 = zzcjaVar.f10184s;
                int size2 = arrayList2.size();
                int i5 = 0;
                do {
                    if (i5 >= size2) {
                        zzcizVar = null;
                        break;
                    } else {
                        Object obj3 = arrayList2.get(i5);
                        i5++;
                        zzcizVar = (zzciz) obj3;
                    }
                } while (zzcizVar.f10179b != zzchuVar);
            }
            if (zzcizVar != null) {
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Precache task is already running.");
                return;
            }
            if (zzchuVar.zzk() == null) {
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Precache requires a dependency provider.");
                return;
            }
            Integer numM5515b2 = m5515b("player", map);
            if (numM5515b2 == null) {
                numM5515b2 = 0;
            }
            if (numM5515b != null) {
                zzchuVar.mo5479v(numM5515b.intValue());
            }
            int iIntValue = numM5515b2.intValue();
            zzcir zzcirVar = zzchuVar.zzk().f3640b;
            if (iIntValue > 0) {
                int i6 = zzchtVar.f10086g;
                int i7 = zzchl.f10039t.get();
                if (i7 < i6) {
                    zzcjq zzcjqVar = new zzcjq(zzchuVar);
                    zzckj zzckjVar = new zzckj(zzchuVar.getContext(), zzchtVar, (zzchu) zzcjqVar.f10226u.get(), null);
                    int i8 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3072e("ExoPlayerAdapter initialized.");
                    zzcjqVar.f10252v = zzckjVar;
                    zzckjVar.f10334D = zzcjqVar;
                    zzcjnVar = zzcjqVar;
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8741s)).booleanValue()) {
                        i7 = zzcjn.f10234G.get();
                    }
                    zzcjnVar = i7 < zzchtVar.f10081b ? new zzcjn(zzchuVar, zzchtVar) : new zzcjl(zzchuVar);
                }
            } else {
                zzcjkVar = new zzcjk(zzchuVar);
                File cacheDir = zzcjkVar.f10224s.getCacheDir();
                if (cacheDir == null) {
                    int i9 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Context.getCacheDir() returned null");
                    zzcjnVar = zzcjkVar;
                } else {
                    zzfzu.f16872a.getClass();
                    File file = new File(zzfzv.m6833a(cacheDir, "admobVideoStreams"));
                    zzcjkVar.f10230v = file;
                    if (!file.isDirectory() && !file.mkdirs()) {
                        String strValueOf = String.valueOf(file.getAbsolutePath());
                        int i10 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not create preload cache directory at ".concat(strValueOf));
                        zzcjkVar.f10230v = null;
                        zzcjnVar = zzcjkVar;
                    } else if (!file.setReadable(true, false) || !file.setExecutable(true, false)) {
                        zzcjnVar = zzcjkVar;
                        String strValueOf2 = String.valueOf(file.getAbsolutePath());
                        int i11 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not set cache file permissions at ".concat(strValueOf2));
                        zzcjkVar.f10230v = null;
                        zzcjnVar = zzcjkVar;
                    }
                }
            }
            zzcjnVar = zzcjkVar;
            new zzciz(zzchuVar, zzcjnVar, str, strArr).mo3108b();
            zzcjhVar = zzcjnVar;
        } else {
            ArrayList arrayList3 = zzcjaVar.f10184s;
            int size3 = arrayList3.size();
            while (i2 < size3) {
                Object obj4 = arrayList3.get(i2);
                i2++;
                zzciz zzcizVar3 = (zzciz) obj4;
                if (zzcizVar3.f10179b == zzchuVar) {
                    zzcizVar2 = zzcizVar3;
                    break;
                }
            }
            if (zzcizVar2 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Precache must specify a source.");
                return;
            }
            zzcjhVar = zzcizVar2.f10180c;
        }
        Integer numM5515b3 = m5515b("minBufferMs", map);
        if (numM5515b3 != null) {
            zzcjhVar.mo5509l(numM5515b3.intValue());
        }
        Integer numM5515b4 = m5515b("maxBufferMs", map);
        if (numM5515b4 != null) {
            zzcjhVar.mo5508j(numM5515b4.intValue());
        }
        Integer numM5515b5 = m5515b("bufferForPlaybackMs", map);
        if (numM5515b5 != null) {
            zzcjhVar.mo5510m(numM5515b5.intValue());
        }
        Integer numM5515b6 = m5515b("bufferForPlaybackAfterRebufferMs", map);
        if (numM5515b6 != null) {
            zzcjhVar.mo5511n(numM5515b6.intValue());
        }
    }
}
