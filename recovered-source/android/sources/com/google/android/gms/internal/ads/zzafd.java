package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafd {

    /* JADX INFO: renamed from: a */
    public static final int[] f5157a = {AdError.CACHE_ERROR_CODE, AdError.SERVER_ERROR_CODE, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX INFO: renamed from: a */
    public static zzafc m4057a(zzet zzetVar) {
        int i2;
        int i3;
        int iM6345h = zzetVar.m6345h(16);
        int iM6345h2 = zzetVar.m6345h(16);
        if (iM6345h2 == 65535) {
            iM6345h2 = zzetVar.m6345h(24);
            i2 = 7;
        } else {
            i2 = 4;
        }
        int i4 = iM6345h2 + i2;
        if (iM6345h == 44097) {
            i4 += 2;
        }
        if (zzetVar.m6345h(2) == 3) {
            do {
                zzetVar.m6345h(2);
            } while (zzetVar.m6344g());
        }
        int iM6345h3 = zzetVar.m6345h(10);
        if (zzetVar.m6344g() && zzetVar.m6345h(3) > 0) {
            zzetVar.m6343f(2);
        }
        int i5 = true != zzetVar.m6344g() ? 44100 : 48000;
        int iM6345h4 = zzetVar.m6345h(4);
        int[] iArr = f5157a;
        if (i5 == 44100 && iM6345h4 == 13) {
            i3 = iArr[13];
        } else if (i5 != 48000 || iM6345h4 >= 14) {
            i3 = 0;
        } else {
            int i6 = iArr[iM6345h4];
            int i7 = iM6345h3 % 5;
            if (i7 == 1) {
                if (iM6345h4 != 3 || iM6345h4 == 8) {
                    i3 = i6 + 1;
                } else {
                    i3 = i6;
                }
            } else if (i7 != 2) {
                if (i7 == 3) {
                    if (iM6345h4 != 3) {
                    }
                    i3 = i6 + 1;
                } else if (i7 == 4 && (iM6345h4 == 3 || iM6345h4 == 8 || iM6345h4 == 11)) {
                    i3 = i6 + 1;
                } else {
                    i3 = i6;
                }
            } else if (iM6345h4 == 8 || iM6345h4 == 11) {
                i3 = i6 + 1;
            } else {
                i3 = i6;
            }
        }
        return new zzafc(i5, i4, i3);
    }

    /* JADX INFO: renamed from: b */
    public static void m4058b(int i2, zzeu zzeuVar) {
        zzeuVar.m6396y(7);
        byte[] bArr = zzeuVar.f14887a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i2 >> 16) & 255);
        bArr[5] = (byte) ((i2 >> 8) & 255);
        bArr[6] = (byte) (i2 & 255);
    }

    /* JADX INFO: renamed from: c */
    public static void m4059c(zzet zzetVar, zzafb zzafbVar) throws zzat {
        int iM6345h = zzetVar.m6345h(5);
        zzetVar.m6343f(2);
        if (zzetVar.m6344g()) {
            zzetVar.m6343f(5);
        }
        if (iM6345h >= 7 && iM6345h <= 10) {
            zzetVar.m6342e();
        }
        if (zzetVar.m6344g()) {
            int iM6345h2 = zzetVar.m6345h(3);
            if (zzafbVar.f5148b == -1 && iM6345h >= 0 && iM6345h <= 15 && (iM6345h2 == 0 || iM6345h2 == 1)) {
                zzafbVar.f5148b = iM6345h;
            }
            if (zzetVar.m6344g()) {
                m4061e(zzetVar);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m4060d(zzet zzetVar, zzafb zzafbVar) throws zzat {
        zzetVar.m6343f(2);
        boolean zM6344g = zzetVar.m6344g();
        int iM6345h = zzetVar.m6345h(8);
        for (int i2 = 0; i2 < iM6345h; i2++) {
            zzetVar.m6343f(2);
            if (zzetVar.m6344g()) {
                zzetVar.m6343f(5);
            }
            if (zM6344g) {
                zzetVar.m6343f(24);
            } else {
                if (zzetVar.m6344g()) {
                    if (!zzetVar.m6344g()) {
                        zzetVar.m6343f(4);
                    }
                    zzafbVar.f5149c = zzetVar.m6345h(6) + 1;
                }
                zzetVar.m6343f(4);
            }
        }
        if (zzetVar.m6344g()) {
            zzetVar.m6343f(3);
            if (zzetVar.m6344g()) {
                m4061e(zzetVar);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m4061e(zzet zzetVar) throws zzat {
        int iM6345h = zzetVar.m6345h(6);
        if (iM6345h < 2 || iM6345h > 42) {
            throw zzat.m4384b(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iM6345h)));
        }
        zzetVar.m6343f(iM6345h * 8);
    }
}
