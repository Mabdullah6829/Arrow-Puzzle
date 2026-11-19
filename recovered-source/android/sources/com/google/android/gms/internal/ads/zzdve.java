package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzdve implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final WeakReference f13059a;

    /* JADX INFO: renamed from: b */
    public final String f13060b;

    /* JADX INFO: renamed from: c */
    public final zzbpx f13061c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzdvf f13062d;

    public /* synthetic */ zzdve(zzdvf zzdvfVar, WeakReference weakReference, String str, zzbpx zzbpxVar) {
        this.f13062d = zzdvfVar;
        this.f13059a = weakReference;
        this.f13060b = str;
        this.f13061c = zzbpxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        Object obj2 = this.f13059a.get();
        if (obj2 == null) {
            this.f13062d.m6070c(this.f13060b, this);
        } else {
            this.f13061c.mo5095a(obj2, map);
        }
    }
}
