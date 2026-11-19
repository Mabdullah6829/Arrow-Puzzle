package com.google.android.gms.internal.consent_sdk;

import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzpw implements zztb {

    /* JADX INFO: renamed from: a */
    public final zzpv f21723a;

    public zzpw(zzpv zzpvVar) {
        Charset charset = zzqs.f21747a;
        this.f21723a = zzpvVar;
        zzpvVar.f21722a = this;
    }

    /* JADX INFO: renamed from: a */
    public final void m9187a(int i2, int i3) {
        this.f21723a.mo9175u(i2, (i3 >> 31) ^ (i3 + i3));
    }

    /* JADX INFO: renamed from: b */
    public final void m9188b(int i2, long j2) {
        this.f21723a.mo9177w(i2, (j2 >> 63) ^ (j2 + j2));
    }

    /* JADX INFO: renamed from: c */
    public final void m9189c(int i2, List list) {
        boolean z = list instanceof zzrb;
        int i3 = 0;
        zzpv zzpvVar = this.f21723a;
        if (!z) {
            while (i3 < list.size()) {
                zzpvVar.mo9172r(i2, (String) list.get(i3));
                i3++;
            }
            return;
        }
        zzrb zzrbVar = (zzrb) list;
        while (i3 < list.size()) {
            Object objZza = zzrbVar.zza();
            if (objZza instanceof String) {
                zzpvVar.mo9172r(i2, (String) objZza);
            } else {
                zzpvVar.mo9163i(i2, (zzpm) objZza);
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9190d(int i2, int i3) {
        this.f21723a.mo9175u(i2, i3);
    }

    /* JADX INFO: renamed from: e */
    public final void m9191e(int i2, long j2) {
        this.f21723a.mo9177w(i2, j2);
    }

    /* JADX INFO: renamed from: f */
    public final void m9192f(int i2, boolean z) {
        this.f21723a.mo9161g(i2, z);
    }

    /* JADX INFO: renamed from: g */
    public final void m9193g(int i2, zzpm zzpmVar) {
        this.f21723a.mo9163i(i2, zzpmVar);
    }

    /* JADX INFO: renamed from: h */
    public final void m9194h(int i2, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f21723a.mo9163i(i2, (zzpm) list.get(i3));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m9195i(int i2, double d) {
        this.f21723a.mo9167m(i2, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: j */
    public final void m9196j(int i2, int i3) {
        this.f21723a.mo9169o(i2, i3);
    }

    /* JADX INFO: renamed from: k */
    public final void m9197k(int i2, int i3) {
        this.f21723a.mo9165k(i2, i3);
    }

    /* JADX INFO: renamed from: l */
    public final void m9198l(int i2, long j2) {
        this.f21723a.mo9167m(i2, j2);
    }

    /* JADX INFO: renamed from: m */
    public final void m9199m(float f2, int i2) {
        this.f21723a.mo9165k(i2, Float.floatToRawIntBits(f2));
    }

    /* JADX INFO: renamed from: n */
    public final void m9200n(int i2, Object obj, zzsa zzsaVar) {
        zzpv zzpvVar = this.f21723a;
        zzpvVar.mo9174t(i2, 3);
        zzsaVar.mo9248e((zzpa) obj, this);
        zzpvVar.mo9174t(i2, 4);
    }

    /* JADX INFO: renamed from: o */
    public final void m9201o(int i2, int i3) {
        this.f21723a.mo9169o(i2, i3);
    }

    /* JADX INFO: renamed from: p */
    public final void m9202p(int i2, long j2) {
        this.f21723a.mo9177w(i2, j2);
    }

    /* JADX INFO: renamed from: q */
    public final void m9203q(int i2, Object obj, zzsa zzsaVar) {
        zzpa zzpaVar = (zzpa) obj;
        zzpv zzpvVar = this.f21723a;
        zzpvVar.mo9174t(i2, 2);
        zzpvVar.mo9176v(zzpaVar.mo9144b(zzsaVar));
        zzsaVar.mo9248e(zzpaVar, this);
    }

    /* JADX INFO: renamed from: r */
    public final void m9204r(int i2, int i3) {
        this.f21723a.mo9165k(i2, i3);
    }

    /* JADX INFO: renamed from: s */
    public final void m9205s(int i2, long j2) {
        this.f21723a.mo9167m(i2, j2);
    }
}
