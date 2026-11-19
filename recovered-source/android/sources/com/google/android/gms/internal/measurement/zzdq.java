package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdq extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String f22392w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzez f22393x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdq(zzez zzezVar, String str) {
        super(zzezVar, true);
        this.f22392w = str;
        Objects.requireNonNull(zzezVar);
        this.f22393x = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22393x.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.beginAdUnitExposure(this.f22392w, this.f22453t);
    }
}
