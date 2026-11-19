package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Arrays;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzi {

    /* JADX INFO: renamed from: h */
    public static final zzi f19546h;

    /* JADX INFO: renamed from: a */
    public final int f19547a;

    /* JADX INFO: renamed from: b */
    public final int f19548b;

    /* JADX INFO: renamed from: c */
    public final int f19549c;

    /* JADX INFO: renamed from: d */
    public final byte[] f19550d;

    /* JADX INFO: renamed from: e */
    public final int f19551e;

    /* JADX INFO: renamed from: f */
    public final int f19552f;

    /* JADX INFO: renamed from: g */
    public int f19553g;

    static {
        zzh zzhVar = new zzh();
        zzhVar.f18414a = 1;
        zzhVar.f18415b = 2;
        zzhVar.f18416c = 3;
        f19546h = zzhVar.m7286a();
        zzh zzhVar2 = new zzh();
        zzhVar2.f18414a = 1;
        zzhVar2.f18415b = 1;
        zzhVar2.f18416c = 2;
        zzhVar2.m7286a();
        String str = zzfm.f16091a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzi(int i2, int i3, int i4, byte[] bArr, int i5, int i6) {
        this.f19547a = i2;
        this.f19548b = i3;
        this.f19549c = i4;
        this.f19550d = bArr;
        this.f19551e = i5;
        this.f19552f = i6;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m8027a(zzi zziVar) {
        if (zziVar == null) {
            return true;
        }
        int i2 = zziVar.f19547a;
        if (i2 != -1 && i2 != 1 && i2 != 2) {
            return false;
        }
        int i3 = zziVar.f19548b;
        if (i3 != -1 && i3 != 2) {
            return false;
        }
        int i4 = zziVar.f19549c;
        if ((i4 != -1 && i4 != 3) || zziVar.f19550d != null) {
            return false;
        }
        int i5 = zziVar.f19552f;
        if (i5 != -1 && i5 != 8) {
            return false;
        }
        int i6 = zziVar.f19551e;
        return i6 == -1 || i6 == 8;
    }

    /* JADX INFO: renamed from: b */
    public static int m8028b(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    /* JADX INFO: renamed from: c */
    public static int m8029c(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 4) {
            return 10;
        }
        if (i2 == 13) {
            return 2;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    /* JADX INFO: renamed from: e */
    public static String m8030e(int i2) {
        if (i2 == -1) {
            return "Unset color space";
        }
        if (i2 == 6) {
            return "BT2020";
        }
        if (i2 != 1) {
            return i2 != 2 ? AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 22), "Undefined color space ", i2) : "BT601";
        }
        return "BT709";
    }

    /* JADX INFO: renamed from: f */
    public static String m8031f(int i2) {
        if (i2 == -1) {
            return "Unset color transfer";
        }
        if (i2 == 10) {
            return "Gamma 2.2";
        }
        if (i2 == 1) {
            return "Linear";
        }
        if (i2 == 2) {
            return "sRGB";
        }
        if (i2 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i2 != 6) {
            return i2 != 7 ? AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 25), "Undefined color transfer ", i2) : "HLG";
        }
        return "ST2084 PQ";
    }

    /* JADX INFO: renamed from: g */
    public static String m8032g(int i2) {
        if (i2 == -1) {
            return "Unset color range";
        }
        if (i2 != 1) {
            return i2 != 2 ? AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 22), "Undefined color range ", i2) : "Limited range";
        }
        return "Full range";
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8033d() {
        return (this.f19547a == -1 || this.f19548b == -1 || this.f19549c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzi.class == obj.getClass()) {
            zzi zziVar = (zzi) obj;
            if (this.f19547a == zziVar.f19547a && this.f19548b == zziVar.f19548b && this.f19549c == zziVar.f19549c && Arrays.equals(this.f19550d, zziVar.f19550d) && this.f19551e == zziVar.f19551e && this.f19552f == zziVar.f19552f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f19553g;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = ((((Arrays.hashCode(this.f19550d) + ((((((this.f19547a + 527) * 31) + this.f19548b) * 31) + this.f19549c) * 31)) * 31) + this.f19551e) * 31) + this.f19552f;
        this.f19553g = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String strM8030e = m8030e(this.f19547a);
        String strM8032g = m8032g(this.f19548b);
        String strM8031f = m8031f(this.f19549c);
        int i2 = this.f19551e;
        String strM402j = i2 != -1 ? AbstractC0271e0.m402j(new StringBuilder(String.valueOf(i2).length() + 8), "bit Luma", i2) : "NA";
        int i3 = this.f19552f;
        String strM402j2 = i3 != -1 ? AbstractC0271e0.m402j(new StringBuilder(String.valueOf(i3).length() + 10), "bit Chroma", i3) : "NA";
        boolean z = this.f19550d != null;
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2438e(AbstractC1456a.m2438e(AbstractC1456a.m2438e(AbstractC1456a.m2438e(strM8030e.length() + 12, 2, strM8032g) + strM8031f.length() + 2, 2, String.valueOf(z)), 2, strM402j), 1, strM402j2));
        sb.append("ColorInfo(");
        sb.append(strM8030e);
        sb.append(", ");
        sb.append(strM8032g);
        sb.append(", ");
        sb.append(strM8031f);
        sb.append(", ");
        sb.append(z);
        AbstractC0271e0.m413u(sb, ", ", strM402j, ", ", strM402j2);
        sb.append(")");
        return sb.toString();
    }
}
