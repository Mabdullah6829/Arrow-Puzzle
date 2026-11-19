package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdg extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Bundle f22366w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzez f22367x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzez zzezVar, Bundle bundle) {
        super(zzezVar, true);
        this.f22366w = bundle;
        Objects.requireNonNull(zzezVar);
        this.f22367x = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22367x.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.setConditionalUserProperty(this.f22366w, this.f22452s);
    }
}
