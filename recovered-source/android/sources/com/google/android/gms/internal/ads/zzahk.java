package com.google.android.gms.internal.ads;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class zzahk implements zzagd {

    /* JADX INFO: renamed from: s */
    public final long f5321s;

    /* JADX INFO: renamed from: t */
    public final zzagd f5322t;

    public zzahk(long j2, zzagd zzagdVar) {
        this.f5321s = j2;
        this.f5322t = zzagdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    /* JADX INFO: renamed from: d */
    public final void mo4108d(zzahd zzahdVar) {
        this.f5322t.mo4108d(new zzahj(this, zzahdVar, zzahdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    /* JADX INFO: renamed from: f */
    public final zzahm mo4109f(int i2, int i3) {
        return this.f5322t.mo4109f(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    /* JADX INFO: renamed from: v */
    public final void mo4110v() {
        this.f5322t.mo4110v();
    }
}
