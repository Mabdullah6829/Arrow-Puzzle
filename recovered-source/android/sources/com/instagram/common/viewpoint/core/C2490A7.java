package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.A7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2490A7 extends AbstractC4949oQ {
    public int[] A00;
    public int[] A01;

    @Override // com.instagram.common.viewpoint.core.AbstractC4949oQ
    public final C21113i A09(C21113i c21113i) throws C21123j {
        int[] iArr = this.A01;
        if (iArr == null) {
            return C21113i.A05;
        }
        if (c21113i.A02 == 2) {
            int i2 = c21113i.A01 != iArr.length ? 1 : 0;
            int i3 = 0;
            while (i3 < iArr.length) {
                int i4 = iArr[i3];
                if (i4 < c21113i.A01) {
                    i2 |= i4 != i3 ? 1 : 0;
                    i3++;
                } else {
                    throw new C21123j(c21113i);
                }
            }
            if (i2 != 0) {
                return new C21113i(c21113i.A03, iArr.length, 2);
            }
            return C21113i.A05;
        }
        throw new C21123j(c21113i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4949oQ
    public final void A0A() {
        this.A00 = this.A01;
    }

    public final void A0C(int[] iArr) {
        this.A01 = iArr;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21133k
    public final void AHH(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) AbstractC21273y.A01(this.A00);
        int iPosition = byteBuffer.position();
        int outputSize = byteBuffer.limit();
        int position = outputSize - iPosition;
        ByteBuffer byteBufferA00 = A00(this.A06.A00 * (position / this.A05.A00));
        while (iPosition < outputSize) {
            for (int i2 : iArr) {
                byteBufferA00.putShort(byteBuffer.getShort((i2 * 2) + iPosition));
            }
            iPosition += this.A05.A00;
        }
        byteBuffer.position(outputSize);
        byteBufferA00.flip();
    }
}
