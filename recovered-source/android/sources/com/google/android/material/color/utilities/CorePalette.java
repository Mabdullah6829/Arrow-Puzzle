package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CorePalette {

    /* JADX INFO: renamed from: a1 */
    public TonalPalette f23387a1;

    /* JADX INFO: renamed from: a2 */
    public TonalPalette f23388a2;

    /* JADX INFO: renamed from: a3 */
    public TonalPalette f23389a3;
    public TonalPalette error;

    /* JADX INFO: renamed from: n1 */
    public TonalPalette f23390n1;

    /* JADX INFO: renamed from: n2 */
    public TonalPalette f23391n2;

    private CorePalette(int i2, boolean z) {
        Hct hctFromInt = Hct.fromInt(i2);
        double hue = hctFromInt.getHue();
        double chroma = hctFromInt.getChroma();
        if (z) {
            this.f23387a1 = TonalPalette.fromHueAndChroma(hue, chroma);
            this.f23388a2 = TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.f23389a3 = TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.f23390n1 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f23391n2 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f23387a1 = TonalPalette.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f23388a2 = TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.f23389a3 = TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.f23390n1 = TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.f23391n2 = TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }

    public static CorePalette contentOf(int i2) {
        return new CorePalette(i2, true);
    }

    /* JADX INFO: renamed from: of */
    public static CorePalette m10813of(int i2) {
        return new CorePalette(i2, false);
    }
}
