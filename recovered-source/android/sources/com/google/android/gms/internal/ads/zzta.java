package com.google.android.gms.internal.ads;

import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(29)
final class zzta {

    /* JADX INFO: renamed from: a */
    public final Handler f20815a;

    /* JADX INFO: renamed from: b */
    public final AudioTrack$StreamEventCallback f20816b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zztb f20817c;

    public /* synthetic */ zzta(zztb zztbVar) {
        this.f20817c = zztbVar;
        final Handler handlerM6514p = zzfm.m6514p();
        this.f20815a = handlerM6514p;
        zzsy zzsyVar = new zzsy(this);
        this.f20816b = zzsyVar;
        zztbVar.f20821a.registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.zzsz
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                handlerM6514p.post(runnable);
            }
        }, zzsyVar);
    }
}
