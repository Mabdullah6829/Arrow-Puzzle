package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cq */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2657Cq {
    public static final AtomicLong A07 = new AtomicLong();
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    public final C22355i A05;
    public final Map<String, List<String>> A06;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2657Cq(long j2, C22355i c22355i, long j3) {
        Uri uri;
        if (c22355i != null) {
            uri = c22355i.A06;
        } else {
            uri = null;
        }
        this(j2, c22355i, uri, Collections.emptyMap(), j3, 0L, 0L);
    }

    public C2657Cq(long j2, C22355i c22355i, Uri uri, Map<String, List<String>> responseHeaders, long j3, long j4, long j5) {
        this.A03 = j2;
        this.A05 = c22355i;
        this.A04 = uri;
        this.A06 = responseHeaders;
        this.A01 = j3;
        this.A02 = j4;
        this.A00 = j5;
    }

    public static long A00() {
        return A07.getAndIncrement();
    }
}
