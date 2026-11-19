package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdw extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ zzcm f22403w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzez f22404x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdw(zzez zzezVar, zzcm zzcmVar) {
        super(zzezVar, true);
        this.f22403w = zzcmVar;
        Objects.requireNonNull(zzezVar);
        this.f22404x = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22404x.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.generateEventId(this.f22403w);
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: b */
    public final void mo9838b() {
        this.f22403w.zzb(null);
    }
}
