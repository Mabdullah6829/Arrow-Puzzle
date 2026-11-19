package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawk {

    /* JADX INFO: renamed from: a */
    public final ArrayList f7175a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public int f7176b = 0;

    /* JADX INFO: renamed from: a */
    public final int m4461a(long j2) throws zzawi {
        long j3;
        int[] iArr = {2001100545, 2130723407, 140753313, -149863858, -2003236720, 202391198, 23353437, 1141616124, 84353895};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int iM3770b = AbstractC5152f.m3770b((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8);
        int i10 = i9 % 84353895;
        long[] jArr = {269441500, 1994078854, 158128940, -158130045, -1992289935, 556430036, 8936987, 2147469841, 438792350};
        long j4 = jArr[0];
        long j5 = jArr[1];
        long j6 = jArr[2];
        long j7 = jArr[3];
        long j8 = jArr[4];
        long j9 = jArr[5];
        long j10 = jArr[6];
        long j11 = jArr[7];
        long j12 = (((((~j4) & j5) | j6) + ((j4 & j7) | j8)) - j9) + j10;
        long j13 = j11 % 438792350;
        if (j2 >= 0) {
            j3 = ((long) (this.f7176b + (iM3770b ^ i10))) - j2;
        } else {
            j3 = (j12 ^ j13) + (-j2);
        }
        if (j3 < 0 || j3 >= this.f7176b) {
            throw new zzawi();
        }
        return (int) j3;
    }

    /* JADX INFO: renamed from: b */
    public final void m4462b(zzawt zzawtVar) {
        int[] iArr = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int iM3770b = AbstractC5152f.m3770b((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8);
        int i10 = this.f7176b;
        if (i10 >= ((i9 % 937558955) ^ iM3770b)) {
            throw new zzawj();
        }
        ArrayList arrayList = this.f7175a;
        if (i10 == arrayList.size()) {
            arrayList.add(zzawtVar);
        } else {
            arrayList.set(this.f7176b, zzawtVar);
        }
        this.f7176b++;
    }

    /* JADX INFO: renamed from: c */
    public final zzawt m4463c() {
        int[] iArr = {91119157, 1459677288, 586253619, -183145911, -1567288443, 919325394, 146725508, 787086305, 459541652};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int iM3770b = AbstractC5152f.m3770b((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8);
        int i10 = i9 % 459541652;
        int i11 = this.f7176b;
        if (i11 <= 0) {
            throw new zzawi();
        }
        int i12 = i10 ^ iM3770b;
        ArrayList arrayList = this.f7175a;
        zzawt zzawtVar = (zzawt) arrayList.get(i11 + i12);
        arrayList.set(this.f7176b + i12, null);
        this.f7176b += i12;
        return zzawtVar;
    }

    /* JADX INFO: renamed from: d */
    public final zzawt m4464d(long j2) {
        return (zzawt) this.f7175a.get(m4461a(j2));
    }
}
