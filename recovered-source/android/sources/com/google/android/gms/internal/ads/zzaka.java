package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaka implements zzao {

    /* JADX INFO: renamed from: a */
    public final ArrayList f5579a;

    public zzaka(ArrayList arrayList) {
        this.f5579a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j2 = ((zzajz) arrayList.get(0)).f5571b;
            for (int i2 = 1; i2 < arrayList.size(); i2++) {
                if (((zzajz) arrayList.get(i2)).f5570a < j2) {
                    z = true;
                    break;
                }
                j2 = ((zzajz) arrayList.get(i2)).f5571b;
            }
        }
        zzgtr.m7128a(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzaka.class != obj.getClass()) {
            return false;
        }
        return this.f5579a.equals(((zzaka) obj).f5579a);
    }

    public final int hashCode() {
        return this.f5579a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.f5579a.toString());
    }
}
