package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzcuh implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzcui f11475a;

    public zzcuh(zzcui zzcuiVar) {
        this.f11475a = zzcuiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        zzcui zzcuiVar = this.f11475a;
        zzcuiVar.getClass();
        if (map == null) {
            return;
        }
        String str = (String) map.get("hashCode");
        if (TextUtils.isEmpty(str) || !str.equals(zzcuiVar.f11476a)) {
            return;
        }
        ((zzcfx) zzcuiVar.f11478c).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcug
            @Override // java.lang.Runnable
            public final void run() {
                zzcun zzcunVar = this.f11474s.f11475a.f11479d;
                synchronized (zzcunVar) {
                    zzcunVar.m5841b();
                    zzcunVar.f11494A = true;
                }
            }
        });
    }
}
