package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaps implements zzaga {

    /* JADX INFO: renamed from: a */
    public final zzapt f6430a = new zzapt(null, 0, "audio/ac4");

    /* JADX INFO: renamed from: b */
    public final zzeu f6431b = new zzeu(16384);

    /* JADX INFO: renamed from: c */
    public boolean f6432c;

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: b */
    public final void mo4103b() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: g */
    public final void mo4104g(long j2, long j3) {
        this.f6432c = false;
        this.f6430a.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: h */
    public final boolean mo4105h(zzagb zzagbVar) throws EOFException, InterruptedIOException {
        zzafr zzafrVar;
        int i2;
        zzeu zzeuVar = new zzeu(10);
        int i3 = 0;
        while (true) {
            zzafrVar = (zzafr) zzagbVar;
            zzafrVar.mo4081K(zzeuVar.f14887a, 0, 10, false);
            zzeuVar.m6363E(0);
            if (zzeuVar.m6373O() != 4801587) {
                break;
            }
            zzeuVar.m6365G(3);
            int iM6381g = zzeuVar.m6381g();
            i3 += iM6381g + 10;
            zzafrVar.m4085f(iM6381g, false);
        }
        zzafrVar.f5216f = 0;
        zzafrVar.m4085f(i3, false);
        int i4 = 0;
        int i5 = i3;
        while (true) {
            int i6 = 7;
            zzafrVar.mo4081K(zzeuVar.f14887a, 0, 7, false);
            zzeuVar.m6363E(0);
            int iM6370L = zzeuVar.m6370L();
            if (iM6370L == 44096 || iM6370L == 44097) {
                i4++;
                if (i4 >= 4) {
                    return true;
                }
                byte[] bArr = zzeuVar.f14887a;
                if (bArr.length < 7) {
                    i2 = -1;
                } else {
                    int i7 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i7 == 65535) {
                        i7 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i6 = 4;
                    }
                    if (iM6370L == 44097) {
                        i6 += 2;
                    }
                    i2 = i7 + i6;
                }
                if (i2 == -1) {
                    break;
                }
                zzafrVar.m4085f(i2 - 7, false);
            } else {
                zzafrVar.f5216f = 0;
                i5++;
                if (i5 - i3 >= 8192) {
                    break;
                }
                zzafrVar.m4085f(i5, false);
                i4 = 0;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: i */
    public final void mo4106i(zzagd zzagdVar) {
        this.f6430a.mo4306d(zzagdVar, new zzaro(Integer.MIN_VALUE, 0, 1));
        zzagdVar.mo4110v();
        zzagdVar.mo4108d(new zzahc(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: j */
    public final int mo4107j(zzagb zzagbVar, zzaha zzahaVar) {
        zzeu zzeuVar = this.f6431b;
        int iMo4082b = zzagbVar.mo4082b(zzeuVar.f14887a, 0, 16384);
        if (iMo4082b == -1) {
            return -1;
        }
        zzeuVar.m6363E(0);
        zzeuVar.m6361C(iMo4082b);
        boolean z = this.f6432c;
        zzapt zzaptVar = this.f6430a;
        if (!z) {
            zzaptVar.f6446n = 0L;
            this.f6432c = true;
        }
        zzaptVar.mo4304b(zzeuVar);
        return 0;
    }
}
