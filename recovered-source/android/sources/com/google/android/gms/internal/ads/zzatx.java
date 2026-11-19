package com.google.android.gms.internal.ads;

import android.util.Log;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Locale;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzatx {

    /* JADX INFO: renamed from: a */
    public static final boolean f6920a = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: b */
    public static final String f6921b = zzatx.class.getName();

    /* JADX INFO: renamed from: a */
    public static void m4402a(String str, Object... objArr) {
        if (f6920a) {
            Log.v("Volley", m4405d(str, objArr));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4403b(String str, Object... objArr) {
        Log.d("Volley", m4405d(str, objArr));
    }

    /* JADX INFO: renamed from: c */
    public static void m4404c(String str, Object... objArr) {
        Log.e("Volley", m4405d(str, objArr));
    }

    /* JADX INFO: renamed from: d */
    public static String m4405d(String str, Object... objArr) {
        String strM2450q;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i2 = 2; i2 < stackTrace.length; i2++) {
            if (!stackTrace[i2].getClassName().equals(f6921b)) {
                String className = stackTrace[i2].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i2].getMethodName();
                strM2450q = AbstractC1456a.m2450q(new StringBuilder(String.valueOf(strSubstring2).length() + 1 + String.valueOf(methodName).length()), strSubstring2, ".", methodName);
                Locale locale = Locale.US;
                long id = Thread.currentThread().getId();
                StringBuilder sb = new StringBuilder("[");
                sb.append(id);
                sb.append("] ");
                sb.append(strM2450q);
                return AbstractC0271e0.m403k(sb, ": ", str2);
            }
        }
        strM2450q = "<unknown>";
        Locale locale2 = Locale.US;
        long id2 = Thread.currentThread().getId();
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(id2);
        sb2.append("] ");
        sb2.append(strM2450q);
        return AbstractC0271e0.m403k(sb2, ": ", str2);
    }
}
