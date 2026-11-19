package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzafz {
    /* JADX INFO: renamed from: a */
    public abstract void mo9675a(Object obj, int i2, long j2);

    /* JADX INFO: renamed from: b */
    public abstract void mo9676b(int i2, int i3, Object obj);

    /* JADX INFO: renamed from: c */
    public abstract void mo9677c(Object obj, int i2, long j2);

    /* JADX INFO: renamed from: d */
    public abstract void mo9678d(Object obj, int i2, zzacr zzacrVar);

    /* JADX INFO: renamed from: e */
    public abstract void mo9679e(int i2, Object obj, Object obj2);

    /* JADX INFO: renamed from: f */
    public abstract zzaga mo9680f();

    /* JADX INFO: renamed from: g */
    public abstract zzaga mo9681g(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract zzaga mo9682h(Object obj);

    /* JADX INFO: renamed from: i */
    public abstract void mo9683i(Object obj, Object obj2);

    /* JADX INFO: renamed from: j */
    public abstract void mo9684j(Object obj);

    /* JADX INFO: renamed from: k */
    public final boolean m9685k(int i2, zzacw zzacwVar, Object obj) throws zzaeh {
        int i3 = zzacwVar.f21992b;
        int i4 = i3 >>> 3;
        int i5 = i3 & 7;
        if (i5 == 0) {
            mo9675a(obj, i4, zzacwVar.m9437B());
            return true;
        }
        if (i5 == 1) {
            mo9677c(obj, i4, zzacwVar.m9439D());
            return true;
        }
        if (i5 == 2) {
            mo9678d(obj, i4, zzacwVar.m9446K());
            return true;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                if (i2 != 0) {
                    return false;
                }
                throw new zzaeh("Protocol message end-group tag did not match expected tag.");
            }
            if (i5 != 5) {
                throw new zzaeg();
            }
            mo9676b(i4, zzacwVar.m9440E(), obj);
            return true;
        }
        zzaga zzagaVarMo9680f = mo9680f();
        int i6 = i4 << 3;
        int i7 = i2 + 1;
        if (i7 >= 100) {
            throw new zzaeh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzacwVar.m9477x() != Integer.MAX_VALUE && m9685k(i7, zzacwVar, zzagaVarMo9680f)) {
        }
        if ((i6 | 4) != zzacwVar.f21992b) {
            throw new zzaeh("Protocol message end-group tag did not match expected tag.");
        }
        mo9679e(i4, obj, mo9681g(zzagaVarMo9680f));
        return true;
    }
}
