package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajv extends zzajs {

    /* JADX INFO: renamed from: b */
    public final int f5559b;

    /* JADX INFO: renamed from: c */
    public final int f5560c;

    /* JADX INFO: renamed from: d */
    public final int f5561d;

    /* JADX INFO: renamed from: e */
    public final int[] f5562e;

    /* JADX INFO: renamed from: f */
    public final int[] f5563f;

    public zzajv(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        super("MLLT");
        this.f5559b = i2;
        this.f5560c = i3;
        this.f5561d = i4;
        this.f5562e = iArr;
        this.f5563f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajv.class == obj.getClass()) {
            zzajv zzajvVar = (zzajv) obj;
            if (this.f5559b == zzajvVar.f5559b && this.f5560c == zzajvVar.f5560c && this.f5561d == zzajvVar.f5561d && Arrays.equals(this.f5562e, zzajvVar.f5562e) && Arrays.equals(this.f5563f, zzajvVar.f5563f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5563f) + ((Arrays.hashCode(this.f5562e) + ((((((this.f5559b + 527) * 31) + this.f5560c) * 31) + this.f5561d) * 31)) * 31);
    }
}
