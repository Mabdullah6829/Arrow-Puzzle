package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzarq {
    /* JADX INFO: renamed from: a */
    public static long m4341a(zzeu zzeuVar, int i2, int i3) {
        zzeuVar.m6363E(i2);
        if (zzeuVar.m6360B() < 5) {
            return -9223372036854775807L;
        }
        int iM6376b = zzeuVar.m6376b();
        if ((8388608 & iM6376b) != 0 || ((iM6376b >> 8) & 8191) != i3 || (iM6376b & 32) == 0 || zzeuVar.m6369K() < 7 || zzeuVar.m6360B() < 7 || (zzeuVar.m6369K() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzeuVar.m6366H(bArr, 0, 6);
        long j2 = bArr[0];
        long j3 = bArr[1];
        long j4 = bArr[2];
        long j5 = bArr[3] & 255;
        return ((j2 & 255) << 25) | ((j3 & 255) << 17) | ((j4 & 255) << 9) | (j5 + j5) | ((((long) bArr[4]) & 255) >> 7);
    }
}
