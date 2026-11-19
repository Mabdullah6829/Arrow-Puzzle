package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public class zzhmj implements zzhea {

    /* JADX INFO: renamed from: a */
    public final String f18979a;

    /* JADX INFO: renamed from: b */
    public final Class f18980b;

    /* JADX INFO: renamed from: c */
    public final zzhta f18981c;

    public zzhmj(String str, Class cls, zzhta zzhtaVar) {
        this.f18979a = str;
        this.f18980b = cls;
        this.f18981c = zzhtaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhea
    /* JADX INFO: renamed from: a */
    public final zzhtb mo7407a(zzidl zzidlVar) throws GeneralSecurityException {
        zzhtd zzhtdVarM7800H = zzhte.m7800H();
        zzhtdVarM7800H.m7796q(this.f18979a);
        zzhtdVarM7800H.m7797r(zzidlVar);
        zzhtdVarM7800H.m7798s(zzhtx.RAW);
        zzhte zzhteVar = (zzhte) zzhtdVarM7800H.m8328o();
        zzhoa zzhoaVar = new zzhoa(zzhteVar, zzhok.m7597b(zzhteVar.m7803D()));
        zzhne zzhneVar = zzhne.f19005b;
        zzhnz zzhnzVar = (zzhnz) zzhneVar.m7576f(zzhmv.f18992c.m7565b(zzhneVar.m7577g(zzhoaVar), null), zzhey.f18574a);
        zzhsz zzhszVarM7788G = zzhtb.m7788G();
        String str = zzhnzVar.f19030a;
        zzhszVarM7788G.m8326l();
        ((zzhtb) zzhszVarM7788G.f19780t).m7793I(str);
        zzidl zzidlVar2 = zzhnzVar.f19032c;
        zzhszVarM7788G.m8326l();
        ((zzhtb) zzhszVarM7788G.f19780t).m7794J(zzidlVar2);
        zzhta zzhtaVar = zzhnzVar.f19033d;
        zzhszVarM7788G.m8326l();
        ((zzhtb) zzhszVarM7788G.f19780t).m7795K(zzhtaVar);
        return (zzhtb) zzhszVarM7788G.m8328o();
    }

    @Override // com.google.android.gms.internal.ads.zzhea
    /* JADX INFO: renamed from: b */
    public final Object mo7408b(zzidl zzidlVar) throws GeneralSecurityException {
        return ((zzhnw) zzhnb.f19001b.f19002a.get()).m7587a(zzhne.f19005b.m7575e(zzhnz.m7588a(this.f18979a, zzidlVar, this.f18981c, zzhtx.RAW, null), zzhey.f18574a), this.f18980b);
    }

    @Override // com.google.android.gms.internal.ads.zzhea
    public final String zzb() {
        return this.f18979a;
    }

    @Override // com.google.android.gms.internal.ads.zzhea
    public final Class zzc() {
        return this.f18980b;
    }
}
