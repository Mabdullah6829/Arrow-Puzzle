package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzru implements zzsa {

    /* JADX INFO: renamed from: a */
    public final zzrq f21786a;

    /* JADX INFO: renamed from: b */
    public final zzsp f21787b;

    /* JADX INFO: renamed from: c */
    public final boolean f21788c;

    /* JADX INFO: renamed from: d */
    public final zzqb f21789d;

    public zzru(zzsp zzspVar, zzqb zzqbVar, zzrq zzrqVar) {
        this.f21787b = zzspVar;
        this.f21788c = zzrqVar instanceof zzqk;
        this.f21789d = zzqbVar;
        this.f21786a = zzrqVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    /* JADX INFO: renamed from: a */
    public final void mo9244a(Object obj) {
        this.f21787b.mo9278a(obj);
        this.f21789d.mo9207a(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    /* JADX INFO: renamed from: b */
    public final int mo9245b(zzqm zzqmVar) {
        zzqmVar.zzc.getClass();
        if (this.f21788c) {
            return 26870523 + ((zzqk) zzqmVar).zzb.f21729a.hashCode();
        }
        return 506991;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    /* JADX INFO: renamed from: c */
    public final boolean mo9246c(zzqm zzqmVar, zzqm zzqmVar2) {
        if (!zzqmVar.zzc.equals(zzqmVar2.zzc)) {
            return false;
        }
        if (this.f21788c) {
            return ((zzqk) zzqmVar).zzb.equals(((zzqk) zzqmVar2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    /* JADX INFO: renamed from: d */
    public final int mo9247d(zzqm zzqmVar) {
        zzsq zzsqVar = zzqmVar.zzc;
        int i2 = zzsqVar.f21820b;
        if (i2 == -1) {
            zzsqVar.f21820b = 0;
            i2 = 0;
        }
        if (this.f21788c) {
            zzsd zzsdVar = ((zzqk) zzqmVar).zzb.f21729a;
            if (zzsdVar.f21813t > 0) {
                zzqf.m9211e(zzsdVar.m9272d(0));
                throw null;
            }
            Iterator it = zzsdVar.m9270b().iterator();
            if (it.hasNext()) {
                zzqf.m9211e((Map.Entry) it.next());
                throw null;
            }
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    /* JADX INFO: renamed from: e */
    public final void mo9248e(Object obj, zzpw zzpwVar) {
        Iterator itM9212b = ((zzqk) obj).zzb.m9212b();
        if (itM9212b.hasNext()) {
            ((zzqe) ((Map.Entry) itM9212b.next()).getKey()).zzc();
            throw null;
        }
        ((zzqm) obj).zzc.getClass();
    }
}
