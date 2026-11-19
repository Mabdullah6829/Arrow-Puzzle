package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class zzd {

    /* JADX INFO: renamed from: b */
    public static final zzd f11854b = new zzd();

    /* JADX INFO: renamed from: a */
    public AudioAttributes f11855a;

    static {
        String str = zzfm.f16091a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    /* JADX INFO: renamed from: a */
    public final AudioAttributes m5884a() {
        if (this.f11855a == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                usage.setAllowedCapturePolicy(1);
                usage.setHapticChannelsMuted(true);
            }
            if (i2 >= 32) {
                usage.setSpatializationBehavior(0);
                usage.setIsContentSpatialized(false);
            }
            this.f11855a = usage.build();
        }
        return this.f11855a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzd.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -436042064;
    }
}
