package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class zzc extends zzb {

    /* JADX INFO: renamed from: b */
    public final Context f3553b;

    public zzc(Context context) {
        this.f3553b = context;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    /* JADX INFO: renamed from: a */
    public final void mo3002a() {
        boolean zM2776b;
        try {
            zM2776b = AdvertisingIdClient.m2776b(this.f3553b);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            int i2 = zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Fail to get isAdIdFakeForDebugLogging", e);
            zM2776b = false;
        }
        synchronized (com.google.android.gms.ads.internal.util.client.zzl.f3424b) {
            com.google.android.gms.ads.internal.util.client.zzl.f3425c = true;
            com.google.android.gms.ads.internal.util.client.zzl.f3426d = zM2776b;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(zM2776b).length() + 38);
        sb.append("Update ad debug logging enablement as ");
        sb.append(zM2776b);
        String string = sb.toString();
        int i3 = zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3073f(string);
    }
}
