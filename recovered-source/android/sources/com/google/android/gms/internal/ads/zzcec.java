package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
final class zzcec extends zzceh {

    /* JADX INFO: renamed from: b */
    public final Clock f9817b;

    /* JADX INFO: renamed from: c */
    public final zzimy f9818c;

    /* JADX INFO: renamed from: d */
    public final zzimy f9819d;

    /* JADX INFO: renamed from: e */
    public final zzimy f9820e;

    public zzcec(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzj zzjVar, zzceg zzcegVar) {
        this.f9817b = clock;
        zzina zzinaVarM8549a = zzina.m8549a(context);
        zzina zzinaVarM8549a2 = zzina.m8549a(zzjVar);
        this.f9818c = zzimy.m8547a(new zzcdw(zzinaVarM8549a, zzinaVarM8549a2));
        zzina zzinaVarM8549a3 = zzina.m8549a(clock);
        zzimy zzimyVarM8547a = zzimy.m8547a(new zzcdy(zzinaVarM8549a3, zzinaVarM8549a2, zzina.m8549a(zzcegVar)));
        this.f9819d = zzimyVarM8547a;
        this.f9820e = zzimy.m8547a(new zzcen(zzinaVarM8549a, new zzcea(zzimyVarM8547a, zzinaVarM8549a3)));
    }

    @Override // com.google.android.gms.internal.ads.zzceh
    /* JADX INFO: renamed from: a */
    public final zzcdz mo5357a() {
        return new zzcdz(this.f9817b, (zzcdx) this.f9819d.zzb());
    }
}
