package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzftc {

    /* JADX INFO: renamed from: a */
    public final HashMap f16458a;

    /* JADX INFO: renamed from: b */
    public final zzfum f16459b;

    /* JADX INFO: renamed from: c */
    public final zzftn f16460c;

    /* JADX INFO: renamed from: d */
    public final Context f16461d;

    /* JADX INFO: renamed from: e */
    public volatile ConnectivityManager f16462e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f16463f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    public final Clock f16464g;

    /* JADX INFO: renamed from: h */
    public AtomicInteger f16465h;

    /* JADX INFO: renamed from: i */
    public final zzfsx f16466i;

    /* JADX INFO: renamed from: j */
    public final com.google.android.gms.ads.internal.util.zzg f16467j;

    public zzftc(zzfum zzfumVar, zzftn zzftnVar, Context context, Clock clock, zzfsx zzfsxVar, com.google.android.gms.ads.internal.util.zzj zzjVar) {
        HashMap map = new HashMap();
        this.f16458a = map;
        map.put(AdFormat.APP_OPEN_AD, new HashMap());
        map.put(AdFormat.INTERSTITIAL, new HashMap());
        map.put(AdFormat.REWARDED, new HashMap());
        this.f16459b = zzfumVar;
        this.f16460c = zzftnVar;
        this.f16461d = context;
        this.f16464g = clock;
        this.f16466i = zzfsxVar;
        this.f16467j = zzjVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m6658a(boolean z) {
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f16458a;
        synchronized (map) {
            try {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    arrayList.addAll(((Map) it.next()).values());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzful zzfulVar = (zzful) arrayList.get(i2);
            if (z) {
                zzfulVar.m6706n();
            } else {
                zzfulVar.f16561g.set(false);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m6659b(AdFormat adFormat, Class cls, String str) {
        zzftn zzftnVar = this.f16460c;
        Clock clock = this.f16464g;
        zzftnVar.m6684g("poll_ad", "ppacwe_ts", clock.currentTimeMillis(), -1, -1, null, null, "2");
        HashMap map = this.f16458a;
        synchronized (map) {
            try {
                if (!map.containsKey(adFormat)) {
                    return null;
                }
                zzful zzfulVar = (zzful) ((Map) map.get(adFormat)).get(str);
                if (zzfulVar != null && adFormat.equals(zzfulVar.m6709q())) {
                    zzftt zzfttVar = new zzftt(zzfulVar.m6710r(), zzfulVar.m6709q());
                    zzfttVar.f16519c = str;
                    zzftu zzftuVar = new zzftu(zzfttVar);
                    zzftnVar.m6684g("poll_ad", "ppac_ts", clock.currentTimeMillis(), zzfulVar.m6711s(), zzfulVar.m6712t(), null, zzftuVar, "2");
                    try {
                        String strM6707o = zzfulVar.m6707o();
                        Object objM6705m = zzfulVar.m6705m();
                        Object objCast = objM6705m == null ? null : cls.cast(objM6705m);
                        if (objCast == null) {
                            return objCast;
                        }
                        zzftnVar.m6681d(clock.currentTimeMillis(), zzfulVar.m6711s(), zzfulVar.m6712t(), strM6707o, zzftuVar, "2");
                        return objCast;
                    } catch (ClassCastException e) {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("PreloadAdManager.pollAd", e);
                        com.google.android.gms.ads.internal.util.zze.m3151l("Unable to cast ad to the requested type:".concat(cls.getName()), e);
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6660c(AdFormat adFormat) {
        int iMax;
        HashMap map = this.f16458a;
        int size = map.containsKey(adFormat) ? ((Map) map.get(adFormat)).size() : 0;
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            iMax = Math.max(((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8747s5)).intValue(), 1);
        } else if (iOrdinal == 2) {
            iMax = Math.max(((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8764t5)).intValue(), 1);
        } else if (iOrdinal != 5) {
            iMax = 0;
        } else {
            iMax = Math.max(((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8781u5)).intValue(), 1);
        }
        return size < iMax;
    }
}
