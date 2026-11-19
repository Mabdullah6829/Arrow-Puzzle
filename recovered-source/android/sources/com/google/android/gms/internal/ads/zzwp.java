package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.EOFException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwp implements zzye {

    /* JADX INFO: renamed from: a */
    public final zzagg f21225a;

    /* JADX INFO: renamed from: b */
    public zzaga f21226b;

    /* JADX INFO: renamed from: c */
    public zzafr f21227c;

    public zzwp(zzagg zzaggVar) {
        this.f21225a = zzaggVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    @Override // com.google.android.gms.internal.ads.zzye
    /* JADX INFO: renamed from: a */
    public final void mo8992a(zzhr zzhrVar, Uri uri, Map map, long j2, long j3, zzagd zzagdVar) throws zzzp {
        zzafr zzafrVar = new zzafr(zzhrVar, j2, j3);
        this.f21227c = zzafrVar;
        if (this.f21226b != null) {
            return;
        }
        zzaga[] zzagaVarArrMo4093a = this.f21225a.mo4093a(uri, map);
        int length = zzagaVarArrMo4093a.length;
        zzgzi zzgziVar = zzgwt.f18303t;
        zzgvp.m7175b(length, "expectedSize");
        zzgwq zzgwqVar = new zzgwq(length);
        boolean z = true;
        if (length == 1) {
            this.f21226b = zzagaVarArrMo4093a[0];
        } else {
            for (zzaga zzagaVar : zzagaVarArrMo4093a) {
                try {
                    if (zzagaVar.mo4105h(zzafrVar)) {
                        this.f21226b = zzagaVar;
                        zzafrVar.f5216f = 0;
                        break;
                    }
                    zzgwqVar.m7204d(zzagaVar.zzb());
                    boolean z2 = this.f21226b != null || zzafrVar.f5214d == j2;
                    zzgtr.m7133f(z2);
                    zzafrVar.f5216f = 0;
                } catch (EOFException unused) {
                    if (this.f21226b != null || zzafrVar.f5214d == j2) {
                    }
                } catch (Throwable th) {
                    if (this.f21226b == null && zzafrVar.f5214d != j2) {
                        z = false;
                    }
                    zzgtr.m7133f(z);
                    zzafrVar.f5216f = 0;
                    throw th;
                }
                zzgtr.m7133f(z2);
                zzafrVar.f5216f = 0;
            }
            if (this.f21226b == null) {
                Iterator it = zzgxt.m7251b(zzgwt.m7221u(zzagaVarArrMo4093a), new zzgti() { // from class: com.google.android.gms.internal.ads.zzwo
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final /* synthetic */ Object apply(Object obj) {
                        zzaga zzagaVar2 = (zzaga) obj;
                        zzagaVar2.getClass();
                        return zzagaVar2.getClass().getSimpleName();
                    }
                }).iterator();
                StringBuilder sb = new StringBuilder();
                zzgtl.m7126a(sb, it, ", ");
                String string = sb.toString();
                throw new zzzp(AbstractC1456a.m2450q(new StringBuilder(string.length() + 58), "None of the available extractors (", string, ") could read the stream."), zzgwqVar.m7214f());
            }
        }
        this.f21226b.mo4106i(zzagdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzye
    /* JADX INFO: renamed from: b */
    public final int mo8993b(zzaha zzahaVar) {
        zzafr zzafrVar;
        zzaga zzagaVar = this.f21226b;
        if (zzagaVar == null || (zzafrVar = this.f21227c) == null) {
            throw null;
        }
        return zzagaVar.mo4107j(zzafrVar, zzahaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzye
    /* JADX INFO: renamed from: d */
    public final long mo8994d() {
        zzafr zzafrVar = this.f21227c;
        if (zzafrVar != null) {
            return zzafrVar.f5214d;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    /* JADX INFO: renamed from: g */
    public final void mo8995g(long j2, long j3) {
        zzaga zzagaVar = this.f21226b;
        zzagaVar.getClass();
        zzagaVar.mo4104g(j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void zzb() {
        zzaga zzagaVar = this.f21226b;
        if (zzagaVar != null) {
            zzagaVar.mo4103b();
            this.f21226b = null;
        }
        this.f21227c = null;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void zzc() {
        zzaga zzagaVar = this.f21226b;
        if (zzagaVar != null && (zzagaVar instanceof zzaku)) {
            ((zzaku) zzagaVar).f5768q = true;
        }
    }
}
