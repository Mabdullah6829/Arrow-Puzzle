package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4856mt implements InterfaceC2953Hd {
    public final byte[] A00 = new byte[4096];

    @Override // com.instagram.common.viewpoint.core.InterfaceC2953Hd
    public final /* synthetic */ int AIp(InterfaceC20482c interfaceC20482c, int i2, boolean z) {
        return AbstractC2950Ha.A00(this, interfaceC20482c, i2, z);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2953Hd
    public final /* synthetic */ void AIr(C21864v c21864v, int i2) {
        AbstractC2950Ha.A01(this, c21864v, i2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2953Hd
    public final void A6e(C5064qI c5064qI) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2953Hd
    public final int AIq(InterfaceC20482c interfaceC20482c, int i2, boolean z, int i3) throws IOException {
        int bytesSkipped = interfaceC20482c.read(this.A00, 0, Math.min(this.A00.length, i2));
        if (bytesSkipped == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return bytesSkipped;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2953Hd
    public final void AIs(C21864v c21864v, int i2, int i3) {
        c21864v.A0g(i2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2953Hd
    public final void AIu(long j2, int i2, int i3, int i4, C2951Hb c2951Hb) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2953Hd
    @MetaExoPlayerCustomization("New API added for Meta")
    public final void AKf(Uri uri) {
    }
}
