package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzt {

    /* JADX INFO: renamed from: a */
    public final long f21496a;

    /* JADX INFO: renamed from: b */
    public final long f21497b;

    public zzzt(long j2, long j3) {
        this.f21496a = j2;
        this.f21497b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzzt)) {
            return false;
        }
        zzzt zzztVar = (zzzt) obj;
        return this.f21496a == zzztVar.f21496a && this.f21497b == zzztVar.f21497b;
    }

    public final int hashCode() {
        return (((int) this.f21496a) * 31) + ((int) this.f21497b);
    }
}
