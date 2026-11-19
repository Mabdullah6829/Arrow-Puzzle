package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class GooglePlayServicesUtilLight {

    /* JADX INFO: renamed from: b */
    public static boolean f4162b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f4163c = false;

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f4161a = new AtomicBoolean();

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f4164d = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public static boolean m3404a(Context context) {
        try {
            if (!f4163c) {
                PackageInfo packageInfoM3663b = Wrappers.m3665a(context).m3663b(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
                GoogleSignatureVerifier.m3405a(context);
                if (packageInfoM3663b == null || GoogleSignatureVerifier.m3406c(packageInfoM3663b, false) || !GoogleSignatureVerifier.m3406c(packageInfoM3663b, true)) {
                    f4162b = false;
                } else {
                    f4162b = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            f4163c = true;
        }
        return f4162b || !"user".equals(Build.TYPE);
    }
}
