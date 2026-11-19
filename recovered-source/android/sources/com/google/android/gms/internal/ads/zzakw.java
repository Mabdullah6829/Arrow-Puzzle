package com.google.android.gms.internal.ads;

import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzakw implements zzao {

    /* JADX INFO: renamed from: a */
    public final float f5772a;

    /* JADX INFO: renamed from: b */
    public final zzakv f5773b;

    /* JADX INFO: renamed from: c */
    public final zzakv f5774c;

    public zzakw(float f2, zzakv zzakvVar, zzakv zzakvVar2) {
        this.f5772a = f2;
        this.f5773b = zzakvVar;
        this.f5774c = zzakvVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzakw)) {
            return false;
        }
        zzakw zzakwVar = (zzakw) obj;
        return Float.compare(this.f5772a, zzakwVar.f5772a) == 0 && Objects.equals(this.f5773b, zzakwVar.f5773b) && Objects.equals(this.f5774c, zzakwVar.f5774c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f5772a) * 31;
        zzakv zzakvVar = this.f5773b;
        int iHashCode2 = (iHashCode + (zzakvVar != null ? zzakvVar.hashCode() : 0)) * 31;
        zzakv zzakvVar2 = this.f5774c;
        return iHashCode2 + (zzakvVar2 != null ? zzakvVar2.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f5773b);
        String strValueOf2 = String.valueOf(this.f5774c);
        float f2 = this.f5772a;
        int length = String.valueOf(f2).length();
        StringBuilder sb = new StringBuilder(length + 37 + strValueOf.length() + 10 + strValueOf2.length());
        sb.append("ReplayGain Xing/Info: peak=");
        sb.append(f2);
        sb.append(", field 1=");
        sb.append(strValueOf);
        return AbstractC0271e0.m403k(sb, ", field 2=", strValueOf2);
    }
}
