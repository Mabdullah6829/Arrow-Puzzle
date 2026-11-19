package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzdou implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final WeakReference f12452a;

    /* JADX INFO: renamed from: b */
    public final zzfsm f12453b;

    /* JADX INFO: renamed from: c */
    public final com.google.android.gms.ads.internal.util.client.zzv f12454c;

    /* JADX INFO: renamed from: d */
    public final zzfqq f12455d;

    public /* synthetic */ zzdou(zzdov zzdovVar, zzfsm zzfsmVar, com.google.android.gms.ads.internal.util.client.zzv zzvVar, zzfqq zzfqqVar) {
        this.f12452a = new WeakReference(zzdovVar);
        this.f12453b = zzfsmVar;
        this.f12454c = zzvVar;
        this.f12455d = zzfqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        zzdov zzdovVar = (zzdov) this.f12452a.get();
        String str = (String) map.get("u");
        if (zzdovVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f12453b.m6643b(str, this.f12454c, this.f12455d, zzdovVar.f12477V);
    }
}
