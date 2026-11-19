package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgwb {
    /* JADX INFO: renamed from: a */
    public static Object m7189a(int i2) {
        if (i2 < 2 || i2 > 1073741824 || Integer.highestOneBit(i2) != i2) {
            throw new IllegalArgumentException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 41), "must be power of 2 between 2^1 and 2^30: ", i2));
        }
        if (i2 <= 256) {
            return new byte[i2];
        }
        return i2 <= 65536 ? new short[i2] : new int[i2];
    }

    /* JADX INFO: renamed from: b */
    public static int m7190b(int i2, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i2] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i2] : ((int[]) obj)[i2];
    }

    /* JADX INFO: renamed from: c */
    public static void m7191c(int i2, int i3, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m7192d(Object obj, Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iM7201b = zzgwm.m7201b(obj);
        int i3 = iM7201b & i2;
        int iM7190b = m7190b(i3, obj3);
        if (iM7190b != 0) {
            int i4 = ~i2;
            int i5 = iM7201b & i4;
            int i6 = -1;
            while (true) {
                int i7 = iM7190b - 1;
                int i8 = iArr[i7];
                int i9 = i8 & i2;
                if ((i8 & i4) != i5 || !Objects.equals(obj, objArr[i7]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i7]))) {
                    if (i9 == 0) {
                        break;
                    }
                    i6 = i7;
                    iM7190b = i9;
                } else {
                    if (i6 == -1) {
                        m7191c(i3, i9, obj3);
                        return i7;
                    }
                    iArr[i6] = (iArr[i6] & i4) | (i9 & i2);
                    return i7;
                }
            }
        }
        return -1;
    }
}
