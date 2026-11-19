package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.DefaultClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzceh {

    /* JADX INFO: renamed from: a */
    public static zzceh f9838a;

    /* JADX INFO: renamed from: b */
    public static synchronized zzceh m5372b(Context context) {
        try {
            zzceh zzcehVar = f9838a;
            if (zzcehVar != null) {
                return zzcehVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbix.m5032a(applicationContext);
            com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
            com.google.android.gms.ads.internal.util.zzj zzjVarM5387g = zztVar.f3708h.m5387g();
            zzjVarM5387g.m3182g(applicationContext);
            zzceb zzcebVar = new zzceb();
            applicationContext.getClass();
            zzcebVar.f9813a = applicationContext;
            DefaultClock defaultClock = zztVar.f3711k;
            defaultClock.getClass();
            zzcebVar.f9814b = defaultClock;
            zzcebVar.f9815c = zzjVarM5387g;
            zzcebVar.f9816d = zztVar.f3725y;
            zzceh zzcehVarM5356a = zzcebVar.m5356a();
            f9838a = zzcehVarM5356a;
            zzcdv zzcdvVar = (zzcdv) ((zzcec) zzcehVarM5356a).f9818c.zzb();
            SharedPreferences sharedPreferences = zzcdvVar.f9797b;
            sharedPreferences.registerOnSharedPreferenceChangeListener(zzcdvVar);
            zzcdvVar.onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
            zzbio zzbioVar = zzbix.f8557h1;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                zzcdvVar.onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
            } else {
                zzcdvVar.onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
            }
            final zzcem zzcemVar = (zzcem) ((zzcec) f9838a).f9820e.zzb();
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8455b1)).booleanValue()) {
                final HashMap mapM3200S = com.google.android.gms.ads.internal.util.zzs.m3200S((String) zzbaVar.f3098c.m5030a(zzbix.f8472c1));
                Iterator it = mapM3200S.keySet().iterator();
                while (it.hasNext()) {
                    zzcemVar.m5376a((String) it.next());
                }
                zzcek zzcekVar = new zzcek() { // from class: com.google.android.gms.internal.ads.zzcel
                    @Override // com.google.android.gms.internal.ads.zzcek
                    public final void zza(String str, String str2) {
                        zzcem zzcemVar2 = zzcemVar;
                        zzcemVar2.getClass();
                        HashMap map = mapM3200S;
                        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
                            zzcdz zzcdzVar = zzcemVar2.f9846d;
                            zzcdzVar.f9808b.m5355a(-1, zzcdzVar.f9807a.currentTimeMillis());
                        }
                    }
                };
                synchronized (zzcemVar) {
                    zzcemVar.f9844b.add(zzcekVar);
                }
            }
            return f9838a;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract zzcdz mo5357a();
}
