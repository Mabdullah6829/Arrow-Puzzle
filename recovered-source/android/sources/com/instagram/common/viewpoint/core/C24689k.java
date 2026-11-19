package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9k */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C24689k implements InterfaceC4803lq {
    public static String[] A05 = {"09FvAMDbH0ybjBvy7etGUlmvLnEax64M", "9UhXzLA65KAjnLS2nIkoWygikqgIUMi6", "7x5jjcV5dGluzAi4xLXm7mPjpISGuC5w", "OMb242EU3cjCZF5lkBhqnraDuTpVEe8I", "YkwDHYmprJhwUHAQbO7ClYxi5co4mZVB", "F0wri1MO2ggHk2Yd2fKtZmsEqFQ1SY6P", "VahsyjeijnOod8dsGLMZVGg77qfAqG3R", "hv5jyUmHRXfPhpozztfXRSgwdurH1xzL"};
    public int A00;
    public boolean A01;
    public final C3080Jh A02 = new C3080Jh();
    public final C24058S A03 = new C24058S();
    public final Deque<AbstractC24028P> A04 = new ArrayDeque();

    public C24689k() {
        for (int i2 = 0; i2 < 2; i2++) {
            this.A04.addFirst(new AbstractC24028P() { // from class: com.facebook.ads.redexgen.X.1c
                @Override // com.instagram.common.viewpoint.core.AbstractC24028P, com.instagram.common.viewpoint.core.AbstractC4984oz
                public final void A0B() {
                    this.A00.A04(this);
                }
            });
        }
        this.A00 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC225360
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C24058S A5r() throws C4796lj {
        AbstractC21273y.A08(!this.A01);
        if (this.A00 != 0) {
            return null;
        }
        this.A00 = 1;
        return this.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC225360
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final AbstractC24028P A5t() throws C4796lj {
        AbstractC21273y.A08(!this.A01);
        if (this.A00 != 2 || this.A04.isEmpty()) {
            return null;
        }
        AbstractC24028P abstractC24028PRemoveFirst = this.A04.removeFirst();
        if (this.A03.A05()) {
            String[] strArr = A05;
            if (strArr[5].charAt(13) == strArr[0].charAt(13)) {
                throw new RuntimeException();
            }
            A05[4] = "JYyYZLdoMjCFjS6FBvPaG66m4kKjUjXi";
            abstractC24028PRemoveFirst.A00(4);
        } else {
            abstractC24028PRemoveFirst.A0C(this.A03.A01, new C4891nT(this.A03.A01, this.A02.A02(((ByteBuffer) AbstractC21273y.A01(this.A03.A02)).array())), 0L);
        }
        this.A03.A0A();
        this.A00 = 0;
        return abstractC24028PRemoveFirst;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC225360
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void AHJ(C24058S c24058s) throws C4796lj {
        AbstractC21273y.A08(!this.A01);
        AbstractC21273y.A08(this.A00 == 1);
        AbstractC21273y.A07(this.A03 == c24058s);
        this.A00 = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(AbstractC24028P abstractC24028P) {
        AbstractC21273y.A08(this.A04.size() < 2);
        AbstractC21273y.A07(!this.A04.contains(abstractC24028P));
        abstractC24028P.A0A();
        this.A04.addFirst(abstractC24028P);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC225360
    public final void AHb() {
        this.A01 = true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4803lq
    public final void AJh(long j2) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC225360
    public final void flush() {
        AbstractC21273y.A08(!this.A01);
        this.A03.A0A();
        this.A00 = 0;
    }
}
