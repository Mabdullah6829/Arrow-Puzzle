package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4L */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C21504L extends C2744EF {
    public static String[] A0F = {"r3hDWnB1R9y4pEiKAURNp99h2b", "kj3t6dP2tWSOfb61zMSBvgjhGLqlygll", "", "sX8uIgx32JWe8q5WuLHBMtkPG7d", "ZlH8xHdCAMZsgB23qoj", "6lejLSjHGD", "XsRzuVWfX96s5Dei3zwO9zjz9s6FXTfu", "pCK0u"};
    public int A00;
    public C4368eg A01;
    public boolean A02;
    public final AbstractC3735UN<C21494K> A03;
    public final AbstractC3735UN<C21404B> A04;
    public final AbstractC3735UN<C2732E3> A05;
    public final AbstractC3735UN<C21394A> A06;
    public final AbstractC3735UN<C2727Dy> A07;
    public final AbstractC3735UN<C2725Dw> A08;
    public final AbstractC3735UN<C2724Dv> A09;
    public final AbstractC3735UN<C2719Dq> A0A;
    public final AbstractC3735UN<C2718Dp> A0B;
    public final C2775Ek A0C;
    public final AbstractC2729E0 A0D;
    public final AbstractC2720Dr A0E;

    public C21504L(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, C2775Ek c2775Ek, String str) {
        this(c4494gi, interfaceC3784VA, c2775Ek, str, 0, 0, false, null, null);
    }

    public C21504L(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, C2775Ek c2775Ek, String str, int i2, int i3, boolean z, Bundle bundle, Map<String, String> map) {
        super(c4494gi, interfaceC3784VA, c2775Ek, str, !c2775Ek.A0m(), i2, i3, z, bundle, map, new C2743EE(c4494gi, c2775Ek));
        this.A0E = new AbstractC2720Dr() { // from class: com.facebook.ads.redexgen.X.4M
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C2721Ds c2721Ds) {
                this.A00.A0f();
            }
        };
        this.A08 = new C2755EQ(this);
        this.A04 = new C2753EO(this);
        this.A05 = new C2752EN(this);
        this.A06 = new C2751EM(this);
        this.A03 = new C2750EL(this);
        this.A07 = new C2749EK(this);
        this.A0A = new C2748EJ(this);
        this.A0B = new C2747EI(this);
        this.A09 = new C2768Ed(this);
        this.A0D = new AbstractC2729E0() { // from class: com.facebook.ads.redexgen.X.4N
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C2730E1 c2730e1) {
                this.A00.A00 = this.A00.A0C.getDuration();
            }
        };
        this.A02 = false;
        this.A0C = c2775Ek;
        this.A0C.getEventBus().A03(this.A0E, this.A06, this.A08, this.A05, this.A04, this.A03, this.A07, this.A0A, this.A0B, this.A0D, this.A09);
        if (C3763Up.A2u(c4494gi)) {
            this.A01 = new C4368eg(c2775Ek, str, z, null);
        }
    }

    public C21504L(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, C2775Ek c2775Ek, String str, Bundle bundle, Map<String, String> extraParams) {
        this(c4494gi, interfaceC3784VA, c2775Ek, str, 0, 0, false, bundle, extraParams);
    }

    @Override // com.instagram.common.viewpoint.core.C2744EF
    public final void A0n(EnumC4372ek enumC4372ek, Map<String, String> map) {
        super.A0n(enumC4372ek, map);
        if (this.A01 != null && enumC4372ek == EnumC4372ek.A09) {
            Map<String, String> params = this.A01.A06();
            String[] strArr = A0F;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0F[2] = "tc9";
            map.putAll(params);
        }
    }

    public final void A0p() {
        C2758ET c2758et = new C2758ET(this);
        if (this.A0C.A0q()) {
            ExecutorC3959Y4.A00(c2758et);
            return;
        }
        C2775Ek c2775Ek = this.A0C;
        String[] strArr = A0F;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A0F[1] = "nFCp2DExxe9bklz52WjNRol8ULAuMoj6";
        c2775Ek.getStateHandler().post(c2758et);
    }
}
