package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class zabc extends com.google.android.gms.internal.base.zao {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            ((zabb) message.obj).getClass();
            throw null;
        }
        if (i2 == 2) {
            throw ((RuntimeException) message.obj);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 20);
        sb.append("Unknown message id: ");
        sb.append(i2);
        Log.w("GACStateManager", sb.toString());
    }
}
