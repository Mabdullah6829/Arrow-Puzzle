package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeh {

    /* JADX INFO: renamed from: a */
    public static final Object f13904a = new Object();

    /* JADX INFO: renamed from: a */
    public static void m6209a(String str, String str2) {
        synchronized (f13904a) {
            Log.d(str, m6215g(str2, null));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m6210b(String str, String str2) {
        synchronized (f13904a) {
            Log.i(str, m6215g(str2, null));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m6211c(String str, String str2) {
        synchronized (f13904a) {
            Log.w(str, m6215g(str2, null));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m6212d(String str, String str2, Throwable th) {
        synchronized (f13904a) {
            Log.w(str, m6215g(str2, th));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m6213e(String str, String str2) {
        synchronized (f13904a) {
            Log.e(str, m6215g(str2, null));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m6214f(String str, String str2, Throwable th) {
        synchronized (f13904a) {
            Log.e(str, m6215g(str2, th));
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m6215g(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (f13904a) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        String strReplace2 = strReplace.replace("\n", "\n  ");
        int length = String.valueOf(str).length();
        return AbstractC1456a.m2451r(new StringBuilder(String.valueOf(strReplace2).length() + length + 3 + 1), str, "\n  ", strReplace2, "\n");
    }
}
