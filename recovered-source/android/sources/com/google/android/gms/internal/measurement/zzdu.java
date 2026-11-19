package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdu extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ zzcm f22399w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzez f22400x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdu(zzez zzezVar, zzcm zzcmVar) {
        super(zzezVar, true);
        this.f22399w = zzcmVar;
        Objects.requireNonNull(zzezVar);
        this.f22400x = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22400x.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.getGmpAppId(this.f22399w);
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: b */
    public final void mo9838b() {
        this.f22399w.zzb(null);
    }
}
