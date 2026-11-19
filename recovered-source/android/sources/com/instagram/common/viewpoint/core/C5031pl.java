package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pl */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5031pl implements InterfaceC201424 {
    public int A00;
    public long A01;
    public long A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public C5072qS A06 = C5072qS.A08;
    public static String[] A07 = {"4zGdQbqEEbqON0fsiZAaEQkKoAoKYmna", "yJpzHCnd9V3wUr5Wrx8duzmTaMKaViaS", "6le5bHbrSJ1W0fbLNXPlurR", "jvR1cNhZ0960aRA7pVRRRMqTg6KbIJja", "KqjZe5mn0dP", "Q", "Z7fKuPhHzVcFnrI", "fPry0FIfciS3iZV36uBdTRShtkwqjgIo"};
    public static final String A0D = AbstractC22035C.A0h(0);
    public static final String A0A = AbstractC22035C.A0h(1);
    public static final String A0C = AbstractC22035C.A0h(2);
    public static final String A0B = AbstractC22035C.A0h(3);
    public static final String A09 = AbstractC22035C.A0h(4);
    public static final InterfaceC201323<C5031pl> A08 = new InterfaceC201323() { // from class: com.facebook.ads.redexgen.X.pp
        @Override // com.instagram.common.viewpoint.core.InterfaceC201323
        public final InterfaceC201424 A6f(Bundle bundle) {
            return C5031pl.A01(bundle);
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C5031pl A01(Bundle bundle) {
        int i2 = bundle.getInt(A0D, 0);
        long j2 = bundle.getLong(A0A, -9223372036854775807L);
        long j3 = bundle.getLong(A0C, 0L);
        boolean z = bundle.getBoolean(A0B, false);
        Bundle bundle2 = bundle.getBundle(A09);
        C5072qS c5072qS = bundle2 != null ? (C5072qS) C5072qS.A09.A6f(bundle2) : C5072qS.A08;
        C5031pl c5031pl = new C5031pl();
        c5031pl.A0G(null, null, i2, j2, j3, c5072qS, z);
        return c5031pl;
    }

    public final int A03() {
        return this.A06.A00;
    }

    public final int A04(int i2) {
        return this.A06.A07(i2).A00;
    }

    public final int A05(int i2) {
        return this.A06.A07(i2).A04();
    }

    public final int A06(int i2, int i3) {
        return this.A06.A07(i2).A05(i3);
    }

    public final int A07(long j2) {
        return this.A06.A05(j2, this.A01);
    }

    public final int A08(long j2) {
        return this.A06.A06(j2, this.A01);
    }

    public final long A09() {
        return this.A06.A02;
    }

    public final long A0A() {
        return this.A01;
    }

    public final long A0B() {
        return AbstractC22035C.A0P(this.A02);
    }

    public final long A0C() {
        return this.A02;
    }

    public final long A0D(int i2) {
        return this.A06.A07(i2).A03;
    }

    public final long A0E(int i2, int i3) {
        C5073qT c5073qTA07 = this.A06.A07(i2);
        if (c5073qTA07.A00 != -1) {
            return c5073qTA07.A06[i3];
        }
        return -9223372036854775807L;
    }

    public final C5031pl A0F(Object obj, Object obj2, int i2, long j2, long j3) {
        return A0G(obj, obj2, i2, j2, j3, C5072qS.A08, false);
    }

    public final C5031pl A0G(Object obj, Object obj2, int i2, long j2, long j3, C5072qS c5072qS, boolean z) {
        this.A03 = obj;
        this.A04 = obj2;
        this.A00 = i2;
        this.A01 = j2;
        this.A02 = j3;
        this.A06 = c5072qS;
        this.A05 = z;
        return this;
    }

    public final boolean A0H(int i2) {
        return !this.A06.A07(i2).A07();
    }

    @MetaExoPlayerCustomization("Can be removed once MediaPeriodQueue is updated.")
    public final boolean A0I(int i2, int i3) {
        C5073qT c5073qT = this.A06.A05[i2];
        return (c5073qT.A00 == -1 || c5073qT.A05[i3] == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        C5031pl c5031pl = (C5031pl) obj;
        if (AbstractC22035C.A1E(this.A03, c5031pl.A03) && AbstractC22035C.A1E(this.A04, c5031pl.A04) && this.A00 == c5031pl.A00 && this.A01 == c5031pl.A01 && this.A02 == c5031pl.A02 && this.A05 == c5031pl.A05 && AbstractC22035C.A1E(this.A06, c5031pl.A06)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        int iHashCode2 = ((7 * 31) + (this.A03 == null ? 0 : this.A03.hashCode())) * 31;
        if (this.A04 != null) {
            Object obj = this.A04;
            String[] strArr = A07;
            if (strArr[3].charAt(31) != strArr[0].charAt(31)) {
                throw new RuntimeException();
            }
            A07[6] = "a7xjZFv85Fgc1YV";
            iHashCode = obj.hashCode();
        }
        return ((((((((((iHashCode2 + iHashCode) * 31) + this.A00) * 31) + ((int) (this.A01 ^ (this.A01 >>> 32)))) * 31) + ((int) (this.A02 ^ (this.A02 >>> 32)))) * 31) + (this.A05 ? 1 : 0)) * 31) + this.A06.hashCode();
    }
}
