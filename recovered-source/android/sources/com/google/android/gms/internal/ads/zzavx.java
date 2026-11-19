package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzavx {

    /* JADX INFO: renamed from: b */
    public static final zzavx f7094b = new zzavx(new byte[0]);

    /* JADX INFO: renamed from: c */
    public static final Comparator f7095c = new zzavw();

    /* JADX INFO: renamed from: a */
    public final byte[] f7096a;

    public zzavx(byte[] bArr) {
        this.f7096a = bArr;
    }

    /* JADX INFO: renamed from: e */
    public static zzavx m4445e(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        if (length == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 0, bArr3, 0, length);
            bArr2 = bArr3;
        }
        return new zzavx(bArr2);
    }

    /* JADX INFO: renamed from: f */
    public static int m4446f(byte b) {
        int[] iArr = {2107654819, 15074090, 1957914693, -2142502098, -1902504939, -100121615, 100669, 1835342733, 837626799};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        return b & ((iArr[7] % 837626799) ^ AbstractC5152f.m3770b((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8));
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m4447a() {
        byte[] bArr = this.f7096a;
        int length = bArr.length;
        if (length == 0) {
            return new byte[0];
        }
        if (length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    /* JADX INFO: renamed from: b */
    public final byte m4448b(int i2) {
        int i3 = ((((~2106914653) & 587408197) | 1537377410) + ((2106914653 & 536945509) | 443419704)) - 2137956065;
        int i4 = 2013725218 % 1633938701;
        int i5 = ((((~1287859999) & 62941354) | 437464817) + ((1287859999 & 1639989262) | 1644309956)) - 2060977796;
        int i6 = 1442767057 % 63299708;
        byte[] bArr = this.f7096a;
        int length = bArr.length;
        if (((length - (i2 + 1)) | i2) >= 0) {
            return bArr[i2];
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(AbstractC1456a.m2434a(i2, i3 ^ i4));
            sb.append(zzavv.m4444a("Akelqh1fajntGgo="));
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(AbstractC1456a.m2434a(length, AbstractC1456a.m2434a(i2, i5 ^ i6)));
        sb2.append(zzavv.m4444a("Akelqh1faDmxRUSK1T9GeQ=="));
        sb2.append(i2);
        sb2.append(zzavv.m4444a("Zwk="));
        sb2.append(length);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* JADX INFO: renamed from: c */
    public final String m4449c() {
        Charset charsetForName = Charset.forName(zzavv.m4444a("Hn2H4l0="));
        byte[] bArr = this.f7096a;
        return new String(bArr, 0, bArr.length, charsetForName);
    }

    /* JADX INFO: renamed from: d */
    public final zzavx m4450d(zzavx zzavxVar) {
        byte[] bArr = zzavxVar.f7096a;
        int length = bArr.length;
        byte[] bArr2 = this.f7096a;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length2 + length];
        System.arraycopy(bArr2, 0, bArr3, 0, length2);
        System.arraycopy(bArr, 0, bArr3, length2, length);
        return m4445e(bArr3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzavx) {
            return Arrays.equals(this.f7096a, ((zzavx) obj).f7096a);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(Arrays.hashCode(this.f7096a));
    }

    public final String toString() {
        int[] iArr = {936621968, 262671172, 1099388327, 506341952, 1363551406, -1491858486, 110389885, 989492335, 981766422};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int iM3770b = AbstractC5152f.m3770b((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8);
        String string = Arrays.toString(this.f7096a);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + ((i9 % 981766422) ^ iM3770b));
        sb.append(zzavv.m4444a("CVC1qiQNJHikW0iU1TIPZA=="));
        sb.append(string);
        sb.append(zzavv.m4444a("Ng=="));
        return sb.toString();
    }
}
