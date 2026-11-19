package com.instagram.common.viewpoint.core;

import androidx.core.location.LocationRequestCompat;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7u */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C23717u {
    public final long A00;
    public final long A01;
    public static final C23717u A04 = new C23717u(0, 0);
    public static final C23717u A02 = new C23717u(LocationRequestCompat.PASSIVE_INTERVAL, LocationRequestCompat.PASSIVE_INTERVAL);
    public static final C23717u A06 = new C23717u(LocationRequestCompat.PASSIVE_INTERVAL, 0);
    public static final C23717u A05 = new C23717u(0, LocationRequestCompat.PASSIVE_INTERVAL);
    public static final C23717u A03 = A04;

    public C23717u(long j2, long j3) {
        AbstractC21273y.A07(j2 >= 0);
        AbstractC21273y.A07(j3 >= 0);
        this.A01 = j2;
        this.A00 = j3;
    }

    public final long A00(long minPositionUs, long j2, long j3) {
        if (this.A01 == 0 && this.A00 == 0) {
            return minPositionUs;
        }
        long jA0V = AbstractC22035C.A0V(minPositionUs, this.A01, Long.MIN_VALUE);
        long jA0S = AbstractC22035C.A0S(minPositionUs, this.A00, LocationRequestCompat.PASSIVE_INTERVAL);
        boolean z = true;
        boolean z2 = jA0V <= j2 && j2 <= jA0S;
        if (jA0V > j3 || j3 > jA0S) {
            z = false;
        }
        if (z2 && z) {
            long jAbs = Math.abs(j2 - minPositionUs);
            long maxPositionUs = Math.abs(j3 - minPositionUs);
            if (jAbs <= maxPositionUs) {
                return j2;
            }
            return j3;
        }
        if (z2) {
            return j2;
        }
        if (z) {
            return j3;
        }
        return jA0V;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C23717u c23717u = (C23717u) obj;
        return this.A01 == c23717u.A01 && this.A00 == c23717u.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
