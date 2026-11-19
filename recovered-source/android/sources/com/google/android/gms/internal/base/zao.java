package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class zao extends Handler {
    public zao() {
        Looper.getMainLooper();
    }

    public zao(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
