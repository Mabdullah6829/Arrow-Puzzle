package com.google.android.gms.common.util;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class PlatformVersion {
    private PlatformVersion() {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3653a() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3654b() {
        return Build.VERSION.SDK_INT >= 30;
    }
}
