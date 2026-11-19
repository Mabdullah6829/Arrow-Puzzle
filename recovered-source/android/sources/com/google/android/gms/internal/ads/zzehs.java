package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final class zzehs implements zzege {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzehv f13928a;

    public zzehs(zzehv zzehvVar) {
        this.f13928a = zzehvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzege
    /* JADX INFO: renamed from: a */
    public final void mo6204a(RemoteException remoteException) {
        this.f13928a.m6218a();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8069Df)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("Preconnect Remote", remoteException);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzege
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8052Cf)).booleanValue()) {
            zzdzs zzdzsVarM6111a = this.f13928a.f13936f.m6111a();
            zzdzsVarM6111a.m6107b("action", "ptard");
            zzdzsVarM6111a.m6107b("ptard", "r");
            zzdzsVarM6111a.m6108c();
        }
    }
}
