package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zziz implements zznc, zzne {

    /* JADX INFO: renamed from: A */
    public zzzd f20054A;

    /* JADX INFO: renamed from: B */
    public zzv[] f20055B;

    /* JADX INFO: renamed from: C */
    public long f20056C;

    /* JADX INFO: renamed from: D */
    public long f20057D;

    /* JADX INFO: renamed from: F */
    public boolean f20059F;

    /* JADX INFO: renamed from: G */
    public boolean f20060G;

    /* JADX INFO: renamed from: I */
    public zzxl f20062I;

    /* JADX INFO: renamed from: K */
    public zznd f20064K;

    /* JADX INFO: renamed from: t */
    public final int f20066t;

    /* JADX INFO: renamed from: v */
    public zznf f20068v;

    /* JADX INFO: renamed from: w */
    public int f20069w;

    /* JADX INFO: renamed from: x */
    public zzqh f20070x;

    /* JADX INFO: renamed from: y */
    public zzdp f20071y;

    /* JADX INFO: renamed from: z */
    public int f20072z;

    /* JADX INFO: renamed from: s */
    public final Object f20065s = new Object();

    /* JADX INFO: renamed from: u */
    public final zzly f20067u = new zzly();

    /* JADX INFO: renamed from: E */
    public long f20058E = Long.MIN_VALUE;

    /* JADX INFO: renamed from: H */
    public zzbf f20061H = zzbf.f7725a;

    /* JADX INFO: renamed from: J */
    public long f20063J = -9223372036854775807L;

    public zziz(int i2) {
        this.f20066t = i2;
    }

    /* JADX INFO: renamed from: B */
    public final int m8580B(zzly zzlyVar, zzix zzixVar, int i2) {
        zzzd zzzdVar = this.f20054A;
        zzzdVar.getClass();
        int iMo9033a = zzzdVar.mo9033a(zzlyVar, zzixVar, i2);
        if (iMo9033a == -4) {
            int i3 = i2 & 1;
            if (zzixVar.m8564b(4)) {
                if (i3 == 0) {
                    this.f20058E = Long.MIN_VALUE;
                }
                return this.f20059F ? -4 : -3;
            }
            long j2 = zzixVar.f20049e + this.f20056C;
            zzixVar.f20049e = j2;
            if (i3 == 0) {
                this.f20058E = Math.max(this.f20058E, j2);
                return -4;
            }
        } else if (iMo9033a == -5) {
            zzv zzvVar = zzlyVar.f20351b;
            zzvVar.getClass();
            long j3 = zzvVar.f21066t;
            if (j3 != LocationRequestCompat.PASSIVE_INTERVAL) {
                zzt zztVar = new zzt(zzvVar);
                zztVar.f20807s = j3 + this.f20056C;
                zzlyVar.f20351b = new zzv(zztVar);
                return -5;
            }
        }
        return iMo9033a;
    }

    /* JADX INFO: renamed from: C */
    public final void m8581C() {
        zzxl zzxlVar;
        int iMo4739e;
        if (this.f20061H.m4833g() || (zzxlVar = this.f20062I) == null || (iMo4739e = this.f20061H.mo4739e(zzxlVar.f21278a)) == -1) {
            this.f20063J = -9223372036854775807L;
        } else {
            this.f20063J = this.f20061H.mo4738d(iMo4739e, new zzbd(), false).f7635d;
        }
    }

    /* JADX INFO: renamed from: D */
    public void mo3980D(boolean z, boolean z2) {
    }

    /* JADX INFO: renamed from: E */
    public void mo3981E(zzv[] zzvVarArr, long j2, long j3, zzxl zzxlVar) {
    }

    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: R */
    public final void mo8582R() {
        zzgtr.m7133f(this.f20072z == 1);
        this.f20072z = 2;
        mo4015q();
    }

    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: T */
    public final void mo8583T(zznf zznfVar, zzv[] zzvVarArr, zzzd zzzdVar, boolean z, boolean z2, long j2, long j3, zzxl zzxlVar) {
        zzgtr.m7133f(this.f20072z == 0);
        this.f20068v = zznfVar;
        this.f20062I = zzxlVar;
        this.f20072z = 1;
        mo3980D(z, z2);
        mo8586Z(zzvVarArr, zzzdVar, j2, j3, zzxlVar);
        this.f20059F = false;
        this.f20057D = j2;
        this.f20058E = j2;
        mo4013p(z, true, j2);
    }

    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: V */
    public final void mo8584V(zzbf zzbfVar) {
        if (Objects.equals(this.f20061H, zzbfVar)) {
            return;
        }
        this.f20061H = zzbfVar;
        m8581C();
        mo8600w();
    }

    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: Y */
    public final void mo8585Y(boolean z, long j2) {
        this.f20059F = false;
        this.f20057D = j2;
        this.f20058E = j2;
        if (!z) {
            zzzd zzzdVar = this.f20054A;
            zzzdVar.getClass();
            z = zzzdVar.mo9034f(j2 - this.f20056C) != 0;
        }
        mo4013p(false, z, j2);
    }

    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: Z */
    public final void mo8586Z(zzv[] zzvVarArr, zzzd zzzdVar, long j2, long j3, zzxl zzxlVar) {
        zzgtr.m7133f(!this.f20059F);
        this.f20054A = zzzdVar;
        this.f20062I = zzxlVar;
        m8581C();
        if (this.f20058E == Long.MIN_VALUE) {
            this.f20058E = j2;
        }
        this.f20055B = zzvVarArr;
        this.f20056C = j3;
        mo3981E(zzvVarArr, j2, j3, zzxlVar);
    }

    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: a */
    public final int mo8587a() {
        return this.f20072z;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: a0 */
    public final zzzd mo8588a0() {
        return this.f20054A;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: b0 */
    public final void mo8589b0(int i2, zzqh zzqhVar, zzdp zzdpVar) {
        this.f20069w = i2;
        this.f20070x = zzqhVar;
        this.f20071y = zzdpVar;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: c0 */
    public final boolean mo8590c0() {
        return this.f20058E == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: d */
    public zzmd mo8591d() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: e */
    public final boolean mo8592e() {
        return this.f20059F;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: f */
    public final void mo8593f() {
        zzgtr.m7133f(this.f20072z == 2);
        this.f20072z = 1;
        mo4018s();
    }

    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: g */
    public final void mo8594g() {
        zzzd zzzdVar = this.f20054A;
        zzzdVar.getClass();
        zzzdVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: h */
    public final void mo8595h() {
        zzgtr.m7133f(this.f20072z == 0);
        zzly zzlyVar = this.f20067u;
        zzlyVar.f20350a = null;
        zzlyVar.f20351b = null;
        mo4022u();
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    /* JADX INFO: renamed from: j */
    public void mo4007j(int i2, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzne
    /* JADX INFO: renamed from: k */
    public int mo8596k() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    /* JADX INFO: renamed from: l */
    public final void mo8597l(zznd zzndVar) {
        synchronized (this.f20065s) {
            this.f20064K = zzndVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: n */
    public final void mo8598n() {
        zzgtr.m7133f(this.f20072z == 1);
        zzly zzlyVar = this.f20067u;
        zzlyVar.f20350a = null;
        zzlyVar.f20351b = null;
        this.f20072z = 0;
        this.f20054A = null;
        this.f20055B = null;
        this.f20059F = false;
        mo4020t();
        this.f20062I = null;
        this.f20063J = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: p */
    public void mo4013p(boolean z, boolean z2, long j2) {
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public void mo4015q() {
    }

    @Override // com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: r */
    public final void mo8599r() {
        zzgtr.m7133f(this.f20072z == 0);
        mo4024v();
    }

    /* JADX INFO: renamed from: s */
    public void mo4018s() {
    }

    /* JADX INFO: renamed from: t */
    public void mo4020t() {
        throw null;
    }

    /* JADX INFO: renamed from: u */
    public void mo4022u() {
    }

    /* JADX INFO: renamed from: x */
    public final void m8601x() {
        this.f20068v.getClass();
    }

    /* JADX INFO: renamed from: y */
    public final zzjm m8602y(Exception exc, zzv zzvVar, boolean z, int i2) {
        int iMo8769b;
        if (zzvVar == null || this.f20060G) {
            iMo8769b = 4;
        } else {
            this.f20060G = true;
            try {
                iMo8769b = ((zzvw) this).mo8769b(zzvVar) & 7;
                this.f20060G = false;
            } catch (zzjm unused) {
                this.f20060G = false;
                iMo8769b = 4;
            } catch (Throwable th) {
                this.f20060G = false;
                throw th;
            }
        }
        return new zzjm(1, exc, i2, mo4011o(), this.f20069w, zzvVar, zzvVar == null ? 4 : iMo8769b, this.f20062I, z);
    }

    @Override // com.google.android.gms.internal.ads.zzne
    /* JADX INFO: renamed from: z */
    public final void mo8603z() {
        synchronized (this.f20065s) {
            this.f20064K = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznc, com.google.android.gms.internal.ads.zzne
    public final int zza() {
        return this.f20066t;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final long zzk() {
        return this.f20058E;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzl() {
        this.f20059F = true;
    }

    /* JADX INFO: renamed from: v */
    public void mo4024v() {
    }

    /* JADX INFO: renamed from: w */
    public void mo8600w() {
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final zziz zzb() {
        return this;
    }
}
