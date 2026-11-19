package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes2.dex */
public final class zzoc extends zzg {
    protected final zzob zza;
    protected final zzoa zzb;
    protected final zzny zzc;
    private Handler zzd;
    private boolean zze;

    public zzoc(zzic zzicVar) {
        super(zzicVar);
        this.zze = true;
        this.zza = new zzob(this);
        this.zzb = new zzoa(this);
        this.zzc = new zzny(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final void zzj() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.measurement.zzcl(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    @WorkerThread
    public final void zzh(boolean z) {
        zzg();
        this.zze = z;
    }

    @WorkerThread
    public final boolean zzi() {
        zzg();
        return this.zze;
    }

    public final /* synthetic */ void zzk(long j2) {
        zzg();
        zzj();
        zzic zzicVar = this.zzu;
        zzicVar.zzaW().zzk().zzb("Activity resumed, time", Long.valueOf(j2));
        if (zzicVar.zzc().zzp(null, zzfy.zzaS)) {
            if (zzicVar.zzc().zzv() || this.zze) {
                this.zzb.zza(j2);
            }
        } else if (zzicVar.zzc().zzv() || zzicVar.zzd().zzn.zza()) {
            this.zzb.zza(j2);
        }
        this.zzc.zza();
        zzob zzobVar = this.zza;
        zzoc zzocVar = zzobVar.zza;
        zzocVar.zzg();
        if (zzocVar.zzu.zzB()) {
            zzic zzicVar2 = zzocVar.zzu;
            zzobVar.zzb(zzicVar2.zzba().currentTimeMillis(), zzicVar2.zzc().zzp(null, zzfy.zzbe) ? zzicVar2.zzba().mo3639a() : 0L, false);
        }
    }

    public final /* synthetic */ void zzl(long j2) {
        zzg();
        zzj();
        zzic zzicVar = this.zzu;
        zzicVar.zzaW().zzk().zzb("Activity paused, time", Long.valueOf(j2));
        this.zzc.zzb(j2);
        if (zzicVar.zzc().zzv()) {
            this.zzb.zzb(j2);
        }
    }

    public final /* synthetic */ Handler zzm() {
        return this.zzd;
    }
}
