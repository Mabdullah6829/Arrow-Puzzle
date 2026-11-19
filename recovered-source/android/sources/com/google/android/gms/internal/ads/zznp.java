package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zznp {

    /* JADX INFO: renamed from: a */
    public final long f20514a;

    /* JADX INFO: renamed from: b */
    public final zzbf f20515b;

    /* JADX INFO: renamed from: c */
    public final int f20516c;

    /* JADX INFO: renamed from: d */
    public final zzxl f20517d;

    /* JADX INFO: renamed from: e */
    public final long f20518e;

    /* JADX INFO: renamed from: f */
    public final zzbf f20519f;

    /* JADX INFO: renamed from: g */
    public final int f20520g;

    /* JADX INFO: renamed from: h */
    public final zzxl f20521h;

    /* JADX INFO: renamed from: i */
    public final long f20522i;

    /* JADX INFO: renamed from: j */
    public final long f20523j;

    public zznp(long j2, zzbf zzbfVar, int i2, zzxl zzxlVar, long j3, zzbf zzbfVar2, int i3, zzxl zzxlVar2, long j4, long j5) {
        this.f20514a = j2;
        this.f20515b = zzbfVar;
        this.f20516c = i2;
        this.f20517d = zzxlVar;
        this.f20518e = j3;
        this.f20519f = zzbfVar2;
        this.f20520g = i3;
        this.f20521h = zzxlVar2;
        this.f20522i = j4;
        this.f20523j = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zznp.class == obj.getClass()) {
            zznp zznpVar = (zznp) obj;
            if (this.f20514a == zznpVar.f20514a && this.f20516c == zznpVar.f20516c && this.f20518e == zznpVar.f20518e && this.f20520g == zznpVar.f20520g && this.f20522i == zznpVar.f20522i && this.f20523j == zznpVar.f20523j && Objects.equals(this.f20515b, zznpVar.f20515b) && Objects.equals(this.f20517d, zznpVar.f20517d) && Objects.equals(this.f20519f, zznpVar.f20519f) && Objects.equals(this.f20521h, zznpVar.f20521h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f20514a), this.f20515b, Integer.valueOf(this.f20516c), this.f20517d, Long.valueOf(this.f20518e), this.f20519f, Integer.valueOf(this.f20520g), this.f20521h, Long.valueOf(this.f20522i), Long.valueOf(this.f20523j));
    }
}
