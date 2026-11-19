package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbbe {

    /* JADX INFO: renamed from: a */
    public static Cipher f7509a;

    /* JADX INFO: renamed from: b */
    public static final Object f7510b = new Object();

    /* JADX INFO: renamed from: c */
    public static final Object f7511c = new Object();

    /* JADX INFO: renamed from: a */
    public static String m4719a(byte[] bArr, byte[] bArr2) throws zzbbd {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f7510b) {
                m4721c().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = m4721c().doFinal(bArr2);
                iv = m4721c().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return Base64.encodeToString(bArr3, 2);
        } catch (InvalidKeyException e) {
            throw new zzbbd(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new zzbbd(e2);
        } catch (BadPaddingException e3) {
            throw new zzbbd(e3);
        } catch (IllegalBlockSizeException e4) {
            throw new zzbbd(e4);
        } catch (NoSuchPaddingException e5) {
            throw new zzbbd(e5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m4720b(String str, byte[] bArr) throws zzbbd {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            if (bArrDecode.length == 0 && str.length() > 0) {
                throw new IllegalArgumentException("Unable to decode ".concat(str));
            }
            int length2 = bArrDecode.length;
            if (length2 <= 16) {
                throw new zzbbd();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrDecode);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f7510b) {
                m4721c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = m4721c().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e) {
            throw new zzbbd(e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new zzbbd(e2);
        } catch (InvalidKeyException e3) {
            throw new zzbbd(e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new zzbbd(e4);
        } catch (BadPaddingException e5) {
            throw new zzbbd(e5);
        } catch (IllegalBlockSizeException e6) {
            throw new zzbbd(e6);
        } catch (NoSuchPaddingException e7) {
            throw new zzbbd(e7);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Cipher m4721c() {
        Cipher cipher;
        synchronized (f7511c) {
            try {
                if (f7509a == null) {
                    f7509a = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f7509a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }
}
