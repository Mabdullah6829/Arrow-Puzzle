package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbm {

    /* JADX INFO: renamed from: a */
    public final int f9158a;

    /* JADX INFO: renamed from: b */
    public final zzbg f9159b;

    /* JADX INFO: renamed from: c */
    public final boolean f9160c;

    /* JADX INFO: renamed from: d */
    public final int[] f9161d;

    /* JADX INFO: renamed from: e */
    public final boolean[] f9162e;

    static {
        String str = zzfm.f16091a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public zzbm(zzbg zzbgVar, boolean z, int[] iArr, boolean[] zArr) {
        int i2 = zzbgVar.f7807a;
        this.f9158a = i2;
        zzgtr.m7128a(i2 == iArr.length && i2 == zArr.length);
        this.f9159b = zzbgVar;
        this.f9160c = z && i2 > 1;
        this.f9161d = (int[]) iArr.clone();
        this.f9162e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbm.class == obj.getClass()) {
            zzbm zzbmVar = (zzbm) obj;
            if (this.f9160c == zzbmVar.f9160c && this.f9159b.equals(zzbmVar.f9159b) && Arrays.equals(this.f9161d, zzbmVar.f9161d) && Arrays.equals(this.f9162e, zzbmVar.f9162e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9162e) + ((Arrays.hashCode(this.f9161d) + (((this.f9159b.hashCode() * 31) + (this.f9160c ? 1 : 0)) * 31)) * 31);
    }
}
