package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzakn {

    /* JADX INFO: renamed from: a */
    public final zzeu f5736a = new zzeu(8);

    /* JADX INFO: renamed from: b */
    public int f5737b;

    /* JADX INFO: renamed from: a */
    public final long m4178a(zzafr zzafrVar) {
        int i2;
        zzeu zzeuVar = this.f5736a;
        int i3 = 0;
        zzafrVar.mo4081K(zzeuVar.f14887a, 0, 1, false);
        int i4 = zzeuVar.f14887a[0] & 255;
        if (i4 == 0) {
            return Long.MIN_VALUE;
        }
        int i5 = 128;
        int i6 = 0;
        while (true) {
            i2 = i6 + 1;
            if ((i4 & i5) != 0) {
                break;
            }
            i5 >>= 1;
            i6 = i2;
        }
        int i7 = i4 & (~i5);
        zzafrVar.mo4081K(zzeuVar.f14887a, 1, i6, false);
        while (i3 < i6) {
            i3++;
            i7 = (zzeuVar.f14887a[i3] & 255) + (i7 << 8);
        }
        this.f5737b += i2;
        return i7;
    }
}
