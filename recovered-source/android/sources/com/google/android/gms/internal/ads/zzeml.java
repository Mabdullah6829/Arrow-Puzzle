package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeml implements zzema {

    /* JADX INFO: renamed from: a */
    public final zzcvg f14208a;

    /* JADX INFO: renamed from: b */
    public final zzdwq f14209b;

    /* JADX INFO: renamed from: c */
    public final zzflg f14210c;

    /* JADX INFO: renamed from: d */
    public final Executor f14211d;

    /* JADX INFO: renamed from: e */
    public final VersionInfoParcel f14212e;

    /* JADX INFO: renamed from: f */
    public final zzbqa f14213f;

    /* JADX INFO: renamed from: g */
    public final boolean f14214g = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8599ja)).booleanValue();

    /* JADX INFO: renamed from: h */
    public final zzekz f14215h;

    /* JADX INFO: renamed from: i */
    public final zzdzo f14216i;

    /* JADX INFO: renamed from: j */
    public final zzdzt f14217j;

    public zzeml(zzcvg zzcvgVar, Executor executor, zzdwq zzdwqVar, zzflg zzflgVar, VersionInfoParcel versionInfoParcel, zzbqa zzbqaVar, zzekz zzekzVar, zzdzo zzdzoVar, zzdzt zzdztVar) {
        this.f14208a = zzcvgVar;
        this.f14211d = executor;
        this.f14209b = zzdwqVar;
        this.f14210c = zzflgVar;
        this.f14212e = versionInfoParcel;
        this.f14213f = zzbqaVar;
        this.f14215h = zzekzVar;
        this.f14216i = zzdzoVar;
        this.f14217j = zzdztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo6284a(final zzfky zzfkyVar, final zzfkn zzfknVar) {
        final zzdwu zzdwuVar = new zzdwu();
        ListenableFuture listenableFuture = zzhcj.f18518t;
        zzhbn zzhbnVar = new zzhbn(zzfknVar, zzfkyVar, zzdwuVar) { // from class: com.google.android.gms.internal.ads.zzemj

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ zzfkn f14206b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ zzfky f14207c;

            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj) throws zzclq {
                zzeml zzemlVar = this.f14205a;
                zzdzo zzdzoVar = zzemlVar.f14216i;
                zzbio zzbioVar = zzbix.f8209M2;
                zzbiv zzbivVar = com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c;
                if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
                    AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar, "rendering-webview-creation-start");
                }
                zzdwq zzdwqVar = zzemlVar.f14209b;
                zzflg zzflgVar = zzemlVar.f14210c;
                zzfky zzfkyVar2 = this.f14207c;
                zzfkq zzfkqVar = zzfkyVar2.f16006b.f16002b;
                com.google.android.gms.ads.internal.client.zzr zzrVar = zzflgVar.f16042f;
                final zzfkn zzfknVar2 = this.f14206b;
                final zzclb zzclbVarM6077a = zzdwqVar.m6077a(zzrVar, zzfknVar2, zzfkqVar);
                zzclbVarM6077a.mo5569A0(zzfknVar2.f15912W);
                if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
                    AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar, "rendering-webview-creation-end");
                }
                zzcgd zzcgdVar = new zzcgd();
                zzcvg zzcvgVar = zzemlVar.f14208a;
                zzcyq zzcyqVar = new zzcyq(zzfkyVar2, zzfknVar2, null);
                VersionInfoParcel versionInfoParcel = zzemlVar.f14212e;
                boolean z = zzemlVar.f14214g;
                zzbqa zzbqaVar = zzemlVar.f14213f;
                final zzcvd zzcvdVarMo5743b = zzcvgVar.mo5743b(zzcyqVar, new zzdml(new zzemn(versionInfoParcel, zzcgdVar, zzfknVar2, zzclbVarM6077a, zzflgVar, z, zzbqaVar, zzemlVar.f14215h, zzemlVar.f14217j), zzclbVarM6077a), new zzcve(zzfknVar2.f15917a0));
                if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
                    AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar, "rendering-ad-component-creation-end");
                }
                zzcvdVarMo5743b.mo5738h().m6076a(zzclbVarM6077a, false, true != z ? null : zzbqaVar, zzdzoVar);
                zzcgdVar.m5397a(zzcvdVarMo5743b);
                zzcvdVarMo5743b.mo5734c().m5924Y(new zzddt() { // from class: com.google.android.gms.internal.ads.zzemh
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
                if (((Boolean) zzbivVar.m5030a(zzbix.f8612k6)).booleanValue() && ((zzelt) ((zzcpf) zzcvdVarMo5743b).f10832i.zzb()).m6279a()) {
                    strM5672a = zzcms.m5672a(strM5672a, zzcms.m5673b(zzfknVar2));
                }
                zzcvdVarMo5743b.mo5738h();
                return zzhcf.m7375i(zzdwp.m6075b(zzclbVarM6077a, zzfksVar.f15993b, strM5672a, zzdzoVar, ((zzcph) zzcvgVar).mo5744d()), new zzgti() { // from class: com.google.android.gms.internal.ads.zzemi
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final /* synthetic */ Object apply(Object obj2) {
                        boolean z2 = zzfknVar2.f15902M;
                        zzclb zzclbVar = zzclbVarM6077a;
                        if (z2) {
                            zzclbVar.mo5588R();
                        }
                        zzclbVar.mo5573D0();
                        zzclbVar.onPause();
                        return zzcvdVarMo5743b.mo5737g();
                    }
                }, zzemlVar.f14211d);
            }
        };
        Executor executor = this.f14211d;
        ListenableFuture listenableFutureM7374h = zzhcf.m7374h(listenableFuture, zzhbnVar, executor);
        ((zzhay) listenableFutureM7374h).addListener(new zzemk(), executor);
        return listenableFutureM7374h;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    /* JADX INFO: renamed from: b */
    public final boolean mo6285b(zzfky zzfkyVar, zzfkn zzfknVar) {
        zzfks zzfksVar = zzfknVar.f15952s;
        return (zzfksVar == null || zzfksVar.f15992a == null) ? false : true;
    }
}
