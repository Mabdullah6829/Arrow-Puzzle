package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdy {
    /* JADX INFO: renamed from: a */
    public static boolean m6087a(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return m6089c("EGL_EXT_protected_content");
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static void m6088b(String str, boolean z) throws zzdx {
        if (z) {
            return;
        }
        zzgzi zzgziVar = zzgwt.f18303t;
        throw new zzdx(str, zzgyo.f18355w);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6089c(String str) throws zzdx {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        m6088b("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        m6088b("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
            return strEglQueryString != null && strEglQueryString.contains(str);
        }
        throw new zzdx("Error in getDefaultEglDisplay, error code: 0x".concat(String.valueOf(Integer.toHexString(iEglGetError))), zzgwt.m7216n(Integer.valueOf(iEglGetError)));
    }
}
