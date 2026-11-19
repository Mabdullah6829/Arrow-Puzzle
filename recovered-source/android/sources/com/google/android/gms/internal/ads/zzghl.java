package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzghl {

    /* JADX INFO: renamed from: a */
    public MessageDigest f17278a;

    /* JADX INFO: renamed from: b */
    public final zzgqo f17279b;

    /* JADX INFO: renamed from: c */
    public final Object f17280c = new Object();

    /* JADX INFO: renamed from: d */
    public boolean f17281d = false;

    /* JADX INFO: renamed from: e */
    public SecureRandom f17282e;

    public zzghl(zzgqo zzgqoVar) {
        this.f17279b = zzgqoVar;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0039: INVOKE (r1 I:com.google.android.gms.internal.ads.zzgqm) VIRTUAL call: com.google.android.gms.internal.ads.zzgqm.c():void A[Catch: all -> 0x0037, MD:():void (m), TRY_ENTER] (LINE:58), block:B:25:0x0039 */
    /* JADX INFO: renamed from: a */
    public final void m7005a() {
        boolean z;
        zzgqm zzgqmVarM7059c;
        synchronized (this) {
            z = this.f17281d;
        }
        if (z) {
            return;
        }
        SecureRandom secureRandom = new SecureRandom();
        synchronized (this) {
            try {
                zzgqm zzgqmVarM7060a = this.f17279b.m7060a(202);
                try {
                    zzgqmVarM7060a.m7057a();
                    this.f17282e = secureRandom;
                    this.f17278a = MessageDigest.getInstance("MD5");
                    this.f17281d = true;
                } catch (NoSuchAlgorithmException e) {
                    zzgqmVarM7060a.m7058b(e);
                } catch (Throwable th) {
                    zzgqmVarM7060a.m7058b(th);
                    throw th;
                }
                zzgqmVarM7060a.m7059c();
            } catch (Throwable th2) {
                zzgqmVarM7059c.m7059c();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m7006b(byte[] bArr, String str, boolean z) {
        int length = bArr.length;
        int i2 = true != z ? 255 : 239;
        zzgtr.m7128a(length <= i2);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i2 + 1).put((byte) length);
        if (length < i2) {
            int i3 = i2 - length;
            byte[] bArr2 = new byte[i3];
            this.f17282e.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i3);
            System.arraycopy(bArr2, 0, bArr, length, i3);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z) {
            bArrArray = ByteBuffer.allocate(256).put(m7007c(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzgho[] zzghoVarArr = new zzgib().f17345K2;
        int length2 = zzghoVarArr.length;
        for (int i4 = 0; i4 < 12; i4++) {
            zzghoVarArr[i4].mo7009a(bArrArray, bArr3);
        }
        if (!zzgtq.m7127a(str)) {
            zzghn zzghnVar = new zzghn(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8));
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < 256; i7++) {
                i5 = (i5 + 1) & 255;
                byte[] bArr4 = zzghnVar.f17284a;
                byte b = bArr4[i5];
                i6 = (i6 + b) & 255;
                bArr4[i5] = bArr4[i6];
                bArr4[i6] = b;
                bArr3[i7] = (byte) (bArr4[(bArr4[i5] + b) & 255] ^ bArr3[i7]);
            }
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m7007c(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.f17280c) {
            this.f17278a.reset();
            this.f17278a.update(bArr);
            bArrDigest = this.f17278a.digest();
        }
        return bArrDigest;
    }

    /* JADX INFO: renamed from: d */
    public final zzazl m7008d(String str, byte[] bArr) {
        zzazl zzazlVarM4670D = zzazm.m4670D();
        byte[] bArrM7007c = m7007c(bArr);
        zzidl zzidlVar = zzidl.f19719t;
        zzidl zzidlVarM8149y = zzidl.m8149y(bArrM7007c, 0, bArrM7007c.length);
        zzazlVarM4670D.m8326l();
        ((zzazm) zzazlVarM4670D.f19780t).m4672F(zzidlVarM8149y);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            int length = bArr.length;
            if (i2 >= ((length - 1) / 255) + 1) {
                break;
            }
            int i3 = i2 * 255;
            int i4 = i3 + 255;
            if (length > i4) {
                length = i4;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i3, length));
            i2++;
        }
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            zzidl zzidlVarM8149y2 = zzidl.m8149y(m7006b((byte[]) obj, str, false), 0, 256);
            zzazlVarM4670D.m8326l();
            ((zzazm) zzazlVarM4670D.f19780t).m4671E(zzidlVarM8149y2);
        }
        return zzazlVarM4670D;
    }
}
