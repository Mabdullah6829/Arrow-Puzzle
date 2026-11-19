package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajz {

    /* JADX INFO: renamed from: a */
    public final long f5570a;

    /* JADX INFO: renamed from: b */
    public final long f5571b;

    /* JADX INFO: renamed from: c */
    public final int f5572c;

    public zzajz(long j2, long j3, int i2) {
        zzgtr.m7128a(j2 < j3);
        this.f5570a = j2;
        this.f5571b = j3;
        this.f5572c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajz.class == obj.getClass()) {
            zzajz zzajzVar = (zzajz) obj;
            if (this.f5570a == zzajzVar.f5570a && this.f5571b == zzajzVar.f5571b && this.f5572c == zzajzVar.f5572c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f5570a), Long.valueOf(this.f5571b), Integer.valueOf(this.f5572c));
    }

    public final String toString() {
        String str = zzfm.f16091a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f5570a + ", endTimeMs=" + this.f5571b + ", speedDivisor=" + this.f5572c;
    }
}
