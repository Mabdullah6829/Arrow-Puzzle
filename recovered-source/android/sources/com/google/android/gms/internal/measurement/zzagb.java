package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzagb extends zzafz {
    @Override // com.google.android.gms.internal.measurement.zzafz
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9675a(Object obj, int i2, long j2) {
        ((zzaga) obj).m9689d(i2 << 3, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo9676b(int i2, int i3, Object obj) {
        ((zzaga) obj).m9689d((i2 << 3) | 5, Integer.valueOf(i3));
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo9677c(Object obj, int i2, long j2) {
        ((zzaga) obj).m9689d((i2 << 3) | 1, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo9678d(Object obj, int i2, zzacr zzacrVar) {
        ((zzaga) obj).m9689d((i2 << 3) | 2, zzacrVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ void mo9679e(int i2, Object obj, Object obj2) {
        ((zzaga) obj).m9689d((i2 << 3) | 3, (zzaga) obj2);
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zzaga mo9680f() {
        return zzaga.m9686a();
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    /* JADX INFO: renamed from: g */
    public final zzaga mo9681g(Object obj) {
        zzaga zzagaVar = (zzaga) obj;
        if (zzagaVar.f22126e) {
            zzagaVar.f22126e = false;
        }
        return zzagaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ zzaga mo9682h(Object obj) {
        zzadu zzaduVar = (zzadu) obj;
        zzaga zzagaVar = zzaduVar.zzc;
        if (zzagaVar != zzaga.f22121f) {
            return zzagaVar;
        }
        zzaga zzagaVarM9686a = zzaga.m9686a();
        zzaduVar.zzc = zzagaVarM9686a;
        return zzagaVarM9686a;
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void mo9683i(Object obj, Object obj2) {
        ((zzadu) obj).zzc = (zzaga) obj2;
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    /* JADX INFO: renamed from: j */
    public final void mo9684j(Object obj) {
        zzaga zzagaVar = ((zzadu) obj).zzc;
        if (zzagaVar.f22126e) {
            zzagaVar.f22126e = false;
        }
    }
}
