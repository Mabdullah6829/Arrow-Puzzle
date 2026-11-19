package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzdrz implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzdsb f12768a;

    public zzdrz(zzdsb zzdsbVar) {
        this.f12768a = zzdsbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        try {
            zzclb zzclbVar = (zzclb) ((List) obj).get(0);
            if (zzclbVar != null) {
                zzdsb zzdsbVar = this.f12768a;
                zzdsbVar.getClass();
                zzdsbVar.f12776u.execute(new zzdsa(zzclbVar));
            }
        } catch (ClassCastException | IndexOutOfBoundsException e) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8697p6)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("omid native display exp", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8697p6)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("omid native display exp", th);
        }
    }
}
