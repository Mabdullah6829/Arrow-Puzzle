package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
final class zzauf extends FilterInputStream {

    /* JADX INFO: renamed from: s */
    public final long f6943s;

    /* JADX INFO: renamed from: t */
    public long f6944t;

    public zzauf(BufferedInputStream bufferedInputStream, long j2) {
        super(bufferedInputStream);
        this.f6943s = j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i2 = super.read();
        if (i2 != -1) {
            this.f6944t++;
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = super.read(bArr, i2, i3);
        if (i4 != -1) {
            this.f6944t += (long) i4;
        }
        return i4;
    }
}
