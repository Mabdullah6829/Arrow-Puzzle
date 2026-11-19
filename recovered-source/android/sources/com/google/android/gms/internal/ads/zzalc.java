package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzalc implements zzahh {

    /* JADX INFO: renamed from: a */
    public final int f5791a;

    /* JADX INFO: renamed from: b */
    public final long f5792b;

    /* JADX INFO: renamed from: c */
    public final int f5793c;

    public zzalc(long j2, int i2, int i3) {
        this.f5791a = i2;
        this.f5792b = j2;
        this.f5793c = i3;
    }

    public final String toString() {
        String strM6499a = zzfm.m6499a(this.f5791a);
        int length = strM6499a.length();
        long j2 = this.f5792b;
        int length2 = String.valueOf(j2).length();
        int i2 = this.f5793c;
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2437d(length, 29, length2, 16, String.valueOf(i2).length()) + 1);
        sb.append("AtomSizeTooSmall{type=");
        sb.append(strM6499a);
        sb.append(", size=");
        sb.append(j2);
        sb.append(", minHeaderSize=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
