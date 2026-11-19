package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8T */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC24068T extends AbstractC4983oy<C24058S, AbstractC24028P, C4796lj> implements InterfaceC4803lq {
    public static byte[] A01;
    public static String[] A02 = {"gN8", "v0q6HziqC5r28rLi1ZsQmD2OK0fgspik", "XftI4eRfVNg33Op0jQPz8O6PbCkMHbWE", "SdzNGuU6dc81VqISrLBD", "AmzsDcSyCxTNGO", "BjhKb3Az99p878kvj1gxEmyEzdFIjRD", "VkdZ1nUYKY17rCLbk1Npuh3A0WHSXOLE", "WDjquUi0atGhsKhHWhKEDeyGOzHRt12i"};
    public final String A00;

    public static String A0L(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b = (byte) ((bArrCopyOfRange[i5] - i4) - 100);
            if (A02[0].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "7OO3CpMfw2stGNBOXFHDwltwdlKTQaUN";
            strArr[7] = "XdJDd6VP529P2X7c3MAKusUlyNrjc2WF";
            bArrCopyOfRange[i5] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0M() {
        if (A02[0].length() != 3) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[5] = "V56IsTeJwH5mFHCmn3IS5snx7jCRlGG";
        strArr[4] = "owU73l6HwKvTqc";
        A01 = new byte[]{28, 53, 44, 63, 55, 44, 42, 59, 44, 43, -25, 43, 44, 42, 54, 43, 44, -25, 44, 57, 57, 54, 57};
    }

    public abstract InterfaceC3082Jj A0g(byte[] bArr, int i2, boolean z) throws C4796lj;

    static {
        A0M();
    }

    public AbstractC24068T(String str) {
        super(new C24058S[2], new AbstractC24028P[2]);
        this.A00 = str;
        A0d(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.1Y] */
    @Override // com.instagram.common.viewpoint.core.AbstractC4983oy
    /* JADX INFO: renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final C19821Y A0c() {
        return new AbstractC24028P(this) { // from class: com.facebook.ads.redexgen.X.1Y
            public final AbstractC24068T A00;

            {
                this.A00 = this;
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC24028P, com.instagram.common.viewpoint.core.AbstractC4984oz
            public final void A0B() {
                this.A00.A0h(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC4983oy
    /* JADX INFO: renamed from: A0I, reason: merged with bridge method [inline-methods] */
    public final C4796lj A0Y(C24058S c24058s, AbstractC24028P abstractC24028P, boolean z) {
        try {
            ByteBuffer inputData = (ByteBuffer) AbstractC21273y.A01(c24058s.A02);
            abstractC24028P.A0C(c24058s.A01, A0g(inputData.array(), inputData.limit(), z), c24058s.A00);
            abstractC24028P.A01(Integer.MIN_VALUE);
            return null;
        } catch (C4796lj e) {
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC4983oy
    /* JADX INFO: renamed from: A0J, reason: merged with bridge method [inline-methods] */
    public final C4796lj A0Z(Throwable th) {
        return new C4796lj(A0L(0, 23, 99), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC4983oy
    /* JADX INFO: renamed from: A0K, reason: merged with bridge method [inline-methods] */
    public final C24058S A0a() {
        return new C24058S();
    }

    public final void A0h(AbstractC24028P abstractC24028P) {
        super.A0f(abstractC24028P);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4803lq
    public final void AJh(long j2) {
    }
}
