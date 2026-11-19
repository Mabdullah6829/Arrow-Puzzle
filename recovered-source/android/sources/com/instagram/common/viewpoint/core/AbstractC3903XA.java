package com.instagram.common.viewpoint.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.XA */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3903XA {
    public static Intent A00(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
