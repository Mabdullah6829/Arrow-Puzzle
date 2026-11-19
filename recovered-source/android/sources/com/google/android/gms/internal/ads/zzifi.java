package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzifi extends InputStream {

    /* JADX INFO: renamed from: A */
    public long f19804A;

    /* JADX INFO: renamed from: s */
    public Iterator f19805s;

    /* JADX INFO: renamed from: t */
    public ByteBuffer f19806t;

    /* JADX INFO: renamed from: u */
    public int f19807u;

    /* JADX INFO: renamed from: v */
    public int f19808v;

    /* JADX INFO: renamed from: w */
    public int f19809w;

    /* JADX INFO: renamed from: x */
    public boolean f19810x;

    /* JADX INFO: renamed from: y */
    public byte[] f19811y;

    /* JADX INFO: renamed from: z */
    public int f19812z;

    /* JADX INFO: renamed from: c */
    public final boolean m8358c() {
        ByteBuffer byteBuffer;
        Iterator it = this.f19805s;
        do {
            this.f19808v++;
            if (!it.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) it.next();
            this.f19806t = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.f19809w = this.f19806t.position();
        if (this.f19806t.hasArray()) {
            this.f19810x = true;
            this.f19811y = this.f19806t.array();
            this.f19812z = this.f19806t.arrayOffset();
            return true;
        }
        this.f19810x = false;
        this.f19804A = zzihk.m8480n(this.f19806t);
        this.f19811y = null;
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m8359e(int i2) {
        int i3 = this.f19809w + i2;
        this.f19809w = i3;
        if (i3 == this.f19806t.limit()) {
            m8358c();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f19808v == this.f19807u) {
            return -1;
        }
        if (this.f19810x) {
            int i2 = this.f19811y[this.f19809w + this.f19812z] & 255;
            m8359e(1);
            return i2;
        }
        int iMo8466h = zzihk.f19905c.mo8466h(((long) this.f19809w) + this.f19804A) & 255;
        m8359e(1);
        return iMo8466h;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        if (this.f19808v == this.f19807u) {
            return -1;
        }
        int iLimit = this.f19806t.limit();
        int i4 = this.f19809w;
        int i5 = iLimit - i4;
        if (i3 > i5) {
            i3 = i5;
        }
        if (this.f19810x) {
            System.arraycopy(this.f19811y, i4 + this.f19812z, bArr, i2, i3);
            m8359e(i3);
            return i3;
        }
        int iPosition = this.f19806t.position();
        this.f19806t.position(this.f19809w);
        this.f19806t.get(bArr, i2, i3);
        this.f19806t.position(iPosition);
        m8359e(i3);
        return i3;
    }
}
