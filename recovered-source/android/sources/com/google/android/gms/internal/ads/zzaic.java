package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaic implements zzaga {

    /* JADX INFO: renamed from: a */
    public final zzeu f5406a = new zzeu(4);

    /* JADX INFO: renamed from: b */
    public final zzahf f5407b = new zzahf(-1, -1, "image/avif");

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: b */
    public final void mo4103b() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: g */
    public final void mo4104g(long j2, long j3) {
        this.f5407b.mo4104g(j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: h */
    public final boolean mo4105h(zzagb zzagbVar) throws EOFException, InterruptedIOException {
        zzafr zzafrVar = (zzafr) zzagbVar;
        zzafrVar.m4085f(4, false);
        zzeu zzeuVar = this.f5406a;
        zzeuVar.m6396y(4);
        zzafrVar.mo4081K(zzeuVar.f14887a, 0, 4, false);
        if (zzeuVar.m6374P() == 1718909296) {
            zzeuVar.m6396y(4);
            zzafrVar.mo4081K(zzeuVar.f14887a, 0, 4, false);
            if (zzeuVar.m6374P() == 1635150182) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: i */
    public final void mo4106i(zzagd zzagdVar) {
        this.f5407b.mo4106i(zzagdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: j */
    public final int mo4107j(zzagb zzagbVar, zzaha zzahaVar) {
        return this.f5407b.mo4107j(zzagbVar, zzahaVar);
    }
}
