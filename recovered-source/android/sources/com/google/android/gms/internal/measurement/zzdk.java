package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdk extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ zzdd f22378w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f22379x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f22380y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ zzez f22381z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdk(zzez zzezVar, zzdd zzddVar, String str, String str2) {
        super(zzezVar, true);
        this.f22378w = zzddVar;
        this.f22379x = str;
        this.f22380y = str2;
        Objects.requireNonNull(zzezVar);
        this.f22381z = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22381z.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.setCurrentScreenByScionActivityInfo(this.f22378w, this.f22379x, this.f22380y, this.f22452s);
    }
}
