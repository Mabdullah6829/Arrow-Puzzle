package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
final class zzahy {

    /* JADX INFO: renamed from: a */
    public final zzahx f5387a;

    /* JADX INFO: renamed from: b */
    public final zzahm f5388b;

    /* JADX INFO: renamed from: c */
    public final int f5389c;

    /* JADX INFO: renamed from: d */
    public final int f5390d;

    /* JADX INFO: renamed from: e */
    public final long f5391e;

    /* JADX INFO: renamed from: f */
    public int f5392f;

    /* JADX INFO: renamed from: g */
    public int f5393g;

    /* JADX INFO: renamed from: h */
    public int f5394h;

    /* JADX INFO: renamed from: i */
    public int f5395i;

    /* JADX INFO: renamed from: j */
    public int f5396j;

    /* JADX INFO: renamed from: k */
    public int f5397k;

    /* JADX INFO: renamed from: l */
    public long f5398l;

    /* JADX INFO: renamed from: m */
    public long[] f5399m;

    /* JADX INFO: renamed from: n */
    public int[] f5400n;

    public zzahy(int i2, zzahx zzahxVar, zzahm zzahmVar) {
        int i3 = zzahxVar.f5384d;
        this.f5387a = zzahxVar;
        int iM4135a = zzahxVar.m4135a();
        boolean z = true;
        if (iM4135a != 1) {
            if (iM4135a == 2) {
                iM4135a = 2;
            } else {
                z = false;
            }
        }
        zzgtr.m7128a(z);
        int i4 = ((i2 / 10) + 48) | (((i2 % 10) + 48) << 8);
        this.f5389c = (iM4135a == 2 ? 1667497984 : 1651965952) | i4;
        this.f5391e = zzfm.m6521w(i3, ((long) zzahxVar.f5382b) * 1000000, zzahxVar.f5383c, RoundingMode.DOWN);
        this.f5388b = zzahmVar;
        this.f5390d = iM4135a == 2 ? 1650720768 | i4 : -1;
        this.f5398l = -1L;
        this.f5399m = new long[512];
        this.f5400n = new int[512];
        this.f5392f = i3;
    }

    /* JADX INFO: renamed from: a */
    public final zzahb m4136a(long j2) {
        if (this.f5397k == 0) {
            zzahe zzaheVar = new zzahe(0L, this.f5398l);
            return new zzahb(zzaheVar, zzaheVar);
        }
        int i2 = (int) (j2 / ((this.f5391e * ((long) 1)) / ((long) this.f5392f)));
        int iM6516r = zzfm.m6516r(this.f5400n, i2, true, true);
        if (this.f5400n[iM6516r] == i2) {
            zzahe zzaheVarM4137b = m4137b(iM6516r);
            return new zzahb(zzaheVarM4137b, zzaheVarM4137b);
        }
        zzahe zzaheVarM4137b2 = m4137b(iM6516r);
        int i3 = iM6516r + 1;
        return i3 < this.f5399m.length ? new zzahb(zzaheVarM4137b2, m4137b(i3)) : new zzahb(zzaheVarM4137b2, zzaheVarM4137b2);
    }

    /* JADX INFO: renamed from: b */
    public final zzahe m4137b(int i2) {
        return new zzahe(((this.f5391e * ((long) 1)) / ((long) this.f5392f)) * ((long) this.f5400n[i2]), this.f5399m[i2]);
    }
}
