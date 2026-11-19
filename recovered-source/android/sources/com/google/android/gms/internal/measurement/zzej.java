package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzej extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ zzep f22436w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzez f22437x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzej(zzez zzezVar, zzep zzepVar) {
        super(zzezVar, true);
        this.f22436w = zzepVar;
        Objects.requireNonNull(zzezVar);
        this.f22437x = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22437x.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.setEventInterceptor(this.f22436w);
    }
}
