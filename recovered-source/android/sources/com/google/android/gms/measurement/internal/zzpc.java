package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzpc {
    com.google.android.gms.internal.measurement.zzid zza;
    List zzb;
    List zzc;
    long zzd;
    final /* synthetic */ zzpg zze;

    public /* synthetic */ zzpc(zzpg zzpgVar, byte[] bArr) {
        Objects.requireNonNull(zzpgVar);
        this.zze = zzpgVar;
    }

    private static final long zzb(com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        return ((zzhsVar.m10129H() / 1000) / 60) / 60;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1 A[RETURN] */
    public final boolean zza(long j2, com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        com.google.android.gms.internal.measurement.zzid zzidVar;
        Preconditions.m3544h(zzhsVar);
        if (this.zzc == null) {
            this.zzc = new ArrayList();
        }
        if (this.zzb == null) {
            this.zzb = new ArrayList();
        }
        if (this.zzc.isEmpty() || zzb((com.google.android.gms.internal.measurement.zzhs) this.zzc.get(0)) == zzb(zzhsVar)) {
            long jMo9567f = this.zzd + ((long) zzhsVar.mo9567f());
            zzpg zzpgVar = this.zze;
            if (!zzpgVar.zzd().zzp(null, zzfy.zzaY)) {
                zzpgVar.zzd();
                if (jMo9567f < zzal.zzG()) {
                    this.zzd = jMo9567f;
                    this.zzc.add(zzhsVar);
                    this.zzb.add(Long.valueOf(j2));
                    zzidVar = this.zza;
                    if (this.zzc.size() < Math.max(1, zzpgVar.zzd().zzm(zzidVar != null ? zzidVar.m10220A() : null, zzfy.zzj))) {
                        return true;
                    }
                }
            } else if (this.zzc.isEmpty()) {
                this.zzd = jMo9567f;
                this.zzc.add(zzhsVar);
                this.zzb.add(Long.valueOf(j2));
                zzidVar = this.zza;
                if (this.zzc.size() < Math.max(1, zzpgVar.zzd().zzm(zzidVar != null ? zzidVar.m10220A() : null, zzfy.zzj))) {
                    return true;
                }
            } else {
                zzpgVar.zzd();
                if (jMo9567f < zzal.zzG()) {
                    this.zzd = jMo9567f;
                    this.zzc.add(zzhsVar);
                    this.zzb.add(Long.valueOf(j2));
                    zzidVar = this.zza;
                    if (this.zzc.size() < Math.max(1, zzpgVar.zzd().zzm(zzidVar != null ? zzidVar.m10220A() : null, zzfy.zzj))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
