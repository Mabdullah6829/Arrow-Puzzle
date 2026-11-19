package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Optional;

/* JADX INFO: loaded from: classes2.dex */
public final class zzavg extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzavg(zzavf zzavfVar, zzavd zzavdVar, long j2) {
        Locale locale = Locale.US;
        Long lValueOf = Long.valueOf(j2);
        super(String.format(locale, zzavv.m4444a("bk3t6gFTc30="), Long.valueOf(zzavfVar.f7020s), Long.valueOf(zzavdVar.f7011s), lValueOf));
        Optional.of(zzavdVar);
        Optional.of(lValueOf);
    }

    public zzavg(zzavf zzavfVar, Exception exc) {
        super(String.format(Locale.US, zzavv.m4444a("bk0="), Long.valueOf(zzavfVar.f7020s)), exc);
        Optional.empty();
        Optional.empty();
    }
}
