package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzidk extends OutputStream {

    /* JADX INFO: renamed from: x */
    public static final byte[] f19713x = new byte[0];

    /* JADX INFO: renamed from: u */
    public int f19716u;

    /* JADX INFO: renamed from: w */
    public int f19718w;

    /* JADX INFO: renamed from: s */
    public final int f19714s = 128;

    /* JADX INFO: renamed from: t */
    public final ArrayList f19715t = new ArrayList();

    /* JADX INFO: renamed from: v */
    public byte[] f19717v = new byte[128];

    /* JADX INFO: renamed from: c */
    public final synchronized zzidl m8143c() {
        try {
            int i2 = this.f19718w;
            byte[] bArr = this.f19717v;
            if (i2 >= bArr.length) {
                this.f19715t.add(new zzidj(this.f19717v));
                this.f19717v = f19713x;
            } else if (i2 > 0) {
                this.f19715t.add(new zzidj(Arrays.copyOf(bArr, i2)));
            }
            this.f19716u += this.f19718w;
            this.f19718w = 0;
        } catch (Throwable th) {
            throw th;
        }
        return zzidl.m8145B(this.f19715t);
    }

    /* JADX INFO: renamed from: e */
    public final void m8144e(int i2) {
        this.f19715t.add(new zzidj(this.f19717v));
        int length = this.f19716u + this.f19717v.length;
        this.f19716u = length;
        this.f19717v = new byte[Math.max(this.f19714s, Math.max(i2, length >>> 1))];
        this.f19718w = 0;
    }

    public final String toString() {
        int i2;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i2 = this.f19716u + this.f19718w;
        }
        return "<ByteString.Output@" + hexString + " size=" + i2 + ">";
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i2) {
        try {
            if (this.f19718w == this.f19717v.length) {
                m8144e(1);
            }
            byte[] bArr = this.f19717v;
            int i3 = this.f19718w;
            this.f19718w = i3 + 1;
            bArr[i3] = (byte) i2;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = this.f19717v;
        int length = bArr2.length;
        int i4 = this.f19718w;
        int i5 = length - i4;
        if (i3 <= i5) {
            System.arraycopy(bArr, i2, bArr2, i4, i3);
            this.f19718w += i3;
            return;
        }
        System.arraycopy(bArr, i2, bArr2, i4, i5);
        int i6 = i3 - i5;
        m8144e(i6);
        System.arraycopy(bArr, i2 + i5, this.f19717v, 0, i6);
        this.f19718w = i6;
    }
}
