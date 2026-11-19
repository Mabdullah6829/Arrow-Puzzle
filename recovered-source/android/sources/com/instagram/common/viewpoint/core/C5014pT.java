package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5014pT implements InterfaceC201424 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Bitmap A0C;
    public final Layout.Alignment A0D;
    public final Layout.Alignment A0E;
    public final CharSequence A0F;
    public final boolean A0G;
    public static String[] A0H = {"KUNE", "raA8kdJusqhSRQUihDErH9yYSlb7Q0pc", "a1YC1OeN6dpIjzX6IUyhBFBaZFiOBPar", "NtybfxE4AhM4u1v", "wsqusZh9gWXwGZdOs5jqqsOsuYO68ouK", "hrWhj8FC8bQIQnfwmhsxP3BdiVuQ0H3H", "RcL5HtL", "cuPzI7wmuuTc6v"};
    public static final C5014pT A0J = new C21173o().A0G("").A0H();
    public static final String A0U = AbstractC22035C.A0h(0);
    public static final String A0V = AbstractC22035C.A0h(1);
    public static final String A0P = AbstractC22035C.A0h(2);
    public static final String A0K = AbstractC22035C.A0h(3);
    public static final String A0M = AbstractC22035C.A0h(4);
    public static final String A0O = AbstractC22035C.A0h(5);
    public static final String A0N = AbstractC22035C.A0h(6);
    public static final String A0Q = AbstractC22035C.A0h(7);
    public static final String A0R = AbstractC22035C.A0h(8);
    public static final String A0X = AbstractC22035C.A0h(9);
    public static final String A0W = AbstractC22035C.A0h(10);
    public static final String A0T = AbstractC22035C.A0h(11);
    public static final String A0L = AbstractC22035C.A0h(12);
    public static final String A0Z = AbstractC22035C.A0h(13);
    public static final String A0a = AbstractC22035C.A0h(14);
    public static final String A0Y = AbstractC22035C.A0h(15);
    public static final String A0S = AbstractC22035C.A0h(16);
    public static final InterfaceC201323<C5014pT> A0I = new InterfaceC201323() { // from class: com.facebook.ads.redexgen.X.pV
        @Override // com.instagram.common.viewpoint.core.InterfaceC201323
        public final InterfaceC201424 A6f(Bundle bundle) {
            return C5014pT.A00(bundle);
        }
    };

    public C5014pT(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z, int i6, int i7, float f7) {
        if (charSequence == null) {
            AbstractC21273y.A01(bitmap);
        } else {
            AbstractC21273y.A07(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.A0F = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.A0F = charSequence.toString();
        } else {
            this.A0F = null;
        }
        this.A0E = alignment;
        this.A0D = alignment2;
        this.A0C = bitmap;
        this.A01 = f2;
        this.A07 = i2;
        this.A06 = i3;
        this.A02 = f3;
        this.A08 = i4;
        this.A04 = f5;
        this.A00 = f6;
        this.A0G = z;
        this.A0B = i6;
        this.A09 = i5;
        this.A05 = f4;
        this.A0A = i7;
        this.A03 = f7;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0112  */
    public static final C5014pT A00(Bundle bundle) {
        C21173o c21173o = new C21173o();
        CharSequence charSequence = bundle.getCharSequence(A0U);
        if (charSequence != null) {
            c21173o.A0G(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(A0V);
        if (alignment != null) {
            c21173o.A0F(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(A0P);
        if (alignment2 != null) {
            c21173o.A0E(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(A0K);
        if (bitmap != null) {
            c21173o.A0D(bitmap);
        }
        if (bundle.containsKey(A0M)) {
            boolean zContainsKey = bundle.containsKey(A0O);
            if (A0H[1].charAt(14) == 'v') {
                throw new RuntimeException();
            }
            A0H[6] = "SnlpZ584xa2urjPIz8YdoedqgUv4xZ";
            if (zContainsKey) {
                c21173o.A07(bundle.getFloat(A0M), bundle.getInt(A0O));
            }
        }
        if (bundle.containsKey(A0N)) {
            int i2 = bundle.getInt(A0N);
            if (A0H[4].charAt(16) != 'F') {
                A0H[1] = "ya89OHr1nN19FgUSnedhVAiJJHnMxvW6";
                c21173o.A09(i2);
            } else {
                c21173o.A09(i2);
            }
        }
        if (bundle.containsKey(A0Q)) {
            c21173o.A04(bundle.getFloat(A0Q));
        }
        if (bundle.containsKey(A0R)) {
            c21173o.A0A(bundle.getInt(A0R));
        }
        if (bundle.containsKey(A0W) && bundle.containsKey(A0X)) {
            c21173o.A08(bundle.getFloat(A0W), bundle.getInt(A0X));
        }
        if (bundle.containsKey(A0T)) {
            c21173o.A06(bundle.getFloat(A0T));
        }
        if (bundle.containsKey(A0L)) {
            c21173o.A03(bundle.getFloat(A0L));
        }
        String str = A0Z;
        if (A0H[6].length() != 9) {
            A0H[6] = "";
            if (bundle.containsKey(str)) {
                c21173o.A0C(bundle.getInt(A0Z));
            }
        } else if (bundle.containsKey(str)) {
            c21173o.A0C(bundle.getInt(A0Z));
        }
        if (!bundle.getBoolean(A0a, false)) {
            c21173o.A02();
        }
        if (bundle.containsKey(A0Y)) {
            c21173o.A0B(bundle.getInt(A0Y));
        }
        if (bundle.containsKey(A0S)) {
            c21173o.A05(bundle.getFloat(A0S));
        }
        return c21173o.A0H();
    }

    public final C21173o A02() {
        return new C21173o(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5014pT c5014pT = (C5014pT) obj;
        if (TextUtils.equals(this.A0F, c5014pT.A0F) && this.A0E == c5014pT.A0E && this.A0D == c5014pT.A0D && (this.A0C != null ? !(c5014pT.A0C == null || !this.A0C.sameAs(c5014pT.A0C)) : c5014pT.A0C == null) && this.A01 == c5014pT.A01 && this.A07 == c5014pT.A07 && this.A06 == c5014pT.A06) {
            float f2 = this.A02;
            if (A0H[4].charAt(16) == 'F') {
                throw new RuntimeException();
            }
            A0H[6] = "OaHYrPsvOOcaJ1wPKUjhJjBsa";
            if (f2 == c5014pT.A02 && this.A08 == c5014pT.A08 && this.A04 == c5014pT.A04 && this.A00 == c5014pT.A00 && this.A0G == c5014pT.A0G && this.A0B == c5014pT.A0B && this.A09 == c5014pT.A09 && this.A05 == c5014pT.A05 && this.A0A == c5014pT.A0A && this.A03 == c5014pT.A03) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC2617CB.A00(this.A0F, this.A0E, this.A0D, this.A0C, Float.valueOf(this.A01), Integer.valueOf(this.A07), Integer.valueOf(this.A06), Float.valueOf(this.A02), Integer.valueOf(this.A08), Float.valueOf(this.A04), Float.valueOf(this.A00), Boolean.valueOf(this.A0G), Integer.valueOf(this.A0B), Integer.valueOf(this.A09), Float.valueOf(this.A05), Integer.valueOf(this.A0A), Float.valueOf(this.A03));
    }
}
