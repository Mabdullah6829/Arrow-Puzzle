package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3C */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC20823C {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;

    public AbstractC20823C(AbstractC20823C abstractC20823C) {
        this.A04 = abstractC20823C.A04;
        this.A00 = abstractC20823C.A00;
        this.A01 = abstractC20823C.A01;
        this.A03 = abstractC20823C.A03;
        this.A02 = abstractC20823C.A02;
    }

    public AbstractC20823C(Object obj) {
        this(obj, -1L);
    }

    public AbstractC20823C(Object obj, int i2, int i3, long j2) {
        this(obj, i2, i3, j2, -1);
    }

    public AbstractC20823C(Object obj, int i2, int i3, long j2, int i4) {
        this.A04 = obj;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = j2;
        this.A02 = i4;
    }

    public AbstractC20823C(Object obj, long j2) {
        this(obj, -1, -1, j2, -1);
    }

    public final boolean A00() {
        return this.A00 != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC20823C)) {
            return false;
        }
        AbstractC20823C abstractC20823C = (AbstractC20823C) obj;
        return this.A04.equals(abstractC20823C.A04) && this.A00 == abstractC20823C.A00 && this.A01 == abstractC20823C.A01 && this.A03 == abstractC20823C.A03 && this.A02 == abstractC20823C.A02;
    }

    public final int hashCode() {
        int result = this.A04.hashCode();
        int result2 = ((((17 * 31) + result) * 31) + this.A00) * 31;
        int result3 = this.A01;
        int result4 = (((result2 + result3) * 31) + ((int) this.A03)) * 31;
        int result5 = this.A02;
        return result4 + result5;
    }
}
