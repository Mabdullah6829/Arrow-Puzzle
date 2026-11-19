package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaqq {
    /* JADX INFO: renamed from: a */
    public static void m4320a(zzet zzetVar) {
        int iM6345h;
        int iM6345h2 = zzetVar.m6345h(2);
        if (iM6345h2 == 0) {
            zzetVar.m6343f(6);
            return;
        }
        int iM4322c = m4322c(zzetVar, 5, 8, 16) + 1;
        if (iM6345h2 == 1) {
            zzetVar.m6343f(iM4322c * 7);
            return;
        }
        if (iM6345h2 == 2) {
            boolean zM6344g = zzetVar.m6344g();
            int i2 = true != zM6344g ? 5 : 1;
            int i3 = true == zM6344g ? 7 : 5;
            int i4 = true == zM6344g ? 8 : 6;
            int i5 = 0;
            while (i5 < iM4322c) {
                if (zzetVar.m6344g()) {
                    zzetVar.m6343f(7);
                    iM6345h = 0;
                } else {
                    if (zzetVar.m6345h(2) == 3 && zzetVar.m6345h(i3) * i2 != 0) {
                        zzetVar.m6342e();
                    }
                    iM6345h = zzetVar.m6345h(i4) * i2;
                    if (iM6345h != 0 && iM6345h != 180) {
                        zzetVar.m6342e();
                    }
                    zzetVar.m6342e();
                }
                if (iM6345h != 0 && iM6345h != 180 && zzetVar.m6344g()) {
                    i5++;
                }
                i5++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4321b(zzet zzetVar) {
        zzetVar.m6343f(3);
        zzetVar.m6343f(8);
        boolean zM6344g = zzetVar.m6344g();
        boolean zM6344g2 = zzetVar.m6344g();
        if (zM6344g) {
            zzetVar.m6343f(5);
        }
        if (zM6344g2) {
            zzetVar.m6343f(6);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m4322c(zzet zzetVar, int i2, int i3, int i4) {
        zzgtr.m7128a(Math.max(Math.max(i2, i3), i4) <= 31);
        int i5 = (1 << i2) - 1;
        int i6 = (1 << i3) - 1;
        Math.addExact(Math.addExact(i5, i6), 1 << i4);
        if (zzetVar.m6339b() >= i2) {
            int iM6345h = zzetVar.m6345h(i2);
            if (iM6345h == i5) {
                if (zzetVar.m6339b() >= i3) {
                    int iM6345h2 = zzetVar.m6345h(i3);
                    iM6345h += iM6345h2;
                    if (iM6345h2 == i6) {
                        if (zzetVar.m6339b() >= i4) {
                            return zzetVar.m6345h(i4) + iM6345h;
                        }
                    }
                }
            }
            return iM6345h;
        }
        return -1;
    }
}
