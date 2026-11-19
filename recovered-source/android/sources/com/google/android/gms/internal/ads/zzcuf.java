package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzcuf implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzcui f11473a;

    public zzcuf(zzcui zzcuiVar) {
        this.f11473a = zzcuiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        zzcui zzcuiVar = this.f11473a;
        zzcuiVar.getClass();
        if (map == null) {
            return;
        }
        String str = (String) map.get("hashCode");
        if (TextUtils.isEmpty(str) || !str.equals(zzcuiVar.f11476a)) {
            return;
        }
        ((zzcfx) zzcuiVar.f11478c).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcue
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f11472s.f11473a.f11479d.m5840a();
            }
        });
    }
}
