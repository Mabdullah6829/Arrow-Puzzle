package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzbis implements zzguj {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ SharedPreferences f7987s;

    @Override // com.google.android.gms.internal.ads.zzguj
    public final /* synthetic */ Object zza() {
        return this.f7987s.getString("flag_configuration", "{}");
    }
}
