package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahe {

    /* JADX INFO: renamed from: c */
    public static final zzahe f5308c = new zzahe(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f5309a;

    /* JADX INFO: renamed from: b */
    public final long f5310b;

    public zzahe(long j2, long j3) {
        this.f5309a = j2;
        this.f5310b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahe.class == obj.getClass()) {
            zzahe zzaheVar = (zzahe) obj;
            if (this.f5309a == zzaheVar.f5309a && this.f5310b == zzaheVar.f5310b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f5309a) * 31) + ((int) this.f5310b);
    }

    public final String toString() {
        long j2 = this.f5309a;
        int length = String.valueOf(j2).length();
        long j3 = this.f5310b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(j3).length() + 1);
        AbstractC1456a.m2456w(sb, "[timeUs=", j2, ", position=");
        sb.append(j3);
        sb.append("]");
        return sb.toString();
    }
}
