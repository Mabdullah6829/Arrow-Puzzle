package com.google.android.gms.internal.ads;

import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
final class zzcnh extends Thread {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Runnable f10593s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzcni f10594t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcnh(zzcni zzcniVar, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.f10593s = runnable2;
        this.f10594t = zzcniVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f10594t.f10596t);
        this.f10593s.run();
    }
}
