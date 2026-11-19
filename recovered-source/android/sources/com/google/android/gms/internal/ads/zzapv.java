package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzapv implements zzaga {

    /* JADX INFO: renamed from: a */
    public final zzapw f6448a;

    /* JADX INFO: renamed from: b */
    public final zzeu f6449b;

    /* JADX INFO: renamed from: c */
    public final zzeu f6450c;

    /* JADX INFO: renamed from: d */
    public final zzet f6451d;

    /* JADX INFO: renamed from: e */
    public zzagd f6452e;

    /* JADX INFO: renamed from: f */
    public long f6453f;

    /* JADX INFO: renamed from: g */
    public long f6454g;

    /* JADX INFO: renamed from: h */
    public boolean f6455h;

    /* JADX INFO: renamed from: i */
    public boolean f6456i;

    public zzapv() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: b */
    public final void mo4103b() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: g */
    public final void mo4104g(long j2, long j3) {
        this.f6455h = false;
        this.f6448a.zza();
        this.f6453f = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: h */
    public final boolean mo4105h(zzagb zzagbVar) throws EOFException, InterruptedIOException {
        zzeu zzeuVar;
        zzafr zzafrVar;
        int i2 = 0;
        while (true) {
            zzeuVar = this.f6450c;
            zzafrVar = (zzafr) zzagbVar;
            zzafrVar.mo4081K(zzeuVar.f14887a, 0, 10, false);
            zzeuVar.m6363E(0);
            if (zzeuVar.m6373O() != 4801587) {
                break;
            }
            zzeuVar.m6365G(3);
            int iM6381g = zzeuVar.m6381g();
            i2 += iM6381g + 10;
            zzafrVar.m4085f(iM6381g, false);
        }
        zzafrVar.f5216f = 0;
        zzafrVar.m4085f(i2, false);
        if (this.f6454g == -1) {
            this.f6454g = i2;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = i2;
        do {
            zzafrVar.mo4081K(zzeuVar.f14887a, 0, 2, false);
            zzeuVar.m6363E(0);
            if ((zzeuVar.m6370L() & 65526) == 65520) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                zzafrVar.mo4081K(zzeuVar.f14887a, 0, 4, false);
                zzet zzetVar = this.f6451d;
                zzetVar.m6341d(14);
                int iM6345h = zzetVar.m6345h(13);
                if (iM6345h <= 6) {
                    i5++;
                    zzafrVar.f5216f = 0;
                    zzafrVar.m4085f(i5, false);
                } else {
                    zzafrVar.m4085f(iM6345h - 6, false);
                    i4 += iM6345h;
                }
            } else {
                i5++;
                zzafrVar.f5216f = 0;
                zzafrVar.m4085f(i5, false);
            }
            i3 = 0;
            i4 = 0;
        } while (i5 - i2 < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: i */
    public final void mo4106i(zzagd zzagdVar) {
        this.f6452e = zzagdVar;
        this.f6448a.mo4306d(zzagdVar, new zzaro(Integer.MIN_VALUE, 0, 1));
        zzagdVar.mo4110v();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: j */
    public final int mo4107j(zzagb zzagbVar, zzaha zzahaVar) throws zzat {
        this.f6452e.getClass();
        zzeu zzeuVar = this.f6449b;
        int iMo4082b = zzagbVar.mo4082b(zzeuVar.f14887a, 0, 2048);
        if (!this.f6456i) {
            this.f6452e.mo4108d(new zzahc(-9223372036854775807L, 0L));
            this.f6456i = true;
        }
        if (iMo4082b == -1) {
            return -1;
        }
        zzeuVar.m6363E(0);
        zzeuVar.m6361C(iMo4082b);
        boolean z = this.f6455h;
        zzapw zzapwVar = this.f6448a;
        if (!z) {
            zzapwVar.f6478u = this.f6453f;
            this.f6455h = true;
        }
        zzapwVar.mo4304b(zzeuVar);
        return 0;
    }

    public zzapv(int i2) {
        this.f6448a = new zzapw(0, null, "audio/mp4a-latm", true);
        this.f6449b = new zzeu(2048);
        this.f6454g = -1L;
        zzeu zzeuVar = new zzeu(10);
        this.f6450c = zzeuVar;
        byte[] bArr = zzeuVar.f14887a;
        this.f6451d = new zzet(bArr, bArr.length);
    }
}
