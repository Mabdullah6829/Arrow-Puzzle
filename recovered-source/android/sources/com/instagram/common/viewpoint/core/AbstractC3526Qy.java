package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qy */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3526Qy {
    public static byte[] A06;
    public static String[] A07 = {"7", "BOchn05cOqPQPKgaZhD7MWqYHqoCKx7o", "EPTevQXo6AzOyuxFlfcAvx5eJdnVP8", "v", "6fNY9lNhy7nUhuOGP7YDUX6WqdzgNzMN", "SLjIMlZrt8LApw5SyAUFDc4ipDag7tTu", "zXvx6U5xIRhnU3fWG5rnYTWUnq20aSrc", "c4GOdlXhzm3270NA43EFNLoVECdVoF38"};
    public InterfaceC3524Qw A04 = null;
    public ArrayList<RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> A05 = new ArrayList<>();
    public long A00 = 120;
    public long A03 = 120;
    public long A02 = 250;
    public long A01 = 250;

    public static String A08(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b = (byte) ((bArrCopyOfRange[i5] - i4) - 109);
            String[] strArr = A07;
            if (strArr[6].charAt(25) == strArr[5].charAt(25)) {
                throw new RuntimeException();
            }
            A07[2] = "awpTB9u15TkHVvPjjOCd09Fy8dol99E";
            bArrCopyOfRange[i5] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A06 = new byte[]{76, 75, 30, 75, 70, 74, 62, 81, 70, 76, 75, 80, 35, 70, 75, 70, 80, 69, 66, 65};
    }

    public abstract void A0H();

    public abstract void A0I();

    public abstract void A0L(AbstractC3548RK abstractC3548RK);

    public abstract boolean A0M();

    public abstract boolean A0N(AbstractC3548RK abstractC3548RK);

    public abstract boolean A0O(AbstractC3548RK abstractC3548RK, C3525Qx c3525Qx, C3525Qx c3525Qx2);

    public abstract boolean A0P(AbstractC3548RK abstractC3548RK, C3525Qx c3525Qx, C3525Qx c3525Qx2);

    public abstract boolean A0Q(AbstractC3548RK abstractC3548RK, C3525Qx c3525Qx, C3525Qx c3525Qx2);

    public abstract boolean A0R(AbstractC3548RK abstractC3548RK, AbstractC3548RK abstractC3548RK2, C3525Qx c3525Qx, C3525Qx c3525Qx2);

    static {
        A09();
    }

    public static int A06(AbstractC3548RK abstractC3548RK) {
        int i2 = abstractC3548RK.A0C & 14;
        if (abstractC3548RK.A0f()) {
            return 4;
        }
        int flags = i2 & 4;
        if (flags == 0) {
            int pos = abstractC3548RK.A0P();
            int oldPos = abstractC3548RK.A0M();
            if (pos != -1 && oldPos != -1 && pos != oldPos) {
                return i2 | 2048;
            }
            return i2;
        }
        return i2;
    }

    private final C3525Qx A07() {
        return new C3525Qx();
    }

    public final long A0A() {
        return this.A00;
    }

    public final long A0B() {
        return this.A01;
    }

    public final long A0C() {
        return this.A02;
    }

    public final long A0D() {
        return this.A03;
    }

    public final C3525Qx A0E(C3545RH c3545rh, AbstractC3548RK abstractC3548RK) {
        return A07().A01(abstractC3548RK);
    }

    public final C3525Qx A0F(C3545RH c3545rh, AbstractC3548RK abstractC3548RK, int i2, List<Object> payloads) {
        return A07().A01(abstractC3548RK);
    }

    public final void A0G() {
        int count = this.A05.size();
        if (0 < count) {
            this.A05.get(0);
            throw new NullPointerException(A08(0, 20, 112));
        }
        this.A05.clear();
    }

    public final void A0J(InterfaceC3524Qw interfaceC3524Qw) {
        this.A04 = interfaceC3524Qw;
    }

    public final void A0K(AbstractC3548RK abstractC3548RK) {
        if (this.A04 != null) {
            this.A04.ACv(abstractC3548RK);
        }
    }

    public boolean A0S(AbstractC3548RK abstractC3548RK, List<Object> payloads) {
        return A0N(abstractC3548RK);
    }
}
