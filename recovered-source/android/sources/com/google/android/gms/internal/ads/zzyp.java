package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzyp {

    /* JADX INFO: renamed from: a */
    public final int f21355a;

    /* JADX INFO: renamed from: b */
    public final boolean f21356b;

    public zzyp(int i2, boolean z) {
        this.f21355a = i2;
        this.f21356b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzyp.class != obj.getClass()) {
            return false;
        }
        zzyp zzypVar = (zzyp) obj;
        return this.f21355a == zzypVar.f21355a && this.f21356b == zzypVar.f21356b;
    }

    public final int hashCode() {
        return (this.f21355a * 31) + (this.f21356b ? 1 : 0);
    }
}
