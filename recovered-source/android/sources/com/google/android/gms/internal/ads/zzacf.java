package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacf {

    /* JADX INFO: renamed from: d */
    public static final zzabz f4895d = new zzabz(2, -9223372036854775807L);

    /* JADX INFO: renamed from: e */
    public static final zzabz f4896e = new zzabz(3, -9223372036854775807L);

    /* JADX INFO: renamed from: a */
    public final zzacl f4897a;

    /* JADX INFO: renamed from: b */
    public zzaca f4898b;

    /* JADX INFO: renamed from: c */
    public IOException f4899c;

    public zzacf() {
        String str = zzfm.f16091a;
        this.f4897a = new zzack(Executors.newSingleThreadExecutor(new zzfl("ExoPlayer:Loader:ProgressiveMediaPeriod")), new zzdu() { // from class: com.google.android.gms.internal.ads.zzaby
            @Override // com.google.android.gms.internal.ads.zzdu
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo3942b(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        });
    }
}
