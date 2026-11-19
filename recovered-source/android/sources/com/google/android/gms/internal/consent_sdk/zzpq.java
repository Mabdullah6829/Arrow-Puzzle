package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzpq extends zzpv {

    /* JADX INFO: renamed from: d */
    public int f21716d;

    /* JADX INFO: renamed from: A */
    public final void m9156A(int i2) {
        if (!zzpv.f21721c) {
            if ((i2 & (-128)) == 0) {
                this.f21716d++;
                throw null;
            }
            this.f21716d++;
            throw null;
        }
        while ((i2 & (-128)) != 0) {
            int i3 = this.f21716d;
            this.f21716d = i3 + 1;
            zzsw.m9292j(null, i3, (byte) (i2 | 128));
            i2 >>>= 7;
        }
        int i4 = this.f21716d;
        this.f21716d = i4 + 1;
        zzsw.m9292j(null, i4, (byte) i2);
    }

    /* JADX INFO: renamed from: B */
    public final void m9157B(long j2) {
        if (!zzpv.f21721c) {
            if ((j2 & (-128)) == 0) {
                this.f21716d++;
                throw null;
            }
            this.f21716d++;
            throw null;
        }
        while (true) {
            int i2 = (int) j2;
            if ((j2 & (-128)) == 0) {
                int i3 = this.f21716d;
                this.f21716d = i3 + 1;
                zzsw.m9292j(null, i3, (byte) i2);
                return;
            } else {
                int i4 = this.f21716d;
                this.f21716d = i4 + 1;
                zzsw.m9292j(null, i4, (byte) (i2 | 128));
                j2 >>>= 7;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m9158y(int i2) {
        throw null;
    }

    /* JADX INFO: renamed from: z */
    public final void m9159z(long j2) {
        throw null;
    }
}
