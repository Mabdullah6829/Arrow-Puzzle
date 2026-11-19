package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzub {

    /* JADX INFO: renamed from: d */
    public static final byte[] f20981d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e */
    public static final byte[] f20982e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a */
    public ByteBuffer f20983a = zzcp.f10655a;

    /* JADX INFO: renamed from: c */
    public int f20985c = 0;

    /* JADX INFO: renamed from: b */
    public int f20984b = 2;

    /* JADX INFO: renamed from: b */
    public static final void m8898b(ByteBuffer byteBuffer, long j2, int i2, int i3, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j2);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i2);
        byteBuffer.putInt(0);
        byteBuffer.put(zzhau.m7311a(i3));
    }

    /* JADX INFO: renamed from: a */
    public final void m8899a(zzix zzixVar, List list) {
        int length;
        ByteBuffer byteBuffer;
        int i2;
        ByteBuffer byteBuffer2 = zzixVar.f20048d;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - zzixVar.f20048d.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f20984b == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = zzixVar.f20048d;
        int iPosition = byteBuffer3.position();
        int iLimit = byteBuffer3.limit();
        int i3 = iLimit - iPosition;
        int i4 = (i3 + 255) / 255;
        int i5 = i4 + 27 + i3;
        if (this.f20984b == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i5 += length + 44;
        } else {
            length = 0;
        }
        if (this.f20983a.capacity() < i5) {
            this.f20983a = ByteBuffer.allocate(i5).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f20983a.clear();
        }
        ByteBuffer byteBuffer4 = this.f20983a;
        if (this.f20984b == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                i2 = 22;
                m8898b(byteBuffer, 0L, 0, 1, true);
                int length2 = bArr.length;
                byteBuffer.put(zzhau.m7311a(length2));
                byteBuffer.put(bArr);
                int i6 = length2 + 28;
                byteBuffer.putInt(22, zzfm.m6506h(byteBuffer.arrayOffset(), byteBuffer.array(), i6, 0));
                byteBuffer.position(i6);
            } else {
                byteBuffer = byteBuffer4;
                i2 = 22;
                byteBuffer.put(f20981d);
            }
            byteBuffer.put(f20982e);
        } else {
            byteBuffer = byteBuffer4;
            i2 = 22;
        }
        int iM7234b = this.f20985c + ((int) ((zzgx.m7234b(byteBuffer3.get(0), byteBuffer3.limit() > 1 ? byteBuffer3.get(1) : (byte) 0) * 48000) / 1000000));
        this.f20985c = iM7234b;
        int i7 = i2;
        ByteBuffer byteBuffer5 = byteBuffer;
        m8898b(byteBuffer5, iM7234b, this.f20984b, i4, false);
        for (int i8 = 0; i8 < i4; i8++) {
            if (i3 >= 255) {
                byteBuffer5.put((byte) -1);
                i3 -= 255;
            } else {
                byteBuffer5.put((byte) i3);
                i3 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer5.put(byteBuffer3.get(iPosition));
            iPosition++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.f20984b == 2) {
            byteBuffer5.putInt(length + 66, zzfm.m6506h(byteBuffer5.arrayOffset() + length + 44, byteBuffer5.array(), byteBuffer5.limit() - byteBuffer5.position(), 0));
        } else {
            byteBuffer5.putInt(i7, zzfm.m6506h(byteBuffer5.arrayOffset(), byteBuffer5.array(), byteBuffer5.limit() - byteBuffer5.position(), 0));
        }
        this.f20984b++;
        this.f20983a = byteBuffer5;
        zzixVar.mo8566c();
        zzixVar.m8567d(this.f20983a.remaining());
        zzixVar.f20048d.put(this.f20983a);
        zzixVar.m8569f();
    }
}
