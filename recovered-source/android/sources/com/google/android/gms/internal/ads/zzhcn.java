package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
final class zzhcn {

    /* JADX INFO: renamed from: a */
    public final zzgup f18524a = new zzgup();

    /* JADX INFO: renamed from: b */
    public final String f18525b;

    /* JADX INFO: renamed from: c */
    public volatile Logger f18526c;

    public zzhcn(Class cls) {
        this.f18525b = cls.getName();
    }

    /* JADX INFO: renamed from: a */
    public final Logger m7383a() {
        Logger logger = this.f18526c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f18524a) {
            try {
                Logger logger2 = this.f18526c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f18525b);
                this.f18526c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
