package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class zzev extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Activity f22467w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzey f22468x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzev(zzey zzeyVar, Activity activity) {
        super(zzeyVar.f22474s, true);
        this.f22467w = activity;
        this.f22468x = zzeyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22468x.f22474s.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.onActivityStoppedByScionActivityInfo(zzdd.m9836w(this.f22467w), this.f22453t);
    }
}
