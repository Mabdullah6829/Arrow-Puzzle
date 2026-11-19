package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.MJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3242MJ {
    public static final C3242MJ A02 = new C3242MJ();
    public byte A00 = 3;
    public boolean A01 = true;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C3242MJ)) {
            return false;
        }
        C3242MJ c3242mj = (C3242MJ) obj;
        return this.A00 == c3242mj.A00 && this.A01 == c3242mj.A01;
    }

    public final int hashCode() {
        return new Byte(this.A00).hashCode() + new Boolean(this.A01).hashCode();
    }
}
