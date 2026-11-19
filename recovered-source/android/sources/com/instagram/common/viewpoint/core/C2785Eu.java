package com.instagram.common.viewpoint.core;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eu */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2785Eu implements InterfaceC4371ej {
    public final C4494gi A01;
    public final InterfaceC3784VA A02;
    public final C4368eg A03;
    public final C2775Ek A04;
    public final String A07;
    public final AbstractC2733E4 A06 = new AbstractC2733E4() { // from class: com.facebook.ads.redexgen.X.4P
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C21404B c21404b) {
            if (this.A00.A00.booleanValue()) {
                return;
            }
            this.A00.A01.A0F().AJ2();
            this.A00.A08();
        }
    };
    public final AbstractC2739EA A05 = new AbstractC2739EA() { // from class: com.facebook.ads.redexgen.X.4O
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C21494K c21494k) {
            if (!this.A00.A00.booleanValue()) {
                this.A00.A01.A0F().AJ0();
                this.A00.A08();
            }
            this.A00.A00 = true;
        }
    };
    public Boolean A00 = false;

    public C2785Eu(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, C2775Ek c2775Ek, String str, boolean z, C2744EF c2744ef, Map<String, String> extraParams) {
        this.A01 = c4494gi;
        this.A02 = interfaceC3784VA;
        this.A07 = str;
        this.A04 = c2775Ek;
        this.A03 = new C4368eg(c2775Ek, str, z, extraParams);
        if (C3763Up.A2B(this.A01)) {
            this.A01.A0F().AIx();
            c2744ef.A0m(this);
        } else {
            this.A01.A0F().AIy();
            this.A04.getEventBus().A03(this.A06, this.A05);
        }
    }

    public final void A07() {
        C2792F1 c2792f1 = new C2792F1(this);
        if (this.A04.A0q()) {
            ExecutorC3959Y4.A00(c2792f1);
        } else {
            this.A04.getStateHandler().post(c2792f1);
        }
    }

    public final synchronized void A08() {
        if (!this.A00.booleanValue()) {
            this.A02.ABy(this.A07, this.A03.A06());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4371ej
    public final void AEk() {
        this.A01.A0F().AJ1();
        A08();
    }
}
