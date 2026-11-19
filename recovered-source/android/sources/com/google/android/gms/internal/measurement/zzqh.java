package com.google.android.gms.internal.measurement;

import android.app.ActivityManager;
import android.util.Log;
import p001B.InterfaceC0097w;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzqh implements InterfaceC0097w {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ zzqh f22770s = new zzqh();

    private /* synthetic */ zzqh() {
    }

    @Override // p001B.InterfaceC0097w
    public final /* synthetic */ Object get() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        boolean z = false;
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            int i2 = runningAppProcessInfo.importance;
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 17);
            sb.append("Memory state is: ");
            sb.append(i2);
            Log.i("PhenotypeProcessReaper", sb.toString());
            if (runningAppProcessInfo.importance >= 400) {
                z = true;
            }
        } catch (RuntimeException e) {
            Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e);
        }
        return new Boolean(z);
    }
}
