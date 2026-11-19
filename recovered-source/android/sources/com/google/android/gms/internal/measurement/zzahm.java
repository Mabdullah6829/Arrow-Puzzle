package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahm implements zzahl {

    /* JADX INFO: renamed from: a */
    public static final zzom f22179a;

    /* JADX INFO: renamed from: b */
    public static final zzom f22180b;

    static {
        zzog zzogVar = zzagr.f22154d;
        f22179a = zzogVar.m10575a("measurement.service.store_null_safelist", true);
        f22180b = zzogVar.m10575a("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzahl
    public final boolean zzb() {
        return ((Boolean) ((zznp) f22179a).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzahl
    public final boolean zzc() {
        return ((Boolean) ((zznp) f22180b).get()).booleanValue();
    }
}
