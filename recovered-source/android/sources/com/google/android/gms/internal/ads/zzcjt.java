package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcjt implements zzma {

    /* JADX INFO: renamed from: a */
    public final zzabs f10276a = new zzabs();

    /* JADX INFO: renamed from: b */
    public long f10277b = 15000000;

    /* JADX INFO: renamed from: c */
    public long f10278c = 30000000;

    /* JADX INFO: renamed from: d */
    public long f10279d = 2500000;

    /* JADX INFO: renamed from: e */
    public long f10280e = 5000000;

    /* JADX INFO: renamed from: f */
    public int f10281f;

    /* JADX INFO: renamed from: g */
    public boolean f10282g;

    @Override // com.google.android.gms.internal.ads.zzma
    /* JADX INFO: renamed from: a */
    public final void mo5521a(zzqh zzqhVar) {
        this.f10281f = 0;
        this.f10282g = false;
        zzabs zzabsVar = this.f10276a;
        synchronized (zzabsVar) {
            zzabsVar.m3935c(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    /* JADX INFO: renamed from: b */
    public final long mo5522b() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    /* JADX INFO: renamed from: d */
    public final void mo5524d(zzqh zzqhVar) {
        this.f10281f = 0;
        this.f10282g = false;
        zzabs zzabsVar = this.f10276a;
        synchronized (zzabsVar) {
            zzabsVar.m3935c(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    /* JADX INFO: renamed from: e */
    public final void mo5525e(zzlz zzlzVar, zzabb[] zzabbVarArr) {
        int i2;
        this.f10281f = 0;
        for (zzabb zzabbVar : zzabbVarArr) {
            if (zzabbVar != null) {
                int i3 = this.f10281f;
                int i4 = zzabbVar.zza().f7809c;
                if (i4 == 0) {
                    i2 = 144310272;
                } else if (i4 == 1) {
                    i2 = 13107200;
                } else if (i4 != 2) {
                    i2 = 131072;
                    if (i4 != 3 && i4 != 5 && i4 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i2 = 131072000;
                }
                this.f10281f = i3 + i2;
            }
        }
        this.f10276a.m3935c(this.f10281f);
    }

    @Override // com.google.android.gms.internal.ads.zzma
    /* JADX INFO: renamed from: f */
    public final zzabm mo5526f(zzqh zzqhVar) {
        return this.f10276a;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    /* JADX INFO: renamed from: g */
    public final boolean mo5527g(zzlz zzlzVar) {
        long j2 = zzlzVar.f20357f ? this.f10280e : this.f10279d;
        return j2 <= 0 || zzlzVar.f20355d >= j2;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    /* JADX INFO: renamed from: h */
    public final boolean mo5528h(zzlz zzlzVar) {
        char c;
        int i2;
        long j2 = zzlzVar.f20355d;
        boolean z = true;
        if (j2 > this.f10278c) {
            c = 0;
        } else {
            c = j2 < this.f10277b ? (char) 2 : (char) 1;
        }
        zzabs zzabsVar = this.f10276a;
        synchronized (zzabsVar) {
            i2 = zzabsVar.f4859b * 65536;
        }
        int i3 = this.f10281f;
        if (c != 2 && (c != 1 || !this.f10282g || i2 >= i3)) {
            z = false;
        }
        this.f10282g = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    /* JADX INFO: renamed from: i */
    public final void mo5529i(zzqh zzqhVar) {
        this.f10281f = 0;
        this.f10282g = false;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    /* JADX INFO: renamed from: c */
    public final void mo5523c() {
    }
}
