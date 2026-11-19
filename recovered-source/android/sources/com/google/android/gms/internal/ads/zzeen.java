package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.browser.customtabs.CustomTabsClient;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeen implements zzdgf, zzdls, zzden, zzddt {

    /* JADX INFO: renamed from: s */
    public final Context f13754s;

    /* JADX INFO: renamed from: t */
    public final zzdzt f13755t;

    public zzeen(Context context, zzdzt zzdztVar) {
        this.f13754s = context;
        this.f13755t = zzdztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    /* JADX INFO: renamed from: a */
    public final void mo3343a(com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8042C5)).booleanValue()) {
            m6191b(this.f13754s);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6191b(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8866z5)).booleanValue()) {
            ((zzcfx) zzcfy.f9946a).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeem
                @Override // java.lang.Runnable
                public final void run() {
                    String packageName;
                    zzdzt zzdztVar = this.f13752s.f13755t;
                    zzbjw zzbjwVar = com.google.android.gms.ads.internal.zzt.f3698C.f3714n;
                    if (zzbjwVar.f8912s.getAndSet(true)) {
                        return;
                    }
                    Context context2 = context;
                    zzbjwVar.f8913t = context2;
                    zzbjwVar.f8914u = zzdztVar;
                    if (zzbjwVar.f8916w != null || (packageName = CustomTabsClient.getPackageName(context2, null)) == null || packageName.equals(context2.getPackageName())) {
                        return;
                    }
                    CustomTabsClient.bindCustomTabsService(context2, packageName, zzbjwVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzden
    /* JADX INFO: renamed from: c */
    public final void mo5833c() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8059D5)).booleanValue()) {
            m6191b(this.f13754s);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    /* JADX INFO: renamed from: n */
    public final void mo5838n() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8076E5)).booleanValue()) {
            m6191b(this.f13754s);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    /* JADX INFO: renamed from: s */
    public final void mo5866s(zzfky zzfkyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    /* JADX INFO: renamed from: y */
    public final void mo3344y(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    /* JADX INFO: renamed from: z */
    public final void mo5867z(zzcbk zzcbkVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8025B5)).booleanValue()) {
            m6191b(this.f13754s);
        }
    }
}
