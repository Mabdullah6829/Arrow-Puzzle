package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdf extends zzeo {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ zzez f22361A;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String f22362w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f22363x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f22364y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f22365z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdf(zzez zzezVar, String str, String str2, Object obj, boolean z) {
        super(zzezVar, true);
        this.f22362w = str;
        this.f22363x = str2;
        this.f22364y = obj;
        this.f22365z = z;
        Objects.requireNonNull(zzezVar);
        this.f22361A = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22361A.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.setUserProperty(this.f22362w, this.f22363x, new ObjectWrapper(this.f22364y), this.f22365z, this.f22452s);
    }
}
