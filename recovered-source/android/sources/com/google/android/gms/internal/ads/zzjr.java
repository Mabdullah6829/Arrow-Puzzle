package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzjr implements zzguj {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Context f20146s;

    public /* synthetic */ zzjr(Context context) {
        this.f20146s = context;
    }

    @Override // com.google.android.gms.internal.ads.zzguj
    public final Object zza() {
        zzabv zzabvVar;
        int i2 = zzjv.f20150A;
        Context context = this.f20146s;
        zzgwt zzgwtVar = zzabv.f4863F;
        synchronized (zzabv.class) {
            try {
                if (zzabv.f4869L == null) {
                    Context applicationContext = context == null ? null : context.getApplicationContext();
                    zzff zzffVar = zzdp.f12520a;
                    HashMap map = new HashMap(8);
                    map.put(0, 1000000L);
                    map.put(2, -9223372036854775807L);
                    map.put(3, -9223372036854775807L);
                    map.put(4, -9223372036854775807L);
                    map.put(5, -9223372036854775807L);
                    map.put(10, -9223372036854775807L);
                    map.put(9, -9223372036854775807L);
                    map.put(7, -9223372036854775807L);
                    zzabv.f4869L = new zzabv(applicationContext, map);
                }
                zzabvVar = zzabv.f4869L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzabvVar;
    }
}
