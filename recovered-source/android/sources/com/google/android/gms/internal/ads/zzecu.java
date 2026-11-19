package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class zzecu {

    /* JADX INFO: renamed from: a */
    public final zzece f13616a;

    /* JADX INFO: renamed from: b */
    public final zzdxh f13617b;

    /* JADX INFO: renamed from: c */
    public final Object f13618c = new Object();

    /* JADX INFO: renamed from: d */
    public final ArrayList f13619d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f13620e;

    public zzecu(zzece zzeceVar, zzdxh zzdxhVar) {
        this.f13616a = zzeceVar;
        this.f13617b = zzdxhVar;
    }

    /* JADX INFO: renamed from: a */
    public final JSONArray m6160a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f13618c) {
            try {
                if (!this.f13620e) {
                    zzece zzeceVar = this.f13616a;
                    if (!zzeceVar.f13541b) {
                        zzecs zzecsVar = new zzecs(this);
                        zzece zzeceVar2 = this.f13616a;
                        zzeceVar2.getClass();
                        zzeceVar2.f13544e.addListener(new zzecd(zzeceVar2, zzecsVar), zzeceVar2.f13549j);
                        return jSONArray;
                    }
                    m6161b(zzeceVar.m6151b());
                }
                ArrayList arrayList = this.f13619d;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    jSONArray.put(((zzect) obj).m6159a());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6161b(List list) {
        zzbxx zzbxxVar;
        zzdxg zzdxgVarM6081b;
        zzdxg zzdxgVarM6081b2;
        zzbxx zzbxxVar2;
        synchronized (this.f13618c) {
            try {
                if (this.f13620e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbrw zzbrwVar = (zzbrw) it.next();
                    zzbio zzbioVar = zzbix.f8115Ga;
                    com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                    String string = (!((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() || (zzdxgVarM6081b2 = this.f13617b.m6081b(zzbrwVar.f9309s)) == null || (zzbxxVar2 = zzdxgVarM6081b2.f13245c) == null) ? "" : zzbxxVar2.toString();
                    String str = string;
                    boolean z = ((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8132Ha)).booleanValue() && (zzdxgVarM6081b = this.f13617b.m6081b(zzbrwVar.f9309s)) != null && zzdxgVarM6081b.f13246d;
                    ArrayList arrayList = this.f13619d;
                    String str2 = zzbrwVar.f9309s;
                    zzdxg zzdxgVarM6081b3 = this.f13617b.m6081b(str2);
                    arrayList.add(new zzect(str2, str, (zzdxgVarM6081b3 == null || (zzbxxVar = zzdxgVarM6081b3.f13244b) == null) ? "" : zzbxxVar.toString(), zzbrwVar.f9310t ? 1 : 0, zzbrwVar.f9312v, zzbrwVar.f9311u, z));
                }
                this.f13620e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
