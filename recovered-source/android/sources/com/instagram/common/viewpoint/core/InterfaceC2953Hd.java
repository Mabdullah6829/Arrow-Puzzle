package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hd */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC2953Hd {
    void A6e(C5064qI c5064qI);

    int AIp(InterfaceC20482c interfaceC20482c, int i2, boolean z) throws IOException;

    int AIq(InterfaceC20482c interfaceC20482c, int i2, boolean z, int i3) throws IOException;

    void AIr(C21864v c21864v, int i2);

    void AIs(C21864v c21864v, int i2, int i3);

    void AIu(long j2, int i2, int i3, int i4, C2951Hb c2951Hb);

    @MetaExoPlayerCustomization("New Meta API")
    void AKf(Uri uri);
}
