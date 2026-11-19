package com.google.android.gms.common;

/* JADX INFO: loaded from: classes.dex */
public final class zzc {
    /* JADX INFO: renamed from: a */
    public static int m3667a(int i2) {
        int[] iArr = {1, 2, 3};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr[i3];
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i5 == i2) {
                return i4;
            }
        }
        return 1;
    }
}
