package com.instagram.common.viewpoint.core;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.QS */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC3495QS implements Runnable {
    public final /* synthetic */ C23407P A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC3495QS(C23407P c23407p, ArrayList arrayList) {
        this.A00 = c23407p;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (C3502QZ change : this.A01) {
            this.A00.A0c(change);
        }
        this.A01.clear();
        this.A00.A03.remove(this.A01);
    }
}
