package com.google.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.google.protobuf.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6212a extends FilterInputStream {

    /* JADX INFO: renamed from: s */
    public int f24133s;

    public C6212a(InputStream inputStream, int i2) {
        super(inputStream);
        this.f24133s = i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f24133s);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f24133s <= 0) {
            return -1;
        }
        int i2 = super.read();
        if (i2 >= 0) {
            this.f24133s--;
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) {
        int iSkip = (int) super.skip(Math.min(j2, this.f24133s));
        if (iSkip >= 0) {
            this.f24133s -= iSkip;
        }
        return iSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f24133s;
        if (i4 <= 0) {
            return -1;
        }
        int i5 = super.read(bArr, i2, Math.min(i3, i4));
        if (i5 >= 0) {
            this.f24133s -= i5;
        }
        return i5;
    }
}
