package com.instagram.common.viewpoint.core;

import android.text.Layout;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jo */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3087Jo {
    public static final Comparator<C3087Jo> A02 = new Comparator() { // from class: com.facebook.ads.redexgen.X.Jn
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((C3087Jo) obj2).A00, ((C3087Jo) obj).A00);
        }
    };
    public final int A00;
    public final C5014pT A01;

    public C3087Jo(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, boolean z, int i5, int i6) {
        C21173o cueBuilder = new C21173o().A0G(charSequence).A0F(alignment).A07(f2, i2).A09(i3).A04(f3).A0A(i4).A06(f4);
        if (z) {
            cueBuilder.A0C(i5);
        }
        this.A01 = cueBuilder.A0H();
        this.A00 = i6;
    }
}
