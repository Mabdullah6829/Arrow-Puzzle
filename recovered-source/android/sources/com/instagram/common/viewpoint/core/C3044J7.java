package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.DrmInitData;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.J7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3044J7 {
    public static String[] A0A = {"EJzHBf6C0sknf46Vq1Osr72lZWU", "EzVPMe4nRAbvxSng0PXVwtyqLeoR1KIv", "OkBxNGbCc3SGP6NNAhHfxcRtiUQBpmsu", "1fihPQnAv3tt3xF1xxV2XjfJNe5jiXUE", "EaQIZLU4UTAcxpaH6Zb3hTUPzu", "nXVDjS3P8WK4na35on8K5ox1mEuGJ9Tn", "34qesDVsFPLU35m5e8V9GlfuLx1oAXXP", "IwUkif7926Fg"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C3038J1 A04;
    public C3061JO A05;
    public final InterfaceC2953Hd A06;
    public final C3063JQ A07 = new C3063JQ();
    public final C21864v A09 = new C21864v(1);
    public final C21864v A08 = new C21864v();

    public C3044J7(InterfaceC2953Hd interfaceC2953Hd) {
        this.A06 = interfaceC2953Hd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C3062JP A00() {
        C3062JP encryptionBox;
        int i2 = this.A07.A06.A02;
        if (this.A07.A07 != null) {
            encryptionBox = this.A07.A07;
        } else {
            encryptionBox = this.A05.A00(i2);
        }
        if (encryptionBox == null || !encryptionBox.A03) {
            return null;
        }
        return encryptionBox;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C3062JP c3062jpA00 = A00();
        if (c3062jpA00 == null) {
            return;
        }
        C21864v c21864v = this.A07.A0H;
        if (c3062jpA00.A00 != 0) {
            c21864v.A0g(c3062jpA00.A00);
        }
        if (this.A07.A06(this.A01)) {
            c21864v.A0g(c21864v.A0M() * 6);
        }
    }

    public final int A04() {
        C21864v c21864v;
        int vectorSize;
        C3062JP c3062jpA00 = A00();
        if (c3062jpA00 == null) {
            return 0;
        }
        if (c3062jpA00.A00 != 0) {
            c21864v = this.A07.A0H;
            vectorSize = c3062jpA00.A00;
        } else {
            byte[] initVectorData = c3062jpA00.A04;
            this.A08.A0j(initVectorData, initVectorData.length);
            c21864v = this.A08;
            vectorSize = initVectorData.length;
        }
        boolean zA06 = this.A07.A06(this.A01);
        this.A09.A00[0] = (byte) ((zA06 ? 128 : 0) | vectorSize);
        this.A09.A0f(0);
        InterfaceC2953Hd interfaceC2953Hd = this.A06;
        C21864v initializationVectorData = this.A09;
        interfaceC2953Hd.AIr(initializationVectorData, 1);
        this.A06.AIr(c21864v, vectorSize);
        if (!zA06) {
            int vectorSize2 = vectorSize + 1;
            if (A0A[2].charAt(9) == '1') {
                throw new RuntimeException();
            }
            A0A[3] = "cKav7mEAu9tQ2Y9RA5SJHOCCBpQ48rqR";
            return vectorSize2;
        }
        C21864v c21864v2 = this.A07.A0H;
        int iA0M = c21864v2.A0M();
        c21864v2.A0g(-2);
        int i2 = (iA0M * 6) + 2;
        this.A06.AIr(c21864v2, i2);
        return vectorSize + 1 + i2;
    }

    public final void A05() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A06(long j2) {
        for (int i2 = this.A01; i2 < searchIndex && this.A07.A00(i2) < j2; i2++) {
            if (this.A07.A0G[i2]) {
                this.A03 = i2;
            }
        }
    }

    public final void A07(DrmInitData drmInitData) {
        C3062JP encryptionBox = this.A05.A00(this.A07.A06.A02);
        this.A06.A6e(this.A05.A07.A09(drmInitData.A01(encryptionBox != null ? encryptionBox.A02 : null)));
    }

    public final void A08(C3061JO c3061jo, C3038J1 c3038j1) {
        this.A05 = (C3061JO) AbstractC21273y.A01(c3061jo);
        this.A04 = (C3038J1) AbstractC21273y.A01(c3038j1);
        this.A06.A6e(c3061jo.A07);
        A05();
    }

    public final boolean A09() {
        this.A01++;
        this.A00++;
        if (this.A00 != this.A07.A0C[this.A02]) {
            return true;
        }
        this.A02++;
        this.A00 = 0;
        return false;
    }
}
