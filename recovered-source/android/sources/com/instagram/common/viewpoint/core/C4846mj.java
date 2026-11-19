package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mj */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4846mj implements InterfaceC2915H1 {
    public static String[] A03 = {"Qzrb2NyX11iip4M0Dun9HjrVhDBjGiaF", "S4lxERGEQHczdoRlIRLlXReEKfWFWSGc", "txU8e6wljbe290bqTydjfEMDFUDvEmx5", "ZB68ibpDVF3DEFIIdRwQIG37zRUG2jhG", "NKfzuQ6LKFKezVni40AKhLW9Qs", "gUOm4cnsv29C5J2bDVOWEpGrIAhYUn7e", "xRx4EoAOCCZ90h8tA3pJ1YmFxzetviZR", "6LlO7okteSZZNTbDPWq3J1SHLhykMwkf"};
    public final int A00;
    public final C2928HE A01;
    public final C2933HJ A02;

    @Override // com.instagram.common.viewpoint.core.InterfaceC2915H1
    public final /* synthetic */ void AFs() {
    }

    public C4846mj(C2933HJ c2933hj, int i2) {
        this.A02 = c2933hj;
        this.A00 = i2;
        this.A01 = new C2928HE();
    }

    private long A00(InterfaceC4855ms interfaceC4855ms) throws IOException {
        while (interfaceC4855ms.A8i() < interfaceC4855ms.A8O() - 6 && !AbstractC2929HF.A09(interfaceC4855ms, this.A02, this.A00, this.A01)) {
            String[] strArr = A03;
            if (strArr[1].charAt(7) == strArr[7].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[6] = "MdA2mB0qiCN7NKRKcBY3aVGEnEzRIKP4";
            strArr2[3] = "Kp5wPJFyOGMB7tBJUi3Fl7WX9iQtExSk";
            interfaceC4855ms.A47(1);
        }
        if (interfaceC4855ms.A8i() >= interfaceC4855ms.A8O() - 6) {
            interfaceC4855ms.A47((int) (interfaceC4855ms.A8O() - interfaceC4855ms.A8i()));
            return this.A02.A09;
        }
        return this.A01.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2915H1
    public final C2913Gz AIw(InterfaceC4855ms interfaceC4855ms, long j2) throws IOException {
        long rightFrameFirstSampleNumber = interfaceC4855ms.A8n();
        long leftFrameFirstSampleNumber = A00(interfaceC4855ms);
        long jA8i = interfaceC4855ms.A8i();
        interfaceC4855ms.A47(Math.max(6, this.A02.A06));
        long searchPosition = A00(interfaceC4855ms);
        long leftFramePosition = interfaceC4855ms.A8i();
        if (leftFrameFirstSampleNumber <= j2 && searchPosition > j2) {
            return C2913Gz.A03(jA8i);
        }
        if (searchPosition <= j2) {
            return C2913Gz.A05(searchPosition, leftFramePosition);
        }
        return C2913Gz.A04(leftFrameFirstSampleNumber, rightFrameFirstSampleNumber);
    }
}
