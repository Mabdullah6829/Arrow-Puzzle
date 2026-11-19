package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzps {

    /* JADX INFO: renamed from: a */
    public final zzbd f20549a;

    /* JADX INFO: renamed from: b */
    public zzgwt f20550b;

    /* JADX INFO: renamed from: c */
    public zzgww f20551c;

    /* JADX INFO: renamed from: d */
    public zzxl f20552d;

    /* JADX INFO: renamed from: e */
    public zzxl f20553e;

    /* JADX INFO: renamed from: f */
    public zzxl f20554f;

    public zzps(zzbd zzbdVar) {
        this.f20549a = zzbdVar;
        zzgzi zzgziVar = zzgwt.f18303t;
        this.f20550b = zzgyo.f18355w;
        this.f20551c = zzgyt.f18367y;
    }

    /* JADX INFO: renamed from: c */
    public static zzxl m8810c(zzbb zzbbVar, zzgwt zzgwtVar, zzxl zzxlVar, zzbd zzbdVar) {
        zzbf zzbfVarMo4709f = zzbbVar.mo4709f();
        int iMo4714n = zzbbVar.mo4714n();
        Object objMo4740f = zzbfVarMo4709f.m4833g() ? null : zzbfVarMo4709f.mo4740f(iMo4714n);
        if (!zzbbVar.mo4715s() && !zzbfVarMo4709f.m4833g()) {
            zzbd zzbdVarMo4738d = zzbfVarMo4709f.mo4738d(iMo4714n, zzbdVar, false);
            zzbbVar.mo4712k();
            String str = zzfm.f16091a;
            zzbdVarMo4738d.getClass();
        }
        for (int i2 = 0; i2 < zzgwtVar.size(); i2++) {
            zzxl zzxlVar2 = (zzxl) zzgwtVar.get(i2);
            if (m8811d(zzxlVar2, objMo4740f, zzbbVar.mo4715s(), zzbbVar.mo4713l(), zzbbVar.mo4716x())) {
                return zzxlVar2;
            }
        }
        if (zzgwtVar.isEmpty() && zzxlVar != null && m8811d(zzxlVar, objMo4740f, zzbbVar.mo4715s(), zzbbVar.mo4713l(), zzbbVar.mo4716x())) {
            return zzxlVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m8811d(zzxl zzxlVar, Object obj, boolean z, int i2, int i3) {
        Object obj2 = zzxlVar.f21278a;
        int i4 = zzxlVar.f21279b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z) {
            return i4 == i2 && zzxlVar.f21280c == i3;
        }
        return i4 == -1 && zzxlVar.f21282e == -1;
    }

    /* JADX INFO: renamed from: a */
    public final void m8812a(zzbf zzbfVar) {
        zzgwv zzgwvVar = new zzgwv();
        if (this.f20550b.isEmpty()) {
            m8813b(zzgwvVar, this.f20553e, zzbfVar);
            if (!Objects.equals(this.f20554f, this.f20553e)) {
                m8813b(zzgwvVar, this.f20554f, zzbfVar);
            }
            if (!Objects.equals(this.f20552d, this.f20553e) && !Objects.equals(this.f20552d, this.f20554f)) {
                m8813b(zzgwvVar, this.f20552d, zzbfVar);
            }
        } else {
            for (int i2 = 0; i2 < this.f20550b.size(); i2++) {
                m8813b(zzgwvVar, (zzxl) this.f20550b.get(i2), zzbfVar);
            }
            if (!this.f20550b.contains(this.f20552d)) {
                m8813b(zzgwvVar, this.f20552d, zzbfVar);
            }
        }
        this.f20551c = zzgwvVar.m7228d(true);
    }

    /* JADX INFO: renamed from: b */
    public final void m8813b(zzgwv zzgwvVar, zzxl zzxlVar, zzbf zzbfVar) {
        if (zzxlVar == null) {
            return;
        }
        if (zzbfVar.mo4739e(zzxlVar.f21278a) != -1) {
            zzgwvVar.m7225a(zzxlVar, zzbfVar);
            return;
        }
        zzbf zzbfVar2 = (zzbf) this.f20551c.get(zzxlVar);
        if (zzbfVar2 != null) {
            zzgwvVar.m7225a(zzxlVar, zzbfVar2);
        }
    }
}
