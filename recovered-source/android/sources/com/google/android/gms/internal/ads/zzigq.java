package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzigq extends zzidl {

    /* JADX INFO: renamed from: z */
    public static final int[] f19875z = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: u */
    public final int f19876u;

    /* JADX INFO: renamed from: v */
    public final zzidl f19877v;

    /* JADX INFO: renamed from: w */
    public final zzidl f19878w;

    /* JADX INFO: renamed from: x */
    public final int f19879x;

    /* JADX INFO: renamed from: y */
    public final int f19880y;

    public zzigq(zzidl zzidlVar, zzidl zzidlVar2) {
        this.f19877v = zzidlVar;
        this.f19878w = zzidlVar2;
        int iMo8132h = zzidlVar.mo8132h();
        this.f19879x = iMo8132h;
        this.f19876u = zzidlVar2.mo8132h() + iMo8132h;
        this.f19880y = Math.max(zzidlVar.mo8141v(), zzidlVar2.mo8141v()) + 1;
    }

    /* JADX INFO: renamed from: C */
    public static int m8417C(int i2) {
        if (i2 >= 47) {
            return Integer.MAX_VALUE;
        }
        return f19875z[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: g */
    public final byte mo8131g(int i2) {
        int i3 = this.f19879x;
        return i2 < i3 ? this.f19877v.mo8131g(i2) : this.f19878w.mo8131g(i2 - i3);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: h */
    public final int mo8132h() {
        return this.f19876u;
    }

    @Override // com.google.android.gms.internal.ads.zzidl, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzign(this);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: j */
    public final zzidl mo8133j(int i2, int i3) {
        return mo8134k(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: k */
    public final zzidl mo8134k(int i2, int i3) {
        int i4 = this.f19876u;
        int iM8146b = zzidl.m8146b(i2, i3, i4);
        if (iM8146b == 0) {
            return zzidl.f19719t;
        }
        if (iM8146b == i4) {
            return this;
        }
        zzidl zzidlVar = this.f19877v;
        int i5 = this.f19879x;
        if (i3 <= i5) {
            return zzidlVar.mo8133j(i2, i3);
        }
        int i6 = i3 - i5;
        zzidl zzidlVar2 = this.f19878w;
        return i2 >= i5 ? zzidlVar2.mo8133j(i2 - i5, i6) : new zzigq(zzidlVar.mo8133j(i2, zzidlVar.mo8132h()), zzidlVar2.mo8133j(0, i6));
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: m */
    public final void mo8135m(int i2, byte[] bArr, int i3, int i4) {
        int i5 = i2 + i4;
        zzidl zzidlVar = this.f19877v;
        int i6 = this.f19879x;
        if (i5 <= i6) {
            zzidlVar.mo8135m(i2, bArr, i3, i4);
            return;
        }
        zzidl zzidlVar2 = this.f19878w;
        if (i2 >= i6) {
            zzidlVar2.mo8135m(i2 - i6, bArr, i3, i4);
            return;
        }
        int i7 = i6 - i2;
        zzidlVar.mo8135m(i2, bArr, i3, i7);
        zzidlVar2.mo8135m(0, bArr, i3 + i7, i4 - i7);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: q */
    public final void mo8137q(zzidu zziduVar) {
        this.f19877v.mo8137q(zziduVar);
        this.f19878w.mo8137q(zziduVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: r */
    public final boolean mo8138r(zzidl zzidlVar) {
        zzidi zzidiVarM8416a;
        zzigp zzigpVar = new zzigp(this);
        zzidi zzidiVarM8416a2 = zzigpVar.next();
        zzigp zzigpVar2 = new zzigp(zzidlVar);
        zzidi zzidiVarM8416a3 = zzigpVar2.next();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int iMo8132h = zzidiVarM8416a2.mo8132h() - i2;
            int iMo8132h2 = zzidiVarM8416a3.mo8132h() - i3;
            int iMin = Math.min(iMo8132h, iMo8132h2);
            if (!(i2 == 0 ? zzidiVarM8416a2.mo8130C(zzidiVarM8416a3, i3, iMin) : zzidiVarM8416a3.mo8130C(zzidiVarM8416a2, i2, iMin))) {
                return false;
            }
            i4 += iMin;
            int i5 = this.f19876u;
            if (i4 >= i5) {
                if (i4 == i5) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iMo8132h) {
                zzidiVarM8416a = zzigpVar.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
            if (iMin == iMo8132h2) {
                zzidiVarM8416a2 = zzidiVarM8416a2;
                zzidiVarM8416a2 = zzidiVarM8416a;
                zzidiVarM8416a3 = zzigpVar2.next();
                i3 = 0;
            } else {
                zzidiVarM8416a2 = zzidiVarM8416a2;
                zzidiVarM8416a2 = zzidiVarM8416a;
                i3 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: t */
    public final int mo8139t(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        zzidl zzidlVar = this.f19877v;
        int i6 = this.f19879x;
        if (i5 <= i6) {
            return zzidlVar.mo8139t(i2, i3, i4);
        }
        zzidl zzidlVar2 = this.f19878w;
        if (i3 >= i6) {
            return zzidlVar2.mo8139t(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return zzidlVar2.mo8139t(zzidlVar.mo8139t(i2, i3, i7), 0, i4 - i7);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: u */
    public final zzidp mo8140u() {
        ArrayList arrayList = new ArrayList();
        zzigp zzigpVar = new zzigp(this);
        while (zzigpVar.hasNext()) {
            arrayList.add(zzigpVar.next().mo8136n());
        }
        zzifi zzifiVar = new zzifi();
        zzifiVar.f19805s = arrayList.iterator();
        zzifiVar.f19807u = 0;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            zzifiVar.f19807u++;
        }
        zzifiVar.f19808v = -1;
        if (!zzifiVar.m8358c()) {
            zzifiVar.f19806t = zzifc.f19795b;
            zzifiVar.f19809w = 0;
            zzifiVar.f19804A = 0L;
        }
        return zzidp.m8198e(zzifiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: v */
    public final int mo8141v() {
        return this.f19880y;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: w */
    public final boolean mo8142w() {
        return this.f19876u >= m8417C(this.f19880y);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: x */
    public final zzidg iterator() {
        return new zzign(this);
    }
}
