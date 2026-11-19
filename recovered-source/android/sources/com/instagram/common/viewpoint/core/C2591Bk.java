package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bk */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2591Bk {
    public final C2613C6 A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final DownloadRequest A07;

    public C2591Bk(DownloadRequest downloadRequest, int i2, long j2, long j3, long j4, int i3, int i4) {
        this(downloadRequest, i2, j2, j3, j4, i3, i4, new C2613C6());
    }

    public C2591Bk(DownloadRequest downloadRequest, int i2, long j2, long j3, long j4, int i3, int i4, C2613C6 c2613c6) {
        AbstractC21273y.A01(c2613c6);
        AbstractC21273y.A07((i4 == 0) == (i2 != 4));
        if (i3 != 0) {
            AbstractC21273y.A07((i2 == 2 || i2 == 0) ? false : true);
        }
        this.A07 = downloadRequest;
        this.A02 = i2;
        this.A05 = j2;
        this.A06 = j3;
        this.A04 = j4;
        this.A03 = i3;
        this.A01 = i4;
        this.A00 = c2613c6;
    }

    public final float A00() {
        return this.A00.A00;
    }

    public final long A01() {
        return this.A00.A01;
    }

    public final boolean A02() {
        return this.A02 == 3 || this.A02 == 4;
    }
}
