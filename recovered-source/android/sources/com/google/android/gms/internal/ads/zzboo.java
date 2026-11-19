package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzboo implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final zzbop f9202a;

    public zzboo(zzbop zzbopVar) {
        this.f9202a = zzbopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        String str = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("App event with no name parameter.");
        } else {
            this.f9202a.mo5097n0(str, (String) map.get("info"));
        }
    }
}
