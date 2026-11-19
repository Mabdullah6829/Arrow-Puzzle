package com.instagram.common.viewpoint.core;

import android.media.AudioAttributes;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1z */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C20091z {
    public final AudioAttributes A00;

    public C20091z(C5070qQ c5070qQ) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c5070qQ.A02).setFlags(c5070qQ.A03).setUsage(c5070qQ.A05);
        if (AbstractC22035C.A02 >= 29) {
            C20071x.A00(usage, c5070qQ.A01);
        }
        if (AbstractC22035C.A02 >= 32) {
            C20081y.A00(usage, c5070qQ.A04);
        }
        this.A00 = usage.build();
    }
}
