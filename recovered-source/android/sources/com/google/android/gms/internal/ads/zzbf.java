package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbf {

    /* JADX INFO: renamed from: a */
    public static final zzbf f7725a = new zzbc();

    static {
        String str = zzfm.f16091a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo4735a();

    /* JADX INFO: renamed from: b */
    public abstract zzbe mo4736b(int i2, zzbe zzbeVar, long j2);

    /* JADX INFO: renamed from: c */
    public abstract int mo4737c();

    /* JADX INFO: renamed from: d */
    public abstract zzbd mo4738d(int i2, zzbd zzbdVar, boolean z);

    /* JADX INFO: renamed from: e */
    public abstract int mo4739e(Object obj);

    public final boolean equals(Object obj) {
        int iMo4836j;
        if (this != obj) {
            if (obj instanceof zzbf) {
                zzbf zzbfVar = (zzbf) obj;
                if (zzbfVar.mo4735a() == mo4735a() && zzbfVar.mo4737c() == mo4737c()) {
                    zzbe zzbeVar = new zzbe();
                    zzbd zzbdVar = new zzbd();
                    zzbe zzbeVar2 = new zzbe();
                    zzbd zzbdVar2 = new zzbd();
                    for (int i2 = 0; i2 < mo4735a(); i2++) {
                        if (mo4736b(i2, zzbeVar, 0L).equals(zzbfVar.mo4736b(i2, zzbeVar2, 0L))) {
                        }
                    }
                    for (int i3 = 0; i3 < mo4737c(); i3++) {
                        if (mo4738d(i3, zzbdVar, true).equals(zzbfVar.mo4738d(i3, zzbdVar2, true))) {
                        }
                    }
                    int iMo4837k = mo4837k(true);
                    if (iMo4837k == zzbfVar.mo4837k(true) && (iMo4836j = mo4836j(true)) == zzbfVar.mo4836j(true)) {
                        while (iMo4837k != iMo4836j) {
                            int iMo4834h = mo4834h(iMo4837k, 0, true);
                            if (iMo4834h == zzbfVar.mo4834h(iMo4837k, 0, true)) {
                                iMo4837k = iMo4834h;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public abstract Object mo4740f(int i2);

    /* JADX INFO: renamed from: g */
    public final boolean m4833g() {
        return mo4735a() == 0;
    }

    /* JADX INFO: renamed from: h */
    public int mo4834h(int i2, int i3, boolean z) {
        if (i3 == 0) {
            if (i2 == mo4836j(z)) {
                return -1;
            }
            return i2 + 1;
        }
        if (i3 == 1) {
            return i2;
        }
        if (i3 == 2) {
            return i2 == mo4836j(z) ? mo4837k(z) : i2 + 1;
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        int i2;
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        int iMo4735a = mo4735a() + 217;
        int i3 = 0;
        while (true) {
            i2 = iMo4735a * 31;
            if (i3 >= mo4735a()) {
                break;
            }
            iMo4735a = i2 + mo4736b(i3, zzbeVar, 0L).hashCode();
            i3++;
        }
        int iMo4737c = mo4737c() + i2;
        for (int i4 = 0; i4 < mo4737c(); i4++) {
            iMo4737c = (iMo4737c * 31) + mo4738d(i4, zzbdVar, true).hashCode();
        }
        int iMo4837k = mo4837k(true);
        while (iMo4837k != -1) {
            iMo4737c = (iMo4737c * 31) + iMo4837k;
            iMo4837k = mo4834h(iMo4837k, 0, true);
        }
        return iMo4737c;
    }

    /* JADX INFO: renamed from: i */
    public int mo4835i(int i2) {
        if (i2 == mo4837k(false)) {
            return -1;
        }
        return i2 - 1;
    }

    /* JADX INFO: renamed from: j */
    public int mo4836j(boolean z) {
        if (m4833g()) {
            return -1;
        }
        return mo4735a() - 1;
    }

    /* JADX INFO: renamed from: k */
    public int mo4837k(boolean z) {
        return m4833g() ? -1 : 0;
    }

    /* JADX INFO: renamed from: l */
    public final int m4838l(int i2, zzbd zzbdVar, zzbe zzbeVar, int i3, boolean z) {
        int i4 = mo4738d(i2, zzbdVar, false).f7634c;
        if (mo4736b(i4, zzbeVar, 0L).f7686l != i2) {
            return i2 + 1;
        }
        int iMo4834h = mo4834h(i4, i3, z);
        if (iMo4834h == -1) {
            return -1;
        }
        return mo4736b(iMo4834h, zzbeVar, 0L).f7685k;
    }

    /* JADX INFO: renamed from: m */
    public final Pair m4839m(zzbe zzbeVar, zzbd zzbdVar, int i2, long j2) {
        Pair pairM4840n = m4840n(zzbeVar, zzbdVar, i2, j2, 0L);
        pairM4840n.getClass();
        return pairM4840n;
    }

    /* JADX INFO: renamed from: n */
    public final Pair m4840n(zzbe zzbeVar, zzbd zzbdVar, int i2, long j2, long j3) {
        zzgtr.m7136i(i2, mo4735a());
        mo4736b(i2, zzbeVar, j3);
        if (j2 == -9223372036854775807L) {
            zzbeVar.getClass();
            j2 = 0;
        }
        int i3 = zzbeVar.f7685k;
        mo4738d(i3, zzbdVar, false);
        while (i3 < zzbeVar.f7686l) {
            zzbdVar.getClass();
            if (j2 == 0) {
                break;
            }
            int i4 = i3 + 1;
            mo4738d(i4, zzbdVar, false).getClass();
            if (j2 < 0) {
                break;
            }
            i3 = i4;
        }
        mo4738d(i3, zzbdVar, true);
        zzbdVar.getClass();
        long j4 = zzbdVar.f7635d;
        if (j4 != -9223372036854775807L) {
            j2 = Math.min(j2, j4 - 1);
        }
        long jMax = Math.max(0L, j2);
        Object obj = zzbdVar.f7633b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    /* JADX INFO: renamed from: o */
    public zzbd mo4841o(Object obj, zzbd zzbdVar) {
        return mo4738d(mo4739e(obj), zzbdVar, true);
    }
}
