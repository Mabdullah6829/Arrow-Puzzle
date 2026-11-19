package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbir implements zzbln {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SharedPreferences f7986a;

    public zzbir(zzbiv zzbivVar, SharedPreferences sharedPreferences) {
        this.f7986a = sharedPreferences;
        Objects.requireNonNull(zzbivVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    /* JADX INFO: renamed from: a */
    public final String mo5026a(String str, String str2) {
        return this.f7986a.getString(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    /* JADX INFO: renamed from: b */
    public final Long mo5027b(long j2, String str) {
        SharedPreferences sharedPreferences = this.f7986a;
        try {
            return Long.valueOf(sharedPreferences.getLong(str, j2));
        } catch (ClassCastException unused) {
            return Long.valueOf(sharedPreferences.getInt(str, (int) j2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    /* JADX INFO: renamed from: c */
    public final Double mo5028c(String str, double d) {
        SharedPreferences sharedPreferences = this.f7986a;
        try {
            return Double.valueOf(sharedPreferences.getFloat(str, (float) d));
        } catch (ClassCastException unused) {
            return Double.valueOf(sharedPreferences.getString(str, String.valueOf(d)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    /* JADX INFO: renamed from: d */
    public final Boolean mo5029d(String str, boolean z) {
        SharedPreferences sharedPreferences = this.f7986a;
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, z));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(z)));
        }
    }
}
