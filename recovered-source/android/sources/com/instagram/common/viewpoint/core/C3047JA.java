package com.instagram.common.viewpoint.core;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.facebook.ads.androidx.media3.common.DrmInitData;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.JA */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3047JA {
    public static String[] A0C = {"uuzqWXLhVU5h", "MCiAyNDofRMgV8twnC7AiCrYM6kNh0jg", "HJXujHHcElJRTDtcfeo3Sy7Hv18RGZgy", "Amjr7hMXQx0e32VF8yWASHBDx37PervK", "NgKcffCH0RNam7yPBBIvJezNpINfNkiL", "oMs9elp", "apSAFH841DSL3paVepKSIoWcAWyBkdVZ", "h51QMR"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C3038J1 A04;
    public C3064JR A05;
    public boolean A06;
    public final InterfaceC2953Hd A08;
    public final C3063JQ A09 = new C3063JQ();
    public final C21864v A07 = new C21864v();
    public final C21864v A0B = new C21864v(1);
    public final C21864v A0A = new C21864v();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final int A04(int i2, int i3) {
        C21864v c21864v;
        int length;
        C3062JP c3062jpA07 = A07();
        if (c3062jpA07 == null) {
            return 0;
        }
        if (c3062jpA07.A00 != 0) {
            c21864v = this.A09.A0H;
            length = c3062jpA07.A00;
        } else {
            byte[] bArr = (byte[]) AbstractC22035C.A0f(c3062jpA07.A04);
            this.A0A.A0j(bArr, bArr.length);
            c21864v = this.A0A;
            length = bArr.length;
        }
        boolean zA06 = this.A09.A06(this.A01);
        boolean z = zA06 || i3 != 0;
        this.A0B.A0l()[0] = (byte) ((z ? 128 : 0) | length);
        this.A0B.A0f(0);
        this.A08.AIs(this.A0B, 1, 1);
        this.A08.AIs(c21864v, length, 1);
        if (!z) {
            return length + 1;
        }
        if (!zA06) {
            this.A07.A0d(8);
            byte[] bArrA0l = this.A07.A0l();
            bArrA0l[0] = 0;
            bArrA0l[1] = 1;
            bArrA0l[2] = (byte) ((i3 >> 8) & 255);
            bArrA0l[3] = (byte) (i3 & 255);
            bArrA0l[4] = (byte) ((i2 >> 24) & 255);
            bArrA0l[5] = (byte) ((i2 >> 16) & 255);
            bArrA0l[6] = (byte) ((i2 >> 8) & 255);
            bArrA0l[7] = (byte) (i2 & 255);
            this.A08.AIs(this.A07, 8, 1);
            return length + 1 + 8;
        }
        C21864v c21864v2 = this.A09.A0H;
        int iA0M = c21864v2.A0M();
        c21864v2.A0g(-2);
        int i4 = (iA0M * 6) + 2;
        if (i3 != 0) {
            this.A07.A0d(i4);
            byte[] bArrA0l2 = this.A07.A0l();
            c21864v2.A0k(bArrA0l2, 0, i4);
            int i5 = (((bArrA0l2[2] & 255) << 8) | (bArrA0l2[3] & 255)) + i3;
            bArrA0l2[2] = (byte) ((i5 >> 8) & 255);
            bArrA0l2[3] = (byte) (i5 & 255);
            c21864v2 = this.A07;
        }
        this.A08.AIs(c21864v2, i4, 1);
        return length + 1 + i4;
    }

    public C3047JA(InterfaceC2953Hd interfaceC2953Hd, C3064JR c3064jr, C3038J1 c3038j1) {
        this.A08 = interfaceC2953Hd;
        this.A05 = c3064jr;
        this.A04 = c3038j1;
        A0C(c3064jr, c3038j1);
    }

    public final int A02() {
        int i2;
        if (!this.A06) {
            i2 = this.A05.A04[this.A01];
        } else {
            boolean[] zArr = this.A09.A0G;
            int flags = this.A01;
            i2 = zArr[flags] ? 1 : 0;
        }
        if (A07() == null) {
            return i2;
        }
        String[] strArr = A0C;
        String str = strArr[3];
        String str2 = strArr[2];
        int iCharAt = str.charAt(20);
        int flags2 = str2.charAt(20);
        if (iCharAt != flags2) {
            throw new RuntimeException();
        }
        A0C[4] = "Hkeae3ogmEOju43arfP4ZrrsYFDfrpvf";
        return i2 | BasicMeasure.EXACTLY;
    }

    public final int A03() {
        if (!this.A06) {
            return this.A05.A05[this.A01];
        }
        return this.A09.A0B[this.A01];
    }

    public final long A05() {
        if (!this.A06) {
            return this.A05.A06[this.A01];
        }
        return this.A09.A0E[this.A02];
    }

    public final long A06() {
        if (!this.A06) {
            return this.A05.A07[this.A01];
        }
        return this.A09.A00(this.A01);
    }

    public final C3062JP A07() {
        C3062JP c3062jpA00;
        if (!this.A06) {
            return null;
        }
        int i2 = ((C3038J1) AbstractC22035C.A0f(this.A09.A06)).A02;
        if (this.A09.A07 != null) {
            c3062jpA00 = this.A09.A07;
        } else {
            c3062jpA00 = this.A05.A03.A00(i2);
        }
        if (c3062jpA00 == null || !c3062jpA00.A03) {
            return null;
        }
        C3062JP encryptionBox = c3062jpA00;
        return encryptionBox;
    }

    public final void A08() {
        this.A09.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
        this.A06 = false;
    }

    public final void A09() {
        C3062JP c3062jpA07 = A07();
        if (c3062jpA07 == null) {
            return;
        }
        C21864v c21864v = this.A09.A0H;
        if (c3062jpA07.A00 != 0) {
            c21864v.A0g(c3062jpA07.A00);
        }
        if (this.A09.A06(this.A01)) {
            c21864v.A0g(c21864v.A0M() * 6);
        }
    }

    public final void A0A(long j2) {
        for (int i2 = this.A01; i2 < searchIndex && this.A09.A00(i2) <= j2; i2++) {
            if (this.A09.A0G[i2]) {
                this.A03 = i2;
            }
        }
    }

    public final void A0B(DrmInitData drmInitData) {
        C3062JP encryptionBox = this.A05.A03.A00(((C3038J1) AbstractC22035C.A0f(this.A09.A06)).A02);
        this.A08.A6e(this.A05.A03.A07.A07().A0u(drmInitData.A01(encryptionBox != null ? encryptionBox.A02 : null)).A14());
    }

    public final void A0C(C3064JR c3064jr, C3038J1 c3038j1) {
        this.A05 = c3064jr;
        this.A04 = c3038j1;
        this.A08.A6e(c3064jr.A03.A07);
        A08();
    }

    public final boolean A0D() {
        this.A01++;
        if (!this.A06) {
            return false;
        }
        this.A00++;
        if (this.A00 != this.A09.A0C[this.A02]) {
            return true;
        }
        this.A02++;
        this.A00 = 0;
        return false;
    }
}
