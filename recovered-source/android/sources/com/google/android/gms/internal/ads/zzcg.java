package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
final class zzcg implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final Handler f9955a;

    /* JADX INFO: renamed from: b */
    public final AudioManager.OnAudioFocusChangeListener f9956b;

    public zzcg(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f9956b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = zzfm.f16091a;
        this.f9955a = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i2) {
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f9855s.f9956b.onAudioFocusChange(i2);
            }
        };
        String str = zzfm.f16091a;
        Handler handler = this.f9955a;
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }
}
