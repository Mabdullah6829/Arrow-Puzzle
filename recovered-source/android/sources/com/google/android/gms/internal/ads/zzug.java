package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzug extends zzcq {

    /* JADX INFO: renamed from: i */
    public int f20997i;

    /* JADX INFO: renamed from: j */
    public int f20998j;

    /* JADX INFO: renamed from: k */
    public boolean f20999k;

    /* JADX INFO: renamed from: l */
    public int f21000l;

    /* JADX INFO: renamed from: m */
    public byte[] f21001m = zzfm.f16092b;

    /* JADX INFO: renamed from: n */
    public int f21002n;

    /* JADX INFO: renamed from: o */
    public long f21003o;

    @Override // com.google.android.gms.internal.ads.zzcq, com.google.android.gms.internal.ads.zzcp
    /* JADX INFO: renamed from: b */
    public final ByteBuffer mo5715b() {
        int i2;
        if (super.mo5716c() && (i2 = this.f21002n) > 0) {
            m5781h(i2).put(this.f21001m, 0, this.f21002n).flip();
            this.f21002n = 0;
        }
        return super.mo5715b();
    }

    @Override // com.google.android.gms.internal.ads.zzcq, com.google.android.gms.internal.ads.zzcp
    /* JADX INFO: renamed from: c */
    public final boolean mo5716c() {
        return super.mo5716c() && this.f21002n == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    /* JADX INFO: renamed from: d */
    public final void mo5717d(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        if (i2 == 0) {
            return;
        }
        int iMin = Math.min(i2, this.f21000l);
        this.f21003o += (long) (iMin / this.f11134b.f10390d);
        this.f21000l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f21000l <= 0) {
            int i3 = i2 - iMin;
            int length = (this.f21002n + i3) - this.f21001m.length;
            ByteBuffer byteBufferM5781h = m5781h(length);
            int i4 = this.f21002n;
            String str = zzfm.f16091a;
            int iMax = Math.max(0, Math.min(length, i4));
            byteBufferM5781h.put(this.f21001m, 0, iMax);
            int iMax2 = Math.max(0, Math.min(length - iMax, i3));
            byteBuffer.limit(byteBuffer.position() + iMax2);
            byteBufferM5781h.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i5 = i3 - iMax2;
            int i6 = this.f21002n - iMax;
            this.f21002n = i6;
            byte[] bArr = this.f21001m;
            System.arraycopy(bArr, iMax, bArr, 0, i6);
            byteBuffer.get(this.f21001m, this.f21002n, i5);
            this.f21002n += i5;
            byteBufferM5781h.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    /* JADX INFO: renamed from: e */
    public final long mo5718e(long j2) {
        return Math.max(0L, j2 - zzfm.m6520v(this.f11134b.f10387a, this.f20998j + this.f20997i));
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    /* JADX INFO: renamed from: i */
    public final zzcl mo5782i(zzcl zzclVar) throws zzco {
        if (!zzfm.m6502d(zzclVar.f10389c)) {
            throw new zzco("Unhandled input format:", zzclVar);
        }
        this.f20999k = true;
        return (this.f20997i == 0 && this.f20998j == 0) ? zzcl.f10386e : zzclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    /* JADX INFO: renamed from: j */
    public final void mo5783j() {
        if (this.f20999k) {
            int i2 = this.f21002n;
            if (i2 > 0) {
                this.f21003o += (long) (i2 / this.f11134b.f10390d);
            }
            this.f21002n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    /* JADX INFO: renamed from: k */
    public final void mo5784k() {
        if (this.f20999k) {
            this.f20999k = false;
            int i2 = this.f20998j;
            int i3 = this.f11134b.f10390d;
            this.f21001m = new byte[i2 * i3];
            this.f21000l = this.f20997i * i3;
        }
        this.f21002n = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    /* JADX INFO: renamed from: l */
    public final void mo5785l() {
        this.f21001m = zzfm.f16092b;
    }
}
