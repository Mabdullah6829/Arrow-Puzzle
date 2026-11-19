package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(32)
public final class zzaco {

    /* JADX INFO: renamed from: a */
    public final Spatializer f4917a;

    /* JADX INFO: renamed from: b */
    public final boolean f4918b;

    /* JADX INFO: renamed from: c */
    public final Handler f4919c;

    /* JADX INFO: renamed from: d */
    public final Spatializer$OnSpatializerStateChangedListener f4920d;

    public zzaco(Context context, Runnable runnable, Boolean bool) {
        AudioManager audioManagerM5503a = context == null ? null : zzcj.m5503a(context);
        if (audioManagerM5503a == null || (bool != null && bool.booleanValue())) {
            this.f4917a = null;
            this.f4918b = false;
            this.f4919c = null;
            this.f4920d = null;
            return;
        }
        Spatializer spatializer = audioManagerM5503a.getSpatializer();
        this.f4917a = spatializer;
        this.f4918b = spatializer.getImmersiveAudioLevel() != 0;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        final Handler handler = new Handler(looperMyLooper);
        this.f4919c = handler;
        zzacm zzacmVar = new zzacm(this, runnable);
        this.f4920d = zzacmVar;
        spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzacn
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable2) {
                handler.post(runnable2);
            }
        }, zzacmVar);
    }
}
