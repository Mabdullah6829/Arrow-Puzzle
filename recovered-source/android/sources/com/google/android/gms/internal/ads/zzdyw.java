package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdyw implements zzfpt {

    /* JADX INFO: renamed from: s */
    public final Map f13299s;

    /* JADX INFO: renamed from: t */
    public final zzbhw f13300t;

    public zzdyw(zzbhw zzbhwVar, Map map) {
        this.f13299s = map;
        this.f13300t = zzbhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    /* JADX INFO: renamed from: e */
    public final void mo6090e(zzfpm zzfpmVar, String str) {
        Map map = this.f13299s;
        if (map.containsKey(zzfpmVar)) {
            this.f13300t.m4895c(((zzdyv) map.get(zzfpmVar)).f13297b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    /* JADX INFO: renamed from: r */
    public final void mo6092r(zzfpm zzfpmVar, String str) {
        Map map = this.f13299s;
        if (map.containsKey(zzfpmVar)) {
            this.f13300t.m4895c(((zzdyv) map.get(zzfpmVar)).f13296a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    /* JADX INFO: renamed from: t */
    public final void mo6093t(zzfpm zzfpmVar, String str, Throwable th) {
        Map map = this.f13299s;
        if (map.containsKey(zzfpmVar)) {
            this.f13300t.m4895c(((zzdyv) map.get(zzfpmVar)).f13298c);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    /* JADX INFO: renamed from: g */
    public final void mo6091g(String str) {
    }
}
