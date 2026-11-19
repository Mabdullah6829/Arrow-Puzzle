package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyu implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzezu f15183a;

    /* JADX INFO: renamed from: b */
    public final zzini f15184b;

    public zzeyu(zzezu zzezuVar, zzini zziniVar) {
        this.f15183a = zzezuVar;
        this.f15184b = zziniVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0040  */
    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Object zzgzeVar;
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        zzezs zzezsVar = new zzezs(((zzcnz) this.f15183a.f15237a).m5709a(), zzhcpVar);
        Context contextM5709a = ((zzcnz) this.f15184b).m5709a();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8219Mc)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            if (com.google.android.gms.ads.internal.util.zzs.m3205d(contextM5709a)) {
                int i2 = zzgxd.f18323u;
                zzgzeVar = new zzgze(zzezsVar);
            } else {
                int i3 = zzgxd.f18323u;
                zzgzeVar = zzgyu.f18372B;
            }
        } else {
            int i4 = zzgxd.f18323u;
            zzgzeVar = zzgyu.f18372B;
        }
        zzinh.m8554a(zzgzeVar);
        return zzgzeVar;
    }
}
