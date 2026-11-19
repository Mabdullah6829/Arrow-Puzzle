package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgd implements zzao {

    /* JADX INFO: renamed from: a */
    public final long f17007a;

    /* JADX INFO: renamed from: b */
    public final long f17008b;

    /* JADX INFO: renamed from: c */
    public final long f17009c;

    public zzgd(long j2, long j3, long j4) {
        this.f17007a = j2;
        this.f17008b = j3;
        this.f17009c = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgd)) {
            return false;
        }
        zzgd zzgdVar = (zzgd) obj;
        return this.f17007a == zzgdVar.f17007a && this.f17008b == zzgdVar.f17008b && this.f17009c == zzgdVar.f17009c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17009c) + ((Long.hashCode(this.f17008b) + ((Long.hashCode(this.f17007a) + 527) * 31)) * 31);
    }

    public final String toString() {
        long j2 = this.f17007a;
        int length = String.valueOf(j2).length();
        long j3 = this.f17008b;
        int length2 = String.valueOf(j3).length();
        long j4 = this.f17009c;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j4).length());
        AbstractC1456a.m2456w(sb, "Mp4Timestamp: creation time=", j2, ", modification time=");
        sb.append(j3);
        sb.append(", timescale=");
        sb.append(j4);
        return sb.toString();
    }
}
