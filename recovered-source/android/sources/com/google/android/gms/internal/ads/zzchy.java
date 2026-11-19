package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes2.dex */
public final class zzchy implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final AudioManager f10114a;

    /* JADX INFO: renamed from: b */
    public final zzcha f10115b;

    /* JADX INFO: renamed from: c */
    public boolean f10116c;

    /* JADX INFO: renamed from: d */
    public boolean f10117d;

    /* JADX INFO: renamed from: e */
    public boolean f10118e;

    /* JADX INFO: renamed from: f */
    public float f10119f = 1.0f;

    public zzchy(Context context, zzcha zzchaVar) {
        this.f10114a = (AudioManager) context.getSystemService("audio");
        this.f10115b = zzchaVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m5485a() {
        boolean z = this.f10117d;
        zzcha zzchaVar = this.f10115b;
        AudioManager audioManager = this.f10114a;
        if (!z || this.f10118e || this.f10119f <= 0.0f) {
            if (this.f10116c) {
                if (audioManager != null) {
                    this.f10116c = audioManager.abandonAudioFocus(this) == 0;
                }
                zzchaVar.mo5408f();
                return;
            }
            return;
        }
        if (this.f10116c) {
            return;
        }
        if (audioManager != null) {
            this.f10116c = audioManager.requestAudioFocus(this, 3, 2) == 1;
        }
        zzchaVar.mo5408f();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i2) {
        this.f10116c = i2 > 0;
        this.f10115b.mo5408f();
    }
}
