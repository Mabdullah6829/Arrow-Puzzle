package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzed extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String f22422w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzcm f22423x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ zzez f22424y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzed(zzez zzezVar, String str, zzcm zzcmVar) {
        super(zzezVar, true);
        this.f22422w = str;
        this.f22423x = zzcmVar;
        Objects.requireNonNull(zzezVar);
        this.f22424y = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22424y.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.getMaxUserProperties(this.f22422w, this.f22423x);
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: b */
    public final void mo9838b() {
        this.f22423x.zzb(null);
    }
}
