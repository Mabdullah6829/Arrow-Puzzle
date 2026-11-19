package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzgso implements zzguj {
    @Override // com.google.android.gms.internal.ads.zzguj
    public final /* synthetic */ Object zza() {
        HandlerThread handlerThread = new HandlerThread("OverlayDisplayService", 10);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }
}
