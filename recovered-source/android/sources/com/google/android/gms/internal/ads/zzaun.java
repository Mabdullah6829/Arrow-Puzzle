package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaun extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: s */
    public final zzauc f6954s;

    public zzaun(zzauc zzaucVar, int i2) {
        this.f6954s = zzaucVar;
        ((ByteArrayOutputStream) this).buf = zzaucVar.m4408a(Math.max(i2, 256));
    }

    /* JADX INFO: renamed from: c */
    public final void m4425c(int i2) {
        int i3 = ((ByteArrayOutputStream) this).count;
        if (i3 + i2 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i4 = i3 + i2;
        zzauc zzaucVar = this.f6954s;
        byte[] bArrM4408a = zzaucVar.m4408a(i4 + i4);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrM4408a, 0, ((ByteArrayOutputStream) this).count);
        zzaucVar.m4409b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrM4408a;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f6954s.m4409b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f6954s.m4409b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i2) {
        m4425c(1);
        super.write(i2);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i2, int i3) {
        m4425c(i3);
        super.write(bArr, i2, i3);
    }
}
