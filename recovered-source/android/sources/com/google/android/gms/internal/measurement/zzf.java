package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzf {

    /* JADX INFO: renamed from: a */
    public final zzaw f22485a;

    /* JADX INFO: renamed from: b */
    public final zzg f22486b;

    /* JADX INFO: renamed from: c */
    public final zzg f22487c;

    /* JADX INFO: renamed from: d */
    public final zzj f22488d;

    public zzf() {
        zzaw zzawVar = new zzaw();
        this.f22485a = zzawVar;
        zzg zzgVar = new zzg(null, zzawVar);
        this.f22487c = zzgVar;
        this.f22486b = zzgVar.m9952c();
        zzj zzjVar = new zzj();
        this.f22488d = zzjVar;
        zzgVar.m9954e("require", new zzw(zzjVar));
        zzjVar.f22522a.put("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.zze
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzy();
            }
        });
        zzgVar.m9954e("runtime.counter", new zzah(Double.valueOf(0.0d)));
    }

    /* JADX INFO: renamed from: a */
    public final zzao m9874a(zzg zzgVar, zzje... zzjeVarArr) {
        zzao zzaoVarM10180b = zzao.f22237k;
        for (zzje zzjeVar : zzjeVarArr) {
            zzaoVarM10180b = zzi.m10180b(zzjeVar);
            zzh.m10013k(this.f22487c);
            if ((zzaoVarM10180b instanceof zzap) || (zzaoVarM10180b instanceof zzan)) {
                zzaoVarM10180b = this.f22485a.m9808b(zzgVar, zzaoVarM10180b);
            }
        }
        return zzaoVarM10180b;
    }
}
