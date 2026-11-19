package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;

/* JADX INFO: loaded from: classes2.dex */
final class zzmr extends InputStream {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzmu f22652s;

    public zzmr(zzmu zzmuVar) {
        this.f22652s = zzmuVar;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        zzmu zzmuVar = this.f22652s;
        try {
            int iInflate = zzmuVar.f22654s.inflate(bArr, i2, i3);
            if (iInflate > 0) {
                return iInflate;
            }
            if (i3 == 0) {
                return 0;
            }
            if (zzmuVar.f22654s.getRemaining() == 0) {
                return -1;
            }
            int remaining = zzmuVar.f22654s.getRemaining();
            throw new IOException(AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i3).length() + 70 + String.valueOf(remaining).length()), "Read no bytes (requested up to ", i3, ") but did not reach end of stream, had ", remaining));
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }
}
