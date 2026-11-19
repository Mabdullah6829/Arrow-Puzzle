package com.google.android.gms.internal.ads;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzav {

    /* JADX INFO: renamed from: d */
    public static final zzav f6969d = new zzav(1.0f, 1.0f);

    /* JADX INFO: renamed from: a */
    public final float f6970a;

    /* JADX INFO: renamed from: b */
    public final float f6971b;

    /* JADX INFO: renamed from: c */
    public final int f6972c;

    static {
        String str = zzfm.f16091a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzav(float f2, float f3) {
        zzgtr.m7128a(f2 > 0.0f);
        zzgtr.m7128a(f3 > 0.0f);
        this.f6970a = f2;
        this.f6971b = f3;
        this.f6972c = Math.round(f2 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzav.class == obj.getClass()) {
            zzav zzavVar = (zzav) obj;
            if (this.f6970a == zzavVar.f6970a && this.f6971b == zzavVar.f6971b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f6971b) + ((Float.floatToRawIntBits(this.f6970a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f6970a), Float.valueOf(this.f6971b)};
        String str = zzfm.f16091a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
