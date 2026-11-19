package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2y */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C20682y {
    public final Uri A00;
    public final List<Integer> A01;

    @Deprecated
    public final List<Integer> A02;
    public final Map<String, String> A03;

    @Deprecated
    public final Map<String, String> A04;
    public final UUID A05;

    @Deprecated
    public final UUID A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final byte[] A0A;

    public C20682y(C20672x c20672x) {
        byte[] bArrCopyOf;
        AbstractC21273y.A08((c20672x.A04 && c20672x.A00 == null) ? false : true);
        this.A05 = (UUID) AbstractC21273y.A01(c20672x.A03);
        this.A06 = this.A05;
        this.A00 = c20672x.A00;
        this.A04 = c20672x.A02;
        this.A03 = c20672x.A02;
        this.A08 = c20672x.A05;
        this.A07 = c20672x.A04;
        this.A09 = c20672x.A06;
        this.A02 = c20672x.A01;
        this.A01 = c20672x.A01;
        if (c20672x.A07 != null) {
            bArrCopyOf = Arrays.copyOf(c20672x.A07, c20672x.A07.length);
        } else {
            bArrCopyOf = null;
        }
        this.A0A = bArrCopyOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20682y)) {
            return false;
        }
        C20682y c20682y = (C20682y) obj;
        if (this.A05.equals(c20682y.A05) && AbstractC22035C.A1E(this.A00, c20682y.A00) && AbstractC22035C.A1E(this.A03, c20682y.A03) && this.A08 == c20682y.A08 && this.A07 == c20682y.A07 && this.A09 == c20682y.A09 && this.A01.equals(c20682y.A01) && Arrays.equals(this.A0A, c20682y.A0A)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.A05.hashCode() * 31) + (this.A00 != null ? this.A00.hashCode() : 0)) * 31) + this.A03.hashCode()) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + this.A01.hashCode()) * 31) + Arrays.hashCode(this.A0A);
    }
}
