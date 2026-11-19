package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class zzes extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Activity f22461w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzey f22462x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzes(zzey zzeyVar, Activity activity) {
        super(zzeyVar.f22474s, true);
        this.f22461w = activity;
        this.f22462x = zzeyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22462x.f22474s.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.onActivityStartedByScionActivityInfo(zzdd.m9836w(this.f22461w), this.f22453t);
    }
}
