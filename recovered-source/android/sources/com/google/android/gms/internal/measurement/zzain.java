package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzain implements zzaim {

    /* JADX INFO: renamed from: a */
    public static final zzom f22212a;

    /* JADX INFO: renamed from: b */
    public static final zzom f22213b;

    static {
        zzog zzogVar = zzagr.f22154d;
        f22212a = zzogVar.m10575a("measurement.experiment.enable_passthrough_experiment_reporting", true);
        f22213b = zzogVar.m10575a("measurement.experiment.enable_phenotype_experiment_reporting", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzaim
    public final boolean zza() {
        return ((Boolean) ((zznp) f22212a).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaim
    public final boolean zzb() {
        return ((Boolean) ((zznp) f22213b).get()).booleanValue();
    }
}
