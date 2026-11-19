package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzapp implements zzaga {

    /* JADX INFO: renamed from: a */
    public final zzapq f6412a = new zzapq(null, 0, "audio/ac3");

    /* JADX INFO: renamed from: b */
    public final zzeu f6413b = new zzeu(2786);

    /* JADX INFO: renamed from: c */
    public boolean f6414c;

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: b */
    public final void mo4103b() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: g */
    public final void mo4104g(long j2, long j3) {
        this.f6414c = false;
        this.f6412a.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: h */
    public final boolean mo4105h(zzagb zzagbVar) throws EOFException, InterruptedIOException {
        zzafr zzafrVar;
        int iM4056a;
        zzeu zzeuVar = new zzeu(10);
        int i2 = 0;
        while (true) {
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
        int i3 = 0;
        int i4 = i2;
        while (true) {
            zzafrVar.mo4081K(zzeuVar.f14887a, 0, 6, false);
            zzeuVar.m6363E(0);
            if (zzeuVar.m6370L() != 2935) {
                zzafrVar.f5216f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                zzafrVar.m4085f(i4, false);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = zzeuVar.f14887a;
                if (bArr.length < 6) {
                    iM4056a = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    int i5 = (((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1;
                    iM4056a = i5 + i5;
                } else {
                    byte b = bArr[4];
                    iM4056a = zzafa.m4056a((b & 192) >> 6, b & 63);
                }
                if (iM4056a == -1) {
                    break;
                }
                zzafrVar.m4085f(iM4056a - 6, false);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: i */
    public final void mo4106i(zzagd zzagdVar) {
        this.f6412a.mo4306d(zzagdVar, new zzaro(Integer.MIN_VALUE, 0, 1));
        zzagdVar.mo4110v();
        zzagdVar.mo4108d(new zzahc(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: j */
    public final int mo4107j(zzagb zzagbVar, zzaha zzahaVar) {
        zzeu zzeuVar = this.f6413b;
        int iMo4082b = zzagbVar.mo4082b(zzeuVar.f14887a, 0, 2786);
        if (iMo4082b == -1) {
            return -1;
        }
        zzeuVar.m6363E(0);
        zzeuVar.m6361C(iMo4082b);
        boolean z = this.f6414c;
        zzapq zzapqVar = this.f6412a;
        if (!z) {
            zzapqVar.f6428n = 0L;
            this.f6414c = true;
        }
        zzapqVar.mo4304b(zzeuVar);
        return 0;
    }
}
