package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fy */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2850Fy extends AbstractC3535R7 {
    public static byte[] A0H;
    public static String[] A0I = {"oHxG", "", "w7XeyG7wcXlBDThCLG4YobF5JePdGcu8", "IQ8LgqWvoXOpUTXgnww89j6rU6uuZ1nj", "", "WKMwHhIum9", "0nm7H4VWCUBWNiJwCQAonSVvBZFyt", "hLsDwSpuFLAE"};
    public InterfaceC4254cp A02;
    public C4439fp A04;
    public List<C4332e5> A05;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final C4564hr A0C;
    public final AbstractC3543RF A0D;
    public final Set<Integer> A0G = new HashSet();
    public boolean A08 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public int A01 = -1;
    public float A00 = 0.0f;
    public final InterfaceC4258ct A0F = new C2853G1(this);
    public InterfaceC4256cr A03 = new C2852G0(this);
    public final InterfaceC4257cs A0E = new C2851Fz(this);

    public static String A05(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        String[] strArr = A0I;
        if (strArr[0].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[7] = "Cbp585p0FHy9";
        strArr2[6] = "QC7w158vCCR5KGktiGCBodiqPhNZq";
        A0H = new byte[]{-122, -102, -103, -108, -92, -107, -111, -122, -98, -92, -118, -109, -122, -121, -111, -118, -119, -92, -107, -122, -105, -122, -110, 81, 91, 103, 78, 81, 90, 91, 92, 103, 94, 81, 76, 77, 87, 103, 88, 73, 90, 73, 85, -51, -58, -61, -52, -60, -68, -42, -61, -68, -51, -68, -61, -42, -57, -72, -55, -72, -60};
    }

    static {
        A08();
    }

    public C2850Fy(C19671J c19671j, int i2, List<C4332e5> list, C4439fp c4439fp, Bundle bundle) {
        this.A0C = c19671j.getLayoutManager();
        this.A0A = i2;
        this.A05 = list;
        this.A04 = c4439fp;
        this.A0D = new C4563hq(c19671j.getContext());
        this.A0B = c19671j.getContext();
        c19671j.A1h(this);
        A0D(bundle);
    }

    private AbstractC3079Jg A03(int i2, int i3) {
        return A04(i2, i3, true);
    }

    private AbstractC3079Jg A04(int i2, int i3, boolean z) {
        AbstractC3079Jg abstractC3079Jg = null;
        while (i2 <= i3) {
            AbstractC3079Jg abstractC3079Jg2 = (AbstractC3079Jg) this.A0C.A1o(i2);
            if (abstractC3079Jg2 == null || abstractC3079Jg2.A1U()) {
                return null;
            }
            boolean zA0a = A0a(abstractC3079Jg2);
            if (abstractC3079Jg == null && abstractC3079Jg2.A1V() && zA0a && !this.A0G.contains(Integer.valueOf(i2)) && (!z || A0I(abstractC3079Jg2, this.A0A))) {
                abstractC3079Jg = abstractC3079Jg2;
            }
            if (abstractC3079Jg2.A1V() && !zA0a) {
                A0C(i2, false);
            }
            i2++;
        }
        return abstractC3079Jg;
    }

    private void A06() {
        if (!this.A07) {
            return;
        }
        int lastVisibleItem = this.A0C.A26();
        int firstVisibleItem = this.A0C.A27();
        AbstractC3079Jg abstractC3079JgA03 = A03(lastVisibleItem, firstVisibleItem);
        if (abstractC3079JgA03 != null) {
            abstractC3079JgA03.A1S();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        int iA25 = this.A0C.A25();
        if (iA25 != -1) {
            int curPos = this.A05.size();
            if (iA25 < curPos - 1) {
                int curPos2 = iA25 + 1;
                A0U(curPos2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(int i2) {
        AbstractC3079Jg abstractC3079JgA04 = A04(i2 + 1, this.A0C.A27(), false);
        if (abstractC3079JgA04 != null) {
            abstractC3079JgA04.A1S();
            A0U(((Integer) abstractC3079JgA04.getTag(-1593835536)).intValue());
        }
    }

    private void A0A(int i2, int i3) {
        while (i2 <= i3) {
            A0T(i2);
            i2++;
        }
    }

    private final void A0B(int i2, int i3) {
        A0S(i2);
        A0S(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(int i2, boolean z) {
        if (z) {
            this.A0G.add(Integer.valueOf(i2));
        } else {
            this.A0G.remove(Integer.valueOf(i2));
        }
    }

    private void A0D(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(43, 18, 112), 0.0f);
        this.A07 = bundle.getBoolean(A05(0, 23, 62), true);
        this.A08 = bundle.getBoolean(A05(23, 20, 1), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0H() {
        return this.A0A == 1;
    }

    public static boolean A0I(AbstractC4206c3 abstractC4206c3, int i2) {
        int allowedAreaMaxX;
        int furthestX;
        if (i2 == 2) {
            allowedAreaMaxX = AbstractC3926XX.A04.widthPixels - 1;
        } else {
            int width = abstractC4206c3.getWidth();
            int allowedAreaMinX = AbstractC3926XX.A04.widthPixels;
            allowedAreaMaxX = (int) (((width + allowedAreaMinX) * 1.3f) / 2.0f);
        }
        if (i2 == 2) {
            furthestX = 1;
        } else {
            int i3 = AbstractC3926XX.A04.widthPixels;
            int allowedAreaMinX2 = abstractC4206c3.getWidth();
            furthestX = (int) (((i3 - allowedAreaMinX2) * 0.7f) / 2.0f);
        }
        float x = abstractC4206c3.getX();
        int allowedAreaMinX3 = abstractC4206c3.getWidth();
        return ((int) (x + ((float) allowedAreaMinX3))) <= allowedAreaMaxX && abstractC4206c3.getX() >= ((float) furthestX);
    }

    private boolean A0J(AbstractC3079Jg abstractC3079Jg) {
        if (!this.A08 || !abstractC3079Jg.A1V()) {
            return false;
        }
        this.A08 = false;
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3535R7
    public void A0L(C23377M c23377m, int i2) {
        super.A0L(c23377m, i2);
        if (i2 == 0) {
            this.A09 = true;
            A06();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3535R7
    public void A0M(C23377M c23377m, int i2, int i3) {
        super.A0M(c23377m, i2, i3);
        this.A09 = false;
        if (this.A06) {
            this.A09 = true;
            A06();
            this.A06 = false;
        }
        int lastVisibleItem = this.A0C.A26();
        int firstVisibleItem = this.A0C.A27();
        A0B(lastVisibleItem, firstVisibleItem);
        A0A(lastVisibleItem, firstVisibleItem);
        A0V(lastVisibleItem, firstVisibleItem, i2);
    }

    public final InterfaceC4256cr A0N() {
        return this.A03;
    }

    public final InterfaceC4257cs A0O() {
        return this.A0E;
    }

    public final InterfaceC4258ct A0P() {
        return this.A0F;
    }

    public final void A0Q() {
        this.A01 = -1;
        int iA27 = this.A0C.A27();
        for (int iA26 = this.A0C.A26(); iA26 <= iA27 && iA26 >= 0; iA26++) {
            AbstractC3079Jg card = (AbstractC3079Jg) this.A0C.A1o(iA26);
            String[] strArr = A0I;
            String str = strArr[1];
            String str2 = strArr[4];
            int lastPos = str.length();
            int firstPos = str2.length();
            if (lastPos != firstPos) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[0] = "4n0r";
            strArr2[5] = "UAml839wpr";
            if (card != null && card.A1U()) {
                this.A01 = iA26;
                card.A1R();
                return;
            }
        }
    }

    public final void A0R() {
        AbstractC3079Jg abstractC3079Jg = (AbstractC3079Jg) this.A0C.A1o(this.A01);
        if (abstractC3079Jg != null && this.A01 >= 0) {
            abstractC3079Jg.A1S();
        }
    }

    public final void A0S(int i2) {
        AbstractC3079Jg abstractC3079Jg = (AbstractC3079Jg) this.A0C.A1o(i2);
        if (abstractC3079Jg != null && !A0a(abstractC3079Jg)) {
            A0Z(abstractC3079Jg, false);
        }
    }

    public final void A0T(int i2) {
        AbstractC3079Jg abstractC3079Jg = (AbstractC3079Jg) this.A0C.A1o(i2);
        if (abstractC3079Jg == null) {
            return;
        }
        if (A0a(abstractC3079Jg)) {
            A0Z(abstractC3079Jg, true);
        }
        if (A0J(abstractC3079Jg) && this.A05 != null) {
            this.A0F.setVolume(this.A05.get(((Integer) abstractC3079Jg.getTag(-1593835536)).intValue()).A03().A0H().A0A() ? 0.0f : 1.0f);
        }
    }

    public final void A0U(int i2) {
        this.A0D.A0A(i2);
        this.A0C.A1N(this.A0D);
    }

    public final void A0V(int i2, int i3, int i4) {
        if (!A0H() || this.A02 == null) {
            return;
        }
        int recomputeFrom = this.A0C.A25();
        if (recomputeFrom == -1) {
            recomputeFrom = i4 < 0 ? i2 : i3;
        }
        this.A02.AKa(recomputeFrom);
    }

    public final void A0W(Bundle bundle) {
        bundle.putFloat(A05(43, 18, 112), this.A00);
        bundle.putBoolean(A05(0, 23, 62), this.A07);
        bundle.putBoolean(A05(23, 20, 1), this.A08);
    }

    public void A0X(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.5f);
    }

    public final void A0Y(InterfaceC4254cp interfaceC4254cp) {
        this.A02 = interfaceC4254cp;
    }

    public void A0Z(AbstractC3079Jg abstractC3079Jg, boolean z) {
        if (A0H()) {
            A0X(abstractC3079Jg, z);
        }
        if (!z && abstractC3079Jg.A1U()) {
            abstractC3079Jg.A1R();
        }
    }

    public boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }
}
