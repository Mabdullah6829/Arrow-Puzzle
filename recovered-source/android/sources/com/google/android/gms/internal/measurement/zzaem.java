package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public class zzaem {

    /* JADX INFO: renamed from: a */
    public volatile zzafc f22055a;

    /* JADX INFO: renamed from: b */
    public volatile zzacr f22056b;

    /* JADX INFO: renamed from: a */
    public final int m9598a() {
        if (this.f22056b != null) {
            return this.f22056b.mo9373b();
        }
        if (this.f22055a != null) {
            return this.f22055a.mo9567f();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final zzacr m9599b() {
        if (this.f22056b != null) {
            return this.f22056b;
        }
        synchronized (this) {
            try {
                if (this.f22056b != null) {
                    return this.f22056b;
                }
                if (this.f22055a == null) {
                    this.f22056b = zzacr.f21972t;
                } else {
                    this.f22056b = this.f22055a.mo9344b();
                }
                return this.f22056b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9600c(zzafc zzafcVar) {
        if (this.f22055a != null) {
            return;
        }
        synchronized (this) {
            if (this.f22055a != null) {
                return;
            }
            try {
                this.f22055a = zzafcVar;
                this.f22056b = zzacr.f21972t;
            } catch (zzaeh unused) {
                this.f22055a = zzafcVar;
                this.f22056b = zzacr.f21972t;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaem)) {
            return false;
        }
        zzaem zzaemVar = (zzaem) obj;
        zzafc zzafcVar = this.f22055a;
        zzafc zzafcVar2 = zzaemVar.f22055a;
        if (zzafcVar == null && zzafcVar2 == null) {
            return m9599b().equals(zzaemVar.m9599b());
        }
        if (zzafcVar != null && zzafcVar2 != null) {
            return zzafcVar.equals(zzafcVar2);
        }
        if (zzafcVar != null) {
            zzaemVar.m9600c(zzafcVar.mo9565a());
            return zzafcVar.equals(zzaemVar.f22055a);
        }
        m9600c(zzafcVar2.mo9565a());
        return this.f22055a.equals(zzafcVar2);
    }

    public int hashCode() {
        return 1;
    }
}
