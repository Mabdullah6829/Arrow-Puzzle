package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcy {

    /* JADX INFO: renamed from: A */
    public static final String f11724A;

    /* JADX INFO: renamed from: B */
    public static final String f11725B;

    /* JADX INFO: renamed from: C */
    public static final String f11726C;

    /* JADX INFO: renamed from: D */
    public static final String f11727D;

    /* JADX INFO: renamed from: E */
    public static final String f11728E;

    /* JADX INFO: renamed from: F */
    public static final String f11729F;

    /* JADX INFO: renamed from: G */
    public static final String f11730G;

    /* JADX INFO: renamed from: H */
    public static final String f11731H;

    /* JADX INFO: renamed from: I */
    public static final String f11732I;

    /* JADX INFO: renamed from: q */
    public static final String f11733q;

    /* JADX INFO: renamed from: r */
    public static final String f11734r;

    /* JADX INFO: renamed from: s */
    public static final String f11735s;

    /* JADX INFO: renamed from: t */
    public static final String f11736t;

    /* JADX INFO: renamed from: u */
    public static final String f11737u;

    /* JADX INFO: renamed from: v */
    public static final String f11738v;

    /* JADX INFO: renamed from: w */
    public static final String f11739w;

    /* JADX INFO: renamed from: x */
    public static final String f11740x;

    /* JADX INFO: renamed from: y */
    public static final String f11741y;

    /* JADX INFO: renamed from: z */
    public static final String f11742z;

    /* JADX INFO: renamed from: a */
    public final CharSequence f11743a;

    /* JADX INFO: renamed from: b */
    public final Layout.Alignment f11744b;

    /* JADX INFO: renamed from: c */
    public final Layout.Alignment f11745c;

    /* JADX INFO: renamed from: d */
    public final Bitmap f11746d;

    /* JADX INFO: renamed from: e */
    public final float f11747e;

    /* JADX INFO: renamed from: f */
    public final int f11748f;

    /* JADX INFO: renamed from: g */
    public final int f11749g;

    /* JADX INFO: renamed from: h */
    public final float f11750h;

    /* JADX INFO: renamed from: i */
    public final int f11751i;

    /* JADX INFO: renamed from: j */
    public final float f11752j;

    /* JADX INFO: renamed from: k */
    public final float f11753k;

    /* JADX INFO: renamed from: l */
    public final int f11754l;

    /* JADX INFO: renamed from: m */
    public final float f11755m;

    /* JADX INFO: renamed from: n */
    public final int f11756n;

    /* JADX INFO: renamed from: o */
    public final float f11757o;

    /* JADX INFO: renamed from: p */
    public final int f11758p;

    static {
        zzcx zzcxVar = new zzcx();
        zzcxVar.m5859a("");
        zzcxVar.m5860b();
        String str = zzfm.f16091a;
        f11733q = Integer.toString(0, 36);
        f11734r = Integer.toString(17, 36);
        f11735s = Integer.toString(1, 36);
        f11736t = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f11737u = Integer.toString(18, 36);
        f11738v = Integer.toString(4, 36);
        f11739w = Integer.toString(5, 36);
        f11740x = Integer.toString(6, 36);
        f11741y = Integer.toString(7, 36);
        f11742z = Integer.toString(8, 36);
        f11724A = Integer.toString(9, 36);
        f11725B = Integer.toString(10, 36);
        f11726C = Integer.toString(11, 36);
        f11727D = Integer.toString(12, 36);
        f11728E = Integer.toString(13, 36);
        f11729F = Integer.toString(14, 36);
        f11730G = Integer.toString(15, 36);
        f11731H = Integer.toString(16, 36);
        f11732I = Integer.toString(19, 36);
    }

    public /* synthetic */ zzcy(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, int i6, float f7, int i7) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            zzgtr.m7128a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f11743a = SpannedString.valueOf(charSequence);
        } else {
            this.f11743a = charSequence != null ? charSequence.toString() : null;
        }
        this.f11744b = alignment;
        this.f11745c = alignment2;
        this.f11746d = bitmap;
        this.f11747e = f2;
        this.f11748f = i2;
        this.f11749g = i3;
        this.f11750h = f3;
        this.f11751i = i4;
        this.f11752j = f5;
        this.f11753k = f6;
        this.f11754l = i5;
        this.f11755m = f4;
        this.f11756n = i6;
        this.f11757o = f7;
        this.f11758p = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzcy.class != obj.getClass()) {
            return false;
        }
        zzcy zzcyVar = (zzcy) obj;
        Bitmap bitmap = zzcyVar.f11746d;
        if (!TextUtils.equals(this.f11743a, zzcyVar.f11743a) || this.f11744b != zzcyVar.f11744b || this.f11745c != zzcyVar.f11745c) {
            return false;
        }
        Bitmap bitmap2 = this.f11746d;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.f11747e == zzcyVar.f11747e && this.f11748f == zzcyVar.f11748f && this.f11749g == zzcyVar.f11749g && this.f11750h == zzcyVar.f11750h && this.f11751i == zzcyVar.f11751i && this.f11752j == zzcyVar.f11752j && this.f11753k == zzcyVar.f11753k && this.f11754l == zzcyVar.f11754l && this.f11755m == zzcyVar.f11755m && this.f11756n == zzcyVar.f11756n && this.f11757o == zzcyVar.f11757o && this.f11758p == zzcyVar.f11758p;
    }

    public final int hashCode() {
        return Objects.hash(this.f11743a, this.f11744b, this.f11745c, this.f11746d, Float.valueOf(this.f11747e), Integer.valueOf(this.f11748f), Integer.valueOf(this.f11749g), Float.valueOf(this.f11750h), Integer.valueOf(this.f11751i), Float.valueOf(this.f11752j), Float.valueOf(this.f11753k), Boolean.FALSE, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), Integer.valueOf(this.f11754l), Float.valueOf(this.f11755m), Integer.valueOf(this.f11756n), Float.valueOf(this.f11757o), Integer.valueOf(this.f11758p));
    }
}
