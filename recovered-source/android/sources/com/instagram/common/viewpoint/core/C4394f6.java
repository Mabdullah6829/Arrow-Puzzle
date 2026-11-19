package com.instagram.common.viewpoint.core;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4394f6 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C21203r A00;

    public C4394f6(C21203r c21203r) {
        this.A00 = c21203r;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i2) {
        new Handler(Looper.getMainLooper()).post(new C2714Dl(this, i2));
    }
}
