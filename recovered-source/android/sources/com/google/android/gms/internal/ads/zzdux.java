package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdux implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Map f13031a;

    public zzdux(zzdvf zzdvfVar, Map map) {
        this.f13031a = map;
        Objects.requireNonNull(zzdvfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3316a(Object obj) {
        ((zzclb) obj).mo5129b("sendMessageToNativeJs", this.f13031a);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
    }
}
