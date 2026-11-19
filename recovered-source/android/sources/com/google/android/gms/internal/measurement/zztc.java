package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public interface zztc {
    /* JADX INFO: renamed from: a */
    default InputStream m10650a(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            inputStream.close();
        }
        throw new zzsk("wrapForRead not supported by ".concat(String.valueOf(zza())));
    }

    /* JADX INFO: renamed from: b */
    default OutputStream m10651b(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.close();
        }
        throw new zzsk("wrapForWrite not supported by ".concat(String.valueOf(zza())));
    }

    String zza();
}
