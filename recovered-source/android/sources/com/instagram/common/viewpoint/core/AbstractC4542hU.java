package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hU */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4542hU extends AbstractC3533R5 {
    public static byte[] A03;
    public static String[] A04 = {"VI3k6vbyE", "wbKxmRtdnLanYPPQlq0AQ7UHjncjxjam", "7rHsxeXjhwTRluKKUSI3i7DNAgzyS", "RLsJgHk6VqLvU3GrilIJimxIkswsMvKT", "sHDfA32w1RYOD3HMFDMkWGxW2yjuY1ZH", "JEcuqbBofZsfD30FS8fTTaggCipMDK", "8NUawD4TiWbh8YzDjR1LHPIBKq0RidcG", "8EIjrQLLrDPWSel1MFlzfXR6TVhPBcGW"};
    public C23377M A00;
    public Scroller A01;
    public final AbstractC3535R7 A02 = new C4547hZ(this);

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A03 = new byte[]{-120, -75, 103, -80, -75, -70, -69, -88, -75, -86, -84, 103, -74, -83, 103, -106, -75, -115, -77, -80, -75, -82, -109, -80, -70, -69, -84, -75, -84, -71, 103, -88, -77, -71, -84, -88, -85, -64, 103, -70, -84, -69, 117};
    }

    public abstract int A0C(AbstractC3530R2 abstractC3530R2, int i2, int i3);

    public abstract View A0D(AbstractC3530R2 abstractC3530R2);

    @Deprecated
    public abstract C4563hq A0E(AbstractC3530R2 abstractC3530R2);

    public abstract int[] A0H(AbstractC3530R2 abstractC3530R2, View view);

    static {
        A09();
    }

    private final C4563hq A05(AbstractC3530R2 abstractC3530R2) {
        return A0E(abstractC3530R2);
    }

    private void A07() {
        this.A00.A1i(this.A02);
        this.A00.setOnFlingListener(null);
    }

    private void A08() throws IllegalStateException {
        if (this.A00.getOnFlingListener() == null) {
            this.A00.A1h(this.A02);
            this.A00.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException(A06(0, 43, 56));
    }

    private boolean A0A(AbstractC3530R2 abstractC3530R2, int i2, int i3) {
        C4563hq c4563hqA05;
        int iA0C;
        if (!(abstractC3530R2 instanceof InterfaceC3542RE) || (c4563hqA05 = A05(abstractC3530R2)) == null || (iA0C = A0C(abstractC3530R2, i2, i3)) == -1) {
            return false;
        }
        c4563hqA05.A0A(iA0C);
        abstractC3530R2.A1N(c4563hqA05);
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3533R5
    public final boolean A0B(int i2, int i3) {
        AbstractC3530R2 layoutManager = this.A00.getLayoutManager();
        if (layoutManager == null || this.A00.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.A00.getMinFlingVelocity();
        return (Math.abs(i3) > minFlingVelocity || Math.abs(i2) > minFlingVelocity) && A0A(layoutManager, i2, i3);
    }

    public final void A0F() {
        AbstractC3530R2 layoutManager;
        View viewA0D;
        if (this.A00 == null || (layoutManager = this.A00.getLayoutManager()) == null || (viewA0D = A0D(layoutManager)) == null) {
            return;
        }
        int[] iArrA0H = A0H(layoutManager, viewA0D);
        if (iArrA0H[0] != 0 || iArrA0H[1] != 0) {
            this.A00.A1e(iArrA0H[0], iArrA0H[1]);
        }
    }

    public final void A0G(C23377M c23377m) throws IllegalStateException {
        if (this.A00 == c23377m) {
            return;
        }
        C23377M c23377m2 = this.A00;
        if (A04[3].charAt(14) == 'w') {
            throw new RuntimeException();
        }
        A04[4] = "xzKGxret4GzWIxaR6oK37PWpSNYAUaFQ";
        if (c23377m2 != null) {
            A07();
        }
        this.A00 = c23377m;
        if (this.A00 != null) {
            A08();
            this.A01 = new Scroller(this.A00.getContext(), new DecelerateInterpolator());
            A0F();
        }
    }
}
