package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzoa {

    @VisibleForTesting
    protected long zza;

    @VisibleForTesting
    protected long zzb;
    final /* synthetic */ zzoc zzc;
    private final zzaz zzd;

    public zzoa(zzoc zzocVar) {
        Objects.requireNonNull(zzocVar);
        this.zzc = zzocVar;
        this.zzd = new zznz(this, zzocVar.zzu);
        long jMo3639a = zzocVar.zzu.zzba().mo3639a();
        this.zza = jMo3639a;
        this.zzb = jMo3639a;
    }

    @WorkerThread
    public final void zza(long j2) {
        this.zzc.zzg();
        this.zzd.zzd();
        this.zza = j2;
        this.zzb = j2;
    }

    @WorkerThread
    public final void zzb(long j2) {
        this.zzd.zzd();
    }

    public final void zzc() {
        this.zzd.zzd();
        long jMo3639a = this.zzc.zzu.zzba().mo3639a();
        this.zza = jMo3639a;
        this.zzb = jMo3639a;
    }

    @WorkerThread
    public final boolean zzd(boolean z, boolean z2, long j2) {
        zzoc zzocVar = this.zzc;
        zzocVar.zzg();
        zzocVar.zzb();
        if (zzocVar.zzu.zzB()) {
            zzic zzicVar = zzocVar.zzu;
            zzicVar.zzd().zzk.zzb(zzicVar.zzba().currentTimeMillis());
        }
        long j3 = j2 - this.zza;
        if (!z && j3 < 1000) {
            zzocVar.zzu.zzaW().zzk().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j3));
            return false;
        }
        if (!z2) {
            j3 = j2 - this.zzb;
            this.zzb = j2;
        }
        zzic zzicVar2 = zzocVar.zzu;
        zzicVar2.zzaW().zzk().zzb("Recording user engagement, ms", Long.valueOf(j3));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j3);
        boolean z3 = !zzicVar2.zzc().zzv();
        zzic zzicVar3 = zzocVar.zzu;
        zzpp.zzay(zzicVar3.zzs().zzh(z3), bundle, true);
        if (!z2) {
            zzicVar3.zzj().zzE("auto", "_e", bundle);
        }
        this.zza = j2;
        zzaz zzazVar = this.zzd;
        zzazVar.zzd();
        zzazVar.zzb(((Long) zzfy.zzap.zzb(null)).longValue());
        return true;
    }
}
