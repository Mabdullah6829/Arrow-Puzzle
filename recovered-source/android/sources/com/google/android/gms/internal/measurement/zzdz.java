package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdz extends zzeo {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ zzez f22409A;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String f22410w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f22411x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f22412y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ zzcm f22413z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdz(zzez zzezVar, String str, String str2, boolean z, zzcm zzcmVar) {
        super(zzezVar, true);
        this.f22410w = str;
        this.f22411x = str2;
        this.f22412y = z;
        this.f22413z = zzcmVar;
        Objects.requireNonNull(zzezVar);
        this.f22409A = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22409A.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.getUserProperties(this.f22410w, this.f22411x, this.f22412y, this.f22413z);
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: b */
    public final void mo9838b() {
        this.f22413z.zzb(null);
    }
}
