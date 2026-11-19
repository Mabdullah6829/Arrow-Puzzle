package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.i9 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4580i9 implements InterfaceC3402Ou {
    private C3403Ov A00(InterfaceC3401Ot interfaceC3401Ot) {
        return (C3403Ov) interfaceC3401Ot.A7E();
    }

    public final void A01(InterfaceC3401Ot interfaceC3401Ot) {
        if (!interfaceC3401Ot.A9R()) {
            interfaceC3401Ot.AJl(0, 0, 0, 0);
            return;
        }
        float fA8S = A8S(interfaceC3401Ot);
        float fA8r = A8r(interfaceC3401Ot);
        float elevation = AbstractC3405Ox.A00(fA8S, fA8r, interfaceC3401Ot.A8q());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = AbstractC3405Ox.A01(fA8S, fA8r, interfaceC3401Ot.A8q());
        int iCeil = (int) Math.ceil(elevation2);
        interfaceC3401Ot.AJl(vPadding, iCeil, vPadding, iCeil);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3402Ou
    public final ColorStateList A71(InterfaceC3401Ot interfaceC3401Ot) {
        return A00(interfaceC3401Ot).A05();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3402Ou
    public final float A7v(InterfaceC3401Ot interfaceC3401Ot) {
        return interfaceC3401Ot.A7F().getElevation();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3402Ou
    public final float A8S(InterfaceC3401Ot interfaceC3401Ot) {
        return A00(interfaceC3401Ot).A03();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3402Ou
    public final float A8X(InterfaceC3401Ot interfaceC3401Ot) {
        return A8r(interfaceC3401Ot) * 2.0f;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3402Ou
    public final float A8Y(InterfaceC3401Ot interfaceC3401Ot) {
        return A8r(interfaceC3401Ot) * 2.0f;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3402Ou
    public final float A8r(InterfaceC3401Ot interfaceC3401Ot) {
        return A00(interfaceC3401Ot).A04();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3402Ou
    public final void AAE() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3402Ou
    public final void AAG(InterfaceC3401Ot interfaceC3401Ot, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        C3403Ov background = new C3403Ov(colorStateList, f2);
        interfaceC3401Ot.AJK(background);
        View view = interfaceC3401Ot.A7F();
        view.setClipToOutline(true);
        view.setElevation(f3);
        AJX(interfaceC3401Ot, f4);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3402Ou
    public final void ADP(InterfaceC3401Ot interfaceC3401Ot) {
        AJX(interfaceC3401Ot, A8S(interfaceC3401Ot));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3402Ou
    public final void AFT(InterfaceC3401Ot interfaceC3401Ot) {
        AJX(interfaceC3401Ot, A8S(interfaceC3401Ot));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3402Ou
    public final void AJJ(InterfaceC3401Ot interfaceC3401Ot, ColorStateList colorStateList) {
        A00(interfaceC3401Ot).A08(colorStateList);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3402Ou
    public final void AJP(InterfaceC3401Ot interfaceC3401Ot, float f2) {
        interfaceC3401Ot.A7F().setElevation(f2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3402Ou
    public final void AJX(InterfaceC3401Ot interfaceC3401Ot, float f2) {
        A00(interfaceC3401Ot).A07(f2, interfaceC3401Ot.A9R(), interfaceC3401Ot.A8q());
        A01(interfaceC3401Ot);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3402Ou
    public final void AJj(InterfaceC3401Ot interfaceC3401Ot, float f2) {
        A00(interfaceC3401Ot).A06(f2);
    }
}
