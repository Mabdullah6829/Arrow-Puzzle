package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
final class zztt {

    /* JADX INFO: renamed from: a */
    public Exception f20908a;

    /* JADX INFO: renamed from: b */
    public long f20909b = -9223372036854775807L;

    /* JADX INFO: renamed from: c */
    public long f20910c = -9223372036854775807L;

    /* JADX INFO: renamed from: a */
    public final void m8871a(Exception exc) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f20908a == null) {
            this.f20908a = exc;
        }
        if (this.f20909b == -9223372036854775807L && zztu.f20911Y.get() <= 0) {
            this.f20909b = 200 + jElapsedRealtime;
        }
        long j2 = this.f20909b;
        if (j2 == -9223372036854775807L || jElapsedRealtime < j2) {
            this.f20910c = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.f20908a;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.f20908a;
        this.f20908a = null;
        this.f20909b = -9223372036854775807L;
        this.f20910c = -9223372036854775807L;
        throw exc3;
    }
}
