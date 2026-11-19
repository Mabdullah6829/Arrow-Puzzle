package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzat implements zzao {
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
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof zzat;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: k */
    public final zzao mo9584k(String str, zzg zzgVar, ArrayList arrayList) {
        throw new IllegalStateException("Undefined has no function ".concat(str));
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: r */
    public final zzao mo9588r() {
        return zzao.f22237k;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return "undefined";
    }
}
