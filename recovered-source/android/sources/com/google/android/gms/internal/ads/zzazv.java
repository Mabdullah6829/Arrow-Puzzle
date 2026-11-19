package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zzazv {

    /* JADX INFO: renamed from: a */
    public static boolean f7219a = false;

    /* JADX INFO: renamed from: b */
    public static MessageDigest f7220b;

    /* JADX INFO: renamed from: c */
    public static final Object f7221c = new Object();

    /* JADX INFO: renamed from: d */
    public static final Object f7222d = new Object();

    /* JADX INFO: renamed from: e */
    public static final CountDownLatch f7223e = new CountDownLatch(1);

    /* JADX INFO: renamed from: a */
    public static void m4678a() {
        synchronized (f7222d) {
            try {
                if (!f7219a) {
                    f7219a = true;
                    new Thread(new zzazu()).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static zzazl m4679b(String str, byte[] bArr) {
        Vector vector;
        int length = bArr.length;
        if (length <= 0) {
            vector = null;
        } else {
            int i2 = length + 254;
            vector = new Vector();
            for (int i3 = 0; i3 < i2 / 255; i3++) {
                int i4 = i3 * 255;
                try {
                    int length2 = bArr.length;
                    if (length2 - i4 > 255) {
                        length2 = i4 + 255;
                    }
                    vector.add(Arrays.copyOfRange(bArr, i4, length2));
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        if (vector == null || vector.isEmpty()) {
            return null;
        }
        zzazl zzazlVarM4670D = zzazm.m4670D();
        int size = vector.size();
        for (int i5 = 0; i5 < size; i5++) {
            zzidl zzidlVarM8149y = zzidl.m8149y(m4681d((byte[]) vector.get(i5), str, false), 0, 256);
            zzazlVarM4670D.m8326l();
            ((zzazm) zzazlVarM4670D.f19780t).m4671E(zzidlVarM8149y);
        }
        byte[] bArrM4680c = m4680c(bArr);
        zzidl zzidlVar = zzidl.f19719t;
        zzidl zzidlVarM8149y2 = zzidl.m8149y(bArrM4680c, 0, bArrM4680c.length);
        zzazlVarM4670D.m8326l();
        ((zzazm) zzazlVarM4670D.f19780t).m4672F(zzidlVarM8149y2);
        return zzazlVarM4670D;
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m4680c(byte[] bArr) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (f7221c) {
            try {
                m4678a();
                MessageDigest messageDigest2 = null;
                try {
                    if (f7223e.await(2L, TimeUnit.SECONDS) && (messageDigest = f7220b) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = f7220b.digest();
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrDigest;
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m4681d(byte[] bArr, String str, boolean z) {
        byte[] bArrArray;
        int length = bArr.length;
        int i2 = true != z ? 255 : 239;
        if (length > i2) {
            zzaxt zzaxtVarM4561F0 = zzayt.m4561F0();
            zzaxtVarM4561F0.m4531r(4096L);
            bArr = ((zzayt) zzaxtVarM4561F0.m8328o()).m8099h();
        }
        int i3 = i2 + 1;
        int length2 = bArr.length;
        byte b = (byte) length2;
        if (length2 < i2) {
            byte[] bArr2 = new byte[i2 - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i3).put(b).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i3).put(b).put(bArr).array();
        }
        if (z) {
            bArrArray = ByteBuffer.allocate(256).put(m4680c(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzazw[] zzazwVarArr = new zzbaj().f7288K2;
        int length3 = zzazwVarArr.length;
        for (int i4 = 0; i4 < 12; i4++) {
            zzazwVarArr[i4].mo4682a(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            zzazn zzaznVar = new zzazn(str.getBytes("UTF-8"));
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < 256; i7++) {
                i5 = (i5 + 1) & 255;
                byte[] bArr4 = zzaznVar.f7207a;
                byte b2 = bArr4[i5];
                i6 = (i6 + b2) & 255;
                bArr4[i5] = bArr4[i6];
                bArr4[i6] = b2;
                bArr3[i7] = (byte) (bArr4[(bArr4[i5] + b2) & 255] ^ bArr3[i7]);
            }
        }
        return bArr3;
    }
}
