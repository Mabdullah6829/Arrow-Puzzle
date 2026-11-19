package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzamw implements zzanc {

    /* JADX INFO: renamed from: a */
    public final zzagn f6057a;

    /* JADX INFO: renamed from: b */
    public final zzagm f6058b;

    /* JADX INFO: renamed from: c */
    public long f6059c = -1;

    /* JADX INFO: renamed from: d */
    public long f6060d = -1;

    public zzamw(zzagn zzagnVar, zzagm zzagmVar) {
        this.f6057a = zzagnVar;
        this.f6058b = zzagmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    /* JADX INFO: renamed from: a */
    public final void mo4227a(long j2) {
        long[] jArr = this.f6058b.f5248a;
        this.f6060d = jArr[zzfm.m6517s(jArr, j2, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    /* JADX INFO: renamed from: h */
    public final long mo4228h(zzagb zzagbVar) {
        long j2 = this.f6060d;
        if (j2 < 0) {
            return -1L;
        }
        this.f6060d = -1L;
        return -(j2 + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final zzahd zzc() {
        zzgtr.m7133f(this.f6059c != -1);
        return new zzagl(this.f6057a, this.f6059c);
    }
}
