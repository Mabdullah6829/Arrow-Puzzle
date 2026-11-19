package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeqn implements zzema {

    /* JADX INFO: renamed from: a */
    public final Context f14635a;

    /* JADX INFO: renamed from: b */
    public final zzdwq f14636b;

    /* JADX INFO: renamed from: c */
    public final zzdvz f14637c;

    /* JADX INFO: renamed from: d */
    public final zzflg f14638d;

    /* JADX INFO: renamed from: e */
    public final Executor f14639e;

    /* JADX INFO: renamed from: f */
    public final VersionInfoParcel f14640f;

    /* JADX INFO: renamed from: g */
    public final zzbqa f14641g;

    /* JADX INFO: renamed from: h */
    public final boolean f14642h = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8599ja)).booleanValue();

    /* JADX INFO: renamed from: i */
    public final zzekz f14643i;

    /* JADX INFO: renamed from: j */
    public final zzdzo f14644j;

    /* JADX INFO: renamed from: k */
    public final zzdzt f14645k;

    public zzeqn(Context context, VersionInfoParcel versionInfoParcel, zzflg zzflgVar, Executor executor, zzdvz zzdvzVar, zzdwq zzdwqVar, zzbqa zzbqaVar, zzekz zzekzVar, zzdzo zzdzoVar, zzdzt zzdztVar) {
        this.f14635a = context;
        this.f14638d = zzflgVar;
        this.f14637c = zzdvzVar;
        this.f14639e = executor;
        this.f14640f = versionInfoParcel;
        this.f14636b = zzdwqVar;
        this.f14641g = zzbqaVar;
        this.f14643i = zzekzVar;
        this.f14644j = zzdzoVar;
        this.f14645k = zzdztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo6284a(final zzfky zzfkyVar, final zzfkn zzfknVar) {
        final zzdwu zzdwuVar = new zzdwu();
        ListenableFuture listenableFuture = zzhcj.f18518t;
        zzhbn zzhbnVar = new zzhbn(zzfknVar, zzfkyVar, zzdwuVar) { // from class: com.google.android.gms.internal.ads.zzeqm

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ zzfkn f14633b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ zzfky f14634c;

            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj) throws zzclq {
                zzeqn zzeqnVar = this.f14632a;
                zzdzo zzdzoVar = zzeqnVar.f14644j;
                zzbio zzbioVar = zzbix.f8209M2;
                zzbiv zzbivVar = com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c;
                if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
                    AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar, "rendering-webview-creation-start");
                }
                zzdwq zzdwqVar = zzeqnVar.f14636b;
                zzflg zzflgVar = zzeqnVar.f14638d;
                zzfky zzfkyVar2 = this.f14634c;
                zzfkq zzfkqVar = zzfkyVar2.f16006b.f16002b;
                com.google.android.gms.ads.internal.client.zzr zzrVar = zzflgVar.f16042f;
                final zzfkn zzfknVar2 = this.f14633b;
                final zzclb zzclbVarM6077a = zzdwqVar.m6077a(zzrVar, zzfknVar2, zzfkqVar);
                zzclbVarM6077a.mo5569A0(zzfknVar2.f15912W);
                if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
                    AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar, "rendering-webview-creation-end");
                }
                zzcgd zzcgdVar = new zzcgd();
                zzdvz zzdvzVar = zzeqnVar.f14637c;
                zzcyq zzcyqVar = new zzcyq(zzfkyVar2, zzfknVar2, null);
                Context context = zzeqnVar.f14635a;
                VersionInfoParcel versionInfoParcel = zzeqnVar.f14640f;
                zzbqa zzbqaVar = zzeqnVar.f14641g;
                boolean z = zzeqnVar.f14642h;
                zzekz zzekzVar = zzeqnVar.f14643i;
                zzdzo zzdzoVar2 = zzeqnVar.f14644j;
                final zzdvv zzdvvVarMo5795b = zzdvzVar.mo5795b(zzcyqVar, new zzdvw(new zzeqj(context, zzdwqVar, zzflgVar, versionInfoParcel, zzfknVar2, zzcgdVar, zzclbVarM6077a, zzbqaVar, z, zzekzVar, zzdzoVar2, zzeqnVar.f14645k), zzclbVarM6077a));
                zzcgdVar.m5397a(zzdvvVarMo5795b);
                if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
                    AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar2, "rendering-ad-component-creation-end");
                }
                zzclbVarM6077a.mo5616v0("/reward", new zzbqq(zzdvvVarMo5795b.mo5790i()));
                zzdvvVarMo5795b.mo5734c().m5924Y(new zzddt() { // from class: com.google.android.gms.internal.ads.zzeqk
                    @Override // com.google.android.gms.internal.ads.zzddt
                    /* JADX INFO: renamed from: n */
                    public final /* synthetic */ void mo5838n() {
                        zzclb zzclbVar = zzclbVarM6077a;
                        if (zzclbVar.mo5582K() != null) {
                            zzclbVar.mo5582K().m5629L();
                        }
                    }
                }, zzcfy.f9953h);
                zzdvvVarMo5795b.mo5791j().m6076a(zzclbVarM6077a, true, true != z ? null : zzbqaVar, zzdzoVar2);
                zzfks zzfksVar = zzfknVar2.f15952s;
                String strM5672a = zzfksVar.f15992a;
                if (((Boolean) zzbivVar.m5030a(zzbix.f8612k6)).booleanValue() && ((zzelt) ((zzcqg) zzdvvVarMo5795b).f11157h.zzb()).m6279a()) {
                    strM5672a = zzcms.m5672a(strM5672a, zzcms.m5673b(zzfknVar2));
                }
                zzdvvVarMo5795b.mo5791j();
                return zzhcf.m7375i(zzdwp.m6075b(zzclbVarM6077a, zzfksVar.f15993b, strM5672a, zzdzoVar2, ((zzcqi) zzdvzVar).mo5744d()), new zzgti() { // from class: com.google.android.gms.internal.ads.zzeql
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final /* synthetic */ Object apply(Object obj2) {
                        boolean z2 = zzfknVar2.f15902M;
                        zzclb zzclbVar = zzclbVarM6077a;
                        if (z2) {
                            zzclbVar.mo5588R();
                        }
                        zzclbVar.mo5573D0();
                        zzclbVar.onPause();
                        return zzdvvVarMo5795b.mo5788g();
                    }
                }, zzeqnVar.f14639e);
            }
        };
        Executor executor = this.f14639e;
        ListenableFuture listenableFutureM7374h = zzhcf.m7374h(listenableFuture, zzhbnVar, executor);
        ((zzhay) listenableFutureM7374h).addListener(new zzeqg(), executor);
        return listenableFutureM7374h;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    /* JADX INFO: renamed from: b */
    public final boolean mo6285b(zzfky zzfkyVar, zzfkn zzfknVar) {
        zzfks zzfksVar = zzfknVar.f15952s;
        return (zzfksVar == null || zzfksVar.f15992a == null) ? false : true;
    }
}
