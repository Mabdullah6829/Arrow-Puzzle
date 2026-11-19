package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawh {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f7174a = new ArrayDeque();

    /* JADX INFO: renamed from: a */
    public final void m4459a(long j2, long j3, long j4) {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        zzawe zzaweVar = new zzawe(j2, j3, j4);
        ArrayDeque arrayDeque = this.f7174a;
        if (arrayDeque.size() >= (AbstractC5152f.m3770b((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8) ^ (i9 % 452867621))) {
            throw new zzawf();
        }
        arrayDeque.push(zzaweVar);
    }

    /* JADX INFO: renamed from: b */
    public final zzawe m4460b() {
        return (zzawe) Optional.ofNullable((zzawe) this.f7174a.peek()).orElseThrow(zzawd.f7168b);
    }
}
