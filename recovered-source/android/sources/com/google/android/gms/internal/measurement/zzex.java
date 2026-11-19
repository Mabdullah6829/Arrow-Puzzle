package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class zzex extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Activity f22472w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzey f22473x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzex(zzey zzeyVar, Activity activity) {
        super(zzeyVar.f22474s, true);
        this.f22472w = activity;
        this.f22473x = zzeyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22473x.f22474s.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.onActivityDestroyedByScionActivityInfo(zzdd.m9836w(this.f22472w), this.f22453t);
    }
}
