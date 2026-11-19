package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzeie implements zzhbn {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzfdu f13949a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzcbk f13950b;

    public /* synthetic */ zzeie(zzfdu zzfduVar, zzcbk zzcbkVar) {
        this.f13949a = zzfduVar;
        this.f13950b = zzcbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    /* JADX INFO: renamed from: b */
    public final ListenableFuture mo3248b(Object obj) throws JSONException {
        return this.f13949a.mo5729a().m6423a(this.f13950b.f9681E, com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a.m3049n((Bundle) obj));
    }
}
