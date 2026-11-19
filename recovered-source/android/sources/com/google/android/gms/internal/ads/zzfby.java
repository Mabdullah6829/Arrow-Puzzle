package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfby implements zzfcs {

    /* JADX INFO: renamed from: j */
    public static final zzfbz f15362j = new zzfbz(new JSONArray().toString(), "", new Bundle());

    /* JADX INFO: renamed from: a */
    public final zzhcp f15363a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f15364b;

    /* JADX INFO: renamed from: c */
    public final zzese f15365c;

    /* JADX INFO: renamed from: d */
    public final Context f15366d;

    /* JADX INFO: renamed from: e */
    public final zzflg f15367e;

    /* JADX INFO: renamed from: f */
    public final zzerz f15368f;

    /* JADX INFO: renamed from: g */
    public final zzdxk f15369g;

    /* JADX INFO: renamed from: h */
    public final zzecg f15370h;

    /* JADX INFO: renamed from: i */
    public final String f15371i;

    public zzfby(zzhcp zzhcpVar, ScheduledExecutorService scheduledExecutorService, String str, zzese zzeseVar, Context context, zzflg zzflgVar, zzerz zzerzVar, zzdxk zzdxkVar, zzecg zzecgVar) {
        this.f15363a = zzhcpVar;
        this.f15364b = scheduledExecutorService;
        this.f15371i = str;
        this.f15365c = zzeseVar;
        this.f15366d = context;
        this.f15367e = zzflgVar;
        this.f15368f = zzerzVar;
        this.f15369g = zzdxkVar;
        this.f15370h = zzecgVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m6419a(ArrayList arrayList, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzesi zzesiVar = (zzesi) ((Map.Entry) it.next()).getValue();
            String str = zzesiVar.f14779a;
            Bundle bundle = this.f15367e.f16040d.f3210E;
            arrayList.add(m6420b(str, Collections.singletonList(zzesiVar.f14783e), bundle != null ? bundle.getBundle(str) : null, zzesiVar.f14780b, zzesiVar.f14781c));
        }
    }

    /* JADX INFO: renamed from: b */
    public final zzhbx m6420b(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        zzhbm zzhbmVar = new zzhbm() { // from class: com.google.android.gms.internal.ads.zzfbt
            /* JADX WARN: Code duplicated, block: B:75:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // com.google.android.gms.internal.ads.zzhbm
            public final ListenableFuture zza() {
                zzbxi zzbxiVar;
                zzbxi zzbxiVarM6083b;
                final zzfby zzfbyVar = this.f15347a;
                String str2 = str;
                final List list2 = list;
                final Bundle bundle2 = bundle;
                boolean z3 = z;
                boolean z4 = z2;
                final zzcgd zzcgdVar = new zzcgd();
                if (z4) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8625l2)).booleanValue()) {
                        try {
                            zzbxiVarM6083b = zzfbyVar.f15369g.m6083b(str2);
                        } catch (RemoteException e) {
                            com.google.android.gms.ads.internal.util.zze.m3151l("Couldn't create RTB adapter : ", e);
                            zzbxiVar = null;
                        }
                    } else {
                        zzerz zzerzVar = zzfbyVar.f15368f;
                        zzerzVar.getClass();
                        try {
                            zzerzVar.f14752a.put(str2, zzerzVar.f14753b.m6083b(str2));
                        } catch (RemoteException e2) {
                            com.google.android.gms.ads.internal.util.zze.m3151l("Couldn't create RTB adapter : ", e2);
                        }
                        ConcurrentHashMap concurrentHashMap = zzerzVar.f14752a;
                        zzbxiVarM6083b = concurrentHashMap.containsKey(str2) ? (zzbxi) concurrentHashMap.get(str2) : null;
                    }
                    zzbxiVar = zzbxiVarM6083b;
                } else {
                    zzbxiVarM6083b = zzfbyVar.f15369g.m6083b(str2);
                    zzbxiVar = zzbxiVarM6083b;
                }
                if (zzbxiVar == null) {
                    zzbio zzbioVar = zzbix.f8456b2;
                    com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                    if (!((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                        throw null;
                    }
                    int i2 = zzesh.f14773x;
                    synchronized (zzesh.class) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
                                jSONObject.put("signal_error", "Adapter failed to instantiate");
                                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8558h2)).booleanValue()) {
                                    jSONObject.put("signal_error_code", 1);
                                }
                                zzcgdVar.m5397a(jSONObject);
                            } catch (JSONException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return zzcgdVar;
                }
                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                final zzesh zzeshVar = new zzesh(str2, zzbxiVar, zzcgdVar, SystemClock.elapsedRealtime());
                zzbio zzbioVar2 = zzbix.f8541g2;
                com.google.android.gms.ads.internal.client.zzba zzbaVar2 = com.google.android.gms.ads.internal.client.zzba.f3095e;
                if (((Boolean) zzbaVar2.f3098c.m5030a(zzbioVar2)).booleanValue()) {
                    zzfbyVar.f15364b.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbx
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzesh zzeshVar2 = zzeshVar;
                            synchronized (zzeshVar2) {
                                zzeshVar2.m6333k4(3, "Signal collection timeout.");
                            }
                        }
                    }, ((Long) zzbaVar2.f3098c.m5030a(zzbix.f8422Z1)).longValue(), TimeUnit.MILLISECONDS);
                }
                if (z3) {
                    if (!((Boolean) zzbaVar2.f3098c.m5030a(zzbix.f8659n2)).booleanValue()) {
                        zzbxiVar.mo5245b4(new ObjectWrapper(zzfbyVar.f15366d), zzfbyVar.f15371i, bundle2, (Bundle) list2.get(0), zzfbyVar.f15367e.f16042f, zzeshVar);
                        return zzcgdVar;
                    }
                    final zzbxi zzbxiVar2 = zzbxiVar;
                    zzfbyVar.f15363a.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbv
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzfby zzfbyVar2 = zzfbyVar;
                            zzbxi zzbxiVar3 = zzbxiVar2;
                            Bundle bundle3 = bundle2;
                            List list3 = list2;
                            zzesh zzeshVar2 = zzeshVar;
                            try {
                                zzbxiVar3.mo5245b4(new ObjectWrapper(zzfbyVar2.f15366d), zzfbyVar2.f15371i, bundle3, (Bundle) list3.get(0), zzfbyVar2.f15367e.f16042f, zzeshVar2);
                            } catch (RemoteException e3) {
                                zzcgdVar.m5398b(e3);
                            }
                        }
                    });
                    return zzcgdVar;
                }
                synchronized (zzeshVar) {
                    if (zzeshVar.f14778w) {
                        return zzcgdVar;
                    }
                    try {
                        if (((Boolean) zzbaVar2.f3098c.m5030a(zzbix.f8558h2)).booleanValue()) {
                            zzeshVar.f14776u.put("signal_error_code", 0);
                        }
                    } catch (JSONException unused2) {
                    }
                    zzeshVar.f14775t.m5397a(zzeshVar.f14776u);
                    zzeshVar.f14778w = true;
                    return zzcgdVar;
                }
            }
        };
        zzhcp zzhcpVar = this.f15363a;
        zzhbx zzhbxVarM7360q = zzhbx.m7360q(zzhcf.m7370d(zzhbmVar, zzhcpVar));
        zzbio zzbioVar = zzbix.f8541g2;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            zzhbxVarM7360q = (zzhbx) zzhcf.m7373g(zzhbxVarM7360q, ((Long) zzbaVar.f3098c.m5030a(zzbix.f8422Z1)).longValue(), TimeUnit.MILLISECONDS, this.f15364b);
        }
        return (zzhbx) zzhcf.m7371e(zzhbxVarM7360q, Throwable.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzfbu
            @Override // com.google.android.gms.internal.ads.zzgti
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzfbz zzfbzVar = zzfby.f15362j;
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                String str2 = str;
                com.google.android.gms.ads.internal.util.client.zzo.m3070c("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8875ze)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)), th);
                    return null;
                }
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)), th);
                return null;
            }
        }, zzhcpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        zzflg zzflgVar = this.f15367e;
        if (zzflgVar.f16055s) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8642m2)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzv.m3345a(com.google.android.gms.ads.nonagon.signalgeneration.zzv.m3346b(zzflgVar.f16040d)))) {
                return zzhcf.m7367a(f15362j);
            }
        }
        return zzhcf.m7370d(new zzhbm() { // from class: com.google.android.gms.internal.ads.zzfbw
            @Override // com.google.android.gms.internal.ads.zzhbm
            public final ListenableFuture zza() {
                Bundle bundle;
                String str;
                HashMap map;
                zzgww zzgwwVarM7229a;
                zzfby zzfbyVar = this.f15360a;
                zzbio zzbioVar = zzbix.f8686oc;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                String lowerCase = ((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() ? zzfbyVar.f15367e.f16043g.toLowerCase(Locale.ROOT) : zzfbyVar.f15367e.f16043g;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8608k2)).booleanValue()) {
                    zzecg zzecgVar = zzfbyVar.f15370h;
                    synchronized (zzecgVar) {
                        bundle = new Bundle(zzecgVar.f13566s);
                    }
                } else {
                    bundle = new Bundle();
                }
                final Bundle bundle2 = bundle;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8476c5)).booleanValue()) {
                    zzcff zzcffVarZzi = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().zzi();
                    char c = (TextUtils.isEmpty(zzcffVarZzi.f9877e) || zzcffVarZzi.f9879g == null) ? (char) 3 : zzcffVarZzi.m5379b() ? (char) 1 : (char) 2;
                    str = c != 1 ? c != 2 ? "EMPTY" : "INVALID" : "VALID";
                } else {
                    str = "";
                }
                final String str2 = str;
                final ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = zzfbyVar.f15367e.f16059w;
                if (jSONArray != null) {
                    HashMap map2 = new HashMap();
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i2);
                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                            String string = "";
                            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                                string = jSONArrayOptJSONArray.getString(0);
                            }
                            String str3 = string;
                            if (!TextUtils.isEmpty(str3)) {
                                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                                Bundle bundle3 = new Bundle();
                                if (jSONObjectOptJSONObject != null) {
                                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                                    while (itKeys.hasNext()) {
                                        String next = itKeys.next();
                                        bundle3.putString(next, jSONObjectOptJSONObject.optString(next, ""));
                                    }
                                }
                                map2.put(str3, new zzesi(str3, true, true, false, bundle3));
                            }
                        } catch (JSONException e) {
                            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("RecursiveRtbAdapterMap.parseAdapters", new JSONException("Malformed RTB adapter config."));
                            com.google.android.gms.ads.internal.util.zze.m3151l("Malformed RTB adapter config.", e);
                        }
                    }
                    zzfbyVar.m6419a(arrayList, map2);
                } else if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8761t2)).booleanValue()) {
                    zzese zzeseVar = zzfbyVar.f15365c;
                    String str4 = zzfbyVar.f15371i;
                    synchronized (zzeseVar) {
                        try {
                            zzgww zzgwwVarM6324a = zzeseVar.m6324a(str4, lowerCase);
                            zzgww zzgwwVarM6332i = zzeseVar.m6332i(lowerCase);
                            map = new HashMap();
                            Iterator it = zzgwwVarM6324a.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                String str5 = (String) entry.getKey();
                                if (zzgwwVarM6332i.containsKey(str5)) {
                                    zzesi zzesiVar = (zzesi) zzgwwVarM6332i.get(str5);
                                    List list = (List) entry.getValue();
                                    map.put(str5, new zzesi(str5, zzesiVar.f14780b, zzesiVar.f14781c, zzesiVar.f14782d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                                }
                            }
                            zzgxd zzgxdVarMo7230b = zzgwwVarM6332i.f18310s;
                            if (zzgxdVarMo7230b == null) {
                                zzgxdVarMo7230b = zzgwwVarM6332i.mo7230b();
                                zzgwwVarM6332i.f18310s = zzgxdVarMo7230b;
                            }
                            zzgzh it2 = zzgxdVarMo7230b.iterator();
                            while (it2.hasNext()) {
                                Map.Entry entry2 = (Map.Entry) it2.next();
                                String str6 = (String) entry2.getKey();
                                if (!map.containsKey(str6) && ((zzesi) entry2.getValue()).f14782d) {
                                    map.put(str6, (zzesi) entry2.getValue());
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    zzfbyVar.m6419a(arrayList, map);
                } else {
                    zzese zzeseVar2 = zzfbyVar.f15365c;
                    Iterator it3 = zzeseVar2.m6324a(zzfbyVar.f15371i, lowerCase).entrySet().iterator();
                    while (it3.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) it3.next();
                        String str7 = (String) entry3.getKey();
                        List list2 = (List) entry3.getValue();
                        Bundle bundle4 = zzfbyVar.f15367e.f16040d.f3210E;
                        arrayList.add(zzfbyVar.m6420b(str7, list2, bundle4 != null ? bundle4.getBundle(str7) : null, true, true));
                    }
                    synchronized (zzeseVar2) {
                        zzgwwVarM7229a = TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().zzi().f9877e) ? zzgyt.f18367y : zzgww.m7229a(zzeseVar2.f14765b);
                    }
                    zzfbyVar.m6419a(arrayList, zzgwwVarM7229a);
                }
                return new zzhce(zzgwt.m7220t(arrayList), true).m7366a(zzfbyVar.f15363a, new Callable() { // from class: com.google.android.gms.internal.ads.zzfbs
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zzfbz zzfbzVar = zzfby.f15362j;
                        JSONArray jSONArray2 = new JSONArray();
                        ArrayList arrayList2 = arrayList;
                        int size = arrayList2.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList2.get(i3);
                            i3++;
                            ListenableFuture listenableFuture = (ListenableFuture) obj;
                            if (((JSONObject) listenableFuture.get()) != null) {
                                jSONArray2.put(listenableFuture.get());
                            }
                        }
                        int length = jSONArray2.length();
                        String str8 = str2;
                        Bundle bundle5 = bundle2;
                        if (length != 0) {
                            return new zzfbz(jSONArray2.toString(), str8, bundle5);
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8476c5)).booleanValue()) {
                            return new zzfbz(new JSONArray().toString(), str8, bundle5);
                        }
                        return null;
                    }
                });
            }
        }, this.f15363a);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 32;
    }
}
