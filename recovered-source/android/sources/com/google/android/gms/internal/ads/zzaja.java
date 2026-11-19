package com.google.android.gms.internal.ads;

import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzaja implements zzaiz {

    /* JADX INFO: renamed from: a */
    public final long f5500a;

    /* JADX INFO: renamed from: b */
    public final long f5501b;

    /* JADX INFO: renamed from: c */
    public final boolean f5502c;

    /* JADX INFO: renamed from: d */
    public final zzx f5503d;

    public zzaja(long j2, long j3, boolean z, zzx zzxVar) {
        boolean z2 = true;
        if (j2 != -9223372036854775807L && j3 != -9223372036854775807L && j2 > j3) {
            z2 = false;
        }
        zzgtr.m7128a(z2);
        this.f5500a = j2;
        this.f5501b = j3;
        this.f5502c = z;
        this.f5503d = zzxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaja.class == obj.getClass()) {
            zzaja zzajaVar = (zzaja) obj;
            if (this.f5500a == zzajaVar.f5500a && this.f5501b == zzajaVar.f5501b && this.f5502c == zzajaVar.f5502c && Objects.equals(this.f5503d, zzajaVar.f5503d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f5501b) + ((Long.hashCode(this.f5500a) + 527) * 31);
        zzx zzxVar = this.f5503d;
        return (((iHashCode * 31) + (this.f5502c ? 1 : 0)) * 31) + (zzxVar != null ? zzxVar.hashCode() : 0);
    }

    public final String toString() {
        String string;
        long j2 = this.f5500a;
        Object objValueOf = j2 == -9223372036854775807L ? "UNSET" : Long.valueOf(j2);
        long j3 = this.f5501b;
        String string2 = objValueOf.toString();
        if (j3 == -9223372036854775807L) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(j3).length() + 12);
            sb.append(", endTimeMs=");
            sb.append(j3);
            string = sb.toString();
        }
        zzx zzxVar = this.f5503d;
        String strConcat = zzxVar == null ? "" : ", title=".concat(zzxVar.toString());
        String str = true == this.f5502c ? ", hidden" : "";
        StringBuilder sb2 = new StringBuilder(str.length() + string.length() + string2.length() + 21 + strConcat.length());
        AbstractC0271e0.m413u(sb2, "Chapter: startTimeMs=", string2, string, str);
        sb2.append(strConcat);
        return sb2.toString();
    }
}
