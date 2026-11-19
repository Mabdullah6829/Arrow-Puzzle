package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdl extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Boolean f22382w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzez f22383x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdl(zzez zzezVar, Boolean bool) {
        super(zzezVar, true);
        this.f22382w = bool;
        Objects.requireNonNull(zzezVar);
        this.f22383x = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22383x.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.setMeasurementEnabled(this.f22382w.booleanValue(), this.f22452s);
    }
}
