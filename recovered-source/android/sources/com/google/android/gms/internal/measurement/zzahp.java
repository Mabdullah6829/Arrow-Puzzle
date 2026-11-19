package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahp implements zzaho {

    /* JADX INFO: renamed from: a */
    public static final zzom f22183a;

    /* JADX INFO: renamed from: b */
    public static final zzom f22184b;

    /* JADX INFO: renamed from: c */
    public static final zzom f22185c;

    static {
        zzog zzogVar = zzagr.f22154d;
        f22183a = zzogVar.m10575a("measurement.audience.refresh_event_count_filters_timestamp", false);
        f22184b = zzogVar.m10575a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f22185c = zzogVar.m10575a("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzaho
    /* JADX INFO: renamed from: d */
    public final boolean mo9792d() {
        return ((Boolean) ((zznp) f22185c).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaho
    public final boolean zzb() {
        return ((Boolean) ((zznp) f22183a).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaho
    public final boolean zzc() {
        return ((Boolean) ((zznp) f22184b).get()).booleanValue();
    }
}
