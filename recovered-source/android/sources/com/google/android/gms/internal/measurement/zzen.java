package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class zzen extends zzeo {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ Bundle f22444A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ boolean f22445B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ boolean f22446C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ zzez f22447D;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Long f22448w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Long f22449x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f22450y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f22451z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzen(zzez zzezVar, Long l2, Long l3, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(zzezVar, true);
        this.f22448w = l2;
        this.f22449x = l3;
        this.f22450y = str;
        this.f22451z = str2;
        this.f22444A = bundle;
        this.f22445B = z;
        this.f22446C = z2;
        this.f22447D = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        Long l2 = this.f22448w;
        long jLongValue = l2 == null ? this.f22452s : l2.longValue();
        long j2 = this.f22449x == null ? this.f22453t : 0L;
        zzcp zzcpVar = this.f22447D.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.logEventWithElapsedTime(this.f22450y, this.f22451z, this.f22444A, this.f22445B, this.f22446C, jLongValue, j2);
    }
}
