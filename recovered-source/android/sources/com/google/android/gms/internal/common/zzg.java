package com.google.android.gms.internal.common;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class zzg extends Handler {
    public zzg() {
        Looper.getMainLooper();
    }

    public zzg(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
