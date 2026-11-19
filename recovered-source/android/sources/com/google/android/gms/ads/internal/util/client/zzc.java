package com.google.android.gms.ads.internal.util.client;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class zzc extends Thread {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Context f3405s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ String f3406t;

    public zzc(zzf zzfVar, Context context, String str) {
        this.f3405s = context;
        this.f3406t = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzu(this.f3405s, null).m3081a(null, this.f3406t);
    }
}
