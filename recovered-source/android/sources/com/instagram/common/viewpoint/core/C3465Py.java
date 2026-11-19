package com.instagram.common.viewpoint.core;

import android.view.WindowInsets;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Py */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3465Py {
    public final Object A00;

    public C3465Py(Object obj) {
        this.A00 = obj;
    }

    public static C3465Py A00(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C3465Py(obj);
    }

    public static Object A01(C3465Py c3465Py) {
        if (c3465Py == null) {
            return null;
        }
        return c3465Py.A00;
    }

    public final int A02() {
        return ((WindowInsets) this.A00).getSystemWindowInsetBottom();
    }

    public final int A03() {
        return ((WindowInsets) this.A00).getSystemWindowInsetLeft();
    }

    public final int A04() {
        return ((WindowInsets) this.A00).getSystemWindowInsetRight();
    }

    public final int A05() {
        return ((WindowInsets) this.A00).getSystemWindowInsetTop();
    }

    public final C3465Py A06(int i2, int i3, int i4, int i5) {
        return new C3465Py(((WindowInsets) this.A00).replaceSystemWindowInsets(i2, i3, i4, i5));
    }

    public final boolean A07() {
        return ((WindowInsets) this.A00).isConsumed();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3465Py c3465Py = (C3465Py) obj;
        if (this.A00 == null) {
            return c3465Py.A00 == null;
        }
        return this.A00.equals(c3465Py.A00);
    }

    public final int hashCode() {
        if (this.A00 == null) {
            return 0;
        }
        return this.A00.hashCode();
    }
}
