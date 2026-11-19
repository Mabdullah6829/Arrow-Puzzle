package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzem extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ zzeq f22442w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzez f22443x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzem(zzez zzezVar, zzeq zzeqVar) {
        super(zzezVar, true);
        this.f22442w = zzeqVar;
        Objects.requireNonNull(zzezVar);
        this.f22443x = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22443x.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.unregisterOnMeasurementEventListener(this.f22442w);
    }
}
