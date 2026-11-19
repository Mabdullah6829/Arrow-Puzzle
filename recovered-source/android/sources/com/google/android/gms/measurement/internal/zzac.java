package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzahn;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzac extends zzab {
    final /* synthetic */ zzad zza;
    private final com.google.android.gms.internal.measurement.zzfn zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzad zzadVar, String str, int i2, com.google.android.gms.internal.measurement.zzfn zzfnVar) {
        super(str, i2);
        Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
        this.zzh = zzfnVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final int zza() {
        return this.zzh.m9928B();
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final boolean zzc() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzd(Long l2, Long l3, com.google.android.gms.internal.measurement.zziu zziuVar, boolean z) {
        zzahn.m9791a();
        zzic zzicVar = this.zza.zzu;
        boolean zZzp = zzicVar.zzc().zzp(this.zzb, zzfy.zzaD);
        com.google.android.gms.internal.measurement.zzfn zzfnVar = this.zzh;
        boolean zM9931E = zzfnVar.m9931E();
        boolean zM9932F = zzfnVar.m9932F();
        boolean zM9934H = zzfnVar.m9934H();
        Object[] objArr = zM9931E || zM9932F || zM9934H;
        Boolean boolZze = null;
        boolZze = null;
        boolZze = null;
        boolZze = null;
        boolZze = null;
        if (z && objArr != true) {
            zzicVar.zzaW().zzk().zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), zzfnVar.m9927A() ? Integer.valueOf(zzfnVar.m9928B()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.zzfh zzfhVarM9930D = zzfnVar.m9930D();
        boolean zM9911F = zzfhVarM9930D.m9911F();
        if (zziuVar.m10424F()) {
            if (zzfhVarM9930D.m9908C()) {
                boolZze = zzab.zze(zzab.zzg(zziuVar.m10425G(), zzfhVarM9930D.m9909D()), zM9911F);
            } else {
                zzicVar.zzaW().zze().zzb("No number filter for long property. property", zzicVar.zzl().zzc(zziuVar.m10421C()));
            }
        } else if (zziuVar.m10428J()) {
            if (zzfhVarM9930D.m9908C()) {
                boolZze = zzab.zze(zzab.zzh(zziuVar.m10429K(), zzfhVarM9930D.m9909D()), zM9911F);
            } else {
                zzicVar.zzaW().zze().zzb("No number filter for double property. property", zzicVar.zzl().zzc(zziuVar.m10421C()));
            }
        } else if (!zziuVar.m10422D()) {
            zzicVar.zzaW().zze().zzb("User property has no value, property", zzicVar.zzl().zzc(zziuVar.m10421C()));
        } else if (zzfhVarM9930D.m9906A()) {
            boolZze = zzab.zze(zzab.zzf(zziuVar.m10423E(), zzfhVarM9930D.m9907B(), zzicVar.zzaW()), zM9911F);
        } else if (!zzfhVarM9930D.m9908C()) {
            zzicVar.zzaW().zze().zzb("No string or number filter defined. property", zzicVar.zzl().zzc(zziuVar.m10421C()));
        } else if (zzpk.zzm(zziuVar.m10423E())) {
            boolZze = zzab.zze(zzab.zzi(zziuVar.m10423E(), zzfhVarM9930D.m9909D()), zM9911F);
        } else {
            zzicVar.zzaW().zze().zzc("Invalid user property value for Numeric number filter. property, value", zzicVar.zzl().zzc(zziuVar.m10421C()), zziuVar.m10423E());
        }
        zzicVar.zzaW().zzk().zzb("Property filter result", boolZze == null ? "null" : boolZze);
        if (boolZze == null) {
            return false;
        }
        this.zzd = Boolean.TRUE;
        if (!zM9934H || boolZze.booleanValue()) {
            if (!z || zzfnVar.m9931E()) {
                this.zze = boolZze;
            }
            if (boolZze.booleanValue() && objArr != false && zziuVar.m10419A()) {
                long jM10420B = zziuVar.m10420B();
                if (l2 != null) {
                    jM10420B = l2.longValue();
                }
                if (zZzp && zzfnVar.m9931E() && !zzfnVar.m9932F() && l3 != null) {
                    jM10420B = l3.longValue();
                }
                if (zzfnVar.m9932F()) {
                    this.zzg = Long.valueOf(jM10420B);
                    return true;
                }
                this.zzf = Long.valueOf(jM10420B);
            }
        }
        return true;
    }
}
