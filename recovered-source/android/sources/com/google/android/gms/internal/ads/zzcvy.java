package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzcvy implements zzden {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Context f11606s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ VersionInfoParcel f11607t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzfkn f11608u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzflg f11609v;

    public /* synthetic */ zzcvy(Context context, VersionInfoParcel versionInfoParcel, zzfkn zzfknVar, zzflg zzflgVar) {
        this.f11606s = context;
        this.f11607t = versionInfoParcel;
        this.f11608u = zzfknVar;
        this.f11609v = zzflgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    /* JADX INFO: renamed from: c */
    public final void mo5833c() {
        JSONObject jSONObject = this.f11608u.f15885C;
        com.google.android.gms.ads.internal.zzt.f3698C.f3715o.m3099d(this.f11606s, this.f11607t.f3396s, jSONObject.toString(), this.f11609v.f16043g);
    }
}
