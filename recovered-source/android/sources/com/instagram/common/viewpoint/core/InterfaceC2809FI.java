package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.instagram.common.viewpoint.core.InterfaceC2812FL;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.FI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC2809FI<T extends InterfaceC2812FL> {
    void AEc(T t, long j2, long j3, boolean z);

    void AEe(T t, long j2, long j3);

    C2810FJ AEf(T t, long j2, long j3, IOException iOException, int i2);

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "For Media3 Migration Backward Compatibility")
    void AEi(T t, long j2, long j3, int i2);
}
