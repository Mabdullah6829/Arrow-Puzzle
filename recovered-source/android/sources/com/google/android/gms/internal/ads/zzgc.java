package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgc implements zzao {

    /* JADX INFO: renamed from: a */
    public final float f16918a;

    /* JADX INFO: renamed from: b */
    public final float f16919b;

    public zzgc(float f2, float f3) {
        boolean z = false;
        if (f2 >= -90.0f && f2 <= 90.0f && f3 >= -180.0f && f3 <= 180.0f) {
            z = true;
        }
        zzgtr.m7129b("Invalid latitude or longitude", z);
        this.f16918a = f2;
        this.f16919b = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzgc.class == obj.getClass()) {
            zzgc zzgcVar = (zzgc) obj;
            if (this.f16918a == zzgcVar.f16918a && this.f16919b == zzgcVar.f16919b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16919b) + ((Float.hashCode(this.f16918a) + 527) * 31);
    }

    public final String toString() {
        float f2 = this.f16918a;
        int length = String.valueOf(f2).length();
        float f3 = this.f16919b;
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(f3).length());
        sb.append("xyz: latitude=");
        sb.append(f2);
        sb.append(", longitude=");
        sb.append(f3);
        return sb.toString();
    }
}
