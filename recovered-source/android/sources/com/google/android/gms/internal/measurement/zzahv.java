package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahv implements zzahu {

    /* JADX INFO: renamed from: a */
    public static final zzom f22191a;

    /* JADX INFO: renamed from: b */
    public static final zzom f22192b;

    static {
        zzog zzogVar = zzagr.f22154d;
        f22191a = zzogVar.m10575a("45753512", false);
        f22192b = zzogVar.m10575a("measurement.gbraid_campaign.stop_lgclid", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzahu
    public final boolean zza() {
        return ((Boolean) ((zznp) f22191a).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzahu
    public final boolean zzb() {
        return ((Boolean) ((zznp) f22192b).get()).booleanValue();
    }
}
