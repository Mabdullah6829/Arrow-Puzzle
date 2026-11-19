package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzbz {

    /* JADX INFO: renamed from: a */
    public final HashMap f3550a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final ArrayList f3551b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final Context f3552c;

    public zzbz(Context context) {
        this.f3552c = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m3141a() {
        zzbio zzbioVar = zzbix.f8252Ob;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            final HashMap mapM3200S = zzs.m3200S((String) zzbaVar.f3098c.m5030a(zzbix.f8336Tb));
            for (String str : mapM3200S.keySet()) {
                synchronized (this) {
                    try {
                        HashMap map = this.f3550a;
                        if (!map.containsKey(str)) {
                            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f3552c) : this.f3552c.getSharedPreferences(str, 0);
                            zzbw zzbwVar = new zzbw(this, str);
                            map.put(str, zzbwVar);
                            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzbwVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            zzbx zzbxVar = new zzbx() { // from class: com.google.android.gms.ads.internal.util.zzby
                @Override // com.google.android.gms.ads.internal.util.zzbx
                public final void zza(String str2, String str3) {
                    HashMap map2 = mapM3200S;
                    if (map2.containsKey(str2) && ((Set) map2.get(str2)).contains(str3)) {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().m3190q(false);
                    }
                }
            };
            synchronized (this) {
                this.f3551b.add(zzbxVar);
            }
        }
    }
}
