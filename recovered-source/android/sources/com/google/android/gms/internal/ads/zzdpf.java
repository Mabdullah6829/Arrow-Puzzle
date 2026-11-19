package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdpf implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f12527a;

    public zzdpf(zzcop zzcopVar) {
        this.f12527a = zzcopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        VersionInfoParcel versionInfoParcelM5711a = ((zzcop) this.f12527a).m5711a();
        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        return new zzbeu(UUID.randomUUID().toString(), versionInfoParcelM5711a, "native", new JSONObject(), true);
    }
}
