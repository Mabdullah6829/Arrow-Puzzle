package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzme {

    /* JADX INFO: renamed from: a */
    public final zzxd f20366a;

    /* JADX INFO: renamed from: b */
    public final Object f20367b;

    /* JADX INFO: renamed from: c */
    public final zzzd[] f20368c;

    /* JADX INFO: renamed from: d */
    public boolean f20369d;

    /* JADX INFO: renamed from: e */
    public boolean f20370e;

    /* JADX INFO: renamed from: f */
    public boolean f20371f;

    /* JADX INFO: renamed from: g */
    public zzmf f20372g;

    /* JADX INFO: renamed from: h */
    public boolean f20373h;

    /* JADX INFO: renamed from: i */
    public final boolean[] f20374i;

    /* JADX INFO: renamed from: j */
    public final zzne[] f20375j;

    /* JADX INFO: renamed from: k */
    public final zzabi f20376k;

    /* JADX INFO: renamed from: l */
    public final zzmt f20377l;

    /* JADX INFO: renamed from: m */
    public zzme f20378m;

    /* JADX INFO: renamed from: n */
    public zzzo f20379n;

    /* JADX INFO: renamed from: o */
    public zzabj f20380o;

    /* JADX INFO: renamed from: p */
    public long f20381p;

    public zzme(zzne[] zzneVarArr, long j2, zzabi zzabiVar, zzabm zzabmVar, zzmt zzmtVar, zzmf zzmfVar, zzabj zzabjVar) {
        this.f20375j = zzneVarArr;
        this.f20381p = j2;
        this.f20376k = zzabiVar;
        this.f20377l = zzmtVar;
        zzxl zzxlVar = zzmfVar.f20382a;
        this.f20367b = zzxlVar.f21278a;
        this.f20372g = zzmfVar;
        this.f20379n = zzzo.f21490d;
        this.f20380o = zzabjVar;
        this.f20368c = new zzzd[2];
        this.f20374i = new boolean[2];
        long j3 = zzmfVar.f20383b;
        zzmtVar.getClass();
        int i2 = zzna.f20486k;
        Pair pair = (Pair) zzxlVar.f21278a;
        Object obj = pair.first;
        zzxl zzxlVarM9024a = zzxlVar.m9024a(pair.second);
        zzmq zzmqVar = (zzmq) zzmtVar.f20447e.get(obj);
        zzmqVar.getClass();
        zzmtVar.f20450h.add(zzmqVar);
        zzmp zzmpVar = (zzmp) zzmtVar.f20449g.get(zzmqVar);
        if (zzmpVar != null) {
            zzmpVar.f20434a.mo8982D(zzmpVar.f20435b);
        }
        zzmqVar.f20439c.add(zzxlVarM9024a);
        zzxd zzxdVarMo9022y = zzmqVar.f20437a.mo9022y(zzxlVarM9024a, zzabmVar, j3);
        zzmtVar.f20446d.put(zzxdVarMo9022y, zzmqVar);
        zzmtVar.m8752j();
        this.f20366a = zzxdVarMo9022y;
    }

    /* JADX INFO: renamed from: a */
    public final long m8692a() {
        return this.f20372g.f20383b + this.f20381p;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8693b() {
        if (this.f20370e) {
            return !this.f20371f || this.f20366a.zzb() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8694c() {
        if (this.f20370e) {
            return m8693b() || m8695d() - this.f20372g.f20383b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final long m8695d() {
        if (!this.f20370e) {
            return this.f20372g.f20383b;
        }
        long jZzb = this.f20371f ? this.f20366a.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.f20372g.f20386e : jZzb;
    }

    /* JADX INFO: renamed from: e */
    public final void m8696e(zzbf zzbfVar) {
        this.f20370e = true;
        this.f20379n = this.f20366a.mo9009g();
        zzabj zzabjVarM8697f = m8697f(zzbfVar);
        zzmf zzmfVar = this.f20372g;
        long jMax = zzmfVar.f20383b;
        long j2 = zzmfVar.f20386e;
        if (j2 != -9223372036854775807L && jMax >= j2) {
            jMax = Math.max(0L, j2 - 1);
        }
        long jM8698g = m8698g(zzabjVarM8697f, jMax, false, new boolean[2]);
        long j3 = this.f20381p;
        zzmf zzmfVar2 = this.f20372g;
        this.f20381p = (zzmfVar2.f20383b - jM8698g) + j3;
        this.f20372g = zzmfVar2.m8704a(jM8698g, zzmfVar2.f20384c);
    }

    /* JADX INFO: renamed from: f */
    public final zzabj m8697f(zzbf zzbfVar) {
        zzabb[] zzabbVarArr;
        zzzo zzzoVar = this.f20379n;
        zzxl zzxlVar = this.f20372g.f20382a;
        zzabi zzabiVar = this.f20376k;
        zzne[] zzneVarArr = this.f20375j;
        zzabj zzabjVarMo3923f = zzabiVar.mo3923f(zzneVarArr, zzzoVar, zzxlVar, zzbfVar);
        int i2 = 0;
        while (true) {
            int i3 = zzabjVarMo3923f.f4844a;
            zzabbVarArr = zzabjVarMo3923f.f4846c;
            if (i2 >= i3) {
                break;
            }
            boolean z = true;
            if (zzabjVarMo3923f.m3924a(i2)) {
                if (zzabbVarArr[i2] == null) {
                    zzneVarArr[i2].getClass();
                    z = false;
                }
                zzgtr.m7133f(z);
            } else {
                zzgtr.m7133f(zzabbVarArr[i2] == null);
            }
            i2++;
        }
        for (zzabb zzabbVar : zzabbVarArr) {
        }
        return zzabjVarMo3923f;
    }

    /* JADX INFO: renamed from: g */
    public final long m8698g(zzabj zzabjVar, long j2, boolean z, boolean[] zArr) {
        zzne[] zzneVarArr;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= zzabjVar.f4844a) {
                break;
            }
            if (z || !zzabjVar.m3925b(this.f20380o, i2)) {
                z2 = false;
            }
            this.f20374i[i2] = z2;
            i2++;
        }
        int i3 = 0;
        while (true) {
            zzneVarArr = this.f20375j;
            if (i3 >= 2) {
                break;
            }
            zzneVarArr[i3].getClass();
            i3++;
        }
        m8703l();
        this.f20380o = zzabjVar;
        if (this.f20378m == null) {
            int i4 = 0;
            while (true) {
                zzabj zzabjVar2 = this.f20380o;
                if (i4 >= zzabjVar2.f4844a) {
                    break;
                }
                zzabjVar2.m3924a(i4);
                zzabb zzabbVar = this.f20380o.f4846c[i4];
                i4++;
            }
        }
        zzabb[] zzabbVarArr = zzabjVar.f4846c;
        zzxd zzxdVar = this.f20366a;
        boolean[] zArr2 = this.f20374i;
        zzzd[] zzzdVarArr = this.f20368c;
        long jMo9013l = zzxdVar.mo9013l(zzabbVarArr, zArr2, zzzdVarArr, zArr, j2);
        for (int i5 = 0; i5 < 2; i5++) {
            zzneVarArr[i5].getClass();
        }
        this.f20371f = false;
        for (int i6 = 0; i6 < 2; i6++) {
            if (zzzdVarArr[i6] != null) {
                zzgtr.m7133f(zzabjVar.m3924a(i6));
                zzneVarArr[i6].getClass();
                this.f20371f = true;
            } else {
                zzgtr.m7133f(zzabbVarArr[i6] == null);
            }
        }
        return jMo9013l;
    }

    /* JADX INFO: renamed from: h */
    public final void m8699h() {
        m8703l();
        zzmt zzmtVar = this.f20377l;
        zzxd zzxdVar = this.f20366a;
        try {
            IdentityHashMap identityHashMap = zzmtVar.f20446d;
            zzmq zzmqVar = (zzmq) identityHashMap.remove(zzxdVar);
            zzmqVar.getClass();
            zzmqVar.f20437a.mo9023z(zzxdVar);
            zzmqVar.f20439c.remove(zzxdVar.f21255s);
            if (!identityHashMap.isEmpty()) {
                zzmtVar.m8752j();
            }
            zzmtVar.m8755m(zzmqVar);
        } catch (RuntimeException e) {
            zzeh.m6214f("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX INFO: renamed from: i */
    public final zzme m8700i() {
        return this.f20378m;
    }

    /* JADX INFO: renamed from: j */
    public final zzzo m8701j() {
        return this.f20379n;
    }

    /* JADX INFO: renamed from: k */
    public final zzabj m8702k() {
        return this.f20380o;
    }

    /* JADX INFO: renamed from: l */
    public final void m8703l() {
        if (this.f20378m != null) {
            return;
        }
        int i2 = 0;
        while (true) {
            zzabj zzabjVar = this.f20380o;
            if (i2 >= zzabjVar.f4844a) {
                return;
            }
            zzabjVar.m3924a(i2);
            zzabb zzabbVar = this.f20380o.f4846c[i2];
            i2++;
        }
    }
}
