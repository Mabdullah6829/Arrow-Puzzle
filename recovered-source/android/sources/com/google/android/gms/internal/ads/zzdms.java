package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdms implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f12355a;

    /* JADX INFO: renamed from: b */
    public final zzini f12356b;

    /* JADX INFO: renamed from: c */
    public final zzcyr f12357c;

    /* JADX INFO: renamed from: d */
    public final zzini f12358d;

    public zzdms(zzimy zzimyVar, zzcop zzcopVar, zzcyr zzcyrVar, zzdcq zzdcqVar) {
        this.f12355a = zzimyVar;
        this.f12356b = zzcopVar;
        this.f12357c = zzcyrVar;
        this.f12358d = zzdcqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.f12355a.zzb();
        final VersionInfoParcel versionInfoParcelM5711a = ((zzcop) this.f12356b).m5711a();
        final zzfkn zzfknVarM5872a = this.f12357c.m5872a();
        final zzflg zzflgVarM5898a = ((zzdcq) this.f12358d).m5898a();
        return new zzdky(new zzden() { // from class: com.google.android.gms.internal.ads.zzdmk
            @Override // com.google.android.gms.internal.ads.zzden
            /* JADX INFO: renamed from: c */
            public final void mo5833c() {
                JSONObject jSONObject = zzfknVarM5872a.f15885C;
                com.google.android.gms.ads.internal.zzt.f3698C.f3715o.m3099d(context, versionInfoParcelM5711a.f3396s, jSONObject.toString(), zzflgVarM5898a.f16043g);
            }
        }, zzcfy.f9953h);
    }
}
