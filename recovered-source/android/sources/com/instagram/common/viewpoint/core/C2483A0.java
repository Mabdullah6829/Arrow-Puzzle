package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.A0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2483A0 extends AbstractC4949oQ {
    public static final int A00 = Float.floatToIntBits(Float.NaN);

    public static void A00(int i2, ByteBuffer byteBuffer) {
        float pcm32BitFloat = (float) (((double) i2) * 4.656612875245797E-10d);
        int floatBits = Float.floatToIntBits(pcm32BitFloat);
        if (floatBits == A00) {
            floatBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatBits);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4949oQ
    public final C21113i A09(C21113i c21113i) throws C21123j {
        int i2 = c21113i.A02;
        if (AbstractC22035C.A14(i2)) {
            if (i2 != 4) {
                return new C21113i(c21113i.A03, c21113i.A01, 4);
            }
            return C21113i.A05;
        }
        throw new C21123j(c21113i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21133k
    public final void AHH(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferA00;
        int i2 = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int limit = iLimit - i2;
        int position = this.A05.A02;
        switch (position) {
            case 536870912:
                int position2 = limit / 3;
                byteBufferA00 = A00(position2 * 4);
                while (i2 < iLimit) {
                    int position3 = byteBuffer.get(i2);
                    int limit2 = (position3 & 255) << 8;
                    int position4 = i2 + 1;
                    int limit3 = limit2 | ((byteBuffer.get(position4) & 255) << 16);
                    int position5 = i2 + 2;
                    A00(limit3 | ((byteBuffer.get(position5) & 255) << 24), byteBufferA00);
                    i2 += 3;
                }
                break;
            case 805306368:
                byteBufferA00 = A00(limit);
                while (i2 < iLimit) {
                    int position6 = byteBuffer.get(i2);
                    int limit4 = position6 & 255;
                    int position7 = i2 + 1;
                    int limit5 = limit4 | ((byteBuffer.get(position7) & 255) << 8);
                    int position8 = i2 + 2;
                    int limit6 = limit5 | ((byteBuffer.get(position8) & 255) << 16);
                    int position9 = i2 + 3;
                    A00(limit6 | ((byteBuffer.get(position9) & 255) << 24), byteBufferA00);
                    i2 += 4;
                }
                break;
            default:
                throw new IllegalStateException();
        }
        int position10 = byteBuffer.limit();
        byteBuffer.position(position10);
        byteBufferA00.flip();
    }
}
