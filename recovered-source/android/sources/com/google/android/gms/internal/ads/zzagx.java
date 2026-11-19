package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzagx {

    /* JADX INFO: renamed from: a */
    public int f5289a;

    /* JADX INFO: renamed from: b */
    public String f5290b;

    /* JADX INFO: renamed from: c */
    public int f5291c;

    /* JADX INFO: renamed from: d */
    public int f5292d;

    /* JADX INFO: renamed from: e */
    public int f5293e;

    /* JADX INFO: renamed from: f */
    public int f5294f;

    /* JADX INFO: renamed from: g */
    public int f5295g;

    /* JADX INFO: renamed from: a */
    public final boolean m4127a(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return false;
        }
        int i7 = i5 - 1;
        this.f5289a = i3;
        this.f5290b = zzagy.f5296a[3 - i4];
        int i8 = zzagy.f5297b[i6];
        this.f5292d = i8;
        if (i3 == 2) {
            i8 /= 2;
            this.f5292d = i8;
        } else if (i3 == 0) {
            i8 /= 4;
            this.f5292d = i8;
        }
        int i9 = (i2 >>> 9) & 1;
        int i10 = 1152;
        if (i4 != 1) {
            if (i4 != 2) {
                i10 = 384;
            }
        } else if (i3 != 3) {
            i10 = 576;
        }
        this.f5295g = i10;
        if (i4 == 3) {
            int i11 = i3 == 3 ? zzagy.f5298c[i7] : zzagy.f5299d[i7];
            this.f5294f = i11;
            this.f5291c = (((i11 * 12) / i8) + i9) * 4;
        } else {
            if (i3 == 3) {
                int i12 = i4 == 2 ? zzagy.f5300e[i7] : zzagy.f5301f[i7];
                this.f5294f = i12;
                this.f5291c = AbstractC1456a.m2436c(i12, 144, i8, i9);
            } else {
                int i13 = zzagy.f5302g[i7];
                this.f5294f = i13;
                this.f5291c = AbstractC1456a.m2436c(i4 == 1 ? 72 : 144, i13, i8, i9);
            }
        }
        this.f5293e = ((i2 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
