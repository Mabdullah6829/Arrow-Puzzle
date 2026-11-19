package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Display;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ph */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3449Ph {
    public static final C3448Pg A00;

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            A00 = new C19290h() { // from class: com.facebook.ads.redexgen.X.0e
            };
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            A00 = new C19290h();
        } else if (Build.VERSION.SDK_INT >= 23) {
            A00 = new C19320k();
        } else {
            A00 = new C19350n();
        }
    }

    public static int A00(View view) {
        return A00.A02(view);
    }

    public static int A01(View view) {
        return A00.A03(view);
    }

    public static int A02(View view) {
        return A00.A04(view);
    }

    public static int A03(View view) {
        return A00.A05(view);
    }

    public static Display A04(View view) {
        return A00.A06(view);
    }

    public static C3465Py A05(View view, C3465Py c3465Py) {
        return A00.A07(view, c3465Py);
    }

    public static C3465Py A06(View view, C3465Py c3465Py) {
        return A00.A08(view, c3465Py);
    }

    public static void A07(View view) {
        A00.A09(view);
    }

    public static void A08(View view) {
        A00.A0A(view);
    }

    public static void A09(View view, int i2) {
        A00.A0B(view, i2);
    }

    public static void A0A(View view, Drawable drawable) {
        A00.A0C(view, drawable);
    }

    public static void A0B(View view, AbstractC3428PL abstractC3428PL) {
        A00.A0D(view, abstractC3428PL);
    }

    public static void A0C(View view, InterfaceC3434PR interfaceC3434PR) {
        A00.A0E(view, interfaceC3434PR);
    }

    public static void A0D(View view, Runnable runnable) {
        A00.A0F(view, runnable);
    }

    public static void A0E(View view, Runnable runnable, long j2) {
        A00.A0G(view, runnable, j2);
    }

    public static boolean A0F(View view) {
        return A00.A0H(view);
    }

    public static boolean A0G(View view) {
        return A00.A0I(view);
    }

    public static boolean A0H(View view) {
        return A00.A0J(view);
    }
}
