package com.instagram.common.viewpoint.core;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.QT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC3496QT implements Runnable {
    public final /* synthetic */ C23407P A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC3496QT(C23407P c23407p, ArrayList arrayList) {
        this.A00 = c23407p;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (AbstractC3548RK holder : this.A01) {
            this.A00.A0d(holder);
        }
        this.A01.clear();
        this.A00.A01.remove(this.A01);
    }
}
