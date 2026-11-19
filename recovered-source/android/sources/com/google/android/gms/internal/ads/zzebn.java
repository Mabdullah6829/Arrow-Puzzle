package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzebn implements zzebc {

    /* JADX INFO: renamed from: a */
    public final long f13504a;

    /* JADX INFO: renamed from: b */
    public final zzets f13505b;

    public zzebn(long j2, Context context, zzebg zzebgVar, zzcnq zzcnqVar, String str) {
        this.f13504a = j2;
        zzcpy zzcpyVar = (zzcpy) zzcnqVar.mo5698q();
        zzcpyVar.mo5780b(context);
        zzcpyVar.f11132d = new com.google.android.gms.ads.internal.client.zzr();
        zzcpyVar.mo5778D(str);
        zzets zzetsVarZza = ((zzcpz) zzcpyVar.zza()).zza();
        this.f13505b = zzetsVarZza;
        zzetsVarZza.mo2845M3(new zzebm(this, zzebgVar));
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    /* JADX INFO: renamed from: a */
    public final void mo6142a(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.f13505b.mo2850Z(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    public final void zzb() {
        this.f13505b.mo2844I3(new ObjectWrapper(null));
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    public final void zzc() {
        this.f13505b.zzc();
    }
}
