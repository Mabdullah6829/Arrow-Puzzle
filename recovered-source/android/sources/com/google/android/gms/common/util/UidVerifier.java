package com.google.android.gms.common.util;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: loaded from: classes.dex */
public final class UidVerifier {
    private UidVerifier() {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3657a(Context context, int i2) {
        if (m3658b(context, i2, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                GoogleSignatureVerifier googleSignatureVerifierM3405a = GoogleSignatureVerifier.m3405a(context);
                googleSignatureVerifierM3405a.getClass();
                if (packageInfo != null) {
                    if (!GoogleSignatureVerifier.m3406c(packageInfo, false)) {
                        if (GoogleSignatureVerifier.m3406c(packageInfo, true)) {
                            if (!GooglePlayServicesUtilLight.m3404a(googleSignatureVerifierM3405a.f4166a)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3658b(Context context, int i2, String str) {
        PackageManagerWrapper packageManagerWrapperM3665a = Wrappers.m3665a(context);
        packageManagerWrapperM3665a.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) packageManagerWrapperM3665a.f4662a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i2, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
