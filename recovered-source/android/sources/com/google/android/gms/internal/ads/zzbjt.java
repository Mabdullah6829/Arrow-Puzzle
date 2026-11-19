package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;

/* JADX INFO: loaded from: classes2.dex */
final class zzbjt extends CustomTabsCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbjw f8908a;

    public zzbjt(zzbjw zzbjwVar) {
        this.f8908a = zzbjwVar;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(final int i2, Bundle bundle) {
        final zzbjw zzbjwVar = this.f8908a;
        zzbjwVar.getClass();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8849y5)).booleanValue() || zzbjwVar.f8914u == null) {
            return;
        }
        ((zzcfx) zzcfy.f9946a).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbju
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdzt zzdztVar = zzbjwVar.f8914u;
                if (zzdztVar != null) {
                    zzdzs zzdzsVarM6111a = zzdztVar.m6111a();
                    zzdzsVarM6111a.m6107b("action", "cct_nav");
                    zzdzsVarM6111a.m6107b("cct_navs", String.valueOf(i2));
                    zzdzsVarM6111a.m6108c();
                }
            }
        });
    }
}
