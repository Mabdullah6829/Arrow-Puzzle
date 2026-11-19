package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzais {
    /* JADX INFO: renamed from: a */
    public static boolean m4145a(zzagb zzagbVar, boolean z) {
        int i2;
        zzeu zzeuVar = new zzeu(16);
        boolean z2 = true;
        while (true) {
            zzeuVar.m6396y(8);
            if (!zzagbVar.mo4081K(zzeuVar.f14887a, 0, 8, true)) {
                break;
            }
            long jM6374P = zzeuVar.m6374P();
            int iM6376b = zzeuVar.m6376b();
            if (jM6374P != 1) {
                i2 = 8;
            } else {
                if (!zzagbVar.mo4081K(zzeuVar.f14887a, 8, 8, true)) {
                    break;
                }
                jM6374P = zzeuVar.m6384j();
                i2 = 16;
            }
            long j2 = i2;
            if (jM6374P < j2) {
                break;
            }
            int i3 = (int) (jM6374P - j2);
            if (z2) {
                if (iM6376b != 1718909296 || i3 < 8) {
                    break;
                }
                zzeuVar.m6396y(4);
                zzagbVar.mo4078H(zzeuVar.f14887a, 0, 4);
                if (zzeuVar.m6376b() != 1751476579) {
                    break;
                }
                if (!z) {
                    return true;
                }
                zzagbVar.mo4075E(i3 - 4);
                z2 = false;
            } else {
                if (iM6376b == 1836086884) {
                    return true;
                }
                if (i3 != 0) {
                    zzagbVar.mo4075E(i3);
                }
                z2 = false;
            }
        }
        return false;
    }
}
