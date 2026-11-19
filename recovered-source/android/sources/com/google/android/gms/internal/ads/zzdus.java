package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdus implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final zzbnm f13019a;

    /* JADX INFO: renamed from: b */
    public final zzdvf f13020b;

    /* JADX INFO: renamed from: c */
    public final zzimt f13021c;

    public zzdus(zzdql zzdqlVar, zzdqb zzdqbVar, zzdvf zzdvfVar, zzimt zzimtVar) {
        this.f13019a = (zzbnm) zzdqlVar.f12660g.get(zzdqbVar.m6004g());
        this.f13020b = zzdvfVar;
        this.f13021c = zzimtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.f13019a.mo5074y1((zzbnc) this.f13021c.zzb(), str);
        } catch (RemoteException e) {
            String strM2450q = AbstractC1456a.m2450q(new StringBuilder(String.valueOf(str).length() + 40), "Failed to call onCustomClick for asset ", str, ".");
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g(strM2450q, e);
        }
    }
}
