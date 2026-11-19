package com.google.android.gms.internal.ads;

import androidx.constraintlayout.widget.C1137R;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafa {

    /* JADX INFO: renamed from: a */
    public static final int[] f5141a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b */
    public static final int[] f5142b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c */
    public static final int[] f5143c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d */
    public static final int[] f5144d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e */
    public static final int[] f5145e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f */
    public static final int[] f5146f = {69, 87, 104, C1137R.styleable.ConstraintSet_transitionEasing, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: a */
    public static int m4056a(int i2, int i3) {
        int i4;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || (i4 = i3 >> 1) >= 19) {
            return -1;
        }
        int i5 = f5142b[i2];
        if (i5 == 44100) {
            int i6 = f5146f[i4] + (i3 & 1);
            return i6 + i6;
        }
        int i7 = f5145e[i4];
        return i5 == 32000 ? i7 * 6 : i7 * 4;
    }
}
