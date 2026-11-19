package com.google.android.gms.common.util;

import android.os.Build;
import android.os.StrictMode;

/* JADX INFO: loaded from: classes.dex */
public final class zzd {
    /* JADX INFO: renamed from: a */
    public static StrictMode.VmPolicy m3660a() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(zzc.m3659a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }
}
