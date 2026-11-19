package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class zacr extends com.google.android.gms.internal.base.zao {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            throw null;
        }
        if (i2 == 1) {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
            throw runtimeException;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 59);
        sb.append("TransformationResultHandler received unknown message type: ");
        sb.append(i2);
        Log.e("TransformedResultImpl", sb.toString());
    }
}
