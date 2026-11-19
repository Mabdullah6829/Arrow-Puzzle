package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmc {

    /* JADX INFO: renamed from: a */
    public final long f20363a;

    /* JADX INFO: renamed from: b */
    public final float f20364b;

    /* JADX INFO: renamed from: c */
    public final long f20365c;

    public /* synthetic */ zzmc(zzmb zzmbVar) {
        this.f20363a = zzmbVar.f20360a;
        this.f20364b = zzmbVar.f20361b;
        this.f20365c = zzmbVar.f20362c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmc)) {
            return false;
        }
        zzmc zzmcVar = (zzmc) obj;
        return this.f20363a == zzmcVar.f20363a && this.f20364b == zzmcVar.f20364b && this.f20365c == zzmcVar.f20365c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f20363a), Float.valueOf(this.f20364b), Long.valueOf(this.f20365c));
    }
}
