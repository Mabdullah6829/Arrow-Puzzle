package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class CutCornerTreatment extends CornerTreatment {
    float size;

    public CutCornerTreatment() {
        this.size = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f2, float f3, float f4) {
        float f5 = f4 * f3;
        shapePath.reset(0.0f, f5, 180.0f, 180.0f - f2);
        double d = f5;
        shapePath.lineTo((float) (Math.sin(Math.toRadians(f2)) * d), (float) (Math.sin(Math.toRadians(90.0f - f2)) * d));
    }

    @Deprecated
    public CutCornerTreatment(float f2) {
        this.size = f2;
    }
}
