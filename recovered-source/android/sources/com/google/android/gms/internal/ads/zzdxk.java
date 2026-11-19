package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxk {

    /* JADX INFO: renamed from: a */
    public final zzfmc f13249a;

    /* JADX INFO: renamed from: b */
    public final zzdxh f13250b;

    public zzdxk(zzfmc zzfmcVar, zzdxh zzdxhVar) {
        this.f13249a = zzfmcVar;
        this.f13250b = zzdxhVar;
    }

    /* JADX INFO: renamed from: a */
    public final zzfme m6082a(JSONObject jSONObject, String str) throws zzfln {
        zzbvm zzbvmVarMo5154m;
        zzdxh zzdxhVar = this.f13250b;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbvmVarMo5154m = new zzbwk(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbvmVarMo5154m = new zzbwk(new zzbyb());
            } else {
                zzbvj zzbvjVar = (zzbvj) this.f13249a.f16104c.get();
                if (zzbvjVar == null) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Unexpected call to adapter creator.");
                    throw new RemoteException();
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (zzbvjVar.mo5152D(string)) {
                            zzbvmVarMo5154m = zzbvjVar.mo5154m("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else {
                            zzbvmVarMo5154m = zzbvjVar.mo5153G(string) ? zzbvjVar.mo5154m(string) : zzbvjVar.mo5154m("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3071d("Invalid custom event.", e);
                        zzbvmVarMo5154m = zzbvjVar.mo5154m(str);
                    }
                } else {
                    zzbvmVarMo5154m = zzbvjVar.mo5154m(str);
                }
            }
            zzfme zzfmeVar = new zzfme(zzbvmVarMo5154m);
            zzdxhVar.m6080a(str, zzfmeVar);
            return zzfmeVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8132Ha)).booleanValue()) {
                zzdxhVar.m6080a(str, null);
            }
            throw new zzfln(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public final zzbxi m6083b(String str) throws RemoteException {
        zzbvj zzbvjVar = (zzbvj) this.f13249a.f16104c.get();
        if (zzbvjVar == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Unexpected call to adapter creator.");
            throw new RemoteException();
        }
        zzbxi zzbxiVarMo5155y = zzbvjVar.mo5155y(str);
        zzdxh zzdxhVar = this.f13250b;
        synchronized (zzdxhVar) {
            if (zzdxhVar.f13247a.containsKey(str)) {
                return zzbxiVarMo5155y;
            }
            try {
                zzdxhVar.f13247a.put(str, new zzdxg(str, zzbxiVarMo5155y.mo5244b(), zzbxiVarMo5155y.mo5246c(), true));
                return zzbxiVarMo5155y;
            } catch (Throwable unused) {
                return zzbxiVarMo5155y;
            }
        }
    }
}
