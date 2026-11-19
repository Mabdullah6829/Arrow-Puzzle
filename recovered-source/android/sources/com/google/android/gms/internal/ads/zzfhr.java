package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfhr implements zzfie {

    /* JADX INFO: renamed from: a */
    public final zzfmv f15722a;

    /* JADX INFO: renamed from: b */
    public final Executor f15723b;

    /* JADX INFO: renamed from: c */
    public final zzhcc f15724c = new zzfho();

    public zzfhr(zzfmv zzfmvVar, Executor executor) {
        this.f15722a = zzfmvVar;
        this.f15723b = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzfie
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ ListenableFuture mo6447a(zzfif zzfifVar, zzfid zzfidVar) {
        return m6451b(null);
    }

    /* JADX INFO: renamed from: b */
    public final zzhbx m6451b(final zzdch zzdchVar) {
        ListenableFuture listenableFutureM7367a;
        ListenableFuture listenableFutureM7367a2;
        zzfmv zzfmvVar = this.f15722a;
        Executor executor = this.f15723b;
        zzfia zzfiaVar = new zzfia(zzfmvVar, zzdchVar, executor);
        zzfhy zzfhyVar = zzfiaVar.f15740d;
        if (zzfhyVar == null) {
            if (((Boolean) zzble.f9120a.m5057c()).booleanValue()) {
                final zzcze zzczeVarZza = zzdchVar.zza();
                final zzfnc zzfncVar = ((zzfmw) zzfmvVar).f16127b;
                zzdce zzdceVar = zzczeVarZza.f11816i;
                zzfoz zzfozVarM6555d = zzczeVarZza.f11810c.m6556a(zzdceVar.m5895b(), zzfpm.GET_CACHE_KEY).m6553b(new zzhbn() { // from class: com.google.android.gms.internal.ads.zzczb
                    @Override // com.google.android.gms.internal.ads.zzhbn
                    /* JADX INFO: renamed from: b */
                    public final ListenableFuture mo3248b(Object obj) {
                        final zzcbk zzcbkVar = (zzcbk) obj;
                        zzcbkVar.f9677A = zzfncVar;
                        final zzehl zzehlVar = zzczeVarZza.f11815h;
                        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzehf
                            @Override // com.google.android.gms.internal.ads.zzhbn
                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ ListenableFuture mo3248b(Object obj2) {
                                String str = new String(zzgzt.m7284a((InputStream) obj2), StandardCharsets.UTF_8);
                                zzcbk zzcbkVar2 = zzcbkVar;
                                zzcbkVar2.f9678B = str;
                                return zzhcf.m7367a(zzcbkVar2);
                            }
                        };
                        final zzegq zzegqVar = zzehlVar.f13920b;
                        return zzehlVar.m6217a(zzcbkVar, new zzehb() { // from class: com.google.android.gms.internal.ads.zzehc
                            @Override // com.google.android.gms.internal.ads.zzehb
                            /* JADX INFO: renamed from: a */
                            public final ListenableFuture mo6216a(zzcbk zzcbkVar2) {
                                final zzegq zzegqVar2 = zzegqVar;
                                synchronized (zzegqVar2.f13878t) {
                                    try {
                                        int i2 = zzegqVar2.f13890z;
                                        if (i2 != 1 && i2 != 2) {
                                            return zzhcf.m7368b(new zzegz(2));
                                        }
                                        if (zzegqVar2.f13879u) {
                                            return zzegqVar2.f13877s;
                                        }
                                        zzegqVar2.f13890z = 2;
                                        zzegqVar2.f13879u = true;
                                        zzegqVar2.f13881w = zzcbkVar2;
                                        zzegqVar2.f13882x.checkAvailabilityAndConnect();
                                        zzcgd zzcgdVar = zzegqVar2.f13877s;
                                        zzcgdVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegp
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                zzegqVar2.m6206a();
                                            }
                                        }, zzcfy.f9953h);
                                        return zzcgdVar;
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }, new zzehb() { // from class: com.google.android.gms.internal.ads.zzehg
                            @Override // com.google.android.gms.internal.ads.zzehb
                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ ListenableFuture mo6216a(zzcbk zzcbkVar2) {
                                return ((zzeiq) zzehlVar.f13921c.zzb()).m6224l4(zzcbkVar2, Binder.getCallingUid());
                            }
                        }, zzhbnVar);
                    }
                }).m6555d();
                zzcyz zzcyzVar = new zzcyz(zzczeVarZza);
                zzfozVarM6555d.addListener(new zzhcd(zzfozVarM6555d, zzcyzVar), zzczeVarZza.f11817j);
                listenableFutureM7367a2 = (zzhbx) zzhcf.m7371e((zzhbx) zzhcf.m7375i(zzhbx.m7360q(zzfozVarM6555d), new zzfhx(zzfiaVar), executor), zzegz.class, new zzfhw(zzfiaVar), executor);
            } else {
                zzflg zzflgVarZzb = zzdchVar.zzb();
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzflgVarZzb.f16040d;
                String str = zzflgVarZzb.f16043g;
                com.google.android.gms.ads.internal.client.zzx zzxVar = zzflgVarZzb.f16047k;
                zzfnc zzfncVar2 = ((zzfmw) zzfmvVar).f16127b;
                zzfhy zzfhyVar2 = new zzfhy(null, new zzfng(zzmVar, str, new zzcbn(zzfncVar2.f16147s).m5307a().f9726j, zzfncVar2.f16153y, zzxVar));
                zzfiaVar.f15740d = zzfhyVar2;
                listenableFutureM7367a2 = zzhcf.m7367a(zzfhyVar2);
            }
            listenableFutureM7367a = zzhcf.m7375i(listenableFutureM7367a2, new zzgti() { // from class: com.google.android.gms.internal.ads.zzfhz
                @Override // com.google.android.gms.internal.ads.zzgti
                public final /* synthetic */ Object apply(Object obj) {
                    return (zzfhy) obj;
                }
            }, executor);
        } else {
            listenableFutureM7367a = zzhcf.m7367a(zzfhyVar);
        }
        return (zzhbx) zzhcf.m7371e((zzhbx) zzhcf.m7374h(zzhbx.m7360q(listenableFutureM7367a), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfhp
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj) {
                zzfne zzfneVar;
                zzfhr zzfhrVar = this.f15717a;
                zzdch zzdchVar2 = zzdchVar;
                zzfhy zzfhyVar3 = (zzfhy) obj;
                zzfmv zzfmvVar2 = zzfhrVar.f15722a;
                zzfnf zzfnfVar = zzfhyVar3.f15731b;
                zzcbk zzcbkVar = zzfhyVar3.f15730a;
                zzfmw zzfmwVar = (zzfmw) zzfmvVar2;
                synchronized (zzfmwVar) {
                    try {
                        zzfmu zzfmuVar = (zzfmu) zzfmwVar.f16126a.get(zzfnfVar);
                        zzfneVar = null;
                        if (zzfmuVar != null) {
                            zzfnt zzfntVar = zzfmuVar.f16125d;
                            zzfntVar.getClass();
                            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                            zzfntVar.f16179c = System.currentTimeMillis();
                            zzfntVar.f16180d++;
                            zzfmuVar.m6539a();
                            LinkedList linkedList = zzfmuVar.f16122a;
                            if (!linkedList.isEmpty() && (zzfneVar = (zzfne) linkedList.remove()) != null) {
                                zzfntVar.f16181e++;
                                zzfntVar.f16178b.f16175s = true;
                            }
                            if (zzfneVar == null) {
                                zzfmwVar.f16128c.f16135e++;
                            }
                            zzfns zzfnsVar = zzfmuVar.f16125d.f16178b;
                            zzfns zzfnsVarClone = zzfnsVar.clone();
                            zzfnsVar.f16175s = false;
                            zzfnsVar.f16176t = 0;
                            if (zzfneVar != null) {
                                zzbic.zzb.zzc zzcVarM4952E = zzbic.zzb.m4952E();
                                zzbic.zzb.zza.C6589zza c6589zzaM4955F = zzbic.zzb.zza.m4955F();
                                zzbic.zzb.zzd zzdVar = zzbic.zzb.zzd.UNSPECIFIED;
                                c6589zzaM4955F.getClass();
                                c6589zzaM4955F.m8326l();
                                ((zzbic.zzb.zza) c6589zzaM4955F.f19780t).m4957G();
                                zzbic.zzb.zze.zza zzaVarM4959D = zzbic.zzb.zze.m4959D();
                                boolean z = zzfnsVarClone.f16175s;
                                zzaVarM4959D.m8326l();
                                ((zzbic.zzb.zze) zzaVarM4959D.f19780t).m4962F(z);
                                int i2 = zzfnsVarClone.f16176t;
                                zzaVarM4959D.m8326l();
                                ((zzbic.zzb.zze) zzaVarM4959D.f19780t).m4963G(i2);
                                c6589zzaM4955F.m8326l();
                                ((zzbic.zzb.zza) c6589zzaM4955F.f19780t).m4958H((zzbic.zzb.zze) zzaVarM4959D.m8328o());
                                zzcVarM4952E.m8326l();
                                ((zzbic.zzb) zzcVarM4952E.f19780t).m4953F((zzbic.zzb.zza) c6589zzaM4955F.m8328o());
                                zzfneVar.f16155a.zza().f11813f.mo5880g((zzbic.zzb) zzcVarM4952E.m8328o());
                            }
                            zzfmwVar.m6541b();
                        } else {
                            zzfmwVar.f16128c.f16134d++;
                            zzfmwVar.m6541b();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (zzfneVar != null && zzcbkVar != null) {
                    zzcze zzczeVarZza2 = zzdchVar2.zza();
                    final zzehl zzehlVar = zzczeVarZza2.f11815h;
                    zzfoz zzfozVarM6555d2 = zzczeVarZza2.f11810c.m6556a(zzehlVar.m6217a(zzcbkVar, new zzehb() { // from class: com.google.android.gms.internal.ads.zzehi
                        @Override // com.google.android.gms.internal.ads.zzehb
                        /* JADX INFO: renamed from: a */
                        public final ListenableFuture mo6216a(zzcbk zzcbkVar2) {
                            final zzegq zzegqVar = zzehlVar.f13920b;
                            String str2 = zzcbkVar2.f9689z;
                            synchronized (zzegqVar.f13878t) {
                                try {
                                    int i3 = zzegqVar.f13890z;
                                    if (i3 != 1 && i3 != 3) {
                                        return zzhcf.m7368b(new zzegz(2));
                                    }
                                    if (zzegqVar.f13879u) {
                                        return zzegqVar.f13877s;
                                    }
                                    zzegqVar.f13890z = 3;
                                    zzegqVar.f13879u = true;
                                    zzegqVar.f13889y = str2;
                                    zzegqVar.f13882x.checkAvailabilityAndConnect();
                                    zzcgd zzcgdVar = zzegqVar.f13877s;
                                    zzcgdVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzego
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            zzegqVar.m6206a();
                                        }
                                    }, zzcfy.f9953h);
                                    return zzcgdVar;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    }, new zzehb() { // from class: com.google.android.gms.internal.ads.zzehj
                        @Override // com.google.android.gms.internal.ads.zzehb
                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ ListenableFuture mo6216a(zzcbk zzcbkVar2) {
                            return ((zzeiq) zzehlVar.f13921c.zzb()).m6225m4(zzcbkVar2.f9689z);
                        }
                    }, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzehh
                        @Override // com.google.android.gms.internal.ads.zzhbn
                        /* JADX INFO: renamed from: b */
                        public final ListenableFuture mo3248b(Object obj2) {
                            return zzhcj.f18518t;
                        }
                    }), zzfpm.NOTIFY_CACHE_HIT).m6555d();
                    zzfozVarM6555d2.addListener(new zzhcd(zzfozVarM6555d2, new zzcza(zzczeVarZza2)), zzczeVarZza2.f11817j);
                    zzfozVarM6555d2.addListener(new zzhcd(zzfozVarM6555d2, zzfhrVar.f15724c), zzfhrVar.f15723b);
                }
                return zzhcf.m7367a(new zzfhq(zzfnfVar, zzcbkVar, zzfneVar));
            }
        }, executor), Exception.class, new zzfhn(), executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfie
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo6449d() {
        return null;
    }
}
