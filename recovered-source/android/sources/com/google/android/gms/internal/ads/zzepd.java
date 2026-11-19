package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class zzepd extends zzepa {

    /* JADX INFO: renamed from: a */
    public final zzcnq f14478a;

    /* JADX INFO: renamed from: b */
    public final zzdci f14479b;

    /* JADX INFO: renamed from: c */
    public final zzerq f14480c;

    /* JADX INFO: renamed from: d */
    public final zzdiz f14481d;

    /* JADX INFO: renamed from: e */
    public final zzdof f14482e;

    /* JADX INFO: renamed from: f */
    public final zzdga f14483f;

    /* JADX INFO: renamed from: g */
    public final ViewGroup f14484g;

    /* JADX INFO: renamed from: h */
    public final zzdif f14485h;

    /* JADX INFO: renamed from: i */
    public final zzepl f14486i;

    /* JADX INFO: renamed from: j */
    public final zzemf f14487j;

    public zzepd(zzcnq zzcnqVar, zzdci zzdciVar, zzerq zzerqVar, zzdiz zzdizVar, zzdof zzdofVar, zzdga zzdgaVar, ViewGroup viewGroup, zzdif zzdifVar, zzepl zzeplVar, zzemf zzemfVar) {
        this.f14478a = zzcnqVar;
        this.f14479b = zzdciVar;
        this.f14480c = zzerqVar;
        this.f14481d = zzdizVar;
        this.f14482e = zzdofVar;
        this.f14483f = zzdgaVar;
        this.f14484g = viewGroup;
        this.f14485h = zzdifVar;
        this.f14486i = zzeplVar;
        this.f14487j = zzemfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepa
    /* JADX INFO: renamed from: c */
    public final zzfoz mo6305c(zzflg zzflgVar, Bundle bundle, zzfkn zzfknVar, zzfky zzfkyVar) {
        zzdci zzdciVar = this.f14479b;
        zzdciVar.f12022b = zzflgVar;
        zzdciVar.f12023c = bundle;
        zzdciVar.f12025e = new zzdcc(zzfkyVar, zzfknVar, this.f14486i);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8797v4)).booleanValue()) {
            zzdciVar.f12026f = this.f14487j;
        }
        zzcww zzcwwVarMo5693l = this.f14478a.mo5693l();
        ((zzcpl) zzcwwVarMo5693l).f10939e = new zzdcj(zzdciVar);
        zzcpl zzcplVar = (zzcpl) zzcwwVarMo5693l;
        zzcplVar.f10938d = this.f14481d;
        zzcplVar.f10940f = this.f14480c;
        zzcplVar.f10944j = this.f14482e;
        zzcplVar.f10941g = new zzcxs(this.f14483f, this.f14485h);
        zzcplVar.f10943i = new zzcvp(this.f14484g);
        zzcze zzczeVarMo5754b = zzcplVar.zzh().mo5754b();
        return zzczeVarMo5754b.m5877c(zzczeVarMo5754b.m5876b());
    }
}
