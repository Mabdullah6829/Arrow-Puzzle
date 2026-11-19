package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcsc implements zzcsa {

    /* JADX INFO: renamed from: a */
    public final com.google.android.gms.ads.internal.util.zzg f11322a;

    public zzcsc(com.google.android.gms.ads.internal.util.zzj zzjVar) {
        this.f11322a = zzjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsa
    /* JADX INFO: renamed from: a */
    public final void mo5814a(HashMap map) {
        this.f11322a.mo3166d0(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
