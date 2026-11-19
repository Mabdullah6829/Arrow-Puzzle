package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;

/* JADX INFO: loaded from: classes2.dex */
final class zzdb {

    /* JADX INFO: renamed from: a */
    public static final String f11918a;

    /* JADX INFO: renamed from: b */
    public static final String f11919b;

    /* JADX INFO: renamed from: c */
    public static final String f11920c;

    /* JADX INFO: renamed from: d */
    public static final String f11921d;

    /* JADX INFO: renamed from: e */
    public static final String f11922e;

    static {
        String str = zzfm.f16091a;
        f11918a = Integer.toString(0, 36);
        f11919b = Integer.toString(1, 36);
        f11920c = Integer.toString(2, 36);
        f11921d = Integer.toString(3, 36);
        f11922e = Integer.toString(4, 36);
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m5888a(Spanned spanned, Object obj, int i2, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f11918a, spanned.getSpanStart(obj));
        bundle2.putInt(f11919b, spanned.getSpanEnd(obj));
        bundle2.putInt(f11920c, spanned.getSpanFlags(obj));
        bundle2.putInt(f11921d, i2);
        if (bundle != null) {
            bundle2.putBundle(f11922e, bundle);
        }
        return bundle2;
    }
}
