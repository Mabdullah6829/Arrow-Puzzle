package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6216b0 extends InputStream {

    /* JADX INFO: renamed from: A */
    public long f24138A;

    /* JADX INFO: renamed from: s */
    public Iterator f24139s;

    /* JADX INFO: renamed from: t */
    public ByteBuffer f24140t;

    /* JADX INFO: renamed from: u */
    public int f24141u;

    /* JADX INFO: renamed from: v */
    public int f24142v;

    /* JADX INFO: renamed from: w */
    public int f24143w;

    /* JADX INFO: renamed from: x */
    public boolean f24144x;

    /* JADX INFO: renamed from: y */
    public byte[] f24145y;

    /* JADX INFO: renamed from: z */
    public int f24146z;

    /* JADX INFO: renamed from: c */
    public final boolean m11846c() {
        this.f24142v++;
        Iterator it = this.f24139s;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.f24140t = byteBuffer;
        this.f24143w = byteBuffer.position();
        if (this.f24140t.hasArray()) {
            this.f24144x = true;
            this.f24145y = this.f24140t.array();
            this.f24146z = this.f24140t.arrayOffset();
            return true;
        }
        this.f24144x = false;
        this.f24138A = AbstractC6223d1.f24164c.m11853j(this.f24140t, AbstractC6223d1.f24168g);
        this.f24145y = null;
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m11847e(int i2) {
        int i3 = this.f24143w + i2;
        this.f24143w = i3;
        if (i3 == this.f24140t.limit()) {
            m11846c();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f24142v == this.f24141u) {
            return -1;
        }
        if (this.f24144x) {
            int i2 = this.f24145y[this.f24143w + this.f24146z] & 255;
            m11847e(1);
            return i2;
        }
        int iMo11836e = AbstractC6223d1.f24164c.mo11836e(((long) this.f24143w) + this.f24138A) & 255;
        m11847e(1);
        return iMo11836e;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        if (this.f24142v == this.f24141u) {
            return -1;
        }
        int iLimit = this.f24140t.limit();
        int i4 = this.f24143w;
        int i5 = iLimit - i4;
        if (i3 > i5) {
            i3 = i5;
        }
        if (this.f24144x) {
            System.arraycopy(this.f24145y, i4 + this.f24146z, bArr, i2, i3);
            m11847e(i3);
            return i3;
        }
        int iPosition = this.f24140t.position();
        this.f24140t.position(this.f24143w);
        this.f24140t.get(bArr, i2, i3);
        this.f24140t.position(iPosition);
        m11847e(i3);
        return i3;
    }
}
