package com.google.android.gms.internal.ads;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeqf implements zzemc {

    /* JADX INFO: renamed from: a */
    public final HashMap f14612a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final zzdxk f14613b;

    public zzeqf(zzdxk zzdxkVar) {
        this.f14613b = zzdxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemc
    /* JADX INFO: renamed from: a */
    public final zzemd mo6286a(JSONObject jSONObject, String str) {
        zzemd zzemdVar;
        synchronized (this) {
            try {
                HashMap map = this.f14612a;
                zzemdVar = (zzemd) map.get(str);
                if (zzemdVar == null) {
                    zzemdVar = new zzemd(this.f14613b.m6082a(jSONObject, str), new zzenq(), str);
                    map.put(str, zzemdVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzemdVar;
    }
}
