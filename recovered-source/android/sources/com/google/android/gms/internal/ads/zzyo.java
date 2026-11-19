package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzyo implements zzzd {

    /* JADX INFO: renamed from: a */
    public final int f21353a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzyr f21354b;

    public zzyo(zzyr zzyrVar, int i2) {
        this.f21354b = zzyrVar;
        this.f21353a = i2;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d7 A[DONT_GENERATE] */
    @Override // com.google.android.gms.internal.ads.zzzd
    /* JADX INFO: renamed from: a */
    public final int mo9033a(zzly zzlyVar, zzix zzixVar, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        zzyr zzyrVar = this.f21354b;
        int i7 = this.f21353a;
        if (zzyrVar.m9040s()) {
            return -3;
        }
        zzyrVar.m9038q(i7);
        zzzc zzzcVar = zzyrVar.f21373K[i7];
        boolean z2 = zzyrVar.f21393e0;
        zzzcVar.getClass();
        boolean z3 = (i2 & 2) != 0;
        zzyy zzyyVar = zzzcVar.f21445b;
        synchronized (zzzcVar) {
            try {
                int i8 = zzzcVar.f21459p;
                int i9 = zzzcVar.f21461r;
                int i10 = i8 + i9;
                int i11 = zzzcVar.f21466w;
                boolean z4 = i11 != -1 && i10 >= i11;
                i3 = -4;
                if (i9 != zzzcVar.f21458o) {
                    if ((i11 == -1 && (i6 = zzzcVar.f21467x) != -1 && i8 + i9 >= i6) || z4) {
                        if (z2) {
                        }
                        i4 = 4;
                        zzixVar.f20033a = 4;
                        zzixVar.f20049e = Long.MIN_VALUE;
                        i5 = -4;
                    } else {
                        zzv zzvVar = ((zzza) zzzcVar.f21446c.m9065a(i10)).f21438a;
                        if (z3 || zzvVar != zzzcVar.f21449f) {
                            zzzcVar.m9055g(zzvVar, zzlyVar);
                            i5 = -5;
                        } else {
                            int iM9058j = zzzcVar.m9058j(zzzcVar.f21461r);
                            if (zzzcVar.f21450g != null) {
                                int i12 = zzzcVar.f21455l[iM9058j];
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                int i13 = zzzcVar.f21455l[iM9058j];
                                zzixVar.f20033a = i13;
                                if (zzzcVar.f21461r == zzzcVar.f21458o - 1 && (z2 || zzzcVar.f21468y)) {
                                    zzixVar.f20033a = 536870912 | i13;
                                }
                                zzixVar.f20049e = zzzcVar.f21456m[iM9058j];
                                zzyyVar.f21429a = zzzcVar.f21454k[iM9058j];
                                zzyyVar.f21430b = zzzcVar.f21453j[iM9058j];
                                zzyyVar.f21431c = zzzcVar.f21457n[iM9058j];
                                i5 = -4;
                            } else {
                                i4 = 4;
                                i5 = -3;
                            }
                        }
                        i4 = 4;
                    }
                } else if (!z2 || zzzcVar.f21468y || z4) {
                    i4 = 4;
                    zzixVar.f20033a = 4;
                    zzixVar.f20049e = Long.MIN_VALUE;
                    i5 = -4;
                } else {
                    zzv zzvVar2 = zzzcVar.f21441B;
                    if (zzvVar2 == null || (!z3 && zzvVar2 == zzzcVar.f21449f)) {
                        i4 = 4;
                        i5 = -3;
                    } else {
                        zzzcVar.m9055g(zzvVar2, zzlyVar);
                        i5 = -5;
                        i4 = 4;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i5 != -4) {
            i3 = i5;
        } else if (!zzixVar.m8564b(i4)) {
            int i14 = i2 & 1;
            if ((i2 & 4) == 0) {
                if (i14 != 0) {
                    zzyx zzyxVar = zzzcVar.f21444a;
                    zzyx.m9049c(zzyxVar.f21426d, zzixVar, zzyyVar, zzyxVar.f21424b);
                } else {
                    zzyx zzyxVar2 = zzzcVar.f21444a;
                    zzyxVar2.f21426d = zzyx.m9049c(zzyxVar2.f21426d, zzixVar, zzyyVar, zzyxVar2.f21424b);
                    zzzcVar.f21461r++;
                }
            } else if (i14 == 0) {
                zzzcVar.f21461r++;
            }
        }
        if (i3 == -3) {
            zzyrVar.m9039r(i7);
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x005b  */
    @Override // com.google.android.gms.internal.ads.zzzd
    /* JADX INFO: renamed from: f */
    public final int mo9034f(long j2) {
        boolean z;
        int iM9056h;
        zzyr zzyrVar = this.f21354b;
        int i2 = this.f21353a;
        if (zzyrVar.m9040s()) {
            return 0;
        }
        zzyrVar.m9038q(i2);
        zzzc zzzcVar = zzyrVar.f21373K[i2];
        boolean z2 = zzyrVar.f21393e0;
        synchronized (zzzcVar) {
            int i3 = zzzcVar.f21461r;
            int iM9058j = zzzcVar.m9058j(i3);
            int i4 = zzzcVar.f21461r;
            int i5 = zzzcVar.f21458o;
            z = true;
            if ((i4 != i5) && j2 >= zzzcVar.f21456m[iM9058j]) {
                if (j2 <= zzzcVar.f21465v || !z2) {
                    iM9056h = zzzcVar.m9056h(iM9058j, i5 - i3, j2, true);
                    if (iM9056h == -1) {
                    }
                } else {
                    iM9056h = i5 - i3;
                }
            }
            iM9056h = 0;
        }
        synchronized (zzzcVar) {
            if (iM9056h >= 0) {
                try {
                    if (zzzcVar.f21461r + iM9056h > zzzcVar.f21458o) {
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                z = false;
            }
            zzgtr.m7128a(z);
            zzzcVar.f21461r += iM9056h;
        }
        if (iM9056h != 0) {
            return iM9056h;
        }
        zzyrVar.m9039r(i2);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final boolean zza() {
        zzyr zzyrVar = this.f21354b;
        return !zzyrVar.m9040s() && zzyrVar.f21373K[this.f21353a].m9061m(zzyrVar.f21393e0);
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final void zzb() throws IOException {
        IOException iOException;
        int i2 = this.f21353a;
        zzyr zzyrVar = this.f21354b;
        zzuj zzujVar = zzyrVar.f21373K[i2].f21450g;
        if (zzujVar != null) {
            throw zzujVar.zza();
        }
        int i3 = zzyrVar.f21383U == 7 ? 6 : 3;
        zzacf zzacfVar = zzyrVar.f21364B;
        IOException iOException2 = zzacfVar.f4899c;
        if (iOException2 != null) {
            throw iOException2;
        }
        zzaca zzacaVar = zzacfVar.f4898b;
        if (zzacaVar != null && (iOException = zzacaVar.f4888u) != null && zzacaVar.f4889v > i3) {
            throw iOException;
        }
    }
}
