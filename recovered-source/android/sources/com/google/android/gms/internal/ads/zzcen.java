package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcen implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f9847a;

    /* JADX INFO: renamed from: b */
    public final zzcea f9848b;

    public zzcen(zzina zzinaVar, zzcea zzceaVar) {
        this.f9847a = zzinaVar;
        this.f9848b = zzceaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Context context = (Context) this.f9847a.f20011a;
        zzcea zzceaVar = this.f9848b;
        return new zzcem(context, new zzcdz((Clock) zzceaVar.f9811a.f20011a, (zzcdx) zzceaVar.f9812b.zzb()));
    }
}
