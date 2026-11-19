package com.instagram.common.viewpoint.core;

import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.je */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4670je extends AbstractC3518Qq<C3439PX> {
    public static String[] A05 = {"BofGdT", "Cb8B81bPHxSAbCDzy4", "tLXqRIVVg6Ax3ByQPtTHAjuCLXMkMIv2", "Awqy8gsEnlsE3SarczMGKLCzZdtyeG5w", "c95zYEegXXkMe1M4f4KrlDKZ96YYHdKl", "dzB1VPy83al1mBxHBTo", "7fXNgxpNBgLKECdM7L4CyN3WmxsqHAeT", "HUwJOtf8ZOX36MmDYBkOhN0MiSikj2Pg"};
    public static final int A06 = (int) (AbstractC3926XX.A02 * 4.0f);
    public InterfaceC3306NM A00;
    public final List<C3732UK> A01;
    public final int A02;
    public final C4494gi A03;
    public final AbstractC4438fo A04 = new C4672jg(this);

    public AbstractC4670je(C19450x c19450x, List<C3732UK> list, C4494gi c4494gi) {
        this.A03 = c4494gi;
        this.A02 = c19450x.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A01(int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i3 = this.A02;
        if (i2 == 0) {
            i3 *= 2;
        }
        int size = this.A01.size() - 1;
        String[] strArr = A05;
        if (strArr[3].charAt(2) == strArr[4].charAt(2)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[7] = "KlchvvVcsY9zV3e8wqzNtTZQscUuxnqD";
        strArr2[1] = "gQBYn2ao1l5plthpQQ";
        marginLayoutParams.setMargins(i3, 0, i2 >= size ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3518Qq
    public final int A0B() {
        return this.A01.size();
    }

    public final void A0O(ImageView imageView, int i2) {
        C3732UK c3732uk = this.A01.get(i2);
        C3811Vb adCoverImage = c3732uk.getAdCoverImage();
        if (adCoverImage != null) {
            AsyncTaskC3183LM asyncTaskC3183LMA04 = new AsyncTaskC3183LM(imageView, this.A03).A04();
            asyncTaskC3183LMA04.A06(new C4671jf(this, i2, c3732uk));
            asyncTaskC3183LMA04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0P(InterfaceC3306NM interfaceC3306NM) {
        this.A00 = interfaceC3306NM;
    }

    public void A0Q(C3439PX c3439px, int i2) {
        c3439px.A0p().setLayoutParams(A01(i2));
    }
}
