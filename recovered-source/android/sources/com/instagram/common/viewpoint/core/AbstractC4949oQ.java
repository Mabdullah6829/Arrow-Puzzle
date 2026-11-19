package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oQ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4949oQ implements InterfaceC21133k {
    public boolean A04;
    public ByteBuffer A02 = InterfaceC21133k.A00;
    public ByteBuffer A03 = InterfaceC21133k.A00;
    public C21113i A00 = C21113i.A05;
    public C21113i A01 = C21113i.A05;
    public C21113i A05 = C21113i.A05;
    public C21113i A06 = C21113i.A05;

    public abstract C21113i A09(C21113i c21113i) throws C21123j;

    public final ByteBuffer A00(int i2) {
        if (this.A02.capacity() < i2) {
            this.A02 = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.A02.clear();
        }
        this.A03 = this.A02;
        return this.A02;
    }

    public final boolean A01() {
        return this.A03.hasRemaining();
    }

    public void A0A() {
    }

    public void A0B() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21133k
    public final C21113i A57(C21113i c21113i) throws C21123j {
        this.A00 = c21113i;
        this.A01 = A09(c21113i);
        return AAL() ? this.A01 : C21113i.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21133k
    public ByteBuffer A8d() {
        ByteBuffer byteBuffer = this.A03;
        ByteBuffer outputBuffer = InterfaceC21133k.A00;
        this.A03 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21133k
    public boolean AAL() {
        return this.A01 != C21113i.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21133k
    public boolean AAP() {
        return this.A04 && this.A03 == InterfaceC21133k.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21133k
    public final void AHG() {
        this.A04 = true;
        A0B();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21133k
    public final void flush() {
        this.A03 = InterfaceC21133k.A00;
        this.A04 = false;
        this.A05 = this.A00;
        this.A06 = this.A01;
        A0A();
    }
}
