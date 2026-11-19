package com.instagram.common.viewpoint.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.MlltFrame;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8X */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C24108X implements InterfaceC4828mF {
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static Pair<Long, Long> A00(long j2, long[] jArr, long[] jArr2) {
        int iA0L = AbstractC22035C.A0L(jArr, j2, true, true);
        long j3 = jArr[iA0L];
        long j4 = jArr2[iA0L];
        int i2 = iA0L + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j3), Long.valueOf(j4));
        }
        long j5 = jArr[i2];
        return Pair.create(Long.valueOf(j2), Long.valueOf(((long) ((jArr2[i2] - j4) * (j5 == j3 ? 0.0d : (j2 - j3) / (j5 - j3)))) + j4));
    }

    public C24108X(long[] jArr, long[] jArr2, long j2) {
        this.A01 = jArr;
        this.A02 = jArr2;
        this.A00 = j2 == -9223372036854775807L ? AbstractC22035C.A0O(jArr2[jArr2.length - 1]) : j2;
    }

    public static C24108X A01(long j2, MlltFrame mlltFrame, long j3) {
        int length = mlltFrame.A03.length;
        int referenceCount = length + 1;
        long[] jArr = new long[referenceCount];
        int referenceCount2 = length + 1;
        long[] jArr2 = new long[referenceCount2];
        jArr[0] = j2;
        jArr2[0] = 0;
        long j4 = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int referenceCount3 = i2 - 1;
            j2 += (long) (mlltFrame.A00 + mlltFrame.A03[referenceCount3]);
            int referenceCount4 = i2 - 1;
            j4 += (long) (mlltFrame.A01 + mlltFrame.A04[referenceCount4]);
            jArr[i2] = j2;
            jArr2[i2] = j4;
        }
        return new C24108X(jArr, jArr2, j3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4828mF
    public final long A7j() {
        return -1L;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final long A7t() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final C2947HX A91(long j2) {
        Pair<Long, Long> pairA00 = A00(AbstractC22035C.A0P(AbstractC22035C.A0T(j2, 0L, this.A00)), this.A02, this.A01);
        return new C2947HX(new C2949HZ(AbstractC22035C.A0O(((Long) pairA00.first).longValue()), ((Long) pairA00.second).longValue()));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4828mF
    public final long A9H(long j2) {
        Pair<Long, Long> positionAndTimeMs = A00(j2, this.A01, this.A02);
        return AbstractC22035C.A0O(((Long) positionAndTimeMs.second).longValue());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final boolean AAj() {
        return true;
    }
}
