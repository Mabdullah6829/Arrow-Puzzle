package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzark implements zzaga {

    /* JADX INFO: renamed from: a */
    public final int f6748a;

    /* JADX INFO: renamed from: b */
    public final List f6749b;

    /* JADX INFO: renamed from: c */
    public final zzeu f6750c;

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f6751d;

    /* JADX INFO: renamed from: e */
    public final zzapx f6752e;

    /* JADX INFO: renamed from: f */
    public final zzanq f6753f;

    /* JADX INFO: renamed from: g */
    public final SparseArray f6754g;

    /* JADX INFO: renamed from: h */
    public final SparseBooleanArray f6755h;

    /* JADX INFO: renamed from: i */
    public final SparseBooleanArray f6756i;

    /* JADX INFO: renamed from: j */
    public final zzarg f6757j;

    /* JADX INFO: renamed from: k */
    public zzarf f6758k;

    /* JADX INFO: renamed from: l */
    public zzagd f6759l;

    /* JADX INFO: renamed from: m */
    public boolean f6760m;

    /* JADX INFO: renamed from: n */
    public boolean f6761n;

    /* JADX INFO: renamed from: o */
    public boolean f6762o;

    /* JADX INFO: renamed from: p */
    public int f6763p;

    @Deprecated
    public zzark() {
        this(1, zzanq.f6138a, new zzfj(), new zzapx(0));
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: b */
    public final void mo4103b() {
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: g */
    public final void mo4104g(long j2, long j3) {
        zzarf zzarfVar;
        long j4;
        List list = this.f6749b;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            zzfj zzfjVar = (zzfj) list.get(i3);
            synchronized (zzfjVar) {
                j4 = zzfjVar.f15787b;
            }
            if (j4 != -9223372036854775807L) {
                long jM6464a = zzfjVar.m6464a();
                if (jM6464a != -9223372036854775807L && jM6464a != 0 && jM6464a != j3) {
                    zzfjVar.m6465b(j3);
                }
            } else {
                zzfjVar.m6465b(j3);
            }
        }
        if (j3 != 0 && (zzarfVar = this.f6758k) != null) {
            zzarfVar.m4069a(j3);
        }
        this.f6750c.m6396y(0);
        this.f6751d.clear();
        while (true) {
            SparseArray sparseArray = this.f6754g;
            if (i2 >= sparseArray.size()) {
                return;
            }
            ((zzarp) sparseArray.valueAt(i2)).zzb();
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: h */
    public final boolean mo4105h(zzagb zzagbVar) throws EOFException, InterruptedIOException {
        byte[] bArr = this.f6750c.f14887a;
        zzafr zzafrVar = (zzafr) zzagbVar;
        zzafrVar.mo4081K(bArr, 0, 940, false);
        for (int i2 = 0; i2 < 188; i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= 5) {
                    zzafrVar.mo4077G(i2, false);
                    return true;
                }
                if (bArr[(i3 * 188) + i2] != 71) {
                    break;
                }
                i3++;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: i */
    public final void mo4106i(zzagd zzagdVar) {
        if (this.f6748a == 0) {
            zzagdVar = new zzant(zzagdVar, this.f6753f);
        }
        this.f6759l = zzagdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: j */
    public final int mo4107j(zzagb zzagbVar, zzaha zzahaVar) {
        zzagb zzagbVar2;
        int i2;
        long j2;
        long jM4341a;
        long jMo4089j = zzagbVar.mo4089j();
        if (this.f6760m) {
            long j3 = -9223372036854775807L;
            zzarg zzargVar = this.f6757j;
            if (jMo4089j != -1 && !zzargVar.f6734c) {
                int i3 = this.f6763p;
                zzeu zzeuVar = zzargVar.f6733b;
                if (i3 <= 0) {
                    zzargVar.m4337a(zzagbVar);
                    return 0;
                }
                if (zzargVar.f6736e) {
                    if (zzargVar.f6738g == -9223372036854775807L) {
                        zzargVar.m4337a(zzagbVar);
                        return 0;
                    }
                    if (zzargVar.f6735d) {
                        long j4 = zzargVar.f6737f;
                        if (j4 == -9223372036854775807L) {
                            zzargVar.m4337a(zzagbVar);
                            return 0;
                        }
                        zzfj zzfjVar = zzargVar.f6732a;
                        zzargVar.f6739h = zzfjVar.m6467d(zzargVar.f6738g) - zzfjVar.m6466c(j4);
                        zzargVar.m4337a(zzagbVar);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800L, zzagbVar.mo4089j());
                    if (zzagbVar.mo4086g() != 0) {
                        zzahaVar.f5303a = 0L;
                        return 1;
                    }
                    zzeuVar.m6396y(iMin);
                    zzagbVar.zzl();
                    zzagbVar.mo4078H(zzeuVar.f14887a, 0, iMin);
                    int i4 = zzeuVar.f14889c;
                    for (int i5 = zzeuVar.f14888b; i5 < i4; i5++) {
                        if (zzeuVar.f14887a[i5] == 71) {
                            jM4341a = zzarq.m4341a(zzeuVar, i5, i3);
                            if (jM4341a != -9223372036854775807L) {
                                zzargVar.f6737f = jM4341a;
                                zzargVar.f6735d = true;
                                return 0;
                            }
                        }
                    }
                    jM4341a = -9223372036854775807L;
                    zzargVar.f6737f = jM4341a;
                    zzargVar.f6735d = true;
                    return 0;
                }
                long jMo4089j2 = zzagbVar.mo4089j();
                int iMin2 = (int) Math.min(112800L, jMo4089j2);
                long j5 = jMo4089j2 - ((long) iMin2);
                if (zzagbVar.mo4086g() != j5) {
                    zzahaVar.f5303a = j5;
                    return 1;
                }
                zzeuVar.m6396y(iMin2);
                zzagbVar.zzl();
                zzagbVar.mo4078H(zzeuVar.f14887a, 0, iMin2);
                int i6 = zzeuVar.f14888b;
                int i7 = zzeuVar.f14889c;
                for (int i8 = i7 - 188; i8 >= i6; i8--) {
                    byte[] bArr = zzeuVar.f14887a;
                    int i9 = 0;
                    for (int i10 = -4; i10 <= 4; i10++) {
                        int i11 = (i10 * 188) + i8;
                        if (i11 >= i6 && i11 < i7 && bArr[i11] == 71) {
                            i9++;
                            if (i9 == 5) {
                                long jM4341a2 = zzarq.m4341a(zzeuVar, i8, i3);
                                if (jM4341a2 == -9223372036854775807L) {
                                    break;
                                }
                                j3 = jM4341a2;
                                break;
                            }
                        } else {
                            i9 = 0;
                        }
                    }
                }
                zzargVar.f6738g = j3;
                zzargVar.f6736e = true;
                return 0;
            }
            if (this.f6761n) {
                i2 = 1;
                j2 = 0;
            } else {
                this.f6761n = true;
                long j6 = zzargVar.f6739h;
                if (j6 != -9223372036854775807L) {
                    i2 = 1;
                    j2 = 0;
                    zzarf zzarfVar = new zzarf(new zzafh(), new zzare(this.f6763p, zzargVar.f6732a), j6, j6 + 1, 0L, jMo4089j, 188L, 940);
                    this.f6758k = zzarfVar;
                    this.f6759l.mo4108d(zzarfVar.f5193a);
                } else {
                    i2 = 1;
                    j2 = 0;
                    this.f6759l.mo4108d(new zzahc(j6, 0L));
                }
            }
            if (this.f6762o) {
                this.f6762o = false;
                mo4104g(j2, j2);
                if (zzagbVar.mo4086g() != j2) {
                    zzahaVar.f5303a = j2;
                    return i2;
                }
            }
            zzarf zzarfVar2 = this.f6758k;
            if (zzarfVar2 != null && zzarfVar2.f5195c != null) {
                return zzarfVar2.m4070b(zzagbVar, zzahaVar);
            }
            zzagbVar2 = zzagbVar;
        } else {
            zzagbVar2 = zzagbVar;
            i2 = 1;
        }
        zzeu zzeuVar2 = this.f6750c;
        byte[] bArr2 = zzeuVar2.f14887a;
        if (9400 - zzeuVar2.f14888b < 188) {
            int iM6360B = zzeuVar2.m6360B();
            if (iM6360B > 0) {
                System.arraycopy(bArr2, zzeuVar2.f14888b, bArr2, 0, iM6360B);
            }
            zzeuVar2.m6397z(iM6360B, bArr2);
        }
        while (true) {
            int iM6360B2 = zzeuVar2.m6360B();
            SparseArray sparseArray = this.f6754g;
            if (iM6360B2 >= 188) {
                int i12 = zzeuVar2.f14888b;
                int i13 = zzeuVar2.f14889c;
                byte[] bArr3 = zzeuVar2.f14887a;
                while (i12 < i13 && bArr3[i12] != 71) {
                    i12++;
                }
                zzeuVar2.m6363E(i12);
                int i14 = i12 + 188;
                int i15 = zzeuVar2.f14889c;
                if (i14 > i15) {
                    return 0;
                }
                int iM6376b = zzeuVar2.m6376b();
                if ((8388608 & iM6376b) != 0) {
                    zzeuVar2.m6363E(i14);
                    return 0;
                }
                int i16 = (4194304 & iM6376b) != 0 ? 1 : 0;
                int i17 = iM6376b & 32;
                int i18 = (iM6376b >> 8) & 8191;
                zzarp zzarpVar = (iM6376b & 16) != 0 ? (zzarp) sparseArray.get(i18) : null;
                if (zzarpVar == null) {
                    zzeuVar2.m6363E(i14);
                    return 0;
                }
                int i19 = iM6376b & 15;
                SparseIntArray sparseIntArray = this.f6751d;
                int i20 = sparseIntArray.get(i18, i19 - 1);
                sparseIntArray.put(i18, i19);
                if (i20 == i19) {
                    zzeuVar2.m6363E(i14);
                    return 0;
                }
                if (i19 != ((i20 + 1) & 15)) {
                    zzarpVar.zzb();
                }
                if (i17 != 0) {
                    int iM6369K = zzeuVar2.m6369K();
                    i16 |= (zzeuVar2.m6369K() & 64) != 0 ? 2 : 0;
                    zzeuVar2.m6365G(iM6369K - 1);
                }
                boolean z = this.f6760m;
                if (z || !this.f6756i.get(i18, false)) {
                    zzeuVar2.m6361C(i14);
                    zzarpVar.mo4329a(i16, zzeuVar2);
                    zzeuVar2.m6361C(i15);
                }
                if (!z && this.f6760m && jMo4089j != -1) {
                    this.f6762o = true;
                }
                zzeuVar2.m6363E(i14);
                return 0;
            }
            int i21 = zzeuVar2.f14889c;
            int iMo4082b = zzagbVar2.mo4082b(bArr2, i21, 9400 - i21);
            if (iMo4082b == -1) {
                int i22 = 0;
                while (i22 < sparseArray.size()) {
                    zzarp zzarpVar2 = (zzarp) sparseArray.valueAt(i22);
                    if (zzarpVar2 instanceof zzaqt) {
                        zzaqt zzaqtVar = (zzaqt) zzarpVar2;
                        if (zzaqtVar.f6681c == 3 && zzaqtVar.f6688j == -1) {
                            zzaqtVar.mo4329a(i2, new zzeu());
                        }
                    }
                    i22++;
                    i2 = 1;
                }
                return -1;
            }
            zzeuVar2.m6361C(i21 + iMo4082b);
            i2 = 1;
        }
    }

    public zzark(int i2, zzanq zzanqVar, zzfj zzfjVar, zzapx zzapxVar) {
        this.f6752e = zzapxVar;
        this.f6748a = i2;
        this.f6753f = zzanqVar;
        this.f6749b = Collections.singletonList(zzfjVar);
        this.f6750c = new zzeu(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f6755h = sparseBooleanArray;
        this.f6756i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f6754g = sparseArray;
        this.f6751d = new SparseIntArray();
        this.f6757j = new zzarg();
        this.f6759l = zzagd.f5243j;
        this.f6763p = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f6754g.put(sparseArray2.keyAt(i3), (zzarp) sparseArray2.valueAt(i3));
        }
        this.f6754g.put(0, new zzarb(new zzarh(this)));
    }
}
