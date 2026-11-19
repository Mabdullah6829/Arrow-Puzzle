package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzuc extends zzcq {

    /* JADX INFO: renamed from: i */
    public int f20986i;

    /* JADX INFO: renamed from: j */
    public boolean f20987j;

    /* JADX INFO: renamed from: k */
    public int f20988k;

    /* JADX INFO: renamed from: l */
    public long f20989l;

    /* JADX INFO: renamed from: n */
    public byte[] f20991n;

    /* JADX INFO: renamed from: q */
    public byte[] f20994q;

    /* JADX INFO: renamed from: m */
    public int f20990m = 0;

    /* JADX INFO: renamed from: o */
    public int f20992o = 0;

    /* JADX INFO: renamed from: p */
    public int f20993p = 0;

    public zzuc() {
        byte[] bArr = zzfm.f16092b;
        this.f20991n = bArr;
        this.f20994q = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    /* JADX INFO: renamed from: d */
    public final void mo5717d(ByteBuffer byteBuffer) {
        int iLimit;
        int i2;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f11139g.hasRemaining()) {
            if (this.f20988k != 0) {
                zzgtr.m7133f(this.f20992o < this.f20991n.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > 1024) {
                        int i3 = this.f20986i;
                        iLimit = (iPosition2 / i3) * i3;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i4 = this.f20992o;
                int i5 = this.f20993p;
                int i6 = i4 + i5;
                int length = this.f20991n.length;
                if (i6 < length) {
                    i2 = length - i6;
                } else {
                    i6 = i5 - (length - i4);
                    i2 = i4 - i6;
                }
                int iMin = Math.min(iPosition3, i2);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f20991n, i6, iMin);
                int i7 = this.f20993p + iMin;
                this.f20993p = i7;
                zzgtr.m7133f(i7 <= this.f20991n.length);
                boolean z = iLimit < iLimit2 && iPosition3 < i2;
                m8900m(z);
                if (z) {
                    this.f20988k = 0;
                    this.f20990m = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.f20991n.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit4) << 8) | (byteBuffer.get(iLimit4 - 1) & 255)) > 1024) {
                        int i8 = this.f20986i;
                        iPosition = ((iLimit4 / i8) * i8) + i8;
                        break;
                    }
                    iLimit4 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f20988k = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    m5781h(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    /* JADX INFO: renamed from: i */
    public final zzcl mo5782i(zzcl zzclVar) throws zzco {
        if (zzclVar.f10389c == 2) {
            return zzclVar.f10387a == -1 ? zzcl.f10386e : zzclVar;
        }
        throw new zzco("Unhandled input format:", zzclVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    /* JADX INFO: renamed from: j */
    public final void mo5783j() {
        if (this.f20993p > 0) {
            m8900m(true);
            this.f20990m = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    /* JADX INFO: renamed from: k */
    public final void mo5784k() {
        if (zzc()) {
            zzcl zzclVar = this.f11134b;
            int i2 = zzclVar.f10388b;
            int i3 = i2 + i2;
            this.f20986i = i3;
            int i4 = ((((int) ((100000 * ((long) zzclVar.f10387a)) / 1000000)) / 2) / i3) * i3;
            int i5 = i4 + i4;
            if (this.f20991n.length != i5) {
                this.f20991n = new byte[i5];
                this.f20994q = new byte[i5];
            }
        }
        this.f20988k = 0;
        this.f20989l = 0L;
        this.f20990m = 0;
        this.f20992o = 0;
        this.f20993p = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    /* JADX INFO: renamed from: l */
    public final void mo5785l() {
        this.f20987j = false;
        byte[] bArr = zzfm.f16092b;
        this.f20991n = bArr;
        this.f20994q = bArr;
    }

    /* JADX INFO: renamed from: m */
    public final void m8900m(boolean z) {
        int i2;
        int length;
        int i3 = this.f20993p;
        int length2 = this.f20991n.length;
        if (i3 != length2) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        if (this.f20990m == 0) {
            if (z) {
                m8902o(i3, 3);
                length = i3;
            } else {
                zzgtr.m7133f(i3 >= (length2 >> 1));
                length = this.f20991n.length >> 1;
                m8902o(length, 0);
            }
            i2 = length;
        } else {
            int i4 = length2 >> 1;
            int i5 = i3 - i4;
            if (z) {
                int iM8901n = m8901n(i5) + (this.f20991n.length >> 1);
                m8902o(iM8901n, 2);
                int i6 = i4 + i5;
                i2 = iM8901n;
                length = i6;
            } else {
                int iM8901n2 = m8901n(i5);
                m8902o(iM8901n2, 1);
                i2 = iM8901n2;
                length = i5;
            }
        }
        if (length % this.f20986i != 0) {
            throw new IllegalStateException(zzgui.m7149b("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
        }
        zzgtr.m7133f(i3 >= i2);
        this.f20993p -= length;
        int i7 = this.f20992o + length;
        this.f20992o = i7;
        this.f20992o = i7 % this.f20991n.length;
        int i8 = this.f20990m;
        int i9 = this.f20986i;
        this.f20990m = (i2 / i9) + i8;
        this.f20989l += (long) ((length - i2) / i9);
    }

    /* JADX INFO: renamed from: n */
    public final int m8901n(int i2) {
        int length = ((((int) ((2000000 * ((long) this.f11134b.f10387a)) / 1000000)) - this.f20990m) * this.f20986i) - (this.f20991n.length >> 1);
        zzgtr.m7133f(length >= 0);
        int iMin = (int) Math.min((i2 * 0.2f) + 0.5f, length);
        int i3 = this.f20986i;
        return (iMin / i3) * i3;
    }

    /* JADX INFO: renamed from: o */
    public final void m8902o(int i2, int i3) {
        int i4;
        if (i2 == 0) {
            return;
        }
        zzgtr.m7128a(this.f20993p >= i2);
        if (i3 == 2) {
            int i5 = this.f20992o;
            int i6 = this.f20993p;
            int i7 = i5 + i6;
            byte[] bArr = this.f20991n;
            int length = bArr.length;
            if (i7 <= length) {
                System.arraycopy(bArr, i7 - i2, this.f20994q, 0, i2);
            } else {
                int i8 = i6 - (length - i5);
                if (i8 >= i2) {
                    System.arraycopy(bArr, i8 - i2, this.f20994q, 0, i2);
                } else {
                    int i9 = i2 - i8;
                    System.arraycopy(bArr, length - i9, this.f20994q, 0, i9);
                    System.arraycopy(this.f20991n, 0, this.f20994q, i9, i8);
                }
            }
        } else {
            int i10 = this.f20992o;
            int i11 = i10 + i2;
            byte[] bArr2 = this.f20991n;
            int length2 = bArr2.length;
            if (i11 <= length2) {
                System.arraycopy(bArr2, i10, this.f20994q, 0, i2);
            } else {
                int i12 = length2 - i10;
                System.arraycopy(bArr2, i10, this.f20994q, 0, i12);
                System.arraycopy(this.f20991n, 0, this.f20994q, i12, i2 - i12);
            }
        }
        zzgtr.m7130c(i2, "sizeToOutput is not aligned to frame size: %s", i2 % this.f20986i == 0);
        zzgtr.m7133f(this.f20992o < this.f20991n.length);
        byte[] bArr3 = this.f20994q;
        zzgtr.m7130c(i2, "byteOutput size is not aligned to frame size %s", i2 % this.f20986i == 0);
        if (i3 != 3) {
            for (int i13 = 0; i13 < i2; i13 += 2) {
                int i14 = i13 + 1;
                int i15 = (bArr3[i14] << 8) | (bArr3[i13] & 255);
                if (i3 == 0) {
                    i4 = ((((i13 * 1000) / (i2 - 1)) * (-90)) / 1000) + 100;
                } else {
                    i4 = 10;
                    if (i3 == 2) {
                        i4 = 10 + (((90000 * i13) / (i2 - 1)) / 1000);
                    }
                }
                int i16 = (i15 * i4) / 100;
                if (i16 >= 32767) {
                    bArr3[i13] = -1;
                    bArr3[i14] = 127;
                } else if (i16 <= -32768) {
                    bArr3[i13] = 0;
                    bArr3[i14] = -128;
                } else {
                    bArr3[i13] = (byte) (i16 & 255);
                    bArr3[i14] = (byte) (i16 >> 8);
                }
            }
        }
        m5781h(i2).put(bArr3, 0, i2).flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcq, com.google.android.gms.internal.ads.zzcp
    public final boolean zzc() {
        return super.zzc() && this.f20987j;
    }
}
