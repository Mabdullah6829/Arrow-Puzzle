package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzcly implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzcme f10486a;

    public zzcly(zzcme zzcmeVar) {
        this.f10486a = zzcmeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo5095a(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i2 = Integer.parseInt(str);
                zzcme zzcmeVar = this.f10486a;
                synchronized (zzcmeVar) {
                    try {
                        if (zzcmeVar.f10525c0 != i2) {
                            zzcmeVar.f10525c0 = i2;
                            zzcmeVar.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Exception occurred while getting webview content height", e);
            }
        }
    }
}
