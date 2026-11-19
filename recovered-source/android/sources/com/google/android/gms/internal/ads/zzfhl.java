package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfhl implements zzfie {

    /* JADX INFO: renamed from: a */
    public final zzfhv f15710a;

    /* JADX INFO: renamed from: b */
    public final zzfhr f15711b;

    /* JADX INFO: renamed from: c */
    public final zzfnr f15712c;

    /* JADX INFO: renamed from: d */
    public final String f15713d;

    /* JADX INFO: renamed from: e */
    public zzdch f15714e;

    /* JADX INFO: renamed from: f */
    public final Executor f15715f;

    public zzfhl(zzfhv zzfhvVar, zzfhr zzfhrVar, zzfnr zzfnrVar, String str, Executor executor) {
        this.f15710a = zzfhvVar;
        this.f15711b = zzfhrVar;
        this.f15712c = zzfnrVar;
        this.f15713d = str;
        this.f15715f = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzfie
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo6447a(final zzfif zzfifVar, final zzfid zzfidVar) {
        synchronized (this) {
            zzdcg zzdcgVarMo6431a = zzfidVar.mo6431a(zzfifVar.f15742b);
            zzdcgVarMo6431a.mo5721a(new zzfhm(this.f15713d));
            final zzdch zzdchVar = (zzdch) zzdcgVarMo6431a.zzh();
            zzdchVar.zzb();
            zzdchVar.zzb();
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzdchVar.zzb().f16040d;
            if (zzmVar.f3216K != null || zzmVar.f3221P != null) {
                this.f15714e = zzdchVar;
                return this.f15710a.m6454b(zzfifVar, zzfidVar, zzdchVar);
            }
            zzflg zzflgVarZzb = zzdchVar.zzb();
            com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzflgVarZzb.f16040d;
            String str = zzflgVarZzb.f16043g;
            com.google.android.gms.ads.internal.client.zzx zzxVar = zzflgVarZzb.f16047k;
            Executor executor = this.f15715f;
            final zzfhk zzfhkVar = new zzfhk(zzfidVar, zzfifVar, zzmVar2, str, executor, zzxVar, null);
            return (zzhbx) zzhcf.m7374h(zzhbx.m7360q(this.f15711b.m6451b(zzdchVar)), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfhj
                /* JADX WARN: Code duplicated, block: B:33:0x0056  */
                /* JADX WARN: Code duplicated, block: B:35:0x0064  */
                /* JADX WARN: Code duplicated, block: B:53:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // com.google.android.gms.internal.ads.zzhbn
                /* JADX INFO: renamed from: b */
                public final ListenableFuture mo3248b(Object obj) {
                    zzfnx zzfnxVar;
                    boolean z;
                    ListenableFuture listenableFutureM6547a;
                    final zzfhl zzfhlVar = this.f15698a;
                    zzfif zzfifVar2 = zzfifVar;
                    zzfhk zzfhkVar2 = zzfhkVar;
                    zzfid zzfidVar2 = zzfidVar;
                    zzdch zzdchVar2 = zzdchVar;
                    zzfhq zzfhqVar = (zzfhq) obj;
                    if (zzfhqVar != null) {
                        zzfhk zzfhkVar3 = new zzfhk(zzfhkVar2.f15703a, zzfhkVar2.f15704b, zzfhkVar2.f15705c, zzfhkVar2.f15706d, zzfhkVar2.f15707e, zzfhkVar2.f15708f, zzfhqVar.f15719a);
                        zzfne zzfneVar = zzfhqVar.f15721c;
                        if (zzfneVar != null) {
                            zzfhlVar.f15714e = null;
                            zzfnr zzfnrVar = zzfhlVar.f15712c;
                            synchronized (zzfnrVar) {
                                zzfnrVar.f16172c.add(zzfhkVar3);
                            }
                            return zzfhlVar.m6450b(zzfneVar, zzfifVar2);
                        }
                        zzfnr zzfnrVar2 = zzfhlVar.f15712c;
                        synchronized (zzfnrVar2) {
                            zzfnrVar2.f16174e = 2;
                            synchronized (zzfnrVar2) {
                                zzfnxVar = zzfnrVar2.f16173d;
                                z = zzfnxVar == null;
                            }
                            if (listenableFutureM6547a != null) {
                                zzfhlVar.f15714e = null;
                                return zzhcf.m7374h(listenableFutureM6547a, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfhi
                                    @Override // com.google.android.gms.internal.ads.zzhbn
                                    /* JADX INFO: renamed from: b */
                                    public final ListenableFuture mo3248b(Object obj2) throws zzeel {
                                        zzfne zzfneVar2;
                                        zzfnp zzfnpVar;
                                        zzfnn zzfnnVar = (zzfnn) obj2;
                                        if (zzfnnVar == null || (zzfneVar2 = zzfnnVar.f16167a) == null || (zzfnpVar = zzfnnVar.f16168b) == null) {
                                            throw new zzeel(1, "Empty prefetch");
                                        }
                                        zzbic.zzb.zzc zzcVarM4952E = zzbic.zzb.m4952E();
                                        zzbic.zzb.zza.C6589zza c6589zzaM4955F = zzbic.zzb.zza.m4955F();
                                        zzbic.zzb.zzd zzdVar = zzbic.zzb.zzd.UNSPECIFIED;
                                        c6589zzaM4955F.getClass();
                                        c6589zzaM4955F.m8326l();
                                        ((zzbic.zzb.zza) c6589zzaM4955F.f19780t).m4957G();
                                        zzbic.zzb.zze zzeVarM4960E = zzbic.zzb.zze.m4960E();
                                        c6589zzaM4955F.m8326l();
                                        ((zzbic.zzb.zza) c6589zzaM4955F.f19780t).m4958H(zzeVarM4960E);
                                        zzcVarM4952E.m8326l();
                                        ((zzbic.zzb) zzcVarM4952E.f19780t).m4953F((zzbic.zzb.zza) c6589zzaM4955F.m8328o());
                                        zzfneVar2.f16155a.zza().f11813f.mo5878L((zzbic.zzb) zzcVarM4952E.m8328o());
                                        return zzfhlVar.m6450b(zzfneVar2, ((zzfhk) zzfnpVar).f15704b);
                                    }
                                }, zzfhlVar.f15715f);
                            }
                            synchronized (zzfnrVar2) {
                                zzfnrVar2.f16172c.add(zzfhkVar3);
                            }
                            zzfifVar2 = new zzfif(zzfifVar2.f15742b, zzfhqVar.f15720b);
                        }
                        listenableFutureM6547a = z ? null : zzfnxVar.m6547a(zzfhkVar3);
                        if (listenableFutureM6547a != null) {
                            zzfhlVar.f15714e = null;
                            return zzhcf.m7374h(listenableFutureM6547a, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfhi
                                @Override // com.google.android.gms.internal.ads.zzhbn
                                /* JADX INFO: renamed from: b */
                                public final ListenableFuture mo3248b(Object obj2) throws zzeel {
                                    zzfne zzfneVar2;
                                    zzfnp zzfnpVar;
                                    zzfnn zzfnnVar = (zzfnn) obj2;
                                    if (zzfnnVar == null || (zzfneVar2 = zzfnnVar.f16167a) == null || (zzfnpVar = zzfnnVar.f16168b) == null) {
                                        throw new zzeel(1, "Empty prefetch");
                                    }
                                    zzbic.zzb.zzc zzcVarM4952E = zzbic.zzb.m4952E();
                                    zzbic.zzb.zza.C6589zza c6589zzaM4955F = zzbic.zzb.zza.m4955F();
                                    zzbic.zzb.zzd zzdVar = zzbic.zzb.zzd.UNSPECIFIED;
                                    c6589zzaM4955F.getClass();
                                    c6589zzaM4955F.m8326l();
                                    ((zzbic.zzb.zza) c6589zzaM4955F.f19780t).m4957G();
                                    zzbic.zzb.zze zzeVarM4960E = zzbic.zzb.zze.m4960E();
                                    c6589zzaM4955F.m8326l();
                                    ((zzbic.zzb.zza) c6589zzaM4955F.f19780t).m4958H(zzeVarM4960E);
                                    zzcVarM4952E.m8326l();
                                    ((zzbic.zzb) zzcVarM4952E.f19780t).m4953F((zzbic.zzb.zza) c6589zzaM4955F.m8328o());
                                    zzfneVar2.f16155a.zza().f11813f.mo5878L((zzbic.zzb) zzcVarM4952E.m8328o());
                                    return zzfhlVar.m6450b(zzfneVar2, ((zzfhk) zzfnpVar).f15704b);
                                }
                            }, zzfhlVar.f15715f);
                        }
                        synchronized (zzfnrVar2) {
                            zzfnrVar2.f16172c.add(zzfhkVar3);
                            zzfifVar2 = new zzfif(zzfifVar2.f15742b, zzfhqVar.f15720b);
                        }
                    }
                    ListenableFuture listenableFutureM6454b = zzfhlVar.f15710a.m6454b(zzfifVar2, zzfidVar2, zzdchVar2);
                    zzfhlVar.f15714e = zzdchVar2;
                    return listenableFutureM6454b;
                }
            }, executor);
        }
    }

    /* JADX INFO: renamed from: b */
    public final ListenableFuture m6450b(zzfne zzfneVar, zzfif zzfifVar) {
        zzdch zzdchVar = zzfneVar.f16155a;
        this.f15714e = zzdchVar;
        if (zzfneVar.f16157c != null) {
            if (zzdchVar.zzc() != null) {
                zzfneVar.f16157c.f11763e.mo6438d(zzfneVar.f16155a.zzc());
            }
            return zzhcf.m7367a(zzfneVar.f16157c);
        }
        zzdchVar.zza().f11814g = zzfneVar.f16156b;
        return this.f15710a.m6454b(zzfifVar, null, zzfneVar.f16155a);
    }

    @Override // com.google.android.gms.internal.ads.zzfie
    /* JADX INFO: renamed from: d */
    public final Object mo6449d() {
        zzdch zzdchVar;
        synchronized (this) {
            zzdchVar = this.f15714e;
        }
        return zzdchVar;
    }
}
