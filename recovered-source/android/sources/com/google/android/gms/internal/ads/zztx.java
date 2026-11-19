package com.google.android.gms.internal.ads;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
final class zztx {
    /* JADX INFO: renamed from: a */
    public static boolean m8892a(int i2) {
        if (i2 == 8 || i2 == 7) {
            return true;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 31 || !(i2 == 26 || i2 == 27)) {
            return i3 >= 33 && i2 == 30;
        }
        return true;
    }
}
