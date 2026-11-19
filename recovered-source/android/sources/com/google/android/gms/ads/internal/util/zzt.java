package com.google.android.gms.ads.internal.util;

import android.os.Process;
import android.webkit.CookieManager;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzclb;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzclx;
import com.google.android.gms.internal.ads.zzcmp;
import com.google.android.gms.internal.ads.zzekz;

/* JADX INFO: loaded from: classes.dex */
public class zzt extends zzz {
    /* JADX INFO: renamed from: h */
    public final CookieManager m3237h() {
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        zzs zzsVar = zztVar.f3703c;
        zzf zzfVar = zzs.f3626l;
        int iMyUid = Process.myUid();
        if (iMyUid != 0 && iMyUid != 1000) {
            try {
                return CookieManager.getInstance();
            } catch (Throwable th) {
                int i2 = zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Failed to obtain CookieManager.", th);
                zztVar.f3708h.m5385e("ApiLevelUtil.getCookieManager", th);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public zzclm mo3238i(zzclb zzclbVar, zzbhw zzbhwVar, boolean z, zzekz zzekzVar) {
        return new zzcmp((zzclx) zzclbVar, zzbhwVar, z, zzekzVar);
    }
}
