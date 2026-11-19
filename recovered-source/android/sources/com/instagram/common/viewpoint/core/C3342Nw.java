package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nw */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3342Nw implements InterfaceC3991Ya {
    public static String[] A01 = {"dAENZa04S5kpLZ1505OVGzU", "BCWAX", "x4EBtM5L1", "d5mzvX7vdf5oGTbdkf23a85QS6J33UuP", "T3xMk8xyeuXfnP2cHDF22zgmf4sSWk7a", "D6RnJQb1nSkQk7teZoJG77p", "lMrZ8D5HcAsH09zpnUIM78ubrFXrhoz6", "r7D6OIPJDO7XxyVdFUwVLtQI1zZlrgYr"};
    public final /* synthetic */ C3308NO A00;

    public C3342Nw(C3308NO c3308no) {
        this.A00 = c3308no;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3991Ya
    public final void ACl(AbstractC3992Yb abstractC3992Yb) {
        if (this.A00.A0Y() && !this.A00.A0b.get()) {
            this.A00.A0Z.A07(this.A00);
            return;
        }
        C3308NO c3308no = this.A00;
        if (A01[4].charAt(5) == '8') {
            A01[1] = "011C";
            if (!c3308no.A0d || this.A00.A0b.get() || !this.A00.A0X()) {
                this.A00.A0T.A04(EnumC3791VH.A07, null);
                if (this.A00.A0P.A0c()) {
                    this.A00.A0R.A0F().AEO();
                }
                this.A00.A0R.A0F().AB0();
                InterfaceC3998Yh interfaceC3998Yh = this.A00.A0W;
                String strA7w = this.A00.A0X.A7w();
                if (A01[6].charAt(7) != 'V') {
                    String[] strArr = A01;
                    strArr[3] = "iNY9OvP3hEWy4eydF9NsffnrPtCfLtIx";
                    strArr[7] = "zl19Behk0RYI4HrdG27XeFY6Dxp3Bz2i";
                    interfaceC3998Yh.A4j(strA7w);
                    return;
                }
            } else {
                this.A00.A0g.setToolbarActionMode(0);
                this.A00.A0N();
                return;
            }
        }
        throw new RuntimeException();
    }
}
