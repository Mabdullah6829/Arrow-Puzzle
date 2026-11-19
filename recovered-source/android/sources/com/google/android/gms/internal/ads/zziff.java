package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zziff {

    /* JADX INFO: renamed from: a */
    public final zzifz f19798a;

    /* JADX INFO: renamed from: b */
    public final zzidz f19799b;

    /* JADX INFO: renamed from: c */
    public volatile zzidl f19800c;

    /* JADX INFO: renamed from: d */
    public volatile zzifz f19801d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f19802e;

    public zziff(zzifz zzifzVar) {
        if (zzifzVar == null) {
            throw new IllegalArgumentException("message cannot be null");
        }
        this.f19801d = zzifzVar;
        this.f19798a = zzifzVar.mo8340b();
        zzidz zzidzVar = zzidz.f19758b;
        int i2 = zzicy.f19697a;
        this.f19799b = zzidz.f19759c;
        this.f19800c = null;
        this.f19802e = false;
    }

    /* JADX INFO: renamed from: a */
    public final zzifz m8357a() {
        try {
            if (this.f19801d == null) {
                synchronized (this) {
                    if (this.f19802e) {
                        throw new zzifh("Repeat access to corrupted lazy field");
                    }
                    try {
                        this.f19801d = this.f19798a.mo8341e().mo8107b(this.f19800c, this.f19799b);
                    } catch (zzifh e) {
                        this.f19802e = true;
                        throw e;
                    }
                }
            }
            return this.f19801d;
        } catch (zzifh unused) {
            zzidz zzidzVar = zzidz.f19758b;
            return this.f19798a;
        }
    }

    public final boolean equals(Object obj) {
        return m8357a().equals(obj);
    }

    public final int hashCode() {
        return m8357a().hashCode();
    }

    public final String toString() {
        return m8357a().toString();
    }
}
