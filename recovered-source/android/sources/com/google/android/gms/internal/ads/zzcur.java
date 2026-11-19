package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcur implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f11513a;

    /* JADX INFO: renamed from: b */
    public final zzini f11514b;

    /* JADX INFO: renamed from: c */
    public final zzini f11515c;

    public zzcur(zzcop zzcopVar, zzimy zzimyVar, zzini zziniVar) {
        this.f11513a = zzcopVar;
        this.f11514b = zzimyVar;
        this.f11515c = zziniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        VersionInfoParcel versionInfoParcelM5711a = ((zzcop) this.f11513a).m5711a();
        JSONObject jSONObject = (JSONObject) this.f11514b.zzb();
        String str = (String) this.f11515c.zzb();
        boolean zEquals = "native".equals(str);
        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        return new zzbeu(UUID.randomUUID().toString(), versionInfoParcelM5711a, str, jSONObject, zEquals);
    }
}
