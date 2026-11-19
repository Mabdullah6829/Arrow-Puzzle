package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
final class zzea extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String f22415w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f22416x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ zzez f22417y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzez zzezVar, String str, Object obj) {
        super(zzezVar, false);
        this.f22415w = str;
        this.f22416x = obj;
        this.f22417y = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22417y.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.logHealthData(5, this.f22415w, new ObjectWrapper(this.f22416x), new ObjectWrapper(null), new ObjectWrapper(null));
    }
}
