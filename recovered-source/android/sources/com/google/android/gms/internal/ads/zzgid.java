package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgid {

    /* JADX INFO: renamed from: a */
    public static final Charset f17495a = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: b */
    public static Cipher f17496b = null;

    /* JADX INFO: renamed from: c */
    public static final Object f17497c = new Object();

    /* JADX INFO: renamed from: d */
    public static final Object f17498d = new Object();

    /* JADX INFO: renamed from: a */
    public static byte[] m7010a(String str, byte[] bArr) throws zzgic {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrM6965a = zzgel.m6965a(str, false);
            int length2 = bArrM6965a.length;
            if (length2 <= 16) {
                throw new zzgic();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrM6965a);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f17497c) {
                m7011b().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = m7011b().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new zzgic(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Cipher m7011b() {
        Cipher cipher;
        synchronized (f17498d) {
            try {
                if (f17496b == null) {
                    f17496b = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f17496b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }
}
