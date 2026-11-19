package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class zzew extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Activity f22469w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzcm f22470x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ zzey f22471y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzew(zzey zzeyVar, Activity activity, zzcm zzcmVar) {
        super(zzeyVar.f22474s, true);
        this.f22469w = activity;
        this.f22470x = zzcmVar;
        this.f22471y = zzeyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22471y.f22474s.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.onActivitySaveInstanceStateByScionActivityInfo(zzdd.m9836w(this.f22469w), this.f22470x, this.f22453t);
    }
}
