package com.instagram.common.viewpoint.core;

import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kP */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4716kP implements InterfaceC3266Mh {
    public static byte[] A07;
    public static String[] A08 = {"F3MsLf6P", "OcoAPMR8U6yTwuATNsSjihct3nuq8KFx", "bdE6GcC1kS6ix1fgAcoyQkC9rv", "V0wqj6Me", "EdnIrf", "cKhO3MBZMfPQ2uYBFx142UbqGZ0vcEvq", "x8zWNoAeDf", "YEiR7yHxtXFy2pC0Q9KvxgBtY"};
    public C3273Mo A00;
    public boolean A01;
    public final C212940 A02;
    public final SecureRandom A03;
    public final Cipher A04;
    public final SecretKeySpec A05;
    public final boolean A06;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A08;
            if (strArr[2].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "SFj9nJw9GR";
            strArr2[4] = "liv3w1";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 117);
            i5++;
        }
    }

    public static void A03() {
        A07 = new byte[]{11, 15, 29};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A05(HashMap<String, C3265Mg> map) throws IOException {
        try {
            C21283z c21283zA03 = this.A02.A03();
            if (this.A00 == null) {
                this.A00 = new C3273Mo(c21283zA03);
            } else {
                this.A00.A00(c21283zA03);
            }
            C3273Mo c3273Mo = this.A00;
            DataOutputStream dataOutputStream = new DataOutputStream(c3273Mo);
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(this.A06 ? 1 : 0);
            if (this.A06) {
                byte[] bArr = new byte[16];
                ((SecureRandom) AbstractC22035C.A0f(this.A03)).nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    ((Cipher) AbstractC22035C.A0f(this.A04)).init(1, (Key) AbstractC22035C.A0f(this.A05), new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream = new DataOutputStream(new CipherOutputStream(c3273Mo, this.A04));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                    throw new IllegalStateException(e);
                }
            }
            dataOutputStream.writeInt(map.size());
            int iA00 = 0;
            for (C3265Mg c3265Mg : map.values()) {
                A04(c3265Mg, dataOutputStream);
                iA00 += A00(c3265Mg, 2);
            }
            dataOutputStream.writeInt(iA00);
            this.A02.A06(dataOutputStream);
            AbstractC22035C.A10(null);
        } catch (Throwable th) {
            AbstractC22035C.A10(null);
            throw th;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private boolean A06(HashMap<String, C3265Mg> map, SparseArray<String> sparseArray) {
        if (!this.A02.A07()) {
            return true;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.A02.A04());
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            int i2 = dataInputStream.readInt();
            if (i2 < 0 || i2 > 2) {
                AbstractC22035C.A10(dataInputStream);
                return false;
            }
            if ((dataInputStream.readInt() & 1) != 0) {
                if (this.A04 == null) {
                    AbstractC22035C.A10(dataInputStream);
                    return false;
                }
                byte[] bArr = new byte[16];
                dataInputStream.readFully(bArr);
                try {
                    this.A04.init(2, (Key) AbstractC22035C.A0f(this.A05), new IvParameterSpec(bArr));
                    dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.A04));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                    throw new IllegalStateException(e);
                }
            } else if (this.A06) {
                this.A01 = true;
            }
            int i3 = dataInputStream.readInt();
            int iA00 = 0;
            for (int i4 = 0; i4 < i3; i4++) {
                C3265Mg c3265MgA01 = A01(i2, dataInputStream);
                map.put(c3265MgA01.A02, c3265MgA01);
                sparseArray.put(c3265MgA01.A01, c3265MgA01.A02);
                iA00 += A00(c3265MgA01, i2);
            }
            int i5 = dataInputStream.readInt();
            boolean z = dataInputStream.read() == -1;
            if (i5 == iA00 && z) {
                AbstractC22035C.A10(dataInputStream);
                return true;
            }
            AbstractC22035C.A10(dataInputStream);
            return false;
        } catch (IOException unused) {
            if (0 != 0) {
                AbstractC22035C.A10(null);
            }
            return false;
        } catch (Throwable th) {
            if (0 != 0) {
                AbstractC22035C.A10(null);
            }
            throw th;
        }
    }

    static {
        A03();
    }

    public C4716kP(File file, byte[] bArr, boolean z) {
        AbstractC21273y.A08((bArr == null && z) ? false : true);
        Cipher cipherA05 = null;
        SecretKeySpec secretKeySpec = null;
        if (bArr != null) {
            AbstractC21273y.A07(bArr.length == 16);
            try {
                cipherA05 = C3267Mi.A05();
                secretKeySpec = new SecretKeySpec(bArr, A02(0, 3, 85));
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new IllegalStateException(e);
            }
        } else {
            AbstractC21273y.A07(!z);
        }
        this.A06 = z;
        this.A04 = cipherA05;
        this.A05 = secretKeySpec;
        this.A03 = z ? new SecureRandom() : null;
        this.A02 = new C212940(file);
    }

    private int A00(C3265Mg c3265Mg, int i2) {
        int result = c3265Mg.A01;
        int i3 = result * 31;
        int result2 = c3265Mg.A02.hashCode();
        int result3 = i3 + result2;
        if (i2 < 2) {
            long jA00 = AbstractC3268Mj.A00(c3265Mg.A03());
            return (result3 * 31) + ((int) ((jA00 >>> 32) ^ jA00));
        }
        return (result3 * 31) + c3265Mg.A03().hashCode();
    }

    private C3265Mg A01(int i2, DataInputStream dataInputStream) throws IOException {
        C4714kN c4714kNA02;
        int i3 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i2 >= 2) {
            c4714kNA02 = C3267Mi.A02(dataInputStream);
        } else {
            long length = dataInputStream.readLong();
            C3270Ml c3270Ml = new C3270Ml();
            C3270Ml.A00(c3270Ml, length);
            c4714kNA02 = C4714kN.A03.A05(c3270Ml);
        }
        return new C3265Mg(i3, utf, c4714kNA02);
    }

    private void A04(C3265Mg c3265Mg, DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(c3265Mg.A01);
        dataOutputStream.writeUTF(c3265Mg.A02);
        C3267Mi.A08(c3265Mg.A03(), dataOutputStream);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3266Mh
    public final void A5p() {
        this.A02.A05();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3266Mh
    public final boolean A6S() {
        return this.A02.A07();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3266Mh
    public final void AAF(long j2) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3266Mh
    public final void AAs(HashMap<String, C3265Mg> map, SparseArray<String> sparseArray) {
        AbstractC21273y.A08(!this.A01);
        if (!A06(map, sparseArray)) {
            map.clear();
            String[] strArr = A08;
            if (strArr[2].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A08[7] = "LXlnn5Px";
            sparseArray.clear();
            this.A02.A05();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3266Mh
    public final void AFd(C3265Mg c3265Mg, boolean z) {
        this.A01 = true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3266Mh
    public final void AGK(C3265Mg c3265Mg) {
        this.A01 = true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3266Mh
    public final void AKI(HashMap<String, C3265Mg> map) throws IOException {
        A05(map);
        this.A01 = false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3266Mh
    public final void AKJ(HashMap<String, C3265Mg> map) throws IOException {
        if (!this.A01) {
            return;
        }
        AKI(map);
    }
}
