package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafn {
    /* JADX INFO: renamed from: a */
    public static void m4071a(long j2, zzeu zzeuVar, zzahm[] zzahmVarArr) {
        int i2;
        int iM6376b;
        int iM6369K;
        while (true) {
            if (zzeuVar.m6360B() <= 1) {
                return;
            }
            int i3 = 0;
            while (true) {
                if (zzeuVar.m6360B() == 0) {
                    i2 = -1;
                    break;
                }
                int iM6369K2 = zzeuVar.m6369K();
                i3 += iM6369K2;
                if (iM6369K2 != 255) {
                    i2 = i3;
                    break;
                }
            }
            int i4 = 0;
            do {
                if (zzeuVar.m6360B() == 0) {
                    i4 = -1;
                    break;
                } else {
                    iM6369K = zzeuVar.m6369K();
                    i4 += iM6369K;
                }
            } while (iM6369K == 255);
            int i5 = zzeuVar.f14888b + i4;
            if (i4 == -1 || i4 > zzeuVar.m6360B()) {
                zzeh.m6211c("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i5 = zzeuVar.f14889c;
            } else if (i2 == 4 && i4 >= 8) {
                int iM6369K3 = zzeuVar.m6369K();
                int iM6370L = zzeuVar.m6370L();
                if (iM6370L == 49) {
                    iM6376b = zzeuVar.m6376b();
                    iM6370L = 49;
                } else {
                    iM6376b = 0;
                }
                int iM6369K4 = zzeuVar.m6369K();
                if (iM6370L == 47) {
                    zzeuVar.m6365G(1);
                    iM6370L = 47;
                }
                boolean z = iM6369K3 == 181 && (iM6370L == 49 || iM6370L == 47) && iM6369K4 == 3;
                if (iM6370L == 49) {
                    z &= iM6376b == 1195456820;
                }
                if (z) {
                    m4072b(j2, zzeuVar, zzahmVarArr);
                }
            }
            zzeuVar.m6363E(i5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4072b(long j2, zzeu zzeuVar, zzahm[] zzahmVarArr) {
        int iM6369K = zzeuVar.m6369K();
        if ((iM6369K & 64) != 0) {
            int i2 = iM6369K & 31;
            zzeuVar.m6365G(1);
            int i3 = zzeuVar.f14888b;
            for (zzahm zzahmVar : zzahmVarArr) {
                int i4 = i2 * 3;
                zzeuVar.m6363E(i3);
                zzahmVar.mo4121a(i4, zzeuVar);
                zzgtr.m7133f(j2 != -9223372036854775807L);
                zzahmVar.mo4095b(j2, 1, i4, 0, null);
            }
        }
    }
}
