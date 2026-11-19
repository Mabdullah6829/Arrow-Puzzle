package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class zznk {

    /* JADX INFO: renamed from: b */
    public static final zznk f20504b;

    /* JADX INFO: renamed from: c */
    public static final zznk f20505c;

    /* JADX INFO: renamed from: a */
    public final long f20506a;

    static {
        zznk zznkVar = new zznk(0L);
        f20504b = new zznk(LocationRequestCompat.PASSIVE_INTERVAL);
        f20505c = zznkVar;
    }

    public zznk(long j2) {
        this.f20506a = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zznk.class == obj.getClass() && this.f20506a == ((zznk) obj).f20506a;
    }

    public final int hashCode() {
        return ((int) this.f20506a) * 31;
    }
}
