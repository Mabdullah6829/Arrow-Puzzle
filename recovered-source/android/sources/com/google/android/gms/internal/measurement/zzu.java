package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzu extends zzai {

    /* JADX INFO: renamed from: u */
    public final Callable f22920u;

    public zzu(Callable callable) {
        super("internal.appMetadata");
        this.f22920u = callable;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    /* JADX INFO: renamed from: c */
    public final zzao mo9793c(zzg zzgVar, List list) {
        try {
            return zzi.m10179a(this.f22920u.call());
        } catch (Exception unused) {
            return zzao.f22237k;
        }
    }
}
