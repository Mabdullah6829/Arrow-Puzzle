package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajd implements zzao {

    /* JADX INFO: renamed from: a */
    public final long f5509a;

    public zzajd(long j2) {
        this.f5509a = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzajd.class == obj.getClass() && this.f5509a == ((zzajd) obj).f5509a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5509a) + 527;
    }

    public final String toString() {
        long j2 = this.f5509a;
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 38);
        sb.append("ThumbnailMetadata: presentationTimeUs=");
        sb.append(j2);
        return sb.toString();
    }
}
