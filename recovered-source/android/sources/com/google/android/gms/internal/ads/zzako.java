package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzako {

    /* JADX INFO: renamed from: d */
    public static final long[] f5738d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a */
    public final byte[] f5739a = new byte[8];

    /* JADX INFO: renamed from: b */
    public int f5740b;

    /* JADX INFO: renamed from: c */
    public int f5741c;

    /* JADX INFO: renamed from: b */
    public static long m4179b(byte[] bArr, int i2, boolean z) {
        long j2 = ((long) bArr[0]) & 255;
        if (z) {
            j2 &= ~f5738d[i2 - 1];
        }
        for (int i3 = 1; i3 < i2; i3++) {
            j2 = (j2 << 8) | (((long) bArr[i3]) & 255);
        }
        return j2;
    }

    /* JADX INFO: renamed from: a */
    public final long m4180a(zzagb zzagbVar, boolean z, boolean z2, int i2) {
        int i3;
        int i4 = this.f5740b;
        byte[] bArr = this.f5739a;
        if (i4 == 0) {
            if (!zzagbVar.mo4079I(bArr, 0, 1, z)) {
                return -1L;
            }
            int i5 = bArr[0] & 255;
            int i6 = 0;
            while (true) {
                if (i6 >= 8) {
                    i3 = -1;
                    break;
                }
                i3 = i6 + 1;
                if ((f5738d[i6] & ((long) i5)) != 0) {
                    break;
                }
                i6 = i3;
            }
            this.f5741c = i3;
            if (i3 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f5740b = 1;
        }
        int i7 = this.f5741c;
        if (i7 > i2) {
            this.f5740b = 0;
            return -2L;
        }
        if (i7 != 1) {
            zzagbVar.mo4076F(bArr, 1, i7 - 1);
        }
        this.f5740b = 0;
        return m4179b(bArr, this.f5741c, z2);
    }
}
