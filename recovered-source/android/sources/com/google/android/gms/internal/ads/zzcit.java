package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcit implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final zzcis f10174a;

    public zzcit(zzcis zzcisVar) {
        this.f10174a = zzcisVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo5095a(Object obj, Map map) {
        String str = (String) map.get("action");
        if (str == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Action missing from video GMSG.");
            return;
        }
        if (str.equals("src")) {
            String str2 = (String) map.get("src");
            if (str2 == null) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("src missing from video GMSG.");
            } else {
                zzdsx zzdsxVar = (zzdsx) this.f10174a;
                Bundle bundle = new Bundle();
                bundle.putString("mediaUrl", str2);
                zzdsxVar.f12853a.m5397a(bundle);
            }
        }
    }
}
