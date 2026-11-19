package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzavp {

    /* JADX INFO: renamed from: a */
    public final int f7029a;

    /* JADX INFO: renamed from: b */
    public final int[] f7030b;

    public zzavp(int i2, int[] iArr) {
        int length = iArr.length;
        if (length == 4) {
            this.f7029a = i2;
            this.f7030b = iArr;
        } else {
            StringBuilder sb = new StringBuilder(AbstractC1456a.m2434a(length, 44));
            sb.append(zzavv.m4444a("Ake3rgkWMjm+UlOd1Tg3PHccqBbIRJQk3bhyKj5k"));
            sb.append(length);
            sb.append(zzavv.m4444a("a0CvvBEaN339T0zNlXk="));
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4441a(int i2, byte[] bArr) {
        int i3 = 1777080124;
        int i4 = 1777080124;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        char c = 0;
        int i17 = 0;
        char c2 = 0;
        char c3 = 0;
        while (true) {
            if (i4 == 719824015) {
                int i18 = (-235787554) + i4;
                i4 += 799411447;
                if (i5 == i6) {
                    i4 = i18;
                }
            } else if (i4 == 1519235462) {
                int[] iArr = this.f7030b;
                i7 += (((i8 << i9) ^ (i8 >>> i10)) + i8) ^ (i5 + iArr[i5 & i11]);
                i5 += i12;
                i8 += (iArr[(i5 >>> i13) & i11] + i5) ^ (((i7 << i9) ^ (i7 >>> i10)) + i7);
                i4 -= 799411447;
            } else {
                if (i4 != i3) {
                    bArr[0] = (byte) (i7 >> i14);
                    bArr[1] = (byte) ((((i7 >> i15) & i16) << i14) >> i14);
                    bArr[c] = (byte) ((((i7 >> i17) & i16) << i14) >> i14);
                    bArr[i11] = (byte) (((i7 & i16) << i14) >> i14);
                    bArr[i9] = (byte) (i8 >> i14);
                    bArr[i10] = (byte) ((((i8 >> i15) & i16) << i14) >> i14);
                    bArr[c2] = (byte) ((((i8 >> i17) & i16) << i14) >> i14);
                    bArr[c3] = (byte) (((i8 & i16) << i14) >> i14);
                    return;
                }
                i4 -= 1057256109;
                i11 = 3;
                i16 = 255;
                c3 = 7;
                c2 = 6;
                c = 2;
                i14 = 24;
                i13 = 11;
                i12 = 1340169305;
                i10 = 5;
                i9 = 4;
                i6 = -64255200;
                i15 = 16;
                i7 = this.f7029a;
                i17 = 8;
                i8 = i2;
                i5 = 0;
            }
            i3 = 1777080124;
        }
    }
}
