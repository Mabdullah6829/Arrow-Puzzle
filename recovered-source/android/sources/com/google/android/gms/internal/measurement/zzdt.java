package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdt extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Runnable f22397w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzez f22398x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdt(zzez zzezVar, Runnable runnable) {
        super(zzezVar, true);
        this.f22397w = runnable;
        Objects.requireNonNull(zzezVar);
        this.f22398x = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22398x.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.retrieveAndUploadBatches(new zzds(this, this.f22397w));
    }
}
