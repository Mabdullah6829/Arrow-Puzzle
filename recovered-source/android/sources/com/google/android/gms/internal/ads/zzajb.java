package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajb implements zzao {

    /* JADX INFO: renamed from: a */
    public final long f5504a;

    /* JADX INFO: renamed from: b */
    public final long f5505b;

    /* JADX INFO: renamed from: c */
    public final long f5506c;

    /* JADX INFO: renamed from: d */
    public final long f5507d;

    /* JADX INFO: renamed from: e */
    public final long f5508e;

    public zzajb(long j2, long j3, long j4, long j5, long j6) {
        this.f5504a = j2;
        this.f5505b = j3;
        this.f5506c = j4;
        this.f5507d = j5;
        this.f5508e = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajb.class == obj.getClass()) {
            zzajb zzajbVar = (zzajb) obj;
            if (this.f5504a == zzajbVar.f5504a && this.f5505b == zzajbVar.f5505b && this.f5506c == zzajbVar.f5506c && this.f5507d == zzajbVar.f5507d && this.f5508e == zzajbVar.f5508e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5508e) + ((Long.hashCode(this.f5507d) + ((Long.hashCode(this.f5506c) + ((Long.hashCode(this.f5505b) + ((Long.hashCode(this.f5504a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        long j2 = this.f5504a;
        int length = String.valueOf(j2).length();
        long j3 = this.f5505b;
        int length2 = String.valueOf(j3).length();
        long j4 = this.f5506c;
        int length3 = String.valueOf(j4).length();
        long j5 = this.f5507d;
        int length4 = String.valueOf(j5).length();
        long j6 = this.f5508e;
        StringBuilder sb = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j6).length());
        AbstractC1456a.m2456w(sb, "Motion photo metadata: photoStartPosition=", j2, ", photoSize=");
        sb.append(j3);
        AbstractC1456a.m2456w(sb, ", photoPresentationTimestampUs=", j4, ", videoStartPosition=");
        sb.append(j5);
        sb.append(", videoSize=");
        sb.append(j6);
        return sb.toString();
    }
}
