package com.google.android.gms.internal.measurement;

import java.io.IOException;
import p011H.AbstractC0290s;
import p011H.EnumC0244H;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwi implements Runnable, zzwt {

    /* JADX INFO: renamed from: s */
    public zzws f23023s;

    /* JADX INFO: renamed from: t */
    public final boolean f23024t = zzrn.m10625a(Thread.currentThread());

    /* JADX INFO: renamed from: u */
    public boolean f23025u;

    /* JADX INFO: renamed from: v */
    public boolean f23026v;

    /* JADX INFO: renamed from: w */
    public final boolean f23027w;

    public zzwi(zzws zzwsVar, boolean z) {
        this.f23027w = false;
        this.f23023s = zzwsVar;
        this.f23027w = z;
    }

    /* JADX INFO: renamed from: c */
    public final void m10691c(AbstractC0290s abstractC0290s) {
        if (this.f23025u) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (this.f23026v) {
            throw new IllegalStateException("Signal is already attached to future");
        }
        this.f23026v = true;
        abstractC0290s.addListener(this, EnumC0244H.f483s);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        zzws zzwsVar = this.f23023s;
        try {
            this.f23023s = null;
            boolean z = this.f23026v;
            if (!z) {
                if (this.f23025u) {
                    throw new IllegalStateException("Span was already closed!");
                }
                this.f23025u = true;
                if (this.f23024t && !z) {
                    zzrn.m10625a(Thread.currentThread());
                }
            }
            if (zzwsVar != null) {
                zzwsVar.close();
            }
            if (this.f23027w) {
                zzvy.m10685b(zzvy.m10686c(), zzwg.f23021y);
            }
        } catch (Throwable th) {
            if (zzwsVar != null) {
                try {
                    zzwsVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (this.f23025u || !(z = this.f23026v)) {
            zzrn.m10626b().post(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzwh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
                }
            });
            return;
        }
        this.f23025u = true;
        if (!this.f23024t || z) {
            return;
        }
        zzrn.m10625a(Thread.currentThread());
    }
}
