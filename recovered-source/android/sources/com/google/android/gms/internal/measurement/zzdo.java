package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdo extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ long f22387w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzez f22388x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdo(zzez zzezVar, long j2) {
        super(zzezVar, true);
        this.f22387w = j2;
        Objects.requireNonNull(zzezVar);
        this.f22388x = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22388x.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.setSessionTimeoutDuration(this.f22387w);
    }
}
