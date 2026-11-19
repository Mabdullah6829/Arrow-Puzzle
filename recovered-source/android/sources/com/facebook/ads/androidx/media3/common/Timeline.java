package com.facebook.ads.androidx.media3.common;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.instagram.common.viewpoint.core.AbstractBinderC201222;
import com.instagram.common.viewpoint.core.AbstractC21273y;
import com.instagram.common.viewpoint.core.AbstractC213243;
import com.instagram.common.viewpoint.core.AbstractC22035C;
import com.instagram.common.viewpoint.core.AbstractC2570BP;
import com.instagram.common.viewpoint.core.C20302K;
import com.instagram.common.viewpoint.core.C2510AR;
import com.instagram.common.viewpoint.core.C2511AS;
import com.instagram.common.viewpoint.core.C5029pj;
import com.instagram.common.viewpoint.core.C5031pl;
import com.instagram.common.viewpoint.core.InterfaceC201323;
import com.instagram.common.viewpoint.core.InterfaceC201424;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class Timeline implements InterfaceC201424 {
    public static String[] A00 = {"u1TV1j0aFj13GJQ9ixTagHG8KyMgbnog", "4GMeFBxldVuonExwkIPaDDi9I59L728Z", "hqD1wOYcZTmehOTQOtlNc0UQ2KV4ETaI", "yejsGunEYiKaKfUzobCfCtheJf3zEEcL", "wYd9LRHFlTpJXE3VqmNr3ySXFdmyeGzN", "VCegaKN739XbWKUaP5Uwy30Zmvr6QTeK", "Cr3igiuAIuu", "x89DN52UD2fFRZn9rQXfWzGYhaiJYHE1"};
    public static final Timeline A02 = new C2511AS();
    public static final String A05 = AbstractC22035C.A0h(0);
    public static final String A03 = AbstractC22035C.A0h(1);
    public static final String A04 = AbstractC22035C.A0h(2);
    public static final InterfaceC201323<Timeline> A01 = new InterfaceC201323() { // from class: com.facebook.ads.redexgen.X.pq
        @Override // com.instagram.common.viewpoint.core.InterfaceC201323
        public final InterfaceC201424 A6f(Bundle bundle) {
            return Timeline.A02(bundle);
        }
    };

    public abstract int A06();

    public abstract int A07();

    public abstract int A0A(Object obj);

    public abstract C5031pl A0I(int i2, C5031pl c5031pl, boolean z);

    public abstract C5029pj A0L(int i2, C5029pj c5029pj, long j2);

    public abstract Object A0M(int i2);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
    public static C2510AR A02(Bundle bundle) {
        AbstractC2570BP abstractC2570BPA04 = A04(C5029pj.A0J, AbstractC213243.A00(bundle, A05));
        AbstractC2570BP abstractC2570BPA05 = A04(C5031pl.A08, AbstractC213243.A00(bundle, A03));
        int[] intArray = bundle.getIntArray(A04);
        if (intArray == null) {
            intArray = A05(abstractC2570BPA04.size());
        }
        return new C2510AR(abstractC2570BPA04, abstractC2570BPA05, intArray);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.23 != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.24> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<T extends com.facebook.ads.redexgen.X.24> */
    public static <T extends InterfaceC201424> AbstractC2570BP<T> A04(InterfaceC201323<T> interfaceC201323, IBinder iBinder) {
        if (iBinder == null) {
            return AbstractC2570BP.A03();
        }
        C20302K c20302k = new C20302K();
        AbstractC2570BP<Bundle> abstractC2570BPA00 = AbstractBinderC201222.A00(iBinder);
        for (int i2 = 0; i2 < abstractC2570BPA00.size(); i2++) {
            c20302k.A04(interfaceC201323.A6f(abstractC2570BPA00.get(i2)));
        }
        return c20302k.A05();
    }

    public static int[] A05(int i2) {
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = i3;
            int i4 = A00[1].charAt(20);
            if (i4 == 50) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[2] = "bm1hpxiL8T70YPoy7qoC4X3DFFhRRvrI";
            strArr[4] = "ZU2doOYnXTdq2XyitRV5O0BVNSu1NLTL";
        }
        return iArr;
    }

    public int A08(int i2, int i3, boolean z) {
        switch (i3) {
            case 0:
                if (i2 == A0C(z)) {
                    return -1;
                }
                return i2 + 1;
            case 1:
                return i2;
            case 2:
                int iA0C = A0C(z);
                String[] strArr = A00;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    throw new RuntimeException();
                }
                A00[1] = "R0HEAX03GiDQUcMP0CiDD2yYG3qNGv8H";
                if (i2 == iA0C) {
                    return A0B(z);
                }
                return i2 + 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A09(int i2, C5031pl c5031pl, C5029pj c5029pj, int i3, boolean z) {
        int i4 = A0H(i2, c5031pl).A00;
        int windowIndex = A0K(i4, c5029pj).A01;
        if (windowIndex == i2) {
            int nextWindowIndex = A08(i4, i3, z);
            if (nextWindowIndex == -1) {
                return -1;
            }
            int windowIndex2 = A0K(nextWindowIndex, c5029pj).A00;
            return windowIndex2;
        }
        int windowIndex3 = i2 + 1;
        return windowIndex3;
    }

    public int A0B(boolean z) {
        return A0N() ? -1 : 0;
    }

    public int A0C(boolean z) {
        if (A0N()) {
            return -1;
        }
        return A07() - 1;
    }

    @Deprecated
    public final Pair<Object, Long> A0D(C5029pj c5029pj, C5031pl c5031pl, int i2, long j2) {
        return A0E(c5029pj, c5031pl, i2, j2);
    }

    public final Pair<Object, Long> A0E(C5029pj c5029pj, C5031pl c5031pl, int i2, long j2) {
        return (Pair) AbstractC21273y.A01(A0G(c5029pj, c5031pl, i2, j2, 0L));
    }

    @Deprecated
    public final Pair<Object, Long> A0F(C5029pj c5029pj, C5031pl c5031pl, int i2, long j2, long j3) {
        return A0G(c5029pj, c5031pl, i2, j2, j3);
    }

    public final Pair<Object, Long> A0G(C5029pj c5029pj, C5031pl c5031pl, int i2, long j2, long j3) {
        AbstractC21273y.A00(i2, 0, A07());
        A0L(i2, c5029pj, j3);
        if (j2 == -9223372036854775807L) {
            j2 = c5029pj.A05();
            if (j2 == -9223372036854775807L) {
                return null;
            }
        }
        int i3 = c5029pj.A00;
        A0H(i3, c5031pl);
        while (i3 < c5029pj.A01 && c5031pl.A02 != j2 && A0H(i3 + 1, c5031pl).A02 <= j2) {
            i3++;
        }
        A0I(i3, c5031pl, true);
        long jMin = j2 - c5031pl.A02;
        if (c5031pl.A01 != -9223372036854775807L) {
            long j4 = c5031pl.A01;
            if (A00[1].charAt(20) == '2') {
                throw new RuntimeException();
            }
            A00[1] = "slEcDLMOMSnRw8lzrIQwxe9jf9tcgTic";
            jMin = Math.min(jMin, j4 - 1);
        }
        return Pair.create(AbstractC21273y.A01(c5031pl.A04), Long.valueOf(Math.max(0L, jMin)));
    }

    public final C5031pl A0H(int i2, C5031pl c5031pl) {
        return A0I(i2, c5031pl, false);
    }

    public C5031pl A0J(Object obj, C5031pl c5031pl) {
        return A0I(A0A(obj), c5031pl, true);
    }

    public final C5029pj A0K(int i2, C5029pj c5029pj) {
        return A0L(i2, c5029pj, 0L);
    }

    public final boolean A0N() {
        return A07() == 0;
    }

    public final boolean A0O(int i2, C5031pl c5031pl, C5029pj c5029pj, int i3, boolean z) {
        return A09(i2, c5031pl, c5029pj, i3, z) == -1;
    }

    public final boolean equals(Object obj) {
        int iA0C;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        if (timeline.A07() != A07() || timeline.A06() != A06()) {
            return false;
        }
        C5029pj c5029pj = new C5029pj();
        C5031pl c5031pl = new C5031pl();
        C5029pj window = new C5029pj();
        C5031pl otherPeriod = new C5031pl();
        for (int i2 = 0; i2 < A07(); i2++) {
            if (!A0K(i2, c5029pj).equals(timeline.A0K(i2, window))) {
                return false;
            }
        }
        for (int i3 = 0; i3 < A06(); i3++) {
            boolean zEquals = A0I(i3, c5031pl, true).equals(timeline.A0I(i3, otherPeriod, true));
            if (A00[6].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[7] = "LCXdoHEXleHtD1UyLVprjOGqC7qnADXU";
            strArr[0] = "np8LEsRhRemsbbWWIjAQc1GjKbBRdfRS";
            if (!zEquals) {
                return false;
            }
        }
        int iA0B = A0B(true);
        if (iA0B != timeline.A0B(true) || (iA0C = A0C(true)) != timeline.A0C(true)) {
            return false;
        }
        while (iA0B != iA0C) {
            int iA08 = A08(iA0B, 0, true);
            if (iA08 != timeline.A08(iA0B, 0, true)) {
                return false;
            }
            iA0B = iA08;
        }
        return true;
    }

    public final int hashCode() {
        C5029pj c5029pj = new C5029pj();
        C5031pl c5031pl = new C5031pl();
        int result = 7 * 31;
        int i2 = result + A07();
        for (int i3 = 0; i3 < A07(); i3++) {
            C5029pj window = A0K(i3, c5029pj);
            i2 = (i2 * 31) + window.hashCode();
        }
        int result2 = i2 * 31;
        int i4 = result2 + A06();
        for (int i5 = 0; i5 < A06(); i5++) {
            i4 = (i4 * 31) + A0I(i5, c5031pl, true).hashCode();
        }
        int iA0B = A0B(true);
        while (iA0B != -1) {
            int windowIndex = i4 * 31;
            i4 = windowIndex + iA0B;
            iA0B = A08(iA0B, 0, true);
        }
        return i4;
    }
}
