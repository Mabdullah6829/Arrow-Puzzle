package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oo */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC4973oo extends InterfaceC23537c {
    void A5x();

    void A6L(C23697s c23697s, C5064qI[] c5064qIArr, InterfaceC2696DT interfaceC2696DT, long j2, boolean z, boolean z2, long j3, long j4) throws C2496AD;

    InterfaceC23667p A7D();

    InterfaceC232378 A8T();

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D18870411: Adding start stall debug reason")
    EnumC4623ir A99();

    int A9A();

    InterfaceC2696DT A9D();

    int A9N();

    boolean A9p();

    void AA9(int i2, C24018O c24018o);

    boolean AAN();

    boolean AAP();

    boolean AAe();

    void ACU() throws IOException;

    void AIX(long j2, long j3) throws C2496AD;

    void AIa(C5064qI[] c5064qIArr, InterfaceC2696DT interfaceC2696DT, long j2, long j3) throws C2496AD;

    void AIm(long j2) throws C2496AD;

    void AJN();

    String getName();

    void start() throws C2496AD;

    void stop();
}
