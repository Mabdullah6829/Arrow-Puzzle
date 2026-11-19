package com.google.android.gms.internal.measurement;

import android.os.Process;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzqg implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzqi f22769s;

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        if (((Boolean) ((zzqh) this.f22769s.f22774c).get()).booleanValue()) {
            Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
    }
}
