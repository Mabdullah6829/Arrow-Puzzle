package com.instagram.common.viewpoint.core;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.DB */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2678DB implements InterfaceC4408fK {
    public static byte[] A06;
    public ValueAnimator A00;
    public EnumC4407fJ A01 = EnumC4407fJ.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    static {
        A05();
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{49, 32, 61, 49, 6, 42, 41, 42, 55};
    }

    public C2678DB(View view, int i2, int i3, int i4) {
        this.A02 = i2;
        this.A05 = view;
        this.A04 = i3;
        this.A03 = i4;
    }

    private void A06(int i2, int i3) {
        this.A01 = i2 == this.A04 ? EnumC4407fJ.A03 : EnumC4407fJ.A05;
        this.A00 = ObjectAnimator.ofInt((TextView) this.A05, A04(0, 9, 85), i2, i3);
        this.A00.setEvaluator(new ArgbEvaluator());
        this.A00.setDuration(this.A02);
        this.A00.addListener(new C4414fQ(this, i2, i3));
        this.A00.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i2, int i3, boolean z) {
        if (z) {
            A06(i2, i3);
        } else {
            ((TextView) this.A05).setTextColor(i3);
            this.A01 = i3 == this.A03 ? EnumC4407fJ.A02 : EnumC4407fJ.A04;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4408fK
    public final void A4A(boolean z, boolean z2) {
        int endColor = z2 ? this.A03 : this.A04;
        int startColor = z2 ? this.A04 : this.A03;
        A07(endColor, startColor, z);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4408fK
    public final EnumC4407fJ A9B() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4408fK
    public final void cancel() {
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
