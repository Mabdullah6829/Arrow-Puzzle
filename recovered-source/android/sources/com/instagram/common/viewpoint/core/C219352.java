package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.52 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C219352<V> {
    public int A00;
    public int A01;
    public long[] A02;
    public V[] A03;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.52 != com.facebook.ads.androidx.media3.common.util.TimedValueQueue<V> */
    public C219352() {
        this(10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.52 != com.facebook.ads.androidx.media3.common.util.TimedValueQueue<V> */
    public C219352(int i2) {
        this.A02 = new long[i2];
        this.A03 = (V[]) A00(i2);
    }

    public static <V> V[] A00(int i2) {
        return (V[]) new Object[i2];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.52 != com.facebook.ads.androidx.media3.common.util.TimedValueQueue<V> */
    public final synchronized void A01() {
        this.A00 = 0;
        this.A01 = 0;
        Arrays.fill(this.A03, (Object) null);
    }
}
