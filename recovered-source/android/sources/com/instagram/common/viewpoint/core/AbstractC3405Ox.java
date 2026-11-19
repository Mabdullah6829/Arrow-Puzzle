package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ox */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3405Ox extends Drawable {
    public static String[] A00 = {"Bq6maawZ0clc1FQAmj5JQZ", "VAIBWau0AGjNNTEN3MsesX9vol", "j9uAnr9SO1508v2Fml3gke", "ZCgsP4jhFD2e5OZklqeZfYu5I7s7wZNA", "gWy56vmTKK0E", "vsILSp0QdnJQHstvTHvz6zn3fr5EWYkf", "Ft8tZM9UwubEJUOv9H1JFeEwlzUnh", "KM7boO2xaC3ZbV22lXcue9aE71LlUQ5e"};
    public static final double A01 = Math.cos(Math.toRadians(45.0d));

    public static float A00(float f2, float f3, boolean z) {
        if (z) {
            return (float) (((double) f2) + ((1.0d - A01) * ((double) f3)));
        }
        return f2;
    }

    public static float A01(float f2, float f3, boolean z) {
        if (z) {
            return (float) (((double) (1.5f * f2)) + ((1.0d - A01) * ((double) f3)));
        }
        float f4 = 1.5f * f2;
        if (A00[6].length() == 2) {
            throw new RuntimeException();
        }
        A00[3] = "QZbxm3QXOF2yqMmVze25YX6oNvKBlq6Q";
        return f4;
    }
}
