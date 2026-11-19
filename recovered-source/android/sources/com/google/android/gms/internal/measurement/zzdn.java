package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdn extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ zzez f22386w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdn(zzez zzezVar) {
        super(zzezVar, true);
        Objects.requireNonNull(zzezVar);
        this.f22386w = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzez zzezVar = this.f22386w;
        if (zzezVar.f22484i >= 170) {
            zzcp zzcpVar = zzezVar.f22483h;
            Preconditions.m3544h(zzcpVar);
            zzcpVar.resetAnalyticsDataWithElapsedTime(this.f22452s, this.f22453t);
        } else {
            zzcp zzcpVar2 = zzezVar.f22483h;
            Preconditions.m3544h(zzcpVar2);
            zzcpVar2.resetAnalyticsData(this.f22452s);
        }
    }
}
