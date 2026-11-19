package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzcke implements zznh {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzckj f10324a;

    public /* synthetic */ zzcke(zzckj zzckjVar) {
        this.f10324a = zzckjVar;
    }

    /* JADX INFO: renamed from: a */
    public final zznc[] m5536a(Handler handler, zzaer zzaerVar, zzrx zzrxVar) {
        zzvy zzvyVar = zzvy.f21202a;
        Context context = this.f10324a.f10345u;
        zztn zztnVar = new zztn(context);
        zzgtr.m7133f(!zztnVar.f20886c);
        zztnVar.f20886c = true;
        if (zztnVar.f20889f == null) {
            zztnVar.f20889f = new zztp(new zzcp[0]);
        }
        if (zztnVar.f20888e == null) {
            if (zztnVar.f20890g == null) {
                zztnVar.f20890g = new zztk(context);
            }
            if (zztnVar.f20887d == null) {
                zztnVar.f20887d = zztm.f20883a;
            }
            zzte zzteVar = new zzte(context);
            zzqj zzqjVar = context != null ? null : zztnVar.f20885b;
            Context context2 = zzteVar.f20837a;
            if (context2 == null) {
                zzteVar.f20839c = zzqjVar;
            }
            zztk zztkVar = zztnVar.f20890g;
            zzteVar.f20840d = zztkVar;
            zzteVar.f20838b = zztnVar.f20887d;
            if (zztkVar == null) {
                zzteVar.f20840d = new zztk(context2);
            }
            zztnVar.f20888e = new zztg(zzteVar);
        } else {
            zzgtr.m7133f(zztnVar.f20890g == null);
            zzgtr.m7133f(zztnVar.f20887d == null);
        }
        zzua zzuaVar = new zzua(context, new zzve(context), zzvyVar, handler, zzrxVar, new zztu(zztnVar));
        zzade zzadeVar = new zzade(context);
        zzadeVar.f4960c = zzvyVar;
        zzadeVar.f4962e = handler;
        zzadeVar.f4963f = zzaerVar;
        zzgtr.m7133f(!zzadeVar.f4959b);
        Handler handler2 = zzadeVar.f4962e;
        zzgtr.m7133f((handler2 == null && zzadeVar.f4963f == null) || !(handler2 == null || zzadeVar.f4963f == null));
        zzadeVar.f4959b = true;
        return new zznc[]{zzuaVar, new zzadg(zzadeVar)};
    }
}
