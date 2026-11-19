package com.instagram.common.viewpoint.core;

import android.media.AudioDeviceInfo;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8z */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC24348z {
    void A59(C5064qI c5064qI, int i2, int[] iArr) throws C24298s;

    void A5z();

    void A6M();

    void A6T();

    long A7f(boolean z);

    C5043px A8m();

    boolean A9e(ByteBuffer byteBuffer, long j2, int i2) throws C24338y, C24308t;

    void A9h();

    boolean A9o();

    boolean AAP();

    void AH0();

    void AH2() throws C24338y;

    void AJG(C5070qQ c5070qQ);

    void AJH(int i2);

    void AJI(C201121 c201121);

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Enable Retry Audio Track")
    void AJQ(boolean z);

    void AJV(InterfaceC24318v interfaceC24318v);

    void AJd(C5043px c5043px);

    void AJg(C24018O c24018o);

    void AJi(AudioDeviceInfo audioDeviceInfo);

    void AJo(boolean z);

    boolean AKN(C5064qI c5064qI);

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old API that can be removed when we move to MediaCodecRenderer2")
    boolean AKP(int i2, int i3);

    void flush();

    void pause();

    void setVolume(float f2);
}
