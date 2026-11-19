package com.google.android.gms.internal.ads;

import android.os.Binder;

/* JADX INFO: loaded from: classes2.dex */
final class zzbrs implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzbrv f9303s;

    public zzbrs(zzbrv zzbrvVar) {
        this.f9303s = zzbrvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbrv zzbrvVar = this.f9303s;
        if (zzbrvVar.f9307a == null) {
            return;
        }
        zzbrvVar.f9307a.disconnect();
        Binder.flushPendingCommands();
    }
}
