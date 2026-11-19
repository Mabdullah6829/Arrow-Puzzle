package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzdot implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final WeakReference f12450a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f12451b;

    public zzdot(zzdov zzdovVar, View view) {
        this.f12450a = new WeakReference(zzdovVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8756se)).booleanValue()) {
            this.f12451b = new WeakReference(view);
        } else {
            this.f12451b = new WeakReference(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        String str;
        zzdov zzdovVar = (zzdov) this.f12450a.get();
        if (zzdovVar == null) {
            return;
        }
        zzdovVar.f12487y.m5905u();
        zzbio zzbioVar = zzbix.f8756se;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            View view = (View) this.f12451b.get();
            zzfkn zzfknVar = zzdovVar.f12457B;
            zzdrc zzdrcVar = zzdovVar.f12478W;
            zzdrcVar.getClass();
            if (!((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() || view == null) {
                return;
            }
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                    str = "1";
                    zzdzs zzdzsVarM6111a = zzdrcVar.f12717a.m6111a();
                    zzdzsVarM6111a.m6107b("action", "hcp");
                    zzdzsVarM6111a.m6107b("hcp", str);
                    zzdzsVarM6111a.m6106a(zzfknVar);
                    zzdzsVarM6111a.m6108c();
                }
            }
            str = "0";
            zzdzs zzdzsVarM6111a2 = zzdrcVar.f12717a.m6111a();
            zzdzsVarM6111a2.m6107b("action", "hcp");
            zzdzsVarM6111a2.m6107b("hcp", str);
            zzdzsVarM6111a2.m6106a(zzfknVar);
            zzdzsVarM6111a2.m6108c();
        }
    }
}
