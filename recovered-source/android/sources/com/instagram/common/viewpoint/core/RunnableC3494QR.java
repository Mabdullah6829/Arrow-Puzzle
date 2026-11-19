package com.instagram.common.viewpoint.core;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.QR */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC3494QR implements Runnable {
    public final /* synthetic */ C23407P A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC3494QR(C23407P c23407p, ArrayList arrayList) {
        this.A00 = c23407p;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (C3503Qa c3503Qa : this.A01) {
            this.A00.A0e(c3503Qa.A04, c3503Qa.A00, c3503Qa.A01, c3503Qa.A02, c3503Qa.A03);
        }
        this.A01.clear();
        this.A00.A05.remove(this.A01);
    }
}
