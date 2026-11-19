package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbkt;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzcgb;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public final class zzd {
    /* JADX INFO: renamed from: a */
    public static void m3149a(Context context) {
        boolean z;
        Object obj = com.google.android.gms.ads.internal.util.client.zzl.f3424b;
        if (((Boolean) zzbkt.f9016a.m5057c()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    synchronized (com.google.android.gms.ads.internal.util.client.zzl.f3424b) {
                        z = com.google.android.gms.ads.internal.util.client.zzl.f3425c;
                    }
                    if (z) {
                        return;
                    }
                    ListenableFuture listenableFutureMo3108b = new zzc(context).mo3108b();
                    int i2 = zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3072e("Updating ad debug logging enablement.");
                    zzcgb.m5394a(listenableFutureMo3108b, "AdDebugLogUpdater.updateEnablement", zzcfy.f9953h);
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Fail to determine debug setting.", e);
            }
        }
    }
}
