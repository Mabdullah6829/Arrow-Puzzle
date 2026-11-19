package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzag implements zzao {

    /* JADX INFO: renamed from: s */
    public final zzao f22119s;

    /* JADX INFO: renamed from: t */
    public final String f22120t;

    public zzag() {
        this.f22119s = zzao.f22237k;
        this.f22120t = "return";
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: a */
    public final Boolean mo9579a() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: b */
    public final Iterator mo9580b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: d */
    public final Double mo9581d() {
        throw new IllegalStateException("Control is not a double");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzag)) {
            return false;
        }
        zzag zzagVar = (zzag) obj;
        return this.f22120t.equals(zzagVar.f22120t) && this.f22119s.equals(zzagVar.f22119s);
    }

    public final int hashCode() {
        return this.f22119s.hashCode() + (this.f22120t.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: k */
    public final zzao mo9584k(String str, zzg zzgVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: r */
    public final zzao mo9588r() {
        return new zzag(this.f22120t, this.f22119s.mo9588r());
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }

    public zzag(String str) {
        this.f22119s = zzao.f22237k;
        this.f22120t = str;
    }

    public zzag(String str, zzao zzaoVar) {
        this.f22119s = zzaoVar;
        this.f22120t = str;
    }
}
