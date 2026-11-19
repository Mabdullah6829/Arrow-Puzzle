package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzbif implements zzguj {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ SharedPreferences f7975s;

    @Override // com.google.android.gms.internal.ads.zzguj
    public final /* synthetic */ Object zza() {
        return this.f7975s.getString("flag_configuration", "{}");
    }
}
