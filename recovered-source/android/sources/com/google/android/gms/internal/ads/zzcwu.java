package com.google.android.gms.internal.ads;

import android.view.ViewParent;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcwu implements zzddt {

    /* JADX INFO: renamed from: s */
    public final zzclb f11642s;

    /* JADX INFO: renamed from: t */
    public final zzdzt f11643t;

    /* JADX INFO: renamed from: u */
    public final zzfkn f11644u;

    public zzcwu(zzclb zzclbVar, zzdzt zzdztVar, zzfkn zzfknVar) {
        this.f11642s = zzclbVar;
        this.f11643t = zzdztVar;
        this.f11644u = zzfknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    /* JADX INFO: renamed from: n */
    public final void mo5838n() {
        zzclb zzclbVar;
        String str;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8756se)).booleanValue() || (zzclbVar = this.f11642s) == null) {
            return;
        }
        for (ViewParent parent = zzclbVar.mo5577H().getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                str = "1";
                zzdzs zzdzsVarM6111a = this.f11643t.m6111a();
                zzdzsVarM6111a.m6107b("action", "hcp");
                zzdzsVarM6111a.m6107b("hcp", str);
                zzdzsVarM6111a.m6106a(this.f11644u);
                zzdzsVarM6111a.m6108c();
            }
        }
        str = "0";
        zzdzs zzdzsVarM6111a2 = this.f11643t.m6111a();
        zzdzsVarM6111a2.m6107b("action", "hcp");
        zzdzsVarM6111a2.m6107b("hcp", str);
        zzdzsVarM6111a2.m6106a(this.f11644u);
        zzdzsVarM6111a2.m6108c();
    }
}
