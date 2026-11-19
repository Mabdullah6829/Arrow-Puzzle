package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzpa implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Bundle zzc;
    final /* synthetic */ zzpb zzd;

    public zzpa(zzpb zzpbVar, String str, String str2, Bundle bundle) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bundle;
        Objects.requireNonNull(zzpbVar);
        this.zzd = zzpbVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zzpg zzpgVar = this.zzd.zza;
        zzpp zzppVarZzt = zzpgVar.zzt();
        long jCurrentTimeMillis = zzpgVar.zzba().currentTimeMillis();
        long jMo3639a = zzpgVar.zzd().zzp(null, zzfy.zzbe) ? zzpgVar.zzba().mo3639a() : 0L;
        Bundle bundle = this.zzc;
        String str = this.zzb;
        String str2 = this.zza;
        zzbh zzbhVarZzaf = zzppVarZzt.zzaf(str2, str, bundle, "auto", jCurrentTimeMillis, jMo3639a, false, true);
        Preconditions.m3544h(zzbhVarZzaf);
        zzpgVar.zzD(zzbhVarZzaf, str2);
    }
}
