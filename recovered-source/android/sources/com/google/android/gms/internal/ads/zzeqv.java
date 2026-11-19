package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeqv implements zzemc {

    /* JADX INFO: renamed from: a */
    public final zzerz f14674a;

    /* JADX INFO: renamed from: b */
    public final zzdxk f14675b;

    public zzeqv(zzerz zzerzVar, zzdxk zzdxkVar) {
        this.f14674a = zzerzVar;
        this.f14675b = zzdxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemc
    /* JADX INFO: renamed from: a */
    public final zzemd mo6286a(JSONObject jSONObject, String str) {
        zzbxi zzbxiVarM6083b;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8625l2)).booleanValue()) {
            try {
                zzbxiVarM6083b = this.f14675b.m6083b(str);
            } catch (RemoteException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Coundn't create RTB adapter: ", e);
            }
        } else {
            ConcurrentHashMap concurrentHashMap = this.f14674a.f14752a;
            zzbxiVarM6083b = concurrentHashMap.containsKey(str) ? (zzbxi) concurrentHashMap.get(str) : null;
        }
        if (zzbxiVarM6083b == null) {
            return null;
        }
        return new zzemd(zzbxiVarM6083b, new zzenp(), str);
    }
}
