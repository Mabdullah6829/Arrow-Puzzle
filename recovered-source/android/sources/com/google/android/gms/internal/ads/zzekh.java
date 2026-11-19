package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
final class zzekh implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzfos f14082a;

    public zzekh(zzeko zzekoVar, zzfos zzfosVar) {
        this.f14082a = zzfosVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3316a(Object obj) {
        try {
            this.f14082a.mo5874b((SQLiteDatabase) obj);
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("Error executing function on offline buffered ping database: ".concat(strValueOf));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        String strValueOf = String.valueOf(th.getMessage());
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3070c("Failed to get offline buffered ping database: ".concat(strValueOf));
    }
}
