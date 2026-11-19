package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzduc {

    /* JADX INFO: renamed from: a */
    public final zzflg f12957a;

    /* JADX INFO: renamed from: b */
    public final Executor f12958b;

    /* JADX INFO: renamed from: c */
    public final zzdwq f12959c;

    /* JADX INFO: renamed from: d */
    public final zzdvl f12960d;

    /* JADX INFO: renamed from: e */
    public final Context f12961e;

    /* JADX INFO: renamed from: f */
    public final zzdzt f12962f;

    /* JADX INFO: renamed from: g */
    public final zzfsm f12963g;

    /* JADX INFO: renamed from: h */
    public final zzeko f12964h;

    /* JADX INFO: renamed from: i */
    public final zzdzo f12965i;

    /* JADX INFO: renamed from: j */
    public final zzeaw f12966j;

    public zzduc(zzflg zzflgVar, Executor executor, zzdwq zzdwqVar, Context context, zzdzt zzdztVar, zzfsm zzfsmVar, zzeko zzekoVar, zzdvl zzdvlVar, zzdzo zzdzoVar, zzeaw zzeawVar) {
        this.f12957a = zzflgVar;
        this.f12958b = executor;
        this.f12959c = zzdwqVar;
        this.f12961e = context;
        this.f12962f = zzdztVar;
        this.f12963g = zzfsmVar;
        this.f12964h = zzekoVar;
        this.f12960d = zzdvlVar;
        this.f12965i = zzdzoVar;
        this.f12966j = zzeawVar;
    }

    /* JADX INFO: renamed from: b */
    public static final void m6060b(zzclb zzclbVar) {
        zzclbVar.mo5616v0("/videoClicked", zzbpw.f9228h);
        zzclm zzclmVarMo5582K = zzclbVar.mo5582K();
        synchronized (zzclmVarMo5582K.f10447v) {
            zzclmVarMo5582K.f10427J = true;
        }
        zzclbVar.mo5616v0("/getNativeAdViewSignals", zzbpw.f9239s);
        zzclbVar.mo5616v0("/getNativeClickMeta", zzbpw.f9240t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m6061a(zzclb zzclbVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcdu zzcduVar) {
        zzeaw zzeawVar;
        m6060b(zzclbVar);
        zzclbVar.mo5616v0("/video", zzbpw.f9232l);
        zzclbVar.mo5616v0("/videoMeta", zzbpw.f9233m);
        zzclbVar.mo5616v0("/precache", new zzcji());
        zzclbVar.mo5616v0("/delayPageLoaded", zzbpw.f9236p);
        zzclbVar.mo5616v0("/instrument", zzbpw.f9234n);
        zzclbVar.mo5616v0("/log", zzbpw.f9227g);
        zzclbVar.mo5616v0("/click", new zzbpr(null, 0 == true ? 1 : 0));
        if (this.f12957a.f16038b != null) {
            zzclbVar.mo5582K().m5638i(true);
            zzclbVar.mo5616v0("/open", new zzbqk(true != ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8537ff)).booleanValue() ? null : zzbVar, null, null, null, null, null));
        } else {
            zzclbVar.mo5582K().m5638i(false);
        }
        if (com.google.android.gms.ads.internal.zzt.f3698C.f3725y.m5361a(zzclbVar.getContext())) {
            HashMap map = new HashMap();
            if (zzclbVar.mo5565B() != null) {
                map = zzclbVar.mo5565B().f15961w0;
            }
            zzclbVar.mo5616v0("/logScionEvent", new zzbqd(zzclbVar.getContext(), map));
        }
        zzbio zzbioVar = zzbix.f8537ff;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            zzclbVar.mo5582K().f10432O = zzbVar;
            zzclbVar.mo5582K().f10434Q = zzcduVar;
        }
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8130H8)).booleanValue() || (zzeawVar = this.f12966j) == null) {
            return;
        }
        zzclbVar.mo5616v0("/onDeviceStorageEvent", new zzbqf(zzeawVar));
    }
}
