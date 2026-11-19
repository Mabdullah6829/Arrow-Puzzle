package com.google.firebase.firestore.util;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class ByteBufferInputStream extends InputStream {
    ByteBuffer buffer;

    public ByteBufferInputStream(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.buffer.remaining();
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.buffer.hasRemaining()) {
            return this.buffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(@NonNull byte[] bArr, int i2, int i3) {
        if (!this.buffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i3, this.buffer.remaining());
        this.buffer.get(bArr, i2, iMin);
        return iMin;
    }
}
