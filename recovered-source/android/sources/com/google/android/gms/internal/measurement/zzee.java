package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzee extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ zzcm f22425w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzez f22426x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzee(zzez zzezVar, zzcm zzcmVar) {
        super(zzezVar, true);
        this.f22425w = zzcmVar;
        Objects.requireNonNull(zzezVar);
        this.f22426x = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22426x.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.getAppInstanceId(this.f22425w);
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: b */
    public final void mo9838b() {
        this.f22425w.zzb(null);
    }
}
