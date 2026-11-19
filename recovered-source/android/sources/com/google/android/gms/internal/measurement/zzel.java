package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzel extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ zzeq f22440w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzez f22441x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzel(zzez zzezVar, zzeq zzeqVar) {
        super(zzezVar, true);
        this.f22440w = zzeqVar;
        Objects.requireNonNull(zzezVar);
        this.f22441x = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22441x.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.registerOnMeasurementEventListener(this.f22440w);
    }
}
