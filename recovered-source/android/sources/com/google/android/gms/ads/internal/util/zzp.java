package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class zzp extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (com.google.android.gms.ads.internal.util.client.zzl.f3424b) {
            com.google.android.gms.ads.internal.util.client.zzl.f3425c = false;
            com.google.android.gms.ads.internal.util.client.zzl.f3426d = false;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Ad debug logging enablement is out of date.");
        }
        zzd.m3149a(context);
    }
}
