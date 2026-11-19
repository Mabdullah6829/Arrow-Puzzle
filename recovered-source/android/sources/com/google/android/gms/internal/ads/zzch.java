package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzch {

    /* JADX INFO: renamed from: a */
    public final AudioManager.OnAudioFocusChangeListener f10001a;

    /* JADX INFO: renamed from: b */
    public final Handler f10002b;

    /* JADX INFO: renamed from: c */
    public final zzd f10003c;

    /* JADX INFO: renamed from: d */
    public final Object f10004d;

    public zzch(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, zzd zzdVar, boolean z) {
        this.f10002b = handler;
        this.f10003c = zzdVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            this.f10001a = new zzcg(onAudioFocusChangeListener, handler);
        } else {
            this.f10001a = onAudioFocusChangeListener;
        }
        this.f10004d = i2 >= 26 ? AbstractC5149c.m3733e().setAudioAttributes(zzdVar.m5884a()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z).build() : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzch)) {
            return false;
        }
        zzch zzchVar = (zzch) obj;
        zzchVar.getClass();
        return Objects.equals(this.f10001a, zzchVar.f10001a) && Objects.equals(this.f10002b, zzchVar.f10002b) && Objects.equals(this.f10003c, zzchVar.f10003c);
    }

    public final int hashCode() {
        return Objects.hash(1, this.f10001a, this.f10002b, this.f10003c, Boolean.FALSE);
    }
}
