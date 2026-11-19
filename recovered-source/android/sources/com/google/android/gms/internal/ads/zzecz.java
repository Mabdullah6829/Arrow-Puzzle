package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzecz implements zzeeb, zzeck {

    /* JADX INFO: renamed from: a */
    public final zzedk f13630a;

    /* JADX INFO: renamed from: b */
    public final zzeec f13631b;

    /* JADX INFO: renamed from: c */
    public final zzecl f13632c;

    /* JADX INFO: renamed from: d */
    public final zzecu f13633d;

    /* JADX INFO: renamed from: e */
    public final zzecj f13634e;

    /* JADX INFO: renamed from: f */
    public final zzedw f13635f;

    /* JADX INFO: renamed from: g */
    public final zzedg f13636g;

    /* JADX INFO: renamed from: h */
    public final zzedg f13637h;

    /* JADX INFO: renamed from: i */
    public final String f13638i;

    /* JADX INFO: renamed from: j */
    public final Context f13639j;

    /* JADX INFO: renamed from: k */
    public final String f13640k;

    /* JADX INFO: renamed from: p */
    public JSONObject f13645p;

    /* JADX INFO: renamed from: s */
    public boolean f13648s;

    /* JADX INFO: renamed from: t */
    public int f13649t;

    /* JADX INFO: renamed from: u */
    public boolean f13650u;

    /* JADX INFO: renamed from: l */
    public final HashMap f13641l = new HashMap();

    /* JADX INFO: renamed from: m */
    public final HashMap f13642m = new HashMap();

    /* JADX INFO: renamed from: n */
    public final HashMap f13643n = new HashMap();

    /* JADX INFO: renamed from: o */
    public String f13644o = "{}";

    /* JADX INFO: renamed from: q */
    public long f13646q = LocationRequestCompat.PASSIVE_INTERVAL;

    /* JADX INFO: renamed from: r */
    public zzecv f13647r = zzecv.f13621s;

    /* JADX INFO: renamed from: v */
    public zzecy f13651v = zzecy.f13625s;

    /* JADX INFO: renamed from: w */
    public long f13652w = 0;

    /* JADX INFO: renamed from: x */
    public String f13653x = "";

    public zzecz(zzedk zzedkVar, zzeec zzeecVar, zzecl zzeclVar, Context context, VersionInfoParcel versionInfoParcel, zzecu zzecuVar, zzedw zzedwVar, zzedg zzedgVar, zzedg zzedgVar2, String str) {
        this.f13630a = zzedkVar;
        this.f13631b = zzeecVar;
        this.f13632c = zzeclVar;
        this.f13634e = new zzecj(context);
        this.f13638i = versionInfoParcel.f3396s;
        this.f13640k = str;
        this.f13633d = zzecuVar;
        this.f13635f = zzedwVar;
        this.f13636g = zzedgVar;
        this.f13637h = zzedgVar2;
        this.f13639j = context;
        com.google.android.gms.ads.internal.zzt.f3698C.f3715o.f3506g = this;
    }

    /* JADX INFO: renamed from: a */
    public final void m6162a() {
        String str;
        boolean z;
        zzbio zzbioVar = zzbix.f8616ka;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8871za)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzj zzjVarM5387g = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g();
                zzjVarM5387g.m3180e();
                synchronized (zzjVarM5387g.f3585a) {
                    z = zzjVarM5387g.f3609y;
                }
                if (z) {
                    m6171j();
                    return;
                }
            }
            com.google.android.gms.ads.internal.util.zzj zzjVarM5387g2 = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g();
            zzjVarM5387g2.m3180e();
            synchronized (zzjVarM5387g2.f3585a) {
                str = zzjVarM5387g2.f3608x;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                if (new JSONObject(str).optBoolean("isTestMode", false)) {
                    m6171j();
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6163b(boolean z) {
        if (!this.f13650u && z) {
            m6171j();
        }
        m6168g(z, true);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m6164c(String str, zzecn zzecnVar) {
        zzbio zzbioVar = zzbix.f8616ka;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && m6167f()) {
            if (this.f13649t >= ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8650ma)).intValue()) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            HashMap map = this.f13641l;
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList());
            }
            this.f13649t++;
            ((List) map.get(str)).add(zzecnVar);
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8149Ia)).booleanValue()) {
                String str2 = zzecnVar.f13596u;
                this.f13642m.put(str2, zzecnVar);
                HashMap map2 = this.f13643n;
                if (map2.containsKey(str2)) {
                    List list = (List) map2.get(str2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zzcgd) it.next()).m5397a(zzecnVar);
                    }
                    list.clear();
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized zzcgd m6165d(String str) {
        zzcgd zzcgdVar;
        try {
            zzcgdVar = new zzcgd();
            HashMap map = this.f13642m;
            if (map.containsKey(str)) {
                zzcgdVar.m5397a((zzecn) map.get(str));
            } else {
                HashMap map2 = this.f13643n;
                if (!map2.containsKey(str)) {
                    map2.put(str, new ArrayList());
                }
                ((List) map2.get(str)).add(zzcgdVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzcgdVar;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m6166e(com.google.android.gms.ads.internal.client.zzdk zzdkVar, zzecy zzecyVar) {
        if (!m6167f()) {
            try {
                zzdkVar.mo2910h0(zzfmi.m6535d(18, null, null));
                return;
            } catch (RemoteException unused) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8616ka)).booleanValue()) {
            this.f13651v = zzecyVar;
            this.f13630a.m6175b(zzdkVar, new zzbqs(this), new zzbql(this.f13635f), new zzbpy(this));
            return;
        } else {
            try {
                zzdkVar.mo2910h0(zzfmi.m6535d(1, null, null));
                return;
            } catch (RemoteException unused2) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Ad inspector had an internal error.");
                return;
            }
        }
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized boolean m6167f() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8871za)).booleanValue()) {
            return this.f13648s || com.google.android.gms.ads.internal.zzt.f3698C.f3715o.m3102g();
        }
        return this.f13648s;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0033 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /* JADX INFO: renamed from: g */
    public final synchronized void m6168g(boolean z, boolean z2) {
        try {
            if (this.f13648s != z) {
                this.f13648s = z;
                if (z) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8871za)).booleanValue() || !com.google.android.gms.ads.internal.zzt.f3698C.f3715o.m3102g()) {
                        m6172k();
                    } else if (!m6167f()) {
                        m6173l();
                    }
                } else if (!m6167f()) {
                    m6173l();
                }
                if (z2) {
                    m6174m();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m6169h(zzecv zzecvVar, boolean z) {
        try {
            if (this.f13647r != zzecvVar) {
                if (m6167f()) {
                    m6173l();
                }
                this.f13647r = zzecvVar;
                if (m6167f()) {
                    m6172k();
                }
                if (z) {
                    m6174m();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized JSONObject m6170i() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.f13641l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (zzecn zzecnVar : (List) entry.getValue()) {
                    if (zzecnVar.f13598w != zzecm.f13583s) {
                        jSONArray.put(zzecnVar.m6157a());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: j */
    public final void m6171j() {
        String str;
        String str2;
        this.f13650u = true;
        zzecu zzecuVar = this.f13633d;
        zzecuVar.getClass();
        zzecs zzecsVar = new zzecs(zzecuVar);
        zzece zzeceVar = zzecuVar.f13616a;
        zzeceVar.getClass();
        zzeceVar.f13544e.addListener(new zzecd(zzeceVar, zzecsVar), zzeceVar.f13549j);
        this.f13630a.f13682u = this;
        this.f13631b.f13728f = this;
        this.f13632c.f13581i = this;
        this.f13635f.f13711x = this;
        zzbio zzbioVar = zzbix.f8251Oa;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (!TextUtils.isEmpty((CharSequence) zzbaVar.f3098c.m5030a(zzbioVar))) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f13639j);
            List listAsList = Arrays.asList(((String) zzbaVar.f3098c.m5030a(zzbioVar)).split(","));
            zzedg zzedgVar = this.f13636g;
            zzedgVar.f13676b = listAsList;
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzedgVar);
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                zzedgVar.onSharedPreferenceChanged(defaultSharedPreferences, (String) it.next());
            }
        }
        zzbio zzbioVar2 = zzbix.f8268Pa;
        if (!TextUtils.isEmpty((CharSequence) zzbaVar.f3098c.m5030a(zzbioVar2))) {
            SharedPreferences sharedPreferences = this.f13639j.getSharedPreferences("admob", 0);
            List listAsList2 = Arrays.asList(((String) zzbaVar.f3098c.m5030a(zzbioVar2)).split(","));
            zzedg zzedgVar2 = this.f13637h;
            zzedgVar2.f13676b = listAsList2;
            sharedPreferences.registerOnSharedPreferenceChangeListener(zzedgVar2);
            Iterator it2 = listAsList2.iterator();
            while (it2.hasNext()) {
                zzedgVar2.onSharedPreferenceChanged(sharedPreferences, (String) it2.next());
            }
        }
        com.google.android.gms.ads.internal.util.zzj zzjVarM5387g = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g();
        zzjVarM5387g.m3180e();
        synchronized (zzjVarM5387g.f3585a) {
            str = zzjVarM5387g.f3608x;
        }
        synchronized (this) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    m6168g(jSONObject.optBoolean("isTestMode", false), false);
                    m6169h((zzecv) Enum.valueOf(zzecv.class, jSONObject.optString("gesture", "NONE")), false);
                    this.f13644o = jSONObject.optString("networkExtras", "{}");
                    this.f13646q = jSONObject.optLong("networkExtrasExpirationSecs", LocationRequestCompat.PASSIVE_INTERVAL);
                } catch (JSONException unused) {
                }
            }
        }
        com.google.android.gms.ads.internal.util.zzj zzjVarM5387g2 = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g();
        zzjVarM5387g2.m3180e();
        synchronized (zzjVarM5387g2.f3585a) {
            str2 = zzjVarM5387g2.f3578A;
        }
        this.f13653x = str2;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m6172k() {
        int iOrdinal = this.f13647r.ordinal();
        if (iOrdinal == 1) {
            this.f13631b.m6185b();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f13632c.m6155b();
        }
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m6173l() {
        SensorManager sensorManager;
        Sensor sensor;
        try {
            int iOrdinal = this.f13647r.ordinal();
            if (iOrdinal == 1) {
                zzeec zzeecVar = this.f13631b;
                synchronized (zzeecVar) {
                    try {
                        if (zzeecVar.f13729g) {
                            SensorManager sensorManager2 = zzeecVar.f13724b;
                            if (sensorManager2 != null) {
                                sensorManager2.unregisterListener(zzeecVar, zzeecVar.f13725c);
                                com.google.android.gms.ads.internal.util.zze.m3150k("Stopped listening for shake gestures.");
                            }
                            zzeecVar.f13729g = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            zzecl zzeclVar = this.f13632c;
            synchronized (zzeclVar) {
                try {
                    if (zzeclVar.f13582j && (sensorManager = zzeclVar.f13573a) != null && (sensor = zzeclVar.f13574b) != null) {
                        sensorManager.unregisterListener(zzeclVar, sensor);
                        zzeclVar.f13582j = false;
                        com.google.android.gms.ads.internal.util.zze.m3150k("Stopped listening for flick gestures.");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        } catch (Throwable th3) {
            throw th3;
        }
        throw th3;
    }

    /* JADX INFO: renamed from: m */
    public final void m6174m() {
        String string;
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        com.google.android.gms.ads.internal.util.zzj zzjVarM5387g = zztVar.f3708h.m5387g();
        synchronized (this) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("isTestMode", this.f13648s);
                jSONObject.put("gesture", this.f13647r);
                long j2 = this.f13646q;
                zztVar.f3711k.getClass();
                if (j2 > System.currentTimeMillis() / 1000) {
                    jSONObject.put("networkExtras", this.f13644o);
                    jSONObject.put("networkExtrasExpirationSecs", this.f13646q);
                }
            } catch (JSONException unused) {
            }
            string = jSONObject.toString();
        }
        zzjVarM5387g.getClass();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8616ka)).booleanValue()) {
            zzjVarM5387g.m3180e();
            synchronized (zzjVarM5387g.f3585a) {
                try {
                    if (zzjVarM5387g.f3608x.equals(string)) {
                        return;
                    }
                    zzjVarM5387g.f3608x = string;
                    SharedPreferences.Editor editor = zzjVarM5387g.f3591g;
                    if (editor != null) {
                        editor.putString("inspector_info", string);
                        zzjVarM5387g.f3591g.apply();
                    }
                    zzjVarM5387g.m3181f();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
