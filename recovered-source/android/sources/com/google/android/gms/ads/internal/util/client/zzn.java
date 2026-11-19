package com.google.android.gms.ads.internal.util.client;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes.dex */
final class zzn extends zzx {

    /* JADX INFO: renamed from: a */
    public final int f3433a;

    /* JADX INFO: renamed from: b */
    public final int f3434b;

    /* JADX INFO: renamed from: c */
    public final double f3435c;

    /* JADX INFO: renamed from: d */
    public final boolean f3436d;

    public zzn(int i2, int i3, double d, boolean z) {
        this.f3433a = i2;
        this.f3434b = i3;
        this.f3435c = d;
        this.f3436d = z;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    /* JADX INFO: renamed from: a */
    public final int mo3064a() {
        return this.f3433a;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    /* JADX INFO: renamed from: b */
    public final int mo3065b() {
        return this.f3434b;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    /* JADX INFO: renamed from: c */
    public final double mo3066c() {
        return this.f3435c;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    /* JADX INFO: renamed from: d */
    public final boolean mo3067d() {
        return this.f3436d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzx)) {
            return false;
        }
        zzx zzxVar = (zzx) obj;
        return this.f3433a == zzxVar.mo3064a() && this.f3434b == zzxVar.mo3065b() && Double.doubleToLongBits(this.f3435c) == Double.doubleToLongBits(zzxVar.mo3066c()) && this.f3436d == zzxVar.mo3067d();
    }

    public final int hashCode() {
        double d = this.f3435c;
        return ((((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32))) ^ ((((this.f3433a ^ 1000003) * 1000003) ^ this.f3434b) * 1000003)) * 1000003) ^ (true != this.f3436d ? 1237 : 1231);
    }

    public final String toString() {
        int i2 = this.f3433a;
        int length = String.valueOf(i2).length();
        int i3 = this.f3434b;
        int length2 = String.valueOf(i3).length();
        double d = this.f3435c;
        int length3 = String.valueOf(d).length();
        boolean z = this.f3436d;
        StringBuilder sb = new StringBuilder(length + 44 + length2 + 20 + length3 + 25 + String.valueOf(z).length() + 1);
        AbstractC1456a.m2455v(sb, "PingStrategy{maxAttempts=", i2, ", initialBackoffMs=", i3);
        sb.append(", backoffMultiplier=");
        sb.append(d);
        sb.append(", bufferAfterMaxAttempts=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
