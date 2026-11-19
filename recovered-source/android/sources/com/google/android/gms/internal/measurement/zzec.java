package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzec extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Bundle f22419w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzcm f22420x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ zzez f22421y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzec(zzez zzezVar, Bundle bundle, zzcm zzcmVar) {
        super(zzezVar, true);
        this.f22419w = bundle;
        this.f22420x = zzcmVar;
        Objects.requireNonNull(zzezVar);
        this.f22421y = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22421y.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.performAction(this.f22419w, this.f22420x, this.f22452s);
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: b */
    public final void mo9838b() {
        this.f22420x.zzb(null);
    }
}
