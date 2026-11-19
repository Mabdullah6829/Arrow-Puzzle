package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes.dex */
public final class zan implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 != 1) {
            Log.wtf("GmsClientEvents", AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 34), "Don't know how to handle message: ", i2), new Exception());
            return false;
        }
        throw null;
    }
}
