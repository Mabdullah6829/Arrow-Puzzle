package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzakj implements Comparable {

    /* JADX INFO: renamed from: s */
    public final long f5603s;

    /* JADX INFO: renamed from: t */
    public final long f5604t;

    /* JADX INFO: renamed from: u */
    public final long f5605u;

    public /* synthetic */ zzakj(long j2, long j3, long j4) {
        this.f5603s = j2;
        this.f5604t = j3;
        this.f5605u = j4;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f5603s, ((zzakj) obj).f5603s);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzakj)) {
            return false;
        }
        zzakj zzakjVar = (zzakj) obj;
        return this.f5603s == zzakjVar.f5603s && this.f5604t == zzakjVar.f5604t && this.f5605u == zzakjVar.f5605u;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f5603s), Long.valueOf(this.f5604t), Long.valueOf(this.f5605u));
    }
}
