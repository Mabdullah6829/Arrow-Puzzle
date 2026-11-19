package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaf implements zzao {

    /* JADX INFO: renamed from: s */
    public final boolean f22072s;

    public zzaf(Boolean bool) {
        this.f22072s = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: a */
    public final Boolean mo9579a() {
        return Boolean.valueOf(this.f22072s);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: b */
    public final Iterator mo9580b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: d */
    public final Double mo9581d() {
        return Double.valueOf(true != this.f22072s ? 0.0d : 1.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzaf) && this.f22072s == ((zzaf) obj).f22072s;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f22072s).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: k */
    public final zzao mo9584k(String str, zzg zzgVar, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.f22072s;
        if (zEquals) {
            return new zzas(Boolean.toString(z));
        }
        throw new IllegalArgumentException(Boolean.toString(z) + "." + str + " is not a function.");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: r */
    public final zzao mo9588r() {
        return new zzaf(Boolean.valueOf(this.f22072s));
    }

    public final String toString() {
        return String.valueOf(this.f22072s);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return Boolean.toString(this.f22072s);
    }
}
