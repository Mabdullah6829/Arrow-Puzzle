package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public final class Asserts {
    private Asserts() {
        throw new AssertionError("Uninstantiable");
    }

    /* JADX INFO: renamed from: a */
    public static void m3528a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        String strValueOf = String.valueOf(Thread.currentThread());
        String strValueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 56 + 1);
        AbstractC0271e0.m413u(sb, "checkMainThread: current thread ", strValueOf, " IS NOT the main thread ", strValueOf2);
        sb.append("!");
        Log.e("Asserts", sb.toString());
        throw new IllegalStateException(str);
    }
}
