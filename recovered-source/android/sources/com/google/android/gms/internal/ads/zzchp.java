package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
final class zzchp implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
