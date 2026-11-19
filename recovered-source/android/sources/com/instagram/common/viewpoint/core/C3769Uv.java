package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uv */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3769Uv extends AbstractC4438fo {
    public static String[] A04 = {"hBf0w5eWi1Spl1ubHLZPwgySyKwDkFls", "R1QfRDzVW3llag6pkWHTLJyFxLfuZYUb", "hIMvI", "VChjXPEjBKz9WEtkkyfZeEDOAtDm6pyS", "ZAoFS", "FLKekHrPvHjWwOMiUj748H2wUl", "P5m22x1ZKo3VUkYY2cMyPktUJxi7JgjH", "Nk3fSWmW4cxCKGmv1zm92qMESviF4Rnt"};
    public final /* synthetic */ View A00;
    public final /* synthetic */ C4686ju A01;
    public final /* synthetic */ C3732UK A02;
    public final /* synthetic */ boolean A03;

    public C3769Uv(C3732UK c3732uk, View view, boolean z, C4686ju c4686ju) {
        this.A02 = c3732uk;
        this.A00 = view;
        this.A03 = z;
        this.A01 = c4686ju;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4438fo
    public final void A00() {
        this.A02.A0i.A06();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4438fo
    public final void A02() {
        this.A02.A0i.A0A();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4438fo
    public final void A03() {
        this.A02.A0i.A0B();
        if (C3763Up.A2I(this.A02.A16()) && (this.A00 instanceof AdNativeComponentView)) {
            View adContentsView = ((AdNativeComponentView) this.A00).getAdContentsView();
            if ((adContentsView instanceof C4378eq) && !((C4378eq) adContentsView).A05()) {
                this.A02.A0U.A0T();
                this.A02.A0i.A08();
                return;
            }
        }
        if (this.A03) {
            ImageView imageView = (ImageView) this.A00;
            Drawable drawable = this.A02.A01;
            if (drawable == null) {
                this.A02.A0U.A0T();
                this.A02.A0i.A07();
                return;
            }
            C3732UK.A0f(drawable, imageView);
        }
        this.A02.A0i.A0C(this.A02.A0g, this.A01.A0G());
        if (this.A02.A0U != null) {
            this.A02.A0U.A0V();
        }
        if (this.A02.A0Y != null && this.A02.A0Y.get() != null) {
            ((AbstractC4438fo) this.A02.A0Y.get()).A03();
        }
        if (this.A02.A0j.A07()) {
            this.A02.A0i.A04();
            return;
        }
        this.A02.A0c();
        if (this.A02.A0A != null && this.A02.A04 != null) {
            View view = this.A02.A06;
            if (A04[6].charAt(19) == 'P') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[0] = "XqswFkrS2Yg5WXkyCZy0rAQHDfEy407U";
            strArr[3] = "6zRr91flYJNmh2JhyLNuVxqP1ZintOSM";
            if (view != null) {
                this.A02.A0A.A0A(this.A02.A04);
                this.A02.A0A.A09(this.A02.A06);
                this.A02.A0A.A0E(this.A02.A0K);
                this.A02.A0A.A0I(this.A02.A0a);
                this.A02.A0A.A0M(this.A02.A0d);
                this.A02.A0A.A0L(this.A02.A0c);
                this.A02.A0A.A0J(this.A02.A0q());
                this.A02.A0A.A0C(this.A02.A09);
                this.A02.A0A.A0K(this.A02.A0b);
                this.A02.A0A.A0D(AbstractC4057Ze.A00(this.A02.A08));
                this.A02.A0A.A0F(this.A02.A0V);
                this.A02.A0A.A0N(this.A03);
                this.A02.A0A.A0B(this.A02.A08);
                this.A02.A0A.A0G(this.A02.A0X);
                this.A02.A0A.A03();
            }
        }
    }
}
