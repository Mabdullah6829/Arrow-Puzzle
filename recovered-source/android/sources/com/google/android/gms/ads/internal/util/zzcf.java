package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzcf extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzcg f3559a;

    public zzcf(zzcg zzcgVar) {
        this.f3559a = zzcgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzcg zzcgVar = this.f3559a;
        synchronized (zzcgVar) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : zzcgVar.f3561b.entrySet()) {
                    if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                        arrayList.add((BroadcastReceiver) entry.getKey());
                    }
                }
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((BroadcastReceiver) arrayList.get(i2)).onReceive(context, intent);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
