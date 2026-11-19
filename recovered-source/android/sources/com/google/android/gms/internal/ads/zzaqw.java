package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaqw {

    /* JADX INFO: renamed from: c */
    public boolean f6694c;

    /* JADX INFO: renamed from: d */
    public boolean f6695d;

    /* JADX INFO: renamed from: e */
    public boolean f6696e;

    /* JADX INFO: renamed from: a */
    public final zzfj f6692a = new zzfj();

    /* JADX INFO: renamed from: f */
    public long f6697f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f6698g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f6699h = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final zzeu f6693b = new zzeu();

    /* JADX INFO: renamed from: a */
    public static long m4333a(zzeu zzeuVar) {
        int i2 = zzeuVar.f14888b;
        if (zzeuVar.m6360B() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzeuVar.m6366H(bArr, 0, 9);
        zzeuVar.m6363E(i2);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j2 = b;
        long j3 = b2;
        long j4 = (248 & j3) >> 3;
        long j5 = (j3 & 3) << 13;
        return j5 | ((bArr[1] & 255) << 20) | ((j2 & 3) << 28) | (((j2 & 56) >> 3) << 30) | (j4 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
    }

    /* JADX INFO: renamed from: b */
    public static final int m4334b(int i2, byte[] bArr) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }
}
