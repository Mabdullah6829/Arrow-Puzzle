package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzimo extends zzimr {

    /* JADX INFO: renamed from: a */
    public final Logger f19979a;

    public zzimo(String str) {
        this.f19979a = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.zzimr
    /* JADX INFO: renamed from: a */
    public final void mo8542a(String str) {
        this.f19979a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
