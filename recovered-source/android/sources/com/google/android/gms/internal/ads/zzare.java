package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzare implements zzafl {

    /* JADX INFO: renamed from: a */
    public final zzfj f6729a;

    /* JADX INFO: renamed from: b */
    public final zzeu f6730b = new zzeu();

    /* JADX INFO: renamed from: c */
    public final int f6731c;

    public zzare(int i2, zzfj zzfjVar) {
        this.f6731c = i2;
        this.f6729a = zzfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    /* JADX INFO: renamed from: a */
    public final zzafk mo4067a(zzagb zzagbVar, long j2) {
        long j3;
        long jMo4086g = zzagbVar.mo4086g();
        int iMin = (int) Math.min(112800L, zzagbVar.mo4089j() - jMo4086g);
        zzeu zzeuVar = this.f6730b;
        zzeuVar.m6396y(iMin);
        zzagbVar.mo4078H(zzeuVar.f14887a, 0, iMin);
        int i2 = zzeuVar.f14889c;
        long j4 = -1;
        long j5 = -1;
        long j6 = -9223372036854775807L;
        while (true) {
            if (zzeuVar.m6360B() < 188) {
                j3 = -9223372036854775807L;
                break;
            }
            byte[] bArr = zzeuVar.f14887a;
            int i3 = zzeuVar.f14888b;
            while (true) {
                if (i3 >= i2) {
                    j3 = -9223372036854775807L;
                    break;
                }
                j3 = -9223372036854775807L;
                if (bArr[i3] == 71) {
                    break;
                }
                i3++;
            }
            int i4 = i3 + 188;
            if (i4 > i2) {
                break;
            }
            long jM4341a = zzarq.m4341a(zzeuVar, i3, this.f6731c);
            if (jM4341a != j3) {
                long jM6466c = this.f6729a.m6466c(jM4341a);
                if (jM6466c > j2) {
                    return j6 == j3 ? new zzafk(-1, jM6466c, jMo4086g) : new zzafk(0, -9223372036854775807L, jMo4086g + j5);
                }
                j6 = jM6466c;
                long j7 = i3;
                if (100000 + j6 > j2) {
                    return new zzafk(0, -9223372036854775807L, jMo4086g + j7);
                }
                j5 = j7;
            }
            zzeuVar.m6363E(i4);
            j4 = i4;
        }
        return j6 != j3 ? new zzafk(-2, j6, jMo4086g + j4) : zzafk.f5189d;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final void zzb() {
        byte[] bArr = zzfm.f16092b;
        int length = bArr.length;
        this.f6730b.m6397z(0, bArr);
    }
}
