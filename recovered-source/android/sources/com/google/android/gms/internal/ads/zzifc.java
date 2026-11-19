package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzifc {

    /* JADX INFO: renamed from: a */
    public static final byte[] f19794a;

    /* JADX INFO: renamed from: b */
    public static final ByteBuffer f19795b;

    static {
        byte[] bArr = new byte[0];
        f19794a = bArr;
        f19795b = ByteBuffer.wrap(bArr);
        zzidp.m8199f(bArr, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m8355a() {
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* JADX INFO: renamed from: b */
    public static int m8356b(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }
}
