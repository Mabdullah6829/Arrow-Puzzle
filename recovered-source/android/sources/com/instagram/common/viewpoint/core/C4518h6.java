package com.instagram.common.viewpoint.core;

import com.facebook.ads.NativeAd;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.h6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4518h6 implements InterfaceC3640Sp {
    public static String[] A02 = {"XqTxzibSN1zAjaiM9LtVSqsxSG", "xqN5bEwB0Nihon7KSuA", "FVkOY26I4teb9ftOLmk9A45ZS3TS2DIY", "wzTDEcMKt7VvW9W8eKeIWksTnJ0tE", "iGRCr9OHUARnshCNCmKS3XNzEIA09VDm", "MJLgHxMJm3Fw", "S", "m77T1m6dtAhGTcgbhkAg"};
    public final List<C4686ju> A00;
    public final /* synthetic */ C4517h5 A01;

    public C4518h6(C4517h5 c4517h5, List<C4686ju> list) {
        this.A01 = c4517h5;
        this.A00 = list;
    }

    private void A00() {
        this.A01.A01.A05(true);
        this.A01.A01.A02();
        this.A01.A01.A03(0);
        Iterator<C4686ju> it = this.A00.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A02[4].charAt(3) == 'E') {
                throw new RuntimeException();
            }
            A02[0] = "GKxyFdZ7ADxfGJ";
            if (zHasNext) {
                C3732UK c3732uk = new C3732UK(this.A01.A02, it.next(), null, C3732UK.A0K(), this.A01.A01.A01());
                if (c3732uk.A12() != null && c3732uk.A12().A0F() != null) {
                    ((AbstractC4627iv) c3732uk.A12().A0F()).A00(c3732uk);
                }
                this.A01.A01.A04(new NativeAd(this.A01.A02, c3732uk, this.A01.A00));
            } else {
                AbstractC3862WT.A00(new C4519h7(this));
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3640Sp
    public final void ADL() {
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3640Sp
    public final void ADT() {
        A00();
    }
}
