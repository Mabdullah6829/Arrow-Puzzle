package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzeh extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f22432w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzez f22433x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeh(zzez zzezVar, boolean z) {
        super(zzezVar, true);
        this.f22432w = z;
        Objects.requireNonNull(zzezVar);
        this.f22433x = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22433x.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.setDataCollectionEnabled(this.f22432w);
    }
}
