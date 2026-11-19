package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzbc implements zzbe {

    /* JADX INFO: renamed from: a */
    public final zzg f22258a;

    /* JADX INFO: renamed from: b */
    public final String f22259b;

    public zzbc(zzg zzgVar, String str) {
        this.f22258a = zzgVar;
        this.f22259b = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzbe
    /* JADX INFO: renamed from: a */
    public final zzg mo9815a(zzao zzaoVar) {
        zzg zzgVarM9952c = this.f22258a.m9952c();
        String str = this.f22259b;
        zzgVarM9952c.m9955f(str, zzaoVar);
        zzgVarM9952c.f22496d.put(str, Boolean.TRUE);
        return zzgVarM9952c;
    }
}
