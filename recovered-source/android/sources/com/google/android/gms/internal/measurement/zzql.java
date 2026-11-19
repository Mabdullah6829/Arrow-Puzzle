package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class zzql extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static volatile zzqk f22775a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            StringBuilder sb = new StringBuilder(stringExtra.length() + 68);
            sb.append("Got an invalid config package for P/H that includes '..': ");
            sb.append(stringExtra);
            sb.append(". Exiting.");
            Log.w("PhUpdateBroadcastRecv", sb.toString());
            return;
        }
        zzqk zzqkVar = f22775a;
        if (zzqkVar == null) {
            Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
            return;
        }
        zzoo zzooVar = (zzoo) ((zzoz) zzqkVar).f22715a.f22721a.get(stringExtra);
        if (zzooVar != null) {
            int i2 = zzpc.f22719a;
            zzooVar.f22702a.m10581b();
        }
    }
}
