package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdj extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String f22376w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzez f22377x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdj(zzez zzezVar, String str) {
        super(zzezVar, true);
        this.f22376w = str;
        Objects.requireNonNull(zzezVar);
        this.f22377x = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22377x.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.setUserId(this.f22376w, this.f22452s);
    }
}
