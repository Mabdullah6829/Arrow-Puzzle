package com.instagram.common.viewpoint.core;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.o7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4930o7 implements InterfaceC2579BY {
    public MediaCodecInfo[] A00;
    public final int A01;

    public C4930o7(boolean z, boolean z2) {
        int i2;
        if (z || z2) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        this.A01 = i2;
    }

    @EnsuresNonNull({"mediaCodecInfos"})
    private void A00() {
        if (this.A00 == null) {
            this.A00 = new MediaCodecList(this.A01).getCodecInfos();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2579BY
    public final int A7P() {
        A00();
        return this.A00.length;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2579BY
    public final MediaCodecInfo A7Q(int i2) {
        A00();
        return this.A00[i2];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2579BY
    public final boolean AAR(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2579BY
    public final boolean AAS(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2579BY
    public final boolean AJ4() {
        return true;
    }
}
