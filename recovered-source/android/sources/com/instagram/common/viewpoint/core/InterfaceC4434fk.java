package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fk */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC4434fk {
    void A9d();

    boolean A9q();

    boolean A9r();

    boolean AAc();

    void AGr(boolean z, int i2);

    void AK1(int i2);

    void AK6(EnumC4381et enumC4381et, int i2);

    void AKF(int i2);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    EnumC4381et getStartReason();

    EnumC4436fm getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i2);

    void setBackgroundPlaybackEnabled(boolean z);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z);

    void setRequestedVolume(float f2);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(InterfaceC4437fn interfaceC4437fn);

    void setup(Uri uri);
}
