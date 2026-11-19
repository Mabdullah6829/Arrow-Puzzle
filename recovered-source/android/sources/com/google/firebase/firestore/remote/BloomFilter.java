package com.google.firebase.firestore.remote;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.protobuf.AbstractC6251n;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class BloomFilter {
    private final int bitCount;
    private final AbstractC6251n bitmap;
    private final int hashCount;
    private final MessageDigest md5HashMessageDigest;

    public static final class BloomFilterCreateException extends Exception {
        public BloomFilterCreateException(String str) {
            super(str);
        }
    }

    public BloomFilter(@NonNull AbstractC6251n abstractC6251n, int i2, int i3) {
        if (i2 < 0 || i2 >= 8) {
            throw new IllegalArgumentException(AbstractC0271e0.m396d(i2, "Invalid padding: "));
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(AbstractC0271e0.m396d(i3, "Invalid hash count: "));
        }
        if (abstractC6251n.size() > 0 && i3 == 0) {
            throw new IllegalArgumentException(AbstractC0271e0.m396d(i3, "Invalid hash count: "));
        }
        if (abstractC6251n.size() == 0 && i2 != 0) {
            throw new IllegalArgumentException(AbstractC0271e0.m396d(i2, "Expected padding of 0 when bitmap length is 0, but got "));
        }
        this.bitmap = abstractC6251n;
        this.hashCount = i3;
        this.bitCount = (abstractC6251n.size() * 8) - i2;
        this.md5HashMessageDigest = createMd5HashMessageDigest();
    }

    public static BloomFilter create(@NonNull AbstractC6251n abstractC6251n, int i2, int i3) throws BloomFilterCreateException {
        if (i2 < 0 || i2 >= 8) {
            throw new BloomFilterCreateException(AbstractC0271e0.m396d(i2, "Invalid padding: "));
        }
        if (i3 < 0) {
            throw new BloomFilterCreateException(AbstractC0271e0.m396d(i3, "Invalid hash count: "));
        }
        if (abstractC6251n.size() > 0 && i3 == 0) {
            throw new BloomFilterCreateException(AbstractC0271e0.m396d(i3, "Invalid hash count: "));
        }
        if (abstractC6251n.size() != 0 || i2 == 0) {
            return new BloomFilter(abstractC6251n, i2, i3);
        }
        throw new BloomFilterCreateException(AbstractC0271e0.m396d(i2, "Expected padding of 0 when bitmap length is 0, but got "));
    }

    @NonNull
    private static MessageDigest createMd5HashMessageDigest() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Missing MD5 MessageDigest provider: ", e);
        }
    }

    private int getBitIndex(long j2, long j3, int i2) {
        return (int) unsignedRemainder((j3 * ((long) i2)) + j2, this.bitCount);
    }

    private static long getLongLittleEndian(@NonNull byte[] bArr, int i2) {
        long j2 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            j2 |= (((long) bArr[i2 + i3]) & 255) << (i3 * 8);
        }
        return j2;
    }

    private boolean isBitSet(int i2) {
        return ((1 << (i2 % 8)) & this.bitmap.mo11719d(i2 / 8)) != 0;
    }

    @NonNull
    private byte[] md5HashDigest(@NonNull String str) {
        return this.md5HashMessageDigest.digest(str.getBytes(StandardCharsets.UTF_8));
    }

    private static long unsignedRemainder(long j2, long j3) {
        long j4 = j2 - ((((j2 >>> 1) / j3) << 1) * j3);
        if (j4 < j3) {
            j3 = 0;
        }
        return j4 - j3;
    }

    public int getBitCount() {
        return this.bitCount;
    }

    public boolean mightContain(@NonNull String str) {
        if (this.bitCount == 0) {
            return false;
        }
        byte[] bArrMd5HashDigest = md5HashDigest(str);
        if (bArrMd5HashDigest.length != 16) {
            throw new RuntimeException(AbstractC0271e0.m402j(new StringBuilder("Invalid md5 hash array length: "), " (expected 16)", bArrMd5HashDigest.length));
        }
        long longLittleEndian = getLongLittleEndian(bArrMd5HashDigest, 0);
        long longLittleEndian2 = getLongLittleEndian(bArrMd5HashDigest, 8);
        for (int i2 = 0; i2 < this.hashCount; i2++) {
            if (!isBitSet(getBitIndex(longLittleEndian, longLittleEndian2, i2))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "BloomFilter{hashCount=" + this.hashCount + ", size=" + this.bitCount + ", bitmap=\"" + Base64.encodeToString(this.bitmap.m11897w(), 2) + "\"}";
    }
}
