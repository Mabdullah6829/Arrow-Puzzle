package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzeg extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ zzcm f22429w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f22430x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ zzez f22431y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeg(zzez zzezVar, zzcm zzcmVar, int i2) {
        super(zzezVar, true);
        this.f22429w = zzcmVar;
        this.f22430x = i2;
        Objects.requireNonNull(zzezVar);
        this.f22431y = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22431y.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.getTestFlag(this.f22429w, this.f22430x);
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: b */
    public final void mo9838b() {
        this.f22429w.zzb(null);
    }
}
