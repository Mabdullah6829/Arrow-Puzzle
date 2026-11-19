package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class Logger {
    private int logLevel = 4;
    private final String tag;
    public static final String TAG = "FirebaseCrashlytics";
    static final Logger DEFAULT_LOGGER = new Logger(TAG);

    public Logger(String str) {
        this.tag = str;
    }

    private boolean canLog(int i2) {
        return this.logLevel <= i2 || Log.isLoggable(this.tag, i2);
    }

    public static Logger getLogger() {
        return DEFAULT_LOGGER;
    }

    /* JADX INFO: renamed from: d */
    public void m11168d(String str, Throwable th) {
        if (canLog(3)) {
            Log.d(this.tag, str, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m11170e(String str, Throwable th) {
        if (canLog(6)) {
            Log.e(this.tag, str, th);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m11172i(String str, Throwable th) {
        if (canLog(4)) {
            Log.i(this.tag, str, th);
        }
    }

    public void log(int i2, String str) {
        log(i2, str, false);
    }

    /* JADX INFO: renamed from: v */
    public void m11174v(String str, Throwable th) {
        if (canLog(2)) {
            Log.v(this.tag, str, th);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m11176w(String str, Throwable th) {
        if (canLog(5)) {
            Log.w(this.tag, str, th);
        }
    }

    public void log(int i2, String str, boolean z) {
        if (z || canLog(i2)) {
            Log.println(i2, this.tag, str);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m11167d(String str) {
        m11168d(str, null);
    }

    /* JADX INFO: renamed from: e */
    public void m11169e(String str) {
        m11170e(str, null);
    }

    /* JADX INFO: renamed from: i */
    public void m11171i(String str) {
        m11172i(str, null);
    }

    /* JADX INFO: renamed from: v */
    public void m11173v(String str) {
        m11174v(str, null);
    }

    /* JADX INFO: renamed from: w */
    public void m11175w(String str) {
        m11176w(str, null);
    }
}
