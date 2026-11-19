package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0w */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C19440w extends C19671J {
    public C22866X A00;
    public List<C4332e5> A01;

    public C19440w(C4494gi c4494gi) {
        super(c4494gi);
        this.A00 = new C22866X(this, 1, null, null, null);
    }

    public final void A20(C4439fp c4439fp) {
        if (this.A00 != null) {
            this.A00.A0c(c4439fp);
        }
    }

    public C22866X getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0d(this.A01);
    }
}
