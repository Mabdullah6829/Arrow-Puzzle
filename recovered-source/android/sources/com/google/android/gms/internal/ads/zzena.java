package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzena implements zzema {

    /* JADX INFO: renamed from: a */
    public final zzcwx f14258a;

    /* JADX INFO: renamed from: b */
    public final Context f14259b;

    /* JADX INFO: renamed from: c */
    public final zzdwq f14260c;

    /* JADX INFO: renamed from: d */
    public final zzflg f14261d;

    /* JADX INFO: renamed from: e */
    public final Executor f14262e;

    /* JADX INFO: renamed from: f */
    public final zzgti f14263f;

    /* JADX INFO: renamed from: g */
    public final zzdzo f14264g;

    public zzena(zzcwx zzcwxVar, Context context, Executor executor, zzdwq zzdwqVar, zzflg zzflgVar, zzgti zzgtiVar, zzdzo zzdzoVar) {
        this.f14259b = context;
        this.f14258a = zzcwxVar;
        this.f14262e = executor;
        this.f14260c = zzdwqVar;
        this.f14261d = zzflgVar;
        this.f14263f = zzgtiVar;
        this.f14264g = zzdzoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo6284a(final zzfky zzfkyVar, final zzfkn zzfknVar) {
        return zzhcf.m7374h(zzhcj.f18518t, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzemz
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj) throws zzclq {
                final zzena zzenaVar = this.f14254a;
                Executor executor = zzenaVar.f14262e;
                zzdzo zzdzoVar = zzenaVar.f14264g;
                zzbio zzbioVar = zzbix.f8209M2;
                zzbiv zzbivVar = com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c;
                if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
                    AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar, "rendering-webview-creation-start");
                }
                Context context = zzenaVar.f14259b;
                zzfkn zzfknVar2 = zzfknVar;
                com.google.android.gms.ads.internal.client.zzr zzrVarM6490a = zzflm.m6490a(context, zzfknVar2.f15956u);
                zzdwq zzdwqVar = zzenaVar.f14260c;
                zzfky zzfkyVar2 = zzfkyVar;
                final zzclb zzclbVarM6077a = zzdwqVar.m6077a(zzrVarM6490a, zzfknVar2, zzfkyVar2.f16006b.f16002b);
                zzclbVarM6077a.mo5569A0(zzfknVar2.f15912W);
                View viewM5861a = (((Boolean) zzbivVar.m5030a(zzbix.f8381W8)).booleanValue() && zzfknVar2.f15929g0) ? zzcxm.m5861a(context, zzclbVarM6077a.mo5577H(), zzfknVar2) : new zzdwt(context, zzclbVarM6077a.mo5577H(), (com.google.android.gms.ads.internal.util.zzat) zzenaVar.f14263f.apply(zzfknVar2));
                if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
                    AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar, "rendering-webview-creation-end");
                }
                zzcwx zzcwxVar = zzenaVar.f14258a;
                final zzcvt zzcvtVarMo5756d = zzcwxVar.mo5756d(new zzcyq(zzfkyVar2, zzfknVar2, null), new zzcvz(viewM5861a, zzclbVarM6077a, new zzcxy() { // from class: com.google.android.gms.internal.ads.zzemv
                    @Override // com.google.android.gms.internal.ads.zzcxy
                    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zza() {
                        return zzclbVarM6077a.zzh();
                    }
                }, zzrVarM6490a.f3249A ? new zzfko(-3, 0, true) : new zzfko(zzrVarM6490a.f3261w, zzrVarM6490a.f3258t, false)));
                if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
                    AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar, "rendering-ad-component-creation-end");
                }
                zzcvtVarMo5756d.mo5748h().m6076a(zzclbVarM6077a, false, null, zzdzoVar);
                zzddr zzddrVarMo5734c = zzcvtVarMo5756d.mo5734c();
                zzddt zzddtVar = new zzddt() { // from class: com.google.android.gms.internal.ads.zzemw
                    @Override // com.google.android.gms.internal.ads.zzddt
                    /* JADX INFO: renamed from: n */
                    public final /* synthetic */ void mo5838n() {
                        zzclb zzclbVar = zzclbVarM6077a;
                        if (zzclbVar.mo5582K() != null) {
                            zzclbVar.mo5582K().m5629L();
                        }
                    }
                };
                zzhcp zzhcpVar = zzcfy.f9953h;
                zzddrVarMo5734c.m5924Y(zzddtVar, zzhcpVar);
                zzfks zzfksVar = zzfknVar2.f15952s;
                String strM5672a = zzfksVar.f15992a;
                if (((Boolean) zzbivVar.m5030a(zzbix.f8612k6)).booleanValue() && ((zzelt) ((zzcpk) zzcvtVarMo5756d).f10920l.zzb()).m6279a()) {
                    strM5672a = zzcms.m5672a(strM5672a, zzcms.m5673b(zzfknVar2));
                }
                zzcvtVarMo5756d.mo5748h();
                zzcgd zzcgdVarM6075b = zzdwp.m6075b(zzclbVarM6077a, zzfksVar.f15993b, strM5672a, zzdzoVar, zzcwxVar.mo5755c());
                if (zzfknVar2.f15902M) {
                    zzcgdVarM6075b.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemu
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzclbVarM6077a.mo5588R();
                        }
                    }, executor);
                }
                zzcgdVarM6075b.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzclb zzclbVar = zzclbVarM6077a;
                        zzclbVar.mo5573D0();
                        zzflg zzflgVar = zzenaVar.f14261d;
                        zzcmh zzcmhVarZzh = zzclbVar.zzh();
                        com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzflgVar.f16037a;
                        if (zzfwVar != null && zzcmhVarZzh != null) {
                            zzcmhVarZzh.m5669l4(zzfwVar);
                        }
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8276Q1)).booleanValue() || zzclbVar.isAttachedToWindow()) {
                            return;
                        }
                        zzclbVar.onPause();
                        zzclbVar.mo5571C0();
                    }
                }, executor);
                return zzhcf.m7375i(zzcgdVarM6075b, new zzgti() { // from class: com.google.android.gms.internal.ads.zzemy
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final /* synthetic */ Object apply(Object obj2) {
                        return zzcvtVarMo5756d.mo5747g();
                    }
                }, zzhcpVar);
            }
        }, this.f14262e);
    }

    @Override // com.google.android.gms.internal.ads.zzema
    /* JADX INFO: renamed from: b */
    public final boolean mo6285b(zzfky zzfkyVar, zzfkn zzfknVar) {
        zzfks zzfksVar = zzfknVar.f15952s;
        return (zzfksVar == null || zzfksVar.f15992a == null) ? false : true;
    }
}
