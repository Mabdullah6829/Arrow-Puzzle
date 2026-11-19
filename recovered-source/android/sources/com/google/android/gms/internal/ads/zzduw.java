package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzduw implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f13029a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzbpx f13030b;

    public zzduw(zzdvf zzdvfVar, String str, zzbpx zzbpxVar) {
        this.f13029a = str;
        this.f13030b = zzbpxVar;
        Objects.requireNonNull(zzdvfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3316a(Object obj) {
        ((zzclb) obj).mo5613r0(this.f13029a, this.f13030b);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
    }
}
