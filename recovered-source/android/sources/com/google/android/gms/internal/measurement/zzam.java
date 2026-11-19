package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzam implements zzao {
    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: a */
    public final Boolean mo9579a() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: b */
    public final Iterator mo9580b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: d */
    public final Double mo9581d() {
        return Double.valueOf(0.0d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof zzam;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: k */
    public final zzao mo9584k(String str, zzg zzgVar, ArrayList arrayList) {
        throw new IllegalStateException("null has no function ".concat(str));
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: r */
    public final zzao mo9588r() {
        return zzao.f22238l;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return "null";
    }
}
