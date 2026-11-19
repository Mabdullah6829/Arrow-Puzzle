package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzciv implements zzbpx {

    /* JADX INFO: renamed from: a */
    public boolean f10176a;

    /* JADX INFO: renamed from: b */
    public static int m5501b(Context context, Map map, String str, int i2) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a;
                i2 = com.google.android.gms.ads.internal.util.client.zzf.m3033b(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                String strM2451r = AbstractC1456a.m2451r(new StringBuilder(str.length() + 34 + str2.length()), "Could not parse ", str, " in a video GMSG: ", str2);
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f(strM2451r);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.m3152m()) {
            int length = str.length();
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + length + 30 + String.valueOf(str2).length() + 6 + 1);
            AbstractC0271e0.m413u(sb, "Parse pixels for ", str, ", got string ", str2);
            sb.append(", int ");
            sb.append(i2);
            sb.append(".");
            com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
        }
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public static void m5502c(zzchi zzchiVar, Map map) {
        zzcha zzchaVar = zzchiVar.f10031y;
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                int i2 = Integer.parseInt(str);
                if (zzchaVar != null) {
                    zzchaVar.mo5426B(i2);
                }
            } catch (NumberFormatException unused) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not parse buffer parameters in loadControl video GMSG: (" + str + ", " + str2 + ")");
                return;
            }
        }
        if (str2 != null) {
            int i4 = Integer.parseInt(str2);
            if (zzchaVar != null) {
                zzchaVar.mo5427C(i4);
            }
        }
        if (str3 != null) {
            int i5 = Integer.parseInt(str3);
            if (zzchaVar != null) {
                zzchaVar.mo5428e(i5);
            }
        }
        if (str4 != null) {
            int i6 = Integer.parseInt(str4);
            if (zzchaVar != null) {
                zzchaVar.mo5429g(i6);
            }
        }
        if (str5 != null) {
            int i7 = Integer.parseInt(str5);
            if (zzchaVar == null) {
                return;
            }
            zzchaVar.mo5430h(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        int iMin;
        int iMin2;
        int i2;
        Integer numValueOf;
        boolean z;
        int i3;
        zzchi zzchiVar;
        zzcha zzchaVar;
        zzchu zzchuVar = (zzchu) obj;
        String str = (String) map.get("action");
        if (str == null) {
            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numMo5431z = (zzchuVar.mo5467U() == null || (zzchiVar = zzchuVar.mo5467U().f10037e) == null || (zzchaVar = zzchiVar.f10031y) == null) ? null : zzchaVar.mo5431z();
        if (numValueOf2 != null && numMo5431z != null && !numValueOf2.equals(numMo5431z) && !str.equals("load")) {
            Locale locale = Locale.US;
            int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3072e("Event intended for player " + numValueOf2 + ", but sent to player " + numMo5431z + " - event ignored");
            return;
        }
        if (com.google.android.gms.ads.internal.util.client.zzo.m3077j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String string = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str.length() + 13 + String.valueOf(string).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(string);
            com.google.android.gms.ads.internal.util.client.zzo.m3068a(sb.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get(TypedValues.Custom.S_COLOR);
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzchuVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get(TypedValues.Custom.S_COLOR);
            if (TextUtils.isEmpty(str3)) {
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzchuVar.mo5468X(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
                map2.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "missingMimeTypes");
                zzchuVar.mo5129b("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            for (String str5 : str4.split(",")) {
                map3.put(str5, com.google.android.gms.ads.internal.util.zzch.m3146a(str5.trim()));
            }
            HashMap map4 = new HashMap();
            map4.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
            map4.put("mimeTypes", map3);
            zzchuVar.mo5129b("onVideoEvent", map4);
            return;
        }
        zzchj zzchjVarMo5467U = zzchuVar.mo5467U();
        if (zzchjVarMo5467U == null) {
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals("position");
        if (zEquals || zEquals2) {
            Context context = zzchuVar.getContext();
            int iM5501b = m5501b(context, map, "x", 0);
            int iM5501b2 = m5501b(context, map, "y", 0);
            int iM5501b3 = m5501b(context, map, "w", -1);
            zzbio zzbioVar = zzbix.f8177K4;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                iMin = iM5501b3 == -1 ? zzchuVar.mo5474l() : Math.min(iM5501b3, zzchuVar.mo5474l());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.m3152m()) {
                    int iMo5474l = zzchuVar.mo5474l();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iM5501b).length() + AbstractC1456a.m2438e(String.valueOf(iM5501b3).length() + 72, 4, String.valueOf(iMo5474l)) + 1);
                    sb2.append("Calculate width with original width ");
                    sb2.append(iM5501b3);
                    sb2.append(", videoHost.getVideoBoundingWidth() ");
                    sb2.append(iMo5474l);
                    sb2.append(", x ");
                    sb2.append(iM5501b);
                    sb2.append(".");
                    com.google.android.gms.ads.internal.util.zze.m3150k(sb2.toString());
                }
                iMin = Math.min(iM5501b3, zzchuVar.mo5474l() - iM5501b);
            }
            int iM5501b4 = m5501b(context, map, "h", -1);
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                iMin2 = iM5501b4 == -1 ? zzchuVar.mo5477s() : Math.min(iM5501b4, zzchuVar.mo5477s());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.m3152m()) {
                    int iMo5477s = zzchuVar.mo5477s();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iM5501b2).length() + AbstractC1456a.m2438e(String.valueOf(iM5501b4).length() + 75, 4, String.valueOf(iMo5477s)) + 1);
                    sb3.append("Calculate height with original height ");
                    sb3.append(iM5501b4);
                    sb3.append(", videoHost.getVideoBoundingHeight() ");
                    sb3.append(iMo5477s);
                    sb3.append(", y ");
                    sb3.append(iM5501b2);
                    sb3.append(".");
                    com.google.android.gms.ads.internal.util.zze.m3150k(sb3.toString());
                }
                iMin2 = Math.min(iM5501b4, zzchuVar.mo5477s() - iM5501b2);
            }
            try {
                i2 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i2 = 0;
            }
            boolean z2 = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || zzchjVarMo5467U.f10037e != null) {
                Preconditions.m3540d("The underlay may only be modified from the UI thread.");
                zzchi zzchiVar2 = zzchjVarMo5467U.f10037e;
                if (zzchiVar2 != null) {
                    zzchiVar2.m5445n(iM5501b, iM5501b2, iMin, iMin2);
                    return;
                }
                return;
            }
            zzcht zzchtVar = new zzcht((String) map.get("flags"));
            if (zzchjVarMo5467U.f10037e == null) {
                zzclx zzclxVar = zzchjVarMo5467U.f10034b;
                zzbje.m5038a(((zzcme) zzclxVar.f10483s).mo5599f().f8899b, ((zzcme) zzclxVar.f10483s).zzi(), "vpr2");
                zzchi zzchiVar3 = new zzchi(zzchjVarMo5467U.f10033a, zzclxVar, i2, z2, ((zzcme) zzclxVar.f10483s).mo5599f().f8899b, zzchtVar, zzchjVarMo5467U.f10036d);
                zzchjVarMo5467U.f10037e = zzchiVar3;
                zzchjVarMo5467U.f10035c.addView(zzchiVar3, 0, new ViewGroup.LayoutParams(-1, -1));
                zzchjVarMo5467U.f10037e.m5445n(iM5501b, iM5501b2, iMin, iMin2);
                ((zzcme) zzclxVar.f10483s).f10505F.f10421D = false;
            }
            zzchi zzchiVar4 = zzchjVarMo5467U.f10037e;
            if (zzchiVar4 != null) {
                m5502c(zzchiVar4, map);
                return;
            }
            return;
        }
        zzcmh zzcmhVarZzh = zzchuVar.zzh();
        if (zzcmhVarZzh != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    float f2 = Float.parseFloat(str6);
                    synchronized (zzcmhVarZzh.f10565t) {
                        zzcmhVarZzh.f10559B = f2;
                    }
                    return;
                } catch (NumberFormatException unused4) {
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                synchronized (zzcmhVarZzh.f10565t) {
                    z = zzcmhVarZzh.f10571z;
                    i3 = zzcmhVarZzh.f10568w;
                    zzcmhVarZzh.f10568w = 3;
                }
                ((zzcfx) zzcfy.f9951f).execute(new zzcmf(zzcmhVarZzh, i3, 3, z, z));
                return;
            }
        }
        zzchi zzchiVar5 = zzchjVarMo5467U.f10037e;
        if (zzchiVar5 == null) {
            HashMap map5 = new HashMap();
            map5.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
            zzchuVar.mo5129b("onVideoEvent", map5);
            return;
        }
        if (str.equals("click")) {
            Context context2 = zzchuVar.getContext();
            int iM5501b5 = m5501b(context2, map, "x", 0);
            float fM5501b = m5501b(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iM5501b5, fM5501b, 0);
            zzcha zzchaVar2 = zzchiVar5.f10031y;
            if (zzchaVar2 != null) {
                zzchaVar2.dispatchTouchEvent(motionEventObtain);
            }
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                int i6 = (int) (Float.parseFloat(str7) * 1000.0f);
                zzcha zzchaVar3 = zzchiVar5.f10031y;
                if (zzchaVar3 == null) {
                    return;
                }
                zzchaVar3.mo5417q(i6);
                return;
            } catch (NumberFormatException unused5) {
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            zzchiVar5.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            zzchiVar5.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            zzcha zzchaVar4 = zzchiVar5.f10031y;
            if (zzchaVar4 == null) {
                return;
            }
            if (TextUtils.isEmpty(zzchiVar5.f10020F)) {
                zzchiVar5.m5434c("no_src", new String[0]);
                return;
            } else {
                zzchaVar4.mo5425A(zzchiVar5.f10020F, zzchiVar5.f10021G, numValueOf2);
                return;
            }
        }
        if (str.equals("loadControl")) {
            m5502c(zzchiVar5, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzcha zzchaVar5 = zzchiVar5.f10031y;
                if (zzchaVar5 == null) {
                    return;
                }
                zzchy zzchyVar = zzchaVar5.f10006t;
                zzchyVar.f10118e = true;
                zzchyVar.m5485a();
                zzchaVar5.mo5408f();
                return;
            }
            zzcha zzchaVar6 = zzchiVar5.f10031y;
            if (zzchaVar6 == null) {
                return;
            }
            zzchy zzchyVar2 = zzchaVar6.f10006t;
            zzchyVar2.f10118e = false;
            zzchyVar2.m5485a();
            zzchaVar6.mo5408f();
            return;
        }
        if (str.equals("pause")) {
            zzcha zzchaVar7 = zzchiVar5.f10031y;
            if (zzchaVar7 == null) {
                return;
            }
            zzchaVar7.mo5414n();
            return;
        }
        if (str.equals("play")) {
            zzcha zzchaVar8 = zzchiVar5.f10031y;
            if (zzchaVar8 == null) {
                return;
            }
            zzchaVar8.mo5413m();
            return;
        }
        if (str.equals("show")) {
            zzchiVar5.setVisibility(0);
            return;
        }
        if (!str.equals("src")) {
            if (str.equals("touchMove")) {
                Context context3 = zzchuVar.getContext();
                int iM5501b6 = m5501b(context3, map, "dx", 0);
                int iM5501b7 = m5501b(context3, map, "dy", 0);
                float f3 = iM5501b6;
                float f4 = iM5501b7;
                zzcha zzchaVar9 = zzchiVar5.f10031y;
                if (zzchaVar9 != null) {
                    zzchaVar9.mo5418r(f3, f4);
                }
                if (this.f10176a) {
                    return;
                }
                zzchuVar.zzl();
                this.f10176a = true;
                return;
            }
            if (!str.equals("volume")) {
                if (str.equals("watermark")) {
                    zzchiVar5.m5432a();
                    return;
                } else {
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Unknown video action: ".concat(str));
                    return;
                }
            }
            String str8 = (String) map.get("volume");
            if (str8 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                float f5 = Float.parseFloat(str8);
                zzcha zzchaVar10 = zzchiVar5.f10031y;
                if (zzchaVar10 == null) {
                    return;
                }
                zzchy zzchyVar3 = zzchaVar10.f10006t;
                zzchyVar3.f10119f = f5;
                zzchyVar3.m5485a();
                zzchaVar10.mo5408f();
                return;
            } catch (NumberFormatException unused6) {
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not parse volume parameter from volume video GMSG: ".concat(str8));
                return;
            }
        }
        String str9 = (String) map.get("src");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8141I2)).booleanValue() && TextUtils.isEmpty(str9)) {
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Src parameter missing from src video GMSG.");
            return;
        }
        if (map.containsKey("periodicReportIntervalMs")) {
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
            } catch (NumberFormatException unused7) {
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        String[] strArr = {str9};
        String str10 = (String) map.get("demuxed");
        if (str10 != null) {
            try {
                JSONArray jSONArray = new JSONArray(str10);
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    String string2 = jSONArray.getString(i7);
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8141I2)).booleanValue() || !TextUtils.isEmpty(string2)) {
                        arrayList.add(string2);
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8141I2)).booleanValue() && arrayList.isEmpty()) {
                    StringBuilder sb4 = new StringBuilder(str10.length() + 41);
                    sb4.append("All demuxed URLs are empty for playback: ");
                    sb4.append(str10);
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb4.toString());
                    return;
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (JSONException unused8) {
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Malformed demuxed URL list for playback: ".concat(str10));
                strArr = new String[]{str9};
            }
        }
        if (numValueOf != null) {
            zzchuVar.mo5479v(numValueOf.intValue());
        }
        zzchiVar5.f10020F = str9;
        zzchiVar5.f10021G = strArr;
    }
}
