package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class zzer extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Bundle f22458w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Activity f22459x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ zzey f22460y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzer(zzey zzeyVar, Bundle bundle, Activity activity) {
        super(zzeyVar.f22474s, true);
        this.f22458w = bundle;
        this.f22459x = activity;
        this.f22460y = zzeyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        Bundle bundle;
        Bundle bundle2 = this.f22458w;
        if (bundle2 != null) {
            bundle = new Bundle();
            if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = bundle2.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        zzcp zzcpVar = this.f22460y.f22474s.f22483h;
        Preconditions.m3544h(zzcpVar);
        Activity activity = this.f22459x;
        zzcpVar.onActivityCreatedByScionActivityInfo(zzdd.m9836w(activity), bundle, this.f22453t);
    }
}
