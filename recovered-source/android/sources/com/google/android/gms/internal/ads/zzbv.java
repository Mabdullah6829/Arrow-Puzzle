package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbv {

    /* JADX INFO: renamed from: d */
    public static final zzbv f9425d = new zzbv(0, 0, 1.0f);

    /* JADX INFO: renamed from: a */
    public final int f9426a;

    /* JADX INFO: renamed from: b */
    public final int f9427b;

    /* JADX INFO: renamed from: c */
    public final float f9428c;

    static {
        String str = zzfm.f16091a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public zzbv(int i2, int i3, float f2) {
        this.f9426a = i2;
        this.f9427b = i3;
        this.f9428c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbv) {
            zzbv zzbvVar = (zzbv) obj;
            if (this.f9426a == zzbvVar.f9426a && this.f9427b == zzbvVar.f9427b && this.f9428c == zzbvVar.f9428c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f9428c) + ((((this.f9426a + 217) * 31) + this.f9427b) * 31);
    }
}
