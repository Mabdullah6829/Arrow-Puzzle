package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4874nC implements InterfaceC2791F0 {
    public int A00;
    public int A01;
    public int A02;
    public C2789Ey[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;

    public C4874nC(boolean z, int i2) {
        this(z, i2, 0);
    }

    public C4874nC(boolean z, int i2, int i3) {
        AbstractC21273y.A07(i2 > 0);
        AbstractC21273y.A07(i3 >= 0);
        this.A05 = z;
        this.A04 = i2;
        this.A01 = i3;
        this.A03 = new C2789Ey[i3 + 100];
        if (i3 > 0) {
            this.A06 = new byte[i3 * i2];
            for (int i4 = 0; i4 < i3; i4++) {
                this.A03[i4] = new C2789Ey(this.A06, i4 * i2);
            }
            return;
        }
        this.A06 = null;
    }

    public final synchronized int A00() {
        return this.A00 * this.A04;
    }

    public final synchronized void A01() {
        if (this.A05) {
            A02(0);
        }
    }

    public final synchronized void A02(int i2) {
        boolean targetBufferSizeReduced = i2 < this.A02;
        this.A02 = i2;
        if (targetBufferSizeReduced) {
            AKT();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2791F0
    public final synchronized C2789Ey A49() {
        C2789Ey c2789Ey;
        this.A00++;
        if (this.A01 > 0) {
            C2789Ey[] c2789EyArr = this.A03;
            int i2 = this.A01 - 1;
            this.A01 = i2;
            c2789Ey = (C2789Ey) AbstractC21273y.A01(c2789EyArr[i2]);
            this.A03[this.A01] = null;
        } else {
            c2789Ey = new C2789Ey(new byte[this.A04], 0);
            if (this.A00 > this.A03.length) {
                this.A03 = (C2789Ey[]) Arrays.copyOf(this.A03, this.A03.length * 2);
            }
        }
        return c2789Ey;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2791F0
    public final int A8I() {
        return this.A04;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2791F0
    public final synchronized void AHd(C2789Ey c2789Ey) {
        C2789Ey[] c2789EyArr = this.A03;
        int i2 = this.A01;
        this.A01 = i2 + 1;
        c2789EyArr[i2] = c2789Ey;
        this.A00--;
        notifyAll();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2791F0
    public final synchronized void AHe(InterfaceC2790Ez interfaceC2790Ez) {
        while (interfaceC2790Ez != null) {
            C2789Ey[] c2789EyArr = this.A03;
            int i2 = this.A01;
            this.A01 = i2 + 1;
            c2789EyArr[i2] = interfaceC2790Ez.A6u();
            this.A00--;
            interfaceC2790Ez = interfaceC2790Ez.ACc();
        }
        notifyAll();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2791F0
    public final synchronized void AKT() {
        int iA05 = AbstractC22035C.A05(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int iMax = Math.max(0, iA05 - targetAllocationCount);
        int targetAllocationCount2 = this.A01;
        if (iMax >= targetAllocationCount2) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int targetAllocationCount3 = this.A01;
            int highIndex = targetAllocationCount3 - 1;
            while (lowIndex <= highIndex) {
                C2789Ey highAllocation = (C2789Ey) AbstractC21273y.A01(this.A03[lowIndex]);
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    C2789Ey lowAllocation = (C2789Ey) AbstractC21273y.A01(this.A03[highIndex]);
                    if (lowAllocation.A01 != this.A06) {
                        highIndex--;
                    } else {
                        this.A03[lowIndex] = lowAllocation;
                        int targetAllocationCount4 = highIndex - 1;
                        this.A03[highIndex] = highAllocation;
                        highIndex = targetAllocationCount4;
                        lowIndex++;
                    }
                }
            }
            iMax = Math.max(iMax, lowIndex);
            int targetAllocationCount5 = this.A01;
            if (iMax >= targetAllocationCount5) {
                return;
            }
        }
        C2789Ey[] c2789EyArr = this.A03;
        int targetAvailableCount = this.A01;
        Arrays.fill(c2789EyArr, iMax, targetAvailableCount, (Object) null);
        this.A01 = iMax;
    }
}
