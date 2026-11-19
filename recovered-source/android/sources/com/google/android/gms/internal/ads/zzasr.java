package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.core.internal.view.SupportMenu;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzasr {
    /* JADX INFO: renamed from: a */
    public static X509Certificate[][] m4367a(String str) {
        RandomAccessFile randomAccessFile;
        Pair pairM4378a;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile2.length() < 22) {
                pairM4378a = null;
            } else {
                pairM4378a = zzass.m4378a(randomAccessFile2, 0);
                if (pairM4378a == null) {
                    pairM4378a = zzass.m4378a(randomAccessFile2, SupportMenu.USER_MASK);
                }
            }
            try {
                if (pairM4378a == null) {
                    long length = randomAccessFile2.length();
                    StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 82);
                    sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                    sb.append(length);
                    sb.append(" bytes");
                    throw new zzaso(sb.toString());
                }
                ByteBuffer byteBuffer = (ByteBuffer) pairM4378a.first;
                long jLongValue = ((Long) pairM4378a.second).longValue();
                long j2 = (-20) + jLongValue;
                if (j2 >= 0) {
                    randomAccessFile2.seek(j2);
                    if (randomAccessFile2.readInt() == 1347094023) {
                        throw new zzaso("ZIP64 APK not supported");
                    }
                }
                zzass.m4379b(byteBuffer);
                long j3 = ((long) byteBuffer.getInt(byteBuffer.position() + 16)) & 4294967295L;
                if (j3 >= jLongValue) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(j3).length() + 82 + String.valueOf(jLongValue).length());
                    sb2.append("ZIP Central Directory offset out of range: ");
                    sb2.append(j3);
                    sb2.append(". ZIP End of Central Directory offset: ");
                    sb2.append(jLongValue);
                    throw new zzaso(sb2.toString());
                }
                zzass.m4379b(byteBuffer);
                if ((((long) byteBuffer.getInt(byteBuffer.position() + 12)) & 4294967295L) + j3 != jLongValue) {
                    throw new zzaso("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (j3 < 32) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(j3).length() + 67);
                    sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb3.append(j3);
                    throw new zzaso(sb3.toString());
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferAllocate.order(byteOrder);
                randomAccessFile2.seek(j3 - ((long) byteBufferAllocate.capacity()));
                randomAccessFile2.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                    throw new zzaso("No APK Signing Block before ZIP Central Directory");
                }
                long j4 = byteBufferAllocate.getLong(0);
                if (j4 < byteBufferAllocate.capacity() || j4 > 2147483639) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j4).length() + 37);
                    sb4.append("APK Signing Block size out of range: ");
                    sb4.append(j4);
                    throw new zzaso(sb4.toString());
                }
                int i2 = (int) (8 + j4);
                long j5 = j3 - ((long) i2);
                if (j5 < 0) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j5).length() + 39);
                    sb5.append("APK Signing Block offset out of range: ");
                    sb5.append(j5);
                    throw new zzaso(sb5.toString());
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i2);
                byteBufferAllocate2.order(byteOrder);
                randomAccessFile2.seek(j5);
                long j6 = j3;
                randomAccessFile2.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                long j7 = byteBufferAllocate2.getLong(0);
                if (j7 != j4) {
                    StringBuilder sb6 = new StringBuilder(String.valueOf(j7).length() + 63 + String.valueOf(j4).length());
                    sb6.append("APK Signing Block sizes in header and footer do not match: ");
                    sb6.append(j7);
                    sb6.append(" vs ");
                    sb6.append(j4);
                    throw new zzaso(sb6.toString());
                }
                Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j5));
                ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
                long jLongValue2 = ((Long) pairCreate.second).longValue();
                if (byteBuffer2.order() != byteOrder) {
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                int iCapacity = byteBuffer2.capacity() - 24;
                randomAccessFile = randomAccessFile2;
                if (iCapacity < 8) {
                    StringBuilder sb7 = new StringBuilder(String.valueOf(iCapacity).length() + 17);
                    sb7.append("end < start: ");
                    sb7.append(iCapacity);
                    sb7.append(" < 8");
                    throw new IllegalArgumentException(sb7.toString());
                }
                int iCapacity2 = byteBuffer2.capacity();
                if (iCapacity > byteBuffer2.capacity()) {
                    StringBuilder sb8 = new StringBuilder(String.valueOf(iCapacity).length() + 19 + String.valueOf(iCapacity2).length());
                    sb8.append("end > capacity: ");
                    sb8.append(iCapacity);
                    sb8.append(" > ");
                    sb8.append(iCapacity2);
                    throw new IllegalArgumentException(sb8.toString());
                }
                int iLimit = byteBuffer2.limit();
                int iPosition = byteBuffer2.position();
                try {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iCapacity);
                    byteBuffer2.position(8);
                    ByteBuffer byteBufferSlice = byteBuffer2.slice();
                    byteBufferSlice.order(byteBuffer2.order());
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    int i3 = 0;
                    while (byteBufferSlice.hasRemaining()) {
                        i3++;
                        if (byteBufferSlice.remaining() < 8) {
                            StringBuilder sb9 = new StringBuilder(String.valueOf(i3).length() + 59);
                            sb9.append("Insufficient data to read size of APK Signing Block entry #");
                            sb9.append(i3);
                            throw new zzaso(sb9.toString());
                        }
                        long j8 = byteBufferSlice.getLong();
                        if (j8 < 4 || j8 > 2147483647L) {
                            StringBuilder sb10 = new StringBuilder(String.valueOf(i3).length() + 45 + String.valueOf(j8).length());
                            sb10.append("APK Signing Block entry #");
                            sb10.append(i3);
                            sb10.append(" size out of range: ");
                            sb10.append(j8);
                            throw new zzaso(sb10.toString());
                        }
                        int i4 = (int) j8;
                        int iPosition2 = byteBufferSlice.position() + i4;
                        if (i4 > byteBufferSlice.remaining()) {
                            int iRemaining = byteBufferSlice.remaining();
                            StringBuilder sb11 = new StringBuilder(String.valueOf(i3).length() + 45 + String.valueOf(i4).length() + 13 + String.valueOf(iRemaining).length());
                            sb11.append("APK Signing Block entry #");
                            sb11.append(i3);
                            sb11.append(" size out of range: ");
                            sb11.append(i4);
                            sb11.append(", available: ");
                            sb11.append(iRemaining);
                            throw new zzaso(sb11.toString());
                        }
                        if (byteBufferSlice.getInt() == 1896449818) {
                            X509Certificate[][] x509CertificateArrM4368b = m4368b(randomAccessFile.getChannel(), new zzasn(m4374h(i4 - 4, byteBufferSlice), jLongValue2, j6, jLongValue, byteBuffer));
                            randomAccessFile.close();
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            return x509CertificateArrM4368b;
                        }
                        long j9 = j6;
                        byteBufferSlice.position(iPosition2);
                        j6 = j9;
                    }
                    throw new zzaso("No APK Signature Scheme v2 block in APK Signing Block");
                } catch (Throwable th) {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = randomAccessFile2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static X509Certificate[][] m4368b(FileChannel fileChannel, zzasn zzasnVar) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferM4375i = m4375i(zzasnVar.f6839a);
                int i2 = 0;
                while (byteBufferM4375i.hasRemaining()) {
                    i2++;
                    try {
                        arrayList.add(m4369c(m4375i(byteBufferM4375i), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(AbstractC1456a.m2448o(new StringBuilder(String.valueOf(i2).length() + 37), "Failed to parse/verify signer #", i2, " block"), e);
                    }
                }
                if (i2 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j2 = zzasnVar.f6840b;
                long j3 = zzasnVar.f6841c;
                long j4 = zzasnVar.f6842d;
                ByteBuffer byteBuffer = zzasnVar.f6843e;
                if (map.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                zzasm zzasmVar = new zzasm(fileChannel, 0L, j2);
                zzasm zzasmVar2 = new zzasm(fileChannel, j3, j4 - j3);
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                zzass.m4379b(byteBufferDuplicate);
                int iPosition = byteBufferDuplicate.position() + 16;
                if (j2 < 0 || j2 > 4294967295L) {
                    StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 27);
                    sb.append("uint32 value of out range: ");
                    sb.append(j2);
                    throw new IllegalArgumentException(sb.toString());
                }
                byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition, (int) j2);
                zzask zzaskVar = new zzask(byteBufferDuplicate);
                int size = map.size();
                int[] iArr = new int[size];
                Iterator it = map.keySet().iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    iArr[i3] = ((Integer) it.next()).intValue();
                    i3++;
                }
                try {
                    byte[][] bArrM4370d = m4370d(iArr, new zzasl[]{zzasmVar, zzasmVar2, zzaskVar});
                    for (int i4 = 0; i4 < size; i4++) {
                        int i5 = iArr[i4];
                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i5)), bArrM4370d[i4])) {
                            throw new SecurityException(m4372f(i5).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e2) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e2);
                }
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
        }
    }

    /* JADX INFO: renamed from: c */
    public static X509Certificate[] m4369c(ByteBuffer byteBuffer, HashMap map, CertificateFactory certificateFactory) throws IOException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferM4375i = m4375i(byteBuffer);
        ByteBuffer byteBufferM4375i2 = m4375i(byteBuffer);
        byte[] bArrM4376j = m4376j(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrM4376j2 = null;
        byte[] bArrM4376j3 = null;
        int i2 = -1;
        int i3 = 0;
        while (byteBufferM4375i2.hasRemaining()) {
            i3++;
            try {
                ByteBuffer byteBufferM4375i3 = m4375i(byteBufferM4375i2);
                if (byteBufferM4375i3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i4 = byteBufferM4375i3.getInt();
                arrayList.add(Integer.valueOf(i4));
                if (i4 != 513 && i4 != 514 && i4 != 769) {
                    switch (i4) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i2 != -1) {
                    int iM4371e = m4371e(i4);
                    int iM4371e2 = m4371e(i2);
                    if (iM4371e != 1 && iM4371e2 == 1) {
                    }
                }
                bArrM4376j3 = m4376j(byteBufferM4375i3);
                i2 = i4;
            } catch (IOException e) {
                e = e;
                throw new SecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i3).length() + 34), "Failed to parse signature record #", i3), e);
            } catch (BufferUnderflowException e2) {
                e = e2;
                throw new SecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i3).length() + 34), "Failed to parse signature record #", i3), e);
            }
        }
        if (i2 == -1) {
            if (i3 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i2 == 513 || i2 == 514) {
            str = "EC";
        } else if (i2 != 769) {
            switch (i2) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i2))));
            }
        } else {
            str = "DSA";
        }
        if (i2 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i2 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i2 != 769) {
            switch (i2) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i2))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrM4376j));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferM4375i);
            if (!signature.verify(bArrM4376j3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferM4375i.clear();
            ByteBuffer byteBufferM4375i4 = m4375i(byteBufferM4375i);
            ArrayList arrayList2 = new ArrayList();
            int i5 = 0;
            while (byteBufferM4375i4.hasRemaining()) {
                i5++;
                try {
                    ByteBuffer byteBufferM4375i5 = m4375i(byteBufferM4375i4);
                    if (byteBufferM4375i5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i6 = byteBufferM4375i5.getInt();
                    arrayList2.add(Integer.valueOf(i6));
                    if (i6 == i2) {
                        bArrM4376j2 = m4376j(byteBufferM4375i5);
                    }
                } catch (IOException e3) {
                    e = e3;
                    throw new IOException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i5).length() + 31), "Failed to parse digest record #", i5), e);
                } catch (BufferUnderflowException e4) {
                    e = e4;
                    throw new IOException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i5).length() + 31), "Failed to parse digest record #", i5), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iM4371e3 = m4371e(i2);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iM4371e3), bArrM4376j2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrM4376j2)) {
                throw new SecurityException(m4372f(iM4371e3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferM4375i6 = m4375i(byteBufferM4375i);
            ArrayList arrayList3 = new ArrayList();
            int i7 = 0;
            while (byteBufferM4375i6.hasRemaining()) {
                i7++;
                byte[] bArrM4376j4 = m4376j(byteBufferM4375i6);
                try {
                    arrayList3.add(new zzasp((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrM4376j4)), bArrM4376j4));
                } catch (CertificateException e5) {
                    throw new SecurityException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i7).length() + 30), "Failed to decode certificate #", i7), e5);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrM4376j, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e6) {
            e = e6;
            throw new SecurityException(AbstractC1456a.m2450q(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e7) {
            e = e7;
            throw new SecurityException(AbstractC1456a.m2450q(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e8) {
            e = e8;
            throw new SecurityException(AbstractC1456a.m2450q(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e9) {
            e = e9;
            throw new SecurityException(AbstractC1456a.m2450q(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e10) {
            e = e10;
            throw new SecurityException(AbstractC1456a.m2450q(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static byte[][] m4370d(int[] iArr, zzasl[] zzaslVarArr) throws DigestException {
        long j2;
        int i2;
        int length;
        char c;
        int i3 = 0;
        long jZza = 0;
        while (true) {
            j2 = 1048576;
            if (i3 >= 3) {
                break;
            }
            jZza += (zzaslVarArr[i3].zza() + 1048575) / 1048576;
            i3++;
        }
        if (jZza >= 2097151) {
            StringBuilder sb = new StringBuilder(String.valueOf(jZza).length() + 17);
            sb.append("Too many chunks: ");
            sb.append(jZza);
            throw new DigestException(sb.toString());
        }
        byte[][] bArr = new byte[iArr.length][];
        int i4 = 0;
        while (true) {
            length = iArr.length;
            c = 5;
            if (i4 >= length) {
                break;
            }
            int i5 = (int) jZza;
            byte[] bArr2 = new byte[(m4373g(iArr[i4]) * i5) + 5];
            bArr2[0] = 90;
            m4377k(i5, bArr2);
            bArr[i4] = bArr2;
            i4++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            String strM4372f = m4372f(iArr[i6]);
            try {
                messageDigestArr[i6] = MessageDigest.getInstance(strM4372f);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(strM4372f.concat(" digest not supported"), e);
            }
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (i2 = 3; i7 < i2; i2 = 3) {
            zzasl zzaslVar = zzaslVarArr[i7];
            int i10 = i7;
            long jZza2 = zzaslVar.zza();
            long j3 = 0;
            while (jZza2 > 0) {
                char c2 = c;
                int i11 = i8;
                int iMin = (int) Math.min(jZza2, j2);
                m4377k(iMin, bArr3);
                for (int i12 = 0; i12 < length; i12++) {
                    messageDigestArr[i12].update(bArr3);
                }
                try {
                    zzaslVar.mo4366a(messageDigestArr, j3, iMin);
                    int i13 = 0;
                    while (i13 < iArr.length) {
                        int i14 = iArr[i13];
                        byte[] bArr4 = bArr[i13];
                        int iM4373g = m4373g(i14);
                        zzasl zzaslVar2 = zzaslVar;
                        MessageDigest messageDigest = messageDigestArr[i13];
                        long j4 = jZza2;
                        int iDigest = messageDigest.digest(bArr4, (i11 * iM4373g) + 5, iM4373g);
                        if (iDigest != iM4373g) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 35 + String.valueOf(iDigest).length());
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(iDigest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i13++;
                        zzaslVar = zzaslVar2;
                        jZza2 = j4;
                    }
                    zzasl zzaslVar3 = zzaslVar;
                    long j5 = iMin;
                    j3 += j5;
                    jZza2 -= j5;
                    i8 = i11 + 1;
                    c = c2;
                    zzaslVar = zzaslVar3;
                    j2 = 1048576;
                } catch (IOException e2) {
                    throw new DigestException(AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i11).length() + 37 + String.valueOf(i9).length()), "Failed to digest chunk #", i11, " of section #", i9), e2);
                }
            }
            i9++;
            i7 = i10 + 1;
            j2 = 1048576;
        }
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i15 = 0; i15 < iArr.length; i15++) {
            int i16 = iArr[i15];
            byte[] bArr6 = bArr[i15];
            String strM4372f2 = m4372f(i16);
            try {
                bArr5[i15] = MessageDigest.getInstance(strM4372f2).digest(bArr6);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(strM4372f2.concat(" digest not supported"), e3);
            }
        }
        return bArr5;
    }

    /* JADX INFO: renamed from: e */
    public static int m4371e(int i2) {
        if (i2 == 513) {
            return 1;
        }
        if (i2 == 514) {
            return 2;
        }
        if (i2 == 769) {
            return 1;
        }
        switch (i2) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i2))));
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m4372f(int i2) {
        if (i2 == 1) {
            return "SHA-256";
        }
        if (i2 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 33), "Unknown content digest algorthm: ", i2));
    }

    /* JADX INFO: renamed from: g */
    public static int m4373g(int i2) {
        if (i2 == 1) {
            return 32;
        }
        if (i2 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 33), "Unknown content digest algorthm: ", i2));
    }

    /* JADX INFO: renamed from: h */
    public static ByteBuffer m4374h(int i2, ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (i3 < iPosition || i3 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i3);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i3);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    /* JADX INFO: renamed from: i */
    public static ByteBuffer m4375i(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            int iRemaining = byteBuffer.remaining();
            throw new IOException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iRemaining).length() + 82), "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", iRemaining));
        }
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i2 <= byteBuffer.remaining()) {
            return m4374h(i2, byteBuffer);
        }
        int iRemaining2 = byteBuffer.remaining();
        throw new IOException(AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i2).length() + 79 + String.valueOf(iRemaining2).length()), "Length-prefixed field longer than remaining buffer. Field length: ", i2, ", remaining: ", iRemaining2));
    }

    /* JADX INFO: renamed from: j */
    public static byte[] m4376j(ByteBuffer byteBuffer) throws IOException {
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            throw new IOException("Negative length");
        }
        if (i2 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i2];
            byteBuffer.get(bArr);
            return bArr;
        }
        int iRemaining = byteBuffer.remaining();
        throw new IOException(AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i2).length() + 68 + String.valueOf(iRemaining).length()), "Underflow while reading length-prefixed value. Length: ", i2, ", available: ", iRemaining));
    }

    /* JADX INFO: renamed from: k */
    public static void m4377k(int i2, byte[] bArr) {
        bArr[1] = (byte) (i2 & 255);
        bArr[2] = (byte) ((i2 >>> 8) & 255);
        bArr[3] = (byte) ((i2 >>> 16) & 255);
        bArr[4] = (byte) (i2 >> 24);
    }
}
