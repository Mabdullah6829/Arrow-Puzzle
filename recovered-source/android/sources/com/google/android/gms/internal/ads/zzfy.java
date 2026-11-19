package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfy implements zzao {

    /* JADX INFO: renamed from: a */
    public final int f16793a;

    public zzfy(int i2) {
        this.f16793a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzfy) && this.f16793a == ((zzfy) obj).f16793a;
    }

    public final int hashCode() {
        return this.f16793a;
    }

    public final String toString() {
        int i2 = this.f16793a;
        return AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 19), "Mp4AlternateGroup: ", i2);
    }
}
