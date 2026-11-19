package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdyt implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzffc f13292a;

    /* JADX INFO: renamed from: b */
    public final zzini f13293b;

    /* JADX INFO: renamed from: c */
    public final zzind f13294c;

    public zzdyt(zzffc zzffcVar, zzcnz zzcnzVar, zzind zzindVar) {
        this.f13292a = zzffcVar;
        this.f13293b = zzcnzVar;
        this.f13294c = zzindVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Set setSingleton;
        final String str = this.f13292a.f15567a.f15561a.f9689z;
        zzinh.m8554a(str);
        Context contextM5709a = ((zzcnz) this.f13293b).m5709a();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        Map mapZzb = this.f13294c.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8460b6)).booleanValue()) {
            zzbhw zzbhwVar = new zzbhw(new zzbib(contextM5709a));
            zzbhwVar.m4894b(new zzbhv() { // from class: com.google.android.gms.internal.ads.zzdyu
                @Override // com.google.android.gms.internal.ads.zzbhv
                /* JADX INFO: renamed from: a */
                public final void mo4892a(zzbic.zzt.zza zzaVar) {
                    zzaVar.m8326l();
                    ((zzbic.zzt) zzaVar.f19780t).m4994E(str);
                }
            });
            setSingleton = Collections.singleton(new zzdky(new zzdyw(zzbhwVar, mapZzb), zzhcpVar));
        } else {
            setSingleton = Collections.EMPTY_SET;
        }
        zzinh.m8554a(setSingleton);
        return setSingleton;
    }
}
