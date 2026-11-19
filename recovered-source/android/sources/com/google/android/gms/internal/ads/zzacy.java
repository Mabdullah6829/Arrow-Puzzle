package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzacy {

    /* JADX INFO: renamed from: a */
    public long f4941a;

    /* JADX INFO: renamed from: b */
    public long f4942b;

    /* JADX INFO: renamed from: c */
    public long f4943c;

    /* JADX INFO: renamed from: d */
    public long f4944d;

    /* JADX INFO: renamed from: e */
    public long f4945e;

    /* JADX INFO: renamed from: f */
    public long f4946f;

    /* JADX INFO: renamed from: g */
    public final boolean[] f4947g = new boolean[15];

    /* JADX INFO: renamed from: h */
    public int f4948h;

    /* JADX INFO: renamed from: a */
    public final void m3969a() {
        this.f4944d = 0L;
        this.f4945e = 0L;
        this.f4946f = 0L;
        this.f4948h = 0;
        Arrays.fill(this.f4947g, false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3970b() {
        return this.f4944d > 15 && this.f4948h == 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m3971c(long j2) {
        long j3 = this.f4944d;
        if (j3 == 0) {
            this.f4941a = j2;
        } else if (j3 == 1) {
            long j4 = j2 - this.f4941a;
            this.f4942b = j4;
            this.f4946f = j4;
            this.f4945e = 1L;
        } else {
            long j5 = j2 - this.f4943c;
            long jAbs = Math.abs(j5 - this.f4942b);
            int i2 = (int) (j3 % 15);
            boolean[] zArr = this.f4947g;
            if (jAbs <= 1000000) {
                this.f4945e++;
                this.f4946f += j5;
                if (zArr[i2]) {
                    zArr[i2] = false;
                    this.f4948h--;
                }
            } else if (!zArr[i2]) {
                zArr[i2] = true;
                this.f4948h++;
            }
        }
        this.f4944d++;
        this.f4943c = j2;
    }
}
