package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzdzo;
import com.google.android.gms.internal.ads.zzdzy;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzq {

    /* JADX INFO: renamed from: a */
    public final int f3970a;

    /* JADX INFO: renamed from: b */
    public final long f3971b;

    /* JADX INFO: renamed from: c */
    public final boolean f3972c;

    /* JADX INFO: renamed from: d */
    public final boolean f3973d;

    /* JADX INFO: renamed from: e */
    public final Map f3974e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f3975f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f3976g = new ArrayDeque();

    /* JADX INFO: renamed from: h */
    public final zzdzy f3977h;

    /* JADX INFO: renamed from: i */
    public ConcurrentHashMap f3978i;

    public zzq(zzdzy zzdzyVar) {
        this.f3977h = zzdzyVar;
        zzbio zzbioVar = zzbix.f8248O7;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        this.f3970a = ((Integer) zzbaVar.f3098c.m5030a(zzbioVar)).intValue();
        zzbio zzbioVar2 = zzbix.f8265P7;
        zzbiv zzbivVar = zzbaVar.f3098c;
        this.f3971b = ((Long) zzbivVar.m5030a(zzbioVar2)).longValue();
        this.f3972c = ((Boolean) zzbivVar.m5030a(zzbix.f8332T7)).booleanValue();
        this.f3973d = ((Boolean) zzbivVar.m5030a(zzbix.f8316S7)).booleanValue();
        this.f3974e = Collections.synchronizedMap(new zzn(this));
    }

    /* JADX INFO: renamed from: a */
    public final synchronized String m3339a(String str, zzdzo zzdzoVar) {
        zzo zzoVar = (zzo) this.f3974e.get(str);
        zzdzoVar.f13407a.put("request_id", str);
        if (zzoVar == null) {
            zzdzoVar.f13407a.put("mhit", "false");
            return null;
        }
        zzdzoVar.f13407a.put("mhit", "true");
        return zzoVar.f3964b;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m3340b() {
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.f3974e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((zzo) entry.getValue()).f3963a.longValue() <= this.f3971b) {
                    break;
                }
                this.f3976g.add(new Pair((String) entry.getKey(), ((zzo) entry.getValue()).f3964b));
                it.remove();
                throw th;
            }
        } catch (ConcurrentModificationException e) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("QueryJsonMap.removeExpiredEntries", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m3341c(final zzdzo zzdzoVar) {
        if (this.f3972c) {
            ArrayDeque arrayDeque = this.f3976g;
            final ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.f3975f;
            final ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            zzcfy.f9946a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzq zzqVar = this.f3966s;
                    zzdzo zzdzoVar2 = zzdzoVar;
                    zzqVar.m3342d(zzdzoVar2, arrayDequeClone, TypedValues.TransitionType.S_TO);
                    zzqVar.m3342d(zzdzoVar2, arrayDequeClone2, "of");
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3342d(zzdzo zzdzoVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdzoVar.f13407a);
            this.f3978i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f3978i.put("e_r", str);
            this.f3978i.put("e_id", (String) pair2.first);
            if (this.f3973d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzv.m3345a(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                ConcurrentHashMap concurrentHashMap2 = this.f3978i;
                String str2 = (String) pair.first;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put("e_type", str2);
                }
                ConcurrentHashMap concurrentHashMap3 = this.f3978i;
                String str3 = (String) pair.second;
                if (!TextUtils.isEmpty(str3)) {
                    concurrentHashMap3.put("e_agent", str3);
                }
            }
            this.f3977h.m6127b(this.f3978i);
        }
    }
}
