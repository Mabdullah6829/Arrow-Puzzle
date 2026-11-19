package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaie implements zzaid {

    /* JADX INFO: renamed from: a */
    public static final zzpo f22203a = new zzpo(zzagr.f22154d, 6);

    @Override // com.google.android.gms.internal.measurement.zzaid
    /* JADX INFO: renamed from: a */
    public final long mo9795a() {
        return ((Long) f22203a.m10587b("measurement.test.long_flag", 4, -1L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaid
    /* JADX INFO: renamed from: b */
    public final String mo9796b() {
        return (String) f22203a.m10588c(5, "measurement.test.string_flag", "---").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzaid
    /* JADX INFO: renamed from: d */
    public final long mo9797d() {
        return ((Long) f22203a.m10587b("measurement.test.int_flag", 3, -2L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaid
    public final boolean zza() {
        return ((Boolean) f22203a.m10586a(0, "measurement.test.boolean_flag", false).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaid
    public final long zzb() {
        return ((Long) f22203a.m10587b("measurement.test.cached_long_flag", 1, -1L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaid
    public final double zzc() {
        zzpo zzpoVar = f22203a;
        AtomicReferenceArray atomicReferenceArray = zzpoVar.f22739a;
        zzom zzomVar = (zzom) atomicReferenceArray.get(2);
        if (zzomVar == null) {
            zznz zznzVar = new zznz("measurement.test.double_flag", zzpoVar.f22740b.f22690a);
            while (!atomicReferenceArray.compareAndSet(2, null, zznzVar)) {
                if (atomicReferenceArray.get(2) != null) {
                    zzomVar = (zzom) atomicReferenceArray.get(2);
                    zzomVar.getClass();
                }
            }
            zzomVar = zznzVar;
        }
        return ((Double) zzomVar.get()).doubleValue();
    }
}
