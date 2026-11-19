package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public class zzgax extends Handler {
    public zzgax() {
        Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: a */
    public void mo3153a(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        mo3153a(message);
    }

    public zzgax(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
