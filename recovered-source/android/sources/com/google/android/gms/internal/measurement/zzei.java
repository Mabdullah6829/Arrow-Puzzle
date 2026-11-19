package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzei extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Bundle f22434w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzez f22435x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzei(zzez zzezVar, Bundle bundle) {
        super(zzezVar, true);
        this.f22434w = bundle;
        Objects.requireNonNull(zzezVar);
        this.f22435x = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22435x.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.setDefaultEventParameters(this.f22434w);
    }
}
