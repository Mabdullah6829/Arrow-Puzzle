package com.google.android.gms.internal.measurement;

import java.io.FilterInputStream;

/* JADX INFO: loaded from: classes2.dex */
public class zzsn extends FilterInputStream {
    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return ((FilterInputStream) this).in.read(bArr);
    }
}
