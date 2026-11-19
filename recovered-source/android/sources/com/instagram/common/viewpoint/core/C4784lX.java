package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4784lX implements InterfaceC2923H9 {
    public static String[] A03 = {"omX6mlrNbYq0LGa8KWDQoDOxuY4Jaqsm", "5vCbKZ7gcP1deFubK5J3aMrnVGjcBeMu", "ozZJ4UCdXiLAsxGuZMu8vrfsyQyOy2Qr", "457YRIf4cJgVa", "48ELt3GeP9QgscGCGAyy0GBjQnf8y1ot", "nP9Rki4V9hDzJun2MpMPW2v7tMuO22BO", "splStgYzXsMDywgFYcc1GmuRRae3j1Zq", "jQwA1XKYR4HrKvDtyQbVDHffCNmVjAZf"};
    public static final InterfaceC2927HD A04 = new InterfaceC2927HD() { // from class: com.facebook.ads.redexgen.X.lY
        @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
        public final InterfaceC2923H9[] A5N() {
            return C4784lX.A00();
        }

        @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
        public final /* synthetic */ InterfaceC2923H9[] A5O(Uri uri, Map map) {
            return AbstractC2926HC.A01(this, uri, map);
        }
    };
    public boolean A00;
    public final C4783lW A02 = new C4783lW();
    public final C21864v A01 = new C21864v(2786);

    public static /* synthetic */ InterfaceC2923H9[] A00() {
        return new InterfaceC2923H9[]{new C4784lX()};
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AAC(InterfaceC2924HA interfaceC2924HA) {
        this.A02.A5c(interfaceC2924HA, new C3177LG(0, 1));
        interfaceC2924HA.A6O();
        interfaceC2924HA.AJ7(new C4850mn(-9223372036854775807L));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final int AHL(InterfaceC4855ms interfaceC4855ms, C2945HV c2945hv) throws IOException {
        int i2 = interfaceC4855ms.read(this.A01.A0l(), 0, 2786);
        if (i2 == -1) {
            return -1;
        }
        this.A01.A0f(0);
        this.A01.A0e(i2);
        if (!this.A00) {
            this.A02.AGq(0L, 4);
            this.A00 = true;
        }
        this.A02.A5A(this.A01);
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AJ6(long j2, long j3) {
        this.A00 = false;
        this.A02.AJ5();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final boolean AK5(InterfaceC4855ms interfaceC4855ms) throws IOException {
        C21864v c21864v = new C21864v(10);
        int i2 = 0;
        while (true) {
            interfaceC4855ms.AGt(c21864v.A0l(), 0, 10);
            c21864v.A0f(0);
            if (c21864v.A0K() != 4801587) {
                interfaceC4855ms.AIl();
                interfaceC4855ms.A47(i2);
                int i3 = i2;
                int startPosition = 0;
                while (true) {
                    interfaceC4855ms.AGt(c21864v.A0l(), 0, 6);
                    c21864v.A0f(0);
                    int headerPosition = c21864v.A0M();
                    if (headerPosition != 2935) {
                        startPosition = 0;
                        interfaceC4855ms.AIl();
                        i3++;
                        int headerPosition2 = i3 - i2;
                        if (headerPosition2 >= 8192) {
                            return false;
                        }
                        interfaceC4855ms.A47(i3);
                    } else {
                        startPosition++;
                        if (startPosition >= 4) {
                            return true;
                        }
                        int headerPosition3 = AbstractC2905Gr.A05(c21864v.A0l());
                        if (headerPosition3 == -1) {
                            return false;
                        }
                        interfaceC4855ms.A47(headerPosition3 - 6);
                    }
                }
            } else {
                c21864v.A0g(3);
                int length = c21864v.A0H();
                i2 += length + 10;
                String[] strArr = A03;
                if (strArr[2].charAt(6) == strArr[0].charAt(6)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[2] = "eBRvK0YAHsHMNfInXbOwvDfd4dSG53RM";
                strArr2[0] = "womotRNroMOUij9xAXX8qTzQtzDZBBtc";
                interfaceC4855ms.A47(length);
            }
        }
    }
}
