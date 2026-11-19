package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gn */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4499gn extends AbstractRunnableC3871Wc {
    public static String[] A05 = {"peP5GJDM9me8QDpiMTE0HYbhk5UQvsuj", "UmJsGkUZcFFvxG21gGzKuNxtLbnsNH0B", "InCZKAYVJ2xyVT3RLHGk", "cxu83bHx4KSubY78z6WW", "55WyHuuOCemh1dLUozRA9kNqY", "hUMsj3tCoCX6inz1bILbzXUTN", "Ib1pT8H4oQaxudtz", "STVRCs5pIYaR1pHj"};
    public final /* synthetic */ InterfaceC3640Sp A00;
    public final /* synthetic */ C3641Sq A01;
    public final /* synthetic */ C3648Sx A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C4499gn(C3648Sx c3648Sx, ArrayList arrayList, C3641Sq c3641Sq, InterfaceC3640Sp interfaceC3640Sp, ArrayList arrayList2) {
        this.A02 = c3648Sx;
        this.A03 = arrayList;
        this.A01 = c3641Sq;
        this.A00 = interfaceC3640Sp;
        this.A04 = arrayList2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        AtomicBoolean atomicBooleanA0D = C3648Sx.A0D(this.A03);
        if (this.A02.A04 instanceof C4494gi) {
            C4494gi c4494gi = (C4494gi) this.A02.A04;
            if (this.A01.A00 == -1) {
                boolean z = atomicBooleanA0D.get();
                String[] strArr = A05;
                if (strArr[6].length() == strArr[7].length()) {
                    String[] strArr2 = A05;
                    strArr2[3] = "VVOoEaVD2AhQqE2eihnl";
                    strArr2[2] = "7KTPepw5ZZxiUEMCto3C";
                    if (z) {
                        c4494gi.A0F().A4p(C3956Y1.A01(this.A02.A00));
                    } else {
                        c4494gi.A0F().A4n(C3956Y1.A01(this.A02.A00));
                    }
                }
                throw new RuntimeException();
            }
            if (atomicBooleanA0D.get()) {
                InterfaceC3216Lt interfaceC3216LtA0F = c4494gi.A0F();
                long jA01 = C3956Y1.A01(this.A02.A00);
                C3641Sq c3641Sq = this.A01;
                String[] strArr3 = A05;
                if (strArr3[4].length() == strArr3[5].length()) {
                    String[] strArr4 = A05;
                    strArr4[4] = "xsAs6ZK2AKeTr6tr707KlGvOM";
                    strArr4[5] = "GxI5mwrGpMJ9ldsuxbhmmAcT7";
                    interfaceC3216LtA0F.A4q(jA01, c3641Sq.A00);
                }
                throw new RuntimeException();
            }
            c4494gi.A0F().A4o(C3956Y1.A01(this.A02.A00), this.A01.A00);
        }
        this.A02.A02.post(new C4500go(this, atomicBooleanA0D));
        C3648Sx.A0D(this.A04);
    }
}
