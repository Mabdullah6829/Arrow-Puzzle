package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzehv {

    /* JADX INFO: renamed from: a */
    public final zzhcp f13931a;

    /* JADX INFO: renamed from: b */
    public final zzhcp f13932b;

    /* JADX INFO: renamed from: c */
    public final zzimt f13933c;

    /* JADX INFO: renamed from: d */
    public final VersionInfoParcel f13934d;

    /* JADX INFO: renamed from: e */
    public final zzehr f13935e;

    /* JADX INFO: renamed from: f */
    public final zzdzt f13936f;

    public zzehv(Context context, zzhcp zzhcpVar, zzhcp zzhcpVar2, zzimt zzimtVar, VersionInfoParcel versionInfoParcel, zzehr zzehrVar, zzdzt zzdztVar) {
        this.f13931a = zzhcpVar;
        this.f13932b = zzhcpVar2;
        this.f13933c = zzimtVar;
        this.f13934d = versionInfoParcel;
        this.f13935e = zzehrVar;
        this.f13936f = zzdztVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m6218a() {
        try {
            ((zzeiq) this.f13933c.zzb()).mo5299p0(this.f13934d.f3396s);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8052Cf)).booleanValue()) {
                zzdzs zzdzsVarM6111a = this.f13936f.m6111a();
                zzdzsVarM6111a.m6107b("action", "ptard");
                zzdzsVarM6111a.m6107b("ptard", "l");
                zzdzsVarM6111a.m6108c();
            }
        } catch (RemoteException | NullPointerException e) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8069Df)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("Preconnect Local", e);
            }
        }
    }
}
