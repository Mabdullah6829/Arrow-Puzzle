package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzenw implements zzema {

    /* JADX INFO: renamed from: a */
    public final Context f14334a;

    /* JADX INFO: renamed from: b */
    public final zzdwq f14335b;

    /* JADX INFO: renamed from: c */
    public final zzdno f14336c;

    /* JADX INFO: renamed from: d */
    public final zzflg f14337d;

    /* JADX INFO: renamed from: e */
    public final Executor f14338e;

    /* JADX INFO: renamed from: f */
    public final VersionInfoParcel f14339f;

    /* JADX INFO: renamed from: g */
    public final zzbqa f14340g;

    /* JADX INFO: renamed from: h */
    public final boolean f14341h = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8599ja)).booleanValue();

    /* JADX INFO: renamed from: i */
    public final zzekz f14342i;

    /* JADX INFO: renamed from: j */
    public final zzdzo f14343j;

    /* JADX INFO: renamed from: k */
    public final zzdzt f14344k;

    public zzenw(Context context, VersionInfoParcel versionInfoParcel, zzflg zzflgVar, Executor executor, zzdno zzdnoVar, zzdwq zzdwqVar, zzbqa zzbqaVar, zzekz zzekzVar, zzdzo zzdzoVar, zzdzt zzdztVar) {
        this.f14334a = context;
        this.f14337d = zzflgVar;
        this.f14336c = zzdnoVar;
        this.f14338e = executor;
        this.f14339f = versionInfoParcel;
        this.f14335b = zzdwqVar;
        this.f14340g = zzbqaVar;
        this.f14342i = zzekzVar;
        this.f14343j = zzdzoVar;
        this.f14344k = zzdztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo6284a(final zzfky zzfkyVar, final zzfkn zzfknVar) {
        final zzdwu zzdwuVar = new zzdwu();
        ListenableFuture listenableFuture = zzhcj.f18518t;
        zzhbn zzhbnVar = new zzhbn(zzfknVar, zzfkyVar, zzdwuVar) { // from class: com.google.android.gms.internal.ads.zzent

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ zzfkn f14322b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ zzfky f14323c;

            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj) throws zzclq {
                zzenw zzenwVar = this.f14321a;
                zzdzo zzdzoVar = zzenwVar.f14343j;
                zzbio zzbioVar = zzbix.f8209M2;
                zzbiv zzbivVar = com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c;
                if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
                    AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar, "rendering-webview-creation-start");
                }
                zzdwq zzdwqVar = zzenwVar.f14335b;
                zzflg zzflgVar = zzenwVar.f14337d;
                zzfky zzfkyVar2 = this.f14323c;
                zzfkq zzfkqVar = zzfkyVar2.f16006b.f16002b;
                com.google.android.gms.ads.internal.client.zzr zzrVar = zzflgVar.f16042f;
                final zzfkn zzfknVar2 = this.f14322b;
                final zzclb zzclbVarM6077a = zzdwqVar.m6077a(zzrVar, zzfknVar2, zzfkqVar);
                zzclbVarM6077a.mo5569A0(zzfknVar2.f15912W);
                if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
                    AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar, "rendering-webview-creation-end");
                }
                zzcgd zzcgdVar = new zzcgd();
                zzdno zzdnoVar = zzenwVar.f14336c;
                zzcyq zzcyqVar = new zzcyq(zzfkyVar2, zzfknVar2, null);
                Context context = zzenwVar.f14334a;
                VersionInfoParcel versionInfoParcel = zzenwVar.f14339f;
                boolean z = zzenwVar.f14341h;
                zzbqa zzbqaVar = zzenwVar.f14340g;
                final zzdmi zzdmiVarMo5777d = zzdnoVar.mo5777d(zzcyqVar, new zzdml(new zzenu(context, versionInfoParcel, zzcgdVar, zzfknVar2, zzclbVarM6077a, zzflgVar, z, zzbqaVar, zzenwVar.f14342i, zzenwVar.f14344k), zzclbVarM6077a));
                zzcgdVar.m5397a(zzdmiVarMo5777d);
                if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
                    AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar, "rendering-ad-component-creation-end");
                }
                zzdmiVarMo5777d.mo5734c().m5924Y(new zzddt() { // from class: com.google.android.gms.internal.ads.zzenr
                    @Override // com.google.android.gms.internal.ads.zzddt
                    /* JADX INFO: renamed from: n */
                    public final /* synthetic */ void mo5838n() {
                        zzclb zzclbVar = zzclbVarM6077a;
                        if (zzclbVar.mo5582K() != null) {
                            zzclbVar.mo5582K().m5629L();
                        }
                    }
                }, zzcfy.f9953h);
                zzfks zzfksVar = zzfknVar2.f15952s;
                String strM5672a = zzfksVar.f15992a;
                if (((Boolean) zzbivVar.m5030a(zzbix.f8612k6)).booleanValue() && ((zzelt) ((zzcpv) zzdmiVarMo5777d).f11053h.zzb()).m6279a()) {
                    strM5672a = zzcms.m5672a(strM5672a, zzcms.m5673b(zzfknVar2));
                }
                zzdmiVarMo5777d.mo5771i().m6076a(zzclbVarM6077a, true, true != z ? null : zzbqaVar, zzdzoVar);
                zzdmiVarMo5777d.mo5771i();
                return zzhcf.m7375i(zzdwp.m6075b(zzclbVarM6077a, zzfksVar.f15993b, strM5672a, zzdzoVar, zzdnoVar.mo5776c()), new zzgti() { // from class: com.google.android.gms.internal.ads.zzens
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final /* synthetic */ Object apply(Object obj2) {
                        boolean z2 = zzfknVar2.f15902M;
                        zzclb zzclbVar = zzclbVarM6077a;
                        if (z2) {
                            zzclbVar.mo5588R();
                        }
                        zzclbVar.mo5573D0();
                        zzclbVar.onPause();
                        return zzdmiVarMo5777d.mo5769g();
                    }
                }, zzenwVar.f14338e);
            }
        };
        Executor executor = this.f14338e;
        ListenableFuture listenableFutureM7374h = zzhcf.m7374h(listenableFuture, zzhbnVar, executor);
        ((zzhay) listenableFutureM7374h).addListener(new zzenv(), executor);
        return listenableFutureM7374h;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    /* JADX INFO: renamed from: b */
    public final boolean mo6285b(zzfky zzfkyVar, zzfkn zzfknVar) {
        zzfks zzfksVar = zzfknVar.f15952s;
        return (zzfksVar == null || zzfksVar.f15992a == null) ? false : true;
    }
}
