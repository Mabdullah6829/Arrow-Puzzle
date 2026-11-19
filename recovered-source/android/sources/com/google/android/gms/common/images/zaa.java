package com.google.android.gms.common.images;

import android.os.Looper;
import android.util.Log;
import java.util.concurrent.CountDownLatch;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
final class zaa implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            new CountDownLatch(1);
            throw null;
        }
        String strValueOf = String.valueOf(Thread.currentThread());
        String strValueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 55 + 1);
        AbstractC0271e0.m413u(sb, "checkNotMainThread: current thread ", strValueOf, " IS the main thread ", strValueOf2);
        sb.append("!");
        Log.e("Asserts", sb.toString());
        throw new IllegalStateException("LoadBitmapFromDiskRunnable can't be executed in the main thread");
    }
}
