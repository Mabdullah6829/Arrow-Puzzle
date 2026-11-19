package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.core.view.ViewCompat;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3o */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C21173o {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public Bitmap A0C;
    public Layout.Alignment A0D;
    public Layout.Alignment A0E;
    public CharSequence A0F;
    public boolean A0G;

    public C21173o() {
        this.A0F = null;
        this.A0C = null;
        this.A0E = null;
        this.A0D = null;
        this.A01 = -3.4028235E38f;
        this.A07 = Integer.MIN_VALUE;
        this.A06 = Integer.MIN_VALUE;
        this.A02 = -3.4028235E38f;
        this.A08 = Integer.MIN_VALUE;
        this.A09 = Integer.MIN_VALUE;
        this.A05 = -3.4028235E38f;
        this.A04 = -3.4028235E38f;
        this.A00 = -3.4028235E38f;
        this.A0G = false;
        this.A0B = ViewCompat.MEASURED_STATE_MASK;
        this.A0A = Integer.MIN_VALUE;
    }

    public C21173o(C5014pT c5014pT) {
        this.A0F = c5014pT.A0F;
        this.A0C = c5014pT.A0C;
        this.A0E = c5014pT.A0E;
        this.A0D = c5014pT.A0D;
        this.A01 = c5014pT.A01;
        this.A07 = c5014pT.A07;
        this.A06 = c5014pT.A06;
        this.A02 = c5014pT.A02;
        this.A08 = c5014pT.A08;
        this.A09 = c5014pT.A09;
        this.A05 = c5014pT.A05;
        this.A04 = c5014pT.A04;
        this.A00 = c5014pT.A00;
        this.A0G = c5014pT.A0G;
        this.A0B = c5014pT.A0B;
        this.A0A = c5014pT.A0A;
        this.A03 = c5014pT.A03;
    }

    @Pure
    public final int A00() {
        return this.A06;
    }

    @Pure
    public final int A01() {
        return this.A08;
    }

    public final C21173o A02() {
        this.A0G = false;
        return this;
    }

    public final C21173o A03(float f2) {
        this.A00 = f2;
        return this;
    }

    public final C21173o A04(float f2) {
        this.A02 = f2;
        return this;
    }

    public final C21173o A05(float f2) {
        this.A03 = f2;
        return this;
    }

    public final C21173o A06(float f2) {
        this.A04 = f2;
        return this;
    }

    public final C21173o A07(float f2, int i2) {
        this.A01 = f2;
        this.A07 = i2;
        return this;
    }

    public final C21173o A08(float f2, int i2) {
        this.A05 = f2;
        this.A09 = i2;
        return this;
    }

    public final C21173o A09(int i2) {
        this.A06 = i2;
        return this;
    }

    public final C21173o A0A(int i2) {
        this.A08 = i2;
        return this;
    }

    public final C21173o A0B(int i2) {
        this.A0A = i2;
        return this;
    }

    public final C21173o A0C(int i2) {
        this.A0B = i2;
        this.A0G = true;
        return this;
    }

    public final C21173o A0D(Bitmap bitmap) {
        this.A0C = bitmap;
        return this;
    }

    public final C21173o A0E(Layout.Alignment alignment) {
        this.A0D = alignment;
        return this;
    }

    public final C21173o A0F(Layout.Alignment alignment) {
        this.A0E = alignment;
        return this;
    }

    public final C21173o A0G(CharSequence charSequence) {
        this.A0F = charSequence;
        return this;
    }

    public final C5014pT A0H() {
        return new C5014pT(this.A0F, this.A0E, this.A0D, this.A0C, this.A01, this.A07, this.A06, this.A02, this.A08, this.A09, this.A05, this.A04, this.A00, this.A0G, this.A0B, this.A0A, this.A03);
    }

    @Pure
    public final CharSequence A0I() {
        return this.A0F;
    }
}
