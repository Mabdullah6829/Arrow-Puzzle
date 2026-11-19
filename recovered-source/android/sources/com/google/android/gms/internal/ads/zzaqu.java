package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaqu implements zzafl {

    /* JADX INFO: renamed from: a */
    public final zzfj f6690a;

    /* JADX INFO: renamed from: b */
    public final zzeu f6691b = new zzeu();

    /* JADX WARN: Code duplicated, block: B:41:0x00e6  */
    @Override // com.google.android.gms.internal.ads.zzafl
    /* JADX INFO: renamed from: a */
    public final zzafk mo4067a(zzagb zzagbVar, long j2) {
        int iM4332d;
        long jMo4086g = zzagbVar.mo4086g();
        int iMin = (int) Math.min(20000L, zzagbVar.mo4089j() - jMo4086g);
        zzeu zzeuVar = this.f6691b;
        zzeuVar.m6396y(iMin);
        zzagbVar.mo4078H(zzeuVar.f14887a, 0, iMin);
        int i2 = -1;
        int i3 = -1;
        long j3 = -9223372036854775807L;
        while (zzeuVar.m6360B() >= 4) {
            if (zzaqv.m4332d(zzeuVar.f14888b, zzeuVar.f14887a) != 442) {
                zzeuVar.m6365G(1);
            } else {
                zzeuVar.m6365G(4);
                long jM4333a = zzaqw.m4333a(zzeuVar);
                if (jM4333a != -9223372036854775807L) {
                    long jM6466c = this.f6690a.m6466c(jM4333a);
                    if (jM6466c > j2) {
                        return j3 == -9223372036854775807L ? new zzafk(-1, jM6466c, jMo4086g) : new zzafk(0, -9223372036854775807L, jMo4086g + ((long) i3));
                    }
                    if (jM6466c + 100000 > j2) {
                        return new zzafk(0, -9223372036854775807L, jMo4086g + ((long) zzeuVar.f14888b));
                    }
                    j3 = jM6466c;
                    i3 = zzeuVar.f14888b;
                }
                int i4 = zzeuVar.f14889c;
                if (zzeuVar.m6360B() >= 10) {
                    zzeuVar.m6365G(9);
                    int iM6369K = zzeuVar.m6369K() & 7;
                    if (zzeuVar.m6360B() >= iM6369K) {
                        zzeuVar.m6365G(iM6369K);
                        if (zzeuVar.m6360B() >= 4) {
                            if (zzaqv.m4332d(zzeuVar.f14888b, zzeuVar.f14887a) == 443) {
                                zzeuVar.m6365G(4);
                                int iM6370L = zzeuVar.m6370L();
                                if (zzeuVar.m6360B() >= iM6370L) {
                                    zzeuVar.m6365G(iM6370L);
                                    while (zzeuVar.m6360B() >= 4) {
                                        iM4332d = zzaqv.m4332d(zzeuVar.f14888b, zzeuVar.f14887a);
                                        if (iM4332d == 442) {
                                            break;
                                        }
                                        break;
                                    }
                                }
                                zzeuVar.m6363E(i4);
                            } else {
                                while (zzeuVar.m6360B() >= 4) {
                                    iM4332d = zzaqv.m4332d(zzeuVar.f14888b, zzeuVar.f14887a);
                                    if (iM4332d == 442 || iM4332d == 441 || (iM4332d >>> 8) != 1) {
                                        break;
                                    }
                                    zzeuVar.m6365G(4);
                                    if (zzeuVar.m6360B() < 2) {
                                        zzeuVar.m6363E(i4);
                                        break;
                                    }
                                    zzeuVar.m6363E(Math.min(zzeuVar.f14889c, zzeuVar.f14888b + zzeuVar.m6370L()));
                                }
                            }
                        } else {
                            zzeuVar.m6363E(i4);
                        }
                    } else {
                        zzeuVar.m6363E(i4);
                    }
                } else {
                    zzeuVar.m6363E(i4);
                }
                i2 = zzeuVar.f14888b;
            }
        }
        return j3 != -9223372036854775807L ? new zzafk(-2, j3, jMo4086g + ((long) i2)) : zzafk.f5189d;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final void zzb() {
        byte[] bArr = zzfm.f16092b;
        int length = bArr.length;
        this.f6691b.m6397z(0, bArr);
    }
}
