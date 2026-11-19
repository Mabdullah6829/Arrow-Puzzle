package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfe extends IllegalStateException {

    /* JADX INFO: renamed from: s */
    public final int f15529s;

    /* JADX INFO: renamed from: t */
    public final int f15530t;

    public zzfe(int i2, int i3) {
        super(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? AbstractC1456a.m2448o(new StringBuilder(String.valueOf(i3).length() + 31), "Player stuck suppressed for ", i3, " ms") : AbstractC1456a.m2448o(new StringBuilder(String.valueOf(i3).length() + 43), "Player stuck playing without ending for ", i3, " ms") : AbstractC1456a.m2448o(new StringBuilder(String.valueOf(i3).length() + 45), "Player stuck playing with no progress for ", i3, " ms") : AbstractC1456a.m2448o(new StringBuilder(String.valueOf(i3).length() + 47), "Player stuck buffering with no progress for ", i3, " ms") : AbstractC1456a.m2448o(new StringBuilder(String.valueOf(i3).length() + 46), "Player stuck buffering and not loading for ", i3, " ms"));
        this.f15529s = i2;
        this.f15530t = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzfe.class != obj.getClass()) {
            return false;
        }
        zzfe zzfeVar = (zzfe) obj;
        return this.f15529s == zzfeVar.f15529s && this.f15530t == zzfeVar.f15530t;
    }

    public final int hashCode() {
        return ((this.f15529s + 527) * 31) + this.f15530t;
    }
}
