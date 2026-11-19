package com.google.android.gms.common.util;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class IOUtils {
    private IOUtils() {
    }

    /* JADX INFO: renamed from: a */
    public static void m3649a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m3650b(InputStream inputStream, OutputStream outputStream, boolean z) {
        byte[] bArr = new byte[1024];
        long j2 = 0;
        while (true) {
            try {
                int i2 = inputStream.read(bArr, 0, 1024);
                if (i2 == -1) {
                    break;
                }
                j2 += (long) i2;
                outputStream.write(bArr, 0, i2);
            } catch (Throwable th) {
                if (z) {
                    m3649a(inputStream);
                    m3649a(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            m3649a(inputStream);
            m3649a(outputStream);
        }
        return j2;
    }
}
