package com.google.android.gms.internal.appset;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.util.DefaultClock;

/* JADX INFO: loaded from: classes2.dex */
final class zzj implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzl f21533s;

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f21533s.f21535a;
        long j2 = zzl.m9073b(context).getLong("app_set_id_last_used_time", -1L);
        long j3 = j2 != -1 ? j2 + 33696000000L : -1L;
        if (j3 != -1) {
            DefaultClock.f4636a.getClass();
            if (System.currentTimeMillis() > j3) {
                if (!zzl.m9073b(context).edit().remove("app_set_id").commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", strValueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(strValueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String strValueOf2 = String.valueOf(context.getPackageName());
                Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(strValueOf2) : new String("Failed to clear app set ID last used time for App "));
            }
        }
    }
}
