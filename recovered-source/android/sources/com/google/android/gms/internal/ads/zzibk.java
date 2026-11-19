package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzibk {

    /* JADX INFO: renamed from: a */
    public final byte[] f19614a;

    public zzibk(byte[] bArr, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f19614a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    /* JADX INFO: renamed from: a */
    public static zzibk m8050a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        int length2 = bArr.length;
        if (length > length2) {
            length = length2;
        }
        return new zzibk(bArr, length);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m8051b() {
        byte[] bArr = this.f19614a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzibk) {
            return Arrays.equals(((zzibk) obj).f19614a, this.f19614a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f19614a);
    }

    public final String toString() {
        byte[] bArr = this.f19614a;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            sb.append("0123456789abcdef".charAt((b & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b & 15));
        }
        String string = sb.toString();
        return AbstractC1456a.m2450q(new StringBuilder(string.length() + 7), "Bytes(", string, ")");
    }
}
