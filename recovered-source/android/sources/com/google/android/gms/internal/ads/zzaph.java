package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaph implements Comparable {

    /* JADX INFO: renamed from: s */
    public final int f6388s;

    /* JADX INFO: renamed from: t */
    public final zzapc f6389t;

    public zzaph(int i2, zzapc zzapcVar) {
        this.f6388s = i2;
        this.f6389t = zzapcVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.f6388s, ((zzaph) obj).f6388s);
    }
}
