package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public class zzra {

    /* JADX INFO: renamed from: a */
    public volatile zzrq f21762a;

    /* JADX INFO: renamed from: b */
    public volatile zzpm f21763b;

    /* JADX INFO: renamed from: a */
    public final int m9229a() {
        if (this.f21763b != null) {
            return ((zzpk) this.f21763b).f21712u.length;
        }
        if (this.f21762a != null) {
            return this.f21762a.mo9224g();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final zzpm m9230b() {
        if (this.f21763b != null) {
            return this.f21763b;
        }
        synchronized (this) {
            try {
                if (this.f21763b != null) {
                    return this.f21763b;
                }
                if (this.f21762a == null) {
                    this.f21763b = zzpm.f21713t;
                } else {
                    this.f21763b = this.f21762a.zzk();
                }
                return this.f21763b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9231c(zzrq zzrqVar) {
        if (this.f21762a != null) {
            return;
        }
        synchronized (this) {
            if (this.f21762a != null) {
                return;
            }
            try {
                this.f21762a = zzrqVar;
                this.f21763b = zzpm.f21713t;
            } catch (zzqu unused) {
                this.f21762a = zzrqVar;
                this.f21763b = zzpm.f21713t;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzra)) {
            return false;
        }
        zzra zzraVar = (zzra) obj;
        zzrq zzrqVar = this.f21762a;
        zzrq zzrqVar2 = zzraVar.f21762a;
        if (zzrqVar == null && zzrqVar2 == null) {
            return m9230b().equals(zzraVar.m9230b());
        }
        if (zzrqVar != null && zzrqVar2 != null) {
            return zzrqVar.equals(zzrqVar2);
        }
        if (zzrqVar != null) {
            zzraVar.m9231c(zzrqVar.zzl());
            return zzrqVar.equals(zzraVar.f21762a);
        }
        m9231c(zzrqVar2.zzl());
        return this.f21762a.equals(zzrqVar2);
    }

    public int hashCode() {
        return 1;
    }
}
