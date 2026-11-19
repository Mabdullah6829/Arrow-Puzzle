package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzob {
    final /* synthetic */ zzoc zza;

    public zzob(zzoc zzocVar) {
        Objects.requireNonNull(zzocVar);
        this.zza = zzocVar;
    }

    @WorkerThread
    public final void zza() {
        zzoc zzocVar = this.zza;
        zzocVar.zzg();
        zzic zzicVar = zzocVar.zzu;
        if (zzicVar.zzd().zzo(zzicVar.zzba().currentTimeMillis())) {
            zzicVar.zzd().zzg.zzb(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                zzicVar.zzaW().zzk().zza("Detected application was in foreground");
                zzc(zzicVar.zzba().currentTimeMillis(), zzicVar.zzc().zzp(null, zzfy.zzbe) ? zzicVar.zzba().mo3639a() : 0L, false);
            }
        }
    }

    @WorkerThread
    public final void zzb(long j2, long j3, boolean z) {
        zzoc zzocVar = this.zza;
        zzocVar.zzg();
        zzocVar.zzj();
        zzic zzicVar = zzocVar.zzu;
        if (zzicVar.zzd().zzo(j2)) {
            zzicVar.zzd().zzg.zzb(true);
            zzocVar.zzu.zzv().zzi();
        }
        zzicVar.zzd().zzk.zzb(j2);
        if (zzicVar.zzd().zzg.zza()) {
            zzc(j2, j3, z);
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final void zzc(long j2, long j3, boolean z) {
        zzoc zzocVar = this.zza;
        zzocVar.zzg();
        if (zzocVar.zzu.zzB()) {
            zzic zzicVar = zzocVar.zzu;
            zzicVar.zzd().zzk.zzb(j2);
            zzicVar.zzaW().zzk().zzb("Session started, time", Long.valueOf(zzicVar.zzba().mo3639a()));
            long j4 = j2 / 1000;
            zzic zzicVar2 = zzocVar.zzu;
            zzicVar2.zzj().zzM("auto", "_sid", Long.valueOf(j4), j2);
            zzicVar.zzd().zzl.zzb(j4);
            zzicVar.zzd().zzg.zzb(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j4);
            zzicVar2.zzj().zzF("auto", "_s", j2, j3, bundle);
            String strZza = zzicVar.zzd().zzq.zza();
            if (TextUtils.isEmpty(strZza)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strZza);
            zzicVar2.zzj().zzF("auto", "_ssr", j2, j3, bundle2);
        }
    }
}
