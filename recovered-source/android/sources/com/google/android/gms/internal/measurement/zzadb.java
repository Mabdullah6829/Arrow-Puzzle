package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzadb implements zzago {

    /* JADX INFO: renamed from: a */
    public final zzada f22006a;

    public zzadb(zzada zzadaVar) {
        this.f22006a = zzadaVar;
        zzadaVar.f22005a = this;
    }

    /* JADX INFO: renamed from: a */
    public final void m9513a(int i2, List list) {
        boolean z = list instanceof zzaen;
        int i3 = 0;
        zzada zzadaVar = this.f22006a;
        if (!z) {
            while (i3 < list.size()) {
                zzadaVar.mo9488l(i2, (String) list.get(i3));
                i3++;
            }
            return;
        }
        zzaen zzaenVar = (zzaen) list;
        while (i3 < list.size()) {
            Object objZzc = zzaenVar.zzc();
            if (objZzc instanceof String) {
                zzadaVar.mo9488l(i2, (String) objZzc);
            } else {
                zzadaVar.mo9489m(i2, (zzacr) objZzc);
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9514b(int i2, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f22006a.mo9489m(i2, (zzacr) list.get(i3));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9515c(int i2, int i3) {
        this.f22006a.mo9484h(i2, i3);
    }

    /* JADX INFO: renamed from: d */
    public final void m9516d(int i2, long j2) {
        this.f22006a.mo9485i(i2, j2);
    }

    /* JADX INFO: renamed from: e */
    public final void m9517e(int i2, long j2) {
        this.f22006a.mo9486j(i2, j2);
    }

    /* JADX INFO: renamed from: f */
    public final void m9518f(float f2, int i2) {
        this.f22006a.mo9484h(i2, Float.floatToRawIntBits(f2));
    }

    /* JADX INFO: renamed from: g */
    public final void m9519g(int i2, double d) {
        this.f22006a.mo9486j(i2, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: h */
    public final void m9520h(int i2, int i3) {
        this.f22006a.mo9482f(i2, i3);
    }

    /* JADX INFO: renamed from: i */
    public final void m9521i(int i2, long j2) {
        this.f22006a.mo9485i(i2, j2);
    }

    /* JADX INFO: renamed from: j */
    public final void m9522j(int i2, int i3) {
        this.f22006a.mo9482f(i2, i3);
    }

    /* JADX INFO: renamed from: k */
    public final void m9523k(int i2, long j2) {
        this.f22006a.mo9486j(i2, j2);
    }

    /* JADX INFO: renamed from: l */
    public final void m9524l(int i2, int i3) {
        this.f22006a.mo9484h(i2, i3);
    }

    /* JADX INFO: renamed from: m */
    public final void m9525m(int i2, boolean z) {
        this.f22006a.mo9487k(i2, z);
    }

    /* JADX INFO: renamed from: n */
    public final void m9526n(int i2, zzacr zzacrVar) {
        this.f22006a.mo9489m(i2, zzacrVar);
    }

    /* JADX INFO: renamed from: o */
    public final void m9527o(int i2, int i3) {
        this.f22006a.mo9483g(i2, i3);
    }

    /* JADX INFO: renamed from: p */
    public final void m9528p(int i2, int i3) {
        this.f22006a.mo9483g(i2, (i3 >> 31) ^ (i3 + i3));
    }

    /* JADX INFO: renamed from: q */
    public final void m9529q(int i2, long j2) {
        this.f22006a.mo9485i(i2, (j2 >> 63) ^ (j2 + j2));
    }

    /* JADX INFO: renamed from: r */
    public final void m9530r(int i2, Object obj, zzafp zzafpVar) {
        zzacb zzacbVar = (zzacb) obj;
        zzada zzadaVar = this.f22006a;
        zzadaVar.mo9481e(i2, 2);
        zzadaVar.mo9497u(zzacbVar.mo9347j(zzafpVar));
        zzafpVar.mo9634d(zzacbVar, this);
    }

    /* JADX INFO: renamed from: s */
    public final void m9531s(int i2, Object obj, zzafp zzafpVar) {
        zzada zzadaVar = this.f22006a;
        zzadaVar.mo9481e(i2, 3);
        zzafpVar.mo9634d((zzacb) obj, this);
        zzadaVar.mo9481e(i2, 4);
    }
}
