package com.google.android.gms.internal.ads;

import androidx.core.app.FrameMetricsAggregator;
import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzakv {

    /* JADX INFO: renamed from: a */
    public final int f5769a;

    /* JADX INFO: renamed from: b */
    public final int f5770b;

    /* JADX INFO: renamed from: c */
    public final float f5771c;

    public zzakv(int i2, int i3, float f2) {
        this.f5769a = i2;
        this.f5770b = i3;
        this.f5771c = f2;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ zzakv m4187a(int i2) {
        int i3 = i2 >> 13;
        if (i3 == 0) {
            return null;
        }
        return new zzakv(i3, (i2 >> 10) & 7, ((i2 & FrameMetricsAggregator.EVERY_DURATION) * ((i2 & 512) != 0 ? -1 : 1)) / 10.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzakv)) {
            return false;
        }
        zzakv zzakvVar = (zzakv) obj;
        return this.f5769a == zzakvVar.f5769a && this.f5770b == zzakvVar.f5770b && Float.compare(this.f5771c, zzakvVar.f5771c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5771c) + (((this.f5769a * 31) + this.f5770b) * 31);
    }

    public final String toString() {
        int i2 = this.f5769a;
        int length = String.valueOf(i2).length();
        int i3 = this.f5770b;
        int length2 = String.valueOf(i3).length();
        float f2 = this.f5771c;
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2437d(length, 28, length2, 7, String.valueOf(f2).length()) + 1);
        AbstractC1456a.m2455v(sb, "GainField{name=", i2, ", originator=", i3);
        sb.append(", gain=");
        sb.append(f2);
        sb.append("}");
        return sb.toString();
    }
}
