package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzgfa implements Comparable {

    /* JADX INFO: renamed from: s */
    public final Runnable f17126s;

    /* JADX INFO: renamed from: t */
    public final long f17127t;

    public zzgfa(Runnable runnable, long j2) {
        this.f17126s = runnable;
        this.f17127t = j2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f17127t, ((zzgfa) obj).f17127t);
    }
}
