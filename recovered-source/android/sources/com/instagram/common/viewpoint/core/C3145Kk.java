package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kk */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3145Kk implements Comparable<C3145Kk> {
    public final int A00;
    public final C3136Kb A01;

    public C3145Kk(int i2, C3136Kb c3136Kb) {
        this.A00 = i2;
        this.A01 = c3136Kb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3145Kk c3145Kk) {
        return Integer.compare(this.A00, c3145Kk.A00);
    }
}
