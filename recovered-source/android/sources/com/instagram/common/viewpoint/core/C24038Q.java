package com.instagram.common.viewpoint.core;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8Q */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C24038Q {
    public static final AudioAttributes A00 = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int A00(int i2, int i3) {
        for (int i4 = 8; i4 > 0; i4--) {
            AudioFormat.Builder sampleRate = new AudioFormat.Builder().setEncoding(i2).setSampleRate(i3);
            int channelCount = AbstractC22035C.A01(i4);
            AudioFormat audioFormat = sampleRate.setChannelMask(channelCount).build();
            if (AudioTrack.isDirectPlaybackSupported(audioFormat, A00)) {
                return i4;
            }
        }
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    public static int[] A01() {
        C20302K c20302kA01 = AbstractC2570BP.A01();
        AbstractC21414C it = C24048R.A06.keySet().iterator();
        while (it.hasNext()) {
            int encoding = ((Integer) it.next()).intValue();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(encoding).setSampleRate(48000).build(), A00)) {
                c20302kA01.A04(Integer.valueOf(encoding));
            }
        }
        c20302kA01.A04(2);
        return AbstractC2537As.A0B(c20302kA01.A05());
    }
}
