package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdi extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String f22372w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f22373x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ zzcm f22374y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ zzez f22375z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdi(zzez zzezVar, String str, String str2, zzcm zzcmVar) {
        super(zzezVar, true);
        this.f22372w = str;
        this.f22373x = str2;
        this.f22374y = zzcmVar;
        Objects.requireNonNull(zzezVar);
        this.f22375z = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22375z.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.getConditionalUserProperties(this.f22372w, this.f22373x, this.f22374y);
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: b */
    public final void mo9838b() {
        this.f22374y.zzb(null);
    }
}
