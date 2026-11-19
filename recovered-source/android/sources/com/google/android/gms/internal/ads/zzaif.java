package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
final class zzaif implements zzafl {

    /* JADX INFO: renamed from: a */
    public final zzagn f5410a;

    /* JADX INFO: renamed from: b */
    public final int f5411b;

    /* JADX INFO: renamed from: c */
    public final zzagh f5412c = new zzagh();

    public /* synthetic */ zzaif(zzagn zzagnVar, int i2) {
        this.f5410a = zzagnVar;
        this.f5411b = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    /* JADX INFO: renamed from: a */
    public final zzafk mo4067a(zzagb zzagbVar, long j2) {
        long jMo4086g = zzagbVar.mo4086g();
        long jM4140b = m4140b(zzagbVar);
        long jMo4084e = zzagbVar.mo4084e();
        zzagbVar.mo4075E(Math.max(6, this.f5410a.f5252c));
        long jM4140b2 = m4140b(zzagbVar);
        long jMo4084e2 = zzagbVar.mo4084e();
        if (jM4140b > j2 || jM4140b2 <= j2) {
            return jM4140b2 <= j2 ? new zzafk(-2, jM4140b2, jMo4084e2) : new zzafk(-1, jM4140b, jMo4086g);
        }
        return new zzafk(0, -9223372036854775807L, jMo4084e);
    }

    /* JADX INFO: renamed from: b */
    public final long m4140b(zzagb zzagbVar) {
        zzagh zzaghVar;
        zzagn zzagnVar;
        int iMo4080J;
        while (true) {
            long jMo4084e = zzagbVar.mo4084e();
            long jMo4089j = zzagbVar.mo4089j() - 6;
            zzaghVar = this.f5412c;
            zzagnVar = this.f5410a;
            if (jMo4084e >= jMo4089j) {
                break;
            }
            long jMo4084e2 = zzagbVar.mo4084e();
            zzeu zzeuVar = new zzeu(17);
            int i2 = 0;
            zzagbVar.mo4078H(zzeuVar.f14887a, 0, 2);
            char cM6392r = zzeuVar.m6392r(0, ByteOrder.BIG_ENDIAN);
            int i3 = this.f5411b;
            if (cM6392r != i3) {
                zzagbVar.zzl();
                zzagbVar.mo4075E((int) (jMo4084e2 - zzagbVar.mo4086g()));
            } else {
                byte[] bArr = zzeuVar.f14887a;
                while (i2 < 15 && (iMo4080J = zzagbVar.mo4080J(bArr, 2 + i2, 15 - i2)) != -1) {
                    i2 += iMo4080J;
                }
                zzeuVar.m6361C(i2 + 2);
                zzagbVar.zzl();
                zzagbVar.mo4075E((int) (jMo4084e2 - zzagbVar.mo4086g()));
                if (zzagi.m4113a(zzeuVar, zzagnVar, i3, zzaghVar)) {
                    break;
                }
            }
            zzagbVar.mo4075E(1);
        }
        if (zzagbVar.mo4084e() < zzagbVar.mo4089j() - 6) {
            return zzaghVar.f5244a;
        }
        zzagbVar.mo4075E((int) (zzagbVar.mo4089j() - zzagbVar.mo4084e()));
        return zzagnVar.f5259j;
    }
}
