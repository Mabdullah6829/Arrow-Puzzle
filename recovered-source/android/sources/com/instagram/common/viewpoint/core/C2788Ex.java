package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ex */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2788Ex {
    public static String[] A05 = {"LpJTwMN2G", "VgMO4aUKUhad1vQS8qeWccWG6TZwybQB", "ACcLkDhyx", "Vz4L8Yk2qa8xi00BpA99exXw347yn2OW", "M93qmyVYUpuFuHp", "Ixo", "WCFkueysi57ip8GEP7BFiSRGMX4T5ofH", "LFY6A3GYQmBEHARGrOHSwwc2jPi1aXj0"};
    public final int A00;
    public final C5019pY A01;
    public final Object A02;
    public final C23697s[] A03;
    public final InterfaceC4876nE[] A04;

    public C2788Ex(C23697s[] c23697sArr, InterfaceC4876nE[] interfaceC4876nEArr, C5019pY c5019pY, Object obj) {
        this.A03 = c23697sArr;
        this.A04 = (InterfaceC4876nE[]) interfaceC4876nEArr.clone();
        this.A01 = c5019pY;
        this.A02 = obj;
        this.A00 = c23697sArr.length;
    }

    public final boolean A00(int i2) {
        return this.A03[i2] != null;
    }

    public final boolean A01(C2788Ex c2788Ex, int i2) {
        if (c2788Ex == null) {
            return false;
        }
        C23697s[] c23697sArr = this.A03;
        if (A05[5].length() == 3) {
            A05[1] = "2a41zxf8OUQisEdMYeAN8aC4JNcLEgEy";
            if (!AbstractC22035C.A1E(c23697sArr[i2], c2788Ex.A03[i2])) {
                return false;
            }
            InterfaceC4876nE interfaceC4876nE = this.A04[i2];
            InterfaceC4876nE interfaceC4876nE2 = c2788Ex.A04[i2];
            String[] strArr = A05;
            if (strArr[2].length() == strArr[0].length()) {
                A05[4] = "ShAZgc6gkhlm9OR";
                return AbstractC22035C.A1E(interfaceC4876nE, interfaceC4876nE2);
            }
        }
        throw new RuntimeException();
    }
}
