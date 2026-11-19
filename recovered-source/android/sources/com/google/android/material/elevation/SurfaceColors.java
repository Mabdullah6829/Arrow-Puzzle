package com.google.android.material.elevation;

import android.content.Context;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import com.google.android.material.C5183R;
import com.google.android.material.color.MaterialColors;

/* JADX INFO: loaded from: classes2.dex */
public enum SurfaceColors {
    SURFACE_0(C5183R.dimen.m3_sys_elevation_level0),
    SURFACE_1(C5183R.dimen.m3_sys_elevation_level1),
    SURFACE_2(C5183R.dimen.m3_sys_elevation_level2),
    SURFACE_3(C5183R.dimen.m3_sys_elevation_level3),
    SURFACE_4(C5183R.dimen.m3_sys_elevation_level4),
    SURFACE_5(C5183R.dimen.m3_sys_elevation_level5);

    private final int elevationResId;

    SurfaceColors(int i2) {
        this.elevationResId = i2;
    }

    @ColorInt
    public static int getColorForElevation(@NonNull Context context, @Dimension float f2) {
        return new ElevationOverlayProvider(context).compositeOverlay(MaterialColors.getColor(context, C5183R.attr.colorSurface, 0), f2);
    }

    @ColorInt
    public int getColor(@NonNull Context context) {
        return getColorForElevation(context, context.getResources().getDimension(this.elevationResId));
    }
}
