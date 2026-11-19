package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzeav extends zzeaz {

    /* JADX INFO: renamed from: a */
    public final long f13483a;

    /* JADX INFO: renamed from: b */
    public final int f13484b;

    public /* synthetic */ zzeav(long j2, int i2) {
        this.f13483a = j2;
        this.f13484b = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzeaz
    /* JADX INFO: renamed from: a */
    public final long mo6137a() {
        return this.f13483a;
    }

    @Override // com.google.android.gms.internal.ads.zzeaz
    /* JADX INFO: renamed from: b */
    public final int mo6138b() {
        return this.f13484b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzeaz)) {
            return false;
        }
        zzeaz zzeazVar = (zzeaz) obj;
        return this.f13483a == zzeazVar.mo6137a() && this.f13484b == zzeazVar.mo6138b();
    }

    public final int hashCode() {
        long j2 = this.f13483a;
        return ((((int) ((j2 >>> 32) ^ j2)) ^ 1000003) * 1000003) ^ this.f13484b;
    }

    public final String toString() {
        long j2 = this.f13483a;
        int length = String.valueOf(j2).length();
        int i2 = this.f13484b;
        StringBuilder sb = new StringBuilder(length + 34 + String.valueOf(i2).length() + 1);
        AbstractC1456a.m2456w(sb, "OnDeviceStorageKey{id=", j2, ", eventType=");
        return AbstractC0271e0.m402j(sb, "}", i2);
    }
}
