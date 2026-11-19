package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcse implements zzcsa {

    /* JADX INFO: renamed from: a */
    public final com.google.android.gms.ads.internal.util.zzg f11324a;

    public zzcse(com.google.android.gms.ads.internal.util.zzj zzjVar) {
        this.f11324a = zzjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsa
    /* JADX INFO: renamed from: a */
    public final void mo5814a(HashMap map) {
        this.f11324a.mo3155L(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
