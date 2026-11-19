package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxl {

    /* JADX INFO: renamed from: a */
    public final Object f21278a;

    /* JADX INFO: renamed from: b */
    public final int f21279b;

    /* JADX INFO: renamed from: c */
    public final int f21280c;

    /* JADX INFO: renamed from: d */
    public final long f21281d;

    /* JADX INFO: renamed from: e */
    public final int f21282e;

    public zzxl(Object obj, int i2, int i3, long j2, int i4) {
        this.f21278a = obj;
        this.f21279b = i2;
        this.f21280c = i3;
        this.f21281d = j2;
        this.f21282e = i4;
    }

    /* JADX INFO: renamed from: a */
    public final zzxl m9024a(Object obj) {
        return this.f21278a.equals(obj) ? this : new zzxl(obj, this.f21279b, this.f21280c, this.f21281d, this.f21282e);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9025b() {
        return this.f21279b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzxl)) {
            return false;
        }
        zzxl zzxlVar = (zzxl) obj;
        return this.f21278a.equals(zzxlVar.f21278a) && this.f21279b == zzxlVar.f21279b && this.f21280c == zzxlVar.f21280c && this.f21281d == zzxlVar.f21281d && this.f21282e == zzxlVar.f21282e;
    }

    public final int hashCode() {
        return ((((((((this.f21278a.hashCode() + 527) * 31) + this.f21279b) * 31) + this.f21280c) * 31) + ((int) this.f21281d)) * 31) + this.f21282e;
    }

    public zzxl(long j2, Object obj) {
        this(obj, -1, -1, j2, -1);
    }

    public zzxl(Object obj, int i2, long j2) {
        this(obj, -1, -1, j2, i2);
    }
}
