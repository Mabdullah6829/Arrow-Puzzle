package com.google.android.gms.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.material.card.MaterialCardViewHelper;

/* JADX INFO: loaded from: classes.dex */
public final class AdSize {

    /* JADX INFO: renamed from: i */
    public static final AdSize f2946i = new AdSize(320, 50, "320x50_mb");

    /* JADX INFO: renamed from: j */
    public static final AdSize f2947j = new AdSize(468, 60, "468x60_as");

    /* JADX INFO: renamed from: k */
    public static final AdSize f2948k = new AdSize(320, 100, "320x100_as");

    /* JADX INFO: renamed from: l */
    public static final AdSize f2949l = new AdSize(728, 90, "728x90_as");

    /* JADX INFO: renamed from: m */
    public static final AdSize f2950m = new AdSize(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, "300x250_as");

    /* JADX INFO: renamed from: n */
    public static final AdSize f2951n = new AdSize(160, 600, "160x600_as");

    /* JADX INFO: renamed from: o */
    public static final AdSize f2952o = new AdSize(-1, -2, "smart_banner");

    /* JADX INFO: renamed from: p */
    public static final AdSize f2953p = new AdSize(-3, -4, "fluid");

    /* JADX INFO: renamed from: q */
    public static final AdSize f2954q = new AdSize(0, 0, "invalid");

    /* JADX INFO: renamed from: r */
    public static final AdSize f2955r = new AdSize(50, 50, "50x50_mb");

    /* JADX INFO: renamed from: a */
    public final int f2956a;

    /* JADX INFO: renamed from: b */
    public final int f2957b;

    /* JADX INFO: renamed from: c */
    public final String f2958c;

    /* JADX INFO: renamed from: d */
    public boolean f2959d;

    /* JADX INFO: renamed from: e */
    public boolean f2960e;

    /* JADX INFO: renamed from: f */
    public int f2961f;

    /* JADX INFO: renamed from: g */
    public boolean f2962g;

    /* JADX INFO: renamed from: h */
    public int f2963h;

    /* JADX WARN: Illegal instructions before constructor call */
    public AdSize(int i2, int i3) {
        String strValueOf = i2 == -1 ? "FULL" : String.valueOf(i2);
        String strValueOf2 = i3 == -2 ? "AUTO" : String.valueOf(i3);
        this(i2, i3, AbstractC1456a.m2451r(new StringBuilder(String.valueOf(strValueOf2).length() + String.valueOf(strValueOf).length() + 1 + 3), strValueOf, "x", strValueOf2, "_as"));
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.f2956a == adSize.f2956a && this.f2957b == adSize.f2957b && this.f2958c.equals(adSize.f2958c);
    }

    public final int hashCode() {
        return this.f2958c.hashCode();
    }

    public final String toString() {
        return this.f2958c;
    }

    public AdSize(int i2, int i3, String str) {
        if (i2 < 0 && i2 != -1 && i2 != -3) {
            throw new IllegalArgumentException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 26), "Invalid width for AdSize: ", i2));
        }
        if (i3 < 0 && i3 != -2 && i3 != -4) {
            throw new IllegalArgumentException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i3).length() + 27), "Invalid height for AdSize: ", i3));
        }
        this.f2956a = i2;
        this.f2957b = i3;
        this.f2958c = str;
    }
}
