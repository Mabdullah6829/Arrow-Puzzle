package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.C3 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2610C3 implements InterfaceC4740ko {
    public final /* synthetic */ AbstractC2618CC A00;

    public C2610C3(final AbstractC2618CC val$separatorMatcher) {
        this.A00 = val$separatorMatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.2R] */
    @Override // com.instagram.common.viewpoint.core.InterfaceC4740ko
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C20372R AAl(final C4741kp splitter, final CharSequence toSplit) {
        return new AbstractC2603Bw(splitter, toSplit) { // from class: com.facebook.ads.redexgen.X.2R
            @Override // com.instagram.common.viewpoint.core.AbstractC2603Bw
            public final int A04(int separatorPosition) {
                return separatorPosition + 1;
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC2603Bw
            public final int A05(int start) {
                return this.A00.A00.A08(this.A03, start);
            }
        };
    }
}
