package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzics extends FilterInputStream {

    /* JADX INFO: renamed from: s */
    public int f19695s;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f19695s);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f19695s <= 0) {
            return -1;
        }
        int i2 = super.read();
        if (i2 >= 0) {
            this.f19695s--;
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) {
        int iSkip = (int) super.skip(Math.min(j2, this.f19695s));
        if (iSkip >= 0) {
            this.f19695s -= iSkip;
        }
        return iSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f19695s;
        if (i4 <= 0) {
            return -1;
        }
        int i5 = super.read(bArr, i2, Math.min(i3, i4));
        if (i5 >= 0) {
            this.f19695s -= i5;
        }
        return i5;
    }
}
