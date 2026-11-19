package com.google.android.material.shape;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface ShapeAppearance {
    @NonNull
    ShapeAppearanceModel getDefaultShape();

    @NonNull
    ShapeAppearanceModel[] getShapeAppearanceModels();

    @NonNull
    ShapeAppearanceModel getShapeForState(@NonNull int[] iArr);

    boolean isStateful();

    @NonNull
    ShapeAppearanceModel withCornerSize(float f2);

    @NonNull
    ShapeAppearanceModel withCornerSize(@NonNull CornerSize cornerSize);
}
