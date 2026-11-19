package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4942oJ implements InterfaceC21133k {
    public long A03;
    public long A04;
    public C24599Y A09;
    public boolean A0D;
    public boolean A0E;
    public float A01 = 1.0f;
    public float A00 = 1.0f;
    public C21113i A07 = C21113i.A05;
    public C21113i A08 = C21113i.A05;
    public C21113i A05 = C21113i.A05;
    public C21113i A06 = C21113i.A05;
    public ByteBuffer A0A = InterfaceC21133k.A00;
    public ShortBuffer A0C = this.A0A.asShortBuffer();
    public ByteBuffer A0B = InterfaceC21133k.A00;
    public int A02 = -1;

    public final long A00(long j2) {
        if (this.A04 >= 1024) {
            long jA0I = this.A03 - ((long) ((C24599Y) AbstractC21273y.A01(this.A09)).A0I());
            if (this.A06.A03 == this.A05.A03) {
                long processedInputBytes = AbstractC22035C.A0U(j2, jA0I, this.A04);
                return processedInputBytes;
            }
            long processedInputBytes2 = this.A06.A03;
            long j3 = jA0I * processedInputBytes2;
            long j4 = this.A04;
            long processedInputBytes3 = this.A05.A03;
            return AbstractC22035C.A0U(j2, j3, j4 * processedInputBytes3);
        }
        return (long) (((double) this.A01) * j2);
    }

    public final void A01(float f2) {
        if (this.A00 != f2) {
            this.A00 = f2;
            this.A0E = true;
        }
    }

    public final void A02(float f2) {
        if (this.A01 != f2) {
            this.A01 = f2;
            this.A0E = true;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21133k
    public final C21113i A57(C21113i c21113i) throws C21123j {
        int i2;
        if (c21113i.A02 == 2) {
            if (this.A02 == -1) {
                i2 = c21113i.A03;
            } else {
                i2 = this.A02;
            }
            this.A07 = c21113i;
            this.A08 = new C21113i(i2, c21113i.A01, 2);
            this.A0E = true;
            return this.A08;
        }
        throw new C21123j(c21113i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21133k
    public final ByteBuffer A8d() {
        int iA0H;
        C24599Y c24599y = this.A09;
        if (c24599y != null && (iA0H = c24599y.A0H()) > 0) {
            if (this.A0A.capacity() < iA0H) {
                this.A0A = ByteBuffer.allocateDirect(iA0H).order(ByteOrder.nativeOrder());
                this.A0C = this.A0A.asShortBuffer();
            } else {
                this.A0A.clear();
                this.A0C.clear();
            }
            c24599y.A0L(this.A0C);
            this.A04 += (long) iA0H;
            this.A0A.limit(iA0H);
            this.A0B = this.A0A;
        }
        ByteBuffer outputBuffer = this.A0B;
        this.A0B = InterfaceC21133k.A00;
        return outputBuffer;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21133k
    public final boolean AAL() {
        return this.A08.A03 != -1 && (Math.abs(this.A01 - 1.0f) >= 1.0E-4f || Math.abs(this.A00 - 1.0f) >= 1.0E-4f || this.A08.A03 != this.A07.A03);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21133k
    public final boolean AAP() {
        return this.A0D && (this.A09 == null || this.A09.A0H() == 0);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21133k
    public final void AHG() {
        if (this.A09 != null) {
            this.A09.A0K();
        }
        this.A0D = true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21133k
    public final void AHH(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        C24599Y c24599y = (C24599Y) AbstractC21273y.A01(this.A09);
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        int iRemaining = byteBuffer.remaining();
        this.A03 += (long) iRemaining;
        c24599y.A0M(shortBufferAsShortBuffer);
        byteBuffer.position(byteBuffer.position() + iRemaining);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21133k
    public final void flush() {
        if (AAL()) {
            this.A05 = this.A07;
            this.A06 = this.A08;
            if (this.A0E) {
                this.A09 = new C24599Y(this.A05.A03, this.A05.A01, this.A01, this.A00, this.A06.A03);
            } else if (this.A09 != null) {
                this.A09.A0J();
            }
        }
        this.A0B = InterfaceC21133k.A00;
        this.A03 = 0L;
        this.A04 = 0L;
        this.A0D = false;
    }
}
