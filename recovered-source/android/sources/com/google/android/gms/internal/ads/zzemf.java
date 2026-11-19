package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzemf {

    /* JADX INFO: renamed from: c */
    public final String f14197c;

    /* JADX INFO: renamed from: d */
    public zzfkq f14198d = null;

    /* JADX INFO: renamed from: e */
    public zzfkn f14199e = null;

    /* JADX INFO: renamed from: f */
    public com.google.android.gms.ads.internal.client.zzv f14200f = null;

    /* JADX INFO: renamed from: b */
    public final Map f14196b = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: a */
    public final List f14195a = Collections.synchronizedList(new ArrayList());

    public zzemf(String str) {
        this.f14197c = str;
    }

    /* JADX INFO: renamed from: d */
    public static String m6287d(zzfkn zzfknVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8797v4)).booleanValue() ? zzfknVar.f15947p0 : zzfknVar.f15960w;
    }

    /* JADX INFO: renamed from: a */
    public final void m6288a(zzfkn zzfknVar) {
        String strM6287d = m6287d(zzfknVar);
        Map map = this.f14196b;
        Object obj = map.get(strM6287d);
        List list = this.f14195a;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.f14200f);
        }
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            return;
        }
        this.f14200f = (com.google.android.gms.ads.internal.client.zzv) list.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= list.size()) {
                return;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) list.get(iIndexOf);
            zzvVar.f3270t = 0L;
            zzvVar.f3271u = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6289b(zzfkn zzfknVar, int i2) {
        Map map = this.f14196b;
        String strM6287d = m6287d(zzfknVar);
        if (map.containsKey(strM6287d)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = zzfknVar.f15958v;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        com.google.android.gms.ads.internal.client.zzv zzvVar = new com.google.android.gms.ads.internal.client.zzv(zzfknVar.f15889E, 0L, null, bundle, zzfknVar.f15891F, zzfknVar.f15893G, zzfknVar.f15895H, zzfknVar.f15897I);
        try {
            this.f14195a.add(i2, zzvVar);
        } catch (IndexOutOfBoundsException e) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation", e);
        }
        this.f14196b.put(strM6287d, zzvVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m6290c(zzfkn zzfknVar, long j2, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z) {
        String strM6287d = m6287d(zzfknVar);
        Map map = this.f14196b;
        if (map.containsKey(strM6287d)) {
            if (this.f14199e == null) {
                this.f14199e = zzfknVar;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(strM6287d);
            zzvVar.f3270t = j2;
            zzvVar.f3271u = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8112G7)).booleanValue() && z) {
                this.f14200f = zzvVar;
            }
        }
    }
}
