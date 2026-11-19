package com.instagram.common.viewpoint.core;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8O */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C24018O {
    public static final C24018O A03;
    public final String A00;
    public final C24008N A01;
    public final Object A02;

    static {
        C24018O c24018o;
        if (AbstractC22035C.A02 < 31) {
            c24018o = new C24018O("");
        } else {
            c24018o = new C24018O(C24008N.A01, "");
        }
        A03 = c24018o;
    }

    public C24018O(C24008N c24008n, String str) {
        this.A01 = c24008n;
        this.A00 = str;
        this.A02 = new Object();
    }

    public C24018O(String str) {
        AbstractC21273y.A08(AbstractC22035C.A02 < 31);
        this.A00 = str;
        this.A01 = null;
        this.A02 = new Object();
    }

    public final LogSessionId A00() {
        return ((C24008N) AbstractC21273y.A01(this.A01)).A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24018O)) {
            return false;
        }
        C24018O c24018o = (C24018O) obj;
        if (Objects.equals(this.A00, c24018o.A00) && Objects.equals(this.A01, c24018o.A01) && Objects.equals(this.A02, c24018o.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.A00, this.A01, this.A02);
    }
}
