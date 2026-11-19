package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzdzy;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzj {

    /* JADX INFO: renamed from: a */
    public final HashMap f3944a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f3945b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Context f3946c;

    /* JADX INFO: renamed from: d */
    public final zzdzy f3947d;

    /* JADX INFO: renamed from: e */
    public final ExecutorService f3948e;

    public zzj(Context context, zzdzy zzdzyVar, ExecutorService executorService) {
        this.f3946c = context;
        this.f3947d = zzdzyVar;
        this.f3948e = executorService;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3334a(final Object obj, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        final Pair pair = new Pair(queryInfoGenerationCallback, Long.valueOf(System.currentTimeMillis()));
        zzcfy.f9951f.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
            @Override // java.lang.Runnable
            public final void run() {
                Object obj2 = obj;
                boolean z = obj2 instanceof WebView;
                zzj zzjVar = this.f3941s;
                boolean zAcceptThirdPartyCookies = false;
                if (z) {
                    Context context = zzjVar.f3946c;
                    CookieManager cookieManagerM3237h = com.google.android.gms.ads.internal.zzt.f3698C.f3706f.m3237h();
                    if (cookieManagerM3237h != null) {
                        zAcceptThirdPartyCookies = cookieManagerM3237h.acceptThirdPartyCookies((WebView) obj2);
                    }
                }
                HashMap map = zzjVar.f3944a;
                Boolean boolValueOf = Boolean.valueOf(zAcceptThirdPartyCookies);
                zzl zzlVar = (zzl) map.get(boolValueOf);
                Pair pair2 = pair;
                if (zzlVar != null) {
                    com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                    if (zzlVar.f3957c > System.currentTimeMillis()) {
                        zzjVar.m3338e(zzlVar, pair2, true);
                        return;
                    }
                }
                HashMap map2 = zzjVar.f3945b;
                List arrayList = (List) map2.get(boolValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map2.put(boolValueOf, arrayList);
                }
                arrayList.add(pair2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0032 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0001, B:5:0x0011, B:10:0x0027, B:12:0x002b, B:18:0x0035, B:20:0x0039, B:22:0x004a, B:26:0x0054, B:29:0x0075, B:30:0x0079, B:32:0x007f, B:21:0x0042, B:17:0x0032), top: B:38:0x0001 }] */
    /* JADX INFO: renamed from: b */
    public final synchronized void m3335b(final boolean z, zzl zzlVar) {
        try {
            HashMap map = this.f3944a;
            Boolean boolValueOf = Boolean.valueOf(z);
            zzl zzlVar2 = (zzl) map.get(boolValueOf);
            final boolean z2 = true;
            if (zzlVar2 != null) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                if ((zzlVar2.f3957c <= System.currentTimeMillis()) || zzlVar2.f3955a == null || zzlVar.f3955a != null) {
                    map.put(boolValueOf, zzlVar);
                }
            } else {
                map.put(boolValueOf, zzlVar);
            }
            long jLongValue = (zzlVar.f3955a != null ? (Long) zzblc.f9109f.m5057c() : (Long) zzblc.f9110g.m5057c()).longValue();
            if (zzlVar.f3955a != null) {
                z2 = false;
            }
            ((ScheduledThreadPoolExecutor) zzcfy.f9949d).schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() throws Throwable {
                    this.f3933s.m3337d(z, z2);
                }
            }, jLongValue, TimeUnit.SECONDS);
            HashMap map2 = this.f3945b;
            List list = (List) map2.get(boolValueOf);
            map2.put(boolValueOf, new ArrayList());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m3338e(zzlVar, (Pair) it.next(), false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3336c(final boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        HashMap map = this.f3945b;
        if (map.containsKey(boolValueOf)) {
            return;
        }
        map.put(boolValueOf, new ArrayList());
        this.f3948e.submit(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws Throwable {
                this.f3936s.m3337d(z, false);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m3337d(boolean z, boolean z2) throws Throwable {
        Throwable th;
        try {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("query_info_type", "requester_type_6");
                bundle.putBoolean("accept_3p_cookie", z);
                HashMap map = this.f3944a;
                Boolean boolValueOf = Boolean.valueOf(z);
                zzl zzlVar = (zzl) map.get(boolValueOf);
                int i2 = 0;
                if (z2 && zzlVar != null) {
                    try {
                        i2 = zzlVar.f3958d + 1;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                zzl zzlVar2 = (zzl) map.get(boolValueOf);
                final zzk zzkVar = new zzk(this, z, i2, zzlVar2 == null ? null : Boolean.valueOf(zzlVar2.f3959e.get()), this.f3947d);
                final AdRequest adRequest = new AdRequest((AdRequest.Builder) new AdRequest.Builder().m2741b(bundle));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8839xc)).booleanValue()) {
                    this.f3948e.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzh
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            QueryInfo.m3358a(this.f3938a.f3946c, adRequest, zzkVar);
                            return Boolean.TRUE;
                        }
                    });
                } else {
                    QueryInfo.m3358a(this.f3946c, adRequest, zzkVar);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3338e(zzl zzlVar, Pair pair, boolean z) {
        zzlVar.f3959e.set(true);
        QueryInfo queryInfo = zzlVar.f3955a;
        if (queryInfo != null) {
            ((QueryInfoGenerationCallback) pair.first).mo3331b(queryInfo);
        } else {
            ((QueryInfoGenerationCallback) pair.first).mo3330a(zzlVar.f3956b);
        }
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair(FirebaseAnalytics.Param.AD_FORMAT, "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        zzv.m3348d(this.f3947d, "sgpcr", pair2, pair3, pair4, pair5, new Pair("lat_ms", Long.toString(System.currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z)), new Pair("sgpc_rs", Boolean.toString(queryInfo != null)));
    }
}
