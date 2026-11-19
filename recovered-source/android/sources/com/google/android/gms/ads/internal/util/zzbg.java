package com.google.android.gms.ads.internal.util;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatu;

/* JADX INFO: loaded from: classes.dex */
final class zzbg implements zzatp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f3525a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzbi f3526b;

    public zzbg(zzbl zzblVar, String str, zzbi zzbiVar) {
        this.f3525a = str;
        this.f3526b = zzbiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    /* JADX INFO: renamed from: a */
    public final void mo3110a(zzatu zzatuVar) {
        String string = zzatuVar.toString();
        String str = this.f3525a;
        String strM2451r = AbstractC1456a.m2451r(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length()), "Failed to load URL: ", str, "\n", string);
        int i2 = zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3073f(strM2451r);
        this.f3526b.m5397a(null);
    }
}
