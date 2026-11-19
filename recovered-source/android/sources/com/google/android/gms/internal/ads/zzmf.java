package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzmf {

    /* JADX INFO: renamed from: a */
    public final zzxl f20382a;

    /* JADX INFO: renamed from: b */
    public final long f20383b;

    /* JADX INFO: renamed from: c */
    public final long f20384c;

    /* JADX INFO: renamed from: d */
    public final long f20385d;

    /* JADX INFO: renamed from: e */
    public final long f20386e;

    /* JADX INFO: renamed from: f */
    public final boolean f20387f;

    /* JADX INFO: renamed from: g */
    public final boolean f20388g;

    /* JADX INFO: renamed from: h */
    public final boolean f20389h;

    public zzmf(zzxl zzxlVar, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3) {
        zzgtr.m7128a(!z3 || z);
        zzgtr.m7128a(!z2 || z);
        this.f20382a = zzxlVar;
        this.f20383b = j2;
        this.f20384c = j3;
        this.f20385d = j4;
        this.f20386e = j5;
        this.f20387f = z;
        this.f20388g = z2;
        this.f20389h = z3;
    }

    /* JADX INFO: renamed from: a */
    public final zzmf m8704a(long j2, long j3) {
        return (j2 == this.f20383b && j3 == this.f20384c) ? this : new zzmf(this.f20382a, j2, j3, this.f20385d, this.f20386e, this.f20387f, this.f20388g, this.f20389h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmf.class == obj.getClass()) {
            zzmf zzmfVar = (zzmf) obj;
            if (this.f20383b == zzmfVar.f20383b && this.f20385d == zzmfVar.f20385d && this.f20386e == zzmfVar.f20386e && this.f20387f == zzmfVar.f20387f && this.f20388g == zzmfVar.f20388g && this.f20389h == zzmfVar.f20389h && Objects.equals(this.f20382a, zzmfVar.f20382a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.f20382a.hashCode() + 527) * 31) + ((int) this.f20383b)) * 31) + ((int) this.f20385d)) * 31) + ((int) this.f20386e)) * 961) + (this.f20387f ? 1 : 0)) * 31) + (this.f20388g ? 1 : 0)) * 31) + (this.f20389h ? 1 : 0);
    }
}
