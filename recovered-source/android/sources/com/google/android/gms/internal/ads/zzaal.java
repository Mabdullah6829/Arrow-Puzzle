package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaal implements Comparable {

    /* JADX INFO: renamed from: s */
    public final boolean f4767s;

    /* JADX INFO: renamed from: t */
    public final boolean f4768t;

    public zzaal(zzv zzvVar, int i2) {
        this.f4767s = 1 == (zzvVar.f21051e & 1);
        this.f4768t = zzne.m8768m(i2, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zzaal zzaalVar = (zzaal) obj;
        return zzgwg.f18291a.mo7197d(this.f4768t, zzaalVar.f4768t).mo7197d(this.f4767s, zzaalVar.f4767s).mo7198e();
    }
}
