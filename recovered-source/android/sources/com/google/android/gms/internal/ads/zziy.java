package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zziy extends zzbf {

    /* JADX INFO: renamed from: b */
    public final int f20052b;

    /* JADX INFO: renamed from: c */
    public final zzzg f20053c;

    public zziy(zzzg zzzgVar) {
        this.f20053c = zzzgVar;
        this.f20052b = zzzgVar.f21471b.length;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: b */
    public final zzbe mo4736b(int i2, zzbe zzbeVar, long j2) {
        int iMo8572q = mo8572q(i2);
        int iMo8576u = mo8576u(iMo8572q);
        int iMo8575t = mo8575t(iMo8572q);
        mo8574s(iMo8572q).mo4736b(i2 - iMo8576u, zzbeVar, j2);
        Object objMo8577v = mo8577v(iMo8572q);
        if (!zzbe.f7673m.equals(zzbeVar.f7675a)) {
            objMo8577v = Pair.create(objMo8577v, zzbeVar.f7675a);
        }
        zzbeVar.f7675a = objMo8577v;
        zzbeVar.f7685k += iMo8575t;
        zzbeVar.f7686l += iMo8575t;
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: d */
    public final zzbd mo4738d(int i2, zzbd zzbdVar, boolean z) {
        int iMo8571p = mo8571p(i2);
        int iMo8576u = mo8576u(iMo8571p);
        mo8574s(iMo8571p).mo4738d(i2 - mo8575t(iMo8571p), zzbdVar, z);
        zzbdVar.f7634c += iMo8576u;
        if (z) {
            Object objMo8577v = mo8577v(iMo8571p);
            Object obj = zzbdVar.f7633b;
            obj.getClass();
            zzbdVar.f7633b = Pair.create(objMo8577v, obj);
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: e */
    public final int mo4739e(Object obj) {
        int iMo4739e;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int iMo8573r = mo8573r(obj2);
            if (iMo8573r != -1 && (iMo4739e = mo8574s(iMo8573r).mo4739e(obj3)) != -1) {
                return mo8575t(iMo8573r) + iMo4739e;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: f */
    public final Object mo4740f(int i2) {
        int iMo8571p = mo8571p(i2);
        return Pair.create(mo8577v(iMo8571p), mo8574s(iMo8571p).mo4740f(i2 - mo8575t(iMo8571p)));
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: h */
    public final int mo4834h(int i2, int i3, boolean z) {
        int iMo8572q = mo8572q(i2);
        int iMo8576u = mo8576u(iMo8572q);
        int iMo4834h = mo8574s(iMo8572q).mo4834h(i2 - iMo8576u, i3 == 2 ? 0 : i3, z);
        if (iMo4834h != -1) {
            return iMo8576u + iMo4834h;
        }
        int iM8578w = m8578w(iMo8572q, z);
        while (iM8578w != -1 && mo8574s(iM8578w).m4833g()) {
            iM8578w = m8578w(iM8578w, z);
        }
        if (iM8578w != -1) {
            return mo8574s(iM8578w).mo4837k(z) + mo8576u(iM8578w);
        }
        if (i3 == 2) {
            return mo4837k(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: i */
    public final int mo4835i(int i2) {
        int iMo8572q = mo8572q(i2);
        int iMo8576u = mo8576u(iMo8572q);
        int iMo4835i = mo8574s(iMo8572q).mo4835i(i2 - iMo8576u);
        if (iMo4835i != -1) {
            return iMo8576u + iMo4835i;
        }
        int iM8579x = m8579x(iMo8572q, false);
        while (iM8579x != -1 && mo8574s(iM8579x).m4833g()) {
            iM8579x = m8579x(iM8579x, false);
        }
        if (iM8579x == -1) {
            return -1;
        }
        return mo8574s(iM8579x).mo4836j(false) + mo8576u(iM8579x);
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: j */
    public final int mo4836j(boolean z) {
        int iM8579x;
        int i2 = this.f20052b;
        if (i2 != 0) {
            if (z) {
                int[] iArr = this.f20053c.f21471b;
                int length = iArr.length;
                iM8579x = length > 0 ? iArr[length - 1] : -1;
            } else {
                iM8579x = i2 - 1;
            }
            while (mo8574s(iM8579x).m4833g()) {
                iM8579x = m8579x(iM8579x, z);
                if (iM8579x == -1) {
                }
            }
            return mo8574s(iM8579x).mo4836j(z) + mo8576u(iM8579x);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: k */
    public final int mo4837k(boolean z) {
        if (this.f20052b != 0) {
            int iM8578w = 0;
            if (z) {
                int[] iArr = this.f20053c.f21471b;
                iM8578w = iArr.length > 0 ? iArr[0] : -1;
            }
            while (mo8574s(iM8578w).m4833g()) {
                iM8578w = m8578w(iM8578w, z);
                if (iM8578w == -1) {
                }
            }
            return mo8574s(iM8578w).mo4837k(z) + mo8576u(iM8578w);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: o */
    public final zzbd mo4841o(Object obj, zzbd zzbdVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iMo8573r = mo8573r(obj2);
        int iMo8576u = mo8576u(iMo8573r);
        mo8574s(iMo8573r).mo4841o(obj3, zzbdVar);
        zzbdVar.f7634c += iMo8576u;
        zzbdVar.f7633b = obj;
        return zzbdVar;
    }

    /* JADX INFO: renamed from: p */
    public abstract int mo8571p(int i2);

    /* JADX INFO: renamed from: q */
    public abstract int mo8572q(int i2);

    /* JADX INFO: renamed from: r */
    public abstract int mo8573r(Object obj);

    /* JADX INFO: renamed from: s */
    public abstract zzbf mo8574s(int i2);

    /* JADX INFO: renamed from: t */
    public abstract int mo8575t(int i2);

    /* JADX INFO: renamed from: u */
    public abstract int mo8576u(int i2);

    /* JADX INFO: renamed from: v */
    public abstract Object mo8577v(int i2);

    /* JADX INFO: renamed from: w */
    public final int m8578w(int i2, boolean z) {
        if (!z) {
            if (i2 >= this.f20052b - 1) {
                return -1;
            }
            return i2 + 1;
        }
        zzzg zzzgVar = this.f20053c;
        int i3 = zzzgVar.f21472c[i2] + 1;
        int[] iArr = zzzgVar.f21471b;
        if (i3 < iArr.length) {
            return iArr[i3];
        }
        return -1;
    }

    /* JADX INFO: renamed from: x */
    public final int m8579x(int i2, boolean z) {
        if (!z) {
            if (i2 <= 0) {
                return -1;
            }
            return i2 - 1;
        }
        zzzg zzzgVar = this.f20053c;
        int i3 = zzzgVar.f21472c[i2] - 1;
        if (i3 >= 0) {
            return zzzgVar.f21471b[i3];
        }
        return -1;
    }
}
