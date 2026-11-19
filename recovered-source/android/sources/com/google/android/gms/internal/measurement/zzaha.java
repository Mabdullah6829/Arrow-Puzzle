package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaha implements zzagz {

    /* JADX INFO: renamed from: a */
    public static final zzom f22164a;

    /* JADX INFO: renamed from: b */
    public static final zzom f22165b;

    static {
        zzog zzogVar = zzagr.f22154d;
        f22164a = zzogVar.m10575a("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f22165b = zzogVar.m10575a("measurement.set_default_event_parameters.fix_service_request_ordering", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzagz
    public final boolean zza() {
        return ((Boolean) ((zznp) f22164a).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagz
    public final boolean zzb() {
        return ((Boolean) ((zznp) f22165b).get()).booleanValue();
    }
}
