package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
final class zzgtw extends zzgtp {

    /* JADX INFO: renamed from: s */
    public final Object f18183s;

    public zzgtw(Object obj) {
        this.f18183s = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgtp
    /* JADX INFO: renamed from: a */
    public final Object mo7116a() {
        return this.f18183s;
    }

    @Override // com.google.android.gms.internal.ads.zzgtp
    /* JADX INFO: renamed from: b */
    public final zzgtp mo7117b(zzgti zzgtiVar) {
        Object objApply = zzgtiVar.apply(this.f18183s);
        zzgtr.m7135h(objApply, "the Function passed to Optional.transform() must not return null.");
        return new zzgtw(objApply);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgtw) {
            return this.f18183s.equals(((zzgtw) obj).f18183s);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18183s.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.f18183s.toString();
        return AbstractC1456a.m2450q(new StringBuilder(string.length() + 13), "Optional.of(", string, ")");
    }
}
