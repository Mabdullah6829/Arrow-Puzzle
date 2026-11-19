package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaih implements zzaig {

    /* JADX INFO: renamed from: a */
    public static final zzpo f22206a = new zzpo(zzagr.f22154d, 11);

    @Override // com.google.android.gms.internal.measurement.zzaig
    /* JADX INFO: renamed from: a */
    public final boolean mo9800a() {
        return ((Boolean) f22206a.m10586a(6, "measurement.rb.attribution.service", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    /* JADX INFO: renamed from: b */
    public final boolean mo9801b() {
        return ((Boolean) f22206a.m10586a(7, "measurement.rb.attribution.enable_trigger_redaction", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    /* JADX INFO: renamed from: c */
    public final boolean mo9802c() {
        return ((Boolean) f22206a.m10586a(8, "measurement.rb.attribution.uuid_generation", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    /* JADX INFO: renamed from: d */
    public final boolean mo9803d() {
        return ((Boolean) f22206a.m10586a(4, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zzb() {
        return ((Boolean) f22206a.m10586a(1, "measurement.rb.attribution.client2", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zzc() {
        return ((Boolean) f22206a.m10586a(2, "measurement.rb.attribution.service.trigger_uris_high_priority", true).get()).booleanValue();
    }
}
