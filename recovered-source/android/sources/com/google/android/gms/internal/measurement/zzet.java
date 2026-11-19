package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class zzet extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Activity f22463w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzey f22464x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzet(zzey zzeyVar, Activity activity) {
        super(zzeyVar.f22474s, true);
        this.f22463w = activity;
        this.f22464x = zzeyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22464x.f22474s.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.onActivityResumedByScionActivityInfo(zzdd.m9836w(this.f22463w), this.f22453t);
    }
}
