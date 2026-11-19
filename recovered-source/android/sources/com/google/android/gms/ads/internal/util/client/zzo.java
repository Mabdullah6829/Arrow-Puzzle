package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import com.google.android.gms.internal.ads.zzgug;

/* JADX INFO: loaded from: classes.dex */
public class zzo {

    /* JADX INFO: renamed from: a */
    public static final zzgug f3437a = zzgug.m7144b();

    /* JADX INFO: renamed from: a */
    public static void m3068a(String str) {
        if (m3077j(3)) {
            if (str.length() <= 4000) {
                Log.d("Ads", str);
                return;
            }
            boolean z = true;
            for (String str2 : f3437a.m7146d(str)) {
                if (z) {
                    Log.d("Ads", str2);
                } else {
                    Log.d("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3069b(String str, Throwable th) {
        if (m3077j(3)) {
            Log.d("Ads", str, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3070c(String str) {
        if (m3077j(6)) {
            if (str == null || str.length() <= 4000) {
                Log.e("Ads", str);
                return;
            }
            boolean z = true;
            for (String str2 : f3437a.m7146d(str)) {
                if (z) {
                    Log.e("Ads", str2);
                } else {
                    Log.e("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3071d(String str, Throwable th) {
        if (m3077j(6)) {
            Log.e("Ads", str, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m3072e(String str) {
        if (m3077j(4)) {
            if (str == null || str.length() <= 4000) {
                Log.i("Ads", str);
                return;
            }
            boolean z = true;
            for (String str2 : f3437a.m7146d(str)) {
                if (z) {
                    Log.i("Ads", str2);
                } else {
                    Log.i("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m3073f(String str) {
        if (m3077j(5)) {
            if (str == null || str.length() <= 4000) {
                Log.w("Ads", str);
                return;
            }
            boolean z = true;
            for (String str2 : f3437a.m7146d(str)) {
                if (z) {
                    Log.w("Ads", str2);
                } else {
                    Log.w("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m3074g(String str, Throwable th) {
        if (m3077j(5)) {
            Log.w("Ads", str, th);
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m3075h(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(lineNumber).length());
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static void m3076i(String str, Exception exc) {
        if (m3077j(5)) {
            if (exc != null) {
                m3074g(m3075h(str), exc);
            } else {
                m3073f(m3075h(str));
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m3077j(int i2) {
        return i2 >= 5 || Log.isLoggable("Ads", i2);
    }
}
