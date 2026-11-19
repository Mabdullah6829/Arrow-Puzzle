package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
final class zzekr extends TimerTask {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ AlertDialog f14102s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Timer f14103t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ com.google.android.gms.ads.internal.overlay.zzm f14104u;

    public zzekr(zzekz zzekzVar, AlertDialog alertDialog, Timer timer, com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.f14102s = alertDialog;
        this.f14103t = timer;
        this.f14104u = zzmVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f14102s.dismiss();
        this.f14103t.cancel();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.f14104u;
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }
}
