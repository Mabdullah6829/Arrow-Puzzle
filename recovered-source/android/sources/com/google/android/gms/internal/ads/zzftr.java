package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzftr {

    /* JADX INFO: renamed from: c */
    public final zzfum f16506c;

    /* JADX INFO: renamed from: d */
    public final zzftn f16507d;

    /* JADX INFO: renamed from: e */
    public final Context f16508e;

    /* JADX INFO: renamed from: f */
    public volatile ConnectivityManager f16509f;

    /* JADX INFO: renamed from: h */
    public final Clock f16511h;

    /* JADX INFO: renamed from: i */
    public AtomicInteger f16512i;

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f16510g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f16504a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f16505b = new ConcurrentHashMap();

    public zzftr(zzfum zzfumVar, zzftn zzftnVar, Context context, Clock clock) {
        this.f16506c = zzfumVar;
        this.f16507d = zzftnVar;
        this.f16508e = context;
        this.f16511h = clock;
    }

    /* JADX INFO: renamed from: a */
    public static String m6687a(String str, AdFormat adFormat) {
        String strName = adFormat == null ? "NULL" : adFormat.name();
        return AbstractC1456a.m2450q(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(strName).length()), str, "#", strName);
    }

    /* JADX INFO: renamed from: b */
    public final void m6688b(boolean z) {
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8036C)).booleanValue()) {
                m6689c(z);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m6689c(boolean z) {
        try {
            if (z) {
                Iterator it = this.f16504a.values().iterator();
                while (it.hasNext()) {
                    ((zzful) it.next()).m6706n();
                }
            } else {
                Iterator it2 = this.f16504a.values().iterator();
                while (it2.hasNext()) {
                    ((zzful) it2.next()).f16561g.set(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x010a A[Catch: all -> 0x004e, TryCatch #1 {all -> 0x004e, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0015, B:8:0x0034, B:10:0x0042, B:13:0x0051, B:14:0x0057, B:16:0x005f, B:18:0x0073, B:19:0x0082, B:20:0x0086, B:21:0x008a, B:22:0x0094, B:24:0x009a, B:26:0x00ac, B:27:0x00c1, B:28:0x00cb, B:30:0x00d1, B:32:0x00fa, B:38:0x0111, B:40:0x0117, B:34:0x010a, B:35:0x010c, B:44:0x011d, B:36:0x010d, B:37:0x0110), top: B:51:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public final synchronized ArrayList m6690d(List list) {
        ArrayList arrayList;
        Queue queue;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.ads.internal.client.zzfp zzfpVar = (com.google.android.gms.ads.internal.client.zzfp) it.next();
                String strM6687a = m6687a(zzfpVar.f3189s, AdFormat.m2747b(zzfpVar.f3190t));
                hashSet.add(strM6687a);
                ConcurrentHashMap concurrentHashMap = this.f16504a;
                zzful zzfulVar = (zzful) concurrentHashMap.get(strM6687a);
                if (zzfulVar == null) {
                    ConcurrentHashMap concurrentHashMap2 = this.f16505b;
                    if (concurrentHashMap2.containsKey(strM6687a)) {
                        zzful zzfulVar2 = (zzful) concurrentHashMap2.get(strM6687a);
                        if (((com.google.android.gms.ads.internal.client.zzfp) zzfulVar2.f16559e.get()).equals(zzfpVar)) {
                            zzfulVar2.m6696a(zzfpVar.f3192v);
                            zzfulVar2.m6706n();
                            concurrentHashMap.put(strM6687a, zzfulVar2);
                            concurrentHashMap2.remove(strM6687a);
                        } else {
                            arrayList.add(zzfpVar);
                        }
                    } else {
                        arrayList.add(zzfpVar);
                    }
                } else if (((com.google.android.gms.ads.internal.client.zzfp) zzfulVar.f16559e.get()).equals(zzfpVar)) {
                    zzfulVar.m6696a(zzfpVar.f3192v);
                } else {
                    this.f16505b.put(strM6687a, zzfulVar);
                    concurrentHashMap.remove(strM6687a);
                    arrayList.add(zzfpVar);
                }
            }
            Iterator it2 = this.f16504a.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.f16505b.put((String) entry.getKey(), (zzful) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.f16505b.entrySet().iterator();
            while (it3.hasNext()) {
                zzful zzfulVar3 = (zzful) ((Map.Entry) it3.next()).getValue();
                zzfulVar3.f16561g.set(false);
                zzfulVar3.f16570p.set(false);
                zzbio zzbioVar = zzbix.f8070E;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                    queue = zzfulVar3.f16564j;
                    synchronized (queue) {
                        queue.clear();
                    }
                } else {
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8087F)).booleanValue()) {
                        queue = zzfulVar3.f16564j;
                        synchronized (queue) {
                            queue.clear();
                        }
                    }
                }
                if (!zzfulVar3.m6704l()) {
                    it3.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m6691e(String str, AdFormat adFormat) {
        boolean z;
        try {
            Clock clock = this.f16511h;
            long jCurrentTimeMillis = clock.currentTimeMillis();
            zzful zzfulVarM6693g = m6693g(str, adFormat);
            int iM6712t = 0;
            z = zzfulVarM6693g != null && zzfulVarM6693g.m6704l();
            Long lValueOf = z ? Long.valueOf(clock.currentTimeMillis()) : null;
            zzftu zzftuVar = new zzftu(new zzftt(str, adFormat));
            zzftn zzftnVar = this.f16507d;
            int iM6711s = zzfulVarM6693g == null ? 0 : zzfulVarM6693g.m6711s();
            if (zzfulVarM6693g != null) {
                iM6712t = zzfulVarM6693g.m6712t();
            }
            zzftnVar.m6680c(iM6711s, iM6712t, jCurrentTimeMillis, lValueOf, zzfulVarM6693g != null ? zzfulVarM6693g.m6707o() : null, zzftuVar, "1");
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized Object m6692f(AdFormat adFormat, Class cls, String str) {
        zzftu zzftuVar = new zzftu(new zzftt(str, adFormat));
        zzftn zzftnVar = this.f16507d;
        Clock clock = this.f16511h;
        zzftnVar.m6684g("poll_ad", "ppac_ts", clock.currentTimeMillis(), -1, -1, null, zzftuVar, "1");
        zzful zzfulVarM6693g = m6693g(str, adFormat);
        if (zzfulVarM6693g == null) {
            return null;
        }
        try {
            String strM6707o = zzfulVarM6693g.m6707o();
            Object objM6705m = zzfulVarM6693g.m6705m();
            Object objCast = objM6705m == null ? null : cls.cast(objM6705m);
            if (objCast != null) {
                zzftnVar.m6681d(clock.currentTimeMillis(), zzfulVarM6693g.m6711s(), zzfulVarM6693g.m6712t(), strM6707o, zzftuVar, "1");
            }
            return objCast;
        } catch (ClassCastException e) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("PreloadAdManager.pollAd", e);
            com.google.android.gms.ads.internal.util.zze.m3151l("Unable to cast ad to the requested type:".concat(cls.getName()), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized zzful m6693g(String str, AdFormat adFormat) {
        return (zzful) this.f16504a.get(m6687a(str, adFormat));
    }
}
