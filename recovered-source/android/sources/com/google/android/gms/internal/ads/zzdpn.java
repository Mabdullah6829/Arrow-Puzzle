package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class zzdpn implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f12540a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzdpw f12541b;

    public zzdpn(zzdpw zzdpwVar, View view) {
        this.f12540a = view;
        this.f12541b = zzdpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo3316a(Object obj) {
        this.f12541b.m5988o(this.f12540a, (zzelv) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8697p6)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("omid native display exp", th);
        }
    }
}
