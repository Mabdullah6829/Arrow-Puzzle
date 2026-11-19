package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdzt {

    /* JADX INFO: renamed from: a */
    public final zzdzy f13424a;

    /* JADX INFO: renamed from: b */
    public final Executor f13425b;

    /* JADX INFO: renamed from: c */
    public final HashMap f13426c;

    public zzdzt(zzdzy zzdzyVar, Executor executor) {
        this.f13424a = zzdzyVar;
        zzdzyVar.getClass();
        this.f13426c = new HashMap(zzdzyVar.f13443a);
        this.f13425b = executor;
    }

    /* JADX INFO: renamed from: a */
    public final zzdzs m6111a() {
        zzdzs zzdzsVar = new zzdzs(this);
        zzdzsVar.f13422a.putAll(this.f13426c);
        return zzdzsVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m6112b() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8467bd)).booleanValue()) {
            zzdzs zzdzsVarM6111a = m6111a();
            zzdzsVarM6111a.m6107b("action", "pecr");
            zzdzsVarM6111a.m6108c();
        }
    }
}
