package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzatb implements Runnable {

    /* JADX INFO: renamed from: s */
    public final zzatl f6868s;

    /* JADX INFO: renamed from: t */
    public final zzatr f6869t;

    /* JADX INFO: renamed from: u */
    public final Runnable f6870u;

    public zzatb(zzatl zzatlVar, zzatr zzatrVar, Runnable runnable) {
        this.f6868s = zzatlVar;
        this.f6869t = zzatrVar;
        this.f6870u = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzatp zzatpVar;
        zzatl zzatlVar = this.f6868s;
        synchronized (zzatlVar.f6895w) {
        }
        zzatr zzatrVar = this.f6869t;
        zzatu zzatuVar = zzatrVar.f6912c;
        if (zzatuVar == null) {
            zzatlVar.mo3113k(zzatrVar.f6910a);
        } else {
            synchronized (zzatlVar.f6895w) {
                zzatpVar = zzatlVar.f6896x;
            }
            zzatpVar.mo3110a(zzatuVar);
        }
        if (zzatrVar.f6913d) {
            zzatlVar.m4390b("intermediate-response");
        } else {
            zzatlVar.m4391c("done");
        }
        Runnable runnable = this.f6870u;
        if (runnable != null) {
            runnable.run();
        }
    }
}
