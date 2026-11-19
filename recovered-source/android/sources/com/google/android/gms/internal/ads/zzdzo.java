package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdzo {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f13407a;

    /* JADX INFO: renamed from: b */
    public final zzcfp f13408b;

    /* JADX INFO: renamed from: c */
    public final zzflg f13409c;

    /* JADX INFO: renamed from: d */
    public final zzbaw f13410d;

    /* JADX INFO: renamed from: e */
    public final Bundle f13411e;

    public zzdzo(Context context, zzdzy zzdzyVar, zzcfp zzcfpVar, zzflg zzflgVar, String str, String str2, zzbaw zzbawVar, DeviceTierManager deviceTierManager) {
        ActivityManager.MemoryInfo memoryInfoM3037j;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzflgVar.f16040d;
        this.f13411e = new Bundle();
        zzdzyVar.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdzyVar.f13443a);
        this.f13407a = concurrentHashMap;
        this.f13408b = zzcfpVar;
        this.f13409c = zzflgVar;
        this.f13410d = zzbawVar;
        concurrentHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str2.toUpperCase(Locale.ROOT));
        m6105d();
        zzbio zzbioVar = zzbix.f8158J2;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            m6103b("rt_f", String.valueOf(runtime.freeMemory()));
            m6103b("rt_m", String.valueOf(runtime.maxMemory()));
            m6103b("rt_t", String.valueOf(runtime.totalMemory()));
            m6103b("wv_c", String.valueOf(com.google.android.gms.ads.internal.zzt.f3698C.f3708h.f9899k.get()));
            if (((Boolean) zzbivVar2.m5030a(zzbix.f8311S2)).booleanValue() && (memoryInfoM3037j = com.google.android.gms.ads.internal.util.client.zzf.m3037j(context)) != null) {
                m6103b("mem_avl", String.valueOf(memoryInfoM3037j.availMem));
                m6103b("mem_tt", String.valueOf(memoryInfoM3037j.totalMem));
                m6103b("low_m", true != memoryInfoM3037j.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8423Z2)).booleanValue()) {
            m6103b("ad_unit_id", zzflgVar.f16043g);
        }
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8327T2)).booleanValue()) {
            m6103b("mem_tier", ((DeviceTierManager.AdvertisedMemoryTier) deviceTierManager.f3782c.get()).name());
        }
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8343U2)).booleanValue()) {
            m6103b("proc_tier", ((DeviceTierManager.AvailableProcessorTier) deviceTierManager.f3784e.get()).name());
        }
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8282Q7)).booleanValue()) {
            int iM3349e = com.google.android.gms.ads.nonagon.signalgeneration.zzv.m3349e(zzflgVar) - 1;
            if (iM3349e == 0) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("scar", "false");
                return;
            }
            if (iM3349e == 1) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("se", "query_g");
            } else if (iM3349e == 2) {
                concurrentHashMap.put("se", "r_adinfo");
            } else if (iM3349e != 3) {
                concurrentHashMap.put("se", "r_both");
            } else {
                concurrentHashMap.put("se", "r_adstring");
            }
            concurrentHashMap.put("scar", "true");
            m6103b("ragent", zzmVar.f3213H);
            m6103b("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzv.m3345a(com.google.android.gms.ads.nonagon.signalgeneration.zzv.m3346b(zzmVar)));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6102a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            m6103b("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            m6103b("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6103b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f13407a.put(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m6104c(long j2, String str) {
        this.f13411e.putLong(str, j2);
    }

    /* JADX INFO: renamed from: d */
    public final void m6105d() {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8302Ra)).booleanValue()) {
            zzbar zzbarVar = this.f13410d.f7501b;
            boolean z = zzbarVar instanceof com.google.android.gms.ads.internal.zzk;
            ConcurrentHashMap concurrentHashMap = this.f13407a;
            if (z) {
                int i2 = ((com.google.android.gms.ads.internal.zzk) zzbarVar).f3665G;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                concurrentHashMap.put("asv", i3 != 0 ? "2" : "1");
                return;
            }
            if (!(zzbarVar instanceof zzcnp)) {
                concurrentHashMap.put("asv", "NA");
                return;
            }
            zzggc zzggcVar = (zzggc) ((zzcnp) zzbarVar).f10613t.f17044a.f17025b.f17215f.get();
            int iMo6999c = (zzggcVar == null ? 1 : zzggcVar.mo6999c()) - 1;
            if (iMo6999c == 1) {
                str = "1.0";
            } else if (iMo6999c != 2) {
                str = iMo6999c != 3 ? "uns" : "3.0";
            } else {
                str = "2.0";
            }
            concurrentHashMap.put("asv", str);
        }
    }
}
