package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzasc implements zzaga {

    /* JADX INFO: renamed from: a */
    public final zzeu f6825a = new zzeu(4);

    /* JADX INFO: renamed from: b */
    public final zzahf f6826b = new zzahf(-1, -1, "image/webp");

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: b */
    public final void mo4103b() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: g */
    public final void mo4104g(long j2, long j3) {
        this.f6826b.mo4104g(j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: h */
    public final boolean mo4105h(zzagb zzagbVar) throws EOFException, InterruptedIOException {
        zzeu zzeuVar = this.f6825a;
        zzeuVar.m6396y(4);
        zzafr zzafrVar = (zzafr) zzagbVar;
        zzafrVar.mo4081K(zzeuVar.f14887a, 0, 4, false);
        if (zzeuVar.m6374P() == 1380533830) {
            zzafrVar.m4085f(4, false);
            zzeuVar.m6396y(4);
            zzafrVar.mo4081K(zzeuVar.f14887a, 0, 4, false);
            if (zzeuVar.m6374P() == 1464156752) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: i */
    public final void mo4106i(zzagd zzagdVar) {
        this.f6826b.mo4106i(zzagdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: j */
    public final int mo4107j(zzagb zzagbVar, zzaha zzahaVar) {
        return this.f6826b.mo4107j(zzagbVar, zzahaVar);
    }
}
