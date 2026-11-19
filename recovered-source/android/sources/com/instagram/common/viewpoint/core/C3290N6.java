package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.N6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3290N6 {
    public static InterfaceC3285N1 A00;

    public final InterfaceC3285N1 A00(final C4494gi c4494gi, AdPlacementType adPlacementType) {
        if (A00 != null) {
            return A00;
        }
        switch (C3289N5.A00[adPlacementType.ordinal()]) {
            case 1:
                return new C237881();
            case 2:
                if (C3763Up.A1O(c4494gi)) {
                    return new C237780();
                }
                return new C237881();
            case 3:
                return new C4691jz();
            case 4:
                return new C4686ju(c4494gi);
            case 5:
                return new C4686ju(c4494gi) { // from class: com.facebook.ads.redexgen.X.7z
                    @Override // com.instagram.common.viewpoint.core.C4686ju, com.instagram.common.viewpoint.core.InterfaceC3285N1
                    public final AdPlacementType A8k() {
                        return AdPlacementType.NATIVE_BANNER;
                    }
                };
            case 6:
                return new C23737w();
            default:
                return null;
        }
    }
}
