package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
public final class DeviceProperties {

    /* JADX INFO: renamed from: a */
    public static Boolean f4637a;

    /* JADX INFO: renamed from: b */
    public static Boolean f4638b;

    /* JADX INFO: renamed from: c */
    public static Boolean f4639c;

    /* JADX INFO: renamed from: d */
    public static Boolean f4640d;

    /* JADX INFO: renamed from: e */
    public static Boolean f4641e;

    /* JADX INFO: renamed from: f */
    public static Boolean f4642f;

    private DeviceProperties() {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3643a(Context context) {
        if (f4639c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            f4639c = Boolean.valueOf(z);
        }
        return f4639c.booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3644b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f4637a == null) {
            f4637a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f4637a.booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3645c(Context context) {
        m3644b(context);
        if (m3646d(context)) {
            return !PlatformVersion.m3653a() || PlatformVersion.m3654b();
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m3646d(Context context) {
        if (f4638b == null) {
            f4638b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f4638b.booleanValue();
    }
}
