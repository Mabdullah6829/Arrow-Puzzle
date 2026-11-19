package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbom implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final zzbon f9201a;

    public zzbom(zzbon zzbonVar) {
        this.f9201a = zzbonVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        zzbon zzbonVar = this.f9201a;
        if (zzbonVar == null) {
            return;
        }
        String str = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3072e("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleM3124h = null;
        if (map.containsKey("info")) {
            try {
                bundleM3124h = com.google.android.gms.ads.internal.util.zzbp.m3124h(new JSONObject((String) map.get("info")));
            } catch (JSONException e) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundleM3124h != null) {
            zzbonVar.mo5096e(bundleM3124h, str);
        } else {
            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("Failed to convert ad metadata to Bundle.");
        }
    }
}
