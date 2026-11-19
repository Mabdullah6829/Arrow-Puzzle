package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaqz implements zzaga {

    /* JADX INFO: renamed from: e */
    public boolean f6711e;

    /* JADX INFO: renamed from: f */
    public boolean f6712f;

    /* JADX INFO: renamed from: g */
    public boolean f6713g;

    /* JADX INFO: renamed from: h */
    public long f6714h;

    /* JADX INFO: renamed from: i */
    public zzaqv f6715i;

    /* JADX INFO: renamed from: j */
    public zzagd f6716j;

    /* JADX INFO: renamed from: k */
    public boolean f6717k;

    /* JADX INFO: renamed from: a */
    public final zzfj f6707a = new zzfj();

    /* JADX INFO: renamed from: c */
    public final zzeu f6709c = new zzeu(4096);

    /* JADX INFO: renamed from: b */
    public final SparseArray f6708b = new SparseArray();

    /* JADX INFO: renamed from: d */
    public final zzaqw f6710d = new zzaqw();

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: b */
    public final void mo4103b() {
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: g */
    public final void mo4104g(long j2, long j3) {
        long j4;
        zzfj zzfjVar = this.f6707a;
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
        zzaqv zzaqvVar = this.f6715i;
        if (zzaqvVar != null) {
            zzaqvVar.m4069a(j3);
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f6708b;
            if (i2 >= sparseArray.size()) {
                return;
            }
            zzaqx zzaqxVar = (zzaqx) sparseArray.valueAt(i2);
            zzaqxVar.f6705f = false;
            zzaqxVar.f6700a.zza();
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: h */
    public final boolean mo4105h(zzagb zzagbVar) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        zzafr zzafrVar = (zzafr) zzagbVar;
        zzafrVar.mo4081K(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            zzafrVar.m4085f(bArr[13] & 7, false);
            zzafrVar.mo4081K(bArr, 0, 3, false);
            if ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255)) == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: i */
    public final void mo4106i(zzagd zzagdVar) {
        this.f6716j = zzagdVar;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x021e  */
    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: j */
    public final int mo4107j(zzagb zzagbVar, zzaha zzahaVar) {
        int i2;
        long jM6466c;
        zzaqa zzaqcVar;
        long j2;
        zzagd zzagdVar = this.f6716j;
        zzagdVar.getClass();
        long jMo4089j = zzagbVar.mo4089j();
        long j3 = -9223372036854775807L;
        zzaqw zzaqwVar = this.f6710d;
        if (jMo4089j != -1) {
            boolean z = zzaqwVar.f6694c;
            zzeu zzeuVar = zzaqwVar.f6693b;
            if (!z) {
                if (!zzaqwVar.f6696e) {
                    long jMo4089j2 = zzagbVar.mo4089j();
                    int iMin = (int) Math.min(20000L, jMo4089j2);
                    long j4 = jMo4089j2 - ((long) iMin);
                    if (zzagbVar.mo4086g() != j4) {
                        zzahaVar.f5303a = j4;
                        return 1;
                    }
                    zzeuVar.m6396y(iMin);
                    zzagbVar.zzl();
                    zzagbVar.mo4078H(zzeuVar.f14887a, 0, iMin);
                    int i3 = zzeuVar.f14888b;
                    for (int i4 = zzeuVar.f14889c - 4; i4 >= i3; i4--) {
                        if (zzaqw.m4334b(i4, zzeuVar.f14887a) == 442) {
                            zzeuVar.m6363E(i4 + 4);
                            long jM4333a = zzaqw.m4333a(zzeuVar);
                            if (jM4333a != -9223372036854775807L) {
                                j3 = jM4333a;
                                break;
                            }
                        }
                    }
                    zzaqwVar.f6698g = j3;
                    zzaqwVar.f6696e = true;
                    return 0;
                }
                if (zzaqwVar.f6698g == -9223372036854775807L) {
                    byte[] bArr = zzfm.f16092b;
                    int length = bArr.length;
                    zzeuVar.m6397z(0, bArr);
                    zzaqwVar.f6694c = true;
                    zzagbVar.zzl();
                    return 0;
                }
                if (zzaqwVar.f6695d) {
                    long j5 = zzaqwVar.f6697f;
                    if (j5 == -9223372036854775807L) {
                        byte[] bArr2 = zzfm.f16092b;
                        int length2 = bArr2.length;
                        zzeuVar.m6397z(0, bArr2);
                        zzaqwVar.f6694c = true;
                        zzagbVar.zzl();
                        return 0;
                    }
                    zzfj zzfjVar = zzaqwVar.f6692a;
                    zzaqwVar.f6699h = zzfjVar.m6467d(zzaqwVar.f6698g) - zzfjVar.m6466c(j5);
                    byte[] bArr3 = zzfm.f16092b;
                    int length3 = bArr3.length;
                    zzeuVar.m6397z(0, bArr3);
                    zzaqwVar.f6694c = true;
                    zzagbVar.zzl();
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, zzagbVar.mo4089j());
                if (zzagbVar.mo4086g() != 0) {
                    zzahaVar.f5303a = 0L;
                    return 1;
                }
                zzeuVar.m6396y(iMin2);
                zzagbVar.zzl();
                zzagbVar.mo4078H(zzeuVar.f14887a, 0, iMin2);
                int i5 = zzeuVar.f14889c;
                for (int i6 = zzeuVar.f14888b; i6 < i5 - 3; i6++) {
                    if (zzaqw.m4334b(i6, zzeuVar.f14887a) == 442) {
                        zzeuVar.m6363E(i6 + 4);
                        long jM4333a2 = zzaqw.m4333a(zzeuVar);
                        if (jM4333a2 != -9223372036854775807L) {
                            j2 = jM4333a2;
                            zzaqwVar.f6697f = j2;
                            zzaqwVar.f6695d = true;
                            return 0;
                        }
                    }
                }
                j2 = -9223372036854775807L;
                zzaqwVar.f6697f = j2;
                zzaqwVar.f6695d = true;
                return 0;
            }
        }
        if (this.f6717k) {
            i2 = 442;
        } else {
            this.f6717k = true;
            long j6 = zzaqwVar.f6699h;
            if (j6 != -9223372036854775807L) {
                zzaqv zzaqvVar = new zzaqv(new zzafh(), new zzaqu(zzaqwVar.f6692a), j6, j6 + 1, 0L, jMo4089j, 188L, 1000);
                this.f6715i = zzaqvVar;
                this.f6716j.mo4108d(zzaqvVar.f5193a);
                i2 = 442;
            } else {
                i2 = 442;
                zzagdVar.mo4108d(new zzahc(j6, 0L));
            }
        }
        zzaqv zzaqvVar2 = this.f6715i;
        if (zzaqvVar2 != null && zzaqvVar2.f5195c != null) {
            return zzaqvVar2.m4070b(zzagbVar, zzahaVar);
        }
        zzagbVar.zzl();
        long jMo4084e = jMo4089j != -1 ? jMo4089j - zzagbVar.mo4084e() : -1L;
        if (jMo4084e != -1 && jMo4084e < 4) {
            return -1;
        }
        zzeu zzeuVar2 = this.f6709c;
        if (!zzagbVar.mo4081K(zzeuVar2.f14887a, 0, 4, true)) {
            return -1;
        }
        zzeuVar2.m6363E(0);
        int iM6376b = zzeuVar2.m6376b();
        if (iM6376b == 441) {
            return -1;
        }
        if (iM6376b == i2) {
            zzagbVar.mo4078H(zzeuVar2.f14887a, 0, 10);
            zzeuVar2.m6363E(9);
            zzagbVar.mo4091o((zzeuVar2.m6369K() & 7) + 14);
            return 0;
        }
        if (iM6376b == 443) {
            zzagbVar.mo4078H(zzeuVar2.f14887a, 0, 2);
            zzeuVar2.m6363E(0);
            zzagbVar.mo4091o(zzeuVar2.m6370L() + 6);
            return 0;
        }
        if ((iM6376b >> 8) != 1) {
            zzagbVar.mo4091o(1);
            return 0;
        }
        int i7 = iM6376b & 255;
        SparseArray sparseArray = this.f6708b;
        zzaqx zzaqxVar = (zzaqx) sparseArray.get(i7);
        if (!this.f6711e) {
            if (zzaqxVar == null) {
                zzaqa zzaqaVar = null;
                if (i7 == 189) {
                    zzaqcVar = new zzapq(null, 0, "video/mp2p");
                    this.f6712f = true;
                    this.f6714h = zzagbVar.mo4086g();
                } else if ((iM6376b & 224) == 192) {
                    zzaqcVar = new zzaqm(null, 0, "video/mp2p");
                    this.f6712f = true;
                    this.f6714h = zzagbVar.mo4086g();
                } else if ((iM6376b & 240) == 224) {
                    zzaqcVar = new zzaqc(null, "video/mp2p");
                    this.f6713g = true;
                    this.f6714h = zzagbVar.mo4086g();
                } else if (zzaqaVar != null) {
                    zzaqaVar.mo4306d(this.f6716j, new zzaro(Integer.MIN_VALUE, i7, 256));
                    zzaqxVar = new zzaqx(zzaqaVar, this.f6707a);
                    sparseArray.put(i7, zzaqxVar);
                }
                zzaqaVar = zzaqcVar;
                if (zzaqaVar != null) {
                    zzaqaVar.mo4306d(this.f6716j, new zzaro(Integer.MIN_VALUE, i7, 256));
                    zzaqxVar = new zzaqx(zzaqaVar, this.f6707a);
                    sparseArray.put(i7, zzaqxVar);
                }
            }
            long j7 = 1048576;
            if (this.f6712f && this.f6713g) {
                j7 = 8192 + this.f6714h;
            }
            if (zzagbVar.mo4086g() > j7) {
                this.f6711e = true;
                this.f6716j.mo4110v();
            }
        }
        zzagbVar.mo4078H(zzeuVar2.f14887a, 0, 2);
        zzeuVar2.m6363E(0);
        int iM6370L = zzeuVar2.m6370L() + 6;
        if (zzaqxVar == null) {
            zzagbVar.mo4091o(iM6370L);
            return 0;
        }
        zzeuVar2.m6396y(iM6370L);
        zzagbVar.mo4076F(zzeuVar2.f14887a, 0, iM6370L);
        zzeuVar2.m6363E(6);
        zzfj zzfjVar2 = zzaqxVar.f6701b;
        zzet zzetVar = zzaqxVar.f6702c;
        zzeuVar2.m6366H(zzetVar.f14823a, 0, 3);
        zzetVar.m6341d(0);
        zzetVar.m6343f(8);
        zzaqxVar.f6703d = zzetVar.m6344g();
        zzaqxVar.f6704e = zzetVar.m6344g();
        zzetVar.m6343f(6);
        zzeuVar2.m6366H(zzetVar.f14823a, 0, zzetVar.m6345h(8));
        zzetVar.m6341d(0);
        if (zzaqxVar.f6703d) {
            zzetVar.m6343f(4);
            long jM6345h = zzetVar.m6345h(3);
            zzetVar.m6343f(1);
            int iM6345h = zzetVar.m6345h(15) << 15;
            zzetVar.m6343f(1);
            long jM6345h2 = zzetVar.m6345h(15);
            zzetVar.m6343f(1);
            if (!zzaqxVar.f6705f && zzaqxVar.f6704e) {
                zzetVar.m6343f(4);
                long jM6345h3 = ((long) zzetVar.m6345h(3)) << 30;
                zzetVar.m6343f(1);
                int iM6345h2 = zzetVar.m6345h(15) << 15;
                zzetVar.m6343f(1);
                long jM6345h4 = zzetVar.m6345h(15);
                zzetVar.m6343f(1);
                zzfjVar2.m6466c(((long) iM6345h2) | jM6345h3 | jM6345h4);
                zzaqxVar.f6705f = true;
            }
            jM6466c = zzfjVar2.m6466c((jM6345h << 30) | ((long) iM6345h) | jM6345h2);
        } else {
            jM6466c = 0;
        }
        zzaqa zzaqaVar2 = zzaqxVar.f6700a;
        zzaqaVar2.mo4305c(4, jM6466c);
        zzaqaVar2.mo4304b(zzeuVar2);
        zzaqaVar2.mo4303a(false);
        zzeuVar2.m6361C(zzeuVar2.f14887a.length);
        return 0;
    }
}
