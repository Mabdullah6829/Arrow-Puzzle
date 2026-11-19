package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9t */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC24779t extends Timeline {
    public final Timeline A00;

    public AbstractC24779t(Timeline timeline) {
        this.A00 = timeline;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A06() {
        return this.A00.A06();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A07() {
        return this.A00.A07();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public int A08(int i2, int i3, boolean z) {
        return this.A00.A08(i2, i3, z);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public int A0A(Object obj) {
        return this.A00.A0A(obj);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0B(boolean z) {
        return this.A00.A0B(z);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0C(boolean z) {
        return this.A00.A0C(z);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public C5031pl A0I(int i2, C5031pl c5031pl, boolean z) {
        return this.A00.A0I(i2, c5031pl, z);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public C5029pj A0L(int i2, C5029pj c5029pj, long j2) {
        return this.A00.A0L(i2, c5029pj, j2);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public Object A0M(int i2) {
        return this.A00.A0M(i2);
    }
}
