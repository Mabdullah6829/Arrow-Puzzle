package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsr implements zzrt {

    /* JADX INFO: renamed from: a */
    public boolean f22869a = false;

    static {
        new AtomicInteger();
    }

    private zzsr() {
    }

    /* JADX INFO: renamed from: b */
    public static zzsr m10646b() {
        return new zzsr();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzrt
    /* JADX INFO: renamed from: a */
    public final Object mo10531a(zzrs zzrsVar) throws IOException {
        if (this.f22869a) {
            if (zzrsVar.f22835b.isEmpty()) {
                return zzrsVar.f22834a.mo10633c(zzrsVar.f22837d);
            }
            throw new zzsk("Short circuit would skip transforms.");
        }
        InputStream inputStreamM10648c = zzst.m10648c(zzrsVar);
        zzsj zzsjVar = new zzsj(inputStreamM10648c);
        try {
            if (!(inputStreamM10648c instanceof zzsf)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileZza = ((zzsf) inputStreamM10648c).zza();
            zzsjVar.close();
            return fileZza;
        } catch (Throwable th) {
            try {
                zzsjVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
