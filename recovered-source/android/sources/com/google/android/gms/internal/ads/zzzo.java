package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzo {

    /* JADX INFO: renamed from: d */
    public static final zzzo f21490d = new zzzo(new zzbg[0]);

    /* JADX INFO: renamed from: a */
    public final int f21491a;

    /* JADX INFO: renamed from: b */
    public final zzgwt f21492b;

    /* JADX INFO: renamed from: c */
    public int f21493c;

    static {
        String str = zzfm.f16091a;
        Integer.toString(0, 36);
    }

    public zzzo(zzbg... zzbgVarArr) {
        this.f21492b = zzgwt.m7221u(zzbgVarArr);
        this.f21491a = zzbgVarArr.length;
        int i2 = 0;
        while (i2 < this.f21492b.size()) {
            int i3 = i2 + 1;
            for (int i4 = i3; i4 < this.f21492b.size(); i4++) {
                if (((zzbg) this.f21492b.get(i2)).equals(this.f21492b.get(i4))) {
                    zzeh.m6214f("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final zzbg m9066a(int i2) {
        return (zzbg) ((zzgyo) this.f21492b).get(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzo.class == obj.getClass()) {
            zzzo zzzoVar = (zzzo) obj;
            if (this.f21491a == zzzoVar.f21491a && this.f21492b.equals(zzzoVar.f21492b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f21493c;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = this.f21492b.hashCode();
        this.f21493c = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.f21492b.toString();
    }
}
